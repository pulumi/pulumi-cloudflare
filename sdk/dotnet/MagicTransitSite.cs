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
    ///     var exampleMagicTransitSite = new Cloudflare.MagicTransitSite("example_magic_transit_site", new()
    ///     {
    ///         AccountId = "023e105f4ecef8ad9ca31a8372d0c353",
    ///         Name = "site_1",
    ///         ConnectorId = "ac60d3d0435248289d446cedd870bcf4",
    ///         Description = "description",
    ///         HaMode = true,
    ///         Location = new Cloudflare.Inputs.MagicTransitSiteLocationArgs
    ///         {
    ///             Lat = "37.6192",
    ///             Lon = "122.3816",
    ///         },
    ///         SecondaryConnectorId = "8d67040d3835dbcf46ce29da440dc482",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/magicTransitSite:MagicTransitSite example '&lt;account_id&gt;/&lt;site_id&gt;'
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/magicTransitSite:MagicTransitSite")]
    public partial class MagicTransitSite : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Identifier
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Magic Connector identifier tag.
        /// </summary>
        [Output("connectorId")]
        public Output<string?> ConnectorId { get; private set; } = null!;

        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Site high availability mode. If set to true, the site can have two connectors and runs in high availability mode.
        /// </summary>
        [Output("haMode")]
        public Output<bool?> HaMode { get; private set; } = null!;

        /// <summary>
        /// Location of site in latitude and longitude.
        /// </summary>
        [Output("location")]
        public Output<Outputs.MagicTransitSiteLocation?> Location { get; private set; } = null!;

        /// <summary>
        /// The name of the site.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Magic Connector identifier tag. Used when high availability mode is on.
        /// </summary>
        [Output("secondaryConnectorId")]
        public Output<string?> SecondaryConnectorId { get; private set; } = null!;


        /// <summary>
        /// Create a MagicTransitSite resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MagicTransitSite(string name, MagicTransitSiteArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/magicTransitSite:MagicTransitSite", name, args ?? new MagicTransitSiteArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MagicTransitSite(string name, Input<string> id, MagicTransitSiteState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/magicTransitSite:MagicTransitSite", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MagicTransitSite resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MagicTransitSite Get(string name, Input<string> id, MagicTransitSiteState? state = null, CustomResourceOptions? options = null)
        {
            return new MagicTransitSite(name, id, state, options);
        }
    }

    public sealed class MagicTransitSiteArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Magic Connector identifier tag.
        /// </summary>
        [Input("connectorId")]
        public Input<string>? ConnectorId { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Site high availability mode. If set to true, the site can have two connectors and runs in high availability mode.
        /// </summary>
        [Input("haMode")]
        public Input<bool>? HaMode { get; set; }

        /// <summary>
        /// Location of site in latitude and longitude.
        /// </summary>
        [Input("location")]
        public Input<Inputs.MagicTransitSiteLocationArgs>? Location { get; set; }

        /// <summary>
        /// The name of the site.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Magic Connector identifier tag. Used when high availability mode is on.
        /// </summary>
        [Input("secondaryConnectorId")]
        public Input<string>? SecondaryConnectorId { get; set; }

        public MagicTransitSiteArgs()
        {
        }
        public static new MagicTransitSiteArgs Empty => new MagicTransitSiteArgs();
    }

    public sealed class MagicTransitSiteState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Magic Connector identifier tag.
        /// </summary>
        [Input("connectorId")]
        public Input<string>? ConnectorId { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Site high availability mode. If set to true, the site can have two connectors and runs in high availability mode.
        /// </summary>
        [Input("haMode")]
        public Input<bool>? HaMode { get; set; }

        /// <summary>
        /// Location of site in latitude and longitude.
        /// </summary>
        [Input("location")]
        public Input<Inputs.MagicTransitSiteLocationGetArgs>? Location { get; set; }

        /// <summary>
        /// The name of the site.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Magic Connector identifier tag. Used when high availability mode is on.
        /// </summary>
        [Input("secondaryConnectorId")]
        public Input<string>? SecondaryConnectorId { get; set; }

        public MagicTransitSiteState()
        {
        }
        public static new MagicTransitSiteState Empty => new MagicTransitSiteState();
    }
}
