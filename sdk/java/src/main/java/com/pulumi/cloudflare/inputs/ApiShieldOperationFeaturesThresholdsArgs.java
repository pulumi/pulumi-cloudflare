// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiShieldOperationFeaturesThresholdsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiShieldOperationFeaturesThresholdsArgs Empty = new ApiShieldOperationFeaturesThresholdsArgs();

    /**
     * The total number of auth-ids seen across this calculation.
     * 
     */
    @Import(name="authIdTokens")
    private @Nullable Output<Integer> authIdTokens;

    /**
     * @return The total number of auth-ids seen across this calculation.
     * 
     */
    public Optional<Output<Integer>> authIdTokens() {
        return Optional.ofNullable(this.authIdTokens);
    }

    /**
     * The number of data points used for the threshold suggestion calculation.
     * 
     */
    @Import(name="dataPoints")
    private @Nullable Output<Integer> dataPoints;

    /**
     * @return The number of data points used for the threshold suggestion calculation.
     * 
     */
    public Optional<Output<Integer>> dataPoints() {
        return Optional.ofNullable(this.dataPoints);
    }

    @Import(name="lastUpdated")
    private @Nullable Output<String> lastUpdated;

    public Optional<Output<String>> lastUpdated() {
        return Optional.ofNullable(this.lastUpdated);
    }

    /**
     * The p50 quantile of requests (in period_seconds).
     * 
     */
    @Import(name="p50")
    private @Nullable Output<Integer> p50;

    /**
     * @return The p50 quantile of requests (in period_seconds).
     * 
     */
    public Optional<Output<Integer>> p50() {
        return Optional.ofNullable(this.p50);
    }

    /**
     * The p90 quantile of requests (in period_seconds).
     * 
     */
    @Import(name="p90")
    private @Nullable Output<Integer> p90;

    /**
     * @return The p90 quantile of requests (in period_seconds).
     * 
     */
    public Optional<Output<Integer>> p90() {
        return Optional.ofNullable(this.p90);
    }

    /**
     * The p99 quantile of requests (in period_seconds).
     * 
     */
    @Import(name="p99")
    private @Nullable Output<Integer> p99;

    /**
     * @return The p99 quantile of requests (in period_seconds).
     * 
     */
    public Optional<Output<Integer>> p99() {
        return Optional.ofNullable(this.p99);
    }

    /**
     * The period over which this threshold is suggested.
     * 
     */
    @Import(name="periodSeconds")
    private @Nullable Output<Integer> periodSeconds;

    /**
     * @return The period over which this threshold is suggested.
     * 
     */
    public Optional<Output<Integer>> periodSeconds() {
        return Optional.ofNullable(this.periodSeconds);
    }

    /**
     * The estimated number of requests covered by these calculations.
     * 
     */
    @Import(name="requests")
    private @Nullable Output<Integer> requests;

    /**
     * @return The estimated number of requests covered by these calculations.
     * 
     */
    public Optional<Output<Integer>> requests() {
        return Optional.ofNullable(this.requests);
    }

    /**
     * The suggested threshold in requests done by the same auth*id or period*seconds.
     * 
     */
    @Import(name="suggestedThreshold")
    private @Nullable Output<Integer> suggestedThreshold;

    /**
     * @return The suggested threshold in requests done by the same auth*id or period*seconds.
     * 
     */
    public Optional<Output<Integer>> suggestedThreshold() {
        return Optional.ofNullable(this.suggestedThreshold);
    }

    private ApiShieldOperationFeaturesThresholdsArgs() {}

    private ApiShieldOperationFeaturesThresholdsArgs(ApiShieldOperationFeaturesThresholdsArgs $) {
        this.authIdTokens = $.authIdTokens;
        this.dataPoints = $.dataPoints;
        this.lastUpdated = $.lastUpdated;
        this.p50 = $.p50;
        this.p90 = $.p90;
        this.p99 = $.p99;
        this.periodSeconds = $.periodSeconds;
        this.requests = $.requests;
        this.suggestedThreshold = $.suggestedThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiShieldOperationFeaturesThresholdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiShieldOperationFeaturesThresholdsArgs $;

        public Builder() {
            $ = new ApiShieldOperationFeaturesThresholdsArgs();
        }

        public Builder(ApiShieldOperationFeaturesThresholdsArgs defaults) {
            $ = new ApiShieldOperationFeaturesThresholdsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authIdTokens The total number of auth-ids seen across this calculation.
         * 
         * @return builder
         * 
         */
        public Builder authIdTokens(@Nullable Output<Integer> authIdTokens) {
            $.authIdTokens = authIdTokens;
            return this;
        }

        /**
         * @param authIdTokens The total number of auth-ids seen across this calculation.
         * 
         * @return builder
         * 
         */
        public Builder authIdTokens(Integer authIdTokens) {
            return authIdTokens(Output.of(authIdTokens));
        }

        /**
         * @param dataPoints The number of data points used for the threshold suggestion calculation.
         * 
         * @return builder
         * 
         */
        public Builder dataPoints(@Nullable Output<Integer> dataPoints) {
            $.dataPoints = dataPoints;
            return this;
        }

        /**
         * @param dataPoints The number of data points used for the threshold suggestion calculation.
         * 
         * @return builder
         * 
         */
        public Builder dataPoints(Integer dataPoints) {
            return dataPoints(Output.of(dataPoints));
        }

        public Builder lastUpdated(@Nullable Output<String> lastUpdated) {
            $.lastUpdated = lastUpdated;
            return this;
        }

        public Builder lastUpdated(String lastUpdated) {
            return lastUpdated(Output.of(lastUpdated));
        }

        /**
         * @param p50 The p50 quantile of requests (in period_seconds).
         * 
         * @return builder
         * 
         */
        public Builder p50(@Nullable Output<Integer> p50) {
            $.p50 = p50;
            return this;
        }

        /**
         * @param p50 The p50 quantile of requests (in period_seconds).
         * 
         * @return builder
         * 
         */
        public Builder p50(Integer p50) {
            return p50(Output.of(p50));
        }

        /**
         * @param p90 The p90 quantile of requests (in period_seconds).
         * 
         * @return builder
         * 
         */
        public Builder p90(@Nullable Output<Integer> p90) {
            $.p90 = p90;
            return this;
        }

        /**
         * @param p90 The p90 quantile of requests (in period_seconds).
         * 
         * @return builder
         * 
         */
        public Builder p90(Integer p90) {
            return p90(Output.of(p90));
        }

        /**
         * @param p99 The p99 quantile of requests (in period_seconds).
         * 
         * @return builder
         * 
         */
        public Builder p99(@Nullable Output<Integer> p99) {
            $.p99 = p99;
            return this;
        }

        /**
         * @param p99 The p99 quantile of requests (in period_seconds).
         * 
         * @return builder
         * 
         */
        public Builder p99(Integer p99) {
            return p99(Output.of(p99));
        }

        /**
         * @param periodSeconds The period over which this threshold is suggested.
         * 
         * @return builder
         * 
         */
        public Builder periodSeconds(@Nullable Output<Integer> periodSeconds) {
            $.periodSeconds = periodSeconds;
            return this;
        }

        /**
         * @param periodSeconds The period over which this threshold is suggested.
         * 
         * @return builder
         * 
         */
        public Builder periodSeconds(Integer periodSeconds) {
            return periodSeconds(Output.of(periodSeconds));
        }

        /**
         * @param requests The estimated number of requests covered by these calculations.
         * 
         * @return builder
         * 
         */
        public Builder requests(@Nullable Output<Integer> requests) {
            $.requests = requests;
            return this;
        }

        /**
         * @param requests The estimated number of requests covered by these calculations.
         * 
         * @return builder
         * 
         */
        public Builder requests(Integer requests) {
            return requests(Output.of(requests));
        }

        /**
         * @param suggestedThreshold The suggested threshold in requests done by the same auth*id or period*seconds.
         * 
         * @return builder
         * 
         */
        public Builder suggestedThreshold(@Nullable Output<Integer> suggestedThreshold) {
            $.suggestedThreshold = suggestedThreshold;
            return this;
        }

        /**
         * @param suggestedThreshold The suggested threshold in requests done by the same auth*id or period*seconds.
         * 
         * @return builder
         * 
         */
        public Builder suggestedThreshold(Integer suggestedThreshold) {
            return suggestedThreshold(Output.of(suggestedThreshold));
        }

        public ApiShieldOperationFeaturesThresholdsArgs build() {
            return $;
        }
    }

}
