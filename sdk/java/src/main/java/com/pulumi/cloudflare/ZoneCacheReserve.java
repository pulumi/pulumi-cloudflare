// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.ZoneCacheReserveArgs;
import com.pulumi.cloudflare.inputs.ZoneCacheReserveState;
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
 * import com.pulumi.cloudflare.ZoneCacheReserve;
 * import com.pulumi.cloudflare.ZoneCacheReserveArgs;
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
 *         var exampleZoneCacheReserve = new ZoneCacheReserve("exampleZoneCacheReserve", ZoneCacheReserveArgs.builder()
 *             .zoneId("023e105f4ecef8ad9ca31a8372d0c353")
 *             .value("on")
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
 * $ pulumi import cloudflare:index/zoneCacheReserve:ZoneCacheReserve example &#39;&lt;zone_id&gt;&#39;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/zoneCacheReserve:ZoneCacheReserve")
public class ZoneCacheReserve extends com.pulumi.resources.CustomResource {
    /**
     * Whether the setting is editable
     * 
     */
    @Export(name="editable", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> editable;

    /**
     * @return Whether the setting is editable
     * 
     */
    public Output<Boolean> editable() {
        return this.editable;
    }
    /**
     * Last time this setting was modified.
     * 
     */
    @Export(name="modifiedOn", refs={String.class}, tree="[0]")
    private Output<String> modifiedOn;

    /**
     * @return Last time this setting was modified.
     * 
     */
    public Output<String> modifiedOn() {
        return this.modifiedOn;
    }
    /**
     * Value of the Cache Reserve zone setting.
     * Available values: &#34;on&#34;, &#34;off&#34;.
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output<String> value;

    /**
     * @return Value of the Cache Reserve zone setting.
     * Available values: &#34;on&#34;, &#34;off&#34;.
     * 
     */
    public Output<String> value() {
        return this.value;
    }
    /**
     * Identifier
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return Identifier
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ZoneCacheReserve(java.lang.String name) {
        this(name, ZoneCacheReserveArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ZoneCacheReserve(java.lang.String name, ZoneCacheReserveArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ZoneCacheReserve(java.lang.String name, ZoneCacheReserveArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zoneCacheReserve:ZoneCacheReserve", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ZoneCacheReserve(java.lang.String name, Output<java.lang.String> id, @Nullable ZoneCacheReserveState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zoneCacheReserve:ZoneCacheReserve", name, state, makeResourceOptions(options, id), false);
    }

    private static ZoneCacheReserveArgs makeArgs(ZoneCacheReserveArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ZoneCacheReserveArgs.Empty : args;
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
    public static ZoneCacheReserve get(java.lang.String name, Output<java.lang.String> id, @Nullable ZoneCacheReserveState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ZoneCacheReserve(name, id, state, options);
    }
}
