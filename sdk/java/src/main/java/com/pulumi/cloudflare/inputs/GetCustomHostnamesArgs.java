// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCustomHostnamesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCustomHostnamesArgs Empty = new GetCustomHostnamesArgs();

    /**
     * Direction to order hostnames.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    /**
     * @return Direction to order hostnames.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Fully qualified domain name to match against. This parameter cannot be used with the &#39;id&#39; parameter.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return Fully qualified domain name to match against. This parameter cannot be used with the &#39;id&#39; parameter.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * Hostname ID to match against. This ID was generated and returned during the initial custom_hostname creation. This parameter cannot be used with the &#39;hostname&#39; parameter.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Hostname ID to match against. This ID was generated and returned during the initial custom_hostname creation. This parameter cannot be used with the &#39;hostname&#39; parameter.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Max items to fetch, default: 1000
     * 
     */
    @Import(name="maxItems")
    private @Nullable Output<Integer> maxItems;

    /**
     * @return Max items to fetch, default: 1000
     * 
     */
    public Optional<Output<Integer>> maxItems() {
        return Optional.ofNullable(this.maxItems);
    }

    /**
     * Field to order hostnames by.
     * Available values: &#34;ssl&#34;, &#34;ssl_status&#34;.
     * 
     */
    @Import(name="order")
    private @Nullable Output<String> order;

    /**
     * @return Field to order hostnames by.
     * Available values: &#34;ssl&#34;, &#34;ssl_status&#34;.
     * 
     */
    public Optional<Output<String>> order() {
        return Optional.ofNullable(this.order);
    }

    /**
     * Whether to filter hostnames based on if they have SSL enabled.
     * Available values: 0, 1.
     * 
     */
    @Import(name="ssl")
    private @Nullable Output<Double> ssl;

    /**
     * @return Whether to filter hostnames based on if they have SSL enabled.
     * Available values: 0, 1.
     * 
     */
    public Optional<Output<Double>> ssl() {
        return Optional.ofNullable(this.ssl);
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

    private GetCustomHostnamesArgs() {}

    private GetCustomHostnamesArgs(GetCustomHostnamesArgs $) {
        this.direction = $.direction;
        this.hostname = $.hostname;
        this.id = $.id;
        this.maxItems = $.maxItems;
        this.order = $.order;
        this.ssl = $.ssl;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCustomHostnamesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCustomHostnamesArgs $;

        public Builder() {
            $ = new GetCustomHostnamesArgs();
        }

        public Builder(GetCustomHostnamesArgs defaults) {
            $ = new GetCustomHostnamesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param direction Direction to order hostnames.
         * Available values: &#34;asc&#34;, &#34;desc&#34;.
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction Direction to order hostnames.
         * Available values: &#34;asc&#34;, &#34;desc&#34;.
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param hostname Fully qualified domain name to match against. This parameter cannot be used with the &#39;id&#39; parameter.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Fully qualified domain name to match against. This parameter cannot be used with the &#39;id&#39; parameter.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param id Hostname ID to match against. This ID was generated and returned during the initial custom_hostname creation. This parameter cannot be used with the &#39;hostname&#39; parameter.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Hostname ID to match against. This ID was generated and returned during the initial custom_hostname creation. This parameter cannot be used with the &#39;hostname&#39; parameter.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param maxItems Max items to fetch, default: 1000
         * 
         * @return builder
         * 
         */
        public Builder maxItems(@Nullable Output<Integer> maxItems) {
            $.maxItems = maxItems;
            return this;
        }

        /**
         * @param maxItems Max items to fetch, default: 1000
         * 
         * @return builder
         * 
         */
        public Builder maxItems(Integer maxItems) {
            return maxItems(Output.of(maxItems));
        }

        /**
         * @param order Field to order hostnames by.
         * Available values: &#34;ssl&#34;, &#34;ssl_status&#34;.
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<String> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order Field to order hostnames by.
         * Available values: &#34;ssl&#34;, &#34;ssl_status&#34;.
         * 
         * @return builder
         * 
         */
        public Builder order(String order) {
            return order(Output.of(order));
        }

        /**
         * @param ssl Whether to filter hostnames based on if they have SSL enabled.
         * Available values: 0, 1.
         * 
         * @return builder
         * 
         */
        public Builder ssl(@Nullable Output<Double> ssl) {
            $.ssl = ssl;
            return this;
        }

        /**
         * @param ssl Whether to filter hostnames based on if they have SSL enabled.
         * Available values: 0, 1.
         * 
         * @return builder
         * 
         */
        public Builder ssl(Double ssl) {
            return ssl(Output.of(ssl));
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

        public GetCustomHostnamesArgs build() {
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetCustomHostnamesArgs", "zoneId");
            }
            return $;
        }
    }

}
