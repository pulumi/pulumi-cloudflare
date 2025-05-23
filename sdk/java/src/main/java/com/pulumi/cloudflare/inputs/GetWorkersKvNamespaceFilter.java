// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkersKvNamespaceFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkersKvNamespaceFilter Empty = new GetWorkersKvNamespaceFilter();

    /**
     * Direction to order namespaces.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    @Import(name="direction")
    private @Nullable String direction;

    /**
     * @return Direction to order namespaces.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Field to order results by.
     * Available values: &#34;id&#34;, &#34;title&#34;.
     * 
     */
    @Import(name="order")
    private @Nullable String order;

    /**
     * @return Field to order results by.
     * Available values: &#34;id&#34;, &#34;title&#34;.
     * 
     */
    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }

    private GetWorkersKvNamespaceFilter() {}

    private GetWorkersKvNamespaceFilter(GetWorkersKvNamespaceFilter $) {
        this.direction = $.direction;
        this.order = $.order;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkersKvNamespaceFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkersKvNamespaceFilter $;

        public Builder() {
            $ = new GetWorkersKvNamespaceFilter();
        }

        public Builder(GetWorkersKvNamespaceFilter defaults) {
            $ = new GetWorkersKvNamespaceFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param direction Direction to order namespaces.
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
         * @param order Field to order results by.
         * Available values: &#34;id&#34;, &#34;title&#34;.
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable String order) {
            $.order = order;
            return this;
        }

        public GetWorkersKvNamespaceFilter build() {
            return $;
        }
    }

}
