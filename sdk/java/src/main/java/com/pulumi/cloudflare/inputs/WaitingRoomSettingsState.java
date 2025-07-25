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


public final class WaitingRoomSettingsState extends com.pulumi.resources.ResourceArgs {

    public static final WaitingRoomSettingsState Empty = new WaitingRoomSettingsState();

    /**
     * Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone.
     * Verified search engine crawlers will not be tracked or counted by the waiting room system,
     * and will not appear in waiting room analytics.
     * 
     */
    @Import(name="searchEngineCrawlerBypass")
    private @Nullable Output<Boolean> searchEngineCrawlerBypass;

    /**
     * @return Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone.
     * Verified search engine crawlers will not be tracked or counted by the waiting room system,
     * and will not appear in waiting room analytics.
     * 
     */
    public Optional<Output<Boolean>> searchEngineCrawlerBypass() {
        return Optional.ofNullable(this.searchEngineCrawlerBypass);
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

    private WaitingRoomSettingsState() {}

    private WaitingRoomSettingsState(WaitingRoomSettingsState $) {
        this.searchEngineCrawlerBypass = $.searchEngineCrawlerBypass;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WaitingRoomSettingsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WaitingRoomSettingsState $;

        public Builder() {
            $ = new WaitingRoomSettingsState();
        }

        public Builder(WaitingRoomSettingsState defaults) {
            $ = new WaitingRoomSettingsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param searchEngineCrawlerBypass Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone.
         * Verified search engine crawlers will not be tracked or counted by the waiting room system,
         * and will not appear in waiting room analytics.
         * 
         * @return builder
         * 
         */
        public Builder searchEngineCrawlerBypass(@Nullable Output<Boolean> searchEngineCrawlerBypass) {
            $.searchEngineCrawlerBypass = searchEngineCrawlerBypass;
            return this;
        }

        /**
         * @param searchEngineCrawlerBypass Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone.
         * Verified search engine crawlers will not be tracked or counted by the waiting room system,
         * and will not appear in waiting room analytics.
         * 
         * @return builder
         * 
         */
        public Builder searchEngineCrawlerBypass(Boolean searchEngineCrawlerBypass) {
            return searchEngineCrawlerBypass(Output.of(searchEngineCrawlerBypass));
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

        public WaitingRoomSettingsState build() {
            return $;
        }
    }

}
