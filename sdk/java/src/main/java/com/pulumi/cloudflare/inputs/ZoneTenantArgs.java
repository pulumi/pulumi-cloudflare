// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZoneTenantArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZoneTenantArgs Empty = new ZoneTenantArgs();

    /**
     * Identifier
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Identifier
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the Tenant account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Tenant account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ZoneTenantArgs() {}

    private ZoneTenantArgs(ZoneTenantArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZoneTenantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZoneTenantArgs $;

        public Builder() {
            $ = new ZoneTenantArgs();
        }

        public Builder(ZoneTenantArgs defaults) {
            $ = new ZoneTenantArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Identifier
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Identifier
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the Tenant account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Tenant account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ZoneTenantArgs build() {
            return $;
        }
    }

}
