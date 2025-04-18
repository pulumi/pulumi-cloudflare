// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetResourceGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourceGroupPlainArgs Empty = new GetResourceGroupPlainArgs();

    /**
     * Account identifier tag.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return Account identifier tag.
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * Resource Group identifier tag.
     * 
     */
    @Import(name="resourceGroupId", required=true)
    private String resourceGroupId;

    /**
     * @return Resource Group identifier tag.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }

    private GetResourceGroupPlainArgs() {}

    private GetResourceGroupPlainArgs(GetResourceGroupPlainArgs $) {
        this.accountId = $.accountId;
        this.resourceGroupId = $.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourceGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourceGroupPlainArgs $;

        public Builder() {
            $ = new GetResourceGroupPlainArgs();
        }

        public Builder(GetResourceGroupPlainArgs defaults) {
            $ = new GetResourceGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account identifier tag.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param resourceGroupId Resource Group identifier tag.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        public GetResourceGroupPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetResourceGroupPlainArgs", "accountId");
            }
            if ($.resourceGroupId == null) {
                throw new MissingRequiredPropertyException("GetResourceGroupPlainArgs", "resourceGroupId");
            }
            return $;
        }
    }

}
