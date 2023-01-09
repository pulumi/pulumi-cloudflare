// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerRuleOverrideAdaptiveRoutingArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerRuleOverrideAdaptiveRoutingArgs Empty = new LoadBalancerRuleOverrideAdaptiveRoutingArgs();

    /**
     * Extends zero-downtime failover of requests to healthy origins from alternate pools, when no healthy alternate exists in the same pool, according to the failover order defined by traffic and origin steering. When set `false`, zero-downtime failover will only occur between origins within the same pool. Defaults to `false`.
     * 
     */
    @Import(name="failoverAcrossPools")
    private @Nullable Output<Boolean> failoverAcrossPools;

    /**
     * @return Extends zero-downtime failover of requests to healthy origins from alternate pools, when no healthy alternate exists in the same pool, according to the failover order defined by traffic and origin steering. When set `false`, zero-downtime failover will only occur between origins within the same pool. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> failoverAcrossPools() {
        return Optional.ofNullable(this.failoverAcrossPools);
    }

    private LoadBalancerRuleOverrideAdaptiveRoutingArgs() {}

    private LoadBalancerRuleOverrideAdaptiveRoutingArgs(LoadBalancerRuleOverrideAdaptiveRoutingArgs $) {
        this.failoverAcrossPools = $.failoverAcrossPools;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerRuleOverrideAdaptiveRoutingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerRuleOverrideAdaptiveRoutingArgs $;

        public Builder() {
            $ = new LoadBalancerRuleOverrideAdaptiveRoutingArgs();
        }

        public Builder(LoadBalancerRuleOverrideAdaptiveRoutingArgs defaults) {
            $ = new LoadBalancerRuleOverrideAdaptiveRoutingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param failoverAcrossPools Extends zero-downtime failover of requests to healthy origins from alternate pools, when no healthy alternate exists in the same pool, according to the failover order defined by traffic and origin steering. When set `false`, zero-downtime failover will only occur between origins within the same pool. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder failoverAcrossPools(@Nullable Output<Boolean> failoverAcrossPools) {
            $.failoverAcrossPools = failoverAcrossPools;
            return this;
        }

        /**
         * @param failoverAcrossPools Extends zero-downtime failover of requests to healthy origins from alternate pools, when no healthy alternate exists in the same pool, according to the failover order defined by traffic and origin steering. When set `false`, zero-downtime failover will only occur between origins within the same pool. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder failoverAcrossPools(Boolean failoverAcrossPools) {
            return failoverAcrossPools(Output.of(failoverAcrossPools));
        }

        public LoadBalancerRuleOverrideAdaptiveRoutingArgs build() {
            return $;
        }
    }

}