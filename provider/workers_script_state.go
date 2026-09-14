package cloudflare

import (
	"context"
	"fmt"
	"sort"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
)

const workersScriptCurrentSchemaVersion int64 = 500

// workersScriptTransformFromState applies the same migration to the old inputs
// stored by Pulumi. PreStateUpgradeHook migrates provider state outputs, while
// Check and Diff receive these separately persisted inputs.
func workersScriptTransformFromState(
	_ context.Context,
	state resource.PropertyMap,
) (resource.PropertyMap, error) {
	_, migrated, err := workersScriptPreStateUpgradeHook(tfbridge.PreStateUpgradeHookArgs{
		PriorStateSchemaVersion: 0,
		PriorState:              state,
	})
	return migrated, err
}

// workersScriptPreStateUpgradeHook migrates Pulumi state written for the v5
// WorkerScript resource into the v6 WorkersScript shape. The upstream
// Terraform provider performs this conversion through a cross-resource
// MoveState hook, which the Pulumi alias does not invoke.
func workersScriptPreStateUpgradeHook(
	args tfbridge.PreStateUpgradeHookArgs,
) (int64, resource.PropertyMap, error) {
	state := args.PriorState
	if args.PriorStateSchemaVersion != 0 || !isPulumiV5WorkerScriptState(state) {
		return args.PriorStateSchemaVersion, state, nil
	}

	migrated := state.Copy()
	name := migrated["name"]
	if !name.IsString() {
		return 0, nil, fmt.Errorf("cannot migrate WorkerScript state: name is not a string")
	}
	migrated["scriptName"] = name
	delete(migrated, "name")

	if module, ok := migrated["module"]; ok && !module.IsNull() {
		if !module.IsBool() {
			return 0, nil, fmt.Errorf("cannot migrate WorkerScript state: module is not a boolean")
		}
		if module.BoolValue() {
			migrated["mainModule"] = resource.NewStringProperty("worker.js")
		} else {
			migrated["bodyPart"] = resource.NewStringProperty("worker.js")
		}
	}
	delete(migrated, "module")

	bindings, secret, err := migrateWorkerScriptBindings(state)
	if err != nil {
		return 0, nil, err
	}
	if len(bindings) > 0 {
		value := resource.NewArrayProperty(bindings)
		if secret {
			value = resource.MakeSecret(value)
		}
		migrated["bindings"] = value
	}

	if placements, ok := migrated["placements"]; ok && !placements.IsNull() {
		placements, _ = unwrapSecret(placements)
		if !placements.IsArray() {
			return 0, nil, fmt.Errorf("cannot migrate WorkerScript state: placements is not an array")
		}
		if values := placements.ArrayValue(); len(values) > 0 {
			migrated["placement"] = values[0]
		}
	}

	for _, key := range []resource.PropertyKey{
		"analyticsEngineBindings",
		"d1DatabaseBindings",
		"dispatchNamespace",
		"hyperdriveConfigBindings",
		"kvNamespaceBindings",
		"plainTextBindings",
		"placements",
		"queueBindings",
		"r2BucketBindings",
		"secretTextBindings",
		"serviceBindings",
		"tags",
		"webassemblyBindings",
	} {
		delete(migrated, key)
	}

	return workersScriptCurrentSchemaVersion, migrated, nil
}

func isPulumiV5WorkerScriptState(state resource.PropertyMap) bool {
	_, hasName := state["name"]
	_, hasScriptName := state["scriptName"]
	return hasName && !hasScriptName
}

type workerBindingMigration struct {
	source resource.PropertyKey
	target map[resource.PropertyKey]resource.PropertyKey
	kind   string
}

