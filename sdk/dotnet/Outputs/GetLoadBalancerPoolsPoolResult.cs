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
    public sealed class GetLoadBalancerPoolsPoolResult
    {
        /// <summary>
        /// List of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions).
        /// </summary>
        public readonly ImmutableArray<string> CheckRegions;
        /// <summary>
        /// The RFC3339 timestamp of when the load balancer was created.
        /// </summary>
        public readonly string CreatedOn;
        /// <summary>
        /// Brief description of the Load Balancer Pool intention.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Whether this pool is enabled. Disabled pools will not receive traffic and are excluded from health checks.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// ID for this load balancer pool.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Latitude this pool is physically located at; used for proximity steering.
        /// </summary>
        public readonly double Latitude;
        /// <summary>
        /// Setting for controlling load shedding for this pool.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancerPoolsPoolLoadSheddingResult> LoadSheddings;
        /// <summary>
        /// Longitude this pool is physically located at; used for proximity steering.
        /// </summary>
        public readonly double Longitude;
        /// <summary>
        /// Minimum number of origins that must be healthy for this pool to serve traffic.
        /// </summary>
        public readonly int MinimumOrigins;
        /// <summary>
        /// The RFC3339 timestamp of when the load balancer was last modified.
        /// </summary>
        public readonly string ModifiedOn;
        /// <summary>
        /// ID of the Monitor to use for health checking origins within this pool.
        /// </summary>
        public readonly string Monitor;
        /// <summary>
        /// Short name (tag) for the pool.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Email address to send health status notifications to. Multiple emails are set as a comma delimited list.
        /// </summary>
        public readonly string NotificationEmail;
        /// <summary>
        /// The list of origins within this pool.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancerPoolsPoolOriginResult> Origins;

        [OutputConstructor]
        private GetLoadBalancerPoolsPoolResult(
            ImmutableArray<string> checkRegions,

            string createdOn,

            string description,

            bool enabled,

            string id,

            double latitude,

            ImmutableArray<Outputs.GetLoadBalancerPoolsPoolLoadSheddingResult> loadSheddings,

            double longitude,

            int minimumOrigins,

            string modifiedOn,

            string monitor,

            string name,

            string notificationEmail,

            ImmutableArray<Outputs.GetLoadBalancerPoolsPoolOriginResult> origins)
        {
            CheckRegions = checkRegions;
            CreatedOn = createdOn;
            Description = description;
            Enabled = enabled;
            Id = id;
            Latitude = latitude;
            LoadSheddings = loadSheddings;
            Longitude = longitude;
            MinimumOrigins = minimumOrigins;
            ModifiedOn = modifiedOn;
            Monitor = monitor;
            Name = name;
            NotificationEmail = notificationEmail;
            Origins = origins;
        }
    }
}
