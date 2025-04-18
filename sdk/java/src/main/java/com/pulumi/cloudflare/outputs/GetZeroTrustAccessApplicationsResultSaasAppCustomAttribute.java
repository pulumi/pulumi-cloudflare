// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetZeroTrustAccessApplicationsResultSaasAppCustomAttributeSource;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZeroTrustAccessApplicationsResultSaasAppCustomAttribute {
    /**
     * @return The SAML FriendlyName of the attribute.
     * 
     */
    private String friendlyName;
    /**
     * @return The name of the attribute.
     * 
     */
    private String name;
    /**
     * @return A globally unique name for an identity or service provider.
     * Available values: &#34;urn:oasis:names:tc:SAML:2.0:attrname-format:unspecified&#34;, &#34;urn:oasis:names:tc:SAML:2.0:attrname-format:basic&#34;, &#34;urn:oasis:names:tc:SAML:2.0:attrname-format:uri&#34;.
     * 
     */
    private String nameFormat;
    /**
     * @return If the attribute is required when building a SAML assertion.
     * 
     */
    private Boolean required;
    private GetZeroTrustAccessApplicationsResultSaasAppCustomAttributeSource source;

    private GetZeroTrustAccessApplicationsResultSaasAppCustomAttribute() {}
    /**
     * @return The SAML FriendlyName of the attribute.
     * 
     */
    public String friendlyName() {
        return this.friendlyName;
    }
    /**
     * @return The name of the attribute.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A globally unique name for an identity or service provider.
     * Available values: &#34;urn:oasis:names:tc:SAML:2.0:attrname-format:unspecified&#34;, &#34;urn:oasis:names:tc:SAML:2.0:attrname-format:basic&#34;, &#34;urn:oasis:names:tc:SAML:2.0:attrname-format:uri&#34;.
     * 
     */
    public String nameFormat() {
        return this.nameFormat;
    }
    /**
     * @return If the attribute is required when building a SAML assertion.
     * 
     */
    public Boolean required() {
        return this.required;
    }
    public GetZeroTrustAccessApplicationsResultSaasAppCustomAttributeSource source() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustAccessApplicationsResultSaasAppCustomAttribute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String friendlyName;
        private String name;
        private String nameFormat;
        private Boolean required;
        private GetZeroTrustAccessApplicationsResultSaasAppCustomAttributeSource source;
        public Builder() {}
        public Builder(GetZeroTrustAccessApplicationsResultSaasAppCustomAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.friendlyName = defaults.friendlyName;
    	      this.name = defaults.name;
    	      this.nameFormat = defaults.nameFormat;
    	      this.required = defaults.required;
    	      this.source = defaults.source;
        }

        @CustomType.Setter
        public Builder friendlyName(String friendlyName) {
            if (friendlyName == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessApplicationsResultSaasAppCustomAttribute", "friendlyName");
            }
            this.friendlyName = friendlyName;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessApplicationsResultSaasAppCustomAttribute", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nameFormat(String nameFormat) {
            if (nameFormat == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessApplicationsResultSaasAppCustomAttribute", "nameFormat");
            }
            this.nameFormat = nameFormat;
            return this;
        }
        @CustomType.Setter
        public Builder required(Boolean required) {
            if (required == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessApplicationsResultSaasAppCustomAttribute", "required");
            }
            this.required = required;
            return this;
        }
        @CustomType.Setter
        public Builder source(GetZeroTrustAccessApplicationsResultSaasAppCustomAttributeSource source) {
            if (source == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessApplicationsResultSaasAppCustomAttribute", "source");
            }
            this.source = source;
            return this;
        }
        public GetZeroTrustAccessApplicationsResultSaasAppCustomAttribute build() {
            final var _resultValue = new GetZeroTrustAccessApplicationsResultSaasAppCustomAttribute();
            _resultValue.friendlyName = friendlyName;
            _resultValue.name = name;
            _resultValue.nameFormat = nameFormat;
            _resultValue.required = required;
            _resultValue.source = source;
            return _resultValue;
        }
    }
}
