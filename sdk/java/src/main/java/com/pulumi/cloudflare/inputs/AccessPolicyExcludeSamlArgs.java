// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPolicyExcludeSamlArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPolicyExcludeSamlArgs Empty = new AccessPolicyExcludeSamlArgs();

    /**
     * The name of the SAML attribute.
     * 
     */
    @Import(name="attributeName")
    private @Nullable Output<String> attributeName;

    /**
     * @return The name of the SAML attribute.
     * 
     */
    public Optional<Output<String>> attributeName() {
        return Optional.ofNullable(this.attributeName);
    }

    /**
     * The SAML attribute value to look for.
     * 
     */
    @Import(name="attributeValue")
    private @Nullable Output<String> attributeValue;

    /**
     * @return The SAML attribute value to look for.
     * 
     */
    public Optional<Output<String>> attributeValue() {
        return Optional.ofNullable(this.attributeValue);
    }

    /**
     * The ID of your SAML identity provider.
     * 
     */
    @Import(name="identityProviderId")
    private @Nullable Output<String> identityProviderId;

    /**
     * @return The ID of your SAML identity provider.
     * 
     */
    public Optional<Output<String>> identityProviderId() {
        return Optional.ofNullable(this.identityProviderId);
    }

    private AccessPolicyExcludeSamlArgs() {}

    private AccessPolicyExcludeSamlArgs(AccessPolicyExcludeSamlArgs $) {
        this.attributeName = $.attributeName;
        this.attributeValue = $.attributeValue;
        this.identityProviderId = $.identityProviderId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPolicyExcludeSamlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPolicyExcludeSamlArgs $;

        public Builder() {
            $ = new AccessPolicyExcludeSamlArgs();
        }

        public Builder(AccessPolicyExcludeSamlArgs defaults) {
            $ = new AccessPolicyExcludeSamlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attributeName The name of the SAML attribute.
         * 
         * @return builder
         * 
         */
        public Builder attributeName(@Nullable Output<String> attributeName) {
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
        public Builder attributeValue(@Nullable Output<String> attributeValue) {
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
        public Builder identityProviderId(@Nullable Output<String> identityProviderId) {
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

        public AccessPolicyExcludeSamlArgs build() {
            return $;
        }
    }

}
