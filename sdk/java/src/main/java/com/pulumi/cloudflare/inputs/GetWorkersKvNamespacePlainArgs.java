// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.GetWorkersKvNamespaceFilter;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkersKvNamespacePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkersKvNamespacePlainArgs Empty = new GetWorkersKvNamespacePlainArgs();

    /**
     * Identifier
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return Identifier
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    @Import(name="filter")
    private @Nullable GetWorkersKvNamespaceFilter filter;

    public Optional<GetWorkersKvNamespaceFilter> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Namespace identifier tag.
     * 
     */
    @Import(name="namespaceId")
    private @Nullable String namespaceId;

    /**
     * @return Namespace identifier tag.
     * 
     */
    public Optional<String> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }

    private GetWorkersKvNamespacePlainArgs() {}

    private GetWorkersKvNamespacePlainArgs(GetWorkersKvNamespacePlainArgs $) {
        this.accountId = $.accountId;
        this.filter = $.filter;
        this.namespaceId = $.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkersKvNamespacePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkersKvNamespacePlainArgs $;

        public Builder() {
            $ = new GetWorkersKvNamespacePlainArgs();
        }

        public Builder(GetWorkersKvNamespacePlainArgs defaults) {
            $ = new GetWorkersKvNamespacePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Identifier
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder filter(@Nullable GetWorkersKvNamespaceFilter filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param namespaceId Namespace identifier tag.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(@Nullable String namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        public GetWorkersKvNamespacePlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetWorkersKvNamespacePlainArgs", "accountId");
            }
            return $;
        }
    }

}
