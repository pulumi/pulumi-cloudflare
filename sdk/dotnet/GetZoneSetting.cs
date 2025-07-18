// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetZoneSetting
    {
        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleZoneSetting = Cloudflare.GetZoneSetting.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         SettingId = "always_online",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetZoneSettingResult> InvokeAsync(GetZoneSettingArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZoneSettingResult>("cloudflare:index/getZoneSetting:getZoneSetting", args ?? new GetZoneSettingArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleZoneSetting = Cloudflare.GetZoneSetting.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         SettingId = "always_online",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZoneSettingResult> Invoke(GetZoneSettingInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZoneSettingResult>("cloudflare:index/getZoneSetting:getZoneSetting", args ?? new GetZoneSettingInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleZoneSetting = Cloudflare.GetZoneSetting.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         SettingId = "always_online",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZoneSettingResult> Invoke(GetZoneSettingInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetZoneSettingResult>("cloudflare:index/getZoneSetting:getZoneSetting", args ?? new GetZoneSettingInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZoneSettingArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Setting name
        /// </summary>
        [Input("settingId", required: true)]
        public string SettingId { get; set; } = null!;

        /// <summary>
        /// Identifier
        /// </summary>
        [Input("zoneId", required: true)]
        public string ZoneId { get; set; } = null!;

        public GetZoneSettingArgs()
        {
        }
        public static new GetZoneSettingArgs Empty => new GetZoneSettingArgs();
    }

    public sealed class GetZoneSettingInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Setting name
        /// </summary>
        [Input("settingId", required: true)]
        public Input<string> SettingId { get; set; } = null!;

        /// <summary>
        /// Identifier
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public GetZoneSettingInvokeArgs()
        {
        }
        public static new GetZoneSettingInvokeArgs Empty => new GetZoneSettingInvokeArgs();
    }


    [OutputType]
    public sealed class GetZoneSettingResult
    {
        /// <summary>
        /// Whether or not this setting can be modified for this zone (based on your Cloudflare plan level).
        /// </summary>
        public readonly bool Editable;
        /// <summary>
        /// ssl-recommender enrollment setting.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// ID of the zone setting.
        /// Available values: "0rtt", "advanced*ddos", "aegis", "always*online", "always*use*https", "automatic*https*rewrites", "brotli", "browser*cache*ttl", "browser*check", "cache*level", "challenge*ttl", "china*network*enabled", "ciphers", "cname*flattening", "development*mode", "early*hints", "edge*cache*ttl", "email*obfuscation", "h2*prioritization", "hotlink*protection", "http2", "http3", "image*resizing", "ip*geolocation", "ipv6", "max*upload", "min*tls*version", "mirage", "nel", "opportunistic*encryption", "opportunistic*onion", "orange*to*orange", "origin*error*page*pass*thru", "origin*h2*max*streams", "origin*max*http*version", "polish", "prefetch*preload", "privacy*pass", "proxy*read*timeout", "pseudo*ipv4", "replace*insecure*js", "response*buffering", "rocket*loader", "automatic*platform*optimization", "security*header", "security*level", "server*side*exclude", "sha1*support", "sort*query*string*for*cache", "ssl", "ssl*recommender", "tls*1*2*only", "tls*1*3", "tls*client*auth", "transformations", "transformations*allowed*origins", "true*client*ip_header", "waf", "webp", "websockets".
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// last time this setting was modified.
        /// </summary>
        public readonly string ModifiedOn;
        /// <summary>
        /// Setting name
        /// </summary>
        public readonly string SettingId;
        /// <summary>
        /// Value of the zone setting.
        /// Notes: The interval (in seconds) from when development mode expires (positive integer) or last expired (negative integer) for the domain. If development mode has never been enabled, this value is false.
        /// </summary>
        public readonly double TimeRemaining;
        /// <summary>
        /// Current value of the zone setting.
        /// Available values: "on", "off".
        /// </summary>
        public readonly string Value;
        /// <summary>
        /// Identifier
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetZoneSettingResult(
            bool editable,

            bool enabled,

            string id,

            string modifiedOn,

            string settingId,

            double timeRemaining,

            string value,

            string zoneId)
        {
            Editable = editable;
            Enabled = enabled;
            Id = id;
            ModifiedOn = modifiedOn;
            SettingId = settingId;
            TimeRemaining = timeRemaining;
            Value = value;
            ZoneId = zoneId;
        }
    }
}
