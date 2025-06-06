// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.GetWebAnalyticsSiteFilter;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWebAnalyticsSitePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebAnalyticsSitePlainArgs Empty = new GetWebAnalyticsSitePlainArgs();

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

    @Import(name="filter")
    private @Nullable GetWebAnalyticsSiteFilter filter;

    public Optional<GetWebAnalyticsSiteFilter> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Identifier.
     * 
     */
    @Import(name="siteId")
    private @Nullable String siteId;

    /**
     * @return Identifier.
     * 
     */
    public Optional<String> siteId() {
        return Optional.ofNullable(this.siteId);
    }

    private GetWebAnalyticsSitePlainArgs() {}

    private GetWebAnalyticsSitePlainArgs(GetWebAnalyticsSitePlainArgs $) {
        this.accountId = $.accountId;
        this.filter = $.filter;
        this.siteId = $.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebAnalyticsSitePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebAnalyticsSitePlainArgs $;

        public Builder() {
            $ = new GetWebAnalyticsSitePlainArgs();
        }

        public Builder(GetWebAnalyticsSitePlainArgs defaults) {
            $ = new GetWebAnalyticsSitePlainArgs(Objects.requireNonNull(defaults));
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

        public Builder filter(@Nullable GetWebAnalyticsSiteFilter filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param siteId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder siteId(@Nullable String siteId) {
            $.siteId = siteId;
            return this;
        }

        public GetWebAnalyticsSitePlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetWebAnalyticsSitePlainArgs", "accountId");
            }
            return $;
        }
    }

}
