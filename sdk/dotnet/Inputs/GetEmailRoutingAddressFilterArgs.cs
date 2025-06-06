// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class GetEmailRoutingAddressFilterInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Sorts results in an ascending or descending order.
        /// Available values: "asc", "desc".
        /// </summary>
        [Input("direction", required: true)]
        public Input<string> Direction { get; set; } = null!;

        /// <summary>
        /// Filter by verified destination addresses.
        /// </summary>
        [Input("verified", required: true)]
        public Input<bool> Verified { get; set; } = null!;

        public GetEmailRoutingAddressFilterInputArgs()
        {
        }
        public static new GetEmailRoutingAddressFilterInputArgs Empty => new GetEmailRoutingAddressFilterInputArgs();
    }
}
