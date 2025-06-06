// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AccessApplicationPolicyExcludeIpListArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessApplicationPolicyExcludeIpListArgs Empty = new AccessApplicationPolicyExcludeIpListArgs();

    /**
     * The ID of a previously created IP list.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of a previously created IP list.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private AccessApplicationPolicyExcludeIpListArgs() {}

    private AccessApplicationPolicyExcludeIpListArgs(AccessApplicationPolicyExcludeIpListArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessApplicationPolicyExcludeIpListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessApplicationPolicyExcludeIpListArgs $;

        public Builder() {
            $ = new AccessApplicationPolicyExcludeIpListArgs();
        }

        public Builder(AccessApplicationPolicyExcludeIpListArgs defaults) {
            $ = new AccessApplicationPolicyExcludeIpListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of a previously created IP list.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of a previously created IP list.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public AccessApplicationPolicyExcludeIpListArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("AccessApplicationPolicyExcludeIpListArgs", "id");
            }
            return $;
        }
    }

}
