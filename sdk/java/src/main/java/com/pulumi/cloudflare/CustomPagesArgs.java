// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomPagesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomPagesArgs Empty = new CustomPagesArgs();

    /**
     * The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Identifier
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Identifier
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * The custom page state.
     * Available values: &#34;default&#34;, &#34;customized&#34;.
     * 
     */
    @Import(name="state", required=true)
    private Output<String> state;

    /**
     * @return The custom page state.
     * Available values: &#34;default&#34;, &#34;customized&#34;.
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     * The URL associated with the custom page.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return The URL associated with the custom page.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     * The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private CustomPagesArgs() {}

    private CustomPagesArgs(CustomPagesArgs $) {
        this.accountId = $.accountId;
        this.identifier = $.identifier;
        this.state = $.state;
        this.url = $.url;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomPagesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomPagesArgs $;

        public Builder() {
            $ = new CustomPagesArgs();
        }

        public Builder(CustomPagesArgs defaults) {
            $ = new CustomPagesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param identifier Identifier
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Identifier
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param state The custom page state.
         * Available values: &#34;default&#34;, &#34;customized&#34;.
         * 
         * @return builder
         * 
         */
        public Builder state(Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The custom page state.
         * Available values: &#34;default&#34;, &#34;customized&#34;.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param url The URL associated with the custom page.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL associated with the custom page.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param zoneId The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public CustomPagesArgs build() {
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("CustomPagesArgs", "identifier");
            }
            if ($.state == null) {
                throw new MissingRequiredPropertyException("CustomPagesArgs", "state");
            }
            if ($.url == null) {
                throw new MissingRequiredPropertyException("CustomPagesArgs", "url");
            }
            return $;
        }
    }

}
