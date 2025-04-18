// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.PagesProjectDeploymentConfigsPreview;
import com.pulumi.cloudflare.outputs.PagesProjectDeploymentConfigsProduction;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PagesProjectDeploymentConfigs {
    /**
     * @return Configs for preview deploys.
     * 
     */
    private @Nullable PagesProjectDeploymentConfigsPreview preview;
    /**
     * @return Configs for production deploys.
     * 
     */
    private @Nullable PagesProjectDeploymentConfigsProduction production;

    private PagesProjectDeploymentConfigs() {}
    /**
     * @return Configs for preview deploys.
     * 
     */
    public Optional<PagesProjectDeploymentConfigsPreview> preview() {
        return Optional.ofNullable(this.preview);
    }
    /**
     * @return Configs for production deploys.
     * 
     */
    public Optional<PagesProjectDeploymentConfigsProduction> production() {
        return Optional.ofNullable(this.production);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PagesProjectDeploymentConfigs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PagesProjectDeploymentConfigsPreview preview;
        private @Nullable PagesProjectDeploymentConfigsProduction production;
        public Builder() {}
        public Builder(PagesProjectDeploymentConfigs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preview = defaults.preview;
    	      this.production = defaults.production;
        }

        @CustomType.Setter
        public Builder preview(@Nullable PagesProjectDeploymentConfigsPreview preview) {

            this.preview = preview;
            return this;
        }
        @CustomType.Setter
        public Builder production(@Nullable PagesProjectDeploymentConfigsProduction production) {

            this.production = production;
            return this;
        }
        public PagesProjectDeploymentConfigs build() {
            final var _resultValue = new PagesProjectDeploymentConfigs();
            _resultValue.preview = preview;
            _resultValue.production = production;
            return _resultValue;
        }
    }
}
