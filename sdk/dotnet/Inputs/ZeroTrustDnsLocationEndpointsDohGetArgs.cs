// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustDnsLocationEndpointsDohGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("authenticationEnabled")]
        public Input<bool>? AuthenticationEnabled { get; set; }

        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        [Input("networks")]
        private InputList<Inputs.ZeroTrustDnsLocationEndpointsDohNetworkGetArgs>? _networks;
        public InputList<Inputs.ZeroTrustDnsLocationEndpointsDohNetworkGetArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.ZeroTrustDnsLocationEndpointsDohNetworkGetArgs>());
            set => _networks = value;
        }

        [Input("requireToken")]
        public Input<bool>? RequireToken { get; set; }

        public ZeroTrustDnsLocationEndpointsDohGetArgs()
        {
        }
        public static new ZeroTrustDnsLocationEndpointsDohGetArgs Empty => new ZeroTrustDnsLocationEndpointsDohGetArgs();
    }
}