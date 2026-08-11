// Copyright 2016-2026, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package cloudflare

import (
	"encoding/json"
	"os"
	"testing"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"

	"github.com/pulumi/pulumi-cloudflare/provider/v6/pkg/version"
)

func TestV619CompatibilityMappings(t *testing.T) {
	previousVersion := version.Version
	version.Version = "6.19.0"
	t.Cleanup(func() { version.Version = previousVersion })

	prov := Provider()
	manifest := loadV619Compatibility()
	resourceKeys := resourceKeysByToken(prov.Resources)
	dataSourceKeys := dataSourceKeysByToken(prov.DataSources)

	for terraformToken, entries := range manifest.Resources {
		_, exists := prov.P.ResourcesMap().GetOk(terraformToken)
		require.Truef(t, exists, "missing canonical Terraform resource %q", terraformToken)
		for _, entry := range entries {
			key, exists := resourceKeys[entry.Token]
			require.Truef(t, exists, "missing v6.19 resource token %q", entry.Token)
			_, exists = prov.P.ResourcesMap().GetOk(key)
			require.Truef(t, exists, "missing Terraform resource clone %q for %q", key, entry.Token)
		}
	}

	for terraformToken, entries := range manifest.Functions {
		_, exists := prov.P.DataSourcesMap().GetOk(terraformToken)
		require.Truef(t, exists, "missing canonical Terraform data source %q", terraformToken)
		for _, entry := range entries {
			key, exists := dataSourceKeys[entry.Token]
			require.Truef(t, exists, "missing v6.19 function token %q", entry.Token)
			_, exists = prov.P.DataSourcesMap().GetOk(key)
			require.Truef(t, exists, "missing Terraform data source clone %q for %q", key, entry.Token)
		}
	}

	for key, resource := range prov.Resources {
		for _, alias := range resource.Aliases {
			if alias.Type != nil {
				assert.NotEqualf(t, resource.Tok.String(), *alias.Type, "resource %q has a self-alias", key)
			}
		}
	}

	assert.Equal(t, "cloudflare:access/rule:Rule", prov.Resources["cloudflare_access_rule"].Tok.String())
	assert.Equal(t, "AccessRule", prov.Resources["cloudflare_access_rule"].CSharpName)
	assert.Equal(t, "Modules.Access", prov.CSharp.Namespaces["access"])
	assert.Equal(t, "cloudflare:access/rule:getRule", prov.DataSources["cloudflare_access_rule"].Tok.String())
}

func TestV619SchemaSurface(t *testing.T) {
	schemaBytes, err := os.ReadFile("cmd/pulumi-resource-cloudflare/schema.json")
	require.NoError(t, err)

	var current struct {
		Resources map[string]json.RawMessage `json:"resources"`
		Functions map[string]json.RawMessage `json:"functions"`
		Types     map[string]json.RawMessage `json:"types"`
	}
	require.NoError(t, json.Unmarshal(schemaBytes, &current))

	manifest := loadV619Compatibility()
	for _, entries := range manifest.Resources {
		for _, entry := range entries {
			assert.Contains(t, current.Resources, entry.Token)
		}
	}
	for _, entries := range manifest.Functions {
		for _, entry := range entries {
			assert.Contains(t, current.Functions, entry.Token)
		}
	}
	for _, token := range manifest.Types {
		assert.Contains(t, current.Types, token)
	}
}
