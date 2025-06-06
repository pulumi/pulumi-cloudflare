// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCustomSslsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCustomSslsPlainArgs Empty = new GetCustomSslsPlainArgs();

    /**
     * Whether to match all search requirements or at least one (any).
     * Available values: &#34;any&#34;, &#34;all&#34;.
     * 
     */
    @Import(name="match")
    private @Nullable String match;

    /**
     * @return Whether to match all search requirements or at least one (any).
     * Available values: &#34;any&#34;, &#34;all&#34;.
     * 
     */
    public Optional<String> match() {
        return Optional.ofNullable(this.match);
    }

    /**
     * Max items to fetch, default: 1000
     * 
     */
    @Import(name="maxItems")
    private @Nullable Integer maxItems;

    /**
     * @return Max items to fetch, default: 1000
     * 
     */
    public Optional<Integer> maxItems() {
        return Optional.ofNullable(this.maxItems);
    }

    /**
     * Status of the zone&#39;s custom SSL.
     * Available values: &#34;active&#34;, &#34;expired&#34;, &#34;deleted&#34;, &#34;pending&#34;, &#34;initializing&#34;.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return Status of the zone&#39;s custom SSL.
     * Available values: &#34;active&#34;, &#34;expired&#34;, &#34;deleted&#34;, &#34;pending&#34;, &#34;initializing&#34;.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Identifier.
     * 
     */
    @Import(name="zoneId", required=true)
    private String zoneId;

    /**
     * @return Identifier.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    private GetCustomSslsPlainArgs() {}

    private GetCustomSslsPlainArgs(GetCustomSslsPlainArgs $) {
        this.match = $.match;
        this.maxItems = $.maxItems;
        this.status = $.status;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCustomSslsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCustomSslsPlainArgs $;

        public Builder() {
            $ = new GetCustomSslsPlainArgs();
        }

        public Builder(GetCustomSslsPlainArgs defaults) {
            $ = new GetCustomSslsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param match Whether to match all search requirements or at least one (any).
         * Available values: &#34;any&#34;, &#34;all&#34;.
         * 
         * @return builder
         * 
         */
        public Builder match(@Nullable String match) {
            $.match = match;
            return this;
        }

        /**
         * @param maxItems Max items to fetch, default: 1000
         * 
         * @return builder
         * 
         */
        public Builder maxItems(@Nullable Integer maxItems) {
            $.maxItems = maxItems;
            return this;
        }

        /**
         * @param status Status of the zone&#39;s custom SSL.
         * Available values: &#34;active&#34;, &#34;expired&#34;, &#34;deleted&#34;, &#34;pending&#34;, &#34;initializing&#34;.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param zoneId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public GetCustomSslsPlainArgs build() {
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetCustomSslsPlainArgs", "zoneId");
            }
            return $;
        }
    }

}
