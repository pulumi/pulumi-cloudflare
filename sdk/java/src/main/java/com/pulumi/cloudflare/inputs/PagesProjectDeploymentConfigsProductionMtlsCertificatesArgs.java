// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PagesProjectDeploymentConfigsProductionMtlsCertificatesArgs extends com.pulumi.resources.ResourceArgs {

    public static final PagesProjectDeploymentConfigsProductionMtlsCertificatesArgs Empty = new PagesProjectDeploymentConfigsProductionMtlsCertificatesArgs();

    @Import(name="certificateId")
    private @Nullable Output<String> certificateId;

    public Optional<Output<String>> certificateId() {
        return Optional.ofNullable(this.certificateId);
    }

    private PagesProjectDeploymentConfigsProductionMtlsCertificatesArgs() {}

    private PagesProjectDeploymentConfigsProductionMtlsCertificatesArgs(PagesProjectDeploymentConfigsProductionMtlsCertificatesArgs $) {
        this.certificateId = $.certificateId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PagesProjectDeploymentConfigsProductionMtlsCertificatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PagesProjectDeploymentConfigsProductionMtlsCertificatesArgs $;

        public Builder() {
            $ = new PagesProjectDeploymentConfigsProductionMtlsCertificatesArgs();
        }

        public Builder(PagesProjectDeploymentConfigsProductionMtlsCertificatesArgs defaults) {
            $ = new PagesProjectDeploymentConfigsProductionMtlsCertificatesArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificateId(@Nullable Output<String> certificateId) {
            $.certificateId = certificateId;
            return this;
        }

        public Builder certificateId(String certificateId) {
            return certificateId(Output.of(certificateId));
        }

        public PagesProjectDeploymentConfigsProductionMtlsCertificatesArgs build() {
            return $;
        }
    }

}
