// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AccessPolicyRequireGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPolicyRequireGroupArgs Empty = new AccessPolicyRequireGroupArgs();

    /**
     * The ID of a previously created Access group.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of a previously created Access group.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private AccessPolicyRequireGroupArgs() {}

    private AccessPolicyRequireGroupArgs(AccessPolicyRequireGroupArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPolicyRequireGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPolicyRequireGroupArgs $;

        public Builder() {
            $ = new AccessPolicyRequireGroupArgs();
        }

        public Builder(AccessPolicyRequireGroupArgs defaults) {
            $ = new AccessPolicyRequireGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of a previously created Access group.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of a previously created Access group.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public AccessPolicyRequireGroupArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("AccessPolicyRequireGroupArgs", "id");
            }
            return $;
        }
    }

}
