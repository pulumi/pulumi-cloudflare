// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetZone
    {
        /// <summary>
        /// Use this data source to look up [zone](https://api.cloudflare.com/#zone-properties)
        /// info. This is the singular alternative to `cloudflare.getZones`.
        /// 
        /// &gt; **Note** Cloudflare zone names **are not unique**. It is possible for multiple
        /// accounts to have the same zone created but in different states. If you are
        /// using this setup, it is advised to use the `account_id` attribute on this
        /// resource or swap to `cloudflare.getZones` to further filter the results.
        /// 
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
        ///     var example = Cloudflare.GetZone.Invoke(new()
        ///     {
        ///         Name = "example.com",
        ///     });
        /// 
        ///     var exampleRecord = new Cloudflare.Record("example", new()
        ///     {
        ///         ZoneId = example.Apply(getZoneResult =&gt; getZoneResult.Id),
        ///         Name = "www",
        ///         Content = "203.0.113.1",
        ///         Type = "A",
        ///         Proxied = true,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetZoneResult> InvokeAsync(GetZoneArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZoneResult>("cloudflare:index/getZone:getZone", args ?? new GetZoneArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to look up [zone](https://api.cloudflare.com/#zone-properties)
        /// info. This is the singular alternative to `cloudflare.getZones`.
        /// 
        /// &gt; **Note** Cloudflare zone names **are not unique**. It is possible for multiple
        /// accounts to have the same zone created but in different states. If you are
        /// using this setup, it is advised to use the `account_id` attribute on this
        /// resource or swap to `cloudflare.getZones` to further filter the results.
        /// 
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
        ///     var example = Cloudflare.GetZone.Invoke(new()
        ///     {
        ///         Name = "example.com",
        ///     });
        /// 
        ///     var exampleRecord = new Cloudflare.Record("example", new()
        ///     {
        ///         ZoneId = example.Apply(getZoneResult =&gt; getZoneResult.Id),
        ///         Name = "www",
        ///         Content = "203.0.113.1",
        ///         Type = "A",
        ///         Proxied = true,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZoneResult> Invoke(GetZoneInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZoneResult>("cloudflare:index/getZone:getZone", args ?? new GetZoneInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to look up [zone](https://api.cloudflare.com/#zone-properties)
        /// info. This is the singular alternative to `cloudflare.getZones`.
        /// 
        /// &gt; **Note** Cloudflare zone names **are not unique**. It is possible for multiple
        /// accounts to have the same zone created but in different states. If you are
        /// using this setup, it is advised to use the `account_id` attribute on this
        /// resource or swap to `cloudflare.getZones` to further filter the results.
        /// 
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
        ///     var example = Cloudflare.GetZone.Invoke(new()
        ///     {
        ///         Name = "example.com",
        ///     });
        /// 
        ///     var exampleRecord = new Cloudflare.Record("example", new()
        ///     {
        ///         ZoneId = example.Apply(getZoneResult =&gt; getZoneResult.Id),
        ///         Name = "www",
        ///         Content = "203.0.113.1",
        ///         Type = "A",
        ///         Proxied = true,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZoneResult> Invoke(GetZoneInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetZoneResult>("cloudflare:index/getZone:getZone", args ?? new GetZoneInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZoneArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public string? AccountId { get; set; }

        /// <summary>
        /// The name of the zone. Must provide only one of `zone_id`, `name`.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. Must provide only one of `zone_id`, `name`.
        /// </summary>
        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetZoneArgs()
        {
        }
        public static new GetZoneArgs Empty => new GetZoneArgs();
    }

    public sealed class GetZoneInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The name of the zone. Must provide only one of `zone_id`, `name`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. Must provide only one of `zone_id`, `name`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public GetZoneInvokeArgs()
        {
        }
        public static new GetZoneInvokeArgs Empty => new GetZoneInvokeArgs();
    }


    [OutputType]
    public sealed class GetZoneResult
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the zone. Must provide only one of `zone_id`, `name`.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Cloudflare assigned name servers. This is only populated for zones that use Cloudflare DNS.
        /// </summary>
        public readonly ImmutableArray<string> NameServers;
        /// <summary>
        /// Whether the zone is paused on Cloudflare.
        /// </summary>
        public readonly bool Paused;
        /// <summary>
        /// The name of the plan associated with the zone.
        /// </summary>
        public readonly string Plan;
        /// <summary>
        /// Status of the zone.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// List of Vanity Nameservers (if set).
        /// </summary>
        public readonly ImmutableArray<string> VanityNameServers;
        /// <summary>
        /// The zone identifier to target for the resource. Must provide only one of `zone_id`, `name`.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetZoneResult(
            string accountId,

            string id,

            string name,

            ImmutableArray<string> nameServers,

            bool paused,

            string plan,

            string status,

            ImmutableArray<string> vanityNameServers,

            string zoneId)
        {
            AccountId = accountId;
            Id = id;
            Name = name;
            NameServers = nameServers;
            Paused = paused;
            Plan = plan;
            Status = status;
            VanityNameServers = vanityNameServers;
            ZoneId = zoneId;
        }
    }
}
