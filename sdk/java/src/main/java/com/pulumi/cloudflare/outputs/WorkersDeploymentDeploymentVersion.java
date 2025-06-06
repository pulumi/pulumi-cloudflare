// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkersDeploymentDeploymentVersion {
    private @Nullable Double percentage;
    private @Nullable String versionId;

    private WorkersDeploymentDeploymentVersion() {}
    public Optional<Double> percentage() {
        return Optional.ofNullable(this.percentage);
    }
    public Optional<String> versionId() {
        return Optional.ofNullable(this.versionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkersDeploymentDeploymentVersion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Double percentage;
        private @Nullable String versionId;
        public Builder() {}
        public Builder(WorkersDeploymentDeploymentVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percentage = defaults.percentage;
    	      this.versionId = defaults.versionId;
        }

        @CustomType.Setter
        public Builder percentage(@Nullable Double percentage) {

            this.percentage = percentage;
            return this;
        }
        @CustomType.Setter
        public Builder versionId(@Nullable String versionId) {

            this.versionId = versionId;
            return this;
        }
        public WorkersDeploymentDeploymentVersion build() {
            final var _resultValue = new WorkersDeploymentDeploymentVersion();
            _resultValue.percentage = percentage;
            _resultValue.versionId = versionId;
            return _resultValue;
        }
    }
}
