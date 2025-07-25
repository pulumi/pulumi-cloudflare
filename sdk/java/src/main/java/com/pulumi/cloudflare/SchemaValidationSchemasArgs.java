// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class SchemaValidationSchemasArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchemaValidationSchemasArgs Empty = new SchemaValidationSchemasArgs();

    /**
     * The kind of the schema
     * Available values: &#34;openapi_v3&#34;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return The kind of the schema
     * Available values: &#34;openapi_v3&#34;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * A human-readable name for the schema
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A human-readable name for the schema
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The raw schema, e.g., the OpenAPI schema, either as JSON or YAML
     * 
     */
    @Import(name="source", required=true)
    private Output<String> source;

    /**
     * @return The raw schema, e.g., the OpenAPI schema, either as JSON or YAML
     * 
     */
    public Output<String> source() {
        return this.source;
    }

    /**
     * An indicator if this schema is enabled
     * 
     */
    @Import(name="validationEnabled", required=true)
    private Output<Boolean> validationEnabled;

    /**
     * @return An indicator if this schema is enabled
     * 
     */
    public Output<Boolean> validationEnabled() {
        return this.validationEnabled;
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

    private SchemaValidationSchemasArgs() {}

    private SchemaValidationSchemasArgs(SchemaValidationSchemasArgs $) {
        this.kind = $.kind;
        this.name = $.name;
        this.source = $.source;
        this.validationEnabled = $.validationEnabled;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaValidationSchemasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaValidationSchemasArgs $;

        public Builder() {
            $ = new SchemaValidationSchemasArgs();
        }

        public Builder(SchemaValidationSchemasArgs defaults) {
            $ = new SchemaValidationSchemasArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kind The kind of the schema
         * Available values: &#34;openapi_v3&#34;.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of the schema
         * Available values: &#34;openapi_v3&#34;.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name A human-readable name for the schema
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A human-readable name for the schema
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param source The raw schema, e.g., the OpenAPI schema, either as JSON or YAML
         * 
         * @return builder
         * 
         */
        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The raw schema, e.g., the OpenAPI schema, either as JSON or YAML
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param validationEnabled An indicator if this schema is enabled
         * 
         * @return builder
         * 
         */
        public Builder validationEnabled(Output<Boolean> validationEnabled) {
            $.validationEnabled = validationEnabled;
            return this;
        }

        /**
         * @param validationEnabled An indicator if this schema is enabled
         * 
         * @return builder
         * 
         */
        public Builder validationEnabled(Boolean validationEnabled) {
            return validationEnabled(Output.of(validationEnabled));
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

        public SchemaValidationSchemasArgs build() {
            if ($.kind == null) {
                throw new MissingRequiredPropertyException("SchemaValidationSchemasArgs", "kind");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("SchemaValidationSchemasArgs", "name");
            }
            if ($.source == null) {
                throw new MissingRequiredPropertyException("SchemaValidationSchemasArgs", "source");
            }
            if ($.validationEnabled == null) {
                throw new MissingRequiredPropertyException("SchemaValidationSchemasArgs", "validationEnabled");
            }
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("SchemaValidationSchemasArgs", "zoneId");
            }
            return $;
        }
    }

}
