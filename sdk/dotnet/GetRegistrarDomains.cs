// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetRegistrarDomains
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
        ///     var exampleRegistrarDomains = Cloudflare.GetRegistrarDomains.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetRegistrarDomainsResult> InvokeAsync(GetRegistrarDomainsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRegistrarDomainsResult>("cloudflare:index/getRegistrarDomains:getRegistrarDomains", args ?? new GetRegistrarDomainsArgs(), options.WithDefaults());

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
        ///     var exampleRegistrarDomains = Cloudflare.GetRegistrarDomains.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetRegistrarDomainsResult> Invoke(GetRegistrarDomainsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRegistrarDomainsResult>("cloudflare:index/getRegistrarDomains:getRegistrarDomains", args ?? new GetRegistrarDomainsInvokeArgs(), options.WithDefaults());

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
        ///     var exampleRegistrarDomains = Cloudflare.GetRegistrarDomains.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetRegistrarDomainsResult> Invoke(GetRegistrarDomainsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetRegistrarDomainsResult>("cloudflare:index/getRegistrarDomains:getRegistrarDomains", args ?? new GetRegistrarDomainsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRegistrarDomainsArgs : global::Pulumi.InvokeArgs
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

        public GetRegistrarDomainsArgs()
        {
        }
        public static new GetRegistrarDomainsArgs Empty => new GetRegistrarDomainsArgs();
    }

    public sealed class GetRegistrarDomainsInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetRegistrarDomainsInvokeArgs()
        {
        }
        public static new GetRegistrarDomainsInvokeArgs Empty => new GetRegistrarDomainsInvokeArgs();
    }


    [OutputType]
    public sealed class GetRegistrarDomainsResult
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
        /// The items returned by the data source
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRegistrarDomainsResultResult> Results;

        [OutputConstructor]
        private GetRegistrarDomainsResult(
            string accountId,

            string id,

            int? maxItems,

            ImmutableArray<Outputs.GetRegistrarDomainsResultResult> results)
        {
            AccountId = accountId;
            Id = id;
            MaxItems = maxItems;
            Results = results;
        }
    }
}
