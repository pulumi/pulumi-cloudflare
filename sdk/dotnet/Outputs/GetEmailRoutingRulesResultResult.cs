// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class GetEmailRoutingRulesResultResult
    {
        /// <summary>
        /// List actions patterns.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEmailRoutingRulesResultActionResult> Actions;
        /// <summary>
        /// Routing rule status.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Routing rule identifier.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Matching patterns to forward to your actions.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEmailRoutingRulesResultMatcherResult> Matchers;
        /// <summary>
        /// Routing rule name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Priority of the routing rule.
        /// </summary>
        public readonly double Priority;
        /// <summary>
        /// Routing rule tag. (Deprecated, replaced by routing rule identifier)
        /// </summary>
        public readonly string Tag;

        [OutputConstructor]
        private GetEmailRoutingRulesResultResult(
            ImmutableArray<Outputs.GetEmailRoutingRulesResultActionResult> actions,

            bool enabled,

            string id,

            ImmutableArray<Outputs.GetEmailRoutingRulesResultMatcherResult> matchers,

            string name,

            double priority,

            string tag)
        {
            Actions = actions;
            Enabled = enabled;
            Id = id;
            Matchers = matchers;
            Name = name;
            Priority = priority;
            Tag = tag;
        }
    }
}
