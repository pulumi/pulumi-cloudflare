// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiShieldOperationFeaturesConfidenceIntervalsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiShieldOperationFeaturesConfidenceIntervalsArgs Empty = new ApiShieldOperationFeaturesConfidenceIntervalsArgs();

    @Import(name="lastUpdated")
    private @Nullable Output<String> lastUpdated;

    public Optional<Output<String>> lastUpdated() {
        return Optional.ofNullable(this.lastUpdated);
    }

    @Import(name="suggestedThreshold")
    private @Nullable Output<ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs> suggestedThreshold;

    public Optional<Output<ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs>> suggestedThreshold() {
        return Optional.ofNullable(this.suggestedThreshold);
    }

    private ApiShieldOperationFeaturesConfidenceIntervalsArgs() {}

    private ApiShieldOperationFeaturesConfidenceIntervalsArgs(ApiShieldOperationFeaturesConfidenceIntervalsArgs $) {
        this.lastUpdated = $.lastUpdated;
        this.suggestedThreshold = $.suggestedThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiShieldOperationFeaturesConfidenceIntervalsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiShieldOperationFeaturesConfidenceIntervalsArgs $;

        public Builder() {
            $ = new ApiShieldOperationFeaturesConfidenceIntervalsArgs();
        }

        public Builder(ApiShieldOperationFeaturesConfidenceIntervalsArgs defaults) {
            $ = new ApiShieldOperationFeaturesConfidenceIntervalsArgs(Objects.requireNonNull(defaults));
        }

        public Builder lastUpdated(@Nullable Output<String> lastUpdated) {
            $.lastUpdated = lastUpdated;
            return this;
        }

        public Builder lastUpdated(String lastUpdated) {
            return lastUpdated(Output.of(lastUpdated));
        }

        public Builder suggestedThreshold(@Nullable Output<ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs> suggestedThreshold) {
            $.suggestedThreshold = suggestedThreshold;
            return this;
        }

        public Builder suggestedThreshold(ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs suggestedThreshold) {
            return suggestedThreshold(Output.of(suggestedThreshold));
        }

        public ApiShieldOperationFeaturesConfidenceIntervalsArgs build() {
            return $;
        }
    }

}
