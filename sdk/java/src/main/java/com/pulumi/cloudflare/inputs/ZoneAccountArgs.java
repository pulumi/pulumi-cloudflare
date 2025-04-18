// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZoneAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZoneAccountArgs Empty = new ZoneAccountArgs();

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

    private ZoneAccountArgs() {}

    private ZoneAccountArgs(ZoneAccountArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZoneAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZoneAccountArgs $;

        public Builder() {
            $ = new ZoneAccountArgs();
        }

        public Builder(ZoneAccountArgs defaults) {
            $ = new ZoneAccountArgs(Objects.requireNonNull(defaults));
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

        public ZoneAccountArgs build() {
            return $;
        }
    }

}
