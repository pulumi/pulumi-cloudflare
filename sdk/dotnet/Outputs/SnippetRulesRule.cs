// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class SnippetRulesRule
    {
        /// <summary>
        /// Brief summary of the snippet rule and its intended use.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Whether the headers rule is active.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Criteria for an HTTP request to trigger the snippet rule. Uses the Firewall Rules expression language based on Wireshark display filters.
        /// </summary>
        public readonly string Expression;
        /// <summary>
        /// Name of the snippet invoked by this rule.
        /// </summary>
        public readonly string SnippetName;

        [OutputConstructor]
        private SnippetRulesRule(
            string? description,

            bool? enabled,

            string expression,

            string snippetName)
        {
            Description = description;
            Enabled = enabled;
            Expression = expression;
            SnippetName = snippetName;
        }
    }
}