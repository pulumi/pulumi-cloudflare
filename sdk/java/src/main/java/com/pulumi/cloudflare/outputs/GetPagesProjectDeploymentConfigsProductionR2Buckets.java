// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPagesProjectDeploymentConfigsProductionR2Buckets {
    /**
     * @return Jurisdiction of the R2 bucket.
     * 
     */
    private String jurisdiction;
    /**
     * @return Name of the R2 bucket.
     * 
     */
    private String name;

    private GetPagesProjectDeploymentConfigsProductionR2Buckets() {}
    /**
     * @return Jurisdiction of the R2 bucket.
     * 
     */
    public String jurisdiction() {
        return this.jurisdiction;
    }
    /**
     * @return Name of the R2 bucket.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPagesProjectDeploymentConfigsProductionR2Buckets defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String jurisdiction;
        private String name;
        public Builder() {}
        public Builder(GetPagesProjectDeploymentConfigsProductionR2Buckets defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jurisdiction = defaults.jurisdiction;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder jurisdiction(String jurisdiction) {
            if (jurisdiction == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsProductionR2Buckets", "jurisdiction");
            }
            this.jurisdiction = jurisdiction;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPagesProjectDeploymentConfigsProductionR2Buckets", "name");
            }
            this.name = name;
            return this;
        }
        public GetPagesProjectDeploymentConfigsProductionR2Buckets build() {
            final var _resultValue = new GetPagesProjectDeploymentConfigsProductionR2Buckets();
            _resultValue.jurisdiction = jurisdiction;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
