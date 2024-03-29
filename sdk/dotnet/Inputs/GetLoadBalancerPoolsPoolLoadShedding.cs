// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class GetLoadBalancerPoolsPoolLoadSheddingArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Percent of traffic to shed 0 - 100.
        /// </summary>
        [Input("defaultPercent")]
        public double? DefaultPercent { get; set; }

        /// <summary>
        /// Method of shedding traffic. Available values: `""`, `hash`, `random`
        /// </summary>
        [Input("defaultPolicy")]
        public string? DefaultPolicy { get; set; }

        /// <summary>
        /// Percent of session traffic to shed 0 - 100.
        /// </summary>
        [Input("sessionPercent")]
        public double? SessionPercent { get; set; }

        /// <summary>
        /// Method of shedding traffic. Available values: `""`, `hash`
        /// </summary>
        [Input("sessionPolicy")]
        public string? SessionPolicy { get; set; }

        public GetLoadBalancerPoolsPoolLoadSheddingArgs()
        {
        }
        public static new GetLoadBalancerPoolsPoolLoadSheddingArgs Empty => new GetLoadBalancerPoolsPoolLoadSheddingArgs();
    }
}
