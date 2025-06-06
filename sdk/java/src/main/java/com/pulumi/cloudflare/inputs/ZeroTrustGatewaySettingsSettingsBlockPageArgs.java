// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustGatewaySettingsSettingsBlockPageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustGatewaySettingsSettingsBlockPageArgs Empty = new ZeroTrustGatewaySettingsSettingsBlockPageArgs();

    /**
     * If mode is customized*block*page: block page background color in #rrggbb format.
     * 
     */
    @Import(name="backgroundColor")
    private @Nullable Output<String> backgroundColor;

    /**
     * @return If mode is customized*block*page: block page background color in #rrggbb format.
     * 
     */
    public Optional<Output<String>> backgroundColor() {
        return Optional.ofNullable(this.backgroundColor);
    }

    /**
     * Enable only cipher suites and TLS versions compliant with FIPS 140-2.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable only cipher suites and TLS versions compliant with FIPS 140-2.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * If mode is customized*block*page: block page footer text.
     * 
     */
    @Import(name="footerText")
    private @Nullable Output<String> footerText;

    /**
     * @return If mode is customized*block*page: block page footer text.
     * 
     */
    public Optional<Output<String>> footerText() {
        return Optional.ofNullable(this.footerText);
    }

    /**
     * If mode is customized*block*page: block page header text.
     * 
     */
    @Import(name="headerText")
    private @Nullable Output<String> headerText;

    /**
     * @return If mode is customized*block*page: block page header text.
     * 
     */
    public Optional<Output<String>> headerText() {
        return Optional.ofNullable(this.headerText);
    }

    /**
     * If mode is redirect*uri: when enabled, context will be appended to target*uri as query parameters.
     * 
     */
    @Import(name="includeContext")
    private @Nullable Output<Boolean> includeContext;

    /**
     * @return If mode is redirect*uri: when enabled, context will be appended to target*uri as query parameters.
     * 
     */
    public Optional<Output<Boolean>> includeContext() {
        return Optional.ofNullable(this.includeContext);
    }

    /**
     * If mode is customized*block*page: full URL to the logo file.
     * 
     */
    @Import(name="logoPath")
    private @Nullable Output<String> logoPath;

    /**
     * @return If mode is customized*block*page: full URL to the logo file.
     * 
     */
    public Optional<Output<String>> logoPath() {
        return Optional.ofNullable(this.logoPath);
    }

    /**
     * If mode is customized*block*page: admin email for users to contact.
     * 
     */
    @Import(name="mailtoAddress")
    private @Nullable Output<String> mailtoAddress;

    /**
     * @return If mode is customized*block*page: admin email for users to contact.
     * 
     */
    public Optional<Output<String>> mailtoAddress() {
        return Optional.ofNullable(this.mailtoAddress);
    }

    /**
     * If mode is customized*block*page: subject line for emails created from block page.
     * 
     */
    @Import(name="mailtoSubject")
    private @Nullable Output<String> mailtoSubject;

    /**
     * @return If mode is customized*block*page: subject line for emails created from block page.
     * 
     */
    public Optional<Output<String>> mailtoSubject() {
        return Optional.ofNullable(this.mailtoSubject);
    }

    /**
     * Controls whether the user is redirected to a Cloudflare-hosted block page or to a customer-provided URI.
     * Available values: &#34;customized*block*page&#34;, &#34;redirect_uri&#34;.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return Controls whether the user is redirected to a Cloudflare-hosted block page or to a customer-provided URI.
     * Available values: &#34;customized*block*page&#34;, &#34;redirect_uri&#34;.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * If mode is customized*block*page: block page title.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return If mode is customized*block*page: block page title.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * If mode is customized*block*page: suppress detailed info at the bottom of the block page.
     * 
     */
    @Import(name="suppressFooter")
    private @Nullable Output<Boolean> suppressFooter;

    /**
     * @return If mode is customized*block*page: suppress detailed info at the bottom of the block page.
     * 
     */
    public Optional<Output<Boolean>> suppressFooter() {
        return Optional.ofNullable(this.suppressFooter);
    }

    /**
     * If mode is redirect_uri: URI to which the user should be redirected.
     * 
     */
    @Import(name="targetUri")
    private @Nullable Output<String> targetUri;

    /**
     * @return If mode is redirect_uri: URI to which the user should be redirected.
     * 
     */
    public Optional<Output<String>> targetUri() {
        return Optional.ofNullable(this.targetUri);
    }

    private ZeroTrustGatewaySettingsSettingsBlockPageArgs() {}

    private ZeroTrustGatewaySettingsSettingsBlockPageArgs(ZeroTrustGatewaySettingsSettingsBlockPageArgs $) {
        this.backgroundColor = $.backgroundColor;
        this.enabled = $.enabled;
        this.footerText = $.footerText;
        this.headerText = $.headerText;
        this.includeContext = $.includeContext;
        this.logoPath = $.logoPath;
        this.mailtoAddress = $.mailtoAddress;
        this.mailtoSubject = $.mailtoSubject;
        this.mode = $.mode;
        this.name = $.name;
        this.suppressFooter = $.suppressFooter;
        this.targetUri = $.targetUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustGatewaySettingsSettingsBlockPageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustGatewaySettingsSettingsBlockPageArgs $;

        public Builder() {
            $ = new ZeroTrustGatewaySettingsSettingsBlockPageArgs();
        }

        public Builder(ZeroTrustGatewaySettingsSettingsBlockPageArgs defaults) {
            $ = new ZeroTrustGatewaySettingsSettingsBlockPageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backgroundColor If mode is customized*block*page: block page background color in #rrggbb format.
         * 
         * @return builder
         * 
         */
        public Builder backgroundColor(@Nullable Output<String> backgroundColor) {
            $.backgroundColor = backgroundColor;
            return this;
        }

        /**
         * @param backgroundColor If mode is customized*block*page: block page background color in #rrggbb format.
         * 
         * @return builder
         * 
         */
        public Builder backgroundColor(String backgroundColor) {
            return backgroundColor(Output.of(backgroundColor));
        }

        /**
         * @param enabled Enable only cipher suites and TLS versions compliant with FIPS 140-2.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable only cipher suites and TLS versions compliant with FIPS 140-2.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param footerText If mode is customized*block*page: block page footer text.
         * 
         * @return builder
         * 
         */
        public Builder footerText(@Nullable Output<String> footerText) {
            $.footerText = footerText;
            return this;
        }

        /**
         * @param footerText If mode is customized*block*page: block page footer text.
         * 
         * @return builder
         * 
         */
        public Builder footerText(String footerText) {
            return footerText(Output.of(footerText));
        }

        /**
         * @param headerText If mode is customized*block*page: block page header text.
         * 
         * @return builder
         * 
         */
        public Builder headerText(@Nullable Output<String> headerText) {
            $.headerText = headerText;
            return this;
        }

        /**
         * @param headerText If mode is customized*block*page: block page header text.
         * 
         * @return builder
         * 
         */
        public Builder headerText(String headerText) {
            return headerText(Output.of(headerText));
        }

        /**
         * @param includeContext If mode is redirect*uri: when enabled, context will be appended to target*uri as query parameters.
         * 
         * @return builder
         * 
         */
        public Builder includeContext(@Nullable Output<Boolean> includeContext) {
            $.includeContext = includeContext;
            return this;
        }

        /**
         * @param includeContext If mode is redirect*uri: when enabled, context will be appended to target*uri as query parameters.
         * 
         * @return builder
         * 
         */
        public Builder includeContext(Boolean includeContext) {
            return includeContext(Output.of(includeContext));
        }

        /**
         * @param logoPath If mode is customized*block*page: full URL to the logo file.
         * 
         * @return builder
         * 
         */
        public Builder logoPath(@Nullable Output<String> logoPath) {
            $.logoPath = logoPath;
            return this;
        }

        /**
         * @param logoPath If mode is customized*block*page: full URL to the logo file.
         * 
         * @return builder
         * 
         */
        public Builder logoPath(String logoPath) {
            return logoPath(Output.of(logoPath));
        }

        /**
         * @param mailtoAddress If mode is customized*block*page: admin email for users to contact.
         * 
         * @return builder
         * 
         */
        public Builder mailtoAddress(@Nullable Output<String> mailtoAddress) {
            $.mailtoAddress = mailtoAddress;
            return this;
        }

        /**
         * @param mailtoAddress If mode is customized*block*page: admin email for users to contact.
         * 
         * @return builder
         * 
         */
        public Builder mailtoAddress(String mailtoAddress) {
            return mailtoAddress(Output.of(mailtoAddress));
        }

        /**
         * @param mailtoSubject If mode is customized*block*page: subject line for emails created from block page.
         * 
         * @return builder
         * 
         */
        public Builder mailtoSubject(@Nullable Output<String> mailtoSubject) {
            $.mailtoSubject = mailtoSubject;
            return this;
        }

        /**
         * @param mailtoSubject If mode is customized*block*page: subject line for emails created from block page.
         * 
         * @return builder
         * 
         */
        public Builder mailtoSubject(String mailtoSubject) {
            return mailtoSubject(Output.of(mailtoSubject));
        }

        /**
         * @param mode Controls whether the user is redirected to a Cloudflare-hosted block page or to a customer-provided URI.
         * Available values: &#34;customized*block*page&#34;, &#34;redirect_uri&#34;.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Controls whether the user is redirected to a Cloudflare-hosted block page or to a customer-provided URI.
         * Available values: &#34;customized*block*page&#34;, &#34;redirect_uri&#34;.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param name If mode is customized*block*page: block page title.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name If mode is customized*block*page: block page title.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param suppressFooter If mode is customized*block*page: suppress detailed info at the bottom of the block page.
         * 
         * @return builder
         * 
         */
        public Builder suppressFooter(@Nullable Output<Boolean> suppressFooter) {
            $.suppressFooter = suppressFooter;
            return this;
        }

        /**
         * @param suppressFooter If mode is customized*block*page: suppress detailed info at the bottom of the block page.
         * 
         * @return builder
         * 
         */
        public Builder suppressFooter(Boolean suppressFooter) {
            return suppressFooter(Output.of(suppressFooter));
        }

        /**
         * @param targetUri If mode is redirect_uri: URI to which the user should be redirected.
         * 
         * @return builder
         * 
         */
        public Builder targetUri(@Nullable Output<String> targetUri) {
            $.targetUri = targetUri;
            return this;
        }

        /**
         * @param targetUri If mode is redirect_uri: URI to which the user should be redirected.
         * 
         * @return builder
         * 
         */
        public Builder targetUri(String targetUri) {
            return targetUri(Output.of(targetUri));
        }

        public ZeroTrustGatewaySettingsSettingsBlockPageArgs build() {
            return $;
        }
    }

}
