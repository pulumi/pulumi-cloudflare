// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLoadBalancerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancerArgs Empty = new GetLoadBalancerArgs();

    /**
     * A mapping of country codes to a list of pool IDs (ordered by their failover priority) for the given country. Any country not explicitly defined will fall back to using the corresponding region*pool mapping if it exists else to default*pools.
     * 
     */
    @Import(name="countryPools")
    private @Nullable Output<Map<String,List<String>>> countryPools;

    /**
     * @return A mapping of country codes to a list of pool IDs (ordered by their failover priority) for the given country. Any country not explicitly defined will fall back to using the corresponding region*pool mapping if it exists else to default*pools.
     * 
     */
    public Optional<Output<Map<String,List<String>>>> countryPools() {
        return Optional.ofNullable(this.countryPools);
    }

    @Import(name="loadBalancerId")
    private @Nullable Output<String> loadBalancerId;

    public Optional<Output<String>> loadBalancerId() {
        return Optional.ofNullable(this.loadBalancerId);
    }

    /**
     * (Enterprise only): A mapping of Cloudflare PoP identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). Any PoPs not explicitly defined will fall back to using the corresponding country*pool, then region*pool mapping if it exists else to default_pools.
     * 
     */
    @Import(name="popPools")
    private @Nullable Output<Map<String,List<String>>> popPools;

    /**
     * @return (Enterprise only): A mapping of Cloudflare PoP identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). Any PoPs not explicitly defined will fall back to using the corresponding country*pool, then region*pool mapping if it exists else to default_pools.
     * 
     */
    public Optional<Output<Map<String,List<String>>>> popPools() {
        return Optional.ofNullable(this.popPools);
    }

    /**
     * A mapping of region codes to a list of pool IDs (ordered by their failover priority) for the given region. Any regions not explicitly defined will fall back to using default_pools.
     * 
     */
    @Import(name="regionPools")
    private @Nullable Output<Map<String,List<String>>> regionPools;

    /**
     * @return A mapping of region codes to a list of pool IDs (ordered by their failover priority) for the given region. Any regions not explicitly defined will fall back to using default_pools.
     * 
     */
    public Optional<Output<Map<String,List<String>>>> regionPools() {
        return Optional.ofNullable(this.regionPools);
    }

    /**
     * Time, in seconds, until a client&#39;s session expires after being created. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. The accepted ranges per `session_affinity` policy are:
     * 
     */
    @Import(name="sessionAffinityTtl")
    private @Nullable Output<Double> sessionAffinityTtl;

    /**
     * @return Time, in seconds, until a client&#39;s session expires after being created. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. The accepted ranges per `session_affinity` policy are:
     * 
     */
    public Optional<Output<Double>> sessionAffinityTtl() {
        return Optional.ofNullable(this.sessionAffinityTtl);
    }

    /**
     * Steering Policy for this load balancer.
     * 
     */
    @Import(name="steeringPolicy")
    private @Nullable Output<String> steeringPolicy;

    /**
     * @return Steering Policy for this load balancer.
     * 
     */
    public Optional<Output<String>> steeringPolicy() {
        return Optional.ofNullable(this.steeringPolicy);
    }

    /**
     * Time to live (TTL) of the DNS entry for the IP address returned by this load balancer. This only applies to gray-clouded (unproxied) load balancers.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<Double> ttl;

    /**
     * @return Time to live (TTL) of the DNS entry for the IP address returned by this load balancer. This only applies to gray-clouded (unproxied) load balancers.
     * 
     */
    public Optional<Output<Double>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    public Output<String> zoneId() {
        return this.zoneId;
    }

    private GetLoadBalancerArgs() {}

    private GetLoadBalancerArgs(GetLoadBalancerArgs $) {
        this.countryPools = $.countryPools;
        this.loadBalancerId = $.loadBalancerId;
        this.popPools = $.popPools;
        this.regionPools = $.regionPools;
        this.sessionAffinityTtl = $.sessionAffinityTtl;
        this.steeringPolicy = $.steeringPolicy;
        this.ttl = $.ttl;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadBalancerArgs $;

        public Builder() {
            $ = new GetLoadBalancerArgs();
        }

        public Builder(GetLoadBalancerArgs defaults) {
            $ = new GetLoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param countryPools A mapping of country codes to a list of pool IDs (ordered by their failover priority) for the given country. Any country not explicitly defined will fall back to using the corresponding region*pool mapping if it exists else to default*pools.
         * 
         * @return builder
         * 
         */
        public Builder countryPools(@Nullable Output<Map<String,List<String>>> countryPools) {
            $.countryPools = countryPools;
            return this;
        }

        /**
         * @param countryPools A mapping of country codes to a list of pool IDs (ordered by their failover priority) for the given country. Any country not explicitly defined will fall back to using the corresponding region*pool mapping if it exists else to default*pools.
         * 
         * @return builder
         * 
         */
        public Builder countryPools(Map<String,List<String>> countryPools) {
            return countryPools(Output.of(countryPools));
        }

        public Builder loadBalancerId(@Nullable Output<String> loadBalancerId) {
            $.loadBalancerId = loadBalancerId;
            return this;
        }

        public Builder loadBalancerId(String loadBalancerId) {
            return loadBalancerId(Output.of(loadBalancerId));
        }

        /**
         * @param popPools (Enterprise only): A mapping of Cloudflare PoP identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). Any PoPs not explicitly defined will fall back to using the corresponding country*pool, then region*pool mapping if it exists else to default_pools.
         * 
         * @return builder
         * 
         */
        public Builder popPools(@Nullable Output<Map<String,List<String>>> popPools) {
            $.popPools = popPools;
            return this;
        }

        /**
         * @param popPools (Enterprise only): A mapping of Cloudflare PoP identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). Any PoPs not explicitly defined will fall back to using the corresponding country*pool, then region*pool mapping if it exists else to default_pools.
         * 
         * @return builder
         * 
         */
        public Builder popPools(Map<String,List<String>> popPools) {
            return popPools(Output.of(popPools));
        }

        /**
         * @param regionPools A mapping of region codes to a list of pool IDs (ordered by their failover priority) for the given region. Any regions not explicitly defined will fall back to using default_pools.
         * 
         * @return builder
         * 
         */
        public Builder regionPools(@Nullable Output<Map<String,List<String>>> regionPools) {
            $.regionPools = regionPools;
            return this;
        }

        /**
         * @param regionPools A mapping of region codes to a list of pool IDs (ordered by their failover priority) for the given region. Any regions not explicitly defined will fall back to using default_pools.
         * 
         * @return builder
         * 
         */
        public Builder regionPools(Map<String,List<String>> regionPools) {
            return regionPools(Output.of(regionPools));
        }

        /**
         * @param sessionAffinityTtl Time, in seconds, until a client&#39;s session expires after being created. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. The accepted ranges per `session_affinity` policy are:
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinityTtl(@Nullable Output<Double> sessionAffinityTtl) {
            $.sessionAffinityTtl = sessionAffinityTtl;
            return this;
        }

        /**
         * @param sessionAffinityTtl Time, in seconds, until a client&#39;s session expires after being created. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. The accepted ranges per `session_affinity` policy are:
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinityTtl(Double sessionAffinityTtl) {
            return sessionAffinityTtl(Output.of(sessionAffinityTtl));
        }

        /**
         * @param steeringPolicy Steering Policy for this load balancer.
         * 
         * @return builder
         * 
         */
        public Builder steeringPolicy(@Nullable Output<String> steeringPolicy) {
            $.steeringPolicy = steeringPolicy;
            return this;
        }

        /**
         * @param steeringPolicy Steering Policy for this load balancer.
         * 
         * @return builder
         * 
         */
        public Builder steeringPolicy(String steeringPolicy) {
            return steeringPolicy(Output.of(steeringPolicy));
        }

        /**
         * @param ttl Time to live (TTL) of the DNS entry for the IP address returned by this load balancer. This only applies to gray-clouded (unproxied) load balancers.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<Double> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl Time to live (TTL) of the DNS entry for the IP address returned by this load balancer. This only applies to gray-clouded (unproxied) load balancers.
         * 
         * @return builder
         * 
         */
        public Builder ttl(Double ttl) {
            return ttl(Output.of(ttl));
        }

        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public GetLoadBalancerArgs build() {
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetLoadBalancerArgs", "zoneId");
            }
            return $;
        }
    }

}
