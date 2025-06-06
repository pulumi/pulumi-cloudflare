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
    public sealed class WaitingRoomRulesRule
    {
        /// <summary>
        /// The action to take when the expression matches.
        /// Available values: "bypass*waiting*room".
        /// </summary>
        public readonly string Action;
        /// <summary>
        /// The description of the rule.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// When set to true, the rule is enabled.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Criteria defining when there is a match for the current rule.
        /// </summary>
        public readonly string Expression;

        [OutputConstructor]
        private WaitingRoomRulesRule(
            string action,

            string? description,

            bool? enabled,

            string expression)
        {
            Action = action;
            Description = description;
            Enabled = enabled;
            Expression = expression;
        }
    }
}
