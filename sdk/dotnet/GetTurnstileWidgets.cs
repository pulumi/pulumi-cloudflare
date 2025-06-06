// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetTurnstileWidgets
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
        ///     var exampleTurnstileWidgets = Cloudflare.GetTurnstileWidgets.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         Direction = "asc",
        ///         Order = "id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetTurnstileWidgetsResult> InvokeAsync(GetTurnstileWidgetsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTurnstileWidgetsResult>("cloudflare:index/getTurnstileWidgets:getTurnstileWidgets", args ?? new GetTurnstileWidgetsArgs(), options.WithDefaults());

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
        ///     var exampleTurnstileWidgets = Cloudflare.GetTurnstileWidgets.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         Direction = "asc",
        ///         Order = "id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTurnstileWidgetsResult> Invoke(GetTurnstileWidgetsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTurnstileWidgetsResult>("cloudflare:index/getTurnstileWidgets:getTurnstileWidgets", args ?? new GetTurnstileWidgetsInvokeArgs(), options.WithDefaults());

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
        ///     var exampleTurnstileWidgets = Cloudflare.GetTurnstileWidgets.Invoke(new()
        ///     {
        ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         Direction = "asc",
        ///         Order = "id",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTurnstileWidgetsResult> Invoke(GetTurnstileWidgetsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTurnstileWidgetsResult>("cloudflare:index/getTurnstileWidgets:getTurnstileWidgets", args ?? new GetTurnstileWidgetsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTurnstileWidgetsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier
        /// </summary>
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        /// <summary>
        /// Direction to order widgets.
        /// Available values: "asc", "desc".
        /// </summary>
        [Input("direction")]
        public string? Direction { get; set; }

        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        [Input("maxItems")]
        public int? MaxItems { get; set; }

        /// <summary>
        /// Field to order widgets by.
        /// Available values: "id", "sitekey", "name", "created*on", "modified*on".
        /// </summary>
        [Input("order")]
        public string? Order { get; set; }

        public GetTurnstileWidgetsArgs()
        {
        }
        public static new GetTurnstileWidgetsArgs Empty => new GetTurnstileWidgetsArgs();
    }

    public sealed class GetTurnstileWidgetsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Direction to order widgets.
        /// Available values: "asc", "desc".
        /// </summary>
        [Input("direction")]
        public Input<string>? Direction { get; set; }

        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        [Input("maxItems")]
        public Input<int>? MaxItems { get; set; }

        /// <summary>
        /// Field to order widgets by.
        /// Available values: "id", "sitekey", "name", "created*on", "modified*on".
        /// </summary>
        [Input("order")]
        public Input<string>? Order { get; set; }

        public GetTurnstileWidgetsInvokeArgs()
        {
        }
        public static new GetTurnstileWidgetsInvokeArgs Empty => new GetTurnstileWidgetsInvokeArgs();
    }


    [OutputType]
    public sealed class GetTurnstileWidgetsResult
    {
        /// <summary>
        /// Identifier
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// Direction to order widgets.
        /// Available values: "asc", "desc".
        /// </summary>
        public readonly string? Direction;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        public readonly int? MaxItems;
        /// <summary>
        /// Field to order widgets by.
        /// Available values: "id", "sitekey", "name", "created*on", "modified*on".
        /// </summary>
        public readonly string? Order;
        /// <summary>
        /// The items returned by the data source
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTurnstileWidgetsResultResult> Results;

        [OutputConstructor]
        private GetTurnstileWidgetsResult(
            string accountId,

            string? direction,

            string id,

            int? maxItems,

            string? order,

            ImmutableArray<Outputs.GetTurnstileWidgetsResultResult> results)
        {
            AccountId = accountId;
            Direction = direction;
            Id = id;
            MaxItems = maxItems;
            Order = order;
            Results = results;
        }
    }
}
