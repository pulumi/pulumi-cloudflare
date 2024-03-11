// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDlpDatasetsDataset {
    private String description;
    private String id;
    private String name;
    private Boolean secret;
    private String status;

    private GetDlpDatasetsDataset() {}
    public String description() {
        return this.description;
    }
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public Boolean secret() {
        return this.secret;
    }
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDlpDatasetsDataset defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private String name;
        private Boolean secret;
        private String status;
        public Builder() {}
        public Builder(GetDlpDatasetsDataset defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.secret = defaults.secret;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetDlpDatasetsDataset", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDlpDatasetsDataset", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDlpDatasetsDataset", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder secret(Boolean secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("GetDlpDatasetsDataset", "secret");
            }
            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetDlpDatasetsDataset", "status");
            }
            this.status = status;
            return this;
        }
        public GetDlpDatasetsDataset build() {
            final var _resultValue = new GetDlpDatasetsDataset();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.secret = secret;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}