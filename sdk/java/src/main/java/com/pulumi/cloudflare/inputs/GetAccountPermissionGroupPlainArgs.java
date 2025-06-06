// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetAccountPermissionGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountPermissionGroupPlainArgs Empty = new GetAccountPermissionGroupPlainArgs();

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
     * Permission Group identifier tag.
     * 
     */
    @Import(name="permissionGroupId", required=true)
    private String permissionGroupId;

    /**
     * @return Permission Group identifier tag.
     * 
     */
    public String permissionGroupId() {
        return this.permissionGroupId;
    }

    private GetAccountPermissionGroupPlainArgs() {}

    private GetAccountPermissionGroupPlainArgs(GetAccountPermissionGroupPlainArgs $) {
        this.accountId = $.accountId;
        this.permissionGroupId = $.permissionGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountPermissionGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountPermissionGroupPlainArgs $;

        public Builder() {
            $ = new GetAccountPermissionGroupPlainArgs();
        }

        public Builder(GetAccountPermissionGroupPlainArgs defaults) {
            $ = new GetAccountPermissionGroupPlainArgs(Objects.requireNonNull(defaults));
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
         * @param permissionGroupId Permission Group identifier tag.
         * 
         * @return builder
         * 
         */
        public Builder permissionGroupId(String permissionGroupId) {
            $.permissionGroupId = permissionGroupId;
            return this;
        }

        public GetAccountPermissionGroupPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetAccountPermissionGroupPlainArgs", "accountId");
            }
            if ($.permissionGroupId == null) {
                throw new MissingRequiredPropertyException("GetAccountPermissionGroupPlainArgs", "permissionGroupId");
            }
            return $;
        }
    }

}
