// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SchemaValidationOperationSettingsState extends com.pulumi.resources.ResourceArgs {

    public static final SchemaValidationOperationSettingsState Empty = new SchemaValidationOperationSettingsState();

    /**
     * When set, this applies a mitigation action to this operation - `&#34;log&#34;` - log request when request does not conform to
     * schema for this operation - `&#34;block&#34;` - deny access to the site when request does not conform to schema for this
     * operation - `&#34;none&#34;` - will skip mitigation for this operation - `null` - clears any mitigation action Available values:
     * &#34;log&#34;, &#34;block&#34;, &#34;none&#34;.
     * 
     */
    @Import(name="mitigationAction")
    private @Nullable Output<String> mitigationAction;

    /**
     * @return When set, this applies a mitigation action to this operation - `&#34;log&#34;` - log request when request does not conform to
     * schema for this operation - `&#34;block&#34;` - deny access to the site when request does not conform to schema for this
     * operation - `&#34;none&#34;` - will skip mitigation for this operation - `null` - clears any mitigation action Available values:
     * &#34;log&#34;, &#34;block&#34;, &#34;none&#34;.
     * 
     */
    public Optional<Output<String>> mitigationAction() {
        return Optional.ofNullable(this.mitigationAction);
    }

    /**
     * UUID.
     * 
     */
    @Import(name="operationId")
    private @Nullable Output<String> operationId;

    /**
     * @return UUID.
     * 
     */
    public Optional<Output<String>> operationId() {
        return Optional.ofNullable(this.operationId);
    }

    /**
     * Identifier.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return Identifier.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private SchemaValidationOperationSettingsState() {}

    private SchemaValidationOperationSettingsState(SchemaValidationOperationSettingsState $) {
        this.mitigationAction = $.mitigationAction;
        this.operationId = $.operationId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaValidationOperationSettingsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaValidationOperationSettingsState $;

        public Builder() {
            $ = new SchemaValidationOperationSettingsState();
        }

        public Builder(SchemaValidationOperationSettingsState defaults) {
            $ = new SchemaValidationOperationSettingsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param mitigationAction When set, this applies a mitigation action to this operation - `&#34;log&#34;` - log request when request does not conform to
         * schema for this operation - `&#34;block&#34;` - deny access to the site when request does not conform to schema for this
         * operation - `&#34;none&#34;` - will skip mitigation for this operation - `null` - clears any mitigation action Available values:
         * &#34;log&#34;, &#34;block&#34;, &#34;none&#34;.
         * 
         * @return builder
         * 
         */
        public Builder mitigationAction(@Nullable Output<String> mitigationAction) {
            $.mitigationAction = mitigationAction;
            return this;
        }

        /**
         * @param mitigationAction When set, this applies a mitigation action to this operation - `&#34;log&#34;` - log request when request does not conform to
         * schema for this operation - `&#34;block&#34;` - deny access to the site when request does not conform to schema for this
         * operation - `&#34;none&#34;` - will skip mitigation for this operation - `null` - clears any mitigation action Available values:
         * &#34;log&#34;, &#34;block&#34;, &#34;none&#34;.
         * 
         * @return builder
         * 
         */
        public Builder mitigationAction(String mitigationAction) {
            return mitigationAction(Output.of(mitigationAction));
        }

        /**
         * @param operationId UUID.
         * 
         * @return builder
         * 
         */
        public Builder operationId(@Nullable Output<String> operationId) {
            $.operationId = operationId;
            return this;
        }

        /**
         * @param operationId UUID.
         * 
         * @return builder
         * 
         */
        public Builder operationId(String operationId) {
            return operationId(Output.of(operationId));
        }

        /**
         * @param zoneId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
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

        public SchemaValidationOperationSettingsState build() {
            return $;
        }
    }

}
