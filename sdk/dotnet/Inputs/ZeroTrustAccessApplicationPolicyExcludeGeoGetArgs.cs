// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustAccessApplicationPolicyExcludeGeoGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The country code that should be matched.
        /// </summary>
        [Input("countryCode", required: true)]
        public Input<string> CountryCode { get; set; } = null!;

        public ZeroTrustAccessApplicationPolicyExcludeGeoGetArgs()
        {
        }
        public static new ZeroTrustAccessApplicationPolicyExcludeGeoGetArgs Empty => new ZeroTrustAccessApplicationPolicyExcludeGeoGetArgs();
    }
}
