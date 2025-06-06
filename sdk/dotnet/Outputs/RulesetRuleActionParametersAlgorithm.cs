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
    public sealed class RulesetRuleActionParametersAlgorithm
    {
        /// <summary>
        /// Name of compression algorithm to enable.
        /// Available values: "none", "auto", "default", "gzip", "brotli", "zstd".
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private RulesetRuleActionParametersAlgorithm(string? name)
        {
            Name = name;
        }
    }
}
