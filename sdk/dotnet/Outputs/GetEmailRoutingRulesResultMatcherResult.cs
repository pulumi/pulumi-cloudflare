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
    public sealed class GetEmailRoutingRulesResultMatcherResult
    {
        /// <summary>
        /// Field for type matcher.
        /// Available values: "to".
        /// </summary>
        public readonly string Field;
        /// <summary>
        /// Type of matcher.
        /// Available values: "all", "literal".
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Value for matcher.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetEmailRoutingRulesResultMatcherResult(
            string field,

            string type,

            string value)
        {
            Field = field;
            Type = type;
            Value = value;
        }
    }
}
