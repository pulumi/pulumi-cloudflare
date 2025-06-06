// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class LoadBalancerPoolOriginArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP address (IPv4 or IPv6) of the origin, or its publicly addressable hostname. Hostnames entered here should resolve directly to the origin, and not be a hostname proxied by Cloudflare. To set an internal/reserved address, virtual*network*id must also be set.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// This field shows up only if the origin is disabled. This field is set with the time the origin was disabled.
        /// </summary>
        [Input("disabledAt")]
        public Input<string>? DisabledAt { get; set; }

        /// <summary>
        /// Whether to enable (the default) this origin within the pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The request header is used to pass additional information with an HTTP request. Currently supported header is 'Host'.
        /// </summary>
        [Input("header")]
        public Input<Inputs.LoadBalancerPoolOriginHeaderArgs>? Header { get; set; }

        /// <summary>
        /// A human-identifiable name for the origin.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The port for upstream connections. A value of 0 means the default port for the protocol will be used.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The virtual network subnet ID the origin belongs in. Virtual network must also belong to the account.
        /// </summary>
        [Input("virtualNetworkId")]
        public Input<string>? VirtualNetworkId { get; set; }

        /// <summary>
        /// The weight of this origin relative to other origins in the pool. Based on the configured weight the total traffic is distributed among origins within the pool.
        /// </summary>
        [Input("weight")]
        public Input<double>? Weight { get; set; }

        public LoadBalancerPoolOriginArgs()
        {
        }
        public static new LoadBalancerPoolOriginArgs Empty => new LoadBalancerPoolOriginArgs();
    }
}
