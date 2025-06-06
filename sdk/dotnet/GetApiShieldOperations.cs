// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetApiShieldOperations
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
        ///     var exampleApiShieldOperations = Cloudflare.GetApiShieldOperations.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         Direction = "desc",
        ///         Endpoint = "/api/v1",
        ///         Features = new[]
        ///         {
        ///             "thresholds",
        ///         },
        ///         Hosts = new[]
        ///         {
        ///             "api.cloudflare.com",
        ///         },
        ///         Methods = new[]
        ///         {
        ///             "GET",
        ///         },
        ///         Order = "method",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetApiShieldOperationsResult> InvokeAsync(GetApiShieldOperationsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApiShieldOperationsResult>("cloudflare:index/getApiShieldOperations:getApiShieldOperations", args ?? new GetApiShieldOperationsArgs(), options.WithDefaults());

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
        ///     var exampleApiShieldOperations = Cloudflare.GetApiShieldOperations.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         Direction = "desc",
        ///         Endpoint = "/api/v1",
        ///         Features = new[]
        ///         {
        ///             "thresholds",
        ///         },
        ///         Hosts = new[]
        ///         {
        ///             "api.cloudflare.com",
        ///         },
        ///         Methods = new[]
        ///         {
        ///             "GET",
        ///         },
        ///         Order = "method",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetApiShieldOperationsResult> Invoke(GetApiShieldOperationsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApiShieldOperationsResult>("cloudflare:index/getApiShieldOperations:getApiShieldOperations", args ?? new GetApiShieldOperationsInvokeArgs(), options.WithDefaults());

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
        ///     var exampleApiShieldOperations = Cloudflare.GetApiShieldOperations.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         Direction = "desc",
        ///         Endpoint = "/api/v1",
        ///         Features = new[]
        ///         {
        ///             "thresholds",
        ///         },
        ///         Hosts = new[]
        ///         {
        ///             "api.cloudflare.com",
        ///         },
        ///         Methods = new[]
        ///         {
        ///             "GET",
        ///         },
        ///         Order = "method",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetApiShieldOperationsResult> Invoke(GetApiShieldOperationsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetApiShieldOperationsResult>("cloudflare:index/getApiShieldOperations:getApiShieldOperations", args ?? new GetApiShieldOperationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApiShieldOperationsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Direction to order results.
        /// Available values: "asc", "desc".
        /// </summary>
        [Input("direction")]
        public string? Direction { get; set; }

        /// <summary>
        /// Filter results to only include endpoints containing this pattern.
        /// </summary>
        [Input("endpoint")]
        public string? Endpoint { get; set; }

        [Input("features")]
        private List<string>? _features;

        /// <summary>
        /// Add feature(s) to the results. The feature name that is given here corresponds to the resulting feature object. Have a look at the top-level object description for more details on the specific meaning.
        /// </summary>
        public List<string> Features
        {
            get => _features ?? (_features = new List<string>());
            set => _features = value;
        }

        [Input("hosts")]
        private List<string>? _hosts;

        /// <summary>
        /// Filter results to only include the specified hosts.
        /// </summary>
        public List<string> Hosts
        {
            get => _hosts ?? (_hosts = new List<string>());
            set => _hosts = value;
        }

        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        [Input("maxItems")]
        public int? MaxItems { get; set; }

        [Input("methods")]
        private List<string>? _methods;

        /// <summary>
        /// Filter results to only include the specified HTTP methods.
        /// </summary>
        public List<string> Methods
        {
            get => _methods ?? (_methods = new List<string>());
            set => _methods = value;
        }

        /// <summary>
        /// Field to order by. When requesting a feature, the feature keys are available for ordering as well, e.g., `thresholds.suggested_threshold`.
        /// Available values: "method", "host", "endpoint", "thresholds.$key".
        /// </summary>
        [Input("order")]
        public string? Order { get; set; }

        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public string ZoneId { get; set; } = null!;

        public GetApiShieldOperationsArgs()
        {
        }
        public static new GetApiShieldOperationsArgs Empty => new GetApiShieldOperationsArgs();
    }

    public sealed class GetApiShieldOperationsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Direction to order results.
        /// Available values: "asc", "desc".
        /// </summary>
        [Input("direction")]
        public Input<string>? Direction { get; set; }

        /// <summary>
        /// Filter results to only include endpoints containing this pattern.
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        [Input("features")]
        private InputList<string>? _features;

        /// <summary>
        /// Add feature(s) to the results. The feature name that is given here corresponds to the resulting feature object. Have a look at the top-level object description for more details on the specific meaning.
        /// </summary>
        public InputList<string> Features
        {
            get => _features ?? (_features = new InputList<string>());
            set => _features = value;
        }

        [Input("hosts")]
        private InputList<string>? _hosts;

        /// <summary>
        /// Filter results to only include the specified hosts.
        /// </summary>
        public InputList<string> Hosts
        {
            get => _hosts ?? (_hosts = new InputList<string>());
            set => _hosts = value;
        }

        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        [Input("maxItems")]
        public Input<int>? MaxItems { get; set; }

        [Input("methods")]
        private InputList<string>? _methods;

        /// <summary>
        /// Filter results to only include the specified HTTP methods.
        /// </summary>
        public InputList<string> Methods
        {
            get => _methods ?? (_methods = new InputList<string>());
            set => _methods = value;
        }

        /// <summary>
        /// Field to order by. When requesting a feature, the feature keys are available for ordering as well, e.g., `thresholds.suggested_threshold`.
        /// Available values: "method", "host", "endpoint", "thresholds.$key".
        /// </summary>
        [Input("order")]
        public Input<string>? Order { get; set; }

        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public GetApiShieldOperationsInvokeArgs()
        {
        }
        public static new GetApiShieldOperationsInvokeArgs Empty => new GetApiShieldOperationsInvokeArgs();
    }


    [OutputType]
    public sealed class GetApiShieldOperationsResult
    {
        /// <summary>
        /// Direction to order results.
        /// Available values: "asc", "desc".
        /// </summary>
        public readonly string? Direction;
        /// <summary>
        /// Filter results to only include endpoints containing this pattern.
        /// </summary>
        public readonly string? Endpoint;
        /// <summary>
        /// Add feature(s) to the results. The feature name that is given here corresponds to the resulting feature object. Have a look at the top-level object description for more details on the specific meaning.
        /// </summary>
        public readonly ImmutableArray<string> Features;
        /// <summary>
        /// Filter results to only include the specified hosts.
        /// </summary>
        public readonly ImmutableArray<string> Hosts;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        public readonly int? MaxItems;
        /// <summary>
        /// Filter results to only include the specified HTTP methods.
        /// </summary>
        public readonly ImmutableArray<string> Methods;
        /// <summary>
        /// Field to order by. When requesting a feature, the feature keys are available for ordering as well, e.g., `thresholds.suggested_threshold`.
        /// Available values: "method", "host", "endpoint", "thresholds.$key".
        /// </summary>
        public readonly string? Order;
        /// <summary>
        /// The items returned by the data source
        /// </summary>
        public readonly ImmutableArray<Outputs.GetApiShieldOperationsResultResult> Results;
        /// <summary>
        /// Identifier.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetApiShieldOperationsResult(
            string? direction,

            string? endpoint,

            ImmutableArray<string> features,

            ImmutableArray<string> hosts,

            string id,

            int? maxItems,

            ImmutableArray<string> methods,

            string? order,

            ImmutableArray<Outputs.GetApiShieldOperationsResultResult> results,

            string zoneId)
        {
            Direction = direction;
            Endpoint = endpoint;
            Features = features;
            Hosts = hosts;
            Id = id;
            MaxItems = maxItems;
            Methods = methods;
            Order = order;
            Results = results;
            ZoneId = zoneId;
        }
    }
}
