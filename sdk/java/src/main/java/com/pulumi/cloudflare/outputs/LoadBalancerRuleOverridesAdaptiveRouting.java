// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerRuleOverridesAdaptiveRouting {
    /**
     * @return Extends zero-downtime failover of requests to healthy origins from alternate pools, when no healthy alternate exists in the same pool, according to the failover order defined by traffic and origin steering. When set false (the default) zero-downtime failover will only occur between origins within the same pool. See `session_affinity_attributes` for control over when sessions are broken or reassigned.
     * 
     */
    private @Nullable Boolean failoverAcrossPools;

    private LoadBalancerRuleOverridesAdaptiveRouting() {}
    /**
     * @return Extends zero-downtime failover of requests to healthy origins from alternate pools, when no healthy alternate exists in the same pool, according to the failover order defined by traffic and origin steering. When set false (the default) zero-downtime failover will only occur between origins within the same pool. See `session_affinity_attributes` for control over when sessions are broken or reassigned.
     * 
     */
    public Optional<Boolean> failoverAcrossPools() {
        return Optional.ofNullable(this.failoverAcrossPools);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerRuleOverridesAdaptiveRouting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean failoverAcrossPools;
        public Builder() {}
        public Builder(LoadBalancerRuleOverridesAdaptiveRouting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverAcrossPools = defaults.failoverAcrossPools;
        }

        @CustomType.Setter
        public Builder failoverAcrossPools(@Nullable Boolean failoverAcrossPools) {

            this.failoverAcrossPools = failoverAcrossPools;
            return this;
        }
        public LoadBalancerRuleOverridesAdaptiveRouting build() {
            final var _resultValue = new LoadBalancerRuleOverridesAdaptiveRouting();
            _resultValue.failoverAcrossPools = failoverAcrossPools;
            return _resultValue;
        }
    }
}
