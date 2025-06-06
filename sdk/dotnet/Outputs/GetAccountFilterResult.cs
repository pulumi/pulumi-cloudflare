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
    public sealed class GetAccountFilterResult
    {
        /// <summary>
        /// Direction to order results.
        /// Available values: "asc", "desc".
        /// </summary>
        public readonly string? Direction;
        /// <summary>
        /// Name of the account.
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private GetAccountFilterResult(
            string? direction,

            string? name)
        {
            Direction = direction;
            Name = name;
        }
    }
}
