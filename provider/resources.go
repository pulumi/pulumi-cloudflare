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
	"fmt"
	provShim "github.com/cloudflare/terraform-provider-cloudflare/shim"
	"github.com/pulumi/pulumi-cloudflare/provider/v4/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"path/filepath"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "cloudflare"
	// modules:
	mainMod = "index" // the y module
)

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(provShim.NewProvider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "cloudflare",
		Description: "A Pulumi package for creating and managing Cloudflare cloud resources.",
		Keywords:    []string{"pulumi", "cloudflare"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		GitHubOrg:   "cloudflare",
		Repository:  "https://github.com/pulumi/pulumi-cloudflare",
		Config: map[string]*tfbridge.SchemaInfo{
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
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"cloudflare_access_application":    {Tok: tfbridge.MakeResource(mainPkg, mainMod, "AccessApplication")},
			"cloudflare_access_policy":         {Tok: tfbridge.MakeResource(mainPkg, mainMod, "AccessPolicy")},
			"cloudflare_access_rule":           {Tok: tfbridge.MakeResource(mainPkg, mainMod, "AccessRule")},
			"cloudflare_account_member":        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "AccountMember")},
			"cloudflare_argo":                  {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Argo")},
			"cloudflare_argo_tunnel":           {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ArgoTunnel")},
			"cloudflare_custom_pages":          {Tok: tfbridge.MakeResource(mainPkg, mainMod, "CustomPages")},
			"cloudflare_filter":                {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Filter")},
			"cloudflare_firewall_rule":         {Tok: tfbridge.MakeResource(mainPkg, mainMod, "FirewallRule")},
			"cloudflare_load_balancer_monitor": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "LoadBalancerMonitor")},
			"cloudflare_load_balancer_pool":    {Tok: tfbridge.MakeResource(mainPkg, mainMod, "LoadBalancerPool")},
			"cloudflare_load_balancer":         {Tok: tfbridge.MakeResource(mainPkg, mainMod, "LoadBalancer")},
			"cloudflare_logpush_job":           {Tok: tfbridge.MakeResource(mainPkg, mainMod, "LogpushJob")},
			"cloudflare_page_rule":             {Tok: tfbridge.MakeResource(mainPkg, mainMod, "PageRule")},
			"cloudflare_rate_limit":            {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RateLimit")},
			"cloudflare_record":                {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Record")},
			"cloudflare_spectrum_application":  {Tok: tfbridge.MakeResource(mainPkg, mainMod, "SpectrumApplication")},
			"cloudflare_waf_rule":              {Tok: tfbridge.MakeResource(mainPkg, mainMod, "WafRule")},
			"cloudflare_worker_route":          {Tok: tfbridge.MakeResource(mainPkg, mainMod, "WorkerRoute")},
			"cloudflare_worker_cron_trigger":   {Tok: tfbridge.MakeResource(mainPkg, mainMod, "WorkerCronTrigger")},
			"cloudflare_worker_script":         {Tok: tfbridge.MakeResource(mainPkg, mainMod, "WorkerScript")},
			"cloudflare_zone_lockdown":         {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ZoneLockdown")},
			"cloudflare_zone_settings_override": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "ZoneSettingsOverride"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"settings": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"0rtt": {
									Name: "zerortt",
								},
							},
						},
					},
					"initial_settings": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"0rtt": {
									Name: "zerortt",
								},
							},
						},
					},
				},
			},
			"cloudflare_zone": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "Zone"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"zone": {
						CSharpName: "ZoneName",
					},
				},
			},
			"cloudflare_custom_ssl": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "CustomSsl")},
			"cloudflare_access_service_token": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "AccessServiceToken"),
			},
			"cloudflare_waf_package":  {Tok: tfbridge.MakeResource(mainPkg, mainMod, "WafPackage")},
			"cloudflare_waf_group":    {Tok: tfbridge.MakeResource(mainPkg, mainMod, "WafGroup")},
			"cloudflare_access_group": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "AccessGroup")},
			"cloudflare_workers_kv_namespace": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "WorkersKvNamespace"),
			},
			"cloudflare_origin_ca_certificate": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "OriginCaCertificate"),
			},
			"cloudflare_access_identity_provider": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "AccessIdentityProvider"),
			},
			"cloudflare_workers_kv":        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "WorkersKv")},
			"cloudflare_byo_ip_prefix":     {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ByoIpPrefix")},
			"cloudflare_logpull_retention": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "LogpullRetention")},
			"cloudflare_healthcheck":       {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Healthcheck")},
			"cloudflare_logpush_ownership_challenge": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "LogpushOwnershipChallenge"),
			},
			"cloudflare_waf_override": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "WafOverride")},
			"cloudflare_authenticated_origin_pulls": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "AuthenticatedOriginPulls"),
			},
			"cloudflare_authenticated_origin_pulls_certificate": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "AuthenticatedOriginPullsCertificate"),
			},
			"cloudflare_custom_hostname": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "CustomHostname")},
			"cloudflare_custom_hostname_fallback_origin": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "CustomHostnameFallbackOrigin"),
			},
			"cloudflare_ip_list":          {Tok: tfbridge.MakeResource(mainPkg, mainMod, "IpList")},
			"cloudflare_certificate_pack": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "CertificatePack")},
			"cloudflare_api_token":        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ApiToken")},
			"cloudflare_zone_dnssec":      {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ZoneDnssec")},
			"cloudflare_magic_firewall_ruleset": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "MagicFirewallRuleset"),
			},
			"cloudflare_access_mutual_tls_certificate": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "AccessMutualTlsCertificate"),
			},
			"cloudflare_access_ca_certificate": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "AccessCaCertificate"),
			},
			"cloudflare_device_posture_rule": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "DevicePostureRule")},
			"cloudflare_teams_list":          {Tok: tfbridge.MakeResource(mainPkg, mainMod, "TeamsList")},
			"cloudflare_waiting_room":        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "WaitingRoom")},
			"cloudflare_static_route":        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "StaticRoute")},
			"cloudflare_notification_policy": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "NotificationPolicy")},
			"cloudflare_notification_policy_webhooks": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "NotificationPolicyWebhooks"),
			},
			"cloudflare_ruleset":        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Ruleset")},
			"cloudflare_teams_location": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "TeamsLocation")},
			"cloudflare_teams_account":  {Tok: tfbridge.MakeResource(mainPkg, mainMod, "TeamsAccount")},
			"cloudflare_teams_rule":     {Tok: tfbridge.MakeResource(mainPkg, mainMod, "TeamsRule")},
			"cloudflare_access_keys_configuration": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "AccessKeysConfiguration"),
				// This resource has no upstream docs:
				Docs: &tfbridge.DocInfo{
					Markdown: []byte(" "),
				},
			},
			"cloudflare_split_tunnel":        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "SplitTunnel")},
			"cloudflare_zone_cache_variants": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ZoneCacheVariants")},
			"cloudflare_device_posture_integration": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "DevicePostureIntegration"),
			},
			"cloudflare_device_policy_certificates": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "DevicePolicyCertificates"),
			},
			"cloudflare_fallback_domain":        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "FallbackDomain")},
			"cloudflare_gre_tunnel":             {Tok: tfbridge.MakeResource(mainPkg, mainMod, "GreTunnel")},
			"cloudflare_ipsec_tunnel":           {Tok: tfbridge.MakeResource(mainPkg, mainMod, "IpsecTunnel")},
			"cloudflare_teams_proxy_endpoint":   {Tok: tfbridge.MakeResource(mainPkg, mainMod, "TeamsProxyEndpoint")},
			"cloudflare_waiting_room_event":     {Tok: tfbridge.MakeResource(mainPkg, mainMod, "WaitingRoomEvent")},
			"cloudflare_access_bookmark":        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "AccessBookmark")},
			"cloudflare_tunnel_route":           {Tok: tfbridge.MakeResource(mainPkg, mainMod, "TunnelRoute")},
			"cloudflare_tunnel_virtual_network": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "TunnelVirtualNetwork")},
			"cloudflare_list":                   {Tok: tfbridge.MakeResource(mainPkg, mainMod, "List")},
			"cloudflare_managed_headers":        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ManagedHeaders")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"cloudflare_ip_ranges":    {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getIpRanges")},
			"cloudflare_zones":        {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getZones")},
			"cloudflare_waf_groups":   {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getWafGroups")},
			"cloudflare_waf_packages": {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getWafPackages")},
			"cloudflare_waf_rules":    {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getWafRules")},
			"cloudflare_api_token_permission_groups": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getApiTokenPermissionGroups"),
			},
			"cloudflare_zone_dnssec": {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getZoneDnssec")},
			"cloudflare_origin_ca_root_certificate": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getOriginCaRootCertificate"),
			},
			"cloudflare_access_identity_provider": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getAccessIdentityProvider"),
			},
			"cloudflare_account_roles": {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getAccountRoles")},
			"cloudflare_zone":          {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getZone")},
			"cloudflare_devices":       {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getDevices")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: map[string]string{
				mainPkg: "Cloudflare",
			},
		},
	}

	return prov
}
