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
    public sealed class GetEmailRoutingDnsErrorResult
    {
        public readonly int Code;
        public readonly string DocumentationUrl;
        public readonly string Message;
        public readonly Outputs.GetEmailRoutingDnsErrorSourceResult Source;

        [OutputConstructor]
        private GetEmailRoutingDnsErrorResult(
            int code,

            string documentationUrl,

            string message,

            Outputs.GetEmailRoutingDnsErrorSourceResult source)
        {
            Code = code;
            DocumentationUrl = documentationUrl;
            Message = message;
            Source = source;
        }
    }
}
