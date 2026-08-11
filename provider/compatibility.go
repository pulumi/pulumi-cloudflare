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
	"crypto/sha256"
	_ "embed"
	"encoding/json"
	"fmt"
	"strings"
	"sync"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/info"
	tfshim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
)

// v619CompatibilityJSON records the SDK surface that existed before resources
// and functions were moved from the index module.
//
//go:embed compatibility/v6.19.0.json
var v619CompatibilityJSON []byte

type compatibilityManifest struct {
	Version   string                          `json:"version"`
	Resources map[string][]compatibilityEntry `json:"resources"`
	Functions map[string][]compatibilityEntry `json:"functions"`
	Types     []string                        `json:"types"`
}

type compatibilityEntry struct {
	Token              string   `json:"token"`
	Aliases            []string `json:"aliases,omitempty"`
	DeprecationMessage string   `json:"deprecationMessage,omitempty"`
}

var (
	v619CompatibilityOnce sync.Once
	v619Compatibility     compatibilityManifest
	v619CompatibilityErr  error
)

func loadV619Compatibility() compatibilityManifest {
	v619CompatibilityOnce.Do(func() {
		v619CompatibilityErr = json.Unmarshal(v619CompatibilityJSON, &v619Compatibility)
	})
	contract.AssertNoErrorf(v619CompatibilityErr, "decoding the %s compatibility manifest", v619Compatibility.Version)
	return v619Compatibility
}

// applyV619Compatibility keeps the complete v6.19 SDK surface available after
// inferred modules become the canonical locations. It must run after automatic
// aliases so it can reuse the bridge's first legacy clone and add uniquely named
// clones for any additional old tokens.
func applyV619Compatibility(prov *info.Provider) {
	manifest := loadV619Compatibility()
	applyResourceCompatibility(prov, manifest.Resources)
	applyDataSourceCompatibility(prov, manifest.Functions)
}

// configureInferredCSharp prevents inferred module namespaces and short resource
// names from colliding with the retained root SDK classes.
func configureInferredCSharp(prov *info.Provider) {
	contract.Assertf(prov.CSharp != nil, "missing C# provider information")
	manifest := loadV619Compatibility()

	for terraformToken, resource := range prov.Resources {
		module := topLevelModule(resource.Tok.Module().Name().String())
		if module == "index" {
			continue
		}
		prov.CSharp.Namespaces[module] = "Modules." + upperFirst(module)

		entries := manifest.Resources[terraformToken]
		if len(entries) == 0 {
			resource.CSharpName = upperCamelTerraformName(terraformToken)
		}
		for _, entry := range entries {
			name := tokens.Type(entry.Token).Name().String()
			if len(name) > len(resource.CSharpName) {
				resource.CSharpName = name
			}
		}
	}

	for _, dataSource := range prov.DataSources {
		module := topLevelModule(dataSource.Tok.Module().Name().String())
		if module != "index" {
			prov.CSharp.Namespaces[module] = "Modules." + upperFirst(module)
		}
	}
}

func topLevelModule(module string) string {
	module, _, _ = strings.Cut(module, "/")
	return module
}

func upperFirst(value string) string {
	if value == "" {
		return value
	}
	return strings.ToUpper(value[:1]) + value[1:]
}

func upperCamelTerraformName(terraformToken string) string {
	parts := strings.Split(strings.TrimPrefix(terraformToken, "cloudflare_"), "_")
	for i, part := range parts {
		parts[i] = upperFirst(part)
	}
	return strings.Join(parts, "")
}

func applyResourceCompatibility(prov *info.Provider, resources map[string][]compatibilityEntry) {
	byToken := resourceKeysByToken(prov.Resources)

	for terraformToken, entries := range resources {
		current := prov.Resources[terraformToken]
		contract.Assertf(current != nil, "missing resource info for %q", terraformToken)

		for _, entry := range entries {
			appendResourceAlias(current, entry.Token)
		}

		for _, entry := range entries {
			if current.Tok.String() == entry.Token {
				continue
			}

			key, exists := byToken[entry.Token]
			if !exists {
				key = compatibilityCloneKey(terraformToken, entry.Token)
				_, collision := prov.P.ResourcesMap().GetOk(key)
				contract.Assertf(!collision, "resource compatibility clone key %q already exists", key)
				contract.AssertNoErrorf(tfshim.CloneResource(prov.P.ResourcesMap(), terraformToken, key),
					"cloning resource %q as %q", terraformToken, key)

				legacy := *current
				legacy.Tok = tokens.Type(entry.Token)
				prov.Resources[key] = &legacy
				byToken[entry.Token] = key
			}

			legacy := prov.Resources[key]
			contract.Assertf(legacy != nil, "missing resource info for compatibility clone %q", key)
			legacy.Aliases = compatibilityAliases(entry.Aliases, entry.Token)
			legacy.DeprecationMessage = compatibilityDeprecation(entry, current.Tok.String())
			legacy.Docs = compatibilityDocs(legacy.Docs, terraformToken)
			legacy.CSharpName = tokens.Type(entry.Token).Name().String()
		}
	}
}

