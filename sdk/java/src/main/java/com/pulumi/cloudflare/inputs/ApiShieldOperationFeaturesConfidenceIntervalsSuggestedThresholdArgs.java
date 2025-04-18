// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs Empty = new ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs();

    @Import(name="confidenceIntervals")
    private @Nullable Output<ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs> confidenceIntervals;

    public Optional<Output<ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs>> confidenceIntervals() {
        return Optional.ofNullable(this.confidenceIntervals);
    }

    /**
     * Suggested threshold.
     * 
     */
    @Import(name="mean")
    private @Nullable Output<Double> mean;

    /**
     * @return Suggested threshold.
     * 
     */
    public Optional<Output<Double>> mean() {
        return Optional.ofNullable(this.mean);
    }

    private ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs() {}

    private ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs(ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs $) {
        this.confidenceIntervals = $.confidenceIntervals;
        this.mean = $.mean;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs $;

        public Builder() {
            $ = new ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs();
        }

        public Builder(ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs defaults) {
            $ = new ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs(Objects.requireNonNull(defaults));
        }

        public Builder confidenceIntervals(@Nullable Output<ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs> confidenceIntervals) {
            $.confidenceIntervals = confidenceIntervals;
            return this;
        }

        public Builder confidenceIntervals(ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs confidenceIntervals) {
            return confidenceIntervals(Output.of(confidenceIntervals));
        }

        /**
         * @param mean Suggested threshold.
         * 
         * @return builder
         * 
         */
        public Builder mean(@Nullable Output<Double> mean) {
            $.mean = mean;
            return this;
        }

        /**
         * @param mean Suggested threshold.
         * 
         * @return builder
         * 
         */
        public Builder mean(Double mean) {
            return mean(Output.of(mean));
        }

        public ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs build() {
            return $;
        }
    }

}
