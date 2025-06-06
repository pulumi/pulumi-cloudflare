// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustAccessPolicyExcludeServiceTokenArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of a Service Token.
        /// </summary>
        [Input("tokenId", required: true)]
        public Input<string> TokenId { get; set; } = null!;

        public ZeroTrustAccessPolicyExcludeServiceTokenArgs()
        {
        }
        public static new ZeroTrustAccessPolicyExcludeServiceTokenArgs Empty => new ZeroTrustAccessPolicyExcludeServiceTokenArgs();
    }
}
