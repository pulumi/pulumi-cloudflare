package cloudflare

import (
	"context"
	"testing"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
)

func TestWorkersScriptPreStateUpgradeHook(t *testing.T) {
	oldState := resource.PropertyMap{
		"accountId":         resource.NewStringProperty("account-id"),
		"compatibilityDate": resource.NewStringProperty("2025-01-01"),
		"content":           resource.NewStringProperty("export default {}"),
		"module":            resource.NewBoolProperty(true),
		"name":              resource.NewStringProperty("apt-repository"),
		"plainTextBindings": resource.NewArrayProperty([]resource.PropertyValue{
			binding("Z_PLAIN", "text", "last"),
			binding("PLAIN", "text", "value"),
		}),
		"secretTextBindings": resource.MakeSecret(resource.NewArrayProperty([]resource.PropertyValue{
			binding("Z_SECRET", "text", "last-secret"),
			binding("A_SECRET", "text", "first-secret"),
			binding("SECRET", "text", "secret-value"),
		})),
		"r2BucketBindings": resource.NewArrayProperty([]resource.PropertyValue{
			binding("BUCKET", "bucketName", "apt-bucket"),
		}),
		"d1DatabaseBindings": resource.NewArrayProperty([]resource.PropertyValue{
			binding("DATABASE", "databaseId", "database-id"),
		}),
		"dispatchNamespace": resource.NewStringProperty("legacy"),
		"tags":              resource.NewArrayProperty(nil),
	}

	version, state, err := workersScriptPreStateUpgradeHook(tfbridge.PreStateUpgradeHookArgs{
		PriorStateSchemaVersion: 0,
		PriorState:              oldState,
	})
	require.NoError(t, err)
	assert.Equal(t, workersScriptCurrentSchemaVersion, version)
	assert.Equal(t, "apt-repository", state["scriptName"].StringValue())
	assert.Equal(t, "worker.js", state["mainModule"].StringValue())
	assert.Equal(t, "account-id", state["accountId"].StringValue())
	assert.NotContains(t, state, resource.PropertyKey("name"))
	assert.NotContains(t, state, resource.PropertyKey("module"))
	assert.NotContains(t, state, resource.PropertyKey("secretTextBindings"))
	assert.NotContains(t, state, resource.PropertyKey("dispatchNamespace"))
	assert.NotContains(t, state, resource.PropertyKey("tags"))

	bindings := state["bindings"]
	require.True(t, bindings.IsSecret())
	values := bindings.SecretValue().Element.ArrayValue()
	require.Len(t, values, 7)
	assertBinding(t, values[0], "plain_text", "PLAIN", "text", "value")
	assertBinding(t, values[1], "plain_text", "Z_PLAIN", "text", "last")
	assertBinding(t, values[2], "secret_text", "A_SECRET", "text", "first-secret")
	assertBinding(t, values[3], "secret_text", "SECRET", "text", "secret-value")
	assertBinding(t, values[4], "secret_text", "Z_SECRET", "text", "last-secret")
	assertBinding(t, values[5], "r2_bucket", "BUCKET", "bucketName", "apt-bucket")
	assertBinding(t, values[6], "d1", "DATABASE", "id", "database-id")
}

func TestWorkersScriptPreStateUpgradeHookLeavesCurrentStateAlone(t *testing.T) {
	current := resource.PropertyMap{
		"scriptName": resource.NewStringProperty("apt-repository"),
	}
	version, state, err := workersScriptPreStateUpgradeHook(tfbridge.PreStateUpgradeHookArgs{
		PriorStateSchemaVersion: workersScriptCurrentSchemaVersion,
		PriorState:              current,
	})
	require.NoError(t, err)
	assert.Equal(t, workersScriptCurrentSchemaVersion, version)
	assert.Equal(t, current, state)
}

func TestWorkersScriptTransformFromStateMigratesStoredInputs(t *testing.T) {
	oldInputs := resource.PropertyMap{
		"module": resource.NewBoolProperty(true),
		"name":   resource.NewStringProperty("apt-repository"),
		"secretTextBindings": resource.MakeSecret(resource.NewArrayProperty([]resource.PropertyValue{
			binding("SECRET", "text", "secret-value"),
		})),
	}

	inputs, err := workersScriptTransformFromState(context.Background(), oldInputs)
	require.NoError(t, err)
	assert.Equal(t, "apt-repository", inputs["scriptName"].StringValue())
	assert.Equal(t, "worker.js", inputs["mainModule"].StringValue())
	assert.NotContains(t, inputs, resource.PropertyKey("secretTextBindings"))
	require.True(t, inputs["bindings"].IsSecret())
	bindings := inputs["bindings"].SecretValue().Element.ArrayValue()
	require.Len(t, bindings, 1)
	assertBinding(t, bindings[0], "secret_text", "SECRET", "text", "secret-value")
}

