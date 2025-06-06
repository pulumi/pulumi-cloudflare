// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountsArgs Empty = new GetAccountsArgs();

    /**
     * Direction to order results.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    /**
     * @return Direction to order results.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
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
     * Name of the account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetAccountsArgs() {}

    private GetAccountsArgs(GetAccountsArgs $) {
        this.direction = $.direction;
        this.maxItems = $.maxItems;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountsArgs $;

        public Builder() {
            $ = new GetAccountsArgs();
        }

        public Builder(GetAccountsArgs defaults) {
            $ = new GetAccountsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param direction Direction to order results.
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
         * @param direction Direction to order results.
         * Available values: &#34;asc&#34;, &#34;desc&#34;.
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
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
         * @param name Name of the account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetAccountsArgs build() {
            return $;
        }
    }

}
