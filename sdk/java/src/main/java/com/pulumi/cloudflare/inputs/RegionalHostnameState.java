// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionalHostnameState extends com.pulumi.resources.ResourceArgs {

    public static final RegionalHostnameState Empty = new RegionalHostnameState();

    /**
     * When the regional hostname was created
     * 
     */
    @Import(name="createdOn")
    private @Nullable Output<String> createdOn;

    /**
     * @return When the regional hostname was created
     * 
     */
    public Optional<Output<String>> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }

    /**
     * DNS hostname to be regionalized, must be a subdomain of the zone. Wildcards are supported for one level, e.g `*.example.com`
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return DNS hostname to be regionalized, must be a subdomain of the zone. Wildcards are supported for one level, e.g `*.example.com`
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * Identifying key for the region
     * 
     */
    @Import(name="regionKey")
    private @Nullable Output<String> regionKey;

    /**
     * @return Identifying key for the region
     * 
     */
    public Optional<Output<String>> regionKey() {
        return Optional.ofNullable(this.regionKey);
    }

    /**
     * Configure which routing method to use for the regional hostname
     * 
     */
    @Import(name="routing")
    private @Nullable Output<String> routing;

    /**
     * @return Configure which routing method to use for the regional hostname
     * 
     */
    public Optional<Output<String>> routing() {
        return Optional.ofNullable(this.routing);
    }

    /**
     * Identifier.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return Identifier.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private RegionalHostnameState() {}

    private RegionalHostnameState(RegionalHostnameState $) {
        this.createdOn = $.createdOn;
        this.hostname = $.hostname;
        this.regionKey = $.regionKey;
        this.routing = $.routing;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionalHostnameState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionalHostnameState $;

        public Builder() {
            $ = new RegionalHostnameState();
        }

        public Builder(RegionalHostnameState defaults) {
            $ = new RegionalHostnameState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdOn When the regional hostname was created
         * 
         * @return builder
         * 
         */
        public Builder createdOn(@Nullable Output<String> createdOn) {
            $.createdOn = createdOn;
            return this;
        }

        /**
         * @param createdOn When the regional hostname was created
         * 
         * @return builder
         * 
         */
        public Builder createdOn(String createdOn) {
            return createdOn(Output.of(createdOn));
        }

        /**
         * @param hostname DNS hostname to be regionalized, must be a subdomain of the zone. Wildcards are supported for one level, e.g `*.example.com`
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname DNS hostname to be regionalized, must be a subdomain of the zone. Wildcards are supported for one level, e.g `*.example.com`
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param regionKey Identifying key for the region
         * 
         * @return builder
         * 
         */
        public Builder regionKey(@Nullable Output<String> regionKey) {
            $.regionKey = regionKey;
            return this;
        }

        /**
         * @param regionKey Identifying key for the region
         * 
         * @return builder
         * 
         */
        public Builder regionKey(String regionKey) {
            return regionKey(Output.of(regionKey));
        }

        /**
         * @param routing Configure which routing method to use for the regional hostname
         * 
         * @return builder
         * 
         */
        public Builder routing(@Nullable Output<String> routing) {
            $.routing = routing;
            return this;
        }

        /**
         * @param routing Configure which routing method to use for the regional hostname
         * 
         * @return builder
         * 
         */
        public Builder routing(String routing) {
            return routing(Output.of(routing));
        }

        /**
         * @param zoneId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
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

        public RegionalHostnameState build() {
            return $;
        }
    }

}
