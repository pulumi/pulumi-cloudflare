// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class MagicTransitSiteLanStaticAddressingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A valid CIDR notation representing an IP range.
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        [Input("dhcpRelay")]
        public Input<Inputs.MagicTransitSiteLanStaticAddressingDhcpRelayGetArgs>? DhcpRelay { get; set; }

        [Input("dhcpServer")]
        public Input<Inputs.MagicTransitSiteLanStaticAddressingDhcpServerGetArgs>? DhcpServer { get; set; }

        /// <summary>
        /// A valid CIDR notation representing an IP range.
        /// </summary>
        [Input("secondaryAddress")]
        public Input<string>? SecondaryAddress { get; set; }

        /// <summary>
        /// A valid CIDR notation representing an IP range.
        /// </summary>
        [Input("virtualAddress")]
        public Input<string>? VirtualAddress { get; set; }

        public MagicTransitSiteLanStaticAddressingGetArgs()
        {
        }
        public static new MagicTransitSiteLanStaticAddressingGetArgs Empty => new MagicTransitSiteLanStaticAddressingGetArgs();
    }
}
