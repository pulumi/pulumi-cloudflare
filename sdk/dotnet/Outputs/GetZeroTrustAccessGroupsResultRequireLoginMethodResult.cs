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
    public sealed class GetZeroTrustAccessGroupsResultRequireLoginMethodResult
    {
        /// <summary>
        /// The ID of an identity provider.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetZeroTrustAccessGroupsResultRequireLoginMethodResult(string id)
        {
            Id = id;
        }
    }
}
