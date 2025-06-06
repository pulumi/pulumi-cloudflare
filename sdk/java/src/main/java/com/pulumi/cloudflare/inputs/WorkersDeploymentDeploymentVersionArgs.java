// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkersDeploymentDeploymentVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkersDeploymentDeploymentVersionArgs Empty = new WorkersDeploymentDeploymentVersionArgs();

    @Import(name="percentage")
    private @Nullable Output<Double> percentage;

    public Optional<Output<Double>> percentage() {
        return Optional.ofNullable(this.percentage);
    }

    @Import(name="versionId")
    private @Nullable Output<String> versionId;

    public Optional<Output<String>> versionId() {
        return Optional.ofNullable(this.versionId);
    }

    private WorkersDeploymentDeploymentVersionArgs() {}

    private WorkersDeploymentDeploymentVersionArgs(WorkersDeploymentDeploymentVersionArgs $) {
        this.percentage = $.percentage;
        this.versionId = $.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkersDeploymentDeploymentVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkersDeploymentDeploymentVersionArgs $;

        public Builder() {
            $ = new WorkersDeploymentDeploymentVersionArgs();
        }

        public Builder(WorkersDeploymentDeploymentVersionArgs defaults) {
            $ = new WorkersDeploymentDeploymentVersionArgs(Objects.requireNonNull(defaults));
        }

        public Builder percentage(@Nullable Output<Double> percentage) {
            $.percentage = percentage;
            return this;
        }

        public Builder percentage(Double percentage) {
            return percentage(Output.of(percentage));
        }

        public Builder versionId(@Nullable Output<String> versionId) {
            $.versionId = versionId;
            return this;
        }

        public Builder versionId(String versionId) {
            return versionId(Output.of(versionId));
        }

        public WorkersDeploymentDeploymentVersionArgs build() {
            return $;
        }
    }

}
