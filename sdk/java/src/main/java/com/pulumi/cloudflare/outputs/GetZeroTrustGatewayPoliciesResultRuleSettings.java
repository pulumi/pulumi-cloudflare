// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPoliciesResultRuleSettingsAuditSsh;
import com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPoliciesResultRuleSettingsBisoAdminControls;
import com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPoliciesResultRuleSettingsBlockPage;
import com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPoliciesResultRuleSettingsCheckSession;
import com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPoliciesResultRuleSettingsDnsResolvers;
import com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPoliciesResultRuleSettingsEgress;
import com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPoliciesResultRuleSettingsL4override;
import com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPoliciesResultRuleSettingsNotificationSettings;
import com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPoliciesResultRuleSettingsPayloadLog;
import com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPoliciesResultRuleSettingsQuarantine;
import com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPoliciesResultRuleSettingsRedirect;
import com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPoliciesResultRuleSettingsResolveDnsInternally;
import com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPoliciesResultRuleSettingsUntrustedCert;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetZeroTrustGatewayPoliciesResultRuleSettings {
    /**
     * @return Add custom headers to allowed requests, in the form of key-value pairs. Keys are header names, pointing to an array with its header value(s).
     * 
     */
    private Map<String,String> addHeaders;
    /**
     * @return Set by parent MSP accounts to enable their children to bypass this rule.
     * 
     */
    private Boolean allowChildBypass;
    /**
     * @return Settings for the Audit SSH action.
     * 
     */
    private GetZeroTrustGatewayPoliciesResultRuleSettingsAuditSsh auditSsh;
    /**
     * @return Configure how browser isolation behaves.
     * 
     */
    private GetZeroTrustGatewayPoliciesResultRuleSettingsBisoAdminControls bisoAdminControls;
    /**
     * @return Custom block page settings. If missing/null, blocking will use the the account settings.
     * 
     */
    private GetZeroTrustGatewayPoliciesResultRuleSettingsBlockPage blockPage;
    /**
     * @return Enable the custom block page.
     * 
     */
    private Boolean blockPageEnabled;
    /**
     * @return The text describing why this block occurred, displayed on the custom block page (if enabled).
     * 
     */
    private String blockReason;
    /**
     * @return Set by children MSP accounts to bypass their parent&#39;s rules.
     * 
     */
    private Boolean bypassParentRule;
    /**
     * @return Configure how session check behaves.
     * 
     */
    private GetZeroTrustGatewayPoliciesResultRuleSettingsCheckSession checkSession;
    /**
     * @return Add your own custom resolvers to route queries that match the resolver policy. Cannot be used when &#39;resolve*dns*through*cloudflare&#39; or &#39;resolve*dns*internally&#39; are set. DNS queries will route to the address closest to their origin. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
     * 
     */
    private GetZeroTrustGatewayPoliciesResultRuleSettingsDnsResolvers dnsResolvers;
    /**
     * @return Configure how Gateway Proxy traffic egresses. You can enable this setting for rules with Egress actions and filters, or omit it to indicate local egress via WARP IPs.
     * 
     */
    private GetZeroTrustGatewayPoliciesResultRuleSettingsEgress egress;
    /**
     * @return Set to true, to ignore the category matches at CNAME domains in a response. If unchecked, the categories in this rule will be checked against all the CNAME domain categories in a response.
     * 
     */
    private Boolean ignoreCnameCategoryMatches;
    /**
     * @return INSECURE - disable DNSSEC validation (for Allow actions).
     * 
     */
    private Boolean insecureDisableDnssecValidation;
    /**
     * @return Set to true to enable IPs in DNS resolver category blocks. By default categories only block based on domain names.
     * 
     */
    private Boolean ipCategories;
    /**
     * @return Set to true to include IPs in DNS resolver indicator feed blocks. By default indicator feeds only block based on domain names.
     * 
     */
    private Boolean ipIndicatorFeeds;
    /**
     * @return Send matching traffic to the supplied destination IP address and port.
     * 
     */
    private GetZeroTrustGatewayPoliciesResultRuleSettingsL4override l4override;
    /**
     * @return Configure a notification to display on the user&#39;s device when this rule is matched.
     * 
     */
    private GetZeroTrustGatewayPoliciesResultRuleSettingsNotificationSettings notificationSettings;
    /**
     * @return Override matching DNS queries with a hostname.
     * 
     */
    private String overrideHost;
    /**
     * @return Override matching DNS queries with an IP or set of IPs.
     * 
     */
    private List<String> overrideIps;
    /**
     * @return Configure DLP payload logging.
     * 
     */
    private GetZeroTrustGatewayPoliciesResultRuleSettingsPayloadLog payloadLog;
    /**
     * @return Settings that apply to quarantine rules
     * 
     */
    private GetZeroTrustGatewayPoliciesResultRuleSettingsQuarantine quarantine;
    /**
     * @return Settings that apply to redirect rules
     * 
     */
    private GetZeroTrustGatewayPoliciesResultRuleSettingsRedirect redirect;
    /**
     * @return Configure to forward the query to the internal DNS service, passing the specified &#39;view*id&#39; as input. Cannot be set when &#39;dns*resolvers&#39; are specified or &#39;resolve*dns*through*cloudflare&#39; is set. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
     * 
     */
    private GetZeroTrustGatewayPoliciesResultRuleSettingsResolveDnsInternally resolveDnsInternally;
    /**
     * @return Enable to send queries that match the policy to Cloudflare&#39;s default 1.1.1.1 DNS resolver. Cannot be set when &#39;dns*resolvers&#39; are specified or &#39;resolve*dns_internally&#39; is set. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
     * 
     */
    private Boolean resolveDnsThroughCloudflare;
    /**
     * @return Configure behavior when an upstream cert is invalid or an SSL error occurs.
     * 
     */
    private GetZeroTrustGatewayPoliciesResultRuleSettingsUntrustedCert untrustedCert;

    private GetZeroTrustGatewayPoliciesResultRuleSettings() {}
    /**
     * @return Add custom headers to allowed requests, in the form of key-value pairs. Keys are header names, pointing to an array with its header value(s).
     * 
     */
    public Map<String,String> addHeaders() {
        return this.addHeaders;
    }
    /**
     * @return Set by parent MSP accounts to enable their children to bypass this rule.
     * 
     */
    public Boolean allowChildBypass() {
        return this.allowChildBypass;
    }
    /**
     * @return Settings for the Audit SSH action.
     * 
     */
    public GetZeroTrustGatewayPoliciesResultRuleSettingsAuditSsh auditSsh() {
        return this.auditSsh;
    }
    /**
     * @return Configure how browser isolation behaves.
     * 
     */
    public GetZeroTrustGatewayPoliciesResultRuleSettingsBisoAdminControls bisoAdminControls() {
        return this.bisoAdminControls;
    }
    /**
     * @return Custom block page settings. If missing/null, blocking will use the the account settings.
     * 
     */
    public GetZeroTrustGatewayPoliciesResultRuleSettingsBlockPage blockPage() {
        return this.blockPage;
    }
    /**
     * @return Enable the custom block page.
     * 
     */
    public Boolean blockPageEnabled() {
        return this.blockPageEnabled;
    }
    /**
     * @return The text describing why this block occurred, displayed on the custom block page (if enabled).
     * 
     */
    public String blockReason() {
        return this.blockReason;
    }
    /**
     * @return Set by children MSP accounts to bypass their parent&#39;s rules.
     * 
     */
    public Boolean bypassParentRule() {
        return this.bypassParentRule;
    }
    /**
     * @return Configure how session check behaves.
     * 
     */
    public GetZeroTrustGatewayPoliciesResultRuleSettingsCheckSession checkSession() {
        return this.checkSession;
    }
    /**
     * @return Add your own custom resolvers to route queries that match the resolver policy. Cannot be used when &#39;resolve*dns*through*cloudflare&#39; or &#39;resolve*dns*internally&#39; are set. DNS queries will route to the address closest to their origin. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
     * 
     */
    public GetZeroTrustGatewayPoliciesResultRuleSettingsDnsResolvers dnsResolvers() {
        return this.dnsResolvers;
    }
    /**
     * @return Configure how Gateway Proxy traffic egresses. You can enable this setting for rules with Egress actions and filters, or omit it to indicate local egress via WARP IPs.
     * 
     */
    public GetZeroTrustGatewayPoliciesResultRuleSettingsEgress egress() {
        return this.egress;
    }
    /**
     * @return Set to true, to ignore the category matches at CNAME domains in a response. If unchecked, the categories in this rule will be checked against all the CNAME domain categories in a response.
     * 
     */
    public Boolean ignoreCnameCategoryMatches() {
        return this.ignoreCnameCategoryMatches;
    }
    /**
     * @return INSECURE - disable DNSSEC validation (for Allow actions).
     * 
     */
    public Boolean insecureDisableDnssecValidation() {
        return this.insecureDisableDnssecValidation;
    }
    /**
     * @return Set to true to enable IPs in DNS resolver category blocks. By default categories only block based on domain names.
     * 
     */
    public Boolean ipCategories() {
        return this.ipCategories;
    }
    /**
     * @return Set to true to include IPs in DNS resolver indicator feed blocks. By default indicator feeds only block based on domain names.
     * 
     */
    public Boolean ipIndicatorFeeds() {
        return this.ipIndicatorFeeds;
    }
    /**
     * @return Send matching traffic to the supplied destination IP address and port.
     * 
     */
    public GetZeroTrustGatewayPoliciesResultRuleSettingsL4override l4override() {
        return this.l4override;
    }
    /**
     * @return Configure a notification to display on the user&#39;s device when this rule is matched.
     * 
     */
    public GetZeroTrustGatewayPoliciesResultRuleSettingsNotificationSettings notificationSettings() {
        return this.notificationSettings;
    }
    /**
     * @return Override matching DNS queries with a hostname.
     * 
     */
    public String overrideHost() {
        return this.overrideHost;
    }
    /**
     * @return Override matching DNS queries with an IP or set of IPs.
     * 
     */
    public List<String> overrideIps() {
        return this.overrideIps;
    }
    /**
     * @return Configure DLP payload logging.
     * 
     */
    public GetZeroTrustGatewayPoliciesResultRuleSettingsPayloadLog payloadLog() {
        return this.payloadLog;
    }
    /**
     * @return Settings that apply to quarantine rules
     * 
     */
    public GetZeroTrustGatewayPoliciesResultRuleSettingsQuarantine quarantine() {
        return this.quarantine;
    }
    /**
     * @return Settings that apply to redirect rules
     * 
     */
    public GetZeroTrustGatewayPoliciesResultRuleSettingsRedirect redirect() {
        return this.redirect;
    }
    /**
     * @return Configure to forward the query to the internal DNS service, passing the specified &#39;view*id&#39; as input. Cannot be set when &#39;dns*resolvers&#39; are specified or &#39;resolve*dns*through*cloudflare&#39; is set. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
     * 
     */
    public GetZeroTrustGatewayPoliciesResultRuleSettingsResolveDnsInternally resolveDnsInternally() {
        return this.resolveDnsInternally;
    }
    /**
     * @return Enable to send queries that match the policy to Cloudflare&#39;s default 1.1.1.1 DNS resolver. Cannot be set when &#39;dns*resolvers&#39; are specified or &#39;resolve*dns_internally&#39; is set. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
     * 
     */
    public Boolean resolveDnsThroughCloudflare() {
        return this.resolveDnsThroughCloudflare;
    }
    /**
     * @return Configure behavior when an upstream cert is invalid or an SSL error occurs.
     * 
     */
    public GetZeroTrustGatewayPoliciesResultRuleSettingsUntrustedCert untrustedCert() {
        return this.untrustedCert;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustGatewayPoliciesResultRuleSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> addHeaders;
        private Boolean allowChildBypass;
        private GetZeroTrustGatewayPoliciesResultRuleSettingsAuditSsh auditSsh;
        private GetZeroTrustGatewayPoliciesResultRuleSettingsBisoAdminControls bisoAdminControls;
        private GetZeroTrustGatewayPoliciesResultRuleSettingsBlockPage blockPage;
        private Boolean blockPageEnabled;
        private String blockReason;
        private Boolean bypassParentRule;
        private GetZeroTrustGatewayPoliciesResultRuleSettingsCheckSession checkSession;
        private GetZeroTrustGatewayPoliciesResultRuleSettingsDnsResolvers dnsResolvers;
        private GetZeroTrustGatewayPoliciesResultRuleSettingsEgress egress;
        private Boolean ignoreCnameCategoryMatches;
        private Boolean insecureDisableDnssecValidation;
        private Boolean ipCategories;
        private Boolean ipIndicatorFeeds;
        private GetZeroTrustGatewayPoliciesResultRuleSettingsL4override l4override;
        private GetZeroTrustGatewayPoliciesResultRuleSettingsNotificationSettings notificationSettings;
        private String overrideHost;
        private List<String> overrideIps;
        private GetZeroTrustGatewayPoliciesResultRuleSettingsPayloadLog payloadLog;
        private GetZeroTrustGatewayPoliciesResultRuleSettingsQuarantine quarantine;
        private GetZeroTrustGatewayPoliciesResultRuleSettingsRedirect redirect;
        private GetZeroTrustGatewayPoliciesResultRuleSettingsResolveDnsInternally resolveDnsInternally;
        private Boolean resolveDnsThroughCloudflare;
        private GetZeroTrustGatewayPoliciesResultRuleSettingsUntrustedCert untrustedCert;
        public Builder() {}
        public Builder(GetZeroTrustGatewayPoliciesResultRuleSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addHeaders = defaults.addHeaders;
    	      this.allowChildBypass = defaults.allowChildBypass;
    	      this.auditSsh = defaults.auditSsh;
    	      this.bisoAdminControls = defaults.bisoAdminControls;
    	      this.blockPage = defaults.blockPage;
    	      this.blockPageEnabled = defaults.blockPageEnabled;
    	      this.blockReason = defaults.blockReason;
    	      this.bypassParentRule = defaults.bypassParentRule;
    	      this.checkSession = defaults.checkSession;
    	      this.dnsResolvers = defaults.dnsResolvers;
    	      this.egress = defaults.egress;
    	      this.ignoreCnameCategoryMatches = defaults.ignoreCnameCategoryMatches;
    	      this.insecureDisableDnssecValidation = defaults.insecureDisableDnssecValidation;
    	      this.ipCategories = defaults.ipCategories;
    	      this.ipIndicatorFeeds = defaults.ipIndicatorFeeds;
    	      this.l4override = defaults.l4override;
    	      this.notificationSettings = defaults.notificationSettings;
    	      this.overrideHost = defaults.overrideHost;
    	      this.overrideIps = defaults.overrideIps;
    	      this.payloadLog = defaults.payloadLog;
    	      this.quarantine = defaults.quarantine;
    	      this.redirect = defaults.redirect;
    	      this.resolveDnsInternally = defaults.resolveDnsInternally;
    	      this.resolveDnsThroughCloudflare = defaults.resolveDnsThroughCloudflare;
    	      this.untrustedCert = defaults.untrustedCert;
        }

        @CustomType.Setter
        public Builder addHeaders(Map<String,String> addHeaders) {
            if (addHeaders == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "addHeaders");
            }
            this.addHeaders = addHeaders;
            return this;
        }
        @CustomType.Setter
        public Builder allowChildBypass(Boolean allowChildBypass) {
            if (allowChildBypass == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "allowChildBypass");
            }
            this.allowChildBypass = allowChildBypass;
            return this;
        }
        @CustomType.Setter
        public Builder auditSsh(GetZeroTrustGatewayPoliciesResultRuleSettingsAuditSsh auditSsh) {
            if (auditSsh == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "auditSsh");
            }
            this.auditSsh = auditSsh;
            return this;
        }
        @CustomType.Setter
        public Builder bisoAdminControls(GetZeroTrustGatewayPoliciesResultRuleSettingsBisoAdminControls bisoAdminControls) {
            if (bisoAdminControls == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "bisoAdminControls");
            }
            this.bisoAdminControls = bisoAdminControls;
            return this;
        }
        @CustomType.Setter
        public Builder blockPage(GetZeroTrustGatewayPoliciesResultRuleSettingsBlockPage blockPage) {
            if (blockPage == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "blockPage");
            }
            this.blockPage = blockPage;
            return this;
        }
        @CustomType.Setter
        public Builder blockPageEnabled(Boolean blockPageEnabled) {
            if (blockPageEnabled == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "blockPageEnabled");
            }
            this.blockPageEnabled = blockPageEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder blockReason(String blockReason) {
            if (blockReason == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "blockReason");
            }
            this.blockReason = blockReason;
            return this;
        }
        @CustomType.Setter
        public Builder bypassParentRule(Boolean bypassParentRule) {
            if (bypassParentRule == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "bypassParentRule");
            }
            this.bypassParentRule = bypassParentRule;
            return this;
        }
        @CustomType.Setter
        public Builder checkSession(GetZeroTrustGatewayPoliciesResultRuleSettingsCheckSession checkSession) {
            if (checkSession == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "checkSession");
            }
            this.checkSession = checkSession;
            return this;
        }
        @CustomType.Setter
        public Builder dnsResolvers(GetZeroTrustGatewayPoliciesResultRuleSettingsDnsResolvers dnsResolvers) {
            if (dnsResolvers == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "dnsResolvers");
            }
            this.dnsResolvers = dnsResolvers;
            return this;
        }
        @CustomType.Setter
        public Builder egress(GetZeroTrustGatewayPoliciesResultRuleSettingsEgress egress) {
            if (egress == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "egress");
            }
            this.egress = egress;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreCnameCategoryMatches(Boolean ignoreCnameCategoryMatches) {
            if (ignoreCnameCategoryMatches == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "ignoreCnameCategoryMatches");
            }
            this.ignoreCnameCategoryMatches = ignoreCnameCategoryMatches;
            return this;
        }
        @CustomType.Setter
        public Builder insecureDisableDnssecValidation(Boolean insecureDisableDnssecValidation) {
            if (insecureDisableDnssecValidation == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "insecureDisableDnssecValidation");
            }
            this.insecureDisableDnssecValidation = insecureDisableDnssecValidation;
            return this;
        }
        @CustomType.Setter
        public Builder ipCategories(Boolean ipCategories) {
            if (ipCategories == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "ipCategories");
            }
            this.ipCategories = ipCategories;
            return this;
        }
        @CustomType.Setter
        public Builder ipIndicatorFeeds(Boolean ipIndicatorFeeds) {
            if (ipIndicatorFeeds == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "ipIndicatorFeeds");
            }
            this.ipIndicatorFeeds = ipIndicatorFeeds;
            return this;
        }
        @CustomType.Setter
        public Builder l4override(GetZeroTrustGatewayPoliciesResultRuleSettingsL4override l4override) {
            if (l4override == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "l4override");
            }
            this.l4override = l4override;
            return this;
        }
        @CustomType.Setter
        public Builder notificationSettings(GetZeroTrustGatewayPoliciesResultRuleSettingsNotificationSettings notificationSettings) {
            if (notificationSettings == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "notificationSettings");
            }
            this.notificationSettings = notificationSettings;
            return this;
        }
        @CustomType.Setter
        public Builder overrideHost(String overrideHost) {
            if (overrideHost == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "overrideHost");
            }
            this.overrideHost = overrideHost;
            return this;
        }
        @CustomType.Setter
        public Builder overrideIps(List<String> overrideIps) {
            if (overrideIps == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "overrideIps");
            }
            this.overrideIps = overrideIps;
            return this;
        }
        public Builder overrideIps(String... overrideIps) {
            return overrideIps(List.of(overrideIps));
        }
        @CustomType.Setter
        public Builder payloadLog(GetZeroTrustGatewayPoliciesResultRuleSettingsPayloadLog payloadLog) {
            if (payloadLog == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "payloadLog");
            }
            this.payloadLog = payloadLog;
            return this;
        }
        @CustomType.Setter
        public Builder quarantine(GetZeroTrustGatewayPoliciesResultRuleSettingsQuarantine quarantine) {
            if (quarantine == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "quarantine");
            }
            this.quarantine = quarantine;
            return this;
        }
        @CustomType.Setter
        public Builder redirect(GetZeroTrustGatewayPoliciesResultRuleSettingsRedirect redirect) {
            if (redirect == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "redirect");
            }
            this.redirect = redirect;
            return this;
        }
        @CustomType.Setter
        public Builder resolveDnsInternally(GetZeroTrustGatewayPoliciesResultRuleSettingsResolveDnsInternally resolveDnsInternally) {
            if (resolveDnsInternally == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "resolveDnsInternally");
            }
            this.resolveDnsInternally = resolveDnsInternally;
            return this;
        }
        @CustomType.Setter
        public Builder resolveDnsThroughCloudflare(Boolean resolveDnsThroughCloudflare) {
            if (resolveDnsThroughCloudflare == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "resolveDnsThroughCloudflare");
            }
            this.resolveDnsThroughCloudflare = resolveDnsThroughCloudflare;
            return this;
        }
        @CustomType.Setter
        public Builder untrustedCert(GetZeroTrustGatewayPoliciesResultRuleSettingsUntrustedCert untrustedCert) {
            if (untrustedCert == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustGatewayPoliciesResultRuleSettings", "untrustedCert");
            }
            this.untrustedCert = untrustedCert;
            return this;
        }
        public GetZeroTrustGatewayPoliciesResultRuleSettings build() {
            final var _resultValue = new GetZeroTrustGatewayPoliciesResultRuleSettings();
            _resultValue.addHeaders = addHeaders;
            _resultValue.allowChildBypass = allowChildBypass;
            _resultValue.auditSsh = auditSsh;
            _resultValue.bisoAdminControls = bisoAdminControls;
            _resultValue.blockPage = blockPage;
            _resultValue.blockPageEnabled = blockPageEnabled;
            _resultValue.blockReason = blockReason;
            _resultValue.bypassParentRule = bypassParentRule;
            _resultValue.checkSession = checkSession;
            _resultValue.dnsResolvers = dnsResolvers;
            _resultValue.egress = egress;
            _resultValue.ignoreCnameCategoryMatches = ignoreCnameCategoryMatches;
            _resultValue.insecureDisableDnssecValidation = insecureDisableDnssecValidation;
            _resultValue.ipCategories = ipCategories;
            _resultValue.ipIndicatorFeeds = ipIndicatorFeeds;
            _resultValue.l4override = l4override;
            _resultValue.notificationSettings = notificationSettings;
            _resultValue.overrideHost = overrideHost;
            _resultValue.overrideIps = overrideIps;
            _resultValue.payloadLog = payloadLog;
            _resultValue.quarantine = quarantine;
            _resultValue.redirect = redirect;
            _resultValue.resolveDnsInternally = resolveDnsInternally;
            _resultValue.resolveDnsThroughCloudflare = resolveDnsThroughCloudflare;
            _resultValue.untrustedCert = untrustedCert;
            return _resultValue;
        }
    }
}
