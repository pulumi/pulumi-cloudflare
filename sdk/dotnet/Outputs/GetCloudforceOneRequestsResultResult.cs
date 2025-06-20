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
    public sealed class GetCloudforceOneRequestsResultResult
    {
        /// <summary>
        /// Request completion time.
        /// </summary>
        public readonly string Completed;
        /// <summary>
        /// Request creation time.
        /// </summary>
        public readonly string Created;
        /// <summary>
        /// UUID.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Tokens for the request messages.
        /// </summary>
        public readonly int MessageTokens;
        /// <summary>
        /// Available values: "routine", "high", "urgent".
        /// </summary>
        public readonly string Priority;
        /// <summary>
        /// Readable Request ID.
        /// </summary>
        public readonly string ReadableId;
        /// <summary>
        /// Requested information from request.
        /// </summary>
        public readonly string Request;
        /// <summary>
        /// Request Status.
        /// Available values: "open", "accepted", "reported", "approved", "completed", "declined".
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Brief description of the request.
        /// </summary>
        public readonly string Summary;
        /// <summary>
        /// The CISA defined Traffic Light Protocol (TLP).
        /// Available values: "clear", "amber", "amber-strict", "green", "red".
        /// </summary>
        public readonly string Tlp;
        /// <summary>
        /// Tokens for the request.
        /// </summary>
        public readonly int Tokens;
        /// <summary>
        /// Request last updated time.
        /// </summary>
        public readonly string Updated;

        [OutputConstructor]
        private GetCloudforceOneRequestsResultResult(
            string completed,

            string created,

            string id,

            int messageTokens,

            string priority,

            string readableId,

            string request,

            string status,

            string summary,

            string tlp,

            int tokens,

            string updated)
        {
            Completed = completed;
            Created = created;
            Id = id;
            MessageTokens = messageTokens;
            Priority = priority;
            ReadableId = readableId;
            Request = request;
            Status = status;
            Summary = summary;
            Tlp = tlp;
            Tokens = tokens;
            Updated = updated;
        }
    }
}
