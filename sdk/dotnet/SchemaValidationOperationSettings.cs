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
    ///     var exampleSchemaValidationOperationSettings = new Cloudflare.SchemaValidationOperationSettings("example_schema_validation_operation_settings", new()
    ///     {
    ///         ZoneId = "023e105f4ecef8ad9ca31a8372d0c353",
    ///         OperationId = "f174e90a-fafe-4643-bbbc-4a0ed4fc8415",
    ///         MitigationAction = "block",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/schemaValidationOperationSettings:SchemaValidationOperationSettings")]
    public partial class SchemaValidationOperationSettings : global::Pulumi.CustomResource
    {
        /// <summary>
        /// When set, this applies a mitigation action to this operation - `"log"` - log request when request does not conform to
        /// schema for this operation - `"block"` - deny access to the site when request does not conform to schema for this
        /// operation - `"none"` - will skip mitigation for this operation - `null` - clears any mitigation action Available values:
        /// "log", "block", "none".
        /// </summary>
        [Output("mitigationAction")]
        public Output<string> MitigationAction { get; private set; } = null!;

        /// <summary>
        /// UUID.
        /// </summary>
        [Output("operationId")]
        public Output<string> OperationId { get; private set; } = null!;

        /// <summary>
        /// Identifier.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a SchemaValidationOperationSettings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SchemaValidationOperationSettings(string name, SchemaValidationOperationSettingsArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/schemaValidationOperationSettings:SchemaValidationOperationSettings", name, args ?? new SchemaValidationOperationSettingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SchemaValidationOperationSettings(string name, Input<string> id, SchemaValidationOperationSettingsState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/schemaValidationOperationSettings:SchemaValidationOperationSettings", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SchemaValidationOperationSettings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SchemaValidationOperationSettings Get(string name, Input<string> id, SchemaValidationOperationSettingsState? state = null, CustomResourceOptions? options = null)
        {
            return new SchemaValidationOperationSettings(name, id, state, options);
        }
    }

    public sealed class SchemaValidationOperationSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When set, this applies a mitigation action to this operation - `"log"` - log request when request does not conform to
        /// schema for this operation - `"block"` - deny access to the site when request does not conform to schema for this
        /// operation - `"none"` - will skip mitigation for this operation - `null` - clears any mitigation action Available values:
        /// "log", "block", "none".
        /// </summary>
        [Input("mitigationAction", required: true)]
        public Input<string> MitigationAction { get; set; } = null!;

        /// <summary>
        /// UUID.
        /// </summary>
        [Input("operationId", required: true)]
        public Input<string> OperationId { get; set; } = null!;

        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public SchemaValidationOperationSettingsArgs()
        {
        }
        public static new SchemaValidationOperationSettingsArgs Empty => new SchemaValidationOperationSettingsArgs();
    }

    public sealed class SchemaValidationOperationSettingsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When set, this applies a mitigation action to this operation - `"log"` - log request when request does not conform to
        /// schema for this operation - `"block"` - deny access to the site when request does not conform to schema for this
        /// operation - `"none"` - will skip mitigation for this operation - `null` - clears any mitigation action Available values:
        /// "log", "block", "none".
        /// </summary>
        [Input("mitigationAction")]
        public Input<string>? MitigationAction { get; set; }

        /// <summary>
        /// UUID.
        /// </summary>
        [Input("operationId")]
        public Input<string>? OperationId { get; set; }

        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public SchemaValidationOperationSettingsState()
        {
        }
        public static new SchemaValidationOperationSettingsState Empty => new SchemaValidationOperationSettingsState();
    }
}
