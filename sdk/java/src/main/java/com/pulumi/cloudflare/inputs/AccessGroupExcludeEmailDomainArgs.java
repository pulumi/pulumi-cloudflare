// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AccessGroupExcludeEmailDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessGroupExcludeEmailDomainArgs Empty = new AccessGroupExcludeEmailDomainArgs();

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

    private AccessGroupExcludeEmailDomainArgs() {}

    private AccessGroupExcludeEmailDomainArgs(AccessGroupExcludeEmailDomainArgs $) {
        this.domain = $.domain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessGroupExcludeEmailDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessGroupExcludeEmailDomainArgs $;

        public Builder() {
            $ = new AccessGroupExcludeEmailDomainArgs();
        }

        public Builder(AccessGroupExcludeEmailDomainArgs defaults) {
            $ = new AccessGroupExcludeEmailDomainArgs(Objects.requireNonNull(defaults));
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

        public AccessGroupExcludeEmailDomainArgs build() {
            if ($.domain == null) {
                throw new MissingRequiredPropertyException("AccessGroupExcludeEmailDomainArgs", "domain");
            }
            return $;
        }
    }

}
