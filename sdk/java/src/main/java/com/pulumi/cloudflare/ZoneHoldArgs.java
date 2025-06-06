// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZoneHoldArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZoneHoldArgs Empty = new ZoneHoldArgs();

    /**
     * If `hold_after` is provided and future-dated, the hold will be temporarily disabled,
     * then automatically re-enabled by the system at the time specified
     * in this RFC3339-formatted timestamp. A past-dated `hold_after` value will have
     * no effect on an existing, enabled hold. Providing an empty string will set its value
     * to the current time.
     * 
     */
    @Import(name="holdAfter")
    private @Nullable Output<String> holdAfter;

    /**
     * @return If `hold_after` is provided and future-dated, the hold will be temporarily disabled,
     * then automatically re-enabled by the system at the time specified
     * in this RFC3339-formatted timestamp. A past-dated `hold_after` value will have
     * no effect on an existing, enabled hold. Providing an empty string will set its value
     * to the current time.
     * 
     */
    public Optional<Output<String>> holdAfter() {
        return Optional.ofNullable(this.holdAfter);
    }

    /**
     * If `true`, the zone hold will extend to block any subdomain of the given zone, as well
     * as SSL4SaaS Custom Hostnames. For example, a zone hold on a zone with the hostname
     * &#39;example.com&#39; and include_subdomains=true will block &#39;example.com&#39;,
     * &#39;staging.example.com&#39;, &#39;api.staging.example.com&#39;, etc.
     * 
     */
    @Import(name="includeSubdomains")
    private @Nullable Output<Boolean> includeSubdomains;

    /**
     * @return If `true`, the zone hold will extend to block any subdomain of the given zone, as well
     * as SSL4SaaS Custom Hostnames. For example, a zone hold on a zone with the hostname
     * &#39;example.com&#39; and include_subdomains=true will block &#39;example.com&#39;,
     * &#39;staging.example.com&#39;, &#39;api.staging.example.com&#39;, etc.
     * 
     */
    public Optional<Output<Boolean>> includeSubdomains() {
        return Optional.ofNullable(this.includeSubdomains);
    }

    /**
     * Identifier.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return Identifier.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private ZoneHoldArgs() {}

    private ZoneHoldArgs(ZoneHoldArgs $) {
        this.holdAfter = $.holdAfter;
        this.includeSubdomains = $.includeSubdomains;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZoneHoldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZoneHoldArgs $;

        public Builder() {
            $ = new ZoneHoldArgs();
        }

        public Builder(ZoneHoldArgs defaults) {
            $ = new ZoneHoldArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param holdAfter If `hold_after` is provided and future-dated, the hold will be temporarily disabled,
         * then automatically re-enabled by the system at the time specified
         * in this RFC3339-formatted timestamp. A past-dated `hold_after` value will have
         * no effect on an existing, enabled hold. Providing an empty string will set its value
         * to the current time.
         * 
         * @return builder
         * 
         */
        public Builder holdAfter(@Nullable Output<String> holdAfter) {
            $.holdAfter = holdAfter;
            return this;
        }

        /**
         * @param holdAfter If `hold_after` is provided and future-dated, the hold will be temporarily disabled,
         * then automatically re-enabled by the system at the time specified
         * in this RFC3339-formatted timestamp. A past-dated `hold_after` value will have
         * no effect on an existing, enabled hold. Providing an empty string will set its value
         * to the current time.
         * 
         * @return builder
         * 
         */
        public Builder holdAfter(String holdAfter) {
            return holdAfter(Output.of(holdAfter));
        }

        /**
         * @param includeSubdomains If `true`, the zone hold will extend to block any subdomain of the given zone, as well
         * as SSL4SaaS Custom Hostnames. For example, a zone hold on a zone with the hostname
         * &#39;example.com&#39; and include_subdomains=true will block &#39;example.com&#39;,
         * &#39;staging.example.com&#39;, &#39;api.staging.example.com&#39;, etc.
         * 
         * @return builder
         * 
         */
        public Builder includeSubdomains(@Nullable Output<Boolean> includeSubdomains) {
            $.includeSubdomains = includeSubdomains;
            return this;
        }

        /**
         * @param includeSubdomains If `true`, the zone hold will extend to block any subdomain of the given zone, as well
         * as SSL4SaaS Custom Hostnames. For example, a zone hold on a zone with the hostname
         * &#39;example.com&#39; and include_subdomains=true will block &#39;example.com&#39;,
         * &#39;staging.example.com&#39;, &#39;api.staging.example.com&#39;, etc.
         * 
         * @return builder
         * 
         */
        public Builder includeSubdomains(Boolean includeSubdomains) {
            return includeSubdomains(Output.of(includeSubdomains));
        }

        /**
         * @param zoneId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ZoneHoldArgs build() {
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("ZoneHoldArgs", "zoneId");
            }
            return $;
        }
    }

}
