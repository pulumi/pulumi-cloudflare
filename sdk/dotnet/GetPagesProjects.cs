// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetPagesProjects
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
        ///     var examplePagesProjects = Cloudflare.GetPagesProjects.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetPagesProjectsResult> InvokeAsync(GetPagesProjectsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPagesProjectsResult>("cloudflare:index/getPagesProjects:getPagesProjects", args ?? new GetPagesProjectsArgs(), options.WithDefaults());

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
        ///     var examplePagesProjects = Cloudflare.GetPagesProjects.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPagesProjectsResult> Invoke(GetPagesProjectsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPagesProjectsResult>("cloudflare:index/getPagesProjects:getPagesProjects", args ?? new GetPagesProjectsInvokeArgs(), options.WithDefaults());

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
        ///     var examplePagesProjects = Cloudflare.GetPagesProjects.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPagesProjectsResult> Invoke(GetPagesProjectsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetPagesProjectsResult>("cloudflare:index/getPagesProjects:getPagesProjects", args ?? new GetPagesProjectsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPagesProjectsArgs : global::Pulumi.InvokeArgs
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

        public GetPagesProjectsArgs()
        {
        }
        public static new GetPagesProjectsArgs Empty => new GetPagesProjectsArgs();
    }

    public sealed class GetPagesProjectsInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetPagesProjectsInvokeArgs()
        {
        }
        public static new GetPagesProjectsInvokeArgs Empty => new GetPagesProjectsInvokeArgs();
    }


    [OutputType]
    public sealed class GetPagesProjectsResult
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
        public readonly ImmutableArray<Outputs.GetPagesProjectsResultResult> Results;

        [OutputConstructor]
        private GetPagesProjectsResult(
            string accountId,

            string id,

            int? maxItems,

            ImmutableArray<Outputs.GetPagesProjectsResultResult> results)
        {
            AccountId = accountId;
            Id = id;
            MaxItems = maxItems;
            Results = results;
        }
    }
}
