// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsAuditSshArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsBisoAdminControlsArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsBlockPageArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsCheckSessionArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsDnsResolversArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsEgressArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsL4overrideArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsNotificationSettingsArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsPayloadLogArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsQuarantineArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsRedirectArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsResolveDnsInternallyArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsUntrustedCertArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustGatewayPolicyRuleSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustGatewayPolicyRuleSettingsArgs Empty = new ZeroTrustGatewayPolicyRuleSettingsArgs();

    /**
     * Add custom headers to allowed requests, in the form of key-value pairs. Keys are header names, pointing to an array with its header value(s).
     * 
     */
    @Import(name="addHeaders")
    private @Nullable Output<Map<String,String>> addHeaders;

    /**
     * @return Add custom headers to allowed requests, in the form of key-value pairs. Keys are header names, pointing to an array with its header value(s).
     * 
     */
    public Optional<Output<Map<String,String>>> addHeaders() {
        return Optional.ofNullable(this.addHeaders);
    }

    /**
     * Set by parent MSP accounts to enable their children to bypass this rule.
     * 
     */
    @Import(name="allowChildBypass")
    private @Nullable Output<Boolean> allowChildBypass;

    /**
     * @return Set by parent MSP accounts to enable their children to bypass this rule.
     * 
     */
    public Optional<Output<Boolean>> allowChildBypass() {
        return Optional.ofNullable(this.allowChildBypass);
    }

    /**
     * Settings for the Audit SSH action.
     * 
     */
    @Import(name="auditSsh")
    private @Nullable Output<ZeroTrustGatewayPolicyRuleSettingsAuditSshArgs> auditSsh;

    /**
     * @return Settings for the Audit SSH action.
     * 
     */
    public Optional<Output<ZeroTrustGatewayPolicyRuleSettingsAuditSshArgs>> auditSsh() {
        return Optional.ofNullable(this.auditSsh);
    }

    /**
     * Configure how browser isolation behaves.
     * 
     */
    @Import(name="bisoAdminControls")
    private @Nullable Output<ZeroTrustGatewayPolicyRuleSettingsBisoAdminControlsArgs> bisoAdminControls;

    /**
     * @return Configure how browser isolation behaves.
     * 
     */
    public Optional<Output<ZeroTrustGatewayPolicyRuleSettingsBisoAdminControlsArgs>> bisoAdminControls() {
        return Optional.ofNullable(this.bisoAdminControls);
    }

    /**
     * Custom block page settings. If missing/null, blocking will use the the account settings.
     * 
     */
    @Import(name="blockPage")
    private @Nullable Output<ZeroTrustGatewayPolicyRuleSettingsBlockPageArgs> blockPage;

    /**
     * @return Custom block page settings. If missing/null, blocking will use the the account settings.
     * 
     */
    public Optional<Output<ZeroTrustGatewayPolicyRuleSettingsBlockPageArgs>> blockPage() {
        return Optional.ofNullable(this.blockPage);
    }

    /**
     * Enable the custom block page.
     * 
     */
    @Import(name="blockPageEnabled")
    private @Nullable Output<Boolean> blockPageEnabled;

    /**
     * @return Enable the custom block page.
     * 
     */
    public Optional<Output<Boolean>> blockPageEnabled() {
        return Optional.ofNullable(this.blockPageEnabled);
    }

    /**
     * The text describing why this block occurred, displayed on the custom block page (if enabled).
     * 
     */
    @Import(name="blockReason")
    private @Nullable Output<String> blockReason;

    /**
     * @return The text describing why this block occurred, displayed on the custom block page (if enabled).
     * 
     */
    public Optional<Output<String>> blockReason() {
        return Optional.ofNullable(this.blockReason);
    }

    /**
     * Set by children MSP accounts to bypass their parent&#39;s rules.
     * 
     */
    @Import(name="bypassParentRule")
    private @Nullable Output<Boolean> bypassParentRule;

    /**
     * @return Set by children MSP accounts to bypass their parent&#39;s rules.
     * 
     */
    public Optional<Output<Boolean>> bypassParentRule() {
        return Optional.ofNullable(this.bypassParentRule);
    }

    /**
     * Configure how session check behaves.
     * 
     */
    @Import(name="checkSession")
    private @Nullable Output<ZeroTrustGatewayPolicyRuleSettingsCheckSessionArgs> checkSession;

    /**
     * @return Configure how session check behaves.
     * 
     */
    public Optional<Output<ZeroTrustGatewayPolicyRuleSettingsCheckSessionArgs>> checkSession() {
        return Optional.ofNullable(this.checkSession);
    }

    /**
     * Add your own custom resolvers to route queries that match the resolver policy. Cannot be used when &#39;resolve*dns*through*cloudflare&#39; or &#39;resolve*dns*internally&#39; are set. DNS queries will route to the address closest to their origin. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
     * 
     */
    @Import(name="dnsResolvers")
    private @Nullable Output<ZeroTrustGatewayPolicyRuleSettingsDnsResolversArgs> dnsResolvers;

    /**
     * @return Add your own custom resolvers to route queries that match the resolver policy. Cannot be used when &#39;resolve*dns*through*cloudflare&#39; or &#39;resolve*dns*internally&#39; are set. DNS queries will route to the address closest to their origin. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
     * 
     */
    public Optional<Output<ZeroTrustGatewayPolicyRuleSettingsDnsResolversArgs>> dnsResolvers() {
        return Optional.ofNullable(this.dnsResolvers);
    }

    /**
     * Configure how Gateway Proxy traffic egresses. You can enable this setting for rules with Egress actions and filters, or omit it to indicate local egress via WARP IPs.
     * 
     */
    @Import(name="egress")
    private @Nullable Output<ZeroTrustGatewayPolicyRuleSettingsEgressArgs> egress;

    /**
     * @return Configure how Gateway Proxy traffic egresses. You can enable this setting for rules with Egress actions and filters, or omit it to indicate local egress via WARP IPs.
     * 
     */
    public Optional<Output<ZeroTrustGatewayPolicyRuleSettingsEgressArgs>> egress() {
        return Optional.ofNullable(this.egress);
    }

    /**
     * Set to true, to ignore the category matches at CNAME domains in a response. If unchecked, the categories in this rule will be checked against all the CNAME domain categories in a response.
     * 
     */
    @Import(name="ignoreCnameCategoryMatches")
    private @Nullable Output<Boolean> ignoreCnameCategoryMatches;

    /**
     * @return Set to true, to ignore the category matches at CNAME domains in a response. If unchecked, the categories in this rule will be checked against all the CNAME domain categories in a response.
     * 
     */
    public Optional<Output<Boolean>> ignoreCnameCategoryMatches() {
        return Optional.ofNullable(this.ignoreCnameCategoryMatches);
    }

    /**
     * INSECURE - disable DNSSEC validation (for Allow actions).
     * 
     */
    @Import(name="insecureDisableDnssecValidation")
    private @Nullable Output<Boolean> insecureDisableDnssecValidation;

    /**
     * @return INSECURE - disable DNSSEC validation (for Allow actions).
     * 
     */
    public Optional<Output<Boolean>> insecureDisableDnssecValidation() {
        return Optional.ofNullable(this.insecureDisableDnssecValidation);
    }

    /**
     * Set to true to enable IPs in DNS resolver category blocks. By default categories only block based on domain names.
     * 
     */
    @Import(name="ipCategories")
    private @Nullable Output<Boolean> ipCategories;

    /**
     * @return Set to true to enable IPs in DNS resolver category blocks. By default categories only block based on domain names.
     * 
     */
    public Optional<Output<Boolean>> ipCategories() {
        return Optional.ofNullable(this.ipCategories);
    }

    /**
     * Set to true to include IPs in DNS resolver indicator feed blocks. By default indicator feeds only block based on domain names.
     * 
     */
    @Import(name="ipIndicatorFeeds")
    private @Nullable Output<Boolean> ipIndicatorFeeds;

    /**
     * @return Set to true to include IPs in DNS resolver indicator feed blocks. By default indicator feeds only block based on domain names.
     * 
     */
    public Optional<Output<Boolean>> ipIndicatorFeeds() {
        return Optional.ofNullable(this.ipIndicatorFeeds);
    }

    /**
     * Send matching traffic to the supplied destination IP address and port.
     * 
     */
    @Import(name="l4override")
    private @Nullable Output<ZeroTrustGatewayPolicyRuleSettingsL4overrideArgs> l4override;

    /**
     * @return Send matching traffic to the supplied destination IP address and port.
     * 
     */
    public Optional<Output<ZeroTrustGatewayPolicyRuleSettingsL4overrideArgs>> l4override() {
        return Optional.ofNullable(this.l4override);
    }

    /**
     * Configure a notification to display on the user&#39;s device when this rule is matched.
     * 
     */
    @Import(name="notificationSettings")
    private @Nullable Output<ZeroTrustGatewayPolicyRuleSettingsNotificationSettingsArgs> notificationSettings;

    /**
     * @return Configure a notification to display on the user&#39;s device when this rule is matched.
     * 
     */
    public Optional<Output<ZeroTrustGatewayPolicyRuleSettingsNotificationSettingsArgs>> notificationSettings() {
        return Optional.ofNullable(this.notificationSettings);
    }

    /**
     * Override matching DNS queries with a hostname.
     * 
     */
    @Import(name="overrideHost")
    private @Nullable Output<String> overrideHost;

    /**
     * @return Override matching DNS queries with a hostname.
     * 
     */
    public Optional<Output<String>> overrideHost() {
        return Optional.ofNullable(this.overrideHost);
    }

    /**
     * Override matching DNS queries with an IP or set of IPs.
     * 
     */
    @Import(name="overrideIps")
    private @Nullable Output<List<String>> overrideIps;

    /**
     * @return Override matching DNS queries with an IP or set of IPs.
     * 
     */
    public Optional<Output<List<String>>> overrideIps() {
        return Optional.ofNullable(this.overrideIps);
    }

    /**
     * Configure DLP payload logging.
     * 
     */
    @Import(name="payloadLog")
    private @Nullable Output<ZeroTrustGatewayPolicyRuleSettingsPayloadLogArgs> payloadLog;

    /**
     * @return Configure DLP payload logging.
     * 
     */
    public Optional<Output<ZeroTrustGatewayPolicyRuleSettingsPayloadLogArgs>> payloadLog() {
        return Optional.ofNullable(this.payloadLog);
    }

    /**
     * Settings that apply to quarantine rules
     * 
     */
    @Import(name="quarantine")
    private @Nullable Output<ZeroTrustGatewayPolicyRuleSettingsQuarantineArgs> quarantine;

    /**
     * @return Settings that apply to quarantine rules
     * 
     */
    public Optional<Output<ZeroTrustGatewayPolicyRuleSettingsQuarantineArgs>> quarantine() {
        return Optional.ofNullable(this.quarantine);
    }

    /**
     * Settings that apply to redirect rules
     * 
     */
    @Import(name="redirect")
    private @Nullable Output<ZeroTrustGatewayPolicyRuleSettingsRedirectArgs> redirect;

    /**
     * @return Settings that apply to redirect rules
     * 
     */
    public Optional<Output<ZeroTrustGatewayPolicyRuleSettingsRedirectArgs>> redirect() {
        return Optional.ofNullable(this.redirect);
    }

    /**
     * Configure to forward the query to the internal DNS service, passing the specified &#39;view*id&#39; as input. Cannot be set when &#39;dns*resolvers&#39; are specified or &#39;resolve*dns*through*cloudflare&#39; is set. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
     * 
     */
    @Import(name="resolveDnsInternally")
    private @Nullable Output<ZeroTrustGatewayPolicyRuleSettingsResolveDnsInternallyArgs> resolveDnsInternally;

    /**
     * @return Configure to forward the query to the internal DNS service, passing the specified &#39;view*id&#39; as input. Cannot be set when &#39;dns*resolvers&#39; are specified or &#39;resolve*dns*through*cloudflare&#39; is set. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
     * 
     */
    public Optional<Output<ZeroTrustGatewayPolicyRuleSettingsResolveDnsInternallyArgs>> resolveDnsInternally() {
        return Optional.ofNullable(this.resolveDnsInternally);
    }

    /**
     * Enable to send queries that match the policy to Cloudflare&#39;s default 1.1.1.1 DNS resolver. Cannot be set when &#39;dns*resolvers&#39; are specified or &#39;resolve*dns_internally&#39; is set. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
     * 
     */
    @Import(name="resolveDnsThroughCloudflare")
    private @Nullable Output<Boolean> resolveDnsThroughCloudflare;

    /**
     * @return Enable to send queries that match the policy to Cloudflare&#39;s default 1.1.1.1 DNS resolver. Cannot be set when &#39;dns*resolvers&#39; are specified or &#39;resolve*dns_internally&#39; is set. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
     * 
     */
    public Optional<Output<Boolean>> resolveDnsThroughCloudflare() {
        return Optional.ofNullable(this.resolveDnsThroughCloudflare);
    }

    /**
     * Configure behavior when an upstream cert is invalid or an SSL error occurs.
     * 
     */
    @Import(name="untrustedCert")
    private @Nullable Output<ZeroTrustGatewayPolicyRuleSettingsUntrustedCertArgs> untrustedCert;

    /**
     * @return Configure behavior when an upstream cert is invalid or an SSL error occurs.
     * 
     */
    public Optional<Output<ZeroTrustGatewayPolicyRuleSettingsUntrustedCertArgs>> untrustedCert() {
        return Optional.ofNullable(this.untrustedCert);
    }

    private ZeroTrustGatewayPolicyRuleSettingsArgs() {}

    private ZeroTrustGatewayPolicyRuleSettingsArgs(ZeroTrustGatewayPolicyRuleSettingsArgs $) {
        this.addHeaders = $.addHeaders;
        this.allowChildBypass = $.allowChildBypass;
        this.auditSsh = $.auditSsh;
        this.bisoAdminControls = $.bisoAdminControls;
        this.blockPage = $.blockPage;
        this.blockPageEnabled = $.blockPageEnabled;
        this.blockReason = $.blockReason;
        this.bypassParentRule = $.bypassParentRule;
        this.checkSession = $.checkSession;
        this.dnsResolvers = $.dnsResolvers;
        this.egress = $.egress;
        this.ignoreCnameCategoryMatches = $.ignoreCnameCategoryMatches;
        this.insecureDisableDnssecValidation = $.insecureDisableDnssecValidation;
        this.ipCategories = $.ipCategories;
        this.ipIndicatorFeeds = $.ipIndicatorFeeds;
        this.l4override = $.l4override;
        this.notificationSettings = $.notificationSettings;
        this.overrideHost = $.overrideHost;
        this.overrideIps = $.overrideIps;
        this.payloadLog = $.payloadLog;
        this.quarantine = $.quarantine;
        this.redirect = $.redirect;
        this.resolveDnsInternally = $.resolveDnsInternally;
        this.resolveDnsThroughCloudflare = $.resolveDnsThroughCloudflare;
        this.untrustedCert = $.untrustedCert;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustGatewayPolicyRuleSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustGatewayPolicyRuleSettingsArgs $;

        public Builder() {
            $ = new ZeroTrustGatewayPolicyRuleSettingsArgs();
        }

        public Builder(ZeroTrustGatewayPolicyRuleSettingsArgs defaults) {
            $ = new ZeroTrustGatewayPolicyRuleSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addHeaders Add custom headers to allowed requests, in the form of key-value pairs. Keys are header names, pointing to an array with its header value(s).
         * 
         * @return builder
         * 
         */
        public Builder addHeaders(@Nullable Output<Map<String,String>> addHeaders) {
            $.addHeaders = addHeaders;
            return this;
        }

        /**
         * @param addHeaders Add custom headers to allowed requests, in the form of key-value pairs. Keys are header names, pointing to an array with its header value(s).
         * 
         * @return builder
         * 
         */
        public Builder addHeaders(Map<String,String> addHeaders) {
            return addHeaders(Output.of(addHeaders));
        }

        /**
         * @param allowChildBypass Set by parent MSP accounts to enable their children to bypass this rule.
         * 
         * @return builder
         * 
         */
        public Builder allowChildBypass(@Nullable Output<Boolean> allowChildBypass) {
            $.allowChildBypass = allowChildBypass;
            return this;
        }

        /**
         * @param allowChildBypass Set by parent MSP accounts to enable their children to bypass this rule.
         * 
         * @return builder
         * 
         */
        public Builder allowChildBypass(Boolean allowChildBypass) {
            return allowChildBypass(Output.of(allowChildBypass));
        }

        /**
         * @param auditSsh Settings for the Audit SSH action.
         * 
         * @return builder
         * 
         */
        public Builder auditSsh(@Nullable Output<ZeroTrustGatewayPolicyRuleSettingsAuditSshArgs> auditSsh) {
            $.auditSsh = auditSsh;
            return this;
        }

        /**
         * @param auditSsh Settings for the Audit SSH action.
         * 
         * @return builder
         * 
         */
        public Builder auditSsh(ZeroTrustGatewayPolicyRuleSettingsAuditSshArgs auditSsh) {
            return auditSsh(Output.of(auditSsh));
        }

        /**
         * @param bisoAdminControls Configure how browser isolation behaves.
         * 
         * @return builder
         * 
         */
        public Builder bisoAdminControls(@Nullable Output<ZeroTrustGatewayPolicyRuleSettingsBisoAdminControlsArgs> bisoAdminControls) {
            $.bisoAdminControls = bisoAdminControls;
            return this;
        }

        /**
         * @param bisoAdminControls Configure how browser isolation behaves.
         * 
         * @return builder
         * 
         */
        public Builder bisoAdminControls(ZeroTrustGatewayPolicyRuleSettingsBisoAdminControlsArgs bisoAdminControls) {
            return bisoAdminControls(Output.of(bisoAdminControls));
        }

        /**
         * @param blockPage Custom block page settings. If missing/null, blocking will use the the account settings.
         * 
         * @return builder
         * 
         */
        public Builder blockPage(@Nullable Output<ZeroTrustGatewayPolicyRuleSettingsBlockPageArgs> blockPage) {
            $.blockPage = blockPage;
            return this;
        }

        /**
         * @param blockPage Custom block page settings. If missing/null, blocking will use the the account settings.
         * 
         * @return builder
         * 
         */
        public Builder blockPage(ZeroTrustGatewayPolicyRuleSettingsBlockPageArgs blockPage) {
            return blockPage(Output.of(blockPage));
        }

        /**
         * @param blockPageEnabled Enable the custom block page.
         * 
         * @return builder
         * 
         */
        public Builder blockPageEnabled(@Nullable Output<Boolean> blockPageEnabled) {
            $.blockPageEnabled = blockPageEnabled;
            return this;
        }

        /**
         * @param blockPageEnabled Enable the custom block page.
         * 
         * @return builder
         * 
         */
        public Builder blockPageEnabled(Boolean blockPageEnabled) {
            return blockPageEnabled(Output.of(blockPageEnabled));
        }

        /**
         * @param blockReason The text describing why this block occurred, displayed on the custom block page (if enabled).
         * 
         * @return builder
         * 
         */
        public Builder blockReason(@Nullable Output<String> blockReason) {
            $.blockReason = blockReason;
            return this;
        }

        /**
         * @param blockReason The text describing why this block occurred, displayed on the custom block page (if enabled).
         * 
         * @return builder
         * 
         */
        public Builder blockReason(String blockReason) {
            return blockReason(Output.of(blockReason));
        }

        /**
         * @param bypassParentRule Set by children MSP accounts to bypass their parent&#39;s rules.
         * 
         * @return builder
         * 
         */
        public Builder bypassParentRule(@Nullable Output<Boolean> bypassParentRule) {
            $.bypassParentRule = bypassParentRule;
            return this;
        }

        /**
         * @param bypassParentRule Set by children MSP accounts to bypass their parent&#39;s rules.
         * 
         * @return builder
         * 
         */
        public Builder bypassParentRule(Boolean bypassParentRule) {
            return bypassParentRule(Output.of(bypassParentRule));
        }

        /**
         * @param checkSession Configure how session check behaves.
         * 
         * @return builder
         * 
         */
        public Builder checkSession(@Nullable Output<ZeroTrustGatewayPolicyRuleSettingsCheckSessionArgs> checkSession) {
            $.checkSession = checkSession;
            return this;
        }

        /**
         * @param checkSession Configure how session check behaves.
         * 
         * @return builder
         * 
         */
        public Builder checkSession(ZeroTrustGatewayPolicyRuleSettingsCheckSessionArgs checkSession) {
            return checkSession(Output.of(checkSession));
        }

        /**
         * @param dnsResolvers Add your own custom resolvers to route queries that match the resolver policy. Cannot be used when &#39;resolve*dns*through*cloudflare&#39; or &#39;resolve*dns*internally&#39; are set. DNS queries will route to the address closest to their origin. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
         * 
         * @return builder
         * 
         */
        public Builder dnsResolvers(@Nullable Output<ZeroTrustGatewayPolicyRuleSettingsDnsResolversArgs> dnsResolvers) {
            $.dnsResolvers = dnsResolvers;
            return this;
        }

        /**
         * @param dnsResolvers Add your own custom resolvers to route queries that match the resolver policy. Cannot be used when &#39;resolve*dns*through*cloudflare&#39; or &#39;resolve*dns*internally&#39; are set. DNS queries will route to the address closest to their origin. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
         * 
         * @return builder
         * 
         */
        public Builder dnsResolvers(ZeroTrustGatewayPolicyRuleSettingsDnsResolversArgs dnsResolvers) {
            return dnsResolvers(Output.of(dnsResolvers));
        }

        /**
         * @param egress Configure how Gateway Proxy traffic egresses. You can enable this setting for rules with Egress actions and filters, or omit it to indicate local egress via WARP IPs.
         * 
         * @return builder
         * 
         */
        public Builder egress(@Nullable Output<ZeroTrustGatewayPolicyRuleSettingsEgressArgs> egress) {
            $.egress = egress;
            return this;
        }

        /**
         * @param egress Configure how Gateway Proxy traffic egresses. You can enable this setting for rules with Egress actions and filters, or omit it to indicate local egress via WARP IPs.
         * 
         * @return builder
         * 
         */
        public Builder egress(ZeroTrustGatewayPolicyRuleSettingsEgressArgs egress) {
            return egress(Output.of(egress));
        }

        /**
         * @param ignoreCnameCategoryMatches Set to true, to ignore the category matches at CNAME domains in a response. If unchecked, the categories in this rule will be checked against all the CNAME domain categories in a response.
         * 
         * @return builder
         * 
         */
        public Builder ignoreCnameCategoryMatches(@Nullable Output<Boolean> ignoreCnameCategoryMatches) {
            $.ignoreCnameCategoryMatches = ignoreCnameCategoryMatches;
            return this;
        }

        /**
         * @param ignoreCnameCategoryMatches Set to true, to ignore the category matches at CNAME domains in a response. If unchecked, the categories in this rule will be checked against all the CNAME domain categories in a response.
         * 
         * @return builder
         * 
         */
        public Builder ignoreCnameCategoryMatches(Boolean ignoreCnameCategoryMatches) {
            return ignoreCnameCategoryMatches(Output.of(ignoreCnameCategoryMatches));
        }

        /**
         * @param insecureDisableDnssecValidation INSECURE - disable DNSSEC validation (for Allow actions).
         * 
         * @return builder
         * 
         */
        public Builder insecureDisableDnssecValidation(@Nullable Output<Boolean> insecureDisableDnssecValidation) {
            $.insecureDisableDnssecValidation = insecureDisableDnssecValidation;
            return this;
        }

        /**
         * @param insecureDisableDnssecValidation INSECURE - disable DNSSEC validation (for Allow actions).
         * 
         * @return builder
         * 
         */
        public Builder insecureDisableDnssecValidation(Boolean insecureDisableDnssecValidation) {
            return insecureDisableDnssecValidation(Output.of(insecureDisableDnssecValidation));
        }

        /**
         * @param ipCategories Set to true to enable IPs in DNS resolver category blocks. By default categories only block based on domain names.
         * 
         * @return builder
         * 
         */
        public Builder ipCategories(@Nullable Output<Boolean> ipCategories) {
            $.ipCategories = ipCategories;
            return this;
        }

        /**
         * @param ipCategories Set to true to enable IPs in DNS resolver category blocks. By default categories only block based on domain names.
         * 
         * @return builder
         * 
         */
        public Builder ipCategories(Boolean ipCategories) {
            return ipCategories(Output.of(ipCategories));
        }

        /**
         * @param ipIndicatorFeeds Set to true to include IPs in DNS resolver indicator feed blocks. By default indicator feeds only block based on domain names.
         * 
         * @return builder
         * 
         */
        public Builder ipIndicatorFeeds(@Nullable Output<Boolean> ipIndicatorFeeds) {
            $.ipIndicatorFeeds = ipIndicatorFeeds;
            return this;
        }

        /**
         * @param ipIndicatorFeeds Set to true to include IPs in DNS resolver indicator feed blocks. By default indicator feeds only block based on domain names.
         * 
         * @return builder
         * 
         */
        public Builder ipIndicatorFeeds(Boolean ipIndicatorFeeds) {
            return ipIndicatorFeeds(Output.of(ipIndicatorFeeds));
        }

        /**
         * @param l4override Send matching traffic to the supplied destination IP address and port.
         * 
         * @return builder
         * 
         */
        public Builder l4override(@Nullable Output<ZeroTrustGatewayPolicyRuleSettingsL4overrideArgs> l4override) {
            $.l4override = l4override;
            return this;
        }

        /**
         * @param l4override Send matching traffic to the supplied destination IP address and port.
         * 
         * @return builder
         * 
         */
        public Builder l4override(ZeroTrustGatewayPolicyRuleSettingsL4overrideArgs l4override) {
            return l4override(Output.of(l4override));
        }

        /**
         * @param notificationSettings Configure a notification to display on the user&#39;s device when this rule is matched.
         * 
         * @return builder
         * 
         */
        public Builder notificationSettings(@Nullable Output<ZeroTrustGatewayPolicyRuleSettingsNotificationSettingsArgs> notificationSettings) {
            $.notificationSettings = notificationSettings;
            return this;
        }

        /**
         * @param notificationSettings Configure a notification to display on the user&#39;s device when this rule is matched.
         * 
         * @return builder
         * 
         */
        public Builder notificationSettings(ZeroTrustGatewayPolicyRuleSettingsNotificationSettingsArgs notificationSettings) {
            return notificationSettings(Output.of(notificationSettings));
        }

        /**
         * @param overrideHost Override matching DNS queries with a hostname.
         * 
         * @return builder
         * 
         */
        public Builder overrideHost(@Nullable Output<String> overrideHost) {
            $.overrideHost = overrideHost;
            return this;
        }

        /**
         * @param overrideHost Override matching DNS queries with a hostname.
         * 
         * @return builder
         * 
         */
        public Builder overrideHost(String overrideHost) {
            return overrideHost(Output.of(overrideHost));
        }

        /**
         * @param overrideIps Override matching DNS queries with an IP or set of IPs.
         * 
         * @return builder
         * 
         */
        public Builder overrideIps(@Nullable Output<List<String>> overrideIps) {
            $.overrideIps = overrideIps;
            return this;
        }

        /**
         * @param overrideIps Override matching DNS queries with an IP or set of IPs.
         * 
         * @return builder
         * 
         */
        public Builder overrideIps(List<String> overrideIps) {
            return overrideIps(Output.of(overrideIps));
        }

        /**
         * @param overrideIps Override matching DNS queries with an IP or set of IPs.
         * 
         * @return builder
         * 
         */
        public Builder overrideIps(String... overrideIps) {
            return overrideIps(List.of(overrideIps));
        }

        /**
         * @param payloadLog Configure DLP payload logging.
         * 
         * @return builder
         * 
         */
        public Builder payloadLog(@Nullable Output<ZeroTrustGatewayPolicyRuleSettingsPayloadLogArgs> payloadLog) {
            $.payloadLog = payloadLog;
            return this;
        }

        /**
         * @param payloadLog Configure DLP payload logging.
         * 
         * @return builder
         * 
         */
        public Builder payloadLog(ZeroTrustGatewayPolicyRuleSettingsPayloadLogArgs payloadLog) {
            return payloadLog(Output.of(payloadLog));
        }

        /**
         * @param quarantine Settings that apply to quarantine rules
         * 
         * @return builder
         * 
         */
        public Builder quarantine(@Nullable Output<ZeroTrustGatewayPolicyRuleSettingsQuarantineArgs> quarantine) {
            $.quarantine = quarantine;
            return this;
        }

        /**
         * @param quarantine Settings that apply to quarantine rules
         * 
         * @return builder
         * 
         */
        public Builder quarantine(ZeroTrustGatewayPolicyRuleSettingsQuarantineArgs quarantine) {
            return quarantine(Output.of(quarantine));
        }

        /**
         * @param redirect Settings that apply to redirect rules
         * 
         * @return builder
         * 
         */
        public Builder redirect(@Nullable Output<ZeroTrustGatewayPolicyRuleSettingsRedirectArgs> redirect) {
            $.redirect = redirect;
            return this;
        }

        /**
         * @param redirect Settings that apply to redirect rules
         * 
         * @return builder
         * 
         */
        public Builder redirect(ZeroTrustGatewayPolicyRuleSettingsRedirectArgs redirect) {
            return redirect(Output.of(redirect));
        }

        /**
         * @param resolveDnsInternally Configure to forward the query to the internal DNS service, passing the specified &#39;view*id&#39; as input. Cannot be set when &#39;dns*resolvers&#39; are specified or &#39;resolve*dns*through*cloudflare&#39; is set. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
         * 
         * @return builder
         * 
         */
        public Builder resolveDnsInternally(@Nullable Output<ZeroTrustGatewayPolicyRuleSettingsResolveDnsInternallyArgs> resolveDnsInternally) {
            $.resolveDnsInternally = resolveDnsInternally;
            return this;
        }

        /**
         * @param resolveDnsInternally Configure to forward the query to the internal DNS service, passing the specified &#39;view*id&#39; as input. Cannot be set when &#39;dns*resolvers&#39; are specified or &#39;resolve*dns*through*cloudflare&#39; is set. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
         * 
         * @return builder
         * 
         */
        public Builder resolveDnsInternally(ZeroTrustGatewayPolicyRuleSettingsResolveDnsInternallyArgs resolveDnsInternally) {
            return resolveDnsInternally(Output.of(resolveDnsInternally));
        }

        /**
         * @param resolveDnsThroughCloudflare Enable to send queries that match the policy to Cloudflare&#39;s default 1.1.1.1 DNS resolver. Cannot be set when &#39;dns*resolvers&#39; are specified or &#39;resolve*dns_internally&#39; is set. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
         * 
         * @return builder
         * 
         */
        public Builder resolveDnsThroughCloudflare(@Nullable Output<Boolean> resolveDnsThroughCloudflare) {
            $.resolveDnsThroughCloudflare = resolveDnsThroughCloudflare;
            return this;
        }

        /**
         * @param resolveDnsThroughCloudflare Enable to send queries that match the policy to Cloudflare&#39;s default 1.1.1.1 DNS resolver. Cannot be set when &#39;dns*resolvers&#39; are specified or &#39;resolve*dns_internally&#39; is set. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
         * 
         * @return builder
         * 
         */
        public Builder resolveDnsThroughCloudflare(Boolean resolveDnsThroughCloudflare) {
            return resolveDnsThroughCloudflare(Output.of(resolveDnsThroughCloudflare));
        }

        /**
         * @param untrustedCert Configure behavior when an upstream cert is invalid or an SSL error occurs.
         * 
         * @return builder
         * 
         */
        public Builder untrustedCert(@Nullable Output<ZeroTrustGatewayPolicyRuleSettingsUntrustedCertArgs> untrustedCert) {
            $.untrustedCert = untrustedCert;
            return this;
        }

        /**
         * @param untrustedCert Configure behavior when an upstream cert is invalid or an SSL error occurs.
         * 
         * @return builder
         * 
         */
        public Builder untrustedCert(ZeroTrustGatewayPolicyRuleSettingsUntrustedCertArgs untrustedCert) {
            return untrustedCert(Output.of(untrustedCert));
        }

        public ZeroTrustGatewayPolicyRuleSettingsArgs build() {
            return $;
        }
    }

}
