// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccountSubscriptionRatePlanArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The currency applied to the rate plan subscription.
        /// </summary>
        [Input("currency")]
        public Input<string>? Currency { get; set; }

        /// <summary>
        /// Whether this rate plan is managed externally from Cloudflare.
        /// </summary>
        [Input("externallyManaged")]
        public Input<bool>? ExternallyManaged { get; set; }

        /// <summary>
        /// The ID of the rate plan.
        /// Available values: "free", "lite", "pro", "pro*plus", "business", "enterprise", "partners*free", "partners*pro", "partners*business", "partners_enterprise".
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Whether a rate plan is enterprise-based (or newly adopted term contract).
        /// </summary>
        [Input("isContract")]
        public Input<bool>? IsContract { get; set; }

        /// <summary>
        /// The full name of the rate plan.
        /// </summary>
        [Input("publicName")]
        public Input<string>? PublicName { get; set; }

        /// <summary>
        /// The scope that this rate plan applies to.
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        [Input("sets")]
        private InputList<string>? _sets;

        /// <summary>
        /// The list of sets this rate plan applies to.
        /// </summary>
        public InputList<string> Sets
        {
            get => _sets ?? (_sets = new InputList<string>());
            set => _sets = value;
        }

        public AccountSubscriptionRatePlanArgs()
        {
        }
        public static new AccountSubscriptionRatePlanArgs Empty => new AccountSubscriptionRatePlanArgs();
    }
}
