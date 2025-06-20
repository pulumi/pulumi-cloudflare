// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessRuleConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessRuleConfigurationArgs Empty = new AccessRuleConfigurationArgs();

    /**
     * The configuration target. You must set the target to `ip` when specifying an IP address in the rule.
     * Available values: &#34;ip&#34;, &#34;ip6&#34;, &#34;ip_range&#34;, &#34;asn&#34;, &#34;country&#34;.
     * 
     */
    @Import(name="target")
    private @Nullable Output<String> target;

    /**
     * @return The configuration target. You must set the target to `ip` when specifying an IP address in the rule.
     * Available values: &#34;ip&#34;, &#34;ip6&#34;, &#34;ip_range&#34;, &#34;asn&#34;, &#34;country&#34;.
     * 
     */
    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    /**
     * The IP address to match. This address will be compared to the IP address of incoming requests.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The IP address to match. This address will be compared to the IP address of incoming requests.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private AccessRuleConfigurationArgs() {}

    private AccessRuleConfigurationArgs(AccessRuleConfigurationArgs $) {
        this.target = $.target;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessRuleConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessRuleConfigurationArgs $;

        public Builder() {
            $ = new AccessRuleConfigurationArgs();
        }

        public Builder(AccessRuleConfigurationArgs defaults) {
            $ = new AccessRuleConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param target The configuration target. You must set the target to `ip` when specifying an IP address in the rule.
         * Available values: &#34;ip&#34;, &#34;ip6&#34;, &#34;ip_range&#34;, &#34;asn&#34;, &#34;country&#34;.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The configuration target. You must set the target to `ip` when specifying an IP address in the rule.
         * Available values: &#34;ip&#34;, &#34;ip6&#34;, &#34;ip_range&#34;, &#34;asn&#34;, &#34;country&#34;.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        /**
         * @param value The IP address to match. This address will be compared to the IP address of incoming requests.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The IP address to match. This address will be compared to the IP address of incoming requests.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public AccessRuleConfigurationArgs build() {
            return $;
        }
    }

}
