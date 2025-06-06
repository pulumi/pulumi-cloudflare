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
    public sealed class GetRateLimitsResultMatchResult
    {
        public readonly ImmutableArray<Outputs.GetRateLimitsResultMatchHeaderResult> Headers;
        public readonly Outputs.GetRateLimitsResultMatchRequestResult Request;
        public readonly Outputs.GetRateLimitsResultMatchResponseResult Response;

        [OutputConstructor]
        private GetRateLimitsResultMatchResult(
            ImmutableArray<Outputs.GetRateLimitsResultMatchHeaderResult> headers,

            Outputs.GetRateLimitsResultMatchRequestResult request,

            Outputs.GetRateLimitsResultMatchResponseResult response)
        {
            Headers = headers;
            Request = request;
            Response = response;
        }
    }
}
