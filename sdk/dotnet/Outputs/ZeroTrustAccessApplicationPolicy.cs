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
    public sealed class ZeroTrustAccessApplicationPolicy
    {
        /// <summary>
        /// The rules that define how users may connect to the targets secured by your application.
        /// </summary>
        public readonly Outputs.ZeroTrustAccessApplicationPolicyConnectionRules? ConnectionRules;
        /// <summary>
        /// The action Access will take if a user matches this policy. Infrastructure application policies can only use the Allow action.
        /// Available values: "allow", "deny", "non_identity", "bypass".
        /// </summary>
        public readonly string? Decision;
        /// <summary>
        /// Rules evaluated with a NOT logical operator. To match the policy, a user cannot meet any of the Exclude rules.
        /// </summary>
        public readonly ImmutableArray<Outputs.ZeroTrustAccessApplicationPolicyExclude> Excludes;
        /// <summary>
        /// The UUID of the policy
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules.
        /// </summary>
        public readonly ImmutableArray<Outputs.ZeroTrustAccessApplicationPolicyInclude> Includes;
        /// <summary>
        /// The name of the Access policy.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The order of execution for this policy. Must be unique for each policy within an app.
        /// </summary>
        public readonly int? Precedence;
        /// <summary>
        /// Rules evaluated with an AND logical operator. To match the policy, a user must meet all of the Require rules.
        /// </summary>
        public readonly ImmutableArray<Outputs.ZeroTrustAccessApplicationPolicyRequire> Requires;

        [OutputConstructor]
        private ZeroTrustAccessApplicationPolicy(
            Outputs.ZeroTrustAccessApplicationPolicyConnectionRules? connectionRules,

            string? decision,

            ImmutableArray<Outputs.ZeroTrustAccessApplicationPolicyExclude> excludes,

            string? id,

            ImmutableArray<Outputs.ZeroTrustAccessApplicationPolicyInclude> includes,

            string? name,

            int? precedence,

            ImmutableArray<Outputs.ZeroTrustAccessApplicationPolicyRequire> requires)
        {
            ConnectionRules = connectionRules;
            Decision = decision;
            Excludes = excludes;
            Id = id;
            Includes = includes;
            Name = name;
            Precedence = precedence;
            Requires = requires;
        }
    }
}
