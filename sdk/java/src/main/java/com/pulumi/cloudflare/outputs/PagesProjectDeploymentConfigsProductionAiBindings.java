// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PagesProjectDeploymentConfigsProductionAiBindings {
    private @Nullable String projectId;

    private PagesProjectDeploymentConfigsProductionAiBindings() {}
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PagesProjectDeploymentConfigsProductionAiBindings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String projectId;
        public Builder() {}
        public Builder(PagesProjectDeploymentConfigsProductionAiBindings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectId = defaults.projectId;
        }

        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {

            this.projectId = projectId;
            return this;
        }
        public PagesProjectDeploymentConfigsProductionAiBindings build() {
            final var _resultValue = new PagesProjectDeploymentConfigsProductionAiBindings();
            _resultValue.projectId = projectId;
            return _resultValue;
        }
    }
}
