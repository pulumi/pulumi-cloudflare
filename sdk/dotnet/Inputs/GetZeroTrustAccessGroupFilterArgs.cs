// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class GetZeroTrustAccessGroupFilterInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Search for groups by other listed query parameters.
        /// </summary>
        [Input("search")]
        public Input<string>? Search { get; set; }

        public GetZeroTrustAccessGroupFilterInputArgs()
        {
        }
        public static new GetZeroTrustAccessGroupFilterInputArgs Empty => new GetZeroTrustAccessGroupFilterInputArgs();
    }
}
