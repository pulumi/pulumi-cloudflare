// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetZeroTrustTunnelCloudflaredRoutes
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
        ///     var exampleZeroTrustTunnelCloudflaredRoutes = Cloudflare.GetZeroTrustTunnelCloudflaredRoutes.Invoke(new()
        ///     {
        ///         AccountId = "699d98642c564d2e855e9661899b7252",
        ///         Comment = "Example comment for this route.",
        ///         ExistedAt = "2019-10-12T07%3A20%3A50.52Z",
        ///         IsDeleted = true,
        ///         NetworkSubset = "172.16.0.0/16",
        ///         NetworkSuperset = "172.16.0.0/16",
        ///         RouteId = "f70ff985-a4ef-4643-bbbc-4a0ed4fc8415",
        ///         TunTypes = new[]
        ///         {
        ///             "cfd_tunnel",
        ///         },
        ///         TunnelId = "f70ff985-a4ef-4643-bbbc-4a0ed4fc8415",
        ///         VirtualNetworkId = "f70ff985-a4ef-4643-bbbc-4a0ed4fc8415",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetZeroTrustTunnelCloudflaredRoutesResult> InvokeAsync(GetZeroTrustTunnelCloudflaredRoutesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZeroTrustTunnelCloudflaredRoutesResult>("cloudflare:index/getZeroTrustTunnelCloudflaredRoutes:getZeroTrustTunnelCloudflaredRoutes", args ?? new GetZeroTrustTunnelCloudflaredRoutesArgs(), options.WithDefaults());

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
        ///     var exampleZeroTrustTunnelCloudflaredRoutes = Cloudflare.GetZeroTrustTunnelCloudflaredRoutes.Invoke(new()
        ///     {
        ///         AccountId = "699d98642c564d2e855e9661899b7252",
        ///         Comment = "Example comment for this route.",
        ///         ExistedAt = "2019-10-12T07%3A20%3A50.52Z",
        ///         IsDeleted = true,
        ///         NetworkSubset = "172.16.0.0/16",
        ///         NetworkSuperset = "172.16.0.0/16",
        ///         RouteId = "f70ff985-a4ef-4643-bbbc-4a0ed4fc8415",
        ///         TunTypes = new[]
        ///         {
        ///             "cfd_tunnel",
        ///         },
        ///         TunnelId = "f70ff985-a4ef-4643-bbbc-4a0ed4fc8415",
        ///         VirtualNetworkId = "f70ff985-a4ef-4643-bbbc-4a0ed4fc8415",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZeroTrustTunnelCloudflaredRoutesResult> Invoke(GetZeroTrustTunnelCloudflaredRoutesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZeroTrustTunnelCloudflaredRoutesResult>("cloudflare:index/getZeroTrustTunnelCloudflaredRoutes:getZeroTrustTunnelCloudflaredRoutes", args ?? new GetZeroTrustTunnelCloudflaredRoutesInvokeArgs(), options.WithDefaults());

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
        ///     var exampleZeroTrustTunnelCloudflaredRoutes = Cloudflare.GetZeroTrustTunnelCloudflaredRoutes.Invoke(new()
        ///     {
        ///         AccountId = "699d98642c564d2e855e9661899b7252",
        ///         Comment = "Example comment for this route.",
        ///         ExistedAt = "2019-10-12T07%3A20%3A50.52Z",
        ///         IsDeleted = true,
        ///         NetworkSubset = "172.16.0.0/16",
        ///         NetworkSuperset = "172.16.0.0/16",
        ///         RouteId = "f70ff985-a4ef-4643-bbbc-4a0ed4fc8415",
        ///         TunTypes = new[]
        ///         {
        ///             "cfd_tunnel",
        ///         },
        ///         TunnelId = "f70ff985-a4ef-4643-bbbc-4a0ed4fc8415",
        ///         VirtualNetworkId = "f70ff985-a4ef-4643-bbbc-4a0ed4fc8415",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZeroTrustTunnelCloudflaredRoutesResult> Invoke(GetZeroTrustTunnelCloudflaredRoutesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetZeroTrustTunnelCloudflaredRoutesResult>("cloudflare:index/getZeroTrustTunnelCloudflaredRoutes:getZeroTrustTunnelCloudflaredRoutes", args ?? new GetZeroTrustTunnelCloudflaredRoutesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZeroTrustTunnelCloudflaredRoutesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cloudflare account ID
        /// </summary>
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        /// <summary>
        /// Optional remark describing the route.
        /// </summary>
        [Input("comment")]
        public string? Comment { get; set; }

        /// <summary>
        /// If provided, include only resources that were created (and not deleted) before this time. URL encoded.
        /// </summary>
        [Input("existedAt")]
        public string? ExistedAt { get; set; }

        /// <summary>
        /// If `true`, only include deleted routes. If `false`, exclude deleted routes. If empty, all routes will be included.
        /// </summary>
        [Input("isDeleted")]
        public bool? IsDeleted { get; set; }

        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        [Input("maxItems")]
        public int? MaxItems { get; set; }

        /// <summary>
        /// If set, only list routes that are contained within this IP range.
        /// </summary>
        [Input("networkSubset")]
        public string? NetworkSubset { get; set; }

        /// <summary>
        /// If set, only list routes that contain this IP range.
        /// </summary>
        [Input("networkSuperset")]
        public string? NetworkSuperset { get; set; }

        /// <summary>
        /// UUID of the route.
        /// </summary>
        [Input("routeId")]
        public string? RouteId { get; set; }

        [Input("tunTypes")]
        private List<string>? _tunTypes;

        /// <summary>
        /// The types of tunnels to filter by, separated by commas.
        /// </summary>
        public List<string> TunTypes
        {
            get => _tunTypes ?? (_tunTypes = new List<string>());
            set => _tunTypes = value;
        }

        /// <summary>
        /// UUID of the tunnel.
        /// </summary>
        [Input("tunnelId")]
        public string? TunnelId { get; set; }

        /// <summary>
        /// UUID of the virtual network.
        /// </summary>
        [Input("virtualNetworkId")]
        public string? VirtualNetworkId { get; set; }

        public GetZeroTrustTunnelCloudflaredRoutesArgs()
        {
        }
        public static new GetZeroTrustTunnelCloudflaredRoutesArgs Empty => new GetZeroTrustTunnelCloudflaredRoutesArgs();
    }

    public sealed class GetZeroTrustTunnelCloudflaredRoutesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cloudflare account ID
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Optional remark describing the route.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// If provided, include only resources that were created (and not deleted) before this time. URL encoded.
        /// </summary>
        [Input("existedAt")]
        public Input<string>? ExistedAt { get; set; }

        /// <summary>
        /// If `true`, only include deleted routes. If `false`, exclude deleted routes. If empty, all routes will be included.
        /// </summary>
        [Input("isDeleted")]
        public Input<bool>? IsDeleted { get; set; }

        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        [Input("maxItems")]
        public Input<int>? MaxItems { get; set; }

        /// <summary>
        /// If set, only list routes that are contained within this IP range.
        /// </summary>
        [Input("networkSubset")]
        public Input<string>? NetworkSubset { get; set; }

        /// <summary>
        /// If set, only list routes that contain this IP range.
        /// </summary>
        [Input("networkSuperset")]
        public Input<string>? NetworkSuperset { get; set; }

        /// <summary>
        /// UUID of the route.
        /// </summary>
        [Input("routeId")]
        public Input<string>? RouteId { get; set; }

        [Input("tunTypes")]
        private InputList<string>? _tunTypes;

        /// <summary>
        /// The types of tunnels to filter by, separated by commas.
        /// </summary>
        public InputList<string> TunTypes
        {
            get => _tunTypes ?? (_tunTypes = new InputList<string>());
            set => _tunTypes = value;
        }

        /// <summary>
        /// UUID of the tunnel.
        /// </summary>
        [Input("tunnelId")]
        public Input<string>? TunnelId { get; set; }

        /// <summary>
        /// UUID of the virtual network.
        /// </summary>
        [Input("virtualNetworkId")]
        public Input<string>? VirtualNetworkId { get; set; }

        public GetZeroTrustTunnelCloudflaredRoutesInvokeArgs()
        {
        }
        public static new GetZeroTrustTunnelCloudflaredRoutesInvokeArgs Empty => new GetZeroTrustTunnelCloudflaredRoutesInvokeArgs();
    }


    [OutputType]
    public sealed class GetZeroTrustTunnelCloudflaredRoutesResult
    {
        /// <summary>
        /// Cloudflare account ID
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// Optional remark describing the route.
        /// </summary>
        public readonly string? Comment;
        /// <summary>
        /// If provided, include only resources that were created (and not deleted) before this time. URL encoded.
        /// </summary>
        public readonly string? ExistedAt;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// If `true`, only include deleted routes. If `false`, exclude deleted routes. If empty, all routes will be included.
        /// </summary>
        public readonly bool? IsDeleted;
        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        public readonly int? MaxItems;
        /// <summary>
        /// If set, only list routes that are contained within this IP range.
        /// </summary>
        public readonly string? NetworkSubset;
        /// <summary>
        /// If set, only list routes that contain this IP range.
        /// </summary>
        public readonly string? NetworkSuperset;
        /// <summary>
        /// The items returned by the data source
        /// </summary>
        public readonly ImmutableArray<Outputs.GetZeroTrustTunnelCloudflaredRoutesResultResult> Results;
        /// <summary>
        /// UUID of the route.
        /// </summary>
        public readonly string? RouteId;
        /// <summary>
        /// The types of tunnels to filter by, separated by commas.
        /// </summary>
        public readonly ImmutableArray<string> TunTypes;
        /// <summary>
        /// UUID of the tunnel.
        /// </summary>
        public readonly string? TunnelId;
        /// <summary>
        /// UUID of the virtual network.
        /// </summary>
        public readonly string? VirtualNetworkId;

        [OutputConstructor]
        private GetZeroTrustTunnelCloudflaredRoutesResult(
            string accountId,

            string? comment,

            string? existedAt,

            string id,

            bool? isDeleted,

            int? maxItems,

            string? networkSubset,

            string? networkSuperset,

            ImmutableArray<Outputs.GetZeroTrustTunnelCloudflaredRoutesResultResult> results,

            string? routeId,

            ImmutableArray<string> tunTypes,

            string? tunnelId,

            string? virtualNetworkId)
        {
            AccountId = accountId;
            Comment = comment;
            ExistedAt = existedAt;
            Id = id;
            IsDeleted = isDeleted;
            MaxItems = maxItems;
            NetworkSubset = networkSubset;
            NetworkSuperset = networkSuperset;
            Results = results;
            RouteId = routeId;
            TunTypes = tunTypes;
            TunnelId = tunnelId;
            VirtualNetworkId = virtualNetworkId;
        }
    }
}
