// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustOrganizationCustomPagesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The uid of the custom page to use when a user is denied access after failing a non-identity rule.
        /// </summary>
        [Input("forbidden")]
        public Input<string>? Forbidden { get; set; }

        /// <summary>
        /// The uid of the custom page to use when a user is denied access.
        /// </summary>
        [Input("identityDenied")]
        public Input<string>? IdentityDenied { get; set; }

        public ZeroTrustOrganizationCustomPagesGetArgs()
        {
        }
        public static new ZeroTrustOrganizationCustomPagesGetArgs Empty => new ZeroTrustOrganizationCustomPagesGetArgs();
    }
}
