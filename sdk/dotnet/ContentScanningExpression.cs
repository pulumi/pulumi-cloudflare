// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
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
    ///     var exampleContentScanningExpression = new Cloudflare.ContentScanningExpression("example_content_scanning_expression", new()
    ///     {
    ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
    ///         Bodies = new[]
    ///         {
    ///             new Cloudflare.Inputs.ContentScanningExpressionBodyArgs
    ///             {
    ///                 Payload = "lookup_json_string(http.request.body.raw, \"file\")",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/contentScanningExpression:ContentScanningExpression")]
    public partial class ContentScanningExpression : global::Pulumi.CustomResource
    {
        [Output("bodies")]
        public Output<ImmutableArray<Outputs.ContentScanningExpressionBody>> Bodies { get; private set; } = null!;

        /// <summary>
        /// Defines an identifier.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ContentScanningExpression resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ContentScanningExpression(string name, ContentScanningExpressionArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/contentScanningExpression:ContentScanningExpression", name, args ?? new ContentScanningExpressionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ContentScanningExpression(string name, Input<string> id, ContentScanningExpressionState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/contentScanningExpression:ContentScanningExpression", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ContentScanningExpression resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ContentScanningExpression Get(string name, Input<string> id, ContentScanningExpressionState? state = null, CustomResourceOptions? options = null)
        {
            return new ContentScanningExpression(name, id, state, options);
        }
    }

    public sealed class ContentScanningExpressionArgs : global::Pulumi.ResourceArgs
    {
        [Input("bodies", required: true)]
        private InputList<Inputs.ContentScanningExpressionBodyArgs>? _bodies;
        public InputList<Inputs.ContentScanningExpressionBodyArgs> Bodies
        {
            get => _bodies ?? (_bodies = new InputList<Inputs.ContentScanningExpressionBodyArgs>());
            set => _bodies = value;
        }

        /// <summary>
        /// Defines an identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public ContentScanningExpressionArgs()
        {
        }
        public static new ContentScanningExpressionArgs Empty => new ContentScanningExpressionArgs();
    }

    public sealed class ContentScanningExpressionState : global::Pulumi.ResourceArgs
    {
        [Input("bodies")]
        private InputList<Inputs.ContentScanningExpressionBodyGetArgs>? _bodies;
        public InputList<Inputs.ContentScanningExpressionBodyGetArgs> Bodies
        {
            get => _bodies ?? (_bodies = new InputList<Inputs.ContentScanningExpressionBodyGetArgs>());
            set => _bodies = value;
        }

        /// <summary>
        /// Defines an identifier.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ContentScanningExpressionState()
        {
        }
        public static new ContentScanningExpressionState Empty => new ContentScanningExpressionState();
    }
}
