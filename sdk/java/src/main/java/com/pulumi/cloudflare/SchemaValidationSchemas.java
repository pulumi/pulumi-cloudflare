// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.SchemaValidationSchemasArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.SchemaValidationSchemasState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.SchemaValidationSchemas;
 * import com.pulumi.cloudflare.SchemaValidationSchemasArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleSchemaValidationSchemas = new SchemaValidationSchemas("exampleSchemaValidationSchemas", SchemaValidationSchemasArgs.builder()
 *             .zoneId("023e105f4ecef8ad9ca31a8372d0c353")
 *             .kind("openapi_v3")
 *             .name("petstore schema")
 *             .source("<schema file contents>")
 *             .validationEnabled(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import cloudflare:index/schemaValidationSchemas:SchemaValidationSchemas example &#39;&lt;zone_id&gt;/&lt;schema_id&gt;&#39;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/schemaValidationSchemas:SchemaValidationSchemas")
public class SchemaValidationSchemas extends com.pulumi.resources.CustomResource {
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The kind of the schema
     * Available values: &#34;openapi_v3&#34;.
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
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
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A human-readable name for the schema
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A unique identifier of this schema
     * 
     */
    @Export(name="schemaId", refs={String.class}, tree="[0]")
    private Output<String> schemaId;

    /**
     * @return A unique identifier of this schema
     * 
     */
    public Output<String> schemaId() {
        return this.schemaId;
    }
    /**
     * The raw schema, e.g., the OpenAPI schema, either as JSON or YAML
     * 
     */
    @Export(name="source", refs={String.class}, tree="[0]")
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
    @Export(name="validationEnabled", refs={Boolean.class}, tree="[0]")
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
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return Identifier.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SchemaValidationSchemas(java.lang.String name) {
        this(name, SchemaValidationSchemasArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SchemaValidationSchemas(java.lang.String name, SchemaValidationSchemasArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SchemaValidationSchemas(java.lang.String name, SchemaValidationSchemasArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/schemaValidationSchemas:SchemaValidationSchemas", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SchemaValidationSchemas(java.lang.String name, Output<java.lang.String> id, @Nullable SchemaValidationSchemasState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/schemaValidationSchemas:SchemaValidationSchemas", name, state, makeResourceOptions(options, id), false);
    }

    private static SchemaValidationSchemasArgs makeArgs(SchemaValidationSchemasArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SchemaValidationSchemasArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SchemaValidationSchemas get(java.lang.String name, Output<java.lang.String> id, @Nullable SchemaValidationSchemasState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SchemaValidationSchemas(name, id, state, options);
    }
}
