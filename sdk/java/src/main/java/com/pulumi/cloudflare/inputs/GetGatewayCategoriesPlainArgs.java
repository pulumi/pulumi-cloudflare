// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetGatewayCategoriesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGatewayCategoriesPlainArgs Empty = new GetGatewayCategoriesPlainArgs();

    /**
     * The account ID to fetch Gateway Categories from.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return The account ID to fetch Gateway Categories from.
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    private GetGatewayCategoriesPlainArgs() {}

    private GetGatewayCategoriesPlainArgs(GetGatewayCategoriesPlainArgs $) {
        this.accountId = $.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGatewayCategoriesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGatewayCategoriesPlainArgs $;

        public Builder() {
            $ = new GetGatewayCategoriesPlainArgs();
        }

        public Builder(GetGatewayCategoriesPlainArgs defaults) {
            $ = new GetGatewayCategoriesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account ID to fetch Gateway Categories from.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        public GetGatewayCategoriesPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetGatewayCategoriesPlainArgs", "accountId");
            }
            return $;
        }
    }

}
