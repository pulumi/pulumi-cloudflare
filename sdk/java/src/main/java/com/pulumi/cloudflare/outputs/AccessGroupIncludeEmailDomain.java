// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AccessGroupIncludeEmailDomain {
    /**
     * @return The email domain to match.
     * 
     */
    private String domain;

    private AccessGroupIncludeEmailDomain() {}
    /**
     * @return The email domain to match.
     * 
     */
    public String domain() {
        return this.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessGroupIncludeEmailDomain defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String domain;
        public Builder() {}
        public Builder(AccessGroupIncludeEmailDomain defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
        }

        @CustomType.Setter
        public Builder domain(String domain) {
            if (domain == null) {
              throw new MissingRequiredPropertyException("AccessGroupIncludeEmailDomain", "domain");
            }
            this.domain = domain;
            return this;
        }
        public AccessGroupIncludeEmailDomain build() {
            final var _resultValue = new AccessGroupIncludeEmailDomain();
            _resultValue.domain = domain;
            return _resultValue;
        }
    }
}
