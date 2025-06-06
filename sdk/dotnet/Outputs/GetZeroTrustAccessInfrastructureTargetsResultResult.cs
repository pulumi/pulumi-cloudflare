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
    public sealed class GetZeroTrustAccessInfrastructureTargetsResultResult
    {
        /// <summary>
        /// Date and time at which the target was created
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// A non-unique field that refers to a target
        /// </summary>
        public readonly string Hostname;
        /// <summary>
        /// Target identifier
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The IPv4/IPv6 address that identifies where to reach a target
        /// </summary>
        public readonly Outputs.GetZeroTrustAccessInfrastructureTargetsResultIpResult Ip;
        /// <summary>
        /// Date and time at which the target was modified
        /// </summary>
        public readonly string ModifiedAt;

        [OutputConstructor]
        private GetZeroTrustAccessInfrastructureTargetsResultResult(
            string createdAt,

            string hostname,

            string id,

            Outputs.GetZeroTrustAccessInfrastructureTargetsResultIpResult ip,

            string modifiedAt)
        {
            CreatedAt = createdAt;
            Hostname = hostname;
            Id = id;
            Ip = ip;
            ModifiedAt = modifiedAt;
        }
    }
}
