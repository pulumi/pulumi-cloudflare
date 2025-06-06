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


public final class ZeroTrustAccessCustomPageState extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessCustomPageState Empty = new ZeroTrustAccessCustomPageState();

    /**
     * Identifier.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Identifier.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Number of apps the custom page is assigned to.
     * 
     */
    @Import(name="appCount")
    private @Nullable Output<Integer> appCount;

    /**
     * @return Number of apps the custom page is assigned to.
     * 
     */
    public Optional<Output<Integer>> appCount() {
        return Optional.ofNullable(this.appCount);
    }

    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Custom page HTML.
     * 
     */
    @Import(name="customHtml")
    private @Nullable Output<String> customHtml;

    /**
     * @return Custom page HTML.
     * 
     */
    public Optional<Output<String>> customHtml() {
        return Optional.ofNullable(this.customHtml);
    }

    /**
     * Custom page name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Custom page name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Custom page type.
     * Available values: &#34;identity_denied&#34;, &#34;forbidden&#34;.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Custom page type.
     * Available values: &#34;identity_denied&#34;, &#34;forbidden&#34;.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * UUID.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return UUID.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    private ZeroTrustAccessCustomPageState() {}

    private ZeroTrustAccessCustomPageState(ZeroTrustAccessCustomPageState $) {
        this.accountId = $.accountId;
        this.appCount = $.appCount;
        this.createdAt = $.createdAt;
        this.customHtml = $.customHtml;
        this.name = $.name;
        this.type = $.type;
        this.uid = $.uid;
        this.updatedAt = $.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessCustomPageState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessCustomPageState $;

        public Builder() {
            $ = new ZeroTrustAccessCustomPageState();
        }

        public Builder(ZeroTrustAccessCustomPageState defaults) {
            $ = new ZeroTrustAccessCustomPageState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param appCount Number of apps the custom page is assigned to.
         * 
         * @return builder
         * 
         */
        public Builder appCount(@Nullable Output<Integer> appCount) {
            $.appCount = appCount;
            return this;
        }

        /**
         * @param appCount Number of apps the custom page is assigned to.
         * 
         * @return builder
         * 
         */
        public Builder appCount(Integer appCount) {
            return appCount(Output.of(appCount));
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param customHtml Custom page HTML.
         * 
         * @return builder
         * 
         */
        public Builder customHtml(@Nullable Output<String> customHtml) {
            $.customHtml = customHtml;
            return this;
        }

        /**
         * @param customHtml Custom page HTML.
         * 
         * @return builder
         * 
         */
        public Builder customHtml(String customHtml) {
            return customHtml(Output.of(customHtml));
        }

        /**
         * @param name Custom page name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Custom page name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Custom page type.
         * Available values: &#34;identity_denied&#34;, &#34;forbidden&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Custom page type.
         * Available values: &#34;identity_denied&#34;, &#34;forbidden&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param uid UUID.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid UUID.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public ZeroTrustAccessCustomPageState build() {
            return $;
        }
    }

}
