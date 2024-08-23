// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.WorkersRouteArgs;
import com.pulumi.cloudflare.inputs.WorkersRouteState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare worker route resource. A route will also require a `cloudflare.WorkerScript`.
 * 
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
 * import com.pulumi.cloudflare.WorkersScript;
 * import com.pulumi.cloudflare.WorkersRoute;
 * import com.pulumi.cloudflare.WorkersRouteArgs;
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
 *         var myScript = new WorkersScript("myScript");
 * 
 *         // Runs the specified worker script for all URLs that match `example.com/*`
 *         var myRoute = new WorkersRoute("myRoute", WorkersRouteArgs.builder()
 *             .zoneId("0da42c8d2132a9ddaf714f9e7c920711")
 *             .pattern("example.com/*")
 *             .scriptName(myScript.name())
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
 * $ pulumi import cloudflare:index/workersRoute:WorkersRoute example &lt;zone_id&gt;/&lt;route_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/workersRoute:WorkersRoute")
public class WorkersRoute extends com.pulumi.resources.CustomResource {
    /**
     * The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
     * 
     */
    @Export(name="pattern", refs={String.class}, tree="[0]")
    private Output<String> pattern;

    /**
     * @return The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
     * 
     */
    public Output<String> pattern() {
        return this.pattern;
    }
    /**
     * Worker script name to invoke for requests that match the route pattern.
     * 
     */
    @Export(name="scriptName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scriptName;

    /**
     * @return Worker script name to invoke for requests that match the route pattern.
     * 
     */
    public Output<Optional<String>> scriptName() {
        return Codegen.optional(this.scriptName);
    }
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkersRoute(java.lang.String name) {
        this(name, WorkersRouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkersRoute(java.lang.String name, WorkersRouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkersRoute(java.lang.String name, WorkersRouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workersRoute:WorkersRoute", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private WorkersRoute(java.lang.String name, Output<java.lang.String> id, @Nullable WorkersRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workersRoute:WorkersRoute", name, state, makeResourceOptions(options, id), false);
    }

    private static WorkersRouteArgs makeArgs(WorkersRouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? WorkersRouteArgs.Empty : args;
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
    public static WorkersRoute get(java.lang.String name, Output<java.lang.String> id, @Nullable WorkersRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkersRoute(name, id, state, options);
    }
}