// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class GetWebAnalyticsSiteFilterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The property used to sort the list of results.
        /// Available values: "host", "created".
        /// </summary>
        [Input("orderBy")]
        public string? OrderBy { get; set; }

        public GetWebAnalyticsSiteFilterArgs()
        {
        }
        public static new GetWebAnalyticsSiteFilterArgs Empty => new GetWebAnalyticsSiteFilterArgs();
    }
}
