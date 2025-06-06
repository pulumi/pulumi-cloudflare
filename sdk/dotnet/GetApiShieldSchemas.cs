// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetApiShieldSchemas
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
        ///     var exampleApiShieldSchemas = Cloudflare.GetApiShieldSchemas.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         ValidationEnabled = true,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetApiShieldSchemasResult> InvokeAsync(GetApiShieldSchemasArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApiShieldSchemasResult>("cloudflare:index/getApiShieldSchemas:getApiShieldSchemas", args ?? new GetApiShieldSchemasArgs(), options.WithDefaults());

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
        ///     var exampleApiShieldSchemas = Cloudflare.GetApiShieldSchemas.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         ValidationEnabled = true,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetApiShieldSchemasResult> Invoke(GetApiShieldSchemasInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApiShieldSchemasResult>("cloudflare:index/getApiShieldSchemas:getApiShieldSchemas", args ?? new GetApiShieldSchemasInvokeArgs(), options.WithDefaults());

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
        ///     var exampleApiShieldSchemas = Cloudflare.GetApiShieldSchemas.Invoke(new()
        ///     {
        ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
        ///         ValidationEnabled = true,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetApiShieldSchemasResult> Invoke(GetApiShieldSchemasInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetApiShieldSchemasResult>("cloudflare:index/getApiShieldSchemas:getApiShieldSchemas", args ?? new GetApiShieldSchemasInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApiShieldSchemasArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        [Input("maxItems")]
        public int? MaxItems { get; set; }

        /// <summary>
        /// Omit the source-files of schemas and only retrieve their meta-data.
        /// </summary>
        [Input("omitSource")]
        public bool? OmitSource { get; set; }

        /// <summary>
        /// Flag whether schema is enabled for validation.
        /// </summary>
        [Input("validationEnabled")]
        public bool? ValidationEnabled { get; set; }

        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public string ZoneId { get; set; } = null!;

        public GetApiShieldSchemasArgs()
        {
        }
        public static new GetApiShieldSchemasArgs Empty => new GetApiShieldSchemasArgs();
    }

    public sealed class GetApiShieldSchemasInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        [Input("maxItems")]
        public Input<int>? MaxItems { get; set; }

        /// <summary>
        /// Omit the source-files of schemas and only retrieve their meta-data.
        /// </summary>
        [Input("omitSource")]
        public Input<bool>? OmitSource { get; set; }

        /// <summary>
        /// Flag whether schema is enabled for validation.
        /// </summary>
        [Input("validationEnabled")]
        public Input<bool>? ValidationEnabled { get; set; }

        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public GetApiShieldSchemasInvokeArgs()
        {
        }
        public static new GetApiShieldSchemasInvokeArgs Empty => new GetApiShieldSchemasInvokeArgs();
    }


    [OutputType]
    public sealed class GetApiShieldSchemasResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Max items to fetch, default: 1000
        /// </summary>
        public readonly int? MaxItems;
        /// <summary>
        /// Omit the source-files of schemas and only retrieve their meta-data.
        /// </summary>
        public readonly bool OmitSource;
        /// <summary>
        /// The items returned by the data source
        /// </summary>
        public readonly ImmutableArray<Outputs.GetApiShieldSchemasResultResult> Results;
        /// <summary>
        /// Flag whether schema is enabled for validation.
        /// </summary>
        public readonly bool? ValidationEnabled;
        /// <summary>
        /// Identifier.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetApiShieldSchemasResult(
            string id,

            int? maxItems,

            bool omitSource,

            ImmutableArray<Outputs.GetApiShieldSchemasResultResult> results,

            bool? validationEnabled,

            string zoneId)
        {
            Id = id;
            MaxItems = maxItems;
            OmitSource = omitSource;
            Results = results;
            ValidationEnabled = validationEnabled;
            ZoneId = zoneId;
        }
    }
}
