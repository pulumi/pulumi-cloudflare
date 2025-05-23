// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AccessGroupIncludeLoginMethodArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessGroupIncludeLoginMethodArgs Empty = new AccessGroupIncludeLoginMethodArgs();

    /**
     * The ID of an identity provider.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of an identity provider.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private AccessGroupIncludeLoginMethodArgs() {}

    private AccessGroupIncludeLoginMethodArgs(AccessGroupIncludeLoginMethodArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessGroupIncludeLoginMethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessGroupIncludeLoginMethodArgs $;

        public Builder() {
            $ = new AccessGroupIncludeLoginMethodArgs();
        }

        public Builder(AccessGroupIncludeLoginMethodArgs defaults) {
            $ = new AccessGroupIncludeLoginMethodArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of an identity provider.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of an identity provider.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public AccessGroupIncludeLoginMethodArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("AccessGroupIncludeLoginMethodArgs", "id");
            }
            return $;
        }
    }

}
