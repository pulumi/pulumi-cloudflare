// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkersForPlatformsDispatchNamespacePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkersForPlatformsDispatchNamespacePlainArgs Empty = new GetWorkersForPlatformsDispatchNamespacePlainArgs();

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
     * Name of the Workers for Platforms dispatch namespace.
     * 
     */
    @Import(name="dispatchNamespace")
    private @Nullable String dispatchNamespace;

    /**
     * @return Name of the Workers for Platforms dispatch namespace.
     * 
     */
    public Optional<String> dispatchNamespace() {
        return Optional.ofNullable(this.dispatchNamespace);
    }

    private GetWorkersForPlatformsDispatchNamespacePlainArgs() {}

    private GetWorkersForPlatformsDispatchNamespacePlainArgs(GetWorkersForPlatformsDispatchNamespacePlainArgs $) {
        this.accountId = $.accountId;
        this.dispatchNamespace = $.dispatchNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkersForPlatformsDispatchNamespacePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkersForPlatformsDispatchNamespacePlainArgs $;

        public Builder() {
            $ = new GetWorkersForPlatformsDispatchNamespacePlainArgs();
        }

        public Builder(GetWorkersForPlatformsDispatchNamespacePlainArgs defaults) {
            $ = new GetWorkersForPlatformsDispatchNamespacePlainArgs(Objects.requireNonNull(defaults));
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
         * @param dispatchNamespace Name of the Workers for Platforms dispatch namespace.
         * 
         * @return builder
         * 
         */
        public Builder dispatchNamespace(@Nullable String dispatchNamespace) {
            $.dispatchNamespace = dispatchNamespace;
            return this;
        }

        public GetWorkersForPlatformsDispatchNamespacePlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetWorkersForPlatformsDispatchNamespacePlainArgs", "accountId");
            }
            return $;
        }
    }

}
