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
    public sealed class GetRulesetRuleActionParametersCacheKeyCustomKeyQueryStringIncludeResult
    {
        /// <summary>
        /// Determines whether to include all query string parameters in the cache key.
        /// </summary>
        public readonly bool All;
        public readonly ImmutableArray<string> Lists;

        [OutputConstructor]
        private GetRulesetRuleActionParametersCacheKeyCustomKeyQueryStringIncludeResult(
            bool all,

            ImmutableArray<string> lists)
        {
            All = all;
            Lists = lists;
        }
    }
}
