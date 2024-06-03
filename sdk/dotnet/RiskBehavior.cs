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
    /// The [Risk Behavior](https://developers.cloudflare.com/cloudflare-one/insights/risk-score/) resource allows you to configure Cloudflare Risk Behaviors for an account.
    /// </summary>
    [CloudflareResourceType("cloudflare:index/riskBehavior:RiskBehavior")]
    public partial class RiskBehavior : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Zero Trust risk behaviors configured on this account
        /// </summary>
        [Output("behaviors")]
        public Output<ImmutableArray<Outputs.RiskBehaviorBehavior>> Behaviors { get; private set; } = null!;


        /// <summary>
        /// Create a RiskBehavior resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RiskBehavior(string name, RiskBehaviorArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/riskBehavior:RiskBehavior", name, args ?? new RiskBehaviorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RiskBehavior(string name, Input<string> id, RiskBehaviorState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/riskBehavior:RiskBehavior", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RiskBehavior resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RiskBehavior Get(string name, Input<string> id, RiskBehaviorState? state = null, CustomResourceOptions? options = null)
        {
            return new RiskBehavior(name, id, state, options);
        }
    }

    public sealed class RiskBehaviorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("behaviors")]
        private InputList<Inputs.RiskBehaviorBehaviorArgs>? _behaviors;

        /// <summary>
        /// Zero Trust risk behaviors configured on this account
        /// </summary>
        public InputList<Inputs.RiskBehaviorBehaviorArgs> Behaviors
        {
            get => _behaviors ?? (_behaviors = new InputList<Inputs.RiskBehaviorBehaviorArgs>());
            set => _behaviors = value;
        }

        public RiskBehaviorArgs()
        {
        }
        public static new RiskBehaviorArgs Empty => new RiskBehaviorArgs();
    }

    public sealed class RiskBehaviorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("behaviors")]
        private InputList<Inputs.RiskBehaviorBehaviorGetArgs>? _behaviors;

        /// <summary>
        /// Zero Trust risk behaviors configured on this account
        /// </summary>
        public InputList<Inputs.RiskBehaviorBehaviorGetArgs> Behaviors
        {
            get => _behaviors ?? (_behaviors = new InputList<Inputs.RiskBehaviorBehaviorGetArgs>());
            set => _behaviors = value;
        }

        public RiskBehaviorState()
        {
        }
        public static new RiskBehaviorState Empty => new RiskBehaviorState();
    }
}