// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SchemaValidationSchemasState extends com.pulumi.resources.ResourceArgs {

    public static final SchemaValidationSchemasState Empty = new SchemaValidationSchemasState();

    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The kind of the schema
     * Available values: &#34;openapi_v3&#34;.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return The kind of the schema
     * Available values: &#34;openapi_v3&#34;.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * A human-readable name for the schema
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A human-readable name for the schema
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A unique identifier of this schema
     * 
     */
    @Import(name="schemaId")
    private @Nullable Output<String> schemaId;

    /**
     * @return A unique identifier of this schema
     * 
     */
    public Optional<Output<String>> schemaId() {
        return Optional.ofNullable(this.schemaId);
    }

    /**
     * The raw schema, e.g., the OpenAPI schema, either as JSON or YAML
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return The raw schema, e.g., the OpenAPI schema, either as JSON or YAML
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * An indicator if this schema is enabled
     * 
     */
    @Import(name="validationEnabled")
    private @Nullable Output<Boolean> validationEnabled;

    /**
     * @return An indicator if this schema is enabled
     * 
     */
    public Optional<Output<Boolean>> validationEnabled() {
        return Optional.ofNullable(this.validationEnabled);
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

    private SchemaValidationSchemasState() {}

    private SchemaValidationSchemasState(SchemaValidationSchemasState $) {
        this.createdAt = $.createdAt;
        this.kind = $.kind;
        this.name = $.name;
        this.schemaId = $.schemaId;
        this.source = $.source;
        this.validationEnabled = $.validationEnabled;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaValidationSchemasState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaValidationSchemasState $;

        public Builder() {
            $ = new SchemaValidationSchemasState();
        }

        public Builder(SchemaValidationSchemasState defaults) {
            $ = new SchemaValidationSchemasState(Objects.requireNonNull(defaults));
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param kind The kind of the schema
         * Available values: &#34;openapi_v3&#34;.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
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
        public Builder name(@Nullable Output<String> name) {
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
         * @param schemaId A unique identifier of this schema
         * 
         * @return builder
         * 
         */
        public Builder schemaId(@Nullable Output<String> schemaId) {
            $.schemaId = schemaId;
            return this;
        }

        /**
         * @param schemaId A unique identifier of this schema
         * 
         * @return builder
         * 
         */
        public Builder schemaId(String schemaId) {
            return schemaId(Output.of(schemaId));
        }

        /**
         * @param source The raw schema, e.g., the OpenAPI schema, either as JSON or YAML
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
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
        public Builder validationEnabled(@Nullable Output<Boolean> validationEnabled) {
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

        public SchemaValidationSchemasState build() {
            return $;
        }
    }

}
