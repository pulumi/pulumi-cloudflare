// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.CustomHostnameSslCustomCertBundleArgs;
import com.pulumi.cloudflare.inputs.CustomHostnameSslSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomHostnameSslArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomHostnameSslArgs Empty = new CustomHostnameSslArgs();

    /**
     * A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
     * Available values: &#34;ubiquitous&#34;, &#34;optimal&#34;, &#34;force&#34;.
     * 
     */
    @Import(name="bundleMethod")
    private @Nullable Output<String> bundleMethod;

    /**
     * @return A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
     * Available values: &#34;ubiquitous&#34;, &#34;optimal&#34;, &#34;force&#34;.
     * 
     */
    public Optional<Output<String>> bundleMethod() {
        return Optional.ofNullable(this.bundleMethod);
    }

    /**
     * The Certificate Authority that will issue the certificate
     * Available values: &#34;digicert&#34;, &#34;google&#34;, &#34;lets*encrypt&#34;, &#34;ssl*com&#34;.
     * 
     */
    @Import(name="certificateAuthority")
    private @Nullable Output<String> certificateAuthority;

    /**
     * @return The Certificate Authority that will issue the certificate
     * Available values: &#34;digicert&#34;, &#34;google&#34;, &#34;lets*encrypt&#34;, &#34;ssl*com&#34;.
     * 
     */
    public Optional<Output<String>> certificateAuthority() {
        return Optional.ofNullable(this.certificateAuthority);
    }

    /**
     * Whether or not to add Cloudflare Branding for the order.  This will add a subdomain of sni.cloudflaressl.com as the Common Name if set to true
     * 
     */
    @Import(name="cloudflareBranding")
    private @Nullable Output<Boolean> cloudflareBranding;

    /**
     * @return Whether or not to add Cloudflare Branding for the order.  This will add a subdomain of sni.cloudflaressl.com as the Common Name if set to true
     * 
     */
    public Optional<Output<Boolean>> cloudflareBranding() {
        return Optional.ofNullable(this.cloudflareBranding);
    }

    /**
     * Array of custom certificate and key pairs (1 or 2 pairs allowed)
     * 
     */
    @Import(name="customCertBundles")
    private @Nullable Output<List<CustomHostnameSslCustomCertBundleArgs>> customCertBundles;

    /**
     * @return Array of custom certificate and key pairs (1 or 2 pairs allowed)
     * 
     */
    public Optional<Output<List<CustomHostnameSslCustomCertBundleArgs>>> customCertBundles() {
        return Optional.ofNullable(this.customCertBundles);
    }

    /**
     * If a custom uploaded certificate is used.
     * 
     */
    @Import(name="customCertificate")
    private @Nullable Output<String> customCertificate;

    /**
     * @return If a custom uploaded certificate is used.
     * 
     */
    public Optional<Output<String>> customCertificate() {
        return Optional.ofNullable(this.customCertificate);
    }

    /**
     * The key for a custom uploaded certificate.
     * 
     */
    @Import(name="customKey")
    private @Nullable Output<String> customKey;

    /**
     * @return The key for a custom uploaded certificate.
     * 
     */
    public Optional<Output<String>> customKey() {
        return Optional.ofNullable(this.customKey);
    }

    /**
     * Domain control validation (DCV) method used for this hostname.
     * Available values: &#34;http&#34;, &#34;txt&#34;, &#34;email&#34;.
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    /**
     * @return Domain control validation (DCV) method used for this hostname.
     * Available values: &#34;http&#34;, &#34;txt&#34;, &#34;email&#34;.
     * 
     */
    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * SSL specific settings.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<CustomHostnameSslSettingsArgs> settings;

    /**
     * @return SSL specific settings.
     * 
     */
    public Optional<Output<CustomHostnameSslSettingsArgs>> settings() {
        return Optional.ofNullable(this.settings);
    }

    /**
     * Level of validation to be used for this hostname. Domain validation (dv) must be used.
     * Available values: &#34;dv&#34;.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Level of validation to be used for this hostname. Domain validation (dv) must be used.
     * Available values: &#34;dv&#34;.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Indicates whether the certificate covers a wildcard.
     * 
     */
    @Import(name="wildcard")
    private @Nullable Output<Boolean> wildcard;

    /**
     * @return Indicates whether the certificate covers a wildcard.
     * 
     */
    public Optional<Output<Boolean>> wildcard() {
        return Optional.ofNullable(this.wildcard);
    }

    private CustomHostnameSslArgs() {}

    private CustomHostnameSslArgs(CustomHostnameSslArgs $) {
        this.bundleMethod = $.bundleMethod;
        this.certificateAuthority = $.certificateAuthority;
        this.cloudflareBranding = $.cloudflareBranding;
        this.customCertBundles = $.customCertBundles;
        this.customCertificate = $.customCertificate;
        this.customKey = $.customKey;
        this.method = $.method;
        this.settings = $.settings;
        this.type = $.type;
        this.wildcard = $.wildcard;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomHostnameSslArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomHostnameSslArgs $;

        public Builder() {
            $ = new CustomHostnameSslArgs();
        }

        public Builder(CustomHostnameSslArgs defaults) {
            $ = new CustomHostnameSslArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bundleMethod A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
         * Available values: &#34;ubiquitous&#34;, &#34;optimal&#34;, &#34;force&#34;.
         * 
         * @return builder
         * 
         */
        public Builder bundleMethod(@Nullable Output<String> bundleMethod) {
            $.bundleMethod = bundleMethod;
            return this;
        }

        /**
         * @param bundleMethod A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
         * Available values: &#34;ubiquitous&#34;, &#34;optimal&#34;, &#34;force&#34;.
         * 
         * @return builder
         * 
         */
        public Builder bundleMethod(String bundleMethod) {
            return bundleMethod(Output.of(bundleMethod));
        }

        /**
         * @param certificateAuthority The Certificate Authority that will issue the certificate
         * Available values: &#34;digicert&#34;, &#34;google&#34;, &#34;lets*encrypt&#34;, &#34;ssl*com&#34;.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthority(@Nullable Output<String> certificateAuthority) {
            $.certificateAuthority = certificateAuthority;
            return this;
        }

        /**
         * @param certificateAuthority The Certificate Authority that will issue the certificate
         * Available values: &#34;digicert&#34;, &#34;google&#34;, &#34;lets*encrypt&#34;, &#34;ssl*com&#34;.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthority(String certificateAuthority) {
            return certificateAuthority(Output.of(certificateAuthority));
        }

        /**
         * @param cloudflareBranding Whether or not to add Cloudflare Branding for the order.  This will add a subdomain of sni.cloudflaressl.com as the Common Name if set to true
         * 
         * @return builder
         * 
         */
        public Builder cloudflareBranding(@Nullable Output<Boolean> cloudflareBranding) {
            $.cloudflareBranding = cloudflareBranding;
            return this;
        }

        /**
         * @param cloudflareBranding Whether or not to add Cloudflare Branding for the order.  This will add a subdomain of sni.cloudflaressl.com as the Common Name if set to true
         * 
         * @return builder
         * 
         */
        public Builder cloudflareBranding(Boolean cloudflareBranding) {
            return cloudflareBranding(Output.of(cloudflareBranding));
        }

        /**
         * @param customCertBundles Array of custom certificate and key pairs (1 or 2 pairs allowed)
         * 
         * @return builder
         * 
         */
        public Builder customCertBundles(@Nullable Output<List<CustomHostnameSslCustomCertBundleArgs>> customCertBundles) {
            $.customCertBundles = customCertBundles;
            return this;
        }

        /**
         * @param customCertBundles Array of custom certificate and key pairs (1 or 2 pairs allowed)
         * 
         * @return builder
         * 
         */
        public Builder customCertBundles(List<CustomHostnameSslCustomCertBundleArgs> customCertBundles) {
            return customCertBundles(Output.of(customCertBundles));
        }

        /**
         * @param customCertBundles Array of custom certificate and key pairs (1 or 2 pairs allowed)
         * 
         * @return builder
         * 
         */
        public Builder customCertBundles(CustomHostnameSslCustomCertBundleArgs... customCertBundles) {
            return customCertBundles(List.of(customCertBundles));
        }

        /**
         * @param customCertificate If a custom uploaded certificate is used.
         * 
         * @return builder
         * 
         */
        public Builder customCertificate(@Nullable Output<String> customCertificate) {
            $.customCertificate = customCertificate;
            return this;
        }

        /**
         * @param customCertificate If a custom uploaded certificate is used.
         * 
         * @return builder
         * 
         */
        public Builder customCertificate(String customCertificate) {
            return customCertificate(Output.of(customCertificate));
        }

        /**
         * @param customKey The key for a custom uploaded certificate.
         * 
         * @return builder
         * 
         */
        public Builder customKey(@Nullable Output<String> customKey) {
            $.customKey = customKey;
            return this;
        }

        /**
         * @param customKey The key for a custom uploaded certificate.
         * 
         * @return builder
         * 
         */
        public Builder customKey(String customKey) {
            return customKey(Output.of(customKey));
        }

        /**
         * @param method Domain control validation (DCV) method used for this hostname.
         * Available values: &#34;http&#34;, &#34;txt&#34;, &#34;email&#34;.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method Domain control validation (DCV) method used for this hostname.
         * Available values: &#34;http&#34;, &#34;txt&#34;, &#34;email&#34;.
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param settings SSL specific settings.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<CustomHostnameSslSettingsArgs> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings SSL specific settings.
         * 
         * @return builder
         * 
         */
        public Builder settings(CustomHostnameSslSettingsArgs settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param type Level of validation to be used for this hostname. Domain validation (dv) must be used.
         * Available values: &#34;dv&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Level of validation to be used for this hostname. Domain validation (dv) must be used.
         * Available values: &#34;dv&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param wildcard Indicates whether the certificate covers a wildcard.
         * 
         * @return builder
         * 
         */
        public Builder wildcard(@Nullable Output<Boolean> wildcard) {
            $.wildcard = wildcard;
            return this;
        }

        /**
         * @param wildcard Indicates whether the certificate covers a wildcard.
         * 
         * @return builder
         * 
         */
        public Builder wildcard(Boolean wildcard) {
            return wildcard(Output.of(wildcard));
        }

        public CustomHostnameSslArgs build() {
            return $;
        }
    }

}
