// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewayAppTypesAppType {
    /**
     * @return The identifier for the application type of this app.
     * 
     */
    private Integer applicationTypeId;
    /**
     * @return A short summary of the app type.
     * 
     */
    private String description;
    /**
     * @return The identifier for this app type. There is only one app type per ID.
     * 
     */
    private Integer id;
    /**
     * @return The name of the app type.
     * 
     */
    private String name;

    private GetGatewayAppTypesAppType() {}
    /**
     * @return The identifier for the application type of this app.
     * 
     */
    public Integer applicationTypeId() {
        return this.applicationTypeId;
    }
    /**
     * @return A short summary of the app type.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The identifier for this app type. There is only one app type per ID.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return The name of the app type.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayAppTypesAppType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer applicationTypeId;
        private String description;
        private Integer id;
        private String name;
        public Builder() {}
        public Builder(GetGatewayAppTypesAppType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationTypeId = defaults.applicationTypeId;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder applicationTypeId(Integer applicationTypeId) {
            if (applicationTypeId == null) {
              throw new MissingRequiredPropertyException("GetGatewayAppTypesAppType", "applicationTypeId");
            }
            this.applicationTypeId = applicationTypeId;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetGatewayAppTypesAppType", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGatewayAppTypesAppType", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetGatewayAppTypesAppType", "name");
            }
            this.name = name;
            return this;
        }
        public GetGatewayAppTypesAppType build() {
            final var _resultValue = new GetGatewayAppTypesAppType();
            _resultValue.applicationTypeId = applicationTypeId;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
