// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.ManagedTransformsArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.ManagedTransformsState;
import com.pulumi.cloudflare.outputs.ManagedTransformsManagedRequestHeader;
import com.pulumi.cloudflare.outputs.ManagedTransformsManagedResponseHeader;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
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
 * import com.pulumi.cloudflare.ManagedTransforms;
 * import com.pulumi.cloudflare.ManagedTransformsArgs;
 * import com.pulumi.cloudflare.inputs.ManagedTransformsManagedRequestHeaderArgs;
 * import com.pulumi.cloudflare.inputs.ManagedTransformsManagedResponseHeaderArgs;
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
 *         var exampleManagedTransforms = new ManagedTransforms("exampleManagedTransforms", ManagedTransformsArgs.builder()
 *             .zoneId("9f1839b6152d298aca64c4e906b6d074")
 *             .managedRequestHeaders(ManagedTransformsManagedRequestHeaderArgs.builder()
 *                 .id("add_bot_protection_headers")
 *                 .enabled(true)
 *                 .build())
 *             .managedResponseHeaders(ManagedTransformsManagedResponseHeaderArgs.builder()
 *                 .id("add_security_headers")
 *                 .enabled(true)
 *                 .build())
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
 * $ pulumi import cloudflare:index/managedTransforms:ManagedTransforms example &#39;&lt;zone_id&gt;&#39;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/managedTransforms:ManagedTransforms")
public class ManagedTransforms extends com.pulumi.resources.CustomResource {
    /**
     * The list of Managed Request Transforms.
     * 
     */
    @Export(name="managedRequestHeaders", refs={List.class,ManagedTransformsManagedRequestHeader.class}, tree="[0,1]")
    private Output<List<ManagedTransformsManagedRequestHeader>> managedRequestHeaders;

    /**
     * @return The list of Managed Request Transforms.
     * 
     */
    public Output<List<ManagedTransformsManagedRequestHeader>> managedRequestHeaders() {
        return this.managedRequestHeaders;
    }
    /**
     * The list of Managed Response Transforms.
     * 
     */
    @Export(name="managedResponseHeaders", refs={List.class,ManagedTransformsManagedResponseHeader.class}, tree="[0,1]")
    private Output<List<ManagedTransformsManagedResponseHeader>> managedResponseHeaders;

    /**
     * @return The list of Managed Response Transforms.
     * 
     */
    public Output<List<ManagedTransformsManagedResponseHeader>> managedResponseHeaders() {
        return this.managedResponseHeaders;
    }
    /**
     * The unique ID of the zone.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The unique ID of the zone.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedTransforms(java.lang.String name) {
        this(name, ManagedTransformsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedTransforms(java.lang.String name, ManagedTransformsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedTransforms(java.lang.String name, ManagedTransformsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/managedTransforms:ManagedTransforms", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ManagedTransforms(java.lang.String name, Output<java.lang.String> id, @Nullable ManagedTransformsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/managedTransforms:ManagedTransforms", name, state, makeResourceOptions(options, id), false);
    }

    private static ManagedTransformsArgs makeArgs(ManagedTransformsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ManagedTransformsArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("cloudflare:index/managedHeaders:ManagedHeaders").build())
            ))
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
    public static ManagedTransforms get(java.lang.String name, Output<java.lang.String> id, @Nullable ManagedTransformsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedTransforms(name, id, state, options);
    }
}
