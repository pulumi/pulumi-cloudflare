// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetZeroTrustDexTestsResultData;
import com.pulumi.cloudflare.outputs.GetZeroTrustDexTestsResultTargetPolicy;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetZeroTrustDexTestsResult {
    /**
     * @return The configuration object which contains the details for the WARP client to conduct the test.
     * 
     */
    private GetZeroTrustDexTestsResultData data;
    /**
     * @return Additional details about the test.
     * 
     */
    private String description;
    /**
     * @return Determines whether or not the test is active.
     * 
     */
    private Boolean enabled;
    /**
     * @return How often the test will run.
     * 
     */
    private String interval;
    /**
     * @return The name of the DEX test. Must be unique.
     * 
     */
    private String name;
    /**
     * @return DEX rules targeted by this test
     * 
     */
    private List<GetZeroTrustDexTestsResultTargetPolicy> targetPolicies;
    private Boolean targeted;
    /**
     * @return The unique identifier for the test.
     * 
     */
    private String testId;

    private GetZeroTrustDexTestsResult() {}
    /**
     * @return The configuration object which contains the details for the WARP client to conduct the test.
     * 
     */
    public GetZeroTrustDexTestsResultData data() {
        return this.data;
    }
    /**
     * @return Additional details about the test.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Determines whether or not the test is active.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return How often the test will run.
     * 
     */
    public String interval() {
        return this.interval;
    }
    /**
     * @return The name of the DEX test. Must be unique.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return DEX rules targeted by this test
     * 
     */
    public List<GetZeroTrustDexTestsResultTargetPolicy> targetPolicies() {
        return this.targetPolicies;
    }
    public Boolean targeted() {
        return this.targeted;
    }
    /**
     * @return The unique identifier for the test.
     * 
     */
    public String testId() {
        return this.testId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustDexTestsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetZeroTrustDexTestsResultData data;
        private String description;
        private Boolean enabled;
        private String interval;
        private String name;
        private List<GetZeroTrustDexTestsResultTargetPolicy> targetPolicies;
        private Boolean targeted;
        private String testId;
        public Builder() {}
        public Builder(GetZeroTrustDexTestsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.interval = defaults.interval;
    	      this.name = defaults.name;
    	      this.targetPolicies = defaults.targetPolicies;
    	      this.targeted = defaults.targeted;
    	      this.testId = defaults.testId;
        }

        @CustomType.Setter
        public Builder data(GetZeroTrustDexTestsResultData data) {
            if (data == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDexTestsResult", "data");
            }
            this.data = data;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDexTestsResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDexTestsResult", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder interval(String interval) {
            if (interval == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDexTestsResult", "interval");
            }
            this.interval = interval;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDexTestsResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder targetPolicies(List<GetZeroTrustDexTestsResultTargetPolicy> targetPolicies) {
            if (targetPolicies == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDexTestsResult", "targetPolicies");
            }
            this.targetPolicies = targetPolicies;
            return this;
        }
        public Builder targetPolicies(GetZeroTrustDexTestsResultTargetPolicy... targetPolicies) {
            return targetPolicies(List.of(targetPolicies));
        }
        @CustomType.Setter
        public Builder targeted(Boolean targeted) {
            if (targeted == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDexTestsResult", "targeted");
            }
            this.targeted = targeted;
            return this;
        }
        @CustomType.Setter
        public Builder testId(String testId) {
            if (testId == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustDexTestsResult", "testId");
            }
            this.testId = testId;
            return this;
        }
        public GetZeroTrustDexTestsResult build() {
            final var _resultValue = new GetZeroTrustDexTestsResult();
            _resultValue.data = data;
            _resultValue.description = description;
            _resultValue.enabled = enabled;
            _resultValue.interval = interval;
            _resultValue.name = name;
            _resultValue.targetPolicies = targetPolicies;
            _resultValue.targeted = targeted;
            _resultValue.testId = testId;
            return _resultValue;
        }
    }
}
