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
    public sealed class RulesetRuleActionParametersUri
    {
        /// <summary>
        /// Path portion rewrite.
        /// </summary>
        public readonly Outputs.RulesetRuleActionParametersUriPath? Path;
        /// <summary>
        /// Query portion rewrite.
        /// </summary>
        public readonly Outputs.RulesetRuleActionParametersUriQuery? Query;

        [OutputConstructor]
        private RulesetRuleActionParametersUri(
            Outputs.RulesetRuleActionParametersUriPath? path,

            Outputs.RulesetRuleActionParametersUriQuery? query)
        {
            Path = path;
            Query = query;
        }
    }
}
