// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetZeroTrustAccessApplicationsResultPolicyConnectionRulesSsh {
    /**
     * @return Enables using Identity Provider email alias as SSH username.
     * 
     */
    private Boolean allowEmailAlias;
    /**
     * @return Contains the Unix usernames that may be used when connecting over SSH.
     * 
     */
    private List<String> usernames;

    private GetZeroTrustAccessApplicationsResultPolicyConnectionRulesSsh() {}
    /**
     * @return Enables using Identity Provider email alias as SSH username.
     * 
     */
    public Boolean allowEmailAlias() {
        return this.allowEmailAlias;
    }
    /**
     * @return Contains the Unix usernames that may be used when connecting over SSH.
     * 
     */
    public List<String> usernames() {
        return this.usernames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustAccessApplicationsResultPolicyConnectionRulesSsh defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowEmailAlias;
        private List<String> usernames;
        public Builder() {}
        public Builder(GetZeroTrustAccessApplicationsResultPolicyConnectionRulesSsh defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowEmailAlias = defaults.allowEmailAlias;
    	      this.usernames = defaults.usernames;
        }

        @CustomType.Setter
        public Builder allowEmailAlias(Boolean allowEmailAlias) {
            if (allowEmailAlias == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessApplicationsResultPolicyConnectionRulesSsh", "allowEmailAlias");
            }
            this.allowEmailAlias = allowEmailAlias;
            return this;
        }
        @CustomType.Setter
        public Builder usernames(List<String> usernames) {
            if (usernames == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessApplicationsResultPolicyConnectionRulesSsh", "usernames");
            }
            this.usernames = usernames;
            return this;
        }
        public Builder usernames(String... usernames) {
            return usernames(List.of(usernames));
        }
        public GetZeroTrustAccessApplicationsResultPolicyConnectionRulesSsh build() {
            final var _resultValue = new GetZeroTrustAccessApplicationsResultPolicyConnectionRulesSsh();
            _resultValue.allowEmailAlias = allowEmailAlias;
            _resultValue.usernames = usernames;
            return _resultValue;
        }
    }
}
