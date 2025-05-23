// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP90Args;
import com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP95Args;
import com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP99Args;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs Empty = new ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs();

    /**
     * Upper and lower bound for percentile estimate
     * 
     */
    @Import(name="p90")
    private @Nullable Output<ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP90Args> p90;

    /**
     * @return Upper and lower bound for percentile estimate
     * 
     */
    public Optional<Output<ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP90Args>> p90() {
        return Optional.ofNullable(this.p90);
    }

    /**
     * Upper and lower bound for percentile estimate
     * 
     */
    @Import(name="p95")
    private @Nullable Output<ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP95Args> p95;

    /**
     * @return Upper and lower bound for percentile estimate
     * 
     */
    public Optional<Output<ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP95Args>> p95() {
        return Optional.ofNullable(this.p95);
    }

    /**
     * Upper and lower bound for percentile estimate
     * 
     */
    @Import(name="p99")
    private @Nullable Output<ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP99Args> p99;

    /**
     * @return Upper and lower bound for percentile estimate
     * 
     */
    public Optional<Output<ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP99Args>> p99() {
        return Optional.ofNullable(this.p99);
    }

    private ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs() {}

    private ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs(ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs $) {
        this.p90 = $.p90;
        this.p95 = $.p95;
        this.p99 = $.p99;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs $;

        public Builder() {
            $ = new ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs();
        }

        public Builder(ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs defaults) {
            $ = new ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param p90 Upper and lower bound for percentile estimate
         * 
         * @return builder
         * 
         */
        public Builder p90(@Nullable Output<ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP90Args> p90) {
            $.p90 = p90;
            return this;
        }

        /**
         * @param p90 Upper and lower bound for percentile estimate
         * 
         * @return builder
         * 
         */
        public Builder p90(ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP90Args p90) {
            return p90(Output.of(p90));
        }

        /**
         * @param p95 Upper and lower bound for percentile estimate
         * 
         * @return builder
         * 
         */
        public Builder p95(@Nullable Output<ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP95Args> p95) {
            $.p95 = p95;
            return this;
        }

        /**
         * @param p95 Upper and lower bound for percentile estimate
         * 
         * @return builder
         * 
         */
        public Builder p95(ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP95Args p95) {
            return p95(Output.of(p95));
        }

        /**
         * @param p99 Upper and lower bound for percentile estimate
         * 
         * @return builder
         * 
         */
        public Builder p99(@Nullable Output<ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP99Args> p99) {
            $.p99 = p99;
            return this;
        }

        /**
         * @param p99 Upper and lower bound for percentile estimate
         * 
         * @return builder
         * 
         */
        public Builder p99(ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP99Args p99) {
            return p99(Output.of(p99));
        }

        public ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs build() {
            return $;
        }
    }

}
