package cloudflare

import (
	"context"
	"testing"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
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
	// Our PreStateUpgradeHook does Pulumi-specific state shape fixes (v5->v6 SDK changes),
	// orthogonal to upstream's Terraform migrations. If upstream bumps this version again,
	// re-check that our hook still composes with their new upgrader path.
	// See https://github.com/pulumi/pulumi-cloudflare/issues/1172
	assert.Equalf(t, 500, r.SchemaVersion(), "Reminder: cloudflare_ruleset advanced schema version from 500 and "+
		"custom Pulumi PreStateUpgradeHook needs to be revisited or possibly dropped")
}

func TestListVersionReminder(t *testing.T) {
	version.Version = "0.0.2"
	p := Provider()
	r := p.P.ResourcesMap().Get("cloudflare_list")
	// See https://github.com/pulumi/pulumi-cloudflare/issues/1549
	assert.Equalf(t, 500, r.SchemaVersion(), "Reminder: cloudflare_list advanced schema version from 500 and "+
		"custom Pulumi PreStateUpgradeHook needs to be revisited or possibly dropped")
}

func TestZeroTrustAccessApplicationVersionReminder(t *testing.T) {
	version.Version = "0.0.3"
	p := Provider()
	r := p.P.ResourcesMap().Get("cloudflare_zero_trust_access_application")
	// See https://github.com/pulumi/pulumi-cloudflare/issues/1165
	assert.Equalf(t, 500, r.SchemaVersion(),
		"Reminder: cloudflare_zero_trust_access_application advanced schema version from 500 and "+
			"custom Pulumi PreStateUpgradeHook needs to be revisited or possibly dropped")
}

func TestArgoTieredCachingVersionReminder(t *testing.T) {
	version.Version = "0.0.4"
	p := Provider()
	r := p.P.ResourcesMap().Get("cloudflare_argo_tiered_caching")
	// See https://github.com/pulumi/pulumi-cloudflare/issues/1575
	assert.Equalf(t, 500, r.SchemaVersion(),
		"Reminder: cloudflare_argo_tiered_caching advanced schema version from 500 and "+
			"custom Pulumi PreStateUpgradeHook needs to be revisited or possibly dropped")
}

func TestArgoTieredCachingPreStateUpgradeHook(t *testing.T) {
	pulumiState := resource.PropertyMap{
		"value":  resource.NewStringProperty("on"),
		"zoneId": resource.NewStringProperty("00000000000000000000000000000000"),
	}
	version, state, err := argoTieredCachingPreStateUpgradeHook(
		tfbridge.PreStateUpgradeHookArgs{
			PriorStateSchemaVersion: 0,
			PriorState:              pulumiState,
		})
	require.NoError(t, err)
	assert.Equal(t, int64(500), version)
	assert.Equal(t, pulumiState, state)

	legacyArgoState := resource.PropertyMap{
		"tiered_caching": resource.NewStringProperty("on"),
		"zone_id":        resource.NewStringProperty("00000000000000000000000000000000"),
	}
	version, state, err = argoTieredCachingPreStateUpgradeHook(
		tfbridge.PreStateUpgradeHookArgs{
			PriorStateSchemaVersion: 0,
			PriorState:              legacyArgoState,
		})
	require.NoError(t, err)
	assert.Equal(t, int64(0), version)
	assert.Equal(t, legacyArgoState, state)
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
