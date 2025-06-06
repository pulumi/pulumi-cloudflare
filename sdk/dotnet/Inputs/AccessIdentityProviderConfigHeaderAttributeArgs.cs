// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessIdentityProviderConfigHeaderAttributeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// attribute name from the IDP
        /// </summary>
        [Input("attributeName")]
        public Input<string>? AttributeName { get; set; }

        /// <summary>
        /// header that will be added on the request to the origin
        /// </summary>
        [Input("headerName")]
        public Input<string>? HeaderName { get; set; }

        public AccessIdentityProviderConfigHeaderAttributeArgs()
        {
        }
        public static new AccessIdentityProviderConfigHeaderAttributeArgs Empty => new AccessIdentityProviderConfigHeaderAttributeArgs();
    }
}
