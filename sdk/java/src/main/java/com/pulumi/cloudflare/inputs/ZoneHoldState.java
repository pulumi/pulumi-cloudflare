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


public final class ZoneHoldState extends com.pulumi.resources.ResourceArgs {

    public static final ZoneHoldState Empty = new ZoneHoldState();

    /**
     * Enablement status of the zone hold.
     * 
     */
    @Import(name="hold")
    private @Nullable Output<Boolean> hold;

    /**
     * @return Enablement status of the zone hold.
     * 
     */
    public Optional<Output<Boolean>> hold() {
        return Optional.ofNullable(this.hold);
    }

    /**
     * The RFC3339 compatible timestamp when to automatically re-enable the zone hold.
     * 
     */
    @Import(name="holdAfter")
    private @Nullable Output<String> holdAfter;

    /**
     * @return The RFC3339 compatible timestamp when to automatically re-enable the zone hold.
     * 
     */
    public Optional<Output<String>> holdAfter() {
        return Optional.ofNullable(this.holdAfter);
    }

    /**
     * Whether to extend to block any subdomain of the given zone.
     * 
     */
    @Import(name="includeSubdomains")
    private @Nullable Output<Boolean> includeSubdomains;

    /**
     * @return Whether to extend to block any subdomain of the given zone.
     * 
     */
    public Optional<Output<Boolean>> includeSubdomains() {
        return Optional.ofNullable(this.includeSubdomains);
    }

    /**
     * The zone identifier to target for the resource.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private ZoneHoldState() {}

    private ZoneHoldState(ZoneHoldState $) {
        this.hold = $.hold;
        this.holdAfter = $.holdAfter;
        this.includeSubdomains = $.includeSubdomains;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZoneHoldState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZoneHoldState $;

        public Builder() {
            $ = new ZoneHoldState();
        }

        public Builder(ZoneHoldState defaults) {
            $ = new ZoneHoldState(Objects.requireNonNull(defaults));
        }

        /**
         * @param hold Enablement status of the zone hold.
         * 
         * @return builder
         * 
         */
        public Builder hold(@Nullable Output<Boolean> hold) {
            $.hold = hold;
            return this;
        }

        /**
         * @param hold Enablement status of the zone hold.
         * 
         * @return builder
         * 
         */
        public Builder hold(Boolean hold) {
            return hold(Output.of(hold));
        }

        /**
         * @param holdAfter The RFC3339 compatible timestamp when to automatically re-enable the zone hold.
         * 
         * @return builder
         * 
         */
        public Builder holdAfter(@Nullable Output<String> holdAfter) {
            $.holdAfter = holdAfter;
            return this;
        }

        /**
         * @param holdAfter The RFC3339 compatible timestamp when to automatically re-enable the zone hold.
         * 
         * @return builder
         * 
         */
        public Builder holdAfter(String holdAfter) {
            return holdAfter(Output.of(holdAfter));
        }

        /**
         * @param includeSubdomains Whether to extend to block any subdomain of the given zone.
         * 
         * @return builder
         * 
         */
        public Builder includeSubdomains(@Nullable Output<Boolean> includeSubdomains) {
            $.includeSubdomains = includeSubdomains;
            return this;
        }

        /**
         * @param includeSubdomains Whether to extend to block any subdomain of the given zone.
         * 
         * @return builder
         * 
         */
        public Builder includeSubdomains(Boolean includeSubdomains) {
            return includeSubdomains(Output.of(includeSubdomains));
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ZoneHoldState build() {
            return $;
        }
    }

}