var workerBindingMigrations = []workerBindingMigration{
	{source: "plainTextBindings", kind: "plain_text", target: map[resource.PropertyKey]resource.PropertyKey{
		"name": "name", "text": "text",
	}},
	{source: "secretTextBindings", kind: "secret_text", target: map[resource.PropertyKey]resource.PropertyKey{
		"name": "name", "text": "text",
	}},
	{source: "kvNamespaceBindings", kind: "kv_namespace", target: map[resource.PropertyKey]resource.PropertyKey{
		"name": "name", "namespaceId": "namespaceId",
	}},
	{source: "webassemblyBindings", kind: "wasm_module", target: map[resource.PropertyKey]resource.PropertyKey{
		"name": "name", "module": "part",
	}},
	{source: "serviceBindings", kind: "service", target: map[resource.PropertyKey]resource.PropertyKey{
		"name": "name", "service": "service", "environment": "environment",
	}},
	{source: "r2BucketBindings", kind: "r2_bucket", target: map[resource.PropertyKey]resource.PropertyKey{
		"name": "name", "bucketName": "bucketName",
	}},
	{source: "analyticsEngineBindings", kind: "analytics_engine", target: map[resource.PropertyKey]resource.PropertyKey{
		"name": "name", "dataset": "dataset",
	}},
	{source: "queueBindings", kind: "queue", target: map[resource.PropertyKey]resource.PropertyKey{
		"binding": "name", "queue": "queueName",
	}},
	{source: "d1DatabaseBindings", kind: "d1", target: map[resource.PropertyKey]resource.PropertyKey{
		"name": "name", "databaseId": "id",
	}},
	{source: "hyperdriveConfigBindings", kind: "hyperdrive", target: map[resource.PropertyKey]resource.PropertyKey{
		"binding": "name", "id": "id",
	}},
}

func migrateWorkerScriptBindings(state resource.PropertyMap) ([]resource.PropertyValue, bool, error) {
	var bindings []resource.PropertyValue
	secret := false
	for _, migration := range workerBindingMigrations {
		value, ok := state[migration.source]
		if !ok || value.IsNull() {
			continue
		}

		var collectionSecret bool
		value, collectionSecret = unwrapSecret(value)
		secret = secret || collectionSecret || value.ContainsSecrets()
		if !value.IsArray() {
			return nil, false, fmt.Errorf(
				"cannot migrate WorkerScript state: %s is not an array",
				migration.source,
			)
		}

		for _, item := range value.ArrayValue() {
			item, itemSecret := unwrapSecret(item)
			secret = secret || itemSecret || item.ContainsSecrets()
			if !item.IsObject() {
				return nil, false, fmt.Errorf(
					"cannot migrate WorkerScript state: %s contains a non-object binding",
					migration.source,
				)
			}

			old := item.ObjectValue()
			binding := resource.PropertyMap{
				"type": resource.NewStringProperty(migration.kind),
			}
			for source, target := range migration.target {
				if property, exists := old[source]; exists && !property.IsNull() {
					binding[target] = property
				}
			}
			if name, ok := binding["name"]; !ok || !name.IsString() {
				return nil, false, fmt.Errorf(
					"cannot migrate WorkerScript state: %s binding has no string name",
					migration.source,
				)
			}
			bindings = append(bindings, resource.NewObjectProperty(binding))
		}
	}
	kindOrder := make(map[string]int, len(workerBindingMigrations))
	for index, migration := range workerBindingMigrations {
		kindOrder[migration.kind] = index
	}
	sort.SliceStable(bindings, func(i, j int) bool {
		left := bindings[i].ObjectValue()
		right := bindings[j].ObjectValue()
		leftKind := left["type"].StringValue()
		rightKind := right["type"].StringValue()
		if kindOrder[leftKind] != kindOrder[rightKind] {
			return kindOrder[leftKind] < kindOrder[rightKind]
		}
		return left["name"].StringValue() < right["name"].StringValue()
	})
	return bindings, secret, nil
}

func unwrapSecret(value resource.PropertyValue) (resource.PropertyValue, bool) {
	if !value.IsSecret() {
		return value, false
	}
	return value.SecretValue().Element, true
}
