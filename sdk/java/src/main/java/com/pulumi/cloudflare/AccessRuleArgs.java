// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.AccessRuleConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessRuleArgs Empty = new AccessRuleArgs();

    /**
     * The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The rule configuration.
     * 
     */
    @Import(name="configuration", required=true)
    private Output<AccessRuleConfigurationArgs> configuration;

    /**
     * @return The rule configuration.
     * 
     */
    public Output<AccessRuleConfigurationArgs> configuration() {
        return this.configuration;
    }

    /**
     * The action to apply to a matched request.
     * Available values: &#34;block&#34;, &#34;challenge&#34;, &#34;whitelist&#34;, &#34;js*challenge&#34;, &#34;managed*challenge&#34;.
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    /**
     * @return The action to apply to a matched request.
     * Available values: &#34;block&#34;, &#34;challenge&#34;, &#34;whitelist&#34;, &#34;js*challenge&#34;, &#34;managed*challenge&#34;.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }

    /**
     * An informative summary of the rule, typically used as a reminder or explanation.
     * 
     */
    @Import(name="notes")
    private @Nullable Output<String> notes;

    /**
     * @return An informative summary of the rule, typically used as a reminder or explanation.
     * 
     */
    public Optional<Output<String>> notes() {
        return Optional.ofNullable(this.notes);
    }

    /**
     * The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private AccessRuleArgs() {}

    private AccessRuleArgs(AccessRuleArgs $) {
        this.accountId = $.accountId;
        this.configuration = $.configuration;
        this.mode = $.mode;
        this.notes = $.notes;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessRuleArgs $;

        public Builder() {
            $ = new AccessRuleArgs();
        }

        public Builder(AccessRuleArgs defaults) {
            $ = new AccessRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param configuration The rule configuration.
         * 
         * @return builder
         * 
         */
        public Builder configuration(Output<AccessRuleConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration The rule configuration.
         * 
         * @return builder
         * 
         */
        public Builder configuration(AccessRuleConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param mode The action to apply to a matched request.
         * Available values: &#34;block&#34;, &#34;challenge&#34;, &#34;whitelist&#34;, &#34;js*challenge&#34;, &#34;managed*challenge&#34;.
         * 
         * @return builder
         * 
         */
        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The action to apply to a matched request.
         * Available values: &#34;block&#34;, &#34;challenge&#34;, &#34;whitelist&#34;, &#34;js*challenge&#34;, &#34;managed*challenge&#34;.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param notes An informative summary of the rule, typically used as a reminder or explanation.
         * 
         * @return builder
         * 
         */
        public Builder notes(@Nullable Output<String> notes) {
            $.notes = notes;
            return this;
        }

        /**
         * @param notes An informative summary of the rule, typically used as a reminder or explanation.
         * 
         * @return builder
         * 
         */
        public Builder notes(String notes) {
            return notes(Output.of(notes));
        }

        /**
         * @param zoneId The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public AccessRuleArgs build() {
            if ($.configuration == null) {
                throw new MissingRequiredPropertyException("AccessRuleArgs", "configuration");
            }
            if ($.mode == null) {
                throw new MissingRequiredPropertyException("AccessRuleArgs", "mode");
            }
            return $;
        }
    }

}
