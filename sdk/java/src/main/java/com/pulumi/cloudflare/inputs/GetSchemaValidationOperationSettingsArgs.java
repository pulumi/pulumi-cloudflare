// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSchemaValidationOperationSettingsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaValidationOperationSettingsArgs Empty = new GetSchemaValidationOperationSettingsArgs();

    @Import(name="operationId", required=true)
    private Output<String> operationId;

    public Output<String> operationId() {
        return this.operationId;
    }

    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    public Output<String> zoneId() {
        return this.zoneId;
    }

    private GetSchemaValidationOperationSettingsArgs() {}

    private GetSchemaValidationOperationSettingsArgs(GetSchemaValidationOperationSettingsArgs $) {
        this.operationId = $.operationId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaValidationOperationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaValidationOperationSettingsArgs $;

        public Builder() {
            $ = new GetSchemaValidationOperationSettingsArgs();
        }

        public Builder(GetSchemaValidationOperationSettingsArgs defaults) {
            $ = new GetSchemaValidationOperationSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder operationId(Output<String> operationId) {
            $.operationId = operationId;
            return this;
        }

        public Builder operationId(String operationId) {
            return operationId(Output.of(operationId));
        }

        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public GetSchemaValidationOperationSettingsArgs build() {
            if ($.operationId == null) {
                throw new MissingRequiredPropertyException("GetSchemaValidationOperationSettingsArgs", "operationId");
            }
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetSchemaValidationOperationSettingsArgs", "zoneId");
            }
            return $;
        }
    }

}
