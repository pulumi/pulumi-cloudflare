// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ZeroTrustAccessPolicyIncludeAuthMethodArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessPolicyIncludeAuthMethodArgs Empty = new ZeroTrustAccessPolicyIncludeAuthMethodArgs();

    /**
     * The type of authentication method https://datatracker.ietf.org/doc/html/rfc8176#section-2.
     * 
     */
    @Import(name="authMethod", required=true)
    private Output<String> authMethod;

    /**
     * @return The type of authentication method https://datatracker.ietf.org/doc/html/rfc8176#section-2.
     * 
     */
    public Output<String> authMethod() {
        return this.authMethod;
    }

    private ZeroTrustAccessPolicyIncludeAuthMethodArgs() {}

    private ZeroTrustAccessPolicyIncludeAuthMethodArgs(ZeroTrustAccessPolicyIncludeAuthMethodArgs $) {
        this.authMethod = $.authMethod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessPolicyIncludeAuthMethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessPolicyIncludeAuthMethodArgs $;

        public Builder() {
            $ = new ZeroTrustAccessPolicyIncludeAuthMethodArgs();
        }

        public Builder(ZeroTrustAccessPolicyIncludeAuthMethodArgs defaults) {
            $ = new ZeroTrustAccessPolicyIncludeAuthMethodArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authMethod The type of authentication method https://datatracker.ietf.org/doc/html/rfc8176#section-2.
         * 
         * @return builder
         * 
         */
        public Builder authMethod(Output<String> authMethod) {
            $.authMethod = authMethod;
            return this;
        }

        /**
         * @param authMethod The type of authentication method https://datatracker.ietf.org/doc/html/rfc8176#section-2.
         * 
         * @return builder
         * 
         */
        public Builder authMethod(String authMethod) {
            return authMethod(Output.of(authMethod));
        }

        public ZeroTrustAccessPolicyIncludeAuthMethodArgs build() {
            if ($.authMethod == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessPolicyIncludeAuthMethodArgs", "authMethod");
            }
            return $;
        }
    }

}
