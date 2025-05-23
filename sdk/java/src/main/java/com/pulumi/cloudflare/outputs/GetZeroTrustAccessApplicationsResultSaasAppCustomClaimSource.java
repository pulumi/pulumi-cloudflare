// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetZeroTrustAccessApplicationsResultSaasAppCustomClaimSource {
    /**
     * @return The name of the IdP claim.
     * 
     */
    private String name;
    /**
     * @return A mapping from IdP ID to claim name.
     * 
     */
    private Map<String,String> nameByIdp;

    private GetZeroTrustAccessApplicationsResultSaasAppCustomClaimSource() {}
    /**
     * @return The name of the IdP claim.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A mapping from IdP ID to claim name.
     * 
     */
    public Map<String,String> nameByIdp() {
        return this.nameByIdp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustAccessApplicationsResultSaasAppCustomClaimSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private Map<String,String> nameByIdp;
        public Builder() {}
        public Builder(GetZeroTrustAccessApplicationsResultSaasAppCustomClaimSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.nameByIdp = defaults.nameByIdp;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessApplicationsResultSaasAppCustomClaimSource", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nameByIdp(Map<String,String> nameByIdp) {
            if (nameByIdp == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessApplicationsResultSaasAppCustomClaimSource", "nameByIdp");
            }
            this.nameByIdp = nameByIdp;
            return this;
        }
        public GetZeroTrustAccessApplicationsResultSaasAppCustomClaimSource build() {
            final var _resultValue = new GetZeroTrustAccessApplicationsResultSaasAppCustomClaimSource();
            _resultValue.name = name;
            _resultValue.nameByIdp = nameByIdp;
            return _resultValue;
        }
    }
}
