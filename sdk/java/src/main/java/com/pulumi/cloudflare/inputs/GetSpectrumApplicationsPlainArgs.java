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


public final class GetSpectrumApplicationsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSpectrumApplicationsPlainArgs Empty = new GetSpectrumApplicationsPlainArgs();

    /**
     * Sets the direction by which results are ordered.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    @Import(name="direction")
    private @Nullable String direction;

    /**
     * @return Sets the direction by which results are ordered.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
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
     * Application field by which results are ordered.
     * Available values: &#34;protocol&#34;, &#34;app*id&#34;, &#34;created*on&#34;, &#34;modified_on&#34;, &#34;dns&#34;.
     * 
     */
    @Import(name="order")
    private @Nullable String order;

    /**
     * @return Application field by which results are ordered.
     * Available values: &#34;protocol&#34;, &#34;app*id&#34;, &#34;created*on&#34;, &#34;modified_on&#34;, &#34;dns&#34;.
     * 
     */
    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }

    /**
     * Zone identifier.
     * 
     */
    @Import(name="zoneId", required=true)
    private String zoneId;

    /**
     * @return Zone identifier.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    private GetSpectrumApplicationsPlainArgs() {}

    private GetSpectrumApplicationsPlainArgs(GetSpectrumApplicationsPlainArgs $) {
        this.direction = $.direction;
        this.maxItems = $.maxItems;
        this.order = $.order;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSpectrumApplicationsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSpectrumApplicationsPlainArgs $;

        public Builder() {
            $ = new GetSpectrumApplicationsPlainArgs();
        }

        public Builder(GetSpectrumApplicationsPlainArgs defaults) {
            $ = new GetSpectrumApplicationsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param direction Sets the direction by which results are ordered.
         * Available values: &#34;asc&#34;, &#34;desc&#34;.
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable String direction) {
            $.direction = direction;
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
         * @param order Application field by which results are ordered.
         * Available values: &#34;protocol&#34;, &#34;app*id&#34;, &#34;created*on&#34;, &#34;modified_on&#34;, &#34;dns&#34;.
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable String order) {
            $.order = order;
            return this;
        }

        /**
         * @param zoneId Zone identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public GetSpectrumApplicationsPlainArgs build() {
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetSpectrumApplicationsPlainArgs", "zoneId");
            }
            return $;
        }
    }

}
