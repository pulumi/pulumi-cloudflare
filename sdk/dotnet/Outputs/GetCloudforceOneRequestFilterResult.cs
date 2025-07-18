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
    public sealed class GetCloudforceOneRequestFilterResult
    {
        /// <summary>
        /// Retrieve requests completed after this time.
        /// </summary>
        public readonly string? CompletedAfter;
        /// <summary>
        /// Retrieve requests completed before this time.
        /// </summary>
        public readonly string? CompletedBefore;
        /// <summary>
        /// Retrieve requests created after this time.
        /// </summary>
        public readonly string? CreatedAfter;
        /// <summary>
        /// Retrieve requests created before this time.
        /// </summary>
        public readonly string? CreatedBefore;
        /// <summary>
        /// Page number of results.
        /// </summary>
        public readonly int Page;
        /// <summary>
        /// Number of results per page.
        /// </summary>
        public readonly int PerPage;
        /// <summary>
        /// Requested information from request.
        /// </summary>
        public readonly string? RequestType;
        /// <summary>
        /// Field to sort results by.
        /// </summary>
        public readonly string? SortBy;
        /// <summary>
        /// Sort order (asc or desc).
        /// Available values: "asc", "desc".
        /// </summary>
        public readonly string? SortOrder;
        /// <summary>
        /// Request Status.
        /// Available values: "open", "accepted", "reported", "approved", "completed", "declined".
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private GetCloudforceOneRequestFilterResult(
            string? completedAfter,

            string? completedBefore,

            string? createdAfter,

            string? createdBefore,

            int page,

            int perPage,

            string? requestType,

            string? sortBy,

            string? sortOrder,

            string? status)
        {
            CompletedAfter = completedAfter;
            CompletedBefore = completedBefore;
            CreatedAfter = createdAfter;
            CreatedBefore = createdBefore;
            Page = page;
            PerPage = perPage;
            RequestType = requestType;
            SortBy = sortBy;
            SortOrder = sortOrder;
            Status = status;
        }
    }
}
