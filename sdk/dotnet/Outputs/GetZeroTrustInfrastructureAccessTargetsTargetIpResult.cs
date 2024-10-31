// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class GetZeroTrustInfrastructureAccessTargetsTargetIpResult
    {
        /// <summary>
        /// The target's IPv4 address.
        /// </summary>
        public readonly Outputs.GetZeroTrustInfrastructureAccessTargetsTargetIpIpv4Result? Ipv4;
        /// <summary>
        /// The target's IPv6 address.
        /// </summary>
        public readonly Outputs.GetZeroTrustInfrastructureAccessTargetsTargetIpIpv6Result? Ipv6;

        [OutputConstructor]
        private GetZeroTrustInfrastructureAccessTargetsTargetIpResult(
            Outputs.GetZeroTrustInfrastructureAccessTargetsTargetIpIpv4Result? ipv4,

            Outputs.GetZeroTrustInfrastructureAccessTargetsTargetIpIpv6Result? ipv6)
        {
            Ipv4 = ipv4;
            Ipv6 = ipv6;
        }
    }
}