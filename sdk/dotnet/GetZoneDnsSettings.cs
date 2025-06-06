// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetZoneDnsSettings
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
        ///     var exampleZoneDnsSettings = Cloudflare.GetZoneDnsSettings.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetZoneDnsSettingsResult> InvokeAsync(GetZoneDnsSettingsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZoneDnsSettingsResult>("cloudflare:index/getZoneDnsSettings:getZoneDnsSettings", args ?? new GetZoneDnsSettingsArgs(), options.WithDefaults());

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
        ///     var exampleZoneDnsSettings = Cloudflare.GetZoneDnsSettings.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZoneDnsSettingsResult> Invoke(GetZoneDnsSettingsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZoneDnsSettingsResult>("cloudflare:index/getZoneDnsSettings:getZoneDnsSettings", args ?? new GetZoneDnsSettingsInvokeArgs(), options.WithDefaults());

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
        ///     var exampleZoneDnsSettings = Cloudflare.GetZoneDnsSettings.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZoneDnsSettingsResult> Invoke(GetZoneDnsSettingsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetZoneDnsSettingsResult>("cloudflare:index/getZoneDnsSettings:getZoneDnsSettings", args ?? new GetZoneDnsSettingsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZoneDnsSettingsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public string ZoneId { get; set; } = null!;

        public GetZoneDnsSettingsArgs()
        {
        }
        public static new GetZoneDnsSettingsArgs Empty => new GetZoneDnsSettingsArgs();
    }

    public sealed class GetZoneDnsSettingsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public GetZoneDnsSettingsInvokeArgs()
        {
        }
        public static new GetZoneDnsSettingsInvokeArgs Empty => new GetZoneDnsSettingsInvokeArgs();
    }


    [OutputType]
    public sealed class GetZoneDnsSettingsResult
    {
        /// <summary>
        /// Whether to flatten all CNAME records in the zone. Note that, due to DNS limitations, a CNAME record at the zone apex will always be flattened.
        /// </summary>
        public readonly bool FlattenAllCnames;
        /// <summary>
        /// Whether to enable Foundation DNS Advanced Nameservers on the zone.
        /// </summary>
        public readonly bool FoundationDns;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Settings for this internal zone.
        /// </summary>
        public readonly Outputs.GetZoneDnsSettingsInternalDnsResult InternalDns;
        /// <summary>
        /// Whether to enable multi-provider DNS, which causes Cloudflare to activate the zone even when non-Cloudflare NS records exist, and to respect NS records at the zone apex during outbound zone transfers.
        /// </summary>
        public readonly bool MultiProvider;
        /// <summary>
        /// Settings determining the nameservers through which the zone should be available.
        /// </summary>
        public readonly Outputs.GetZoneDnsSettingsNameserversResult Nameservers;
        /// <summary>
        /// The time to live (TTL) of the zone's nameserver (NS) records.
        /// </summary>
        public readonly double NsTtl;
        /// <summary>
        /// Allows a Secondary DNS zone to use (proxied) override records and CNAME flattening at the zone apex.
        /// </summary>
        public readonly bool SecondaryOverrides;
        /// <summary>
        /// Components of the zone's SOA record.
        /// </summary>
        public readonly Outputs.GetZoneDnsSettingsSoaResult Soa;
        /// <summary>
        /// Identifier.
        /// </summary>
        public readonly string ZoneId;
        /// <summary>
        /// Whether the zone mode is a regular or CDN/DNS only zone.
        /// Available values: "standard", "cdn*only", "dns*only".
        /// </summary>
        public readonly string ZoneMode;

        [OutputConstructor]
        private GetZoneDnsSettingsResult(
            bool flattenAllCnames,

            bool foundationDns,

            string id,

            Outputs.GetZoneDnsSettingsInternalDnsResult internalDns,

            bool multiProvider,

            Outputs.GetZoneDnsSettingsNameserversResult nameservers,

            double nsTtl,

            bool secondaryOverrides,

            Outputs.GetZoneDnsSettingsSoaResult soa,

            string zoneId,

            string zoneMode)
        {
            FlattenAllCnames = flattenAllCnames;
            FoundationDns = foundationDns;
            Id = id;
            InternalDns = internalDns;
            MultiProvider = multiProvider;
            Nameservers = nameservers;
            NsTtl = nsTtl;
            SecondaryOverrides = secondaryOverrides;
            Soa = soa;
            ZoneId = zoneId;
            ZoneMode = zoneMode;
        }
    }
}
