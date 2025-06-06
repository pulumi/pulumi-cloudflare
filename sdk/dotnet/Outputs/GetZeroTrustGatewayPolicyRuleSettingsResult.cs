// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class GetZeroTrustGatewayPolicyRuleSettingsResult
    {
        /// <summary>
        /// Add custom headers to allowed requests, in the form of key-value pairs. Keys are header names, pointing to an array with its header value(s).
        /// </summary>
        public readonly ImmutableDictionary<string, string> AddHeaders;
        /// <summary>
        /// Set by parent MSP accounts to enable their children to bypass this rule.
        /// </summary>
        public readonly bool AllowChildBypass;
        /// <summary>
        /// Settings for the Audit SSH action.
        /// </summary>
        public readonly Outputs.GetZeroTrustGatewayPolicyRuleSettingsAuditSshResult AuditSsh;
        /// <summary>
        /// Configure how browser isolation behaves.
        /// </summary>
        public readonly Outputs.GetZeroTrustGatewayPolicyRuleSettingsBisoAdminControlsResult BisoAdminControls;
        /// <summary>
        /// Custom block page settings. If missing/null, blocking will use the the account settings.
        /// </summary>
        public readonly Outputs.GetZeroTrustGatewayPolicyRuleSettingsBlockPageResult BlockPage;
        /// <summary>
        /// Enable the custom block page.
        /// </summary>
        public readonly bool BlockPageEnabled;
        /// <summary>
        /// The text describing why this block occurred, displayed on the custom block page (if enabled).
        /// </summary>
        public readonly string BlockReason;
        /// <summary>
        /// Set by children MSP accounts to bypass their parent's rules.
        /// </summary>
        public readonly bool BypassParentRule;
        /// <summary>
        /// Configure how session check behaves.
        /// </summary>
        public readonly Outputs.GetZeroTrustGatewayPolicyRuleSettingsCheckSessionResult CheckSession;
        /// <summary>
        /// Add your own custom resolvers to route queries that match the resolver policy. Cannot be used when 'resolve*dns*through*cloudflare' or 'resolve*dns*internally' are set. DNS queries will route to the address closest to their origin. Only valid when a rule's action is set to 'resolve'.
        /// </summary>
        public readonly Outputs.GetZeroTrustGatewayPolicyRuleSettingsDnsResolversResult DnsResolvers;
        /// <summary>
        /// Configure how Gateway Proxy traffic egresses. You can enable this setting for rules with Egress actions and filters, or omit it to indicate local egress via WARP IPs.
        /// </summary>
        public readonly Outputs.GetZeroTrustGatewayPolicyRuleSettingsEgressResult Egress;
        /// <summary>
        /// Set to true, to ignore the category matches at CNAME domains in a response. If unchecked, the categories in this rule will be checked against all the CNAME domain categories in a response.
        /// </summary>
        public readonly bool IgnoreCnameCategoryMatches;
        /// <summary>
        /// INSECURE - disable DNSSEC validation (for Allow actions).
        /// </summary>
        public readonly bool InsecureDisableDnssecValidation;
        /// <summary>
        /// Set to true to enable IPs in DNS resolver category blocks. By default categories only block based on domain names.
        /// </summary>
        public readonly bool IpCategories;
        /// <summary>
        /// Set to true to include IPs in DNS resolver indicator feed blocks. By default indicator feeds only block based on domain names.
        /// </summary>
        public readonly bool IpIndicatorFeeds;
        /// <summary>
        /// Send matching traffic to the supplied destination IP address and port.
        /// </summary>
        public readonly Outputs.GetZeroTrustGatewayPolicyRuleSettingsL4overrideResult L4override;
        /// <summary>
        /// Configure a notification to display on the user's device when this rule is matched.
        /// </summary>
        public readonly Outputs.GetZeroTrustGatewayPolicyRuleSettingsNotificationSettingsResult NotificationSettings;
        /// <summary>
        /// Override matching DNS queries with a hostname.
        /// </summary>
        public readonly string OverrideHost;
        /// <summary>
        /// Override matching DNS queries with an IP or set of IPs.
        /// </summary>
        public readonly ImmutableArray<string> OverrideIps;
        /// <summary>
        /// Configure DLP payload logging.
        /// </summary>
        public readonly Outputs.GetZeroTrustGatewayPolicyRuleSettingsPayloadLogResult PayloadLog;
        /// <summary>
        /// Settings that apply to quarantine rules
        /// </summary>
        public readonly Outputs.GetZeroTrustGatewayPolicyRuleSettingsQuarantineResult Quarantine;
        /// <summary>
        /// Settings that apply to redirect rules
        /// </summary>
        public readonly Outputs.GetZeroTrustGatewayPolicyRuleSettingsRedirectResult Redirect;
        /// <summary>
        /// Configure to forward the query to the internal DNS service, passing the specified 'view*id' as input. Cannot be set when 'dns*resolvers' are specified or 'resolve*dns*through*cloudflare' is set. Only valid when a rule's action is set to 'resolve'.
        /// </summary>
        public readonly Outputs.GetZeroTrustGatewayPolicyRuleSettingsResolveDnsInternallyResult ResolveDnsInternally;
        /// <summary>
        /// Enable to send queries that match the policy to Cloudflare's default 1.1.1.1 DNS resolver. Cannot be set when 'dns*resolvers' are specified or 'resolve*dns_internally' is set. Only valid when a rule's action is set to 'resolve'.
        /// </summary>
        public readonly bool ResolveDnsThroughCloudflare;
        /// <summary>
        /// Configure behavior when an upstream cert is invalid or an SSL error occurs.
        /// </summary>
        public readonly Outputs.GetZeroTrustGatewayPolicyRuleSettingsUntrustedCertResult UntrustedCert;

        [OutputConstructor]
        private GetZeroTrustGatewayPolicyRuleSettingsResult(
            ImmutableDictionary<string, string> addHeaders,

            bool allowChildBypass,

            Outputs.GetZeroTrustGatewayPolicyRuleSettingsAuditSshResult auditSsh,

            Outputs.GetZeroTrustGatewayPolicyRuleSettingsBisoAdminControlsResult bisoAdminControls,

            Outputs.GetZeroTrustGatewayPolicyRuleSettingsBlockPageResult blockPage,

            bool blockPageEnabled,

            string blockReason,

            bool bypassParentRule,

            Outputs.GetZeroTrustGatewayPolicyRuleSettingsCheckSessionResult checkSession,

            Outputs.GetZeroTrustGatewayPolicyRuleSettingsDnsResolversResult dnsResolvers,

            Outputs.GetZeroTrustGatewayPolicyRuleSettingsEgressResult egress,

            bool ignoreCnameCategoryMatches,

            bool insecureDisableDnssecValidation,

            bool ipCategories,

            bool ipIndicatorFeeds,

            Outputs.GetZeroTrustGatewayPolicyRuleSettingsL4overrideResult l4override,

            Outputs.GetZeroTrustGatewayPolicyRuleSettingsNotificationSettingsResult notificationSettings,

            string overrideHost,

            ImmutableArray<string> overrideIps,

            Outputs.GetZeroTrustGatewayPolicyRuleSettingsPayloadLogResult payloadLog,

            Outputs.GetZeroTrustGatewayPolicyRuleSettingsQuarantineResult quarantine,

            Outputs.GetZeroTrustGatewayPolicyRuleSettingsRedirectResult redirect,

            Outputs.GetZeroTrustGatewayPolicyRuleSettingsResolveDnsInternallyResult resolveDnsInternally,

            bool resolveDnsThroughCloudflare,

            Outputs.GetZeroTrustGatewayPolicyRuleSettingsUntrustedCertResult untrustedCert)
        {
            AddHeaders = addHeaders;
            AllowChildBypass = allowChildBypass;
            AuditSsh = auditSsh;
            BisoAdminControls = bisoAdminControls;
            BlockPage = blockPage;
            BlockPageEnabled = blockPageEnabled;
            BlockReason = blockReason;
            BypassParentRule = bypassParentRule;
            CheckSession = checkSession;
            DnsResolvers = dnsResolvers;
            Egress = egress;
            IgnoreCnameCategoryMatches = ignoreCnameCategoryMatches;
            InsecureDisableDnssecValidation = insecureDisableDnssecValidation;
            IpCategories = ipCategories;
            IpIndicatorFeeds = ipIndicatorFeeds;
            L4override = l4override;
            NotificationSettings = notificationSettings;
            OverrideHost = overrideHost;
            OverrideIps = overrideIps;
            PayloadLog = payloadLog;
            Quarantine = quarantine;
            Redirect = redirect;
            ResolveDnsInternally = resolveDnsInternally;
            ResolveDnsThroughCloudflare = resolveDnsThroughCloudflare;
            UntrustedCert = untrustedCert;
        }
    }
}