func TestWorkersScriptPreStateUpgradeHookMigratesEveryBindingKind(t *testing.T) {
	oldState := resource.PropertyMap{
		"name": resource.NewStringProperty("worker"),
		"plainTextBindings": resource.NewArrayProperty([]resource.PropertyValue{
			binding("PLAIN", "text", "text"),
		}),
		"secretTextBindings": resource.NewArrayProperty([]resource.PropertyValue{
			binding("SECRET", "text", "secret"),
		}),
		"kvNamespaceBindings": resource.NewArrayProperty([]resource.PropertyValue{
			binding("KV", "namespaceId", "namespace"),
		}),
		"webassemblyBindings": resource.NewArrayProperty([]resource.PropertyValue{
			binding("WASM", "module", "part"),
		}),
		"serviceBindings": resource.NewArrayProperty([]resource.PropertyValue{
			resource.NewObjectProperty(resource.PropertyMap{
				"name":        resource.NewStringProperty("SERVICE"),
				"service":     resource.NewStringProperty("upstream"),
				"environment": resource.NewStringProperty("production"),
			}),
		}),
		"r2BucketBindings": resource.NewArrayProperty([]resource.PropertyValue{
			binding("R2", "bucketName", "bucket"),
		}),
		"analyticsEngineBindings": resource.NewArrayProperty([]resource.PropertyValue{
			binding("ANALYTICS", "dataset", "dataset"),
		}),
		"queueBindings": resource.NewArrayProperty([]resource.PropertyValue{
			resource.NewObjectProperty(resource.PropertyMap{
				"binding": resource.NewStringProperty("QUEUE"),
				"queue":   resource.NewStringProperty("queue"),
			}),
		}),
		"d1DatabaseBindings": resource.NewArrayProperty([]resource.PropertyValue{
			binding("D1", "databaseId", "database"),
		}),
		"hyperdriveConfigBindings": resource.NewArrayProperty([]resource.PropertyValue{
			resource.NewObjectProperty(resource.PropertyMap{
				"binding": resource.NewStringProperty("HYPERDRIVE"),
				"id":      resource.NewStringProperty("hyperdrive"),
			}),
		}),
	}

	_, state, err := workersScriptPreStateUpgradeHook(tfbridge.PreStateUpgradeHookArgs{
		PriorStateSchemaVersion: 0,
		PriorState:              oldState,
	})
	require.NoError(t, err)
	values := state["bindings"].ArrayValue()
	require.Len(t, values, 10)
	assertBinding(t, values[0], "plain_text", "PLAIN", "text", "text")
	assertBinding(t, values[1], "secret_text", "SECRET", "text", "secret")
	assertBinding(t, values[2], "kv_namespace", "KV", "namespaceId", "namespace")
	assertBinding(t, values[3], "wasm_module", "WASM", "part", "part")
	assertBinding(t, values[4], "service", "SERVICE", "service", "upstream")
	assert.Equal(t, "production", values[4].ObjectValue()["environment"].StringValue())
	assertBinding(t, values[5], "r2_bucket", "R2", "bucketName", "bucket")
	assertBinding(t, values[6], "analytics_engine", "ANALYTICS", "dataset", "dataset")
	assertBinding(t, values[7], "queue", "QUEUE", "queueName", "queue")
	assertBinding(t, values[8], "d1", "D1", "id", "database")
	assertBinding(t, values[9], "hyperdrive", "HYPERDRIVE", "id", "hyperdrive")
}

func TestWorkersScriptPreStateUpgradeHookMigratesServiceWorkerAndPlacement(t *testing.T) {
	_, state, err := workersScriptPreStateUpgradeHook(tfbridge.PreStateUpgradeHookArgs{
		PriorStateSchemaVersion: 0,
		PriorState: resource.PropertyMap{
			"name":   resource.NewStringProperty("worker"),
			"module": resource.NewBoolProperty(false),
			"placements": resource.NewArrayProperty([]resource.PropertyValue{
				resource.NewObjectProperty(resource.PropertyMap{
					"mode": resource.NewStringProperty("smart"),
				}),
			}),
		},
	})
	require.NoError(t, err)
	assert.Equal(t, "worker.js", state["bodyPart"].StringValue())
	assert.NotContains(t, state, resource.PropertyKey("mainModule"))
	assert.Equal(t, "smart", state["placement"].ObjectValue()["mode"].StringValue())
	assert.NotContains(t, state, resource.PropertyKey("placements"))
}

func TestWorkersScriptPreStateUpgradeHookRejectsMalformedBindings(t *testing.T) {
	_, _, err := workersScriptPreStateUpgradeHook(tfbridge.PreStateUpgradeHookArgs{
		PriorStateSchemaVersion: 0,
		PriorState: resource.PropertyMap{
			"name":              resource.NewStringProperty("apt-repository"),
			"plainTextBindings": resource.NewStringProperty("not-an-array"),
		},
	})
	require.ErrorContains(t, err, "plainTextBindings is not an array")
}

func binding(name, field, value string) resource.PropertyValue {
	return resource.NewObjectProperty(resource.PropertyMap{
		"name":                      resource.NewStringProperty(name),
		resource.PropertyKey(field): resource.NewStringProperty(value),
	})
}

func assertBinding(
	t *testing.T,
	value resource.PropertyValue,
	kind string,
	name string,
	field resource.PropertyKey,
	expected string,
) {
	t.Helper()
	object := value.ObjectValue()
	assert.Equal(t, kind, object["type"].StringValue())
	assert.Equal(t, name, object["name"].StringValue())
	assert.Equal(t, expected, object[field].StringValue())
}
