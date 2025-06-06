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


public final class GetMtlsCertificatesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMtlsCertificatesPlainArgs Empty = new GetMtlsCertificatesPlainArgs();

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

    private GetMtlsCertificatesPlainArgs() {}

    private GetMtlsCertificatesPlainArgs(GetMtlsCertificatesPlainArgs $) {
        this.accountId = $.accountId;
        this.maxItems = $.maxItems;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMtlsCertificatesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMtlsCertificatesPlainArgs $;

        public Builder() {
            $ = new GetMtlsCertificatesPlainArgs();
        }

        public Builder(GetMtlsCertificatesPlainArgs defaults) {
            $ = new GetMtlsCertificatesPlainArgs(Objects.requireNonNull(defaults));
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

        public GetMtlsCertificatesPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetMtlsCertificatesPlainArgs", "accountId");
            }
            return $;
        }
    }

}
