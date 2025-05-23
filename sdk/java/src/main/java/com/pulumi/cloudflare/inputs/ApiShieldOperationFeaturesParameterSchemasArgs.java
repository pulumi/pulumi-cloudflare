// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesParameterSchemasParameterSchemasArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiShieldOperationFeaturesParameterSchemasArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiShieldOperationFeaturesParameterSchemasArgs Empty = new ApiShieldOperationFeaturesParameterSchemasArgs();

    @Import(name="lastUpdated")
    private @Nullable Output<String> lastUpdated;

    public Optional<Output<String>> lastUpdated() {
        return Optional.ofNullable(this.lastUpdated);
    }

    /**
     * An operation schema object containing a response.
     * 
     */
    @Import(name="parameterSchemas")
    private @Nullable Output<ApiShieldOperationFeaturesParameterSchemasParameterSchemasArgs> parameterSchemas;

    /**
     * @return An operation schema object containing a response.
     * 
     */
    public Optional<Output<ApiShieldOperationFeaturesParameterSchemasParameterSchemasArgs>> parameterSchemas() {
        return Optional.ofNullable(this.parameterSchemas);
    }

    private ApiShieldOperationFeaturesParameterSchemasArgs() {}

    private ApiShieldOperationFeaturesParameterSchemasArgs(ApiShieldOperationFeaturesParameterSchemasArgs $) {
        this.lastUpdated = $.lastUpdated;
        this.parameterSchemas = $.parameterSchemas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiShieldOperationFeaturesParameterSchemasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiShieldOperationFeaturesParameterSchemasArgs $;

        public Builder() {
            $ = new ApiShieldOperationFeaturesParameterSchemasArgs();
        }

        public Builder(ApiShieldOperationFeaturesParameterSchemasArgs defaults) {
            $ = new ApiShieldOperationFeaturesParameterSchemasArgs(Objects.requireNonNull(defaults));
        }

        public Builder lastUpdated(@Nullable Output<String> lastUpdated) {
            $.lastUpdated = lastUpdated;
            return this;
        }

        public Builder lastUpdated(String lastUpdated) {
            return lastUpdated(Output.of(lastUpdated));
        }

        /**
         * @param parameterSchemas An operation schema object containing a response.
         * 
         * @return builder
         * 
         */
        public Builder parameterSchemas(@Nullable Output<ApiShieldOperationFeaturesParameterSchemasParameterSchemasArgs> parameterSchemas) {
            $.parameterSchemas = parameterSchemas;
            return this;
        }

        /**
         * @param parameterSchemas An operation schema object containing a response.
         * 
         * @return builder
         * 
         */
        public Builder parameterSchemas(ApiShieldOperationFeaturesParameterSchemasParameterSchemasArgs parameterSchemas) {
            return parameterSchemas(Output.of(parameterSchemas));
        }

        public ApiShieldOperationFeaturesParameterSchemasArgs build() {
            return $;
        }
    }

}
