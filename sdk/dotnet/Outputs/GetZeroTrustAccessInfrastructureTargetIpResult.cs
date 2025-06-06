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
    public sealed class GetZeroTrustAccessInfrastructureTargetIpResult
    {
        /// <summary>
        /// The target's IPv4 address
        /// </summary>
        public readonly Outputs.GetZeroTrustAccessInfrastructureTargetIpIpv4Result Ipv4;
        /// <summary>
        /// The target's IPv6 address
        /// </summary>
        public readonly Outputs.GetZeroTrustAccessInfrastructureTargetIpIpv6Result Ipv6;

        [OutputConstructor]
        private GetZeroTrustAccessInfrastructureTargetIpResult(
            Outputs.GetZeroTrustAccessInfrastructureTargetIpIpv4Result ipv4,

            Outputs.GetZeroTrustAccessInfrastructureTargetIpIpv6Result ipv6)
        {
            Ipv4 = ipv4;
            Ipv6 = ipv6;
        }
    }
}
