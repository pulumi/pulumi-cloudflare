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
	"unicode"

	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/pulumi/pulumi-terraform-bridge/pkg/tfbridge"
	"github.com/pulumi/pulumi/pkg/tokens"
	"github.com/terraform-providers/terraform-provider-cloudflare/cloudflare"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "cloudflare"
	// modules:
	mainMod = "index" // the y module
)

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeDataSource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the data source's
// first character.
func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := cloudflare.Provider().(*schema.Provider)

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "cloudflare",
		Description: "A Pulumi package for creating and managing Cloudflare cloud resources.",
		Keywords:    []string{"pulumi", "cloudflare"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-cloudflare",
		Config: map[string]*tfbridge.SchemaInfo{
			"email": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"CLOUDFLARE_EMAIL"},
				},
			},
			"api_key": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"CLOUDFLARE_API_TOKEN"},
				},
			},
			"rps": {
				Default: &tfbridge.DefaultInfo{
					Value:   4,
					EnvVars: []string{"CLOUDFLARE_RPS"},
				},
			},
			"retries": {
				Default: &tfbridge.DefaultInfo{
					Value:   3,
					EnvVars: []string{"CLOUDFLARE_RETRIES"},
				},
			},
			"min_backoff": {
				Default: &tfbridge.DefaultInfo{
					Value:   1,
					EnvVars: []string{"CLOUDFLARE_MIN_BACKOFF"},
				},
			},
			"max_backoff": {
				Default: &tfbridge.DefaultInfo{
					Value:   30,
					EnvVars: []string{"CLOUDFLARE_MAX_BACKOFF"},
				},
			},
			"api_client_logging": {
				Default: &tfbridge.DefaultInfo{
					Value:   false,
					EnvVars: []string{"CLOUDFLARE_API_CLIENT_LOGGING"},
				},
			},
			"account_id": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"CLOUDFLARE_ACCOUNT_ID"},
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"cloudflare_access_application":     {Tok: makeResource(mainMod, "AccessApplication")},
			"cloudflare_access_policy":          {Tok: makeResource(mainMod, "AccessPolicy")},
			"cloudflare_access_rule":            {Tok: makeResource(mainMod, "AccessRule")},
			"cloudflare_account_member":         {Tok: makeResource(mainMod, "AccountMember")},
			"cloudflare_argo":                   {Tok: makeResource(mainMod, "Argo")},
			"cloudflare_custom_pages":           {Tok: makeResource(mainMod, "CustomPages")},
			"cloudflare_filter":                 {Tok: makeResource(mainMod, "Filter")},
			"cloudflare_firewall_rule":          {Tok: makeResource(mainMod, "FirewallRule")},
			"cloudflare_load_balancer_monitor":  {Tok: makeResource(mainMod, "LoadBalancerMonitor")},
			"cloudflare_load_balancer_pool":     {Tok: makeResource(mainMod, "LoadBalancerPool")},
			"cloudflare_load_balancer":          {Tok: makeResource(mainMod, "LoadBalancer")},
			"cloudflare_logpush_job":            {Tok: makeResource(mainMod, "LogpushJob")},
			"cloudflare_page_rule":              {Tok: makeResource(mainMod, "PageRule")},
			"cloudflare_rate_limit":             {Tok: makeResource(mainMod, "RateLimit")},
			"cloudflare_record":                 {Tok: makeResource(mainMod, "Record")},
			"cloudflare_spectrum_application":   {Tok: makeResource(mainMod, "SpectrumApplication")},
			"cloudflare_waf_rule":               {Tok: makeResource(mainMod, "WafRule")},
			"cloudflare_worker_route":           {Tok: makeResource(mainMod, "WorkerRoute")},
			"cloudflare_worker_script":          {Tok: makeResource(mainMod, "WorkerScript")},
			"cloudflare_zone_lockdown":          {Tok: makeResource(mainMod, "ZoneLockdown")},
			"cloudflare_zone_settings_override": {Tok: makeResource(mainMod, "ZoneSettingsOverride")},
			"cloudflare_zone": {
				Tok: makeResource(mainMod, "Zone"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"zone": {
						CSharpName: "ZoneName",
					},
				},
			},
			"cloudflare_custom_ssl":           {Tok: makeResource(mainMod, "CustomSsl")},
			"cloudflare_access_service_token": {Tok: makeResource(mainMod, "AccessServiceToken")},
			"cloudflare_waf_package":          {Tok: makeResource(mainMod, "WafPackage")},
			"cloudflare_waf_group":            {Tok: makeResource(mainMod, "WafGroup")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"cloudflare_ip_ranges":    {Tok: makeDataSource(mainMod, "getIpRanges")},
			"cloudflare_zones":        {Tok: makeDataSource(mainMod, "getZones")},
			"cloudflare_waf_groups":   {Tok: makeDataSource(mainMod, "getWafGroups")},
			"cloudflare_waf_packages": {Tok: makeDataSource(mainMod, "getWafPackages")},
			"cloudflare_waf_rules":    {Tok: makeDataSource(mainMod, "getWafRules")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^1.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=1.0.0,<2.0.0",
			},
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "1.5.0-*",
				"System.Collections.Immutable": "1.6.0",
			},
			Namespaces: map[string]string{
				mainPkg: "Cloudflare",
			},
		},
	}

	return prov
}
