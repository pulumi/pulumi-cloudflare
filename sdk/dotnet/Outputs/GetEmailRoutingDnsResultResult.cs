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
    public sealed class GetEmailRoutingDnsResultResult
    {
        /// <summary>
        /// DNS record content.
        /// </summary>
        public readonly string Content;
        public readonly ImmutableArray<Outputs.GetEmailRoutingDnsResultErrorResult> Errors;
        /// <summary>
        /// DNS record name (or @ for the zone apex).
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Required for MX, SRV and URI records. Unused by other record types. Records with lower priorities are preferred.
        /// </summary>
        public readonly double Priority;
        public readonly ImmutableArray<Outputs.GetEmailRoutingDnsResultRecordResult> Records;
        /// <summary>
        /// Time to live, in seconds, of the DNS record. Must be between 60 and 86400, or 1 for 'automatic'.
        /// </summary>
        public readonly double Ttl;
        /// <summary>
        /// DNS record type.
        /// Available values: "A", "AAAA", "CNAME", "HTTPS", "TXT", "SRV", "LOC", "MX", "NS", "CERT", "DNSKEY", "DS", "NAPTR", "SMIMEA", "SSHFP", "SVCB", "TLSA", "URI".
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetEmailRoutingDnsResultResult(
            string content,

            ImmutableArray<Outputs.GetEmailRoutingDnsResultErrorResult> errors,

            string name,

            double priority,

            ImmutableArray<Outputs.GetEmailRoutingDnsResultRecordResult> records,

            double ttl,

            string type)
        {
            Content = content;
            Errors = errors;
            Name = name;
            Priority = priority;
            Records = records;
            Ttl = ttl;
            Type = type;
        }
    }
}
