// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PagesProjectDeploymentConfigsProductionPlacementArgs extends com.pulumi.resources.ResourceArgs {

    public static final PagesProjectDeploymentConfigsProductionPlacementArgs Empty = new PagesProjectDeploymentConfigsProductionPlacementArgs();

    /**
     * Placement mode.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return Placement mode.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    private PagesProjectDeploymentConfigsProductionPlacementArgs() {}

    private PagesProjectDeploymentConfigsProductionPlacementArgs(PagesProjectDeploymentConfigsProductionPlacementArgs $) {
        this.mode = $.mode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PagesProjectDeploymentConfigsProductionPlacementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PagesProjectDeploymentConfigsProductionPlacementArgs $;

        public Builder() {
            $ = new PagesProjectDeploymentConfigsProductionPlacementArgs();
        }

        public Builder(PagesProjectDeploymentConfigsProductionPlacementArgs defaults) {
            $ = new PagesProjectDeploymentConfigsProductionPlacementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mode Placement mode.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Placement mode.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public PagesProjectDeploymentConfigsProductionPlacementArgs build() {
            return $;
        }
    }

}
