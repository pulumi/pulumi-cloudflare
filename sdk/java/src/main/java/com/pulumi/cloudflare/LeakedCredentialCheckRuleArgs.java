// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class LeakedCredentialCheckRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final LeakedCredentialCheckRuleArgs Empty = new LeakedCredentialCheckRuleArgs();

    /**
     * The ruleset expression to use in matching the password in a request
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return The ruleset expression to use in matching the password in a request
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * The ruleset expression to use in matching the username in a request.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The ruleset expression to use in matching the username in a request.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     * The zone identifier to target for the resource.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private LeakedCredentialCheckRuleArgs() {}

    private LeakedCredentialCheckRuleArgs(LeakedCredentialCheckRuleArgs $) {
        this.password = $.password;
        this.username = $.username;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LeakedCredentialCheckRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LeakedCredentialCheckRuleArgs $;

        public Builder() {
            $ = new LeakedCredentialCheckRuleArgs();
        }

        public Builder(LeakedCredentialCheckRuleArgs defaults) {
            $ = new LeakedCredentialCheckRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password The ruleset expression to use in matching the password in a request
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The ruleset expression to use in matching the password in a request
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username The ruleset expression to use in matching the username in a request.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The ruleset expression to use in matching the username in a request.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public LeakedCredentialCheckRuleArgs build() {
            if ($.password == null) {
                throw new MissingRequiredPropertyException("LeakedCredentialCheckRuleArgs", "password");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("LeakedCredentialCheckRuleArgs", "username");
            }
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("LeakedCredentialCheckRuleArgs", "zoneId");
            }
            return $;
        }
    }

}
