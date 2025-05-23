// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPagesProjectDeploymentConfigsProductionMtlsCertificates {
    private String certificateId;

    private GetPagesProjectDeploymentConfigsProductionMtlsCertificates() {}
    public String certificateId() {
        return this.certificateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPagesProjectDeploymentConfigsProductionMtlsCertificates defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String certificateId;
        public Builder() {}
        public Builder(GetPagesProjectDeploymentConfigsProductionMtlsCertificates defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateId = defaults.certificateId;
        }

        @CustomType.Setter
        public Builder certificateId(String certificateId) {
            if (certificateId == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsProductionMtlsCertificates", "certificateId");
            }
            this.certificateId = certificateId;
            return this;
        }
        public GetPagesProjectDeploymentConfigsProductionMtlsCertificates build() {
            final var _resultValue = new GetPagesProjectDeploymentConfigsProductionMtlsCertificates();
            _resultValue.certificateId = certificateId;
            return _resultValue;
        }
    }
}
