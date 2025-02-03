// Copyright 2016-2018, Pulumi Corporation.
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
	"context"
	"fmt"
	"path/filepath"

	// embed allows embedding files
	_ "embed"

	provShim "github.com/cloudflare/terraform-provider-cloudflare/shim"

	pfbridge "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/info"
	tfbridgetokens "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfgen"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"

	"github.com/pulumi/pulumi-cloudflare/provider/v6/pkg/version"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "cloudflare"
	// modules:
	mainMod = "index" // the y module
)

//go:embed cmd/pulumi-resource-cloudflare/bridge-metadata.json
var metadata []byte

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() info.Provider {
	// Instantiate the Terraform provider
	p := pfbridge.MuxShimWithPF(context.Background(),
		shimv2.NewProvider(
			provShim.SDKProvider(),
		),
		provShim.PFProvider(),
	)

	delegateID := func(pulumiField string) tfbridge.ComputeID {
		return tfbridge.DelegateIDField(resource.PropertyKey(pulumiField),
			"cloudflare", "https://github.com/pulumi/pulumi-cloudflare")
	}

	// Create a Pulumi provider mapping
	prov := info.Provider{
		P:                p,
		Name:             "cloudflare",
		DisplayName:      "Cloudflare",
		Description:      "A Pulumi package for creating and managing Cloudflare cloud resources.",
		Keywords:         []string{"pulumi", "cloudflare"},
		License:          "Apache-2.0",
		Homepage:         "https://pulumi.io",
		GitHubOrg:        "cloudflare",
		Repository:       "https://github.com/pulumi/pulumi-cloudflare",
		UpstreamRepoPath: "./upstream",
		Version:          version.Version,
		TFProviderModuleVersion: "v5",
		MetadataInfo:     tfbridge.NewProviderMetadata(metadata),
		DocRules:         &info.DocRule{EditRules: docEditRules},
		Config: map[string]*info.Schema{
			"rps": {
				Default: &info.Default{
					Value:   4,
					EnvVars: []string{"CLOUDFLARE_RPS"},
				},
			},
			"retries": {
				Default: &info.Default{
					Value:   3,
					EnvVars: []string{"CLOUDFLARE_RETRIES"},
				},
			},
			"min_backoff": {
				Default: &info.Default{
					Value:   1,
					EnvVars: []string{"CLOUDFLARE_MIN_BACKOFF"},
				},
			},
			"max_backoff": {
				Default: &info.Default{
					Value:   30,
					EnvVars: []string{"CLOUDFLARE_MAX_BACKOFF"},
				},
			},
			"api_client_logging": {
				Default: &info.Default{
					Value:   false,
					EnvVars: []string{"CLOUDFLARE_API_CLIENT_LOGGING"},
				},
			},
			"api_token": {
				Secret: tfbridge.True(),
			},
			"api_key": {
				Secret: tfbridge.True(),
			},
			"api_user_service_key": {
				Secret: tfbridge.True(),
			},
		},

		Resources: map[string]*info.Resource{
			"cloudflare_access_keys_configuration": {
				// This resource has no upstream docs:
				Docs: &info.Doc{AllowMissing: true},
			},
			"cloudflare_content_scanning": {ComputeID: delegateID("zoneId")},
			"cloudflare_zone": {
				Fields: map[string]*info.Schema{
					"zone": {CSharpName: "ZoneName"},
				},
			},

			// Cloudflare's DNS records are all structural, where `name` field uniquely identifies
			// the resource.
			//
			// If `type` or `zoneId` is changed, then the resource will replace but the new
			// resource will conflict with the old one. To avoid this, we set
			// `DeleteBeforeReplace: true`.
			"cloudflare_record": {
				DeleteBeforeReplace: true,
				Fields: map[string]*info.Schema{
					"value": {
						DeprecationMessage: "`value` is deprecated in favour of `content` " +
							"and will be removed in the next major release. " +
							"Due to reports of inconsistent behavior on the `value` field, " +
							"we strongly recommend migrating to `content`.",
					},
				},
			},

			"cloudflare_risk_behavior":                            {ComputeID: delegateID("accountId")},
			"cloudflare_zero_trust_access_mtls_hostname_settings": {ComputeID: delegateID("accountId")},
			"cloudflare_zero_trust_risk_behavior":                 {ComputeID: delegateID("accountId")},
			// We cannot use TF's ID field as Pulumi's ID field automatically,
			// since it can (theoretically) be set by the user.
			//
			// In practice, it shouldn't be set by the user, and we should mirror TF here:
			//
			// Set our ID as site Key, which is what it represents upstream:
			// <https://developers.cloudflare.com/turnstile/get-started/terraform/#create-a-turnstile-widget>.
			"cloudflare_turnstile_widget": {ComputeID: delegateID("id")},
			"cloudflare_hyperdrive_config": {
				ComputeID: delegateID("accountId"),
				Fields: map[string]*info.Schema{
					"id": {
						Name: "resourceId",
					},
				},
			},
			"cloudflare_cloud_connector_rules": {ComputeID: delegateID("zoneId")},
			// cloudflare_access_mutual_tls_hostname_settings has no ID or canonical ID field.
			"cloudflare_access_mutual_tls_hostname_settings": {
				ComputeID: func(_ context.Context, state resource.PropertyMap) (resource.ID, error) {
					account, hasAccount := state["accountId"]
					zone, hasZone := state["zoneId"]
					switch {
					case hasAccount && hasZone:
						return resource.ID(account.StringValue() + "__" + zone.StringValue()), nil
					case hasAccount:
						return resource.ID(account.StringValue()), nil
					case hasZone:
						return resource.ID(zone.StringValue()), nil
					default:
						return "id", nil
					}
				},
			},

			"cloudflare_ruleset": {Fields: map[string]*info.Schema{
				"rules": {Elem: &info.Schema{Fields: map[string]*info.Schema{
					"action_parameters": {Elem: &info.Schema{Fields: map[string]*info.Schema{
						"cache": {XAlwaysIncludeInImport: true},
					}}},
				}}},
			}},

			"cloudflare_zero_trust_risk_score_integration": {
				Docs: &info.Doc{AllowMissing: true},
			},

			"cloudflare_leaked_credential_check": {
				ComputeID: func(_ context.Context, state resource.PropertyMap) (resource.ID, error) {
					return resource.ID(state["enabled"].String() + "_" + state["zoneId"].String()), nil
				},
			},
			"cloudflare_snippet": {
				Docs: &info.Doc{AllowMissing: true},
				ComputeID: func(context.Context, resource.PropertyMap) (resource.ID, error) {
					return resource.ID("missing ID"), nil
				},
			},
			"cloudflare_snippet_rules": {
				Docs: &info.Doc{AllowMissing: true},
				ComputeID: func(context.Context, resource.PropertyMap) (resource.ID, error) {
					return resource.ID("missing ID"), nil
				},
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: &tfbridge.PythonInfo{
			RespectSchemaVersion: true,

			PyProject: struct {
				Enabled bool
			}{true},
		},

		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: map[string]string{
				mainPkg: "Cloudflare",
			},
		},
		EnableZeroDefaultSchemaVersion: true,
		EnableAccurateBridgePreview:    true,
	}

	prov.MustComputeTokens(tfbridgetokens.SingleModule("cloudflare_", mainMod,
		tfbridgetokens.MakeStandard(mainPkg)))

	prov.MustApplyAutoAliases()

	return prov
}

func docEditRules(defaults []info.DocsEdit) []info.DocsEdit {
	return append(
		defaults,
		skipGettingStartedSection,
	)
}

// Removes a "Getting Started" section that links to a tF tutorial
var skipGettingStartedSection = info.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		return tfgen.SkipSectionByHeaderContent(content, func(headerText string) bool {
			return headerText == "Getting Started"
		})
	},
}
