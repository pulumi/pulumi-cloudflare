// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustSplitTunnelTunnelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The address for the tunnel.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// A description for the tunnel.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The domain name for the tunnel.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        public ZeroTrustSplitTunnelTunnelArgs()
        {
        }
        public static new ZeroTrustSplitTunnelTunnelArgs Empty => new ZeroTrustSplitTunnelTunnelArgs();
    }
}