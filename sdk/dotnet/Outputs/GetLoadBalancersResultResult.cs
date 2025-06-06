// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class GetLoadBalancersResultResult
    {
        /// <summary>
        /// Controls features that modify the routing of requests to pools and origins in response to dynamic conditions, such as during the interval between active health monitoring requests. For example, zero-downtime failover occurs immediately when an origin becomes unavailable due to HTTP 521, 522, or 523 response codes. If there is another healthy origin in the same pool, the request is retried once against this alternate origin.
        /// </summary>
        public readonly Outputs.GetLoadBalancersResultAdaptiveRoutingResult AdaptiveRouting;
        /// <summary>
        /// A mapping of country codes to a list of pool IDs (ordered by their failover priority) for the given country. Any country not explicitly defined will fall back to using the corresponding region*pool mapping if it exists else to default*pools.
        /// </summary>
        public readonly ImmutableDictionary<string, ImmutableArray<string>> CountryPools;
        public readonly string CreatedOn;
        /// <summary>
        /// A list of pool IDs ordered by their failover priority. Pools defined here are used by default, or when region_pools are not configured for a given region.
        /// </summary>
        public readonly ImmutableArray<string> DefaultPools;
        /// <summary>
        /// Object description.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Whether to enable (the default) this load balancer.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// The pool ID to use when all other pools are detected as unhealthy.
        /// </summary>
        public readonly string FallbackPool;
        public readonly string Id;
        /// <summary>
        /// Controls location-based steering for non-proxied requests. See `steering_policy` to learn how steering is affected.
        /// </summary>
        public readonly Outputs.GetLoadBalancersResultLocationStrategyResult LocationStrategy;
        public readonly string ModifiedOn;
        /// <summary>
        /// The DNS hostname to associate with your Load Balancer. If this hostname already exists as a DNS record in Cloudflare's DNS, the Load Balancer will take precedence and the DNS record will not be used.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// List of networks where Load Balancer or Pool is enabled.
        /// </summary>
        public readonly ImmutableArray<string> Networks;
        /// <summary>
        /// (Enterprise only): A mapping of Cloudflare PoP identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). Any PoPs not explicitly defined will fall back to using the corresponding country*pool, then region*pool mapping if it exists else to default_pools.
        /// </summary>
        public readonly ImmutableDictionary<string, ImmutableArray<string>> PopPools;
        /// <summary>
        /// Whether the hostname should be gray clouded (false) or orange clouded (true).
        /// </summary>
        public readonly bool Proxied;
        /// <summary>
        /// Configures pool weights.
        /// </summary>
        public readonly Outputs.GetLoadBalancersResultRandomSteeringResult RandomSteering;
        /// <summary>
        /// A mapping of region codes to a list of pool IDs (ordered by their failover priority) for the given region. Any regions not explicitly defined will fall back to using default_pools.
        /// </summary>
        public readonly ImmutableDictionary<string, ImmutableArray<string>> RegionPools;
        /// <summary>
        /// BETA Field Not General Access: A list of rules for this load balancer to execute.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancersResultRuleResult> Rules;
        /// <summary>
        /// Specifies the type of session affinity the load balancer should use unless specified as `"none"`. The supported types are:
        /// </summary>
        public readonly string SessionAffinity;
        /// <summary>
        /// Configures attributes for session affinity.
        /// </summary>
        public readonly Outputs.GetLoadBalancersResultSessionAffinityAttributesResult SessionAffinityAttributes;
        /// <summary>
        /// Time, in seconds, until a client's session expires after being created. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. The accepted ranges per `session_affinity` policy are:
        /// </summary>
        public readonly double SessionAffinityTtl;
        /// <summary>
        /// Steering Policy for this load balancer.
        /// </summary>
        public readonly string SteeringPolicy;
        /// <summary>
        /// Time to live (TTL) of the DNS entry for the IP address returned by this load balancer. This only applies to gray-clouded (unproxied) load balancers.
        /// </summary>
        public readonly double Ttl;
        public readonly string ZoneName;

        [OutputConstructor]
        private GetLoadBalancersResultResult(
            Outputs.GetLoadBalancersResultAdaptiveRoutingResult adaptiveRouting,

            ImmutableDictionary<string, ImmutableArray<string>> countryPools,

            string createdOn,

            ImmutableArray<string> defaultPools,

            string description,

            bool enabled,

            string fallbackPool,

            string id,

            Outputs.GetLoadBalancersResultLocationStrategyResult locationStrategy,

            string modifiedOn,

            string name,

            ImmutableArray<string> networks,

            ImmutableDictionary<string, ImmutableArray<string>> popPools,

            bool proxied,

            Outputs.GetLoadBalancersResultRandomSteeringResult randomSteering,

            ImmutableDictionary<string, ImmutableArray<string>> regionPools,

            ImmutableArray<Outputs.GetLoadBalancersResultRuleResult> rules,

            string sessionAffinity,

            Outputs.GetLoadBalancersResultSessionAffinityAttributesResult sessionAffinityAttributes,

            double sessionAffinityTtl,

            string steeringPolicy,

            double ttl,

            string zoneName)
        {
            AdaptiveRouting = adaptiveRouting;
            CountryPools = countryPools;
            CreatedOn = createdOn;
            DefaultPools = defaultPools;
            Description = description;
            Enabled = enabled;
            FallbackPool = fallbackPool;
            Id = id;
            LocationStrategy = locationStrategy;
            ModifiedOn = modifiedOn;
            Name = name;
            Networks = networks;
            PopPools = popPools;
            Proxied = proxied;
            RandomSteering = randomSteering;
            RegionPools = regionPools;
            Rules = rules;
            SessionAffinity = sessionAffinity;
            SessionAffinityAttributes = sessionAffinityAttributes;
            SessionAffinityTtl = sessionAffinityTtl;
            SteeringPolicy = steeringPolicy;
            Ttl = ttl;
            ZoneName = zoneName;
        }
    }
}
