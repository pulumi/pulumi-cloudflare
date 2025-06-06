// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetZeroTrustTunnelCloudflaredVirtualNetwork
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
        ///     var exampleZeroTrustTunnelCloudflaredVirtualNetwork = Cloudflare.GetZeroTrustTunnelCloudflaredVirtualNetwork.Invoke(new()
        ///     {
        ///         AccountId = "699d98642c564d2e855e9661899b7252",
        ///         VirtualNetworkId = "f70ff985-a4ef-4643-bbbc-4a0ed4fc8415",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetZeroTrustTunnelCloudflaredVirtualNetworkResult> InvokeAsync(GetZeroTrustTunnelCloudflaredVirtualNetworkArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZeroTrustTunnelCloudflaredVirtualNetworkResult>("cloudflare:index/getZeroTrustTunnelCloudflaredVirtualNetwork:getZeroTrustTunnelCloudflaredVirtualNetwork", args ?? new GetZeroTrustTunnelCloudflaredVirtualNetworkArgs(), options.WithDefaults());

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
        ///     var exampleZeroTrustTunnelCloudflaredVirtualNetwork = Cloudflare.GetZeroTrustTunnelCloudflaredVirtualNetwork.Invoke(new()
        ///     {
        ///         AccountId = "699d98642c564d2e855e9661899b7252",
        ///         VirtualNetworkId = "f70ff985-a4ef-4643-bbbc-4a0ed4fc8415",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZeroTrustTunnelCloudflaredVirtualNetworkResult> Invoke(GetZeroTrustTunnelCloudflaredVirtualNetworkInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZeroTrustTunnelCloudflaredVirtualNetworkResult>("cloudflare:index/getZeroTrustTunnelCloudflaredVirtualNetwork:getZeroTrustTunnelCloudflaredVirtualNetwork", args ?? new GetZeroTrustTunnelCloudflaredVirtualNetworkInvokeArgs(), options.WithDefaults());

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
        ///     var exampleZeroTrustTunnelCloudflaredVirtualNetwork = Cloudflare.GetZeroTrustTunnelCloudflaredVirtualNetwork.Invoke(new()
        ///     {
        ///         AccountId = "699d98642c564d2e855e9661899b7252",
        ///         VirtualNetworkId = "f70ff985-a4ef-4643-bbbc-4a0ed4fc8415",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZeroTrustTunnelCloudflaredVirtualNetworkResult> Invoke(GetZeroTrustTunnelCloudflaredVirtualNetworkInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetZeroTrustTunnelCloudflaredVirtualNetworkResult>("cloudflare:index/getZeroTrustTunnelCloudflaredVirtualNetwork:getZeroTrustTunnelCloudflaredVirtualNetwork", args ?? new GetZeroTrustTunnelCloudflaredVirtualNetworkInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZeroTrustTunnelCloudflaredVirtualNetworkArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cloudflare account ID
        /// </summary>
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        [Input("filter")]
        public Inputs.GetZeroTrustTunnelCloudflaredVirtualNetworkFilterArgs? Filter { get; set; }

        /// <summary>
        /// UUID of the virtual network.
        /// </summary>
        [Input("virtualNetworkId")]
        public string? VirtualNetworkId { get; set; }

        public GetZeroTrustTunnelCloudflaredVirtualNetworkArgs()
        {
        }
        public static new GetZeroTrustTunnelCloudflaredVirtualNetworkArgs Empty => new GetZeroTrustTunnelCloudflaredVirtualNetworkArgs();
    }

    public sealed class GetZeroTrustTunnelCloudflaredVirtualNetworkInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cloudflare account ID
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("filter")]
        public Input<Inputs.GetZeroTrustTunnelCloudflaredVirtualNetworkFilterInputArgs>? Filter { get; set; }

        /// <summary>
        /// UUID of the virtual network.
        /// </summary>
        [Input("virtualNetworkId")]
        public Input<string>? VirtualNetworkId { get; set; }

        public GetZeroTrustTunnelCloudflaredVirtualNetworkInvokeArgs()
        {
        }
        public static new GetZeroTrustTunnelCloudflaredVirtualNetworkInvokeArgs Empty => new GetZeroTrustTunnelCloudflaredVirtualNetworkInvokeArgs();
    }


    [OutputType]
    public sealed class GetZeroTrustTunnelCloudflaredVirtualNetworkResult
    {
        /// <summary>
        /// Cloudflare account ID
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// Optional remark describing the virtual network.
        /// </summary>
        public readonly string Comment;
        /// <summary>
        /// Timestamp of when the resource was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// Timestamp of when the resource was deleted. If `null`, the resource has not been deleted.
        /// </summary>
        public readonly string DeletedAt;
        public readonly Outputs.GetZeroTrustTunnelCloudflaredVirtualNetworkFilterResult? Filter;
        /// <summary>
        /// UUID of the virtual network.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// If `true`, this virtual network is the default for the account.
        /// </summary>
        public readonly bool IsDefaultNetwork;
        /// <summary>
        /// A user-friendly name for the virtual network.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// UUID of the virtual network.
        /// </summary>
        public readonly string? VirtualNetworkId;

        [OutputConstructor]
        private GetZeroTrustTunnelCloudflaredVirtualNetworkResult(
            string accountId,

            string comment,

            string createdAt,

            string deletedAt,

            Outputs.GetZeroTrustTunnelCloudflaredVirtualNetworkFilterResult? filter,

            string id,

            bool isDefaultNetwork,

            string name,

            string? virtualNetworkId)
        {
            AccountId = accountId;
            Comment = comment;
            CreatedAt = createdAt;
            DeletedAt = deletedAt;
            Filter = filter;
            Id = id;
            IsDefaultNetwork = isDefaultNetwork;
            Name = name;
            VirtualNetworkId = virtualNetworkId;
        }
    }
}
