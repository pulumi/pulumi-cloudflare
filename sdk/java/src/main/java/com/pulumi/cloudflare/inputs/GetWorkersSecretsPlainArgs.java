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


public final class GetWorkersSecretsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkersSecretsPlainArgs Empty = new GetWorkersSecretsPlainArgs();

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
    @Import(name="dispatchNamespace", required=true)
    private String dispatchNamespace;

    /**
     * @return Name of the Workers for Platforms dispatch namespace.
     * 
     */
    public String dispatchNamespace() {
        return this.dispatchNamespace;
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

    /**
     * Name of the script, used in URLs and route configuration.
     * 
     */
    @Import(name="scriptName", required=true)
    private String scriptName;

    /**
     * @return Name of the script, used in URLs and route configuration.
     * 
     */
    public String scriptName() {
        return this.scriptName;
    }

    private GetWorkersSecretsPlainArgs() {}

    private GetWorkersSecretsPlainArgs(GetWorkersSecretsPlainArgs $) {
        this.accountId = $.accountId;
        this.dispatchNamespace = $.dispatchNamespace;
        this.maxItems = $.maxItems;
        this.scriptName = $.scriptName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkersSecretsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkersSecretsPlainArgs $;

        public Builder() {
            $ = new GetWorkersSecretsPlainArgs();
        }

        public Builder(GetWorkersSecretsPlainArgs defaults) {
            $ = new GetWorkersSecretsPlainArgs(Objects.requireNonNull(defaults));
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
        public Builder dispatchNamespace(String dispatchNamespace) {
            $.dispatchNamespace = dispatchNamespace;
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

        /**
         * @param scriptName Name of the script, used in URLs and route configuration.
         * 
         * @return builder
         * 
         */
        public Builder scriptName(String scriptName) {
            $.scriptName = scriptName;
            return this;
        }

        public GetWorkersSecretsPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetWorkersSecretsPlainArgs", "accountId");
            }
            if ($.dispatchNamespace == null) {
                throw new MissingRequiredPropertyException("GetWorkersSecretsPlainArgs", "dispatchNamespace");
            }
            if ($.scriptName == null) {
                throw new MissingRequiredPropertyException("GetWorkersSecretsPlainArgs", "scriptName");
            }
            return $;
        }
    }

}
