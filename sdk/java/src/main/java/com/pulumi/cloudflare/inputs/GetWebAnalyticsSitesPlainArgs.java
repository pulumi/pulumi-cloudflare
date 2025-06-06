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


public final class GetWebAnalyticsSitesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebAnalyticsSitesPlainArgs Empty = new GetWebAnalyticsSitesPlainArgs();

    /**
     * Identifier.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return Identifier.
     * 
     */
    public String accountId() {
        return this.accountId;
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
     * The property used to sort the list of results.
     * Available values: &#34;host&#34;, &#34;created&#34;.
     * 
     */
    @Import(name="orderBy")
    private @Nullable String orderBy;

    /**
     * @return The property used to sort the list of results.
     * Available values: &#34;host&#34;, &#34;created&#34;.
     * 
     */
    public Optional<String> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }

    private GetWebAnalyticsSitesPlainArgs() {}

    private GetWebAnalyticsSitesPlainArgs(GetWebAnalyticsSitesPlainArgs $) {
        this.accountId = $.accountId;
        this.maxItems = $.maxItems;
        this.orderBy = $.orderBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebAnalyticsSitesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebAnalyticsSitesPlainArgs $;

        public Builder() {
            $ = new GetWebAnalyticsSitesPlainArgs();
        }

        public Builder(GetWebAnalyticsSitesPlainArgs defaults) {
            $ = new GetWebAnalyticsSitesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
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
         * @param orderBy The property used to sort the list of results.
         * Available values: &#34;host&#34;, &#34;created&#34;.
         * 
         * @return builder
         * 
         */
        public Builder orderBy(@Nullable String orderBy) {
            $.orderBy = orderBy;
            return this;
        }

        public GetWebAnalyticsSitesPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetWebAnalyticsSitesPlainArgs", "accountId");
            }
            return $;
        }
    }

}
