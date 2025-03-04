// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZoneSettingsOverrideSettingsAegisArgs;
import com.pulumi.cloudflare.inputs.ZoneSettingsOverrideSettingsMinifyArgs;
import com.pulumi.cloudflare.inputs.ZoneSettingsOverrideSettingsMobileRedirectArgs;
import com.pulumi.cloudflare.inputs.ZoneSettingsOverrideSettingsNelArgs;
import com.pulumi.cloudflare.inputs.ZoneSettingsOverrideSettingsSecurityHeaderArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZoneSettingsOverrideSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZoneSettingsOverrideSettingsArgs Empty = new ZoneSettingsOverrideSettingsArgs();

    @Import(name="aegis")
    private @Nullable Output<ZoneSettingsOverrideSettingsAegisArgs> aegis;

    public Optional<Output<ZoneSettingsOverrideSettingsAegisArgs>> aegis() {
        return Optional.ofNullable(this.aegis);
    }

    @Import(name="alwaysOnline")
    private @Nullable Output<String> alwaysOnline;

    public Optional<Output<String>> alwaysOnline() {
        return Optional.ofNullable(this.alwaysOnline);
    }

    @Import(name="alwaysUseHttps")
    private @Nullable Output<String> alwaysUseHttps;

    public Optional<Output<String>> alwaysUseHttps() {
        return Optional.ofNullable(this.alwaysUseHttps);
    }

    @Import(name="automaticHttpsRewrites")
    private @Nullable Output<String> automaticHttpsRewrites;

    public Optional<Output<String>> automaticHttpsRewrites() {
        return Optional.ofNullable(this.automaticHttpsRewrites);
    }

    @Import(name="binaryAst")
    private @Nullable Output<String> binaryAst;

    public Optional<Output<String>> binaryAst() {
        return Optional.ofNullable(this.binaryAst);
    }

    @Import(name="brotli")
    private @Nullable Output<String> brotli;

    public Optional<Output<String>> brotli() {
        return Optional.ofNullable(this.brotli);
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

    @Import(name="cacheLevel")
    private @Nullable Output<String> cacheLevel;

    public Optional<Output<String>> cacheLevel() {
        return Optional.ofNullable(this.cacheLevel);
    }

    @Import(name="challengeTtl")
    private @Nullable Output<Integer> challengeTtl;

    public Optional<Output<Integer>> challengeTtl() {
        return Optional.ofNullable(this.challengeTtl);
    }

    @Import(name="ciphers")
    private @Nullable Output<List<String>> ciphers;

    public Optional<Output<List<String>>> ciphers() {
        return Optional.ofNullable(this.ciphers);
    }

    @Import(name="cnameFlattening")
    private @Nullable Output<String> cnameFlattening;

    public Optional<Output<String>> cnameFlattening() {
        return Optional.ofNullable(this.cnameFlattening);
    }

    @Import(name="developmentMode")
    private @Nullable Output<String> developmentMode;

    public Optional<Output<String>> developmentMode() {
        return Optional.ofNullable(this.developmentMode);
    }

    @Import(name="earlyHints")
    private @Nullable Output<String> earlyHints;

    public Optional<Output<String>> earlyHints() {
        return Optional.ofNullable(this.earlyHints);
    }

    @Import(name="emailObfuscation")
    private @Nullable Output<String> emailObfuscation;

    public Optional<Output<String>> emailObfuscation() {
        return Optional.ofNullable(this.emailObfuscation);
    }

    @Import(name="filterLogsToCloudflare")
    private @Nullable Output<String> filterLogsToCloudflare;

    public Optional<Output<String>> filterLogsToCloudflare() {
        return Optional.ofNullable(this.filterLogsToCloudflare);
    }

    @Import(name="fonts")
    private @Nullable Output<String> fonts;

    public Optional<Output<String>> fonts() {
        return Optional.ofNullable(this.fonts);
    }

    @Import(name="h2Prioritization")
    private @Nullable Output<String> h2Prioritization;

    public Optional<Output<String>> h2Prioritization() {
        return Optional.ofNullable(this.h2Prioritization);
    }

    @Import(name="hotlinkProtection")
    private @Nullable Output<String> hotlinkProtection;

    public Optional<Output<String>> hotlinkProtection() {
        return Optional.ofNullable(this.hotlinkProtection);
    }

    @Import(name="http2")
    private @Nullable Output<String> http2;

    public Optional<Output<String>> http2() {
        return Optional.ofNullable(this.http2);
    }

    @Import(name="http3")
    private @Nullable Output<String> http3;

    public Optional<Output<String>> http3() {
        return Optional.ofNullable(this.http3);
    }

    @Import(name="imageResizing")
    private @Nullable Output<String> imageResizing;

    public Optional<Output<String>> imageResizing() {
        return Optional.ofNullable(this.imageResizing);
    }

    @Import(name="ipGeolocation")
    private @Nullable Output<String> ipGeolocation;

    public Optional<Output<String>> ipGeolocation() {
        return Optional.ofNullable(this.ipGeolocation);
    }

    @Import(name="ipv6")
    private @Nullable Output<String> ipv6;

    public Optional<Output<String>> ipv6() {
        return Optional.ofNullable(this.ipv6);
    }

    @Import(name="logToCloudflare")
    private @Nullable Output<String> logToCloudflare;

    public Optional<Output<String>> logToCloudflare() {
        return Optional.ofNullable(this.logToCloudflare);
    }

    @Import(name="maxUpload")
    private @Nullable Output<Integer> maxUpload;

    public Optional<Output<Integer>> maxUpload() {
        return Optional.ofNullable(this.maxUpload);
    }

    @Import(name="minTlsVersion")
    private @Nullable Output<String> minTlsVersion;

    public Optional<Output<String>> minTlsVersion() {
        return Optional.ofNullable(this.minTlsVersion);
    }

    @Import(name="minify")
    private @Nullable Output<ZoneSettingsOverrideSettingsMinifyArgs> minify;

    public Optional<Output<ZoneSettingsOverrideSettingsMinifyArgs>> minify() {
        return Optional.ofNullable(this.minify);
    }

    @Import(name="mirage")
    private @Nullable Output<String> mirage;

    public Optional<Output<String>> mirage() {
        return Optional.ofNullable(this.mirage);
    }

    /**
     * @deprecated
     * Mobile redirects has been deprecated and disabled in favour of [Single Redirects](https://developers.cloudflare.com/rules/url-forwarding/single-redirects/) and are no longer configurable using the API. Refer to [Perform mobile redirects](https://developers.cloudflare.com/rules/url-forwarding/single-redirects/examples/#perform-mobile-redirects) for examples of performing mobile redirects with Single Redirects.
     * 
     */
    @Deprecated /* Mobile redirects has been deprecated and disabled in favour of [Single Redirects](https://developers.cloudflare.com/rules/url-forwarding/single-redirects/) and are no longer configurable using the API. Refer to [Perform mobile redirects](https://developers.cloudflare.com/rules/url-forwarding/single-redirects/examples/#perform-mobile-redirects) for examples of performing mobile redirects with Single Redirects. */
    @Import(name="mobileRedirect")
    private @Nullable Output<ZoneSettingsOverrideSettingsMobileRedirectArgs> mobileRedirect;

    /**
     * @deprecated
     * Mobile redirects has been deprecated and disabled in favour of [Single Redirects](https://developers.cloudflare.com/rules/url-forwarding/single-redirects/) and are no longer configurable using the API. Refer to [Perform mobile redirects](https://developers.cloudflare.com/rules/url-forwarding/single-redirects/examples/#perform-mobile-redirects) for examples of performing mobile redirects with Single Redirects.
     * 
     */
    @Deprecated /* Mobile redirects has been deprecated and disabled in favour of [Single Redirects](https://developers.cloudflare.com/rules/url-forwarding/single-redirects/) and are no longer configurable using the API. Refer to [Perform mobile redirects](https://developers.cloudflare.com/rules/url-forwarding/single-redirects/examples/#perform-mobile-redirects) for examples of performing mobile redirects with Single Redirects. */
    public Optional<Output<ZoneSettingsOverrideSettingsMobileRedirectArgs>> mobileRedirect() {
        return Optional.ofNullable(this.mobileRedirect);
    }

    @Import(name="nel")
    private @Nullable Output<ZoneSettingsOverrideSettingsNelArgs> nel;

    public Optional<Output<ZoneSettingsOverrideSettingsNelArgs>> nel() {
        return Optional.ofNullable(this.nel);
    }

    @Import(name="opportunisticEncryption")
    private @Nullable Output<String> opportunisticEncryption;

    public Optional<Output<String>> opportunisticEncryption() {
        return Optional.ofNullable(this.opportunisticEncryption);
    }

    @Import(name="opportunisticOnion")
    private @Nullable Output<String> opportunisticOnion;

    public Optional<Output<String>> opportunisticOnion() {
        return Optional.ofNullable(this.opportunisticOnion);
    }

    @Import(name="orangeToOrange")
    private @Nullable Output<String> orangeToOrange;

    public Optional<Output<String>> orangeToOrange() {
        return Optional.ofNullable(this.orangeToOrange);
    }

    @Import(name="originErrorPagePassThru")
    private @Nullable Output<String> originErrorPagePassThru;

    public Optional<Output<String>> originErrorPagePassThru() {
        return Optional.ofNullable(this.originErrorPagePassThru);
    }

    @Import(name="originMaxHttpVersion")
    private @Nullable Output<String> originMaxHttpVersion;

    public Optional<Output<String>> originMaxHttpVersion() {
        return Optional.ofNullable(this.originMaxHttpVersion);
    }

    @Import(name="polish")
    private @Nullable Output<String> polish;

    public Optional<Output<String>> polish() {
        return Optional.ofNullable(this.polish);
    }

    @Import(name="prefetchPreload")
    private @Nullable Output<String> prefetchPreload;

    public Optional<Output<String>> prefetchPreload() {
        return Optional.ofNullable(this.prefetchPreload);
    }

    @Import(name="privacyPass")
    private @Nullable Output<String> privacyPass;

    public Optional<Output<String>> privacyPass() {
        return Optional.ofNullable(this.privacyPass);
    }

    @Import(name="proxyReadTimeout")
    private @Nullable Output<String> proxyReadTimeout;

    public Optional<Output<String>> proxyReadTimeout() {
        return Optional.ofNullable(this.proxyReadTimeout);
    }

    @Import(name="pseudoIpv4")
    private @Nullable Output<String> pseudoIpv4;

    public Optional<Output<String>> pseudoIpv4() {
        return Optional.ofNullable(this.pseudoIpv4);
    }

    @Import(name="replaceInsecureJs")
    private @Nullable Output<String> replaceInsecureJs;

    public Optional<Output<String>> replaceInsecureJs() {
        return Optional.ofNullable(this.replaceInsecureJs);
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

    @Import(name="securityHeader")
    private @Nullable Output<ZoneSettingsOverrideSettingsSecurityHeaderArgs> securityHeader;

    public Optional<Output<ZoneSettingsOverrideSettingsSecurityHeaderArgs>> securityHeader() {
        return Optional.ofNullable(this.securityHeader);
    }

    @Import(name="securityLevel")
    private @Nullable Output<String> securityLevel;

    public Optional<Output<String>> securityLevel() {
        return Optional.ofNullable(this.securityLevel);
    }

    @Import(name="serverSideExclude")
    private @Nullable Output<String> serverSideExclude;

    public Optional<Output<String>> serverSideExclude() {
        return Optional.ofNullable(this.serverSideExclude);
    }

    @Import(name="sortQueryStringForCache")
    private @Nullable Output<String> sortQueryStringForCache;

    public Optional<Output<String>> sortQueryStringForCache() {
        return Optional.ofNullable(this.sortQueryStringForCache);
    }

    @Import(name="speedBrain")
    private @Nullable Output<String> speedBrain;

    public Optional<Output<String>> speedBrain() {
        return Optional.ofNullable(this.speedBrain);
    }

    @Import(name="ssl")
    private @Nullable Output<String> ssl;

    public Optional<Output<String>> ssl() {
        return Optional.ofNullable(this.ssl);
    }

    @Import(name="sslAutomaticMode")
    private @Nullable Output<String> sslAutomaticMode;

    public Optional<Output<String>> sslAutomaticMode() {
        return Optional.ofNullable(this.sslAutomaticMode);
    }

    /**
     * @deprecated
     * tls_1_2_only has been deprecated in favour of using `min_tls_version = &#34;1.2&#34;` instead.
     * 
     */
    @Deprecated /* tls_1_2_only has been deprecated in favour of using `min_tls_version = ""1.2""` instead. */
    @Import(name="tls12Only")
    private @Nullable Output<String> tls12Only;

    /**
     * @deprecated
     * tls_1_2_only has been deprecated in favour of using `min_tls_version = &#34;1.2&#34;` instead.
     * 
     */
    @Deprecated /* tls_1_2_only has been deprecated in favour of using `min_tls_version = ""1.2""` instead. */
    public Optional<Output<String>> tls12Only() {
        return Optional.ofNullable(this.tls12Only);
    }

    @Import(name="tls13")
    private @Nullable Output<String> tls13;

    public Optional<Output<String>> tls13() {
        return Optional.ofNullable(this.tls13);
    }

    @Import(name="tlsClientAuth")
    private @Nullable Output<String> tlsClientAuth;

    public Optional<Output<String>> tlsClientAuth() {
        return Optional.ofNullable(this.tlsClientAuth);
    }

    @Import(name="trueClientIpHeader")
    private @Nullable Output<String> trueClientIpHeader;

    public Optional<Output<String>> trueClientIpHeader() {
        return Optional.ofNullable(this.trueClientIpHeader);
    }

    @Import(name="universalSsl")
    private @Nullable Output<String> universalSsl;

    public Optional<Output<String>> universalSsl() {
        return Optional.ofNullable(this.universalSsl);
    }

    @Import(name="visitorIp")
    private @Nullable Output<String> visitorIp;

    public Optional<Output<String>> visitorIp() {
        return Optional.ofNullable(this.visitorIp);
    }

    @Import(name="waf")
    private @Nullable Output<String> waf;

    public Optional<Output<String>> waf() {
        return Optional.ofNullable(this.waf);
    }

    @Import(name="webp")
    private @Nullable Output<String> webp;

    public Optional<Output<String>> webp() {
        return Optional.ofNullable(this.webp);
    }

    @Import(name="websockets")
    private @Nullable Output<String> websockets;

    public Optional<Output<String>> websockets() {
        return Optional.ofNullable(this.websockets);
    }

    @Import(name="zeroRtt")
    private @Nullable Output<String> zeroRtt;

    public Optional<Output<String>> zeroRtt() {
        return Optional.ofNullable(this.zeroRtt);
    }

    private ZoneSettingsOverrideSettingsArgs() {}

    private ZoneSettingsOverrideSettingsArgs(ZoneSettingsOverrideSettingsArgs $) {
        this.aegis = $.aegis;
        this.alwaysOnline = $.alwaysOnline;
        this.alwaysUseHttps = $.alwaysUseHttps;
        this.automaticHttpsRewrites = $.automaticHttpsRewrites;
        this.binaryAst = $.binaryAst;
        this.brotli = $.brotli;
        this.browserCacheTtl = $.browserCacheTtl;
        this.browserCheck = $.browserCheck;
        this.cacheLevel = $.cacheLevel;
        this.challengeTtl = $.challengeTtl;
        this.ciphers = $.ciphers;
        this.cnameFlattening = $.cnameFlattening;
        this.developmentMode = $.developmentMode;
        this.earlyHints = $.earlyHints;
        this.emailObfuscation = $.emailObfuscation;
        this.filterLogsToCloudflare = $.filterLogsToCloudflare;
        this.fonts = $.fonts;
        this.h2Prioritization = $.h2Prioritization;
        this.hotlinkProtection = $.hotlinkProtection;
        this.http2 = $.http2;
        this.http3 = $.http3;
        this.imageResizing = $.imageResizing;
        this.ipGeolocation = $.ipGeolocation;
        this.ipv6 = $.ipv6;
        this.logToCloudflare = $.logToCloudflare;
        this.maxUpload = $.maxUpload;
        this.minTlsVersion = $.minTlsVersion;
        this.minify = $.minify;
        this.mirage = $.mirage;
        this.mobileRedirect = $.mobileRedirect;
        this.nel = $.nel;
        this.opportunisticEncryption = $.opportunisticEncryption;
        this.opportunisticOnion = $.opportunisticOnion;
        this.orangeToOrange = $.orangeToOrange;
        this.originErrorPagePassThru = $.originErrorPagePassThru;
        this.originMaxHttpVersion = $.originMaxHttpVersion;
        this.polish = $.polish;
        this.prefetchPreload = $.prefetchPreload;
        this.privacyPass = $.privacyPass;
        this.proxyReadTimeout = $.proxyReadTimeout;
        this.pseudoIpv4 = $.pseudoIpv4;
        this.replaceInsecureJs = $.replaceInsecureJs;
        this.responseBuffering = $.responseBuffering;
        this.rocketLoader = $.rocketLoader;
        this.securityHeader = $.securityHeader;
        this.securityLevel = $.securityLevel;
        this.serverSideExclude = $.serverSideExclude;
        this.sortQueryStringForCache = $.sortQueryStringForCache;
        this.speedBrain = $.speedBrain;
        this.ssl = $.ssl;
        this.sslAutomaticMode = $.sslAutomaticMode;
        this.tls12Only = $.tls12Only;
        this.tls13 = $.tls13;
        this.tlsClientAuth = $.tlsClientAuth;
        this.trueClientIpHeader = $.trueClientIpHeader;
        this.universalSsl = $.universalSsl;
        this.visitorIp = $.visitorIp;
        this.waf = $.waf;
        this.webp = $.webp;
        this.websockets = $.websockets;
        this.zeroRtt = $.zeroRtt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZoneSettingsOverrideSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZoneSettingsOverrideSettingsArgs $;

        public Builder() {
            $ = new ZoneSettingsOverrideSettingsArgs();
        }

        public Builder(ZoneSettingsOverrideSettingsArgs defaults) {
            $ = new ZoneSettingsOverrideSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder aegis(@Nullable Output<ZoneSettingsOverrideSettingsAegisArgs> aegis) {
            $.aegis = aegis;
            return this;
        }

        public Builder aegis(ZoneSettingsOverrideSettingsAegisArgs aegis) {
            return aegis(Output.of(aegis));
        }

        public Builder alwaysOnline(@Nullable Output<String> alwaysOnline) {
            $.alwaysOnline = alwaysOnline;
            return this;
        }

        public Builder alwaysOnline(String alwaysOnline) {
            return alwaysOnline(Output.of(alwaysOnline));
        }

        public Builder alwaysUseHttps(@Nullable Output<String> alwaysUseHttps) {
            $.alwaysUseHttps = alwaysUseHttps;
            return this;
        }

        public Builder alwaysUseHttps(String alwaysUseHttps) {
            return alwaysUseHttps(Output.of(alwaysUseHttps));
        }

        public Builder automaticHttpsRewrites(@Nullable Output<String> automaticHttpsRewrites) {
            $.automaticHttpsRewrites = automaticHttpsRewrites;
            return this;
        }

        public Builder automaticHttpsRewrites(String automaticHttpsRewrites) {
            return automaticHttpsRewrites(Output.of(automaticHttpsRewrites));
        }

        public Builder binaryAst(@Nullable Output<String> binaryAst) {
            $.binaryAst = binaryAst;
            return this;
        }

        public Builder binaryAst(String binaryAst) {
            return binaryAst(Output.of(binaryAst));
        }

        public Builder brotli(@Nullable Output<String> brotli) {
            $.brotli = brotli;
            return this;
        }

        public Builder brotli(String brotli) {
            return brotli(Output.of(brotli));
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

        public Builder cacheLevel(@Nullable Output<String> cacheLevel) {
            $.cacheLevel = cacheLevel;
            return this;
        }

        public Builder cacheLevel(String cacheLevel) {
            return cacheLevel(Output.of(cacheLevel));
        }

        public Builder challengeTtl(@Nullable Output<Integer> challengeTtl) {
            $.challengeTtl = challengeTtl;
            return this;
        }

        public Builder challengeTtl(Integer challengeTtl) {
            return challengeTtl(Output.of(challengeTtl));
        }

        public Builder ciphers(@Nullable Output<List<String>> ciphers) {
            $.ciphers = ciphers;
            return this;
        }

        public Builder ciphers(List<String> ciphers) {
            return ciphers(Output.of(ciphers));
        }

        public Builder ciphers(String... ciphers) {
            return ciphers(List.of(ciphers));
        }

        public Builder cnameFlattening(@Nullable Output<String> cnameFlattening) {
            $.cnameFlattening = cnameFlattening;
            return this;
        }

        public Builder cnameFlattening(String cnameFlattening) {
            return cnameFlattening(Output.of(cnameFlattening));
        }

        public Builder developmentMode(@Nullable Output<String> developmentMode) {
            $.developmentMode = developmentMode;
            return this;
        }

        public Builder developmentMode(String developmentMode) {
            return developmentMode(Output.of(developmentMode));
        }

        public Builder earlyHints(@Nullable Output<String> earlyHints) {
            $.earlyHints = earlyHints;
            return this;
        }

        public Builder earlyHints(String earlyHints) {
            return earlyHints(Output.of(earlyHints));
        }

        public Builder emailObfuscation(@Nullable Output<String> emailObfuscation) {
            $.emailObfuscation = emailObfuscation;
            return this;
        }

        public Builder emailObfuscation(String emailObfuscation) {
            return emailObfuscation(Output.of(emailObfuscation));
        }

        public Builder filterLogsToCloudflare(@Nullable Output<String> filterLogsToCloudflare) {
            $.filterLogsToCloudflare = filterLogsToCloudflare;
            return this;
        }

        public Builder filterLogsToCloudflare(String filterLogsToCloudflare) {
            return filterLogsToCloudflare(Output.of(filterLogsToCloudflare));
        }

        public Builder fonts(@Nullable Output<String> fonts) {
            $.fonts = fonts;
            return this;
        }

        public Builder fonts(String fonts) {
            return fonts(Output.of(fonts));
        }

        public Builder h2Prioritization(@Nullable Output<String> h2Prioritization) {
            $.h2Prioritization = h2Prioritization;
            return this;
        }

        public Builder h2Prioritization(String h2Prioritization) {
            return h2Prioritization(Output.of(h2Prioritization));
        }

        public Builder hotlinkProtection(@Nullable Output<String> hotlinkProtection) {
            $.hotlinkProtection = hotlinkProtection;
            return this;
        }

        public Builder hotlinkProtection(String hotlinkProtection) {
            return hotlinkProtection(Output.of(hotlinkProtection));
        }

        public Builder http2(@Nullable Output<String> http2) {
            $.http2 = http2;
            return this;
        }

        public Builder http2(String http2) {
            return http2(Output.of(http2));
        }

        public Builder http3(@Nullable Output<String> http3) {
            $.http3 = http3;
            return this;
        }

        public Builder http3(String http3) {
            return http3(Output.of(http3));
        }

        public Builder imageResizing(@Nullable Output<String> imageResizing) {
            $.imageResizing = imageResizing;
            return this;
        }

        public Builder imageResizing(String imageResizing) {
            return imageResizing(Output.of(imageResizing));
        }

        public Builder ipGeolocation(@Nullable Output<String> ipGeolocation) {
            $.ipGeolocation = ipGeolocation;
            return this;
        }

        public Builder ipGeolocation(String ipGeolocation) {
            return ipGeolocation(Output.of(ipGeolocation));
        }

        public Builder ipv6(@Nullable Output<String> ipv6) {
            $.ipv6 = ipv6;
            return this;
        }

        public Builder ipv6(String ipv6) {
            return ipv6(Output.of(ipv6));
        }

        public Builder logToCloudflare(@Nullable Output<String> logToCloudflare) {
            $.logToCloudflare = logToCloudflare;
            return this;
        }

        public Builder logToCloudflare(String logToCloudflare) {
            return logToCloudflare(Output.of(logToCloudflare));
        }

        public Builder maxUpload(@Nullable Output<Integer> maxUpload) {
            $.maxUpload = maxUpload;
            return this;
        }

        public Builder maxUpload(Integer maxUpload) {
            return maxUpload(Output.of(maxUpload));
        }

        public Builder minTlsVersion(@Nullable Output<String> minTlsVersion) {
            $.minTlsVersion = minTlsVersion;
            return this;
        }

        public Builder minTlsVersion(String minTlsVersion) {
            return minTlsVersion(Output.of(minTlsVersion));
        }

        public Builder minify(@Nullable Output<ZoneSettingsOverrideSettingsMinifyArgs> minify) {
            $.minify = minify;
            return this;
        }

        public Builder minify(ZoneSettingsOverrideSettingsMinifyArgs minify) {
            return minify(Output.of(minify));
        }

        public Builder mirage(@Nullable Output<String> mirage) {
            $.mirage = mirage;
            return this;
        }

        public Builder mirage(String mirage) {
            return mirage(Output.of(mirage));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Mobile redirects has been deprecated and disabled in favour of [Single Redirects](https://developers.cloudflare.com/rules/url-forwarding/single-redirects/) and are no longer configurable using the API. Refer to [Perform mobile redirects](https://developers.cloudflare.com/rules/url-forwarding/single-redirects/examples/#perform-mobile-redirects) for examples of performing mobile redirects with Single Redirects.
         * 
         */
        @Deprecated /* Mobile redirects has been deprecated and disabled in favour of [Single Redirects](https://developers.cloudflare.com/rules/url-forwarding/single-redirects/) and are no longer configurable using the API. Refer to [Perform mobile redirects](https://developers.cloudflare.com/rules/url-forwarding/single-redirects/examples/#perform-mobile-redirects) for examples of performing mobile redirects with Single Redirects. */
        public Builder mobileRedirect(@Nullable Output<ZoneSettingsOverrideSettingsMobileRedirectArgs> mobileRedirect) {
            $.mobileRedirect = mobileRedirect;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Mobile redirects has been deprecated and disabled in favour of [Single Redirects](https://developers.cloudflare.com/rules/url-forwarding/single-redirects/) and are no longer configurable using the API. Refer to [Perform mobile redirects](https://developers.cloudflare.com/rules/url-forwarding/single-redirects/examples/#perform-mobile-redirects) for examples of performing mobile redirects with Single Redirects.
         * 
         */
        @Deprecated /* Mobile redirects has been deprecated and disabled in favour of [Single Redirects](https://developers.cloudflare.com/rules/url-forwarding/single-redirects/) and are no longer configurable using the API. Refer to [Perform mobile redirects](https://developers.cloudflare.com/rules/url-forwarding/single-redirects/examples/#perform-mobile-redirects) for examples of performing mobile redirects with Single Redirects. */
        public Builder mobileRedirect(ZoneSettingsOverrideSettingsMobileRedirectArgs mobileRedirect) {
            return mobileRedirect(Output.of(mobileRedirect));
        }

        public Builder nel(@Nullable Output<ZoneSettingsOverrideSettingsNelArgs> nel) {
            $.nel = nel;
            return this;
        }

        public Builder nel(ZoneSettingsOverrideSettingsNelArgs nel) {
            return nel(Output.of(nel));
        }

        public Builder opportunisticEncryption(@Nullable Output<String> opportunisticEncryption) {
            $.opportunisticEncryption = opportunisticEncryption;
            return this;
        }

        public Builder opportunisticEncryption(String opportunisticEncryption) {
            return opportunisticEncryption(Output.of(opportunisticEncryption));
        }

        public Builder opportunisticOnion(@Nullable Output<String> opportunisticOnion) {
            $.opportunisticOnion = opportunisticOnion;
            return this;
        }

        public Builder opportunisticOnion(String opportunisticOnion) {
            return opportunisticOnion(Output.of(opportunisticOnion));
        }

        public Builder orangeToOrange(@Nullable Output<String> orangeToOrange) {
            $.orangeToOrange = orangeToOrange;
            return this;
        }

        public Builder orangeToOrange(String orangeToOrange) {
            return orangeToOrange(Output.of(orangeToOrange));
        }

        public Builder originErrorPagePassThru(@Nullable Output<String> originErrorPagePassThru) {
            $.originErrorPagePassThru = originErrorPagePassThru;
            return this;
        }

        public Builder originErrorPagePassThru(String originErrorPagePassThru) {
            return originErrorPagePassThru(Output.of(originErrorPagePassThru));
        }

        public Builder originMaxHttpVersion(@Nullable Output<String> originMaxHttpVersion) {
            $.originMaxHttpVersion = originMaxHttpVersion;
            return this;
        }

        public Builder originMaxHttpVersion(String originMaxHttpVersion) {
            return originMaxHttpVersion(Output.of(originMaxHttpVersion));
        }

        public Builder polish(@Nullable Output<String> polish) {
            $.polish = polish;
            return this;
        }

        public Builder polish(String polish) {
            return polish(Output.of(polish));
        }

        public Builder prefetchPreload(@Nullable Output<String> prefetchPreload) {
            $.prefetchPreload = prefetchPreload;
            return this;
        }

        public Builder prefetchPreload(String prefetchPreload) {
            return prefetchPreload(Output.of(prefetchPreload));
        }

        public Builder privacyPass(@Nullable Output<String> privacyPass) {
            $.privacyPass = privacyPass;
            return this;
        }

        public Builder privacyPass(String privacyPass) {
            return privacyPass(Output.of(privacyPass));
        }

        public Builder proxyReadTimeout(@Nullable Output<String> proxyReadTimeout) {
            $.proxyReadTimeout = proxyReadTimeout;
            return this;
        }

        public Builder proxyReadTimeout(String proxyReadTimeout) {
            return proxyReadTimeout(Output.of(proxyReadTimeout));
        }

        public Builder pseudoIpv4(@Nullable Output<String> pseudoIpv4) {
            $.pseudoIpv4 = pseudoIpv4;
            return this;
        }

        public Builder pseudoIpv4(String pseudoIpv4) {
            return pseudoIpv4(Output.of(pseudoIpv4));
        }

        public Builder replaceInsecureJs(@Nullable Output<String> replaceInsecureJs) {
            $.replaceInsecureJs = replaceInsecureJs;
            return this;
        }

        public Builder replaceInsecureJs(String replaceInsecureJs) {
            return replaceInsecureJs(Output.of(replaceInsecureJs));
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

        public Builder securityHeader(@Nullable Output<ZoneSettingsOverrideSettingsSecurityHeaderArgs> securityHeader) {
            $.securityHeader = securityHeader;
            return this;
        }

        public Builder securityHeader(ZoneSettingsOverrideSettingsSecurityHeaderArgs securityHeader) {
            return securityHeader(Output.of(securityHeader));
        }

        public Builder securityLevel(@Nullable Output<String> securityLevel) {
            $.securityLevel = securityLevel;
            return this;
        }

        public Builder securityLevel(String securityLevel) {
            return securityLevel(Output.of(securityLevel));
        }

        public Builder serverSideExclude(@Nullable Output<String> serverSideExclude) {
            $.serverSideExclude = serverSideExclude;
            return this;
        }

        public Builder serverSideExclude(String serverSideExclude) {
            return serverSideExclude(Output.of(serverSideExclude));
        }

        public Builder sortQueryStringForCache(@Nullable Output<String> sortQueryStringForCache) {
            $.sortQueryStringForCache = sortQueryStringForCache;
            return this;
        }

        public Builder sortQueryStringForCache(String sortQueryStringForCache) {
            return sortQueryStringForCache(Output.of(sortQueryStringForCache));
        }

        public Builder speedBrain(@Nullable Output<String> speedBrain) {
            $.speedBrain = speedBrain;
            return this;
        }

        public Builder speedBrain(String speedBrain) {
            return speedBrain(Output.of(speedBrain));
        }

        public Builder ssl(@Nullable Output<String> ssl) {
            $.ssl = ssl;
            return this;
        }

        public Builder ssl(String ssl) {
            return ssl(Output.of(ssl));
        }

        public Builder sslAutomaticMode(@Nullable Output<String> sslAutomaticMode) {
            $.sslAutomaticMode = sslAutomaticMode;
            return this;
        }

        public Builder sslAutomaticMode(String sslAutomaticMode) {
            return sslAutomaticMode(Output.of(sslAutomaticMode));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * tls_1_2_only has been deprecated in favour of using `min_tls_version = &#34;1.2&#34;` instead.
         * 
         */
        @Deprecated /* tls_1_2_only has been deprecated in favour of using `min_tls_version = ""1.2""` instead. */
        public Builder tls12Only(@Nullable Output<String> tls12Only) {
            $.tls12Only = tls12Only;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * tls_1_2_only has been deprecated in favour of using `min_tls_version = &#34;1.2&#34;` instead.
         * 
         */
        @Deprecated /* tls_1_2_only has been deprecated in favour of using `min_tls_version = ""1.2""` instead. */
        public Builder tls12Only(String tls12Only) {
            return tls12Only(Output.of(tls12Only));
        }

        public Builder tls13(@Nullable Output<String> tls13) {
            $.tls13 = tls13;
            return this;
        }

        public Builder tls13(String tls13) {
            return tls13(Output.of(tls13));
        }

        public Builder tlsClientAuth(@Nullable Output<String> tlsClientAuth) {
            $.tlsClientAuth = tlsClientAuth;
            return this;
        }

        public Builder tlsClientAuth(String tlsClientAuth) {
            return tlsClientAuth(Output.of(tlsClientAuth));
        }

        public Builder trueClientIpHeader(@Nullable Output<String> trueClientIpHeader) {
            $.trueClientIpHeader = trueClientIpHeader;
            return this;
        }

        public Builder trueClientIpHeader(String trueClientIpHeader) {
            return trueClientIpHeader(Output.of(trueClientIpHeader));
        }

        public Builder universalSsl(@Nullable Output<String> universalSsl) {
            $.universalSsl = universalSsl;
            return this;
        }

        public Builder universalSsl(String universalSsl) {
            return universalSsl(Output.of(universalSsl));
        }

        public Builder visitorIp(@Nullable Output<String> visitorIp) {
            $.visitorIp = visitorIp;
            return this;
        }

        public Builder visitorIp(String visitorIp) {
            return visitorIp(Output.of(visitorIp));
        }

        public Builder waf(@Nullable Output<String> waf) {
            $.waf = waf;
            return this;
        }

        public Builder waf(String waf) {
            return waf(Output.of(waf));
        }

        public Builder webp(@Nullable Output<String> webp) {
            $.webp = webp;
            return this;
        }

        public Builder webp(String webp) {
            return webp(Output.of(webp));
        }

        public Builder websockets(@Nullable Output<String> websockets) {
            $.websockets = websockets;
            return this;
        }

        public Builder websockets(String websockets) {
            return websockets(Output.of(websockets));
        }

        public Builder zeroRtt(@Nullable Output<String> zeroRtt) {
            $.zeroRtt = zeroRtt;
            return this;
        }

        public Builder zeroRtt(String zeroRtt) {
            return zeroRtt(Output.of(zeroRtt));
        }

        public ZoneSettingsOverrideSettingsArgs build() {
            return $;
        }
    }

}
