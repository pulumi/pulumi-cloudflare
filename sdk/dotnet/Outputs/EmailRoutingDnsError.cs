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
    public sealed class EmailRoutingDnsError
    {
        public readonly int? Code;
        public readonly string? DocumentationUrl;
        public readonly string? Message;
        public readonly Outputs.EmailRoutingDnsErrorSource? Source;

        [OutputConstructor]
        private EmailRoutingDnsError(
            int? code,

            string? documentationUrl,

            string? message,

            Outputs.EmailRoutingDnsErrorSource? source)
        {
            Code = code;
            DocumentationUrl = documentationUrl;
            Message = message;
            Source = source;
        }
    }
}
