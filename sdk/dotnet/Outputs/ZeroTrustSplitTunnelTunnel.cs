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
    public sealed class ZeroTrustSplitTunnelTunnel
    {
        /// <summary>
        /// The address for the tunnel.
        /// </summary>
        public readonly string? Address;
        /// <summary>
        /// A description for the tunnel.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// The domain name for the tunnel.
        /// </summary>
        public readonly string? Host;

        [OutputConstructor]
        private ZeroTrustSplitTunnelTunnel(
            string? address,

            string? description,

            string? host)
        {
            Address = address;
            Description = description;
            Host = host;
        }
    }
}