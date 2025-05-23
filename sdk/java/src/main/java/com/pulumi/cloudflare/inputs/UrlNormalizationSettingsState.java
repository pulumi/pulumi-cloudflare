// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UrlNormalizationSettingsState extends com.pulumi.resources.ResourceArgs {

    public static final UrlNormalizationSettingsState Empty = new UrlNormalizationSettingsState();

    /**
     * The scope of the URL normalization.
     * Available values: &#34;incoming&#34;, &#34;both&#34;.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope of the URL normalization.
     * Available values: &#34;incoming&#34;, &#34;both&#34;.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * The type of URL normalization performed by Cloudflare.
     * Available values: &#34;cloudflare&#34;, &#34;rfc3986&#34;.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of URL normalization performed by Cloudflare.
     * Available values: &#34;cloudflare&#34;, &#34;rfc3986&#34;.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The unique ID of the zone.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The unique ID of the zone.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private UrlNormalizationSettingsState() {}

    private UrlNormalizationSettingsState(UrlNormalizationSettingsState $) {
        this.scope = $.scope;
        this.type = $.type;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UrlNormalizationSettingsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UrlNormalizationSettingsState $;

        public Builder() {
            $ = new UrlNormalizationSettingsState();
        }

        public Builder(UrlNormalizationSettingsState defaults) {
            $ = new UrlNormalizationSettingsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param scope The scope of the URL normalization.
         * Available values: &#34;incoming&#34;, &#34;both&#34;.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of the URL normalization.
         * Available values: &#34;incoming&#34;, &#34;both&#34;.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param type The type of URL normalization performed by Cloudflare.
         * Available values: &#34;cloudflare&#34;, &#34;rfc3986&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of URL normalization performed by Cloudflare.
         * Available values: &#34;cloudflare&#34;, &#34;rfc3986&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param zoneId The unique ID of the zone.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The unique ID of the zone.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public UrlNormalizationSettingsState build() {
            return $;
        }
    }

}
