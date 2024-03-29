// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAnalyticsRuleState extends com.pulumi.resources.ResourceArgs {

    public static final WebAnalyticsRuleState Empty = new WebAnalyticsRuleState();

    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The host to apply the rule to.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return The host to apply the rule to.
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
     * 
     */
    @Import(name="inclusive")
    private @Nullable Output<Boolean> inclusive;

    /**
     * @return Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
     * 
     */
    public Optional<Output<Boolean>> inclusive() {
        return Optional.ofNullable(this.inclusive);
    }

    /**
     * Whether the rule is paused or not.
     * 
     */
    @Import(name="isPaused")
    private @Nullable Output<Boolean> isPaused;

    /**
     * @return Whether the rule is paused or not.
     * 
     */
    public Optional<Output<Boolean>> isPaused() {
        return Optional.ofNullable(this.isPaused);
    }

    /**
     * A list of paths to apply the rule to.
     * 
     */
    @Import(name="paths")
    private @Nullable Output<List<String>> paths;

    /**
     * @return A list of paths to apply the rule to.
     * 
     */
    public Optional<Output<List<String>>> paths() {
        return Optional.ofNullable(this.paths);
    }

    /**
     * The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="rulesetId")
    private @Nullable Output<String> rulesetId;

    /**
     * @return The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> rulesetId() {
        return Optional.ofNullable(this.rulesetId);
    }

    private WebAnalyticsRuleState() {}

    private WebAnalyticsRuleState(WebAnalyticsRuleState $) {
        this.accountId = $.accountId;
        this.host = $.host;
        this.inclusive = $.inclusive;
        this.isPaused = $.isPaused;
        this.paths = $.paths;
        this.rulesetId = $.rulesetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAnalyticsRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAnalyticsRuleState $;

        public Builder() {
            $ = new WebAnalyticsRuleState();
        }

        public Builder(WebAnalyticsRuleState defaults) {
            $ = new WebAnalyticsRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param host The host to apply the rule to.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The host to apply the rule to.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param inclusive Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
         * 
         * @return builder
         * 
         */
        public Builder inclusive(@Nullable Output<Boolean> inclusive) {
            $.inclusive = inclusive;
            return this;
        }

        /**
         * @param inclusive Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
         * 
         * @return builder
         * 
         */
        public Builder inclusive(Boolean inclusive) {
            return inclusive(Output.of(inclusive));
        }

        /**
         * @param isPaused Whether the rule is paused or not.
         * 
         * @return builder
         * 
         */
        public Builder isPaused(@Nullable Output<Boolean> isPaused) {
            $.isPaused = isPaused;
            return this;
        }

        /**
         * @param isPaused Whether the rule is paused or not.
         * 
         * @return builder
         * 
         */
        public Builder isPaused(Boolean isPaused) {
            return isPaused(Output.of(isPaused));
        }

        /**
         * @param paths A list of paths to apply the rule to.
         * 
         * @return builder
         * 
         */
        public Builder paths(@Nullable Output<List<String>> paths) {
            $.paths = paths;
            return this;
        }

        /**
         * @param paths A list of paths to apply the rule to.
         * 
         * @return builder
         * 
         */
        public Builder paths(List<String> paths) {
            return paths(Output.of(paths));
        }

        /**
         * @param paths A list of paths to apply the rule to.
         * 
         * @return builder
         * 
         */
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }

        /**
         * @param rulesetId The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder rulesetId(@Nullable Output<String> rulesetId) {
            $.rulesetId = rulesetId;
            return this;
        }

        /**
         * @param rulesetId The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder rulesetId(String rulesetId) {
            return rulesetId(Output.of(rulesetId));
        }

        public WebAnalyticsRuleState build() {
            return $;
        }
    }

}
