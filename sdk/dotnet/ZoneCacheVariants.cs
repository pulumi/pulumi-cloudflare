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
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/zoneCacheVariants:ZoneCacheVariants example '&lt;zone_id&gt;'
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/zoneCacheVariants:ZoneCacheVariants")]
    public partial class ZoneCacheVariants : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether the setting is editable
        /// </summary>
        [Output("editable")]
        public Output<bool> Editable { get; private set; } = null!;

        /// <summary>
        /// Last time this setting was modified.
        /// </summary>
        [Output("modifiedOn")]
        public Output<string> ModifiedOn { get; private set; } = null!;

        /// <summary>
        /// Value of the zone setting.
        /// </summary>
        [Output("value")]
        public Output<Outputs.ZoneCacheVariantsValue> Value { get; private set; } = null!;

        /// <summary>
        /// Identifier
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ZoneCacheVariants resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ZoneCacheVariants(string name, ZoneCacheVariantsArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/zoneCacheVariants:ZoneCacheVariants", name, args ?? new ZoneCacheVariantsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ZoneCacheVariants(string name, Input<string> id, ZoneCacheVariantsState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/zoneCacheVariants:ZoneCacheVariants", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ZoneCacheVariants resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ZoneCacheVariants Get(string name, Input<string> id, ZoneCacheVariantsState? state = null, CustomResourceOptions? options = null)
        {
            return new ZoneCacheVariants(name, id, state, options);
        }
    }

    public sealed class ZoneCacheVariantsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Value of the zone setting.
        /// </summary>
        [Input("value", required: true)]
        public Input<Inputs.ZoneCacheVariantsValueArgs> Value { get; set; } = null!;

        /// <summary>
        /// Identifier
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public ZoneCacheVariantsArgs()
        {
        }
        public static new ZoneCacheVariantsArgs Empty => new ZoneCacheVariantsArgs();
    }

    public sealed class ZoneCacheVariantsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the setting is editable
        /// </summary>
        [Input("editable")]
        public Input<bool>? Editable { get; set; }

        /// <summary>
        /// Last time this setting was modified.
        /// </summary>
        [Input("modifiedOn")]
        public Input<string>? ModifiedOn { get; set; }

        /// <summary>
        /// Value of the zone setting.
        /// </summary>
        [Input("value")]
        public Input<Inputs.ZoneCacheVariantsValueGetArgs>? Value { get; set; }

        /// <summary>
        /// Identifier
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ZoneCacheVariantsState()
        {
        }
        public static new ZoneCacheVariantsState Empty => new ZoneCacheVariantsState();
    }
}
