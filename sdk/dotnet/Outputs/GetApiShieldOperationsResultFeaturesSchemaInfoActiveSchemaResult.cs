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
    public sealed class GetApiShieldOperationsResultFeaturesSchemaInfoActiveSchemaResult
    {
        public readonly string CreatedAt;
        /// <summary>
        /// UUID.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// True if schema is Cloudflare-provided.
        /// </summary>
        public readonly bool IsLearned;
        /// <summary>
        /// Schema file name.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetApiShieldOperationsResultFeaturesSchemaInfoActiveSchemaResult(
            string createdAt,

            string id,

            bool isLearned,

            string name)
        {
            CreatedAt = createdAt;
            Id = id;
            IsLearned = isLearned;
            Name = name;
        }
    }
}
