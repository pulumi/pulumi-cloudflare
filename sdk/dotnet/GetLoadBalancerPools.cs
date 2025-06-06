// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetLoadBalancerPools
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
        ///     var exampleLoadBalancerPools = Cloudflare.GetLoadBalancerPools.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         Monitor = "monitor",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetLoadBalancerPoolsResult> InvokeAsync(GetLoadBalancerPoolsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLoadBalancerPoolsResult>("cloudflare:index/getLoadBalancerPools:getLoadBalancerPools", args ?? new GetLoadBalancerPoolsArgs(), options.WithDefaults());

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
        ///     var exampleLoadBalancerPools = Cloudflare.GetLoadBalancerPools.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         Monitor = "monitor",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLoadBalancerPoolsResult> Invoke(GetLoadBalancerPoolsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLoadBalancerPoolsResult>("cloudflare:index/getLoadBalancerPools:getLoadBalancerPools", args ?? new GetLoadBalancerPoolsInvokeArgs(), options.WithDefaults());

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
        ///     var exampleLoadBalancerPools = Cloudflare.GetLoadBalancerPools.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         Monitor = "monitor",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLoadBalancerPoolsResult> Invoke(GetLoadBalancerPoolsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetLoadBalancerPoolsResult>("cloudflare:index/getLoadBalancerPools:getLoadBalancerPools", args ?? new GetLoadBalancerPoolsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLoadBalancerPoolsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier
        /// </summary>
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        [Input("maxItems")]
        public int? MaxItems { get; set; }

        /// <summary>
        /// The ID of the Monitor to use for checking the health of origins within this pool.
        /// </summary>
        [Input("monitor")]
        public string? Monitor { get; set; }

        public GetLoadBalancerPoolsArgs()
        {
        }
        public static new GetLoadBalancerPoolsArgs Empty => new GetLoadBalancerPoolsArgs();
    }

    public sealed class GetLoadBalancerPoolsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        [Input("maxItems")]
        public Input<int>? MaxItems { get; set; }

        /// <summary>
        /// The ID of the Monitor to use for checking the health of origins within this pool.
        /// </summary>
        [Input("monitor")]
        public Input<string>? Monitor { get; set; }

        public GetLoadBalancerPoolsInvokeArgs()
        {
        }
        public static new GetLoadBalancerPoolsInvokeArgs Empty => new GetLoadBalancerPoolsInvokeArgs();
    }


    [OutputType]
    public sealed class GetLoadBalancerPoolsResult
    {
        /// <summary>
        /// Identifier
        /// </summary>
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
        /// The ID of the Monitor to use for checking the health of origins within this pool.
        /// </summary>
        public readonly string? Monitor;
        /// <summary>
        /// The items returned by the data source
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancerPoolsResultResult> Results;

        [OutputConstructor]
        private GetLoadBalancerPoolsResult(
            string accountId,

            string id,

            int? maxItems,

            string? monitor,

            ImmutableArray<Outputs.GetLoadBalancerPoolsResultResult> results)
        {
            AccountId = accountId;
            Id = id;
            MaxItems = maxItems;
            Monitor = monitor;
            Results = results;
        }
    }
}
