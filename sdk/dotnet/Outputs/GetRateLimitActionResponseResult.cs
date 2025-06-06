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
    public sealed class GetRateLimitActionResponseResult
    {
        /// <summary>
        /// The response body to return. The value must conform to the configured content type.
        /// </summary>
        public readonly string Body;
        /// <summary>
        /// The content type of the body. Must be one of the following: `text/plain`, `text/xml`, or `application/json`.
        /// </summary>
        public readonly string ContentType;

        [OutputConstructor]
        private GetRateLimitActionResponseResult(
            string body,

            string contentType)
        {
            Body = body;
            ContentType = contentType;
        }
    }
}
