// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AccessGroupExcludeIpListArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessGroupExcludeIpListArgs Empty = new AccessGroupExcludeIpListArgs();

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

    private AccessGroupExcludeIpListArgs() {}

    private AccessGroupExcludeIpListArgs(AccessGroupExcludeIpListArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessGroupExcludeIpListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessGroupExcludeIpListArgs $;

        public Builder() {
            $ = new AccessGroupExcludeIpListArgs();
        }

        public Builder(AccessGroupExcludeIpListArgs defaults) {
            $ = new AccessGroupExcludeIpListArgs(Objects.requireNonNull(defaults));
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

        public AccessGroupExcludeIpListArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("AccessGroupExcludeIpListArgs", "id");
            }
            return $;
        }
    }

}
