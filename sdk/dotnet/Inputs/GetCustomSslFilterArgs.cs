// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class GetCustomSslFilterInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to match all search requirements or at least one (any).
        /// Available values: "any", "all".
        /// </summary>
        [Input("match", required: true)]
        public Input<string> Match { get; set; } = null!;

        /// <summary>
        /// Status of the zone's custom SSL.
        /// Available values: "active", "expired", "deleted", "pending", "initializing".
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetCustomSslFilterInputArgs()
        {
        }
        public static new GetCustomSslFilterInputArgs Empty => new GetCustomSslFilterInputArgs();
    }
}
