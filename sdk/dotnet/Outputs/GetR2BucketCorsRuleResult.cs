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
    public sealed class GetR2BucketCorsRuleResult
    {
        /// <summary>
        /// Object specifying allowed origins, methods and headers for this CORS rule.
        /// </summary>
        public readonly Outputs.GetR2BucketCorsRuleAllowedResult Allowed;
        /// <summary>
        /// Specifies the headers that can be exposed back, and accessed by, the JavaScript making the cross-origin request. If you need to access headers beyond the safelisted response headers, such as Content-Encoding or cf-cache-status, you must specify it here.
        /// </summary>
        public readonly ImmutableArray<string> ExposeHeaders;
        /// <summary>
        /// Identifier for this rule.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Specifies the amount of time (in seconds) browsers are allowed to cache CORS preflight responses. Browsers may limit this to 2 hours or less, even if the maximum value (86400) is specified.
        /// </summary>
        public readonly double MaxAgeSeconds;

        [OutputConstructor]
        private GetR2BucketCorsRuleResult(
            Outputs.GetR2BucketCorsRuleAllowedResult allowed,

            ImmutableArray<string> exposeHeaders,

            string id,

            double maxAgeSeconds)
        {
            Allowed = allowed;
            ExposeHeaders = exposeHeaders;
            Id = id;
            MaxAgeSeconds = maxAgeSeconds;
        }
    }
}
