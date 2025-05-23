// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkersKvNamespaceFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetWorkersKvNamespaceFilterArgs Empty = new GetWorkersKvNamespaceFilterArgs();

    /**
     * Direction to order namespaces.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    /**
     * @return Direction to order namespaces.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Field to order results by.
     * Available values: &#34;id&#34;, &#34;title&#34;.
     * 
     */
    @Import(name="order")
    private @Nullable Output<String> order;

    /**
     * @return Field to order results by.
     * Available values: &#34;id&#34;, &#34;title&#34;.
     * 
     */
    public Optional<Output<String>> order() {
        return Optional.ofNullable(this.order);
    }

    private GetWorkersKvNamespaceFilterArgs() {}

    private GetWorkersKvNamespaceFilterArgs(GetWorkersKvNamespaceFilterArgs $) {
        this.direction = $.direction;
        this.order = $.order;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkersKvNamespaceFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkersKvNamespaceFilterArgs $;

        public Builder() {
            $ = new GetWorkersKvNamespaceFilterArgs();
        }

        public Builder(GetWorkersKvNamespaceFilterArgs defaults) {
            $ = new GetWorkersKvNamespaceFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param direction Direction to order namespaces.
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
         * @param direction Direction to order namespaces.
         * Available values: &#34;asc&#34;, &#34;desc&#34;.
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param order Field to order results by.
         * Available values: &#34;id&#34;, &#34;title&#34;.
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<String> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order Field to order results by.
         * Available values: &#34;id&#34;, &#34;title&#34;.
         * 
         * @return builder
         * 
         */
        public Builder order(String order) {
            return order(Output.of(order));
        }

        public GetWorkersKvNamespaceFilterArgs build() {
            return $;
        }
    }

}
