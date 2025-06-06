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
    public sealed class AccessApplicationPolicyExcludeAuthContext
    {
        /// <summary>
        /// The ACID of an Authentication context.
        /// </summary>
        public readonly string AcId;
        /// <summary>
        /// The ID of an Authentication context.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of your Azure identity provider.
        /// </summary>
        public readonly string IdentityProviderId;

        [OutputConstructor]
        private AccessApplicationPolicyExcludeAuthContext(
            string acId,

            string id,

            string identityProviderId)
        {
            AcId = acId;
            Id = id;
            IdentityProviderId = identityProviderId;
        }
    }
}