func applyDataSourceCompatibility(prov *info.Provider, dataSources map[string][]compatibilityEntry) {
	byToken := dataSourceKeysByToken(prov.DataSources)

	for terraformToken, entries := range dataSources {
		current := prov.DataSources[terraformToken]
		contract.Assertf(current != nil, "missing data source info for %q", terraformToken)

		for _, entry := range entries {
			if current.Tok.String() == entry.Token {
				continue
			}

			key, exists := byToken[entry.Token]
			if !exists {
				key = compatibilityCloneKey(terraformToken, entry.Token)
				_, collision := prov.P.DataSourcesMap().GetOk(key)
				contract.Assertf(!collision, "data source compatibility clone key %q already exists", key)
				contract.AssertNoErrorf(tfshim.CloneResource(prov.P.DataSourcesMap(), terraformToken, key),
					"cloning data source %q as %q", terraformToken, key)

				legacy := *current
				legacy.Tok = tokens.ModuleMember(entry.Token)
				prov.DataSources[key] = &legacy
				byToken[entry.Token] = key
			}

			legacy := prov.DataSources[key]
			contract.Assertf(legacy != nil, "missing data source info for compatibility clone %q", key)
			legacy.DeprecationMessage = compatibilityDeprecation(entry, current.Tok.String())
			legacy.Docs = compatibilityDocs(legacy.Docs, terraformToken)
		}
	}
}

func compatibilityDocs(current *info.Doc, terraformToken string) *info.Doc {
	docs := info.Doc{}
	if current != nil {
		docs = *current
	}
	if docs.Source == "" {
		docs.Source = strings.TrimPrefix(terraformToken, "cloudflare_") + ".md"
	}
	return &docs
}

func compatibilityCloneKey(terraformToken, pulumiToken string) string {
	digest := sha256.Sum256([]byte(pulumiToken))
	return fmt.Sprintf("%s_compat_%x", terraformToken, digest[:6])
}

func compatibilityDeprecation(entry compatibilityEntry, replacement string) string {
	if entry.DeprecationMessage != "" {
		return entry.DeprecationMessage
	}
	return fmt.Sprintf("%s has been deprecated in favor of %s", entry.Token, replacement)
}

func compatibilityAliases(aliasTokens []string, self string) []info.Alias {
	aliases := make([]info.Alias, 0, len(aliasTokens))
	seen := map[string]bool{self: true}
	for _, aliasToken := range aliasTokens {
		if seen[aliasToken] {
			continue
		}
		seen[aliasToken] = true
		value := aliasToken
		aliases = append(aliases, info.Alias{Type: &value})
	}
	return aliases
}

func appendResourceAlias(resource *info.Resource, aliasToken string) {
	if resource.Tok.String() == aliasToken {
		return
	}
	for _, existing := range resource.Aliases {
		if existing.Type != nil && *existing.Type == aliasToken {
			return
		}
	}
	value := aliasToken
	resource.Aliases = append(resource.Aliases, info.Alias{Type: &value})
}

func resourceKeysByToken(resources map[string]*info.Resource) map[string]string {
	result := map[string]string{}
	for key, resource := range resources {
		if resource == nil || resource.Tok == "" {
			continue
		}
		token := resource.Tok.String()
		_, duplicate := result[token]
		contract.Assertf(!duplicate, "multiple resources use Pulumi token %q", token)
		result[token] = key
	}
	return result
}

func dataSourceKeysByToken(dataSources map[string]*info.DataSource) map[string]string {
	result := map[string]string{}
	for key, dataSource := range dataSources {
		if dataSource == nil || dataSource.Tok == "" {
			continue
		}
		token := dataSource.Tok.String()
		_, duplicate := result[token]
		contract.Assertf(!duplicate, "multiple data sources use Pulumi token %q", token)
		result[token] = key
	}
	return result
}
