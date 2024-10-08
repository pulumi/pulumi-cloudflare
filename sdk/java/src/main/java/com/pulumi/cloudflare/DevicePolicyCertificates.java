// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.DevicePolicyCertificatesArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.DevicePolicyCertificatesState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare device policy certificates resource. Device
 * policy certificate resources enable client device certificate
 * generation.
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
 * import com.pulumi.cloudflare.DevicePolicyCertificates;
 * import com.pulumi.cloudflare.DevicePolicyCertificatesArgs;
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
 *         var example = new DevicePolicyCertificates("example", DevicePolicyCertificatesArgs.builder()
 *             .zoneId("0da42c8d2132a9ddaf714f9e7c920711")
 *             .enabled(true)
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
 * $ pulumi import cloudflare:index/devicePolicyCertificates:DevicePolicyCertificates example &lt;zone_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/devicePolicyCertificates:DevicePolicyCertificates")
public class DevicePolicyCertificates extends com.pulumi.resources.CustomResource {
    /**
     * `true` if certificate generation is enabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return `true` if certificate generation is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * The zone identifier to target for the resource.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DevicePolicyCertificates(java.lang.String name) {
        this(name, DevicePolicyCertificatesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DevicePolicyCertificates(java.lang.String name, DevicePolicyCertificatesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DevicePolicyCertificates(java.lang.String name, DevicePolicyCertificatesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/devicePolicyCertificates:DevicePolicyCertificates", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DevicePolicyCertificates(java.lang.String name, Output<java.lang.String> id, @Nullable DevicePolicyCertificatesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/devicePolicyCertificates:DevicePolicyCertificates", name, state, makeResourceOptions(options, id), false);
    }

    private static DevicePolicyCertificatesArgs makeArgs(DevicePolicyCertificatesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DevicePolicyCertificatesArgs.Empty : args;
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
    public static DevicePolicyCertificates get(java.lang.String name, Output<java.lang.String> id, @Nullable DevicePolicyCertificatesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DevicePolicyCertificates(name, id, state, options);
    }
}
