package cloudflare

import (
	"context"
	"fmt"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
)

const dnsRecordCurrentSchemaVersion int64 = 500

// dnsRecordTransformFromState migrates the legacy inputs stored separately by
// Pulumi. These inputs do not carry the Terraform schema marker found in
// provider outputs.
func dnsRecordTransformFromState(
	_ context.Context,
	state resource.PropertyMap,
) (resource.PropertyMap, error) {
	if !isPulumiV4DNSRecordState(state) {
		return state, nil
	}
	return migrateDNSRecordState(state)
}

// dnsRecordPreStateUpgradeHook translates Pulumi state written by the v4
// Terraform-based Record resource into the v5 DnsRecord shape. Cloudflare's
// cross-resource MoveState hook receives Terraform state and is not invoked by
// a Pulumi type alias, whose checkpoint is already Pulumi-shaped.
func dnsRecordPreStateUpgradeHook(
	args tfbridge.PreStateUpgradeHookArgs,
) (int64, resource.PropertyMap, error) {
	if !isPulumiV4DNSRecordState(args.PriorState) {
		return args.PriorStateSchemaVersion, args.PriorState, nil
	}
	if args.PriorStateSchemaVersion != 0 && args.PriorStateSchemaVersion != 3 {
		return 0, nil, fmt.Errorf(
			"cannot migrate DNS Record state at unexpected schema version %d",
			args.PriorStateSchemaVersion,
		)
	}

	migrated, err := migrateDNSRecordState(args.PriorState)
	if err != nil {
		return 0, nil, err
	}
	return dnsRecordCurrentSchemaVersion, migrated, nil
}

func isPulumiV4DNSRecordState(state resource.PropertyMap) bool {
	for _, key := range []resource.PropertyKey{
		"allowOverwrite",
		"hostname",
		"metadata",
		"value",
	} {
		if _, ok := state[key]; ok {
			return true
		}
	}
	return false
}

func migrateDNSRecordState(state resource.PropertyMap) (resource.PropertyMap, error) {
	for _, key := range []resource.PropertyKey{"zoneId", "name", "type"} {
		value, ok := state[key]
		if !ok || !value.IsString() {
			return nil, fmt.Errorf("cannot migrate DNS Record state: %s is not a string", key)
		}
	}

	migrated := state.Copy()
	content, hasContent := migrated["content"]
	legacyValue, hasLegacyValue := migrated["value"]
	if (!hasContent || content.IsNull() || (content.IsString() && content.StringValue() == "")) &&
		hasLegacyValue && !legacyValue.IsNull() {
		migrated["content"] = legacyValue
	}

	if ttl, ok := migrated["ttl"]; !ok || ttl.IsNull() {
		migrated["ttl"] = resource.NewNumberProperty(1)
	}

	if comment, ok := migrated["comment"]; ok && !comment.IsNull() {
		if !comment.IsString() {
			return nil, fmt.Errorf("cannot migrate DNS Record state: comment is not a string")
		}
		if comment.StringValue() == "" {
			delete(migrated, "comment")
		}
	}

	if data, ok := migrated["data"]; ok && !data.IsNull() {
		var secret bool
		data, secret = unwrapSecret(data)
		if !data.IsArray() {
			return nil, fmt.Errorf("cannot migrate DNS Record state: data is not an array")
		}
		items := data.ArrayValue()
		if len(items) > 1 {
			return nil, fmt.Errorf("cannot migrate DNS Record state: data contains more than one item")
		}
		if len(items) == 0 {
			delete(migrated, "data")
		} else {
			item, itemSecret := unwrapSecret(items[0])
			secret = secret || itemSecret || item.ContainsSecrets()
			if !item.IsObject() {
				return nil, fmt.Errorf("cannot migrate DNS Record state: data item is not an object")
			}
			object := item.ObjectValue().Copy()
			if migrated["type"].StringValue() == "CAA" {
				if value, ok := object["content"]; ok && !value.IsNull() {
					object["value"] = value
				}
			}
			delete(object, "content")
			delete(object, "name")
			delete(object, "proto")
			for _, key := range []resource.PropertyKey{
				"algorithm", "digestType", "keyTag", "latDegrees", "latMinutes",
				"longDegrees", "longMinutes", "matchingType", "order", "port",
				"preference", "priority", "protocol", "selector", "type", "usage", "weight",
			} {
				if value, ok := object[key]; ok && value.IsNumber() && value.NumberValue() == 0 {
					delete(object, key)
				}
			}
			if flags, ok := object["flags"]; ok && !flags.IsNull() {
				if !flags.IsString() {
					return nil, fmt.Errorf("cannot migrate DNS Record state: data flags is not a string")
				}
				if flags.StringValue() == "" {
					delete(object, "flags")
				}
			}
			value := resource.NewObjectProperty(object)
			if secret {
				value = resource.MakeSecret(value)
			}
			migrated["data"] = value
		}
	} else {
		delete(migrated, "data")
	}

	for _, key := range []resource.PropertyKey{
		"allowOverwrite",
		"hostname",
		"metadata",
		"value",
	} {
		delete(migrated, key)
	}
	removePulumiDefault(migrated, "allowOverwrite")
	return migrated, nil
}

func removePulumiDefault(state resource.PropertyMap, removed resource.PropertyKey) {
	defaults, ok := state["__defaults"]
	if !ok || !defaults.IsArray() {
		return
	}
	filtered := make([]resource.PropertyValue, 0, len(defaults.ArrayValue()))
	for _, value := range defaults.ArrayValue() {
		if value.IsString() && value.StringValue() == string(removed) {
			continue
		}
		filtered = append(filtered, value)
	}
	if len(filtered) == 0 {
		delete(state, "__defaults")
		return
	}
	state["__defaults"] = resource.NewArrayProperty(filtered)
}
