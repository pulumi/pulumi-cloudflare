// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.BotManagementStaleZoneConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BotManagementState extends com.pulumi.resources.ResourceArgs {

    public static final BotManagementState Empty = new BotManagementState();

    /**
     * Enable rule to block AI Scrapers and Crawlers.
     * Available values: &#34;block&#34;, &#34;disabled&#34;.
     * 
     */
    @Import(name="aiBotsProtection")
    private @Nullable Output<String> aiBotsProtection;

    /**
     * @return Enable rule to block AI Scrapers and Crawlers.
     * Available values: &#34;block&#34;, &#34;disabled&#34;.
     * 
     */
    public Optional<Output<String>> aiBotsProtection() {
        return Optional.ofNullable(this.aiBotsProtection);
    }

    /**
     * Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes)
     * 
     */
    @Import(name="autoUpdateModel")
    private @Nullable Output<Boolean> autoUpdateModel;

    /**
     * @return Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes)
     * 
     */
    public Optional<Output<Boolean>> autoUpdateModel() {
        return Optional.ofNullable(this.autoUpdateModel);
    }

    /**
     * Enable rule to punish AI Scrapers and Crawlers via a link maze.
     * Available values: &#34;enabled&#34;, &#34;disabled&#34;.
     * 
     */
    @Import(name="crawlerProtection")
    private @Nullable Output<String> crawlerProtection;

    /**
     * @return Enable rule to punish AI Scrapers and Crawlers via a link maze.
     * Available values: &#34;enabled&#34;, &#34;disabled&#34;.
     * 
     */
    public Optional<Output<String>> crawlerProtection() {
        return Optional.ofNullable(this.crawlerProtection);
    }

    /**
     * Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
     * 
     */
    @Import(name="enableJs")
    private @Nullable Output<Boolean> enableJs;

    /**
     * @return Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
     * 
     */
    public Optional<Output<Boolean>> enableJs() {
        return Optional.ofNullable(this.enableJs);
    }

    /**
     * Whether to enable Bot Fight Mode.
     * 
     */
    @Import(name="fightMode")
    private @Nullable Output<Boolean> fightMode;

    /**
     * @return Whether to enable Bot Fight Mode.
     * 
     */
    public Optional<Output<Boolean>> fightMode() {
        return Optional.ofNullable(this.fightMode);
    }

    /**
     * Whether to optimize Super Bot Fight Mode protections for Wordpress.
     * 
     */
    @Import(name="optimizeWordpress")
    private @Nullable Output<Boolean> optimizeWordpress;

    /**
     * @return Whether to optimize Super Bot Fight Mode protections for Wordpress.
     * 
     */
    public Optional<Output<Boolean>> optimizeWordpress() {
        return Optional.ofNullable(this.optimizeWordpress);
    }

    /**
     * Super Bot Fight Mode (SBFM) action to take on definitely automated requests.
     * Available values: &#34;allow&#34;, &#34;block&#34;, &#34;managed_challenge&#34;.
     * 
     */
    @Import(name="sbfmDefinitelyAutomated")
    private @Nullable Output<String> sbfmDefinitelyAutomated;

    /**
     * @return Super Bot Fight Mode (SBFM) action to take on definitely automated requests.
     * Available values: &#34;allow&#34;, &#34;block&#34;, &#34;managed_challenge&#34;.
     * 
     */
    public Optional<Output<String>> sbfmDefinitelyAutomated() {
        return Optional.ofNullable(this.sbfmDefinitelyAutomated);
    }

    /**
     * Super Bot Fight Mode (SBFM) action to take on likely automated requests.
     * Available values: &#34;allow&#34;, &#34;block&#34;, &#34;managed_challenge&#34;.
     * 
     */
    @Import(name="sbfmLikelyAutomated")
    private @Nullable Output<String> sbfmLikelyAutomated;

    /**
     * @return Super Bot Fight Mode (SBFM) action to take on likely automated requests.
     * Available values: &#34;allow&#34;, &#34;block&#34;, &#34;managed_challenge&#34;.
     * 
     */
    public Optional<Output<String>> sbfmLikelyAutomated() {
        return Optional.ofNullable(this.sbfmLikelyAutomated);
    }

    /**
     * Super Bot Fight Mode (SBFM) to enable static resource protection.
     * Enable if static resources on your application need bot protection.
     * Note: Static resource protection can also result in legitimate traffic being blocked.
     * 
     */
    @Import(name="sbfmStaticResourceProtection")
    private @Nullable Output<Boolean> sbfmStaticResourceProtection;

    /**
     * @return Super Bot Fight Mode (SBFM) to enable static resource protection.
     * Enable if static resources on your application need bot protection.
     * Note: Static resource protection can also result in legitimate traffic being blocked.
     * 
     */
    public Optional<Output<Boolean>> sbfmStaticResourceProtection() {
        return Optional.ofNullable(this.sbfmStaticResourceProtection);
    }

    /**
     * Super Bot Fight Mode (SBFM) action to take on verified bots requests.
     * Available values: &#34;allow&#34;, &#34;block&#34;.
     * 
     */
    @Import(name="sbfmVerifiedBots")
    private @Nullable Output<String> sbfmVerifiedBots;

    /**
     * @return Super Bot Fight Mode (SBFM) action to take on verified bots requests.
     * Available values: &#34;allow&#34;, &#34;block&#34;.
     * 
     */
    public Optional<Output<String>> sbfmVerifiedBots() {
        return Optional.ofNullable(this.sbfmVerifiedBots);
    }

    /**
     * A read-only field that shows which unauthorized settings are currently active on the zone. These settings typically result from upgrades or downgrades.
     * 
     */
    @Import(name="staleZoneConfiguration")
    private @Nullable Output<BotManagementStaleZoneConfigurationArgs> staleZoneConfiguration;

    /**
     * @return A read-only field that shows which unauthorized settings are currently active on the zone. These settings typically result from upgrades or downgrades.
     * 
     */
    public Optional<Output<BotManagementStaleZoneConfigurationArgs>> staleZoneConfiguration() {
        return Optional.ofNullable(this.staleZoneConfiguration);
    }

    /**
     * Whether to disable tracking the highest bot score for a session in the Bot Management cookie.
     * 
     */
    @Import(name="suppressSessionScore")
    private @Nullable Output<Boolean> suppressSessionScore;

    /**
     * @return Whether to disable tracking the highest bot score for a session in the Bot Management cookie.
     * 
     */
    public Optional<Output<Boolean>> suppressSessionScore() {
        return Optional.ofNullable(this.suppressSessionScore);
    }

    /**
     * A read-only field that indicates whether the zone currently is running the latest ML model.
     * 
     */
    @Import(name="usingLatestModel")
    private @Nullable Output<Boolean> usingLatestModel;

    /**
     * @return A read-only field that indicates whether the zone currently is running the latest ML model.
     * 
     */
    public Optional<Output<Boolean>> usingLatestModel() {
        return Optional.ofNullable(this.usingLatestModel);
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

    private BotManagementState() {}

    private BotManagementState(BotManagementState $) {
        this.aiBotsProtection = $.aiBotsProtection;
        this.autoUpdateModel = $.autoUpdateModel;
        this.crawlerProtection = $.crawlerProtection;
        this.enableJs = $.enableJs;
        this.fightMode = $.fightMode;
        this.optimizeWordpress = $.optimizeWordpress;
        this.sbfmDefinitelyAutomated = $.sbfmDefinitelyAutomated;
        this.sbfmLikelyAutomated = $.sbfmLikelyAutomated;
        this.sbfmStaticResourceProtection = $.sbfmStaticResourceProtection;
        this.sbfmVerifiedBots = $.sbfmVerifiedBots;
        this.staleZoneConfiguration = $.staleZoneConfiguration;
        this.suppressSessionScore = $.suppressSessionScore;
        this.usingLatestModel = $.usingLatestModel;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotManagementState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotManagementState $;

        public Builder() {
            $ = new BotManagementState();
        }

        public Builder(BotManagementState defaults) {
            $ = new BotManagementState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aiBotsProtection Enable rule to block AI Scrapers and Crawlers.
         * Available values: &#34;block&#34;, &#34;disabled&#34;.
         * 
         * @return builder
         * 
         */
        public Builder aiBotsProtection(@Nullable Output<String> aiBotsProtection) {
            $.aiBotsProtection = aiBotsProtection;
            return this;
        }

        /**
         * @param aiBotsProtection Enable rule to block AI Scrapers and Crawlers.
         * Available values: &#34;block&#34;, &#34;disabled&#34;.
         * 
         * @return builder
         * 
         */
        public Builder aiBotsProtection(String aiBotsProtection) {
            return aiBotsProtection(Output.of(aiBotsProtection));
        }

        /**
         * @param autoUpdateModel Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes)
         * 
         * @return builder
         * 
         */
        public Builder autoUpdateModel(@Nullable Output<Boolean> autoUpdateModel) {
            $.autoUpdateModel = autoUpdateModel;
            return this;
        }

        /**
         * @param autoUpdateModel Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes)
         * 
         * @return builder
         * 
         */
        public Builder autoUpdateModel(Boolean autoUpdateModel) {
            return autoUpdateModel(Output.of(autoUpdateModel));
        }

        /**
         * @param crawlerProtection Enable rule to punish AI Scrapers and Crawlers via a link maze.
         * Available values: &#34;enabled&#34;, &#34;disabled&#34;.
         * 
         * @return builder
         * 
         */
        public Builder crawlerProtection(@Nullable Output<String> crawlerProtection) {
            $.crawlerProtection = crawlerProtection;
            return this;
        }

        /**
         * @param crawlerProtection Enable rule to punish AI Scrapers and Crawlers via a link maze.
         * Available values: &#34;enabled&#34;, &#34;disabled&#34;.
         * 
         * @return builder
         * 
         */
        public Builder crawlerProtection(String crawlerProtection) {
            return crawlerProtection(Output.of(crawlerProtection));
        }

        /**
         * @param enableJs Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
         * 
         * @return builder
         * 
         */
        public Builder enableJs(@Nullable Output<Boolean> enableJs) {
            $.enableJs = enableJs;
            return this;
        }

        /**
         * @param enableJs Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
         * 
         * @return builder
         * 
         */
        public Builder enableJs(Boolean enableJs) {
            return enableJs(Output.of(enableJs));
        }

        /**
         * @param fightMode Whether to enable Bot Fight Mode.
         * 
         * @return builder
         * 
         */
        public Builder fightMode(@Nullable Output<Boolean> fightMode) {
            $.fightMode = fightMode;
            return this;
        }

        /**
         * @param fightMode Whether to enable Bot Fight Mode.
         * 
         * @return builder
         * 
         */
        public Builder fightMode(Boolean fightMode) {
            return fightMode(Output.of(fightMode));
        }

        /**
         * @param optimizeWordpress Whether to optimize Super Bot Fight Mode protections for Wordpress.
         * 
         * @return builder
         * 
         */
        public Builder optimizeWordpress(@Nullable Output<Boolean> optimizeWordpress) {
            $.optimizeWordpress = optimizeWordpress;
            return this;
        }

        /**
         * @param optimizeWordpress Whether to optimize Super Bot Fight Mode protections for Wordpress.
         * 
         * @return builder
         * 
         */
        public Builder optimizeWordpress(Boolean optimizeWordpress) {
            return optimizeWordpress(Output.of(optimizeWordpress));
        }

        /**
         * @param sbfmDefinitelyAutomated Super Bot Fight Mode (SBFM) action to take on definitely automated requests.
         * Available values: &#34;allow&#34;, &#34;block&#34;, &#34;managed_challenge&#34;.
         * 
         * @return builder
         * 
         */
        public Builder sbfmDefinitelyAutomated(@Nullable Output<String> sbfmDefinitelyAutomated) {
            $.sbfmDefinitelyAutomated = sbfmDefinitelyAutomated;
            return this;
        }

        /**
         * @param sbfmDefinitelyAutomated Super Bot Fight Mode (SBFM) action to take on definitely automated requests.
         * Available values: &#34;allow&#34;, &#34;block&#34;, &#34;managed_challenge&#34;.
         * 
         * @return builder
         * 
         */
        public Builder sbfmDefinitelyAutomated(String sbfmDefinitelyAutomated) {
            return sbfmDefinitelyAutomated(Output.of(sbfmDefinitelyAutomated));
        }

        /**
         * @param sbfmLikelyAutomated Super Bot Fight Mode (SBFM) action to take on likely automated requests.
         * Available values: &#34;allow&#34;, &#34;block&#34;, &#34;managed_challenge&#34;.
         * 
         * @return builder
         * 
         */
        public Builder sbfmLikelyAutomated(@Nullable Output<String> sbfmLikelyAutomated) {
            $.sbfmLikelyAutomated = sbfmLikelyAutomated;
            return this;
        }

        /**
         * @param sbfmLikelyAutomated Super Bot Fight Mode (SBFM) action to take on likely automated requests.
         * Available values: &#34;allow&#34;, &#34;block&#34;, &#34;managed_challenge&#34;.
         * 
         * @return builder
         * 
         */
        public Builder sbfmLikelyAutomated(String sbfmLikelyAutomated) {
            return sbfmLikelyAutomated(Output.of(sbfmLikelyAutomated));
        }

        /**
         * @param sbfmStaticResourceProtection Super Bot Fight Mode (SBFM) to enable static resource protection.
         * Enable if static resources on your application need bot protection.
         * Note: Static resource protection can also result in legitimate traffic being blocked.
         * 
         * @return builder
         * 
         */
        public Builder sbfmStaticResourceProtection(@Nullable Output<Boolean> sbfmStaticResourceProtection) {
            $.sbfmStaticResourceProtection = sbfmStaticResourceProtection;
            return this;
        }

        /**
         * @param sbfmStaticResourceProtection Super Bot Fight Mode (SBFM) to enable static resource protection.
         * Enable if static resources on your application need bot protection.
         * Note: Static resource protection can also result in legitimate traffic being blocked.
         * 
         * @return builder
         * 
         */
        public Builder sbfmStaticResourceProtection(Boolean sbfmStaticResourceProtection) {
            return sbfmStaticResourceProtection(Output.of(sbfmStaticResourceProtection));
        }

        /**
         * @param sbfmVerifiedBots Super Bot Fight Mode (SBFM) action to take on verified bots requests.
         * Available values: &#34;allow&#34;, &#34;block&#34;.
         * 
         * @return builder
         * 
         */
        public Builder sbfmVerifiedBots(@Nullable Output<String> sbfmVerifiedBots) {
            $.sbfmVerifiedBots = sbfmVerifiedBots;
            return this;
        }

        /**
         * @param sbfmVerifiedBots Super Bot Fight Mode (SBFM) action to take on verified bots requests.
         * Available values: &#34;allow&#34;, &#34;block&#34;.
         * 
         * @return builder
         * 
         */
        public Builder sbfmVerifiedBots(String sbfmVerifiedBots) {
            return sbfmVerifiedBots(Output.of(sbfmVerifiedBots));
        }

        /**
         * @param staleZoneConfiguration A read-only field that shows which unauthorized settings are currently active on the zone. These settings typically result from upgrades or downgrades.
         * 
         * @return builder
         * 
         */
        public Builder staleZoneConfiguration(@Nullable Output<BotManagementStaleZoneConfigurationArgs> staleZoneConfiguration) {
            $.staleZoneConfiguration = staleZoneConfiguration;
            return this;
        }

        /**
         * @param staleZoneConfiguration A read-only field that shows which unauthorized settings are currently active on the zone. These settings typically result from upgrades or downgrades.
         * 
         * @return builder
         * 
         */
        public Builder staleZoneConfiguration(BotManagementStaleZoneConfigurationArgs staleZoneConfiguration) {
            return staleZoneConfiguration(Output.of(staleZoneConfiguration));
        }

        /**
         * @param suppressSessionScore Whether to disable tracking the highest bot score for a session in the Bot Management cookie.
         * 
         * @return builder
         * 
         */
        public Builder suppressSessionScore(@Nullable Output<Boolean> suppressSessionScore) {
            $.suppressSessionScore = suppressSessionScore;
            return this;
        }

        /**
         * @param suppressSessionScore Whether to disable tracking the highest bot score for a session in the Bot Management cookie.
         * 
         * @return builder
         * 
         */
        public Builder suppressSessionScore(Boolean suppressSessionScore) {
            return suppressSessionScore(Output.of(suppressSessionScore));
        }

        /**
         * @param usingLatestModel A read-only field that indicates whether the zone currently is running the latest ML model.
         * 
         * @return builder
         * 
         */
        public Builder usingLatestModel(@Nullable Output<Boolean> usingLatestModel) {
            $.usingLatestModel = usingLatestModel;
            return this;
        }

        /**
         * @param usingLatestModel A read-only field that indicates whether the zone currently is running the latest ML model.
         * 
         * @return builder
         * 
         */
        public Builder usingLatestModel(Boolean usingLatestModel) {
            return usingLatestModel(Output.of(usingLatestModel));
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

        public BotManagementState build() {
            return $;
        }
    }

}
