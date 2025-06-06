// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class GetZeroTrustAccessGroupFilterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the group.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Search for groups by other listed query parameters.
        /// </summary>
        [Input("search")]
        public string? Search { get; set; }

        public GetZeroTrustAccessGroupFilterArgs()
        {
        }
        public static new GetZeroTrustAccessGroupFilterArgs Empty => new GetZeroTrustAccessGroupFilterArgs();
    }
}
