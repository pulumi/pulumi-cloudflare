// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZeroTrustAccessGroupsResultExcludeSaml {
    /**
     * @return The name of the SAML attribute.
     * 
     */
    private String attributeName;
    /**
     * @return The SAML attribute value to look for.
     * 
     */
    private String attributeValue;
    /**
     * @return The ID of your SAML identity provider.
     * 
     */
    private String identityProviderId;

    private GetZeroTrustAccessGroupsResultExcludeSaml() {}
    /**
     * @return The name of the SAML attribute.
     * 
     */
    public String attributeName() {
        return this.attributeName;
    }
    /**
     * @return The SAML attribute value to look for.
     * 
     */
    public String attributeValue() {
        return this.attributeValue;
    }
    /**
     * @return The ID of your SAML identity provider.
     * 
     */
    public String identityProviderId() {
        return this.identityProviderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustAccessGroupsResultExcludeSaml defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String attributeName;
        private String attributeValue;
        private String identityProviderId;
        public Builder() {}
        public Builder(GetZeroTrustAccessGroupsResultExcludeSaml defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeName = defaults.attributeName;
    	      this.attributeValue = defaults.attributeValue;
    	      this.identityProviderId = defaults.identityProviderId;
        }

        @CustomType.Setter
        public Builder attributeName(String attributeName) {
            if (attributeName == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExcludeSaml", "attributeName");
            }
            this.attributeName = attributeName;
            return this;
        }
        @CustomType.Setter
        public Builder attributeValue(String attributeValue) {
            if (attributeValue == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExcludeSaml", "attributeValue");
            }
            this.attributeValue = attributeValue;
            return this;
        }
        @CustomType.Setter
        public Builder identityProviderId(String identityProviderId) {
            if (identityProviderId == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExcludeSaml", "identityProviderId");
            }
            this.identityProviderId = identityProviderId;
            return this;
        }
        public GetZeroTrustAccessGroupsResultExcludeSaml build() {
            final var _resultValue = new GetZeroTrustAccessGroupsResultExcludeSaml();
            _resultValue.attributeName = attributeName;
            _resultValue.attributeValue = attributeValue;
            _resultValue.identityProviderId = identityProviderId;
            return _resultValue;
        }
    }
}
