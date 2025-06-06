// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPagesProjectDeploymentConfigsPreviewServices {
    /**
     * @return The entrypoint to bind to.
     * 
     */
    private String entrypoint;
    /**
     * @return The Service environment.
     * 
     */
    private String environment;
    /**
     * @return The Service name.
     * 
     */
    private String service;

    private GetPagesProjectDeploymentConfigsPreviewServices() {}
    /**
     * @return The entrypoint to bind to.
     * 
     */
    public String entrypoint() {
        return this.entrypoint;
    }
    /**
     * @return The Service environment.
     * 
     */
    public String environment() {
        return this.environment;
    }
    /**
     * @return The Service name.
     * 
     */
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPagesProjectDeploymentConfigsPreviewServices defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String entrypoint;
        private String environment;
        private String service;
        public Builder() {}
        public Builder(GetPagesProjectDeploymentConfigsPreviewServices defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entrypoint = defaults.entrypoint;
    	      this.environment = defaults.environment;
    	      this.service = defaults.service;
        }

        @CustomType.Setter
        public Builder entrypoint(String entrypoint) {
            if (entrypoint == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsPreviewServices", "entrypoint");
            }
            this.entrypoint = entrypoint;
            return this;
        }
        @CustomType.Setter
        public Builder environment(String environment) {
            if (environment == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsPreviewServices", "environment");
            }
            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder service(String service) {
            if (service == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsPreviewServices", "service");
            }
            this.service = service;
            return this;
        }
        public GetPagesProjectDeploymentConfigsPreviewServices build() {
            final var _resultValue = new GetPagesProjectDeploymentConfigsPreviewServices();
            _resultValue.entrypoint = entrypoint;
            _resultValue.environment = environment;
            _resultValue.service = service;
            return _resultValue;
        }
    }
}
