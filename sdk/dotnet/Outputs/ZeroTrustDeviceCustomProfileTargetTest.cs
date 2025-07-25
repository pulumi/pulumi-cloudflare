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
    public sealed class ZeroTrustDeviceCustomProfileTargetTest
    {
        /// <summary>
        /// The id of the DEX test targeting this policy.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The name of the DEX test targeting this policy.
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private ZeroTrustDeviceCustomProfileTargetTest(
            string? id,

            string? name)
        {
            Id = id;
            Name = name;
        }
    }
}
