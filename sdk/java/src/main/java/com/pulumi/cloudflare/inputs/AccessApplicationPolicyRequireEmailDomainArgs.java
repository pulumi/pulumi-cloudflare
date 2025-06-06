// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AccessApplicationPolicyRequireEmailDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessApplicationPolicyRequireEmailDomainArgs Empty = new AccessApplicationPolicyRequireEmailDomainArgs();

    /**
     * The email domain to match.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return The email domain to match.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    private AccessApplicationPolicyRequireEmailDomainArgs() {}

    private AccessApplicationPolicyRequireEmailDomainArgs(AccessApplicationPolicyRequireEmailDomainArgs $) {
        this.domain = $.domain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessApplicationPolicyRequireEmailDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessApplicationPolicyRequireEmailDomainArgs $;

        public Builder() {
            $ = new AccessApplicationPolicyRequireEmailDomainArgs();
        }

        public Builder(AccessApplicationPolicyRequireEmailDomainArgs defaults) {
            $ = new AccessApplicationPolicyRequireEmailDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The email domain to match.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The email domain to match.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public AccessApplicationPolicyRequireEmailDomainArgs build() {
            if ($.domain == null) {
                throw new MissingRequiredPropertyException("AccessApplicationPolicyRequireEmailDomainArgs", "domain");
            }
            return $;
        }
    }

}
