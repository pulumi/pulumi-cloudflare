// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCloudforceOneRequestPriorityPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudforceOneRequestPriorityPlainArgs Empty = new GetCloudforceOneRequestPriorityPlainArgs();

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
    @Import(name="priorityIdentifer", required=true)
    private String priorityIdentifer;

    /**
     * @return UUID
     * 
     */
    public String priorityIdentifer() {
        return this.priorityIdentifer;
    }

    private GetCloudforceOneRequestPriorityPlainArgs() {}

    private GetCloudforceOneRequestPriorityPlainArgs(GetCloudforceOneRequestPriorityPlainArgs $) {
        this.accountIdentifier = $.accountIdentifier;
        this.priorityIdentifer = $.priorityIdentifer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudforceOneRequestPriorityPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudforceOneRequestPriorityPlainArgs $;

        public Builder() {
            $ = new GetCloudforceOneRequestPriorityPlainArgs();
        }

        public Builder(GetCloudforceOneRequestPriorityPlainArgs defaults) {
            $ = new GetCloudforceOneRequestPriorityPlainArgs(Objects.requireNonNull(defaults));
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
         * @param priorityIdentifer UUID
         * 
         * @return builder
         * 
         */
        public Builder priorityIdentifer(String priorityIdentifer) {
            $.priorityIdentifer = priorityIdentifer;
            return this;
        }

        public GetCloudforceOneRequestPriorityPlainArgs build() {
            if ($.accountIdentifier == null) {
                throw new MissingRequiredPropertyException("GetCloudforceOneRequestPriorityPlainArgs", "accountIdentifier");
            }
            if ($.priorityIdentifer == null) {
                throw new MissingRequiredPropertyException("GetCloudforceOneRequestPriorityPlainArgs", "priorityIdentifer");
            }
            return $;
        }
    }

}
