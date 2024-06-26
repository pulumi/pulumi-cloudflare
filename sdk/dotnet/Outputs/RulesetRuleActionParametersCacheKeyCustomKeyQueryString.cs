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
    public sealed class RulesetRuleActionParametersCacheKeyCustomKeyQueryString
    {
        /// <summary>
        /// List of query string parameters to exclude from the custom key.
        /// </summary>
        public readonly ImmutableArray<string> Excludes;
        /// <summary>
        /// List of query string parameters to include in the custom key.
        /// </summary>
        public readonly ImmutableArray<string> Includes;

        [OutputConstructor]
        private RulesetRuleActionParametersCacheKeyCustomKeyQueryString(
            ImmutableArray<string> excludes,

            ImmutableArray<string> includes)
        {
            Excludes = excludes;
            Includes = includes;
        }
    }
}
