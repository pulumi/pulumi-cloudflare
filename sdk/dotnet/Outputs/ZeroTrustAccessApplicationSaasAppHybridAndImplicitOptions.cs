// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class ZeroTrustAccessApplicationSaasAppHybridAndImplicitOptions
    {
        /// <summary>
        /// If true, the authorization endpoint will return an access token.
        /// </summary>
        public readonly bool? ReturnAccessTokenFromAuthorizationEndpoint;
        /// <summary>
        /// If true, the authorization endpoint will return an id token.
        /// </summary>
        public readonly bool? ReturnIdTokenFromAuthorizationEndpoint;

        [OutputConstructor]
        private ZeroTrustAccessApplicationSaasAppHybridAndImplicitOptions(
            bool? returnAccessTokenFromAuthorizationEndpoint,

            bool? returnIdTokenFromAuthorizationEndpoint)
        {
            ReturnAccessTokenFromAuthorizationEndpoint = returnAccessTokenFromAuthorizationEndpoint;
            ReturnIdTokenFromAuthorizationEndpoint = returnIdTokenFromAuthorizationEndpoint;
        }
    }
}
