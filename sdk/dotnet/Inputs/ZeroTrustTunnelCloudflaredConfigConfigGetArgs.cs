// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustTunnelCloudflaredConfigConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("ingresses")]
        private InputList<Inputs.ZeroTrustTunnelCloudflaredConfigConfigIngressGetArgs>? _ingresses;

        /// <summary>
        /// List of public hostname definitions. At least one ingress rule needs to be defined for the tunnel.
        /// </summary>
        public InputList<Inputs.ZeroTrustTunnelCloudflaredConfigConfigIngressGetArgs> Ingresses
        {
            get => _ingresses ?? (_ingresses = new InputList<Inputs.ZeroTrustTunnelCloudflaredConfigConfigIngressGetArgs>());
            set => _ingresses = value;
        }

        /// <summary>
        /// Configuration parameters for the public hostname specific connection settings between cloudflared and origin server.
        /// </summary>
        [Input("originRequest")]
        public Input<Inputs.ZeroTrustTunnelCloudflaredConfigConfigOriginRequestGetArgs>? OriginRequest { get; set; }

        /// <summary>
        /// Enable private network access from WARP users to private network routes. This is enabled if the tunnel has an assigned route.
        /// </summary>
        [Input("warpRouting")]
        public Input<Inputs.ZeroTrustTunnelCloudflaredConfigConfigWarpRoutingGetArgs>? WarpRouting { get; set; }

        public ZeroTrustTunnelCloudflaredConfigConfigGetArgs()
        {
        }
        public static new ZeroTrustTunnelCloudflaredConfigConfigGetArgs Empty => new ZeroTrustTunnelCloudflaredConfigConfigGetArgs();
    }
}
