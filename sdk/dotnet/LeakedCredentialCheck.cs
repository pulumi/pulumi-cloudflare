// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// Provides a Cloudflare Leaked Credential Check resource to be used for managing the status of the Cloudflare Leaked Credential detection within a specific zone.
    /// 
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
    ///     // Enable the Leaked Credentials Check detection
    ///     var example = new Cloudflare.LeakedCredentialCheck("example", new()
    ///     {
    ///         ZoneId = "399c6f4950c01a5a141b99ff7fbcbd8b",
    ///         Enabled = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/leakedCredentialCheck:LeakedCredentialCheck example &lt;zone_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/leakedCredentialCheck:LeakedCredentialCheck")]
    public partial class LeakedCredentialCheck : global::Pulumi.CustomResource
    {
        /// <summary>
        /// State of the Leaked Credential Check detection
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a LeakedCredentialCheck resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LeakedCredentialCheck(string name, LeakedCredentialCheckArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/leakedCredentialCheck:LeakedCredentialCheck", name, args ?? new LeakedCredentialCheckArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LeakedCredentialCheck(string name, Input<string> id, LeakedCredentialCheckState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/leakedCredentialCheck:LeakedCredentialCheck", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LeakedCredentialCheck resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LeakedCredentialCheck Get(string name, Input<string> id, LeakedCredentialCheckState? state = null, CustomResourceOptions? options = null)
        {
            return new LeakedCredentialCheck(name, id, state, options);
        }
    }

    public sealed class LeakedCredentialCheckArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// State of the Leaked Credential Check detection
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public LeakedCredentialCheckArgs()
        {
        }
        public static new LeakedCredentialCheckArgs Empty => new LeakedCredentialCheckArgs();
    }

    public sealed class LeakedCredentialCheckState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// State of the Leaked Credential Check detection
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public LeakedCredentialCheckState()
        {
        }
        public static new LeakedCredentialCheckState Empty => new LeakedCredentialCheckState();
    }
}