// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ZeroTrustAccessApplicationPolicyIncludeSamlArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessApplicationPolicyIncludeSamlArgs Empty = new ZeroTrustAccessApplicationPolicyIncludeSamlArgs();

    /**
     * The name of the SAML attribute.
     * 
     */
    @Import(name="attributeName", required=true)
    private Output<String> attributeName;

    /**
     * @return The name of the SAML attribute.
     * 
     */
    public Output<String> attributeName() {
        return this.attributeName;
    }

    /**
     * The SAML attribute value to look for.
     * 
     */
    @Import(name="attributeValue", required=true)
    private Output<String> attributeValue;

    /**
     * @return The SAML attribute value to look for.
     * 
     */
    public Output<String> attributeValue() {
        return this.attributeValue;
    }

    /**
     * The ID of your SAML identity provider.
     * 
     */
    @Import(name="identityProviderId", required=true)
    private Output<String> identityProviderId;

    /**
     * @return The ID of your SAML identity provider.
     * 
     */
    public Output<String> identityProviderId() {
        return this.identityProviderId;
    }

    private ZeroTrustAccessApplicationPolicyIncludeSamlArgs() {}

    private ZeroTrustAccessApplicationPolicyIncludeSamlArgs(ZeroTrustAccessApplicationPolicyIncludeSamlArgs $) {
        this.attributeName = $.attributeName;
        this.attributeValue = $.attributeValue;
        this.identityProviderId = $.identityProviderId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessApplicationPolicyIncludeSamlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessApplicationPolicyIncludeSamlArgs $;

        public Builder() {
            $ = new ZeroTrustAccessApplicationPolicyIncludeSamlArgs();
        }

        public Builder(ZeroTrustAccessApplicationPolicyIncludeSamlArgs defaults) {
            $ = new ZeroTrustAccessApplicationPolicyIncludeSamlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attributeName The name of the SAML attribute.
         * 
         * @return builder
         * 
         */
        public Builder attributeName(Output<String> attributeName) {
            $.attributeName = attributeName;
            return this;
        }

        /**
         * @param attributeName The name of the SAML attribute.
         * 
         * @return builder
         * 
         */
        public Builder attributeName(String attributeName) {
            return attributeName(Output.of(attributeName));
        }

        /**
         * @param attributeValue The SAML attribute value to look for.
         * 
         * @return builder
         * 
         */
        public Builder attributeValue(Output<String> attributeValue) {
            $.attributeValue = attributeValue;
            return this;
        }

        /**
         * @param attributeValue The SAML attribute value to look for.
         * 
         * @return builder
         * 
         */
        public Builder attributeValue(String attributeValue) {
            return attributeValue(Output.of(attributeValue));
        }

        /**
         * @param identityProviderId The ID of your SAML identity provider.
         * 
         * @return builder
         * 
         */
        public Builder identityProviderId(Output<String> identityProviderId) {
            $.identityProviderId = identityProviderId;
            return this;
        }

        /**
         * @param identityProviderId The ID of your SAML identity provider.
         * 
         * @return builder
         * 
         */
        public Builder identityProviderId(String identityProviderId) {
            return identityProviderId(Output.of(identityProviderId));
        }

        public ZeroTrustAccessApplicationPolicyIncludeSamlArgs build() {
            if ($.attributeName == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessApplicationPolicyIncludeSamlArgs", "attributeName");
            }
            if ($.attributeValue == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessApplicationPolicyIncludeSamlArgs", "attributeValue");
            }
            if ($.identityProviderId == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessApplicationPolicyIncludeSamlArgs", "identityProviderId");
            }
            return $;
        }
    }

}
