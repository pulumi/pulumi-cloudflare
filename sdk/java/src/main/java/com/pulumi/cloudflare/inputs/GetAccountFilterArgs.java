// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetAccountFilterArgs Empty = new GetAccountFilterArgs();

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

    private GetAccountFilterArgs() {}

    private GetAccountFilterArgs(GetAccountFilterArgs $) {
        this.direction = $.direction;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountFilterArgs $;

        public Builder() {
            $ = new GetAccountFilterArgs();
        }

        public Builder(GetAccountFilterArgs defaults) {
            $ = new GetAccountFilterArgs(Objects.requireNonNull(defaults));
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

        public GetAccountFilterArgs build() {
            return $;
        }
    }

}
