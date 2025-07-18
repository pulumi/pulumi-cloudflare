// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.PageRuleActionsCacheKeyFieldsArgs;
import com.pulumi.cloudflare.inputs.PageRuleActionsForwardingUrlArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PageRuleActionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PageRuleActionsArgs Empty = new PageRuleActionsArgs();

    @Import(name="alwaysUseHttps")
    private @Nullable Output<Boolean> alwaysUseHttps;

    public Optional<Output<Boolean>> alwaysUseHttps() {
        return Optional.ofNullable(this.alwaysUseHttps);
    }

    @Import(name="automaticHttpsRewrites")
    private @Nullable Output<String> automaticHttpsRewrites;

    public Optional<Output<String>> automaticHttpsRewrites() {
        return Optional.ofNullable(this.automaticHttpsRewrites);
    }

    @Import(name="browserCacheTtl")
    private @Nullable Output<Integer> browserCacheTtl;

    public Optional<Output<Integer>> browserCacheTtl() {
        return Optional.ofNullable(this.browserCacheTtl);
    }

    @Import(name="browserCheck")
    private @Nullable Output<String> browserCheck;

    public Optional<Output<String>> browserCheck() {
        return Optional.ofNullable(this.browserCheck);
    }

    @Import(name="bypassCacheOnCookie")
    private @Nullable Output<String> bypassCacheOnCookie;

    public Optional<Output<String>> bypassCacheOnCookie() {
        return Optional.ofNullable(this.bypassCacheOnCookie);
    }

    @Import(name="cacheByDeviceType")
    private @Nullable Output<String> cacheByDeviceType;

    public Optional<Output<String>> cacheByDeviceType() {
        return Optional.ofNullable(this.cacheByDeviceType);
    }

    @Import(name="cacheDeceptionArmor")
    private @Nullable Output<String> cacheDeceptionArmor;

    public Optional<Output<String>> cacheDeceptionArmor() {
        return Optional.ofNullable(this.cacheDeceptionArmor);
    }

    @Import(name="cacheKeyFields")
    private @Nullable Output<PageRuleActionsCacheKeyFieldsArgs> cacheKeyFields;

    public Optional<Output<PageRuleActionsCacheKeyFieldsArgs>> cacheKeyFields() {
        return Optional.ofNullable(this.cacheKeyFields);
    }

    @Import(name="cacheLevel")
    private @Nullable Output<String> cacheLevel;

    public Optional<Output<String>> cacheLevel() {
        return Optional.ofNullable(this.cacheLevel);
    }

    @Import(name="cacheOnCookie")
    private @Nullable Output<String> cacheOnCookie;

    public Optional<Output<String>> cacheOnCookie() {
        return Optional.ofNullable(this.cacheOnCookie);
    }

    @Import(name="cacheTtlByStatus")
    private @Nullable Output<Map<String,String>> cacheTtlByStatus;

    public Optional<Output<Map<String,String>>> cacheTtlByStatus() {
        return Optional.ofNullable(this.cacheTtlByStatus);
    }

    @Import(name="disableApps")
    private @Nullable Output<Boolean> disableApps;

    public Optional<Output<Boolean>> disableApps() {
        return Optional.ofNullable(this.disableApps);
    }

    @Import(name="disablePerformance")
    private @Nullable Output<Boolean> disablePerformance;

    public Optional<Output<Boolean>> disablePerformance() {
        return Optional.ofNullable(this.disablePerformance);
    }

    @Import(name="disableSecurity")
    private @Nullable Output<Boolean> disableSecurity;

    public Optional<Output<Boolean>> disableSecurity() {
        return Optional.ofNullable(this.disableSecurity);
    }

    @Import(name="disableZaraz")
    private @Nullable Output<Boolean> disableZaraz;

    public Optional<Output<Boolean>> disableZaraz() {
        return Optional.ofNullable(this.disableZaraz);
    }

    @Import(name="edgeCacheTtl")
    private @Nullable Output<Integer> edgeCacheTtl;

    public Optional<Output<Integer>> edgeCacheTtl() {
        return Optional.ofNullable(this.edgeCacheTtl);
    }

    @Import(name="emailObfuscation")
    private @Nullable Output<String> emailObfuscation;

    public Optional<Output<String>> emailObfuscation() {
        return Optional.ofNullable(this.emailObfuscation);
    }

    @Import(name="explicitCacheControl")
    private @Nullable Output<String> explicitCacheControl;

    public Optional<Output<String>> explicitCacheControl() {
        return Optional.ofNullable(this.explicitCacheControl);
    }

    @Import(name="forwardingUrl")
    private @Nullable Output<PageRuleActionsForwardingUrlArgs> forwardingUrl;

    public Optional<Output<PageRuleActionsForwardingUrlArgs>> forwardingUrl() {
        return Optional.ofNullable(this.forwardingUrl);
    }

    @Import(name="hostHeaderOverride")
    private @Nullable Output<String> hostHeaderOverride;

    public Optional<Output<String>> hostHeaderOverride() {
        return Optional.ofNullable(this.hostHeaderOverride);
    }

    @Import(name="ipGeolocation")
    private @Nullable Output<String> ipGeolocation;

    public Optional<Output<String>> ipGeolocation() {
        return Optional.ofNullable(this.ipGeolocation);
    }

    @Import(name="mirage")
    private @Nullable Output<String> mirage;

    public Optional<Output<String>> mirage() {
        return Optional.ofNullable(this.mirage);
    }

    @Import(name="opportunisticEncryption")
    private @Nullable Output<String> opportunisticEncryption;

    public Optional<Output<String>> opportunisticEncryption() {
        return Optional.ofNullable(this.opportunisticEncryption);
    }

    @Import(name="originErrorPagePassThru")
    private @Nullable Output<String> originErrorPagePassThru;

    public Optional<Output<String>> originErrorPagePassThru() {
        return Optional.ofNullable(this.originErrorPagePassThru);
    }

    @Import(name="polish")
    private @Nullable Output<String> polish;

    public Optional<Output<String>> polish() {
        return Optional.ofNullable(this.polish);
    }

    @Import(name="resolveOverride")
    private @Nullable Output<String> resolveOverride;

    public Optional<Output<String>> resolveOverride() {
        return Optional.ofNullable(this.resolveOverride);
    }

    @Import(name="respectStrongEtag")
    private @Nullable Output<String> respectStrongEtag;

    public Optional<Output<String>> respectStrongEtag() {
        return Optional.ofNullable(this.respectStrongEtag);
    }

    @Import(name="responseBuffering")
    private @Nullable Output<String> responseBuffering;

    public Optional<Output<String>> responseBuffering() {
        return Optional.ofNullable(this.responseBuffering);
    }

    @Import(name="rocketLoader")
    private @Nullable Output<String> rocketLoader;

    public Optional<Output<String>> rocketLoader() {
        return Optional.ofNullable(this.rocketLoader);
    }

    @Import(name="securityLevel")
    private @Nullable Output<String> securityLevel;

    public Optional<Output<String>> securityLevel() {
        return Optional.ofNullable(this.securityLevel);
    }

    @Import(name="sortQueryStringForCache")
    private @Nullable Output<String> sortQueryStringForCache;

    public Optional<Output<String>> sortQueryStringForCache() {
        return Optional.ofNullable(this.sortQueryStringForCache);
    }

    @Import(name="ssl")
    private @Nullable Output<String> ssl;

    public Optional<Output<String>> ssl() {
        return Optional.ofNullable(this.ssl);
    }

    @Import(name="trueClientIpHeader")
    private @Nullable Output<String> trueClientIpHeader;

    public Optional<Output<String>> trueClientIpHeader() {
        return Optional.ofNullable(this.trueClientIpHeader);
    }

    @Import(name="waf")
    private @Nullable Output<String> waf;

    public Optional<Output<String>> waf() {
        return Optional.ofNullable(this.waf);
    }

    private PageRuleActionsArgs() {}

    private PageRuleActionsArgs(PageRuleActionsArgs $) {
        this.alwaysUseHttps = $.alwaysUseHttps;
        this.automaticHttpsRewrites = $.automaticHttpsRewrites;
        this.browserCacheTtl = $.browserCacheTtl;
        this.browserCheck = $.browserCheck;
        this.bypassCacheOnCookie = $.bypassCacheOnCookie;
        this.cacheByDeviceType = $.cacheByDeviceType;
        this.cacheDeceptionArmor = $.cacheDeceptionArmor;
        this.cacheKeyFields = $.cacheKeyFields;
        this.cacheLevel = $.cacheLevel;
        this.cacheOnCookie = $.cacheOnCookie;
        this.cacheTtlByStatus = $.cacheTtlByStatus;
        this.disableApps = $.disableApps;
        this.disablePerformance = $.disablePerformance;
        this.disableSecurity = $.disableSecurity;
        this.disableZaraz = $.disableZaraz;
        this.edgeCacheTtl = $.edgeCacheTtl;
        this.emailObfuscation = $.emailObfuscation;
        this.explicitCacheControl = $.explicitCacheControl;
        this.forwardingUrl = $.forwardingUrl;
        this.hostHeaderOverride = $.hostHeaderOverride;
        this.ipGeolocation = $.ipGeolocation;
        this.mirage = $.mirage;
        this.opportunisticEncryption = $.opportunisticEncryption;
        this.originErrorPagePassThru = $.originErrorPagePassThru;
        this.polish = $.polish;
        this.resolveOverride = $.resolveOverride;
        this.respectStrongEtag = $.respectStrongEtag;
        this.responseBuffering = $.responseBuffering;
        this.rocketLoader = $.rocketLoader;
        this.securityLevel = $.securityLevel;
        this.sortQueryStringForCache = $.sortQueryStringForCache;
        this.ssl = $.ssl;
        this.trueClientIpHeader = $.trueClientIpHeader;
        this.waf = $.waf;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PageRuleActionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PageRuleActionsArgs $;

        public Builder() {
            $ = new PageRuleActionsArgs();
        }

        public Builder(PageRuleActionsArgs defaults) {
            $ = new PageRuleActionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder alwaysUseHttps(@Nullable Output<Boolean> alwaysUseHttps) {
            $.alwaysUseHttps = alwaysUseHttps;
            return this;
        }

        public Builder alwaysUseHttps(Boolean alwaysUseHttps) {
            return alwaysUseHttps(Output.of(alwaysUseHttps));
        }

        public Builder automaticHttpsRewrites(@Nullable Output<String> automaticHttpsRewrites) {
            $.automaticHttpsRewrites = automaticHttpsRewrites;
            return this;
        }

        public Builder automaticHttpsRewrites(String automaticHttpsRewrites) {
            return automaticHttpsRewrites(Output.of(automaticHttpsRewrites));
        }

        public Builder browserCacheTtl(@Nullable Output<Integer> browserCacheTtl) {
            $.browserCacheTtl = browserCacheTtl;
            return this;
        }

        public Builder browserCacheTtl(Integer browserCacheTtl) {
            return browserCacheTtl(Output.of(browserCacheTtl));
        }

        public Builder browserCheck(@Nullable Output<String> browserCheck) {
            $.browserCheck = browserCheck;
            return this;
        }

        public Builder browserCheck(String browserCheck) {
            return browserCheck(Output.of(browserCheck));
        }

        public Builder bypassCacheOnCookie(@Nullable Output<String> bypassCacheOnCookie) {
            $.bypassCacheOnCookie = bypassCacheOnCookie;
            return this;
        }

        public Builder bypassCacheOnCookie(String bypassCacheOnCookie) {
            return bypassCacheOnCookie(Output.of(bypassCacheOnCookie));
        }

        public Builder cacheByDeviceType(@Nullable Output<String> cacheByDeviceType) {
            $.cacheByDeviceType = cacheByDeviceType;
            return this;
        }

        public Builder cacheByDeviceType(String cacheByDeviceType) {
            return cacheByDeviceType(Output.of(cacheByDeviceType));
        }

        public Builder cacheDeceptionArmor(@Nullable Output<String> cacheDeceptionArmor) {
            $.cacheDeceptionArmor = cacheDeceptionArmor;
            return this;
        }

        public Builder cacheDeceptionArmor(String cacheDeceptionArmor) {
            return cacheDeceptionArmor(Output.of(cacheDeceptionArmor));
        }

        public Builder cacheKeyFields(@Nullable Output<PageRuleActionsCacheKeyFieldsArgs> cacheKeyFields) {
            $.cacheKeyFields = cacheKeyFields;
            return this;
        }

        public Builder cacheKeyFields(PageRuleActionsCacheKeyFieldsArgs cacheKeyFields) {
            return cacheKeyFields(Output.of(cacheKeyFields));
        }

        public Builder cacheLevel(@Nullable Output<String> cacheLevel) {
            $.cacheLevel = cacheLevel;
            return this;
        }

        public Builder cacheLevel(String cacheLevel) {
            return cacheLevel(Output.of(cacheLevel));
        }

        public Builder cacheOnCookie(@Nullable Output<String> cacheOnCookie) {
            $.cacheOnCookie = cacheOnCookie;
            return this;
        }

        public Builder cacheOnCookie(String cacheOnCookie) {
            return cacheOnCookie(Output.of(cacheOnCookie));
        }

        public Builder cacheTtlByStatus(@Nullable Output<Map<String,String>> cacheTtlByStatus) {
            $.cacheTtlByStatus = cacheTtlByStatus;
            return this;
        }

        public Builder cacheTtlByStatus(Map<String,String> cacheTtlByStatus) {
            return cacheTtlByStatus(Output.of(cacheTtlByStatus));
        }

        public Builder disableApps(@Nullable Output<Boolean> disableApps) {
            $.disableApps = disableApps;
            return this;
        }

        public Builder disableApps(Boolean disableApps) {
            return disableApps(Output.of(disableApps));
        }

        public Builder disablePerformance(@Nullable Output<Boolean> disablePerformance) {
            $.disablePerformance = disablePerformance;
            return this;
        }

        public Builder disablePerformance(Boolean disablePerformance) {
            return disablePerformance(Output.of(disablePerformance));
        }

        public Builder disableSecurity(@Nullable Output<Boolean> disableSecurity) {
            $.disableSecurity = disableSecurity;
            return this;
        }

        public Builder disableSecurity(Boolean disableSecurity) {
            return disableSecurity(Output.of(disableSecurity));
        }

        public Builder disableZaraz(@Nullable Output<Boolean> disableZaraz) {
            $.disableZaraz = disableZaraz;
            return this;
        }

        public Builder disableZaraz(Boolean disableZaraz) {
            return disableZaraz(Output.of(disableZaraz));
        }

        public Builder edgeCacheTtl(@Nullable Output<Integer> edgeCacheTtl) {
            $.edgeCacheTtl = edgeCacheTtl;
            return this;
        }

        public Builder edgeCacheTtl(Integer edgeCacheTtl) {
            return edgeCacheTtl(Output.of(edgeCacheTtl));
        }

        public Builder emailObfuscation(@Nullable Output<String> emailObfuscation) {
            $.emailObfuscation = emailObfuscation;
            return this;
        }

        public Builder emailObfuscation(String emailObfuscation) {
            return emailObfuscation(Output.of(emailObfuscation));
        }

        public Builder explicitCacheControl(@Nullable Output<String> explicitCacheControl) {
            $.explicitCacheControl = explicitCacheControl;
            return this;
        }

        public Builder explicitCacheControl(String explicitCacheControl) {
            return explicitCacheControl(Output.of(explicitCacheControl));
        }

        public Builder forwardingUrl(@Nullable Output<PageRuleActionsForwardingUrlArgs> forwardingUrl) {
            $.forwardingUrl = forwardingUrl;
            return this;
        }

        public Builder forwardingUrl(PageRuleActionsForwardingUrlArgs forwardingUrl) {
            return forwardingUrl(Output.of(forwardingUrl));
        }

        public Builder hostHeaderOverride(@Nullable Output<String> hostHeaderOverride) {
            $.hostHeaderOverride = hostHeaderOverride;
            return this;
        }

        public Builder hostHeaderOverride(String hostHeaderOverride) {
            return hostHeaderOverride(Output.of(hostHeaderOverride));
        }

        public Builder ipGeolocation(@Nullable Output<String> ipGeolocation) {
            $.ipGeolocation = ipGeolocation;
            return this;
        }

        public Builder ipGeolocation(String ipGeolocation) {
            return ipGeolocation(Output.of(ipGeolocation));
        }

        public Builder mirage(@Nullable Output<String> mirage) {
            $.mirage = mirage;
            return this;
        }

        public Builder mirage(String mirage) {
            return mirage(Output.of(mirage));
        }

        public Builder opportunisticEncryption(@Nullable Output<String> opportunisticEncryption) {
            $.opportunisticEncryption = opportunisticEncryption;
            return this;
        }

        public Builder opportunisticEncryption(String opportunisticEncryption) {
            return opportunisticEncryption(Output.of(opportunisticEncryption));
        }

        public Builder originErrorPagePassThru(@Nullable Output<String> originErrorPagePassThru) {
            $.originErrorPagePassThru = originErrorPagePassThru;
            return this;
        }

        public Builder originErrorPagePassThru(String originErrorPagePassThru) {
            return originErrorPagePassThru(Output.of(originErrorPagePassThru));
        }

        public Builder polish(@Nullable Output<String> polish) {
            $.polish = polish;
            return this;
        }

        public Builder polish(String polish) {
            return polish(Output.of(polish));
        }

        public Builder resolveOverride(@Nullable Output<String> resolveOverride) {
            $.resolveOverride = resolveOverride;
            return this;
        }

        public Builder resolveOverride(String resolveOverride) {
            return resolveOverride(Output.of(resolveOverride));
        }

        public Builder respectStrongEtag(@Nullable Output<String> respectStrongEtag) {
            $.respectStrongEtag = respectStrongEtag;
            return this;
        }

        public Builder respectStrongEtag(String respectStrongEtag) {
            return respectStrongEtag(Output.of(respectStrongEtag));
        }

        public Builder responseBuffering(@Nullable Output<String> responseBuffering) {
            $.responseBuffering = responseBuffering;
            return this;
        }

        public Builder responseBuffering(String responseBuffering) {
            return responseBuffering(Output.of(responseBuffering));
        }

        public Builder rocketLoader(@Nullable Output<String> rocketLoader) {
            $.rocketLoader = rocketLoader;
            return this;
        }

        public Builder rocketLoader(String rocketLoader) {
            return rocketLoader(Output.of(rocketLoader));
        }

        public Builder securityLevel(@Nullable Output<String> securityLevel) {
            $.securityLevel = securityLevel;
            return this;
        }

        public Builder securityLevel(String securityLevel) {
            return securityLevel(Output.of(securityLevel));
        }

        public Builder sortQueryStringForCache(@Nullable Output<String> sortQueryStringForCache) {
            $.sortQueryStringForCache = sortQueryStringForCache;
            return this;
        }

        public Builder sortQueryStringForCache(String sortQueryStringForCache) {
            return sortQueryStringForCache(Output.of(sortQueryStringForCache));
        }

        public Builder ssl(@Nullable Output<String> ssl) {
            $.ssl = ssl;
            return this;
        }

        public Builder ssl(String ssl) {
            return ssl(Output.of(ssl));
        }

        public Builder trueClientIpHeader(@Nullable Output<String> trueClientIpHeader) {
            $.trueClientIpHeader = trueClientIpHeader;
            return this;
        }

        public Builder trueClientIpHeader(String trueClientIpHeader) {
            return trueClientIpHeader(Output.of(trueClientIpHeader));
        }

        public Builder waf(@Nullable Output<String> waf) {
            $.waf = waf;
            return this;
        }

        public Builder waf(String waf) {
            return waf(Output.of(waf));
        }

        public PageRuleActionsArgs build() {
            return $;
        }
    }

}
