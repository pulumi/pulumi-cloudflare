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
    /// Provides a Cloudflare Access Group resource. Access Groups are used
    /// in conjunction with Access Policies to restrict access to a
    /// particular resource based on group membership.
    /// 
    /// &gt; It's required that an `account_id` or `zone_id` is provided and in
    ///    most cases using either is fine. However, if you're using a scoped
    ///    access token, you must provide the argument that matches the token's
    ///    scope. For example, an access token that is scoped to the "example.com"
    ///    zone needs to use the `zone_id` argument.
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/zeroTrustAccessGroup:ZeroTrustAccessGroup example &lt;account_id&gt;/&lt;group_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/zeroTrustAccessGroup:ZeroTrustAccessGroup")]
    public partial class ZeroTrustAccessGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        [Output("excludes")]
        public Output<ImmutableArray<Outputs.ZeroTrustAccessGroupExclude>> Excludes { get; private set; } = null!;

        [Output("includes")]
        public Output<ImmutableArray<Outputs.ZeroTrustAccessGroupInclude>> Includes { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("requires")]
        public Output<ImmutableArray<Outputs.ZeroTrustAccessGroupRequire>> Requires { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ZeroTrustAccessGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ZeroTrustAccessGroup(string name, ZeroTrustAccessGroupArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/zeroTrustAccessGroup:ZeroTrustAccessGroup", name, args ?? new ZeroTrustAccessGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ZeroTrustAccessGroup(string name, Input<string> id, ZeroTrustAccessGroupState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/zeroTrustAccessGroup:ZeroTrustAccessGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ZeroTrustAccessGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ZeroTrustAccessGroup Get(string name, Input<string> id, ZeroTrustAccessGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new ZeroTrustAccessGroup(name, id, state, options);
        }
    }

    public sealed class ZeroTrustAccessGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("excludes")]
        private InputList<Inputs.ZeroTrustAccessGroupExcludeArgs>? _excludes;
        public InputList<Inputs.ZeroTrustAccessGroupExcludeArgs> Excludes
        {
            get => _excludes ?? (_excludes = new InputList<Inputs.ZeroTrustAccessGroupExcludeArgs>());
            set => _excludes = value;
        }

        [Input("includes", required: true)]
        private InputList<Inputs.ZeroTrustAccessGroupIncludeArgs>? _includes;
        public InputList<Inputs.ZeroTrustAccessGroupIncludeArgs> Includes
        {
            get => _includes ?? (_includes = new InputList<Inputs.ZeroTrustAccessGroupIncludeArgs>());
            set => _includes = value;
        }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("requires")]
        private InputList<Inputs.ZeroTrustAccessGroupRequireArgs>? _requires;
        public InputList<Inputs.ZeroTrustAccessGroupRequireArgs> Requires
        {
            get => _requires ?? (_requires = new InputList<Inputs.ZeroTrustAccessGroupRequireArgs>());
            set => _requires = value;
        }

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ZeroTrustAccessGroupArgs()
        {
        }
        public static new ZeroTrustAccessGroupArgs Empty => new ZeroTrustAccessGroupArgs();
    }

    public sealed class ZeroTrustAccessGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("excludes")]
        private InputList<Inputs.ZeroTrustAccessGroupExcludeGetArgs>? _excludes;
        public InputList<Inputs.ZeroTrustAccessGroupExcludeGetArgs> Excludes
        {
            get => _excludes ?? (_excludes = new InputList<Inputs.ZeroTrustAccessGroupExcludeGetArgs>());
            set => _excludes = value;
        }

        [Input("includes")]
        private InputList<Inputs.ZeroTrustAccessGroupIncludeGetArgs>? _includes;
        public InputList<Inputs.ZeroTrustAccessGroupIncludeGetArgs> Includes
        {
            get => _includes ?? (_includes = new InputList<Inputs.ZeroTrustAccessGroupIncludeGetArgs>());
            set => _includes = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("requires")]
        private InputList<Inputs.ZeroTrustAccessGroupRequireGetArgs>? _requires;
        public InputList<Inputs.ZeroTrustAccessGroupRequireGetArgs> Requires
        {
            get => _requires ?? (_requires = new InputList<Inputs.ZeroTrustAccessGroupRequireGetArgs>());
            set => _requires = value;
        }

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ZeroTrustAccessGroupState()
        {
        }
        public static new ZeroTrustAccessGroupState Empty => new ZeroTrustAccessGroupState();
    }
}