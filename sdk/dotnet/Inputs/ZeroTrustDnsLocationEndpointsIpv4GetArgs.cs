// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustDnsLocationEndpointsIpv4GetArgs : global::Pulumi.ResourceArgs
    {
        [Input("authenticationEnabled")]
        public Input<bool>? AuthenticationEnabled { get; set; }

        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public ZeroTrustDnsLocationEndpointsIpv4GetArgs()
        {
        }
        public static new ZeroTrustDnsLocationEndpointsIpv4GetArgs Empty => new ZeroTrustDnsLocationEndpointsIpv4GetArgs();
    }
}