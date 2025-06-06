// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiShieldSchemaValidationSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiShieldSchemaValidationSettingsArgs Empty = new ApiShieldSchemaValidationSettingsArgs();

    /**
     * The default mitigation action used when there is no mitigation action defined on the operation
     * 
     */
    @Import(name="validationDefaultMitigationAction", required=true)
    private Output<String> validationDefaultMitigationAction;

    /**
     * @return The default mitigation action used when there is no mitigation action defined on the operation
     * 
     */
    public Output<String> validationDefaultMitigationAction() {
        return this.validationDefaultMitigationAction;
    }

    /**
     * When set, this overrides both zone level and operation level mitigation actions. - `none` will skip running schema
     * validation entirely for the request - `null` indicates that no override is in place To clear any override, use the
     * special value `disable_override` or `null` Available values: &#34;none&#34;, &#34;disable_override&#34;.
     * 
     */
    @Import(name="validationOverrideMitigationAction")
    private @Nullable Output<String> validationOverrideMitigationAction;

    /**
     * @return When set, this overrides both zone level and operation level mitigation actions. - `none` will skip running schema
     * validation entirely for the request - `null` indicates that no override is in place To clear any override, use the
     * special value `disable_override` or `null` Available values: &#34;none&#34;, &#34;disable_override&#34;.
     * 
     */
    public Optional<Output<String>> validationOverrideMitigationAction() {
        return Optional.ofNullable(this.validationOverrideMitigationAction);
    }

    /**
     * Identifier.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return Identifier.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private ApiShieldSchemaValidationSettingsArgs() {}

    private ApiShieldSchemaValidationSettingsArgs(ApiShieldSchemaValidationSettingsArgs $) {
        this.validationDefaultMitigationAction = $.validationDefaultMitigationAction;
        this.validationOverrideMitigationAction = $.validationOverrideMitigationAction;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiShieldSchemaValidationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiShieldSchemaValidationSettingsArgs $;

        public Builder() {
            $ = new ApiShieldSchemaValidationSettingsArgs();
        }

        public Builder(ApiShieldSchemaValidationSettingsArgs defaults) {
            $ = new ApiShieldSchemaValidationSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param validationDefaultMitigationAction The default mitigation action used when there is no mitigation action defined on the operation
         * 
         * @return builder
         * 
         */
        public Builder validationDefaultMitigationAction(Output<String> validationDefaultMitigationAction) {
            $.validationDefaultMitigationAction = validationDefaultMitigationAction;
            return this;
        }

        /**
         * @param validationDefaultMitigationAction The default mitigation action used when there is no mitigation action defined on the operation
         * 
         * @return builder
         * 
         */
        public Builder validationDefaultMitigationAction(String validationDefaultMitigationAction) {
            return validationDefaultMitigationAction(Output.of(validationDefaultMitigationAction));
        }

        /**
         * @param validationOverrideMitigationAction When set, this overrides both zone level and operation level mitigation actions. - `none` will skip running schema
         * validation entirely for the request - `null` indicates that no override is in place To clear any override, use the
         * special value `disable_override` or `null` Available values: &#34;none&#34;, &#34;disable_override&#34;.
         * 
         * @return builder
         * 
         */
        public Builder validationOverrideMitigationAction(@Nullable Output<String> validationOverrideMitigationAction) {
            $.validationOverrideMitigationAction = validationOverrideMitigationAction;
            return this;
        }

        /**
         * @param validationOverrideMitigationAction When set, this overrides both zone level and operation level mitigation actions. - `none` will skip running schema
         * validation entirely for the request - `null` indicates that no override is in place To clear any override, use the
         * special value `disable_override` or `null` Available values: &#34;none&#34;, &#34;disable_override&#34;.
         * 
         * @return builder
         * 
         */
        public Builder validationOverrideMitigationAction(String validationOverrideMitigationAction) {
            return validationOverrideMitigationAction(Output.of(validationOverrideMitigationAction));
        }

        /**
         * @param zoneId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ApiShieldSchemaValidationSettingsArgs build() {
            if ($.validationDefaultMitigationAction == null) {
                throw new MissingRequiredPropertyException("ApiShieldSchemaValidationSettingsArgs", "validationDefaultMitigationAction");
            }
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("ApiShieldSchemaValidationSettingsArgs", "zoneId");
            }
            return $;
        }
    }

}
