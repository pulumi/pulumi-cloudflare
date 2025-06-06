// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.CustomHostnameSslCustomCertBundle;
import com.pulumi.cloudflare.outputs.CustomHostnameSslSettings;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomHostnameSsl {
    /**
     * @return A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
     * Available values: &#34;ubiquitous&#34;, &#34;optimal&#34;, &#34;force&#34;.
     * 
     */
    private @Nullable String bundleMethod;
    /**
     * @return The Certificate Authority that will issue the certificate
     * Available values: &#34;digicert&#34;, &#34;google&#34;, &#34;lets*encrypt&#34;, &#34;ssl*com&#34;.
     * 
     */
    private @Nullable String certificateAuthority;
    /**
     * @return Whether or not to add Cloudflare Branding for the order.  This will add a subdomain of sni.cloudflaressl.com as the Common Name if set to true
     * 
     */
    private @Nullable Boolean cloudflareBranding;
    /**
     * @return Array of custom certificate and key pairs (1 or 2 pairs allowed)
     * 
     */
    private @Nullable List<CustomHostnameSslCustomCertBundle> customCertBundles;
    /**
     * @return If a custom uploaded certificate is used.
     * 
     */
    private @Nullable String customCertificate;
    /**
     * @return The key for a custom uploaded certificate.
     * 
     */
    private @Nullable String customKey;
    /**
     * @return Domain control validation (DCV) method used for this hostname.
     * Available values: &#34;http&#34;, &#34;txt&#34;, &#34;email&#34;.
     * 
     */
    private @Nullable String method;
    /**
     * @return SSL specific settings.
     * 
     */
    private @Nullable CustomHostnameSslSettings settings;
    /**
     * @return Level of validation to be used for this hostname. Domain validation (dv) must be used.
     * Available values: &#34;dv&#34;.
     * 
     */
    private @Nullable String type;
    /**
     * @return Indicates whether the certificate covers a wildcard.
     * 
     */
    private @Nullable Boolean wildcard;

    private CustomHostnameSsl() {}
    /**
     * @return A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
     * Available values: &#34;ubiquitous&#34;, &#34;optimal&#34;, &#34;force&#34;.
     * 
     */
    public Optional<String> bundleMethod() {
        return Optional.ofNullable(this.bundleMethod);
    }
    /**
     * @return The Certificate Authority that will issue the certificate
     * Available values: &#34;digicert&#34;, &#34;google&#34;, &#34;lets*encrypt&#34;, &#34;ssl*com&#34;.
     * 
     */
    public Optional<String> certificateAuthority() {
        return Optional.ofNullable(this.certificateAuthority);
    }
    /**
     * @return Whether or not to add Cloudflare Branding for the order.  This will add a subdomain of sni.cloudflaressl.com as the Common Name if set to true
     * 
     */
    public Optional<Boolean> cloudflareBranding() {
        return Optional.ofNullable(this.cloudflareBranding);
    }
    /**
     * @return Array of custom certificate and key pairs (1 or 2 pairs allowed)
     * 
     */
    public List<CustomHostnameSslCustomCertBundle> customCertBundles() {
        return this.customCertBundles == null ? List.of() : this.customCertBundles;
    }
    /**
     * @return If a custom uploaded certificate is used.
     * 
     */
    public Optional<String> customCertificate() {
        return Optional.ofNullable(this.customCertificate);
    }
    /**
     * @return The key for a custom uploaded certificate.
     * 
     */
    public Optional<String> customKey() {
        return Optional.ofNullable(this.customKey);
    }
    /**
     * @return Domain control validation (DCV) method used for this hostname.
     * Available values: &#34;http&#34;, &#34;txt&#34;, &#34;email&#34;.
     * 
     */
    public Optional<String> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return SSL specific settings.
     * 
     */
    public Optional<CustomHostnameSslSettings> settings() {
        return Optional.ofNullable(this.settings);
    }
    /**
     * @return Level of validation to be used for this hostname. Domain validation (dv) must be used.
     * Available values: &#34;dv&#34;.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Indicates whether the certificate covers a wildcard.
     * 
     */
    public Optional<Boolean> wildcard() {
        return Optional.ofNullable(this.wildcard);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomHostnameSsl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bundleMethod;
        private @Nullable String certificateAuthority;
        private @Nullable Boolean cloudflareBranding;
        private @Nullable List<CustomHostnameSslCustomCertBundle> customCertBundles;
        private @Nullable String customCertificate;
        private @Nullable String customKey;
        private @Nullable String method;
        private @Nullable CustomHostnameSslSettings settings;
        private @Nullable String type;
        private @Nullable Boolean wildcard;
        public Builder() {}
        public Builder(CustomHostnameSsl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundleMethod = defaults.bundleMethod;
    	      this.certificateAuthority = defaults.certificateAuthority;
    	      this.cloudflareBranding = defaults.cloudflareBranding;
    	      this.customCertBundles = defaults.customCertBundles;
    	      this.customCertificate = defaults.customCertificate;
    	      this.customKey = defaults.customKey;
    	      this.method = defaults.method;
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
    	      this.wildcard = defaults.wildcard;
        }

        @CustomType.Setter
        public Builder bundleMethod(@Nullable String bundleMethod) {

            this.bundleMethod = bundleMethod;
            return this;
        }
        @CustomType.Setter
        public Builder certificateAuthority(@Nullable String certificateAuthority) {

            this.certificateAuthority = certificateAuthority;
            return this;
        }
        @CustomType.Setter
        public Builder cloudflareBranding(@Nullable Boolean cloudflareBranding) {

            this.cloudflareBranding = cloudflareBranding;
            return this;
        }
        @CustomType.Setter
        public Builder customCertBundles(@Nullable List<CustomHostnameSslCustomCertBundle> customCertBundles) {

            this.customCertBundles = customCertBundles;
            return this;
        }
        public Builder customCertBundles(CustomHostnameSslCustomCertBundle... customCertBundles) {
            return customCertBundles(List.of(customCertBundles));
        }
        @CustomType.Setter
        public Builder customCertificate(@Nullable String customCertificate) {

            this.customCertificate = customCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder customKey(@Nullable String customKey) {

            this.customKey = customKey;
            return this;
        }
        @CustomType.Setter
        public Builder method(@Nullable String method) {

            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder settings(@Nullable CustomHostnameSslSettings settings) {

            this.settings = settings;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder wildcard(@Nullable Boolean wildcard) {

            this.wildcard = wildcard;
            return this;
        }
        public CustomHostnameSsl build() {
            final var _resultValue = new CustomHostnameSsl();
            _resultValue.bundleMethod = bundleMethod;
            _resultValue.certificateAuthority = certificateAuthority;
            _resultValue.cloudflareBranding = cloudflareBranding;
            _resultValue.customCertBundles = customCertBundles;
            _resultValue.customCertificate = customCertificate;
            _resultValue.customKey = customKey;
            _resultValue.method = method;
            _resultValue.settings = settings;
            _resultValue.type = type;
            _resultValue.wildcard = wildcard;
            return _resultValue;
        }
    }
}
