// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLoadBalancerPoolOriginSteering {
    /**
     * @return The type of origin steering policy to use.
     * 
     */
    private String policy;

    private GetLoadBalancerPoolOriginSteering() {}
    /**
     * @return The type of origin steering policy to use.
     * 
     */
    public String policy() {
        return this.policy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerPoolOriginSteering defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String policy;
        public Builder() {}
        public Builder(GetLoadBalancerPoolOriginSteering defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
        }

        @CustomType.Setter
        public Builder policy(String policy) {
            if (policy == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolOriginSteering", "policy");
            }
            this.policy = policy;
            return this;
        }
        public GetLoadBalancerPoolOriginSteering build() {
            final var _resultValue = new GetLoadBalancerPoolOriginSteering();
            _resultValue.policy = policy;
            return _resultValue;
        }
    }
}
