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


public final class WebAnalyticsSiteState extends com.pulumi.resources.ResourceArgs {

    public static final WebAnalyticsSiteState Empty = new WebAnalyticsSiteState();

    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Whether Cloudflare will automatically inject the JavaScript snippet for orange-clouded sites. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="autoInstall")
    private @Nullable Output<Boolean> autoInstall;

    /**
     * @return Whether Cloudflare will automatically inject the JavaScript snippet for orange-clouded sites. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<Boolean>> autoInstall() {
        return Optional.ofNullable(this.autoInstall);
    }

    /**
     * The hostname to use for gray-clouded sites. Must provide only one of `zone_tag`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return The hostname to use for gray-clouded sites. Must provide only one of `zone_tag`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * The ID for the ruleset associated to this Web Analytics Site.
     * 
     */
    @Import(name="rulesetId")
    private @Nullable Output<String> rulesetId;

    /**
     * @return The ID for the ruleset associated to this Web Analytics Site.
     * 
     */
    public Optional<Output<String>> rulesetId() {
        return Optional.ofNullable(this.rulesetId);
    }

    /**
     * The Web Analytics site tag.
     * 
     */
    @Import(name="siteTag")
    private @Nullable Output<String> siteTag;

    /**
     * @return The Web Analytics site tag.
     * 
     */
    public Optional<Output<String>> siteTag() {
        return Optional.ofNullable(this.siteTag);
    }

    /**
     * The token for the Web Analytics site.
     * 
     */
    @Import(name="siteToken")
    private @Nullable Output<String> siteToken;

    /**
     * @return The token for the Web Analytics site.
     * 
     */
    public Optional<Output<String>> siteToken() {
        return Optional.ofNullable(this.siteToken);
    }

    /**
     * The encoded JS snippet to add to your site&#39;s HTML page if auto_install is false.
     * 
     */
    @Import(name="snippet")
    private @Nullable Output<String> snippet;

    /**
     * @return The encoded JS snippet to add to your site&#39;s HTML page if auto_install is false.
     * 
     */
    public Optional<Output<String>> snippet() {
        return Optional.ofNullable(this.snippet);
    }

    /**
     * The zone identifier for orange-clouded sites. Must provide only one of `host`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="zoneTag")
    private @Nullable Output<String> zoneTag;

    /**
     * @return The zone identifier for orange-clouded sites. Must provide only one of `host`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> zoneTag() {
        return Optional.ofNullable(this.zoneTag);
    }

    private WebAnalyticsSiteState() {}

    private WebAnalyticsSiteState(WebAnalyticsSiteState $) {
        this.accountId = $.accountId;
        this.autoInstall = $.autoInstall;
        this.host = $.host;
        this.rulesetId = $.rulesetId;
        this.siteTag = $.siteTag;
        this.siteToken = $.siteToken;
        this.snippet = $.snippet;
        this.zoneTag = $.zoneTag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAnalyticsSiteState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAnalyticsSiteState $;

        public Builder() {
            $ = new WebAnalyticsSiteState();
        }

        public Builder(WebAnalyticsSiteState defaults) {
            $ = new WebAnalyticsSiteState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param autoInstall Whether Cloudflare will automatically inject the JavaScript snippet for orange-clouded sites. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder autoInstall(@Nullable Output<Boolean> autoInstall) {
            $.autoInstall = autoInstall;
            return this;
        }

        /**
         * @param autoInstall Whether Cloudflare will automatically inject the JavaScript snippet for orange-clouded sites. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder autoInstall(Boolean autoInstall) {
            return autoInstall(Output.of(autoInstall));
        }

        /**
         * @param host The hostname to use for gray-clouded sites. Must provide only one of `zone_tag`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The hostname to use for gray-clouded sites. Must provide only one of `zone_tag`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param rulesetId The ID for the ruleset associated to this Web Analytics Site.
         * 
         * @return builder
         * 
         */
        public Builder rulesetId(@Nullable Output<String> rulesetId) {
            $.rulesetId = rulesetId;
            return this;
        }

        /**
         * @param rulesetId The ID for the ruleset associated to this Web Analytics Site.
         * 
         * @return builder
         * 
         */
        public Builder rulesetId(String rulesetId) {
            return rulesetId(Output.of(rulesetId));
        }

        /**
         * @param siteTag The Web Analytics site tag.
         * 
         * @return builder
         * 
         */
        public Builder siteTag(@Nullable Output<String> siteTag) {
            $.siteTag = siteTag;
            return this;
        }

        /**
         * @param siteTag The Web Analytics site tag.
         * 
         * @return builder
         * 
         */
        public Builder siteTag(String siteTag) {
            return siteTag(Output.of(siteTag));
        }

        /**
         * @param siteToken The token for the Web Analytics site.
         * 
         * @return builder
         * 
         */
        public Builder siteToken(@Nullable Output<String> siteToken) {
            $.siteToken = siteToken;
            return this;
        }

        /**
         * @param siteToken The token for the Web Analytics site.
         * 
         * @return builder
         * 
         */
        public Builder siteToken(String siteToken) {
            return siteToken(Output.of(siteToken));
        }

        /**
         * @param snippet The encoded JS snippet to add to your site&#39;s HTML page if auto_install is false.
         * 
         * @return builder
         * 
         */
        public Builder snippet(@Nullable Output<String> snippet) {
            $.snippet = snippet;
            return this;
        }

        /**
         * @param snippet The encoded JS snippet to add to your site&#39;s HTML page if auto_install is false.
         * 
         * @return builder
         * 
         */
        public Builder snippet(String snippet) {
            return snippet(Output.of(snippet));
        }

        /**
         * @param zoneTag The zone identifier for orange-clouded sites. Must provide only one of `host`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneTag(@Nullable Output<String> zoneTag) {
            $.zoneTag = zoneTag;
            return this;
        }

        /**
         * @param zoneTag The zone identifier for orange-clouded sites. Must provide only one of `host`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneTag(String zoneTag) {
            return zoneTag(Output.of(zoneTag));
        }

        public WebAnalyticsSiteState build() {
            return $;
        }
    }

}
