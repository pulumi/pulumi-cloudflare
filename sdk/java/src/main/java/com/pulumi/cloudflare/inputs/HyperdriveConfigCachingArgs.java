// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HyperdriveConfigCachingArgs extends com.pulumi.resources.ResourceArgs {

    public static final HyperdriveConfigCachingArgs Empty = new HyperdriveConfigCachingArgs();

    /**
     * Disable caching for this Hyperdrive configuration.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Disable caching for this Hyperdrive configuration.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    private HyperdriveConfigCachingArgs() {}

    private HyperdriveConfigCachingArgs(HyperdriveConfigCachingArgs $) {
        this.disabled = $.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HyperdriveConfigCachingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HyperdriveConfigCachingArgs $;

        public Builder() {
            $ = new HyperdriveConfigCachingArgs();
        }

        public Builder(HyperdriveConfigCachingArgs defaults) {
            $ = new HyperdriveConfigCachingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disabled Disable caching for this Hyperdrive configuration.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Disable caching for this Hyperdrive configuration.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        public HyperdriveConfigCachingArgs build() {
            return $;
        }
    }

}
