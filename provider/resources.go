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

func ref[T any](val T) *T {
	return &val
}

func alias(oldType ...string) []info.Alias {
	aliases := []info.Alias{}
	for _, oldType := range oldType {
		aliases = append(aliases, info.Alias{
			Type: ref(oldType),
		})
	}
	return aliases
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() info.Provider {
	// Instantiate the Terraform provider
	p := pfbridge.ShimProvider(provShim.PFProvider())

	delegateID := func(pulumiField string) tfbridge.ComputeID {
		return tfbridge.DelegateIDField(resource.PropertyKey(pulumiField),
			"cloudflare", "https://github.com/pulumi/pulumi-cloudflare")
	}

	// Create a Pulumi provider mapping
	prov := info.Provider{
		P:                       p,
		Name:                    "cloudflare",
		DisplayName:             "Cloudflare",
		Description:             "A Pulumi package for creating and managing Cloudflare cloud resources.",
		Keywords:                []string{"pulumi", "cloudflare"},
		License:                 "Apache-2.0",
		Homepage:                "https://pulumi.io",
		GitHubOrg:               "cloudflare",
		Repository:              "https://github.com/pulumi/pulumi-cloudflare",
		UpstreamRepoPath:        "./upstream",
		Version:                 version.Version,
		TFProviderModuleVersion: "v5",
		MetadataInfo:            tfbridge.NewProviderMetadata(metadata),
		DocRules:                &info.DocRule{EditRules: docEditRules},
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
			// We cannot use TF's ID field as Pulumi's ID field automatically,
			// since it can (theoretically) be set by the user.
			//
			// In practice, it shouldn't be set by the user, and we should mirror TF here:
			//
			// Set our ID as site Key, which is what it represents upstream:
			// <https://developers.cloudflare.com/turnstile/get-started/terraform/#create-a-turnstile-widget>.
			"cloudflare_turnstile_widget": {ComputeID: delegateID("id")},
			"cloudflare_leaked_credential_check": {
				ComputeID: func(_ context.Context, state resource.PropertyMap) (resource.ID, error) {
					return resource.ID(state["enabled"].String() + "_" + state["zoneId"].String()), nil
				},
			},
			"cloudflare_snippet_rules": {Docs: &info.Doc{AllowMissing: true}},
			"cloudflare_zone": {
				TransformFromState: func(_ context.Context, state resource.PropertyMap) (resource.PropertyMap, error) {
					if zone, ok := state["zone"]; ok {
						state["name"] = zone
						delete(state, "zone")
					}

					if accountID, ok := state["accountId"]; ok {
						state["account"] = resource.NewObjectProperty(
							resource.PropertyMap{
								"id": resource.NewStringProperty(accountID.StringValue()),
							},
						)
						delete(state, "accountId")
					}
					return state, nil
				},
			},
			"cloudflare_zero_trust_access_application": {
				Aliases: alias("cloudflare:index/accessApplication:AccessApplication"),
			},
			"cloudflare_zero_trust_access_short_lived_certificate": {
				Aliases: alias("cloudflare:index/accessCaCertificate:AccessCaCertificate"),
			},
			"cloudflare_zero_trust_access_custom_page": {
				Aliases: alias("cloudflare:index/accessCustomPage:AccessCustomPage"),
			},
			"cloudflare_zero_trust_access_group": {
				Aliases: alias("cloudflare:index/accessGroup:AccessGroup"),
			},
			"cloudflare_zero_trust_access_identity_provider": {
				Aliases: alias("cloudflare:index/accessIdentityProvider:AccessIdentityProvider"),
			},
			"cloudflare_zero_trust_access_key_configuration": {
				Aliases: alias("cloudflare:index/accessKeysConfiguration:AccessKeysConfiguration"),
			},
			"cloudflare_zero_trust_access_mtls_certificate": {
				Aliases: alias("cloudflare:index/cloudflareAccessMutualTlsCertificate:AccessMutualTlsCertificate"),
			},
			"cloudflare_zero_trust_access_mtls_hostname_settings": {
				ComputeID: delegateID("accountId"),
				Aliases:   alias("cloudflare:index/accessMutualTlsHostnameSettings:AccessMutualTlsHostnameSettings"),
			},
			"cloudflare_zero_trust_organization": {
				Aliases: alias("cloudflare:index/accessOrganization:AccessOrganization"),
			},
			"cloudflare_zero_trust_access_policy": {
				Aliases: alias("cloudflare:index/accessPolicy:AccessPolicy"),
			},
			"cloudflare_zero_trust_access_service_token": {
				Aliases: alias("cloudflare:index/accessServiceToken:AccessServiceToken"),
			},
			"cloudflare_zero_trust_access_tag": {
				Aliases: alias("cloudflare:index/accessTag:AccessTag"),
			},
			"cloudflare_zero_trust_dex_test": {
				Aliases: alias("cloudflare:index/deviceDexTest:DeviceDexTest"),
			},
			"cloudflare_zero_trust_device_managed_networks": {
				Aliases: alias("cloudflare:index/deviceManagedNetworks:DeviceManagedNetworks"),
			},
			"cloudflare_zero_trust_device_posture_integration": {
				Aliases: alias("cloudflare:index/devicePostureIntegration:DevicePostureIntegration"),
			},
			"cloudflare_zero_trust_device_posture_rule": {
				Aliases: alias("cloudflare:index/devicePostureRule:DevicePostureRule"),
			},
			"cloudflare_zero_trust_device_custom_profile": {
				Aliases: alias(
					"cloudflare:index/deviceSettingsPolicy:DeviceSettingsPolicy",
					"cloudflare:index/splitTunnel:SplitTunnel",
				),
			},
			"cloudflare_zero_trust_device_default_profile": {
				Aliases: alias(
					"cloudflare:index/deviceSettingsPolicy:DeviceSettingsPolicy",
					"cloudflare:index/splitTunnel:SplitTunnel",
				),
			},
			"cloudflare_zero_trust_dlp_custom_profile": {
				// cloudflare_dlp_custom_profile
				Aliases: alias("cloudflare:index/dlpCustomProfile:DlpCustomProfile"),
			},
			"cloudflare_zero_trust_dlp_predefined_profile": {
				// cloudflare_dlp_predefined_profile
				Aliases: alias("cloudflare:index/dlpPredefinedProfile:DlpPredefinedProfile"),
			},
			"cloudflare_zero_trust_device_custom_profile_local_domain_fallback": {
				// cloudflare_fallback_domain or
				// cloudflare_zero_trust_local_fallback_domain
				Aliases: alias(
					"cloudflare:index/fallbackDomain:FallbackDomain",
					"cloudflare:index/zeroTrustLocalFallbackDomain:ZeroTrustLocalFallbackDomain",
				),
			},
			"cloudflare_magic_wan_gre_tunnel": {
				// cloudflare_gre_tunnel
				Aliases: alias("cloudflare:index/greTunnel:GreTunnel"),
			},
			"cloudflare_magic_wan_ipsec_tunnel": {
				// cloudflare_ipsec_tunnel
				Aliases: alias("cloudflare:index/ipsecTunnel:IpsecTunnel"),
			},
			"cloudflare_dns_record": {
				// cloudflare_record
				Aliases: alias("cloudflare:index/record:Record"),
			},
			"cloudflare_zero_trust_risk_behavior": {
				// cloudflare_risk_behavior
				Aliases: alias("cloudflare:index/riskBehavior:RiskBehavior"),
			},
			"cloudflare_magic_wan_static_route": {
				// cloudflare_static_route
				Aliases: alias("cloudflare:index/staticRoute:StaticRoute"),
			},
			"cloudflare_zero_trust_gateway_settings": {
				// cloudflare_teams_account
				Aliases: alias("cloudflare:index/teamsAccount:TeamsAccount"),
			},
			"cloudflare_zero_trust_list": {
				// cloudflare_teams_list
				Aliases: alias("cloudflare:index/teamsList:TeamsList"),
			},
			"cloudflare_zero_trust_dns_location": {
				// cloudflare_teams_location
				Aliases: alias("cloudflare:index/teamsLocation:TeamsLocation"),
			},
			"cloudflare_zero_trust_gateway_proxy_endpoint": {
				// cloudflare_teams_proxy_endpoint
				Aliases: alias("cloudflare:index/teamsProxyEndpoint:TeamsProxyEndpoint"),
			},
			"cloudflare_zero_trust_gateway_policy": {
				// cloudflare_teams_rule
				Aliases: alias("cloudflare:index/teamsRule:TeamsRule"),
			},
			"cloudflare_zero_trust_tunnel_cloudflared": {
				// cloudflare_tunnel
				Aliases: alias("cloudflare:index/tunnel:Tunnel"),
			},
			"cloudflare_zero_trust_tunnel_cloudflared_config": {
				// cloudflare_tunnel_config
				Aliases: alias("cloudflare:index/tunnelConfig:TunnelConfig"),
			},
			"cloudflare_zero_trust_tunnel_cloudflared_route": {
				// cloudflare_tunnel_route
				Aliases: alias("cloudflare:index/tunnelRoute:TunnelRoute"),
			},
			"cloudflare_zero_trust_tunnel_cloudflared_virtual_network": {
				// cloudflare_tunnel_virtual_network
				Aliases: alias("cloudflare:index/tunnelVirtualNetwork:TunnelVirtualNetwork"),
			},
			"cloudflare_workers_cron_trigger": {
				// cloudflare_worker_cron_trigger
				Aliases: alias("cloudflare:index/workerCronTrigger:WorkerCronTrigger"),
			},
			"cloudflare_workers_custom_domain": {
				// cloudflare_worker_domain
				Aliases: alias("cloudflare:index/workerDomain:WorkerDomain"),
			},
			"cloudflare_workers_script": {
				// cloudflare_worker_script
				Aliases: alias("cloudflare:index/workerScript:WorkerScript"),
			},
			"cloudflare_workers_secret": {
				// cloudflare_worker_secret
				Aliases: alias("cloudflare:index/workerSecret:WorkerSecret"),
			},
			"cloudflare_workers_for_platforms_dispatch_namespace": {
				// cloudflare_workers_for_platforms_namespace
				Aliases: alias("cloudflare:index/workersForPlatformsNamespace:WorkersForPlatformsNamespace"),
			},
			"cloudflare_managed_transforms": {
				// cloudflare_managed_headers
				Aliases: alias("cloudflare:index/managedHeaders:ManagedHeaders"),
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

	for _, r := range prov.Resources {
		_, ok := r.Fields["id"]
		if ok {
			continue
		}

		r.ComputeID = func(_ context.Context, state resource.PropertyMap) (resource.ID, error) {
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
		}
	}

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
