// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustDnsLocationEndpointsIpv6Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// True if the endpoint is enabled for this location.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("networks")]
        private InputList<Inputs.ZeroTrustDnsLocationEndpointsIpv6NetworkArgs>? _networks;

        /// <summary>
        /// A list of allowed source IPv6 network ranges for this endpoint. When empty, all source IPs are allowed. A non-empty list is only effective if the endpoint is enabled for this location.
        /// </summary>
        public InputList<Inputs.ZeroTrustDnsLocationEndpointsIpv6NetworkArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.ZeroTrustDnsLocationEndpointsIpv6NetworkArgs>());
            set => _networks = value;
        }

        public ZeroTrustDnsLocationEndpointsIpv6Args()
        {
        }
        public static new ZeroTrustDnsLocationEndpointsIpv6Args Empty => new ZeroTrustDnsLocationEndpointsIpv6Args();
    }
}
