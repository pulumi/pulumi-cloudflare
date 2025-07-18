// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class PageRuleActionsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("alwaysUseHttps")]
        public Input<bool>? AlwaysUseHttps { get; set; }

        [Input("automaticHttpsRewrites")]
        public Input<string>? AutomaticHttpsRewrites { get; set; }

        [Input("browserCacheTtl")]
        public Input<int>? BrowserCacheTtl { get; set; }

        [Input("browserCheck")]
        public Input<string>? BrowserCheck { get; set; }

        [Input("bypassCacheOnCookie")]
        public Input<string>? BypassCacheOnCookie { get; set; }

        [Input("cacheByDeviceType")]
        public Input<string>? CacheByDeviceType { get; set; }

        [Input("cacheDeceptionArmor")]
        public Input<string>? CacheDeceptionArmor { get; set; }

        [Input("cacheKeyFields")]
        public Input<Inputs.PageRuleActionsCacheKeyFieldsGetArgs>? CacheKeyFields { get; set; }

        [Input("cacheLevel")]
        public Input<string>? CacheLevel { get; set; }

        [Input("cacheOnCookie")]
        public Input<string>? CacheOnCookie { get; set; }

        [Input("cacheTtlByStatus")]
        private InputMap<string>? _cacheTtlByStatus;
        public InputMap<string> CacheTtlByStatus
        {
            get => _cacheTtlByStatus ?? (_cacheTtlByStatus = new InputMap<string>());
            set => _cacheTtlByStatus = value;
        }

        [Input("disableApps")]
        public Input<bool>? DisableApps { get; set; }

        [Input("disablePerformance")]
        public Input<bool>? DisablePerformance { get; set; }

        [Input("disableSecurity")]
        public Input<bool>? DisableSecurity { get; set; }

        [Input("disableZaraz")]
        public Input<bool>? DisableZaraz { get; set; }

        [Input("edgeCacheTtl")]
        public Input<int>? EdgeCacheTtl { get; set; }

        [Input("emailObfuscation")]
        public Input<string>? EmailObfuscation { get; set; }

        [Input("explicitCacheControl")]
        public Input<string>? ExplicitCacheControl { get; set; }

        [Input("forwardingUrl")]
        public Input<Inputs.PageRuleActionsForwardingUrlGetArgs>? ForwardingUrl { get; set; }

        [Input("hostHeaderOverride")]
        public Input<string>? HostHeaderOverride { get; set; }

        [Input("ipGeolocation")]
        public Input<string>? IpGeolocation { get; set; }

        [Input("mirage")]
        public Input<string>? Mirage { get; set; }

        [Input("opportunisticEncryption")]
        public Input<string>? OpportunisticEncryption { get; set; }

        [Input("originErrorPagePassThru")]
        public Input<string>? OriginErrorPagePassThru { get; set; }

        [Input("polish")]
        public Input<string>? Polish { get; set; }

        [Input("resolveOverride")]
        public Input<string>? ResolveOverride { get; set; }

        [Input("respectStrongEtag")]
        public Input<string>? RespectStrongEtag { get; set; }

        [Input("responseBuffering")]
        public Input<string>? ResponseBuffering { get; set; }

        [Input("rocketLoader")]
        public Input<string>? RocketLoader { get; set; }

        [Input("securityLevel")]
        public Input<string>? SecurityLevel { get; set; }

        [Input("sortQueryStringForCache")]
        public Input<string>? SortQueryStringForCache { get; set; }

        [Input("ssl")]
        public Input<string>? Ssl { get; set; }

        [Input("trueClientIpHeader")]
        public Input<string>? TrueClientIpHeader { get; set; }

        [Input("waf")]
        public Input<string>? Waf { get; set; }

        public PageRuleActionsGetArgs()
        {
        }
        public static new PageRuleActionsGetArgs Empty => new PageRuleActionsGetArgs();
    }
}
