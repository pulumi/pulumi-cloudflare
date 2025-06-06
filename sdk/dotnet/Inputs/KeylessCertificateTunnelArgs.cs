// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class KeylessCertificateTunnelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Private IP of the Key Server Host
        /// </summary>
        [Input("privateIp", required: true)]
        public Input<string> PrivateIp { get; set; } = null!;

        /// <summary>
        /// Cloudflare Tunnel Virtual Network ID
        /// </summary>
        [Input("vnetId", required: true)]
        public Input<string> VnetId { get; set; } = null!;

        public KeylessCertificateTunnelArgs()
        {
        }
        public static new KeylessCertificateTunnelArgs Empty => new KeylessCertificateTunnelArgs();
    }
}
