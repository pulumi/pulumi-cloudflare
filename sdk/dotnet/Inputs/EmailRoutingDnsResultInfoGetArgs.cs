// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class EmailRoutingDnsResultInfoGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Total number of results for the requested service.
        /// </summary>
        [Input("count")]
        public Input<double>? Count { get; set; }

        /// <summary>
        /// Current page within paginated list of results.
        /// </summary>
        [Input("page")]
        public Input<double>? Page { get; set; }

        /// <summary>
        /// Number of results per page of results.
        /// </summary>
        [Input("perPage")]
        public Input<double>? PerPage { get; set; }

        /// <summary>
        /// Total results available without any search parameters.
        /// </summary>
        [Input("totalCount")]
        public Input<double>? TotalCount { get; set; }

        public EmailRoutingDnsResultInfoGetArgs()
        {
        }
        public static new EmailRoutingDnsResultInfoGetArgs Empty => new EmailRoutingDnsResultInfoGetArgs();
    }
}
