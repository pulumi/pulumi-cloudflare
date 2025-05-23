// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudforceOneRequestPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudforceOneRequestPlainArgs Empty = new GetCloudforceOneRequestPlainArgs();

    /**
     * Identifier
     * 
     */
    @Import(name="accountIdentifier", required=true)
    private String accountIdentifier;

    /**
     * @return Identifier
     * 
     */
    public String accountIdentifier() {
        return this.accountIdentifier;
    }

    /**
     * UUID
     * 
     */
    @Import(name="requestIdentifier")
    private @Nullable String requestIdentifier;

    /**
     * @return UUID
     * 
     */
    public Optional<String> requestIdentifier() {
        return Optional.ofNullable(this.requestIdentifier);
    }

    private GetCloudforceOneRequestPlainArgs() {}

    private GetCloudforceOneRequestPlainArgs(GetCloudforceOneRequestPlainArgs $) {
        this.accountIdentifier = $.accountIdentifier;
        this.requestIdentifier = $.requestIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudforceOneRequestPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudforceOneRequestPlainArgs $;

        public Builder() {
            $ = new GetCloudforceOneRequestPlainArgs();
        }

        public Builder(GetCloudforceOneRequestPlainArgs defaults) {
            $ = new GetCloudforceOneRequestPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountIdentifier Identifier
         * 
         * @return builder
         * 
         */
        public Builder accountIdentifier(String accountIdentifier) {
            $.accountIdentifier = accountIdentifier;
            return this;
        }

        /**
         * @param requestIdentifier UUID
         * 
         * @return builder
         * 
         */
        public Builder requestIdentifier(@Nullable String requestIdentifier) {
            $.requestIdentifier = requestIdentifier;
            return this;
        }

        public GetCloudforceOneRequestPlainArgs build() {
            if ($.accountIdentifier == null) {
                throw new MissingRequiredPropertyException("GetCloudforceOneRequestPlainArgs", "accountIdentifier");
            }
            return $;
        }
    }

}
