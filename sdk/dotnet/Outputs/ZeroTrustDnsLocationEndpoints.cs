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
    public sealed class ZeroTrustDnsLocationEndpoints
    {
        public readonly Outputs.ZeroTrustDnsLocationEndpointsDoh? Doh;
        public readonly Outputs.ZeroTrustDnsLocationEndpointsDot? Dot;
        public readonly Outputs.ZeroTrustDnsLocationEndpointsIpv4? Ipv4;
        public readonly Outputs.ZeroTrustDnsLocationEndpointsIpv6? Ipv6;

        [OutputConstructor]
        private ZeroTrustDnsLocationEndpoints(
            Outputs.ZeroTrustDnsLocationEndpointsDoh? doh,

            Outputs.ZeroTrustDnsLocationEndpointsDot? dot,

            Outputs.ZeroTrustDnsLocationEndpointsIpv4? ipv4,

            Outputs.ZeroTrustDnsLocationEndpointsIpv6? ipv6)
        {
            Doh = doh;
            Dot = dot;
            Ipv4 = ipv4;
            Ipv6 = ipv6;
        }
    }
}