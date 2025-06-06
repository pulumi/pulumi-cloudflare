// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustDnsLocationEndpointsArgs : global::Pulumi.ResourceArgs
    {
        [Input("doh")]
        public Input<Inputs.ZeroTrustDnsLocationEndpointsDohArgs>? Doh { get; set; }

        [Input("dot")]
        public Input<Inputs.ZeroTrustDnsLocationEndpointsDotArgs>? Dot { get; set; }

        [Input("ipv4")]
        public Input<Inputs.ZeroTrustDnsLocationEndpointsIpv4Args>? Ipv4 { get; set; }

        [Input("ipv6")]
        public Input<Inputs.ZeroTrustDnsLocationEndpointsIpv6Args>? Ipv6 { get; set; }

        public ZeroTrustDnsLocationEndpointsArgs()
        {
        }
        public static new ZeroTrustDnsLocationEndpointsArgs Empty => new ZeroTrustDnsLocationEndpointsArgs();
    }
}
