// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WafRuleState extends com.pulumi.resources.ResourceArgs {

    public static final WafRuleState Empty = new WafRuleState();

    /**
     * The ID of the WAF Rule Group that contains the rule.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return The ID of the WAF Rule Group that contains the rule.
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The mode of the rule, can be one of [&#34;block&#34;, &#34;challenge&#34;, &#34;default&#34;, &#34;disable&#34;, &#34;simulate&#34;] or [&#34;on&#34;, &#34;off&#34;] depending on the WAF Rule type.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return The mode of the rule, can be one of [&#34;block&#34;, &#34;challenge&#34;, &#34;default&#34;, &#34;disable&#34;, &#34;simulate&#34;] or [&#34;on&#34;, &#34;off&#34;] depending on the WAF Rule type.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The ID of the WAF Rule Package that contains the rule.
     * 
     */
    @Import(name="packageId")
    private @Nullable Output<String> packageId;

    /**
     * @return The ID of the WAF Rule Package that contains the rule.
     * 
     */
    public Optional<Output<String>> packageId() {
        return Optional.ofNullable(this.packageId);
    }

    /**
     * The WAF Rule ID.
     * 
     */
    @Import(name="ruleId")
    private @Nullable Output<String> ruleId;

    /**
     * @return The WAF Rule ID.
     * 
     */
    public Optional<Output<String>> ruleId() {
        return Optional.ofNullable(this.ruleId);
    }

    /**
     * The DNS zone ID to apply to.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The DNS zone ID to apply to.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private WafRuleState() {}

    private WafRuleState(WafRuleState $) {
        this.groupId = $.groupId;
        this.mode = $.mode;
        this.packageId = $.packageId;
        this.ruleId = $.ruleId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WafRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WafRuleState $;

        public Builder() {
            $ = new WafRuleState();
        }

        public Builder(WafRuleState defaults) {
            $ = new WafRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupId The ID of the WAF Rule Group that contains the rule.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The ID of the WAF Rule Group that contains the rule.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param mode The mode of the rule, can be one of [&#34;block&#34;, &#34;challenge&#34;, &#34;default&#34;, &#34;disable&#34;, &#34;simulate&#34;] or [&#34;on&#34;, &#34;off&#34;] depending on the WAF Rule type.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The mode of the rule, can be one of [&#34;block&#34;, &#34;challenge&#34;, &#34;default&#34;, &#34;disable&#34;, &#34;simulate&#34;] or [&#34;on&#34;, &#34;off&#34;] depending on the WAF Rule type.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param packageId The ID of the WAF Rule Package that contains the rule.
         * 
         * @return builder
         * 
         */
        public Builder packageId(@Nullable Output<String> packageId) {
            $.packageId = packageId;
            return this;
        }

        /**
         * @param packageId The ID of the WAF Rule Package that contains the rule.
         * 
         * @return builder
         * 
         */
        public Builder packageId(String packageId) {
            return packageId(Output.of(packageId));
        }

        /**
         * @param ruleId The WAF Rule ID.
         * 
         * @return builder
         * 
         */
        public Builder ruleId(@Nullable Output<String> ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        /**
         * @param ruleId The WAF Rule ID.
         * 
         * @return builder
         * 
         */
        public Builder ruleId(String ruleId) {
            return ruleId(Output.of(ruleId));
        }

        /**
         * @param zoneId The DNS zone ID to apply to.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The DNS zone ID to apply to.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public WafRuleState build() {
            return $;
        }
    }

}