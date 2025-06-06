// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetZeroTrustDeviceManagedNetworksList
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
        ///     var exampleZeroTrustDeviceManagedNetworksList = Cloudflare.GetZeroTrustDeviceManagedNetworksList.Invoke(new()
        ///     {
        ///         AccountId = "699d98642c564d2e855e9661899b7252",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetZeroTrustDeviceManagedNetworksListResult> InvokeAsync(GetZeroTrustDeviceManagedNetworksListArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZeroTrustDeviceManagedNetworksListResult>("cloudflare:index/getZeroTrustDeviceManagedNetworksList:getZeroTrustDeviceManagedNetworksList", args ?? new GetZeroTrustDeviceManagedNetworksListArgs(), options.WithDefaults());

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
        ///     var exampleZeroTrustDeviceManagedNetworksList = Cloudflare.GetZeroTrustDeviceManagedNetworksList.Invoke(new()
        ///     {
        ///         AccountId = "699d98642c564d2e855e9661899b7252",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZeroTrustDeviceManagedNetworksListResult> Invoke(GetZeroTrustDeviceManagedNetworksListInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZeroTrustDeviceManagedNetworksListResult>("cloudflare:index/getZeroTrustDeviceManagedNetworksList:getZeroTrustDeviceManagedNetworksList", args ?? new GetZeroTrustDeviceManagedNetworksListInvokeArgs(), options.WithDefaults());

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
        ///     var exampleZeroTrustDeviceManagedNetworksList = Cloudflare.GetZeroTrustDeviceManagedNetworksList.Invoke(new()
        ///     {
        ///         AccountId = "699d98642c564d2e855e9661899b7252",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetZeroTrustDeviceManagedNetworksListResult> Invoke(GetZeroTrustDeviceManagedNetworksListInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetZeroTrustDeviceManagedNetworksListResult>("cloudflare:index/getZeroTrustDeviceManagedNetworksList:getZeroTrustDeviceManagedNetworksList", args ?? new GetZeroTrustDeviceManagedNetworksListInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZeroTrustDeviceManagedNetworksListArgs : global::Pulumi.InvokeArgs
    {
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        [Input("maxItems")]
        public int? MaxItems { get; set; }

        public GetZeroTrustDeviceManagedNetworksListArgs()
        {
        }
        public static new GetZeroTrustDeviceManagedNetworksListArgs Empty => new GetZeroTrustDeviceManagedNetworksListArgs();
    }

    public sealed class GetZeroTrustDeviceManagedNetworksListInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        [Input("maxItems")]
        public Input<int>? MaxItems { get; set; }

        public GetZeroTrustDeviceManagedNetworksListInvokeArgs()
        {
        }
        public static new GetZeroTrustDeviceManagedNetworksListInvokeArgs Empty => new GetZeroTrustDeviceManagedNetworksListInvokeArgs();
    }


    [OutputType]
    public sealed class GetZeroTrustDeviceManagedNetworksListResult
    {
        public readonly string AccountId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        public readonly int? MaxItems;
        /// <summary>
        /// The items returned by the data source
        /// </summary>
        public readonly ImmutableArray<Outputs.GetZeroTrustDeviceManagedNetworksListResultResult> Results;

        [OutputConstructor]
        private GetZeroTrustDeviceManagedNetworksListResult(
            string accountId,

            string id,

            int? maxItems,

            ImmutableArray<Outputs.GetZeroTrustDeviceManagedNetworksListResultResult> results)
        {
            AccountId = accountId;
            Id = id;
            MaxItems = maxItems;
            Results = results;
        }
    }
}
