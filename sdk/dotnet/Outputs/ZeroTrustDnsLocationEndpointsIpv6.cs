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
    public sealed class ZeroTrustDnsLocationEndpointsIpv6
    {
        /// <summary>
        /// True if the endpoint is enabled for this location.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// A list of allowed source IPv6 network ranges for this endpoint. When empty, all source IPs are allowed. A non-empty list is only effective if the endpoint is enabled for this location.
        /// </summary>
        public readonly ImmutableArray<Outputs.ZeroTrustDnsLocationEndpointsIpv6Network> Networks;

        [OutputConstructor]
        private ZeroTrustDnsLocationEndpointsIpv6(
            bool? enabled,

            ImmutableArray<Outputs.ZeroTrustDnsLocationEndpointsIpv6Network> networks)
        {
            Enabled = enabled;
            Networks = networks;
        }
    }
}
