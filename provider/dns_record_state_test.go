package cloudflare

import (
	"context"
	"testing"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
)

func TestDNSRecordPreStateUpgradeHook(t *testing.T) {
	version, state, err := dnsRecordPreStateUpgradeHook(tfbridge.PreStateUpgradeHookArgs{
		PriorStateSchemaVersion: 3,
		PriorState: resource.PropertyMap{
			"__defaults":     resource.NewArrayProperty([]resource.PropertyValue{resource.NewStringProperty("allowOverwrite")}),
			"allowOverwrite": resource.NewBoolProperty(true),
			"comment":        resource.NewStringProperty(""),
			"content":        resource.NewStringProperty("192.0.2.1"),
			"hostname":       resource.NewStringProperty("www.example.com"),
			"metadata":       resource.NewObjectProperty(resource.PropertyMap{}),
			"name":           resource.NewStringProperty("www"),
			"ttl":            resource.NewNumberProperty(60),
			"type":           resource.NewStringProperty("A"),
			"value":          resource.NewStringProperty("192.0.2.1"),
			"zoneId":         resource.NewStringProperty("zone"),
		},
	})
	require.NoError(t, err)
	assert.Equal(t, dnsRecordCurrentSchemaVersion, version)
	assert.Equal(t, "192.0.2.1", state["content"].StringValue())
	assert.NotContains(t, state, resource.PropertyKey("__defaults"))
	assert.NotContains(t, state, resource.PropertyKey("allowOverwrite"))
	assert.NotContains(t, state, resource.PropertyKey("comment"))
	assert.NotContains(t, state, resource.PropertyKey("hostname"))
	assert.NotContains(t, state, resource.PropertyKey("metadata"))
	assert.NotContains(t, state, resource.PropertyKey("value"))
}

func TestDNSRecordTransformFromStateMigratesStoredInputs(t *testing.T) {
	state, err := dnsRecordTransformFromState(context.Background(), resource.PropertyMap{
		"allowOverwrite": resource.NewBoolProperty(true),
		"content":        resource.NewStringProperty("target.example.com"),
		"name":           resource.NewStringProperty("www"),
		"type":           resource.NewStringProperty("CNAME"),
		"zoneId":         resource.NewStringProperty("zone"),
	})
	require.NoError(t, err)
	assert.Equal(t, "target.example.com", state["content"].StringValue())
	assert.Equal(t, float64(1), state["ttl"].NumberValue())
	assert.NotContains(t, state, resource.PropertyKey("allowOverwrite"))
}

func TestDNSRecordPreStateUpgradeHookMigratesData(t *testing.T) {
	_, state, err := dnsRecordPreStateUpgradeHook(tfbridge.PreStateUpgradeHookArgs{
		PriorStateSchemaVersion: 3,
		PriorState: resource.PropertyMap{
			"allowOverwrite": resource.NewBoolProperty(true),
			"data": resource.NewArrayProperty([]resource.PropertyValue{
				resource.NewObjectProperty(resource.PropertyMap{
					"content":  resource.NewStringProperty("letsencrypt.org"),
					"flags":    resource.NewStringProperty("0"),
					"name":     resource.NewStringProperty("@"),
					"priority": resource.NewNumberProperty(0),
					"proto":    resource.NewStringProperty("tcp"),
					"tag":      resource.NewStringProperty("issue"),
				}),
			}),
			"name":   resource.NewStringProperty("@"),
			"type":   resource.NewStringProperty("CAA"),
			"value":  resource.NewStringProperty(""),
			"zoneId": resource.NewStringProperty("zone"),
		},
	})
	require.NoError(t, err)
	data := state["data"].ObjectValue()
	assert.Equal(t, "letsencrypt.org", data["value"].StringValue())
	assert.Equal(t, "0", data["flags"].StringValue())
	assert.Equal(t, "issue", data["tag"].StringValue())
	assert.NotContains(t, data, resource.PropertyKey("content"))
	assert.NotContains(t, data, resource.PropertyKey("name"))
	assert.NotContains(t, data, resource.PropertyKey("priority"))
	assert.NotContains(t, data, resource.PropertyKey("proto"))
}

func TestDNSRecordPreStateUpgradeHookLeavesCurrentStateAlone(t *testing.T) {
	current := resource.PropertyMap{
		"content": resource.NewStringProperty("192.0.2.1"),
		"name":    resource.NewStringProperty("www"),
		"type":    resource.NewStringProperty("A"),
		"zoneId":  resource.NewStringProperty("zone"),
	}
	version, state, err := dnsRecordPreStateUpgradeHook(tfbridge.PreStateUpgradeHookArgs{
		PriorStateSchemaVersion: dnsRecordCurrentSchemaVersion,
		PriorState:              current,
	})
	require.NoError(t, err)
	assert.Equal(t, dnsRecordCurrentSchemaVersion, version)
	assert.Equal(t, current, state)
}

func TestDNSRecordPreStateUpgradeHookRejectsMalformedState(t *testing.T) {
	_, _, err := dnsRecordPreStateUpgradeHook(tfbridge.PreStateUpgradeHookArgs{
		PriorStateSchemaVersion: 3,
		PriorState: resource.PropertyMap{
			"allowOverwrite": resource.NewBoolProperty(true),
			"name":           resource.NewStringProperty("www"),
			"type":           resource.NewStringProperty("A"),
		},
	})
	require.ErrorContains(t, err, "zoneId is not a string")
}
