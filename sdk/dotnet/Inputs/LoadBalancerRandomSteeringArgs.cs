// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class LoadBalancerRandomSteeringArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The default weight for pools in the load balancer that are not specified in the pool_weights map.
        /// </summary>
        [Input("defaultWeight")]
        public Input<double>? DefaultWeight { get; set; }

        [Input("poolWeights")]
        private InputMap<double>? _poolWeights;

        /// <summary>
        /// A mapping of pool IDs to custom weights. The weight is relative to other pools in the load balancer.
        /// </summary>
        public InputMap<double> PoolWeights
        {
            get => _poolWeights ?? (_poolWeights = new InputMap<double>());
            set => _poolWeights = value;
        }

        public LoadBalancerRandomSteeringArgs()
        {
        }
        public static new LoadBalancerRandomSteeringArgs Empty => new LoadBalancerRandomSteeringArgs();
    }
}
