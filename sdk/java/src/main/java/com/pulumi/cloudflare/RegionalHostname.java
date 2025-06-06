// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.RegionalHostnameArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.RegionalHostnameState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
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
 * import com.pulumi.cloudflare.RegionalHostname;
 * import com.pulumi.cloudflare.RegionalHostnameArgs;
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
 *         var exampleRegionalHostname = new RegionalHostname("exampleRegionalHostname", RegionalHostnameArgs.builder()
 *             .zoneId("023e105f4ecef8ad9ca31a8372d0c353")
 *             .hostname("foo.example.com")
 *             .regionKey("ca")
 *             .routing("routing")
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
 * $ pulumi import cloudflare:index/regionalHostname:RegionalHostname example &#39;&lt;zone_id&gt;/&lt;hostname&gt;&#39;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/regionalHostname:RegionalHostname")
public class RegionalHostname extends com.pulumi.resources.CustomResource {
    /**
     * When the regional hostname was created
     * 
     */
    @Export(name="createdOn", refs={String.class}, tree="[0]")
    private Output<String> createdOn;

    /**
     * @return When the regional hostname was created
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * DNS hostname to be regionalized, must be a subdomain of the zone. Wildcards are supported for one level, e.g `*.example.com`
     * 
     */
    @Export(name="hostname", refs={String.class}, tree="[0]")
    private Output<String> hostname;

    /**
     * @return DNS hostname to be regionalized, must be a subdomain of the zone. Wildcards are supported for one level, e.g `*.example.com`
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * Identifying key for the region
     * 
     */
    @Export(name="regionKey", refs={String.class}, tree="[0]")
    private Output<String> regionKey;

    /**
     * @return Identifying key for the region
     * 
     */
    public Output<String> regionKey() {
        return this.regionKey;
    }
    /**
     * Configure which routing method to use for the regional hostname
     * 
     */
    @Export(name="routing", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> routing;

    /**
     * @return Configure which routing method to use for the regional hostname
     * 
     */
    public Output<Optional<String>> routing() {
        return Codegen.optional(this.routing);
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
    public RegionalHostname(java.lang.String name) {
        this(name, RegionalHostnameArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionalHostname(java.lang.String name, RegionalHostnameArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionalHostname(java.lang.String name, RegionalHostnameArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/regionalHostname:RegionalHostname", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RegionalHostname(java.lang.String name, Output<java.lang.String> id, @Nullable RegionalHostnameState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/regionalHostname:RegionalHostname", name, state, makeResourceOptions(options, id), false);
    }

    private static RegionalHostnameArgs makeArgs(RegionalHostnameArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RegionalHostnameArgs.Empty : args;
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
    public static RegionalHostname get(java.lang.String name, Output<java.lang.String> id, @Nullable RegionalHostnameState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegionalHostname(name, id, state, options);
    }
}
