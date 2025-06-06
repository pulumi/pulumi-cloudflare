// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustAccessApplicationPolicyExcludeAuthContextGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ACID of an Authentication context.
        /// </summary>
        [Input("acId", required: true)]
        public Input<string> AcId { get; set; } = null!;

        /// <summary>
        /// The ID of an Authentication context.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The ID of your Azure identity provider.
        /// </summary>
        [Input("identityProviderId", required: true)]
        public Input<string> IdentityProviderId { get; set; } = null!;

        public ZeroTrustAccessApplicationPolicyExcludeAuthContextGetArgs()
        {
        }
        public static new ZeroTrustAccessApplicationPolicyExcludeAuthContextGetArgs Empty => new ZeroTrustAccessApplicationPolicyExcludeAuthContextGetArgs();
    }
}
