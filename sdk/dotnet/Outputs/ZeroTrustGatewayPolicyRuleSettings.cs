// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class ZeroTrustGatewayPolicyRuleSettings
    {
        /// <summary>
        /// Add custom headers to allowed requests in the form of key-value pairs.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? AddHeaders;
        /// <summary>
        /// Allow parent MSP accounts to enable bypass their children's rules.
        /// </summary>
        public readonly bool? AllowChildBypass;
        /// <summary>
        /// Settings for auditing SSH usage.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewayPolicyRuleSettingsAuditSsh? AuditSsh;
        /// <summary>
        /// Configure how browser isolation behaves.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewayPolicyRuleSettingsBisoAdminControls? BisoAdminControls;
        /// <summary>
        /// Indicator of block page enablement.
        /// </summary>
        public readonly bool? BlockPageEnabled;
        /// <summary>
        /// The displayed reason for a user being blocked.
        /// </summary>
        public readonly string? BlockPageReason;
        /// <summary>
        /// Allow child MSP accounts to bypass their parent's rule.
        /// </summary>
        public readonly bool? BypassParentRule;
        /// <summary>
        /// Configure how session check behaves.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewayPolicyRuleSettingsCheckSession? CheckSession;
        /// <summary>
        /// Add your own custom resolvers to route queries that match the resolver policy. Cannot be used when resolve*dns*through*cloudflare is set. DNS queries will route to the address closest to their origin.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewayPolicyRuleSettingsDnsResolvers? DnsResolvers;
        /// <summary>
        /// Configure how Proxy traffic egresses. Can be set for rules with Egress action and Egress filter. Can be omitted to indicate local egress via Warp IPs.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewayPolicyRuleSettingsEgress? Egress;
        /// <summary>
        /// Set to true, to ignore the category matches at CNAME domains in a response.
        /// </summary>
        public readonly bool? IgnoreCnameCategoryMatches;
        /// <summary>
        /// Disable DNSSEC validation (must be Allow rule).
        /// </summary>
        public readonly bool? InsecureDisableDnssecValidation;
        /// <summary>
        /// Turns on IP category based filter on dns if the rule contains dns category checks.
        /// </summary>
        public readonly bool? IpCategories;
        /// <summary>
        /// Settings to forward layer 4 traffic.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewayPolicyRuleSettingsL4override? L4override;
        /// <summary>
        /// Notification settings on a block rule.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewayPolicyRuleSettingsNotificationSettings? NotificationSettings;
        /// <summary>
        /// The host to override matching DNS queries with.
        /// </summary>
        public readonly string? OverrideHost;
        /// <summary>
        /// The IPs to override matching DNS queries with.
        /// </summary>
        public readonly ImmutableArray<string> OverrideIps;
        /// <summary>
        /// Configure DLP Payload Logging settings for this rule.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewayPolicyRuleSettingsPayloadLog? PayloadLog;
        /// <summary>
        /// Enable sending queries that match the resolver policy to Cloudflare's default 1.1.1.1 DNS resolver. Cannot be set when `dns_resolvers` are specified.
        /// </summary>
        public readonly bool? ResolveDnsThroughCloudflare;
        /// <summary>
        /// Configure untrusted certificate settings for this rule.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewayPolicyRuleSettingsUntrustedCert? UntrustedCert;

        [OutputConstructor]
        private ZeroTrustGatewayPolicyRuleSettings(
            ImmutableDictionary<string, string>? addHeaders,

            bool? allowChildBypass,

            Outputs.ZeroTrustGatewayPolicyRuleSettingsAuditSsh? auditSsh,

            Outputs.ZeroTrustGatewayPolicyRuleSettingsBisoAdminControls? bisoAdminControls,

            bool? blockPageEnabled,

            string? blockPageReason,

            bool? bypassParentRule,

            Outputs.ZeroTrustGatewayPolicyRuleSettingsCheckSession? checkSession,

            Outputs.ZeroTrustGatewayPolicyRuleSettingsDnsResolvers? dnsResolvers,

            Outputs.ZeroTrustGatewayPolicyRuleSettingsEgress? egress,

            bool? ignoreCnameCategoryMatches,

            bool? insecureDisableDnssecValidation,

            bool? ipCategories,

            Outputs.ZeroTrustGatewayPolicyRuleSettingsL4override? l4override,

            Outputs.ZeroTrustGatewayPolicyRuleSettingsNotificationSettings? notificationSettings,

            string? overrideHost,

            ImmutableArray<string> overrideIps,

            Outputs.ZeroTrustGatewayPolicyRuleSettingsPayloadLog? payloadLog,

            bool? resolveDnsThroughCloudflare,

            Outputs.ZeroTrustGatewayPolicyRuleSettingsUntrustedCert? untrustedCert)
        {
            AddHeaders = addHeaders;
            AllowChildBypass = allowChildBypass;
            AuditSsh = auditSsh;
            BisoAdminControls = bisoAdminControls;
            BlockPageEnabled = blockPageEnabled;
            BlockPageReason = blockPageReason;
            BypassParentRule = bypassParentRule;
            CheckSession = checkSession;
            DnsResolvers = dnsResolvers;
            Egress = egress;
            IgnoreCnameCategoryMatches = ignoreCnameCategoryMatches;
            InsecureDisableDnssecValidation = insecureDisableDnssecValidation;
            IpCategories = ipCategories;
            L4override = l4override;
            NotificationSettings = notificationSettings;
            OverrideHost = overrideHost;
            OverrideIps = overrideIps;
            PayloadLog = payloadLog;
            ResolveDnsThroughCloudflare = resolveDnsThroughCloudflare;
            UntrustedCert = untrustedCert;
        }
    }
}