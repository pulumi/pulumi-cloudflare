// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAddressMapPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAddressMapPlainArgs Empty = new GetAddressMapPlainArgs();

    /**
     * Identifier of a Cloudflare account.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return Identifier of a Cloudflare account.
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * Identifier of an Address Map.
     * 
     */
    @Import(name="addressMapId")
    private @Nullable String addressMapId;

    /**
     * @return Identifier of an Address Map.
     * 
     */
    public Optional<String> addressMapId() {
        return Optional.ofNullable(this.addressMapId);
    }

    private GetAddressMapPlainArgs() {}

    private GetAddressMapPlainArgs(GetAddressMapPlainArgs $) {
        this.accountId = $.accountId;
        this.addressMapId = $.addressMapId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAddressMapPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAddressMapPlainArgs $;

        public Builder() {
            $ = new GetAddressMapPlainArgs();
        }

        public Builder(GetAddressMapPlainArgs defaults) {
            $ = new GetAddressMapPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Identifier of a Cloudflare account.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param addressMapId Identifier of an Address Map.
         * 
         * @return builder
         * 
         */
        public Builder addressMapId(@Nullable String addressMapId) {
            $.addressMapId = addressMapId;
            return this;
        }

        public GetAddressMapPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetAddressMapPlainArgs", "accountId");
            }
            return $;
        }
    }

}
