// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class GetApiShieldOperationsResultFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP99 {
    /**
     * @return Lower bound for percentile estimate
     * 
     */
    private Double lower;
    /**
     * @return Upper bound for percentile estimate
     * 
     */
    private Double upper;

    private GetApiShieldOperationsResultFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP99() {}
    /**
     * @return Lower bound for percentile estimate
     * 
     */
    public Double lower() {
        return this.lower;
    }
    /**
     * @return Upper bound for percentile estimate
     * 
     */
    public Double upper() {
        return this.upper;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiShieldOperationsResultFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP99 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double lower;
        private Double upper;
        public Builder() {}
        public Builder(GetApiShieldOperationsResultFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP99 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lower = defaults.lower;
    	      this.upper = defaults.upper;
        }

        @CustomType.Setter
        public Builder lower(Double lower) {
            if (lower == null) {
              throw new MissingRequiredPropertyException("GetApiShieldOperationsResultFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP99", "lower");
            }
            this.lower = lower;
            return this;
        }
        @CustomType.Setter
        public Builder upper(Double upper) {
            if (upper == null) {
              throw new MissingRequiredPropertyException("GetApiShieldOperationsResultFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP99", "upper");
            }
            this.upper = upper;
            return this;
        }
        public GetApiShieldOperationsResultFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP99 build() {
            final var _resultValue = new GetApiShieldOperationsResultFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP99();
            _resultValue.lower = lower;
            _resultValue.upper = upper;
            return _resultValue;
        }
    }
}
