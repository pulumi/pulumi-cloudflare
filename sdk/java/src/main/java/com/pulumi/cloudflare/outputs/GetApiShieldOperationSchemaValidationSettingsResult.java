// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApiShieldOperationSchemaValidationSettingsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String mitigationAction;
    private String operationId;
    private String zoneId;

    private GetApiShieldOperationSchemaValidationSettingsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String mitigationAction() {
        return this.mitigationAction;
    }
    public String operationId() {
        return this.operationId;
    }
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiShieldOperationSchemaValidationSettingsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String mitigationAction;
        private String operationId;
        private String zoneId;
        public Builder() {}
        public Builder(GetApiShieldOperationSchemaValidationSettingsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.mitigationAction = defaults.mitigationAction;
    	      this.operationId = defaults.operationId;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetApiShieldOperationSchemaValidationSettingsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mitigationAction(String mitigationAction) {
            if (mitigationAction == null) {
              throw new MissingRequiredPropertyException("GetApiShieldOperationSchemaValidationSettingsResult", "mitigationAction");
            }
            this.mitigationAction = mitigationAction;
            return this;
        }
        @CustomType.Setter
        public Builder operationId(String operationId) {
            if (operationId == null) {
              throw new MissingRequiredPropertyException("GetApiShieldOperationSchemaValidationSettingsResult", "operationId");
            }
            this.operationId = operationId;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("GetApiShieldOperationSchemaValidationSettingsResult", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        public GetApiShieldOperationSchemaValidationSettingsResult build() {
            final var _resultValue = new GetApiShieldOperationSchemaValidationSettingsResult();
            _resultValue.id = id;
            _resultValue.mitigationAction = mitigationAction;
            _resultValue.operationId = operationId;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
