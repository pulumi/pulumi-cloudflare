// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerMonitorArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerMonitorArgs Empty = new LoadBalancerMonitorArgs();

    /**
     * Identifier
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Identifier
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Do not validate the certificate when monitor use HTTPS. This parameter is currently only valid for HTTP and HTTPS monitors.
     * 
     */
    @Import(name="allowInsecure")
    private @Nullable Output<Boolean> allowInsecure;

    /**
     * @return Do not validate the certificate when monitor use HTTPS. This parameter is currently only valid for HTTP and HTTPS monitors.
     * 
     */
    public Optional<Output<Boolean>> allowInsecure() {
        return Optional.ofNullable(this.allowInsecure);
    }

    /**
     * To be marked unhealthy the monitored origin must fail this healthcheck N consecutive times.
     * 
     */
    @Import(name="consecutiveDown")
    private @Nullable Output<Integer> consecutiveDown;

    /**
     * @return To be marked unhealthy the monitored origin must fail this healthcheck N consecutive times.
     * 
     */
    public Optional<Output<Integer>> consecutiveDown() {
        return Optional.ofNullable(this.consecutiveDown);
    }

    /**
     * To be marked healthy the monitored origin must pass this healthcheck N consecutive times.
     * 
     */
    @Import(name="consecutiveUp")
    private @Nullable Output<Integer> consecutiveUp;

    /**
     * @return To be marked healthy the monitored origin must pass this healthcheck N consecutive times.
     * 
     */
    public Optional<Output<Integer>> consecutiveUp() {
        return Optional.ofNullable(this.consecutiveUp);
    }

    /**
     * Object description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Object description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. This parameter is only valid for HTTP and HTTPS monitors.
     * 
     */
    @Import(name="expectedBody")
    private @Nullable Output<String> expectedBody;

    /**
     * @return A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. This parameter is only valid for HTTP and HTTPS monitors.
     * 
     */
    public Optional<Output<String>> expectedBody() {
        return Optional.ofNullable(this.expectedBody);
    }

    /**
     * The expected HTTP response code or code range of the health check. This parameter is only valid for HTTP and HTTPS monitors.
     * 
     */
    @Import(name="expectedCodes")
    private @Nullable Output<String> expectedCodes;

    /**
     * @return The expected HTTP response code or code range of the health check. This parameter is only valid for HTTP and HTTPS monitors.
     * 
     */
    public Optional<Output<String>> expectedCodes() {
        return Optional.ofNullable(this.expectedCodes);
    }

    /**
     * Follow redirects if returned by the origin. This parameter is only valid for HTTP and HTTPS monitors.
     * 
     */
    @Import(name="followRedirects")
    private @Nullable Output<Boolean> followRedirects;

    /**
     * @return Follow redirects if returned by the origin. This parameter is only valid for HTTP and HTTPS monitors.
     * 
     */
    public Optional<Output<Boolean>> followRedirects() {
        return Optional.ofNullable(this.followRedirects);
    }

    /**
     * The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden. This parameter is only valid for HTTP and HTTPS monitors.
     * 
     */
    @Import(name="header")
    private @Nullable Output<Map<String,List<String>>> header;

    /**
     * @return The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden. This parameter is only valid for HTTP and HTTPS monitors.
     * 
     */
    public Optional<Output<Map<String,List<String>>>> header() {
        return Optional.ofNullable(this.header);
    }

    /**
     * The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    /**
     * @return The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations.
     * 
     */
    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * The method to use for the health check. This defaults to &#39;GET&#39; for HTTP/HTTPS based checks and &#39;connection_established&#39; for TCP based health checks.
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    /**
     * @return The method to use for the health check. This defaults to &#39;GET&#39; for HTTP/HTTPS based checks and &#39;connection_established&#39; for TCP based health checks.
     * 
     */
    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * The endpoint path you want to conduct a health check against. This parameter is only valid for HTTP and HTTPS monitors.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The endpoint path you want to conduct a health check against. This parameter is only valid for HTTP and HTTPS monitors.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The port number to connect to for the health check. Required for TCP, UDP, and SMTP checks. HTTP and HTTPS checks should only define the port when using a non-standard port (HTTP: default 80, HTTPS: default 443).
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port number to connect to for the health check. Required for TCP, UDP, and SMTP checks. HTTP and HTTPS checks should only define the port when using a non-standard port (HTTP: default 80, HTTPS: default 443).
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Assign this monitor to emulate the specified zone while probing. This parameter is only valid for HTTP and HTTPS monitors.
     * 
     */
    @Import(name="probeZone")
    private @Nullable Output<String> probeZone;

    /**
     * @return Assign this monitor to emulate the specified zone while probing. This parameter is only valid for HTTP and HTTPS monitors.
     * 
     */
    public Optional<Output<String>> probeZone() {
        return Optional.ofNullable(this.probeZone);
    }

    /**
     * The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately.
     * 
     */
    @Import(name="retries")
    private @Nullable Output<Integer> retries;

    /**
     * @return The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately.
     * 
     */
    public Optional<Output<Integer>> retries() {
        return Optional.ofNullable(this.retries);
    }

    /**
     * The timeout (in seconds) before marking the health check as failed.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return The timeout (in seconds) before marking the health check as failed.
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * The protocol to use for the health check. Currently supported protocols are &#39;HTTP&#39;,&#39;HTTPS&#39;, &#39;TCP&#39;, &#39;ICMP-PING&#39;, &#39;UDP-ICMP&#39;, and &#39;SMTP&#39;.
     * Available values: &#34;http&#34;, &#34;https&#34;, &#34;tcp&#34;, &#34;udp*icmp&#34;, &#34;icmp*ping&#34;, &#34;smtp&#34;.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The protocol to use for the health check. Currently supported protocols are &#39;HTTP&#39;,&#39;HTTPS&#39;, &#39;TCP&#39;, &#39;ICMP-PING&#39;, &#39;UDP-ICMP&#39;, and &#39;SMTP&#39;.
     * Available values: &#34;http&#34;, &#34;https&#34;, &#34;tcp&#34;, &#34;udp*icmp&#34;, &#34;icmp*ping&#34;, &#34;smtp&#34;.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private LoadBalancerMonitorArgs() {}

    private LoadBalancerMonitorArgs(LoadBalancerMonitorArgs $) {
        this.accountId = $.accountId;
        this.allowInsecure = $.allowInsecure;
        this.consecutiveDown = $.consecutiveDown;
        this.consecutiveUp = $.consecutiveUp;
        this.description = $.description;
        this.expectedBody = $.expectedBody;
        this.expectedCodes = $.expectedCodes;
        this.followRedirects = $.followRedirects;
        this.header = $.header;
        this.interval = $.interval;
        this.method = $.method;
        this.path = $.path;
        this.port = $.port;
        this.probeZone = $.probeZone;
        this.retries = $.retries;
        this.timeout = $.timeout;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerMonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerMonitorArgs $;

        public Builder() {
            $ = new LoadBalancerMonitorArgs();
        }

        public Builder(LoadBalancerMonitorArgs defaults) {
            $ = new LoadBalancerMonitorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Identifier
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Identifier
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param allowInsecure Do not validate the certificate when monitor use HTTPS. This parameter is currently only valid for HTTP and HTTPS monitors.
         * 
         * @return builder
         * 
         */
        public Builder allowInsecure(@Nullable Output<Boolean> allowInsecure) {
            $.allowInsecure = allowInsecure;
            return this;
        }

        /**
         * @param allowInsecure Do not validate the certificate when monitor use HTTPS. This parameter is currently only valid for HTTP and HTTPS monitors.
         * 
         * @return builder
         * 
         */
        public Builder allowInsecure(Boolean allowInsecure) {
            return allowInsecure(Output.of(allowInsecure));
        }

        /**
         * @param consecutiveDown To be marked unhealthy the monitored origin must fail this healthcheck N consecutive times.
         * 
         * @return builder
         * 
         */
        public Builder consecutiveDown(@Nullable Output<Integer> consecutiveDown) {
            $.consecutiveDown = consecutiveDown;
            return this;
        }

        /**
         * @param consecutiveDown To be marked unhealthy the monitored origin must fail this healthcheck N consecutive times.
         * 
         * @return builder
         * 
         */
        public Builder consecutiveDown(Integer consecutiveDown) {
            return consecutiveDown(Output.of(consecutiveDown));
        }

        /**
         * @param consecutiveUp To be marked healthy the monitored origin must pass this healthcheck N consecutive times.
         * 
         * @return builder
         * 
         */
        public Builder consecutiveUp(@Nullable Output<Integer> consecutiveUp) {
            $.consecutiveUp = consecutiveUp;
            return this;
        }

        /**
         * @param consecutiveUp To be marked healthy the monitored origin must pass this healthcheck N consecutive times.
         * 
         * @return builder
         * 
         */
        public Builder consecutiveUp(Integer consecutiveUp) {
            return consecutiveUp(Output.of(consecutiveUp));
        }

        /**
         * @param description Object description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Object description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param expectedBody A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. This parameter is only valid for HTTP and HTTPS monitors.
         * 
         * @return builder
         * 
         */
        public Builder expectedBody(@Nullable Output<String> expectedBody) {
            $.expectedBody = expectedBody;
            return this;
        }

        /**
         * @param expectedBody A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. This parameter is only valid for HTTP and HTTPS monitors.
         * 
         * @return builder
         * 
         */
        public Builder expectedBody(String expectedBody) {
            return expectedBody(Output.of(expectedBody));
        }

        /**
         * @param expectedCodes The expected HTTP response code or code range of the health check. This parameter is only valid for HTTP and HTTPS monitors.
         * 
         * @return builder
         * 
         */
        public Builder expectedCodes(@Nullable Output<String> expectedCodes) {
            $.expectedCodes = expectedCodes;
            return this;
        }

        /**
         * @param expectedCodes The expected HTTP response code or code range of the health check. This parameter is only valid for HTTP and HTTPS monitors.
         * 
         * @return builder
         * 
         */
        public Builder expectedCodes(String expectedCodes) {
            return expectedCodes(Output.of(expectedCodes));
        }

        /**
         * @param followRedirects Follow redirects if returned by the origin. This parameter is only valid for HTTP and HTTPS monitors.
         * 
         * @return builder
         * 
         */
        public Builder followRedirects(@Nullable Output<Boolean> followRedirects) {
            $.followRedirects = followRedirects;
            return this;
        }

        /**
         * @param followRedirects Follow redirects if returned by the origin. This parameter is only valid for HTTP and HTTPS monitors.
         * 
         * @return builder
         * 
         */
        public Builder followRedirects(Boolean followRedirects) {
            return followRedirects(Output.of(followRedirects));
        }

        /**
         * @param header The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden. This parameter is only valid for HTTP and HTTPS monitors.
         * 
         * @return builder
         * 
         */
        public Builder header(@Nullable Output<Map<String,List<String>>> header) {
            $.header = header;
            return this;
        }

        /**
         * @param header The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden. This parameter is only valid for HTTP and HTTPS monitors.
         * 
         * @return builder
         * 
         */
        public Builder header(Map<String,List<String>> header) {
            return header(Output.of(header));
        }

        /**
         * @param interval The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations.
         * 
         * @return builder
         * 
         */
        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param method The method to use for the health check. This defaults to &#39;GET&#39; for HTTP/HTTPS based checks and &#39;connection_established&#39; for TCP based health checks.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method The method to use for the health check. This defaults to &#39;GET&#39; for HTTP/HTTPS based checks and &#39;connection_established&#39; for TCP based health checks.
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param path The endpoint path you want to conduct a health check against. This parameter is only valid for HTTP and HTTPS monitors.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The endpoint path you want to conduct a health check against. This parameter is only valid for HTTP and HTTPS monitors.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param port The port number to connect to for the health check. Required for TCP, UDP, and SMTP checks. HTTP and HTTPS checks should only define the port when using a non-standard port (HTTP: default 80, HTTPS: default 443).
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number to connect to for the health check. Required for TCP, UDP, and SMTP checks. HTTP and HTTPS checks should only define the port when using a non-standard port (HTTP: default 80, HTTPS: default 443).
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param probeZone Assign this monitor to emulate the specified zone while probing. This parameter is only valid for HTTP and HTTPS monitors.
         * 
         * @return builder
         * 
         */
        public Builder probeZone(@Nullable Output<String> probeZone) {
            $.probeZone = probeZone;
            return this;
        }

        /**
         * @param probeZone Assign this monitor to emulate the specified zone while probing. This parameter is only valid for HTTP and HTTPS monitors.
         * 
         * @return builder
         * 
         */
        public Builder probeZone(String probeZone) {
            return probeZone(Output.of(probeZone));
        }

        /**
         * @param retries The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately.
         * 
         * @return builder
         * 
         */
        public Builder retries(@Nullable Output<Integer> retries) {
            $.retries = retries;
            return this;
        }

        /**
         * @param retries The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately.
         * 
         * @return builder
         * 
         */
        public Builder retries(Integer retries) {
            return retries(Output.of(retries));
        }

        /**
         * @param timeout The timeout (in seconds) before marking the health check as failed.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout The timeout (in seconds) before marking the health check as failed.
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param type The protocol to use for the health check. Currently supported protocols are &#39;HTTP&#39;,&#39;HTTPS&#39;, &#39;TCP&#39;, &#39;ICMP-PING&#39;, &#39;UDP-ICMP&#39;, and &#39;SMTP&#39;.
         * Available values: &#34;http&#34;, &#34;https&#34;, &#34;tcp&#34;, &#34;udp*icmp&#34;, &#34;icmp*ping&#34;, &#34;smtp&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The protocol to use for the health check. Currently supported protocols are &#39;HTTP&#39;,&#39;HTTPS&#39;, &#39;TCP&#39;, &#39;ICMP-PING&#39;, &#39;UDP-ICMP&#39;, and &#39;SMTP&#39;.
         * Available values: &#34;http&#34;, &#34;https&#34;, &#34;tcp&#34;, &#34;udp*icmp&#34;, &#34;icmp*ping&#34;, &#34;smtp&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public LoadBalancerMonitorArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("LoadBalancerMonitorArgs", "accountId");
            }
            return $;
        }
    }

}
