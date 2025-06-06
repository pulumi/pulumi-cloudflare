// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class GetEmailRoutingDnsResultInfoResult
    {
        /// <summary>
        /// Total number of results for the requested service.
        /// </summary>
        public readonly double Count;
        /// <summary>
        /// Current page within paginated list of results.
        /// </summary>
        public readonly double Page;
        /// <summary>
        /// Number of results per page of results.
        /// </summary>
        public readonly double PerPage;
        /// <summary>
        /// Total results available without any search parameters.
        /// </summary>
        public readonly double TotalCount;

        [OutputConstructor]
        private GetEmailRoutingDnsResultInfoResult(
            double count,

            double page,

            double perPage,

            double totalCount)
        {
            Count = count;
            Page = page;
            PerPage = perPage;
            TotalCount = totalCount;
        }
    }
}
