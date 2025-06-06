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
    ///     var exampleZeroTrustRiskBehavior = new Cloudflare.ZeroTrustRiskBehavior("example_zero_trust_risk_behavior", new()
    ///     {
    ///         AccountId = "account_id",
    ///         Behaviors = 
    ///         {
    ///             { "foo", new Cloudflare.Inputs.ZeroTrustRiskBehaviorBehaviorsArgs
    ///             {
    ///                 Enabled = true,
    ///                 RiskLevel = "low",
    ///             } },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [Obsolete(@"cloudflare.index/riskbehavior.RiskBehavior has been deprecated in favor of cloudflare.index/zerotrustriskbehavior.ZeroTrustRiskBehavior")]
    [CloudflareResourceType("cloudflare:index/riskBehavior:RiskBehavior")]
    public partial class RiskBehavior : global::Pulumi.CustomResource
    {
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        [Output("behaviors")]
        public Output<ImmutableDictionary<string, Outputs.RiskBehaviorBehaviors>> Behaviors { get; private set; } = null!;


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
                Aliases =
                {
                    new global::Pulumi.Alias { Type = "cloudflare:index/riskBehavior:RiskBehavior" },
                },
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
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("behaviors", required: true)]
        private InputMap<Inputs.RiskBehaviorBehaviorsArgs>? _behaviors;
        public InputMap<Inputs.RiskBehaviorBehaviorsArgs> Behaviors
        {
            get => _behaviors ?? (_behaviors = new InputMap<Inputs.RiskBehaviorBehaviorsArgs>());
            set => _behaviors = value;
        }

        public RiskBehaviorArgs()
        {
        }
        public static new RiskBehaviorArgs Empty => new RiskBehaviorArgs();
    }

    public sealed class RiskBehaviorState : global::Pulumi.ResourceArgs
    {
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("behaviors")]
        private InputMap<Inputs.RiskBehaviorBehaviorsGetArgs>? _behaviors;
        public InputMap<Inputs.RiskBehaviorBehaviorsGetArgs> Behaviors
        {
            get => _behaviors ?? (_behaviors = new InputMap<Inputs.RiskBehaviorBehaviorsGetArgs>());
            set => _behaviors = value;
        }

        public RiskBehaviorState()
        {
        }
        public static new RiskBehaviorState Empty => new RiskBehaviorState();
    }
}
