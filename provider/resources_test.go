package cloudflare

import (
	"context"
	"testing"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"

	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"

	"github.com/pulumi/pulumi-cloudflare/provider/v6/pkg/version"
)

// TestSchemaVersionsForResetResources tests that the schema version of resources that were migrated
// from the legacy provider is reset to 0.
//
// This test ensures that we don't break any newly added upstream schema migrations.
//
// Once we have Pulumi state migrations, we should fix this properly with a state migration.
func TestSchemaVersionsForResetResources(t *testing.T) {
	t.Parallel()
	version.Version = "6.0.0"
	prov := Provider()

	foundMap := make(map[string]bool, len(resourcesWhichNeedSchemaVersionReset))
	for _, resName := range resourcesWhichNeedSchemaVersionReset {
		foundMap[resName] = false
	}

	prov.P.ResourcesMap().Range(func(key string, value shim.Resource) bool {
		if _, ok := foundMap[key]; !ok {
			return true
		}
		contract.Assertf(value.SchemaVersion() == 0, "schema version is not 0 for %s. "+
			"This resource might need an explicit migration since we are resetting its"+
			" schema version. "+
			"See https://github.com/pulumi/pulumi-cloudflare/issues/1156 for more details.", key)
		foundMap[key] = true
		return true
	})

	for resName, found := range foundMap {
		contract.Assertf(found, "Did not find resource %s in the provider for schema version resetting."+
			" If the resource was renamed with an alias, then the reset"+
			" needs to be applied to the new resource.", resName)
	}
}

func TestRuleSetVersionReminder(t *testing.T) {
	version.Version = "0.0.1"
	p := Provider()
	r := p.P.ResourcesMap().Get("cloudflare_ruleset")
	assert.Equalf(t, 0, r.SchemaVersion(), "Reminder: cloudflare_ruleset advanced schema version from 0 and "+
		"custom Pulumi PreStateUpgradeHook that massaged provider=v5 resource=v1 version data needs to be "+
		"revisited or possibly dropped")
}

func Test_delegateID(t *testing.T) {

	type testCase struct {
		name     string
		idField  resource.PropertyKey
		state    resource.PropertyMap
		expectID resource.ID
	}

	testCases := []testCase{
		{
			name:    "simple-id",
			idField: "id",
			state: resource.PropertyMap{
				"id": resource.NewStringProperty("my-resource"),
			},
			expectID: "my-resource",
		},
		{
			name:    "numeric-id",
			idField: "id",
			state: resource.PropertyMap{
				"id": resource.NewNumberProperty(42),
			},
			expectID: "42",
		},
	}

	for _, tc := range testCases {
		t.Run(tc.name, func(t *testing.T) {
			ctx := context.Background()
			d := delegateID(tc.idField)
			result, err := d(ctx, tc.state)
			require.NoError(t, err)
			require.Equal(t, tc.expectID, result)
		})
	}
}
