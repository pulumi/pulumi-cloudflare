// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.ZeroTrustAccessTagArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessTagState;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
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
 * import com.pulumi.cloudflare.ZeroTrustAccessTag;
 * import com.pulumi.cloudflare.ZeroTrustAccessTagArgs;
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
 *         var exampleZeroTrustAccessTag = new ZeroTrustAccessTag("exampleZeroTrustAccessTag", ZeroTrustAccessTagArgs.builder()
 *             .accountId("023e105f4ecef8ad9ca31a8372d0c353")
 *             .name("engineers")
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
 * $ pulumi import cloudflare:index/zeroTrustAccessTag:ZeroTrustAccessTag example &#39;&lt;account_id&gt;/&lt;tag_name&gt;&#39;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/zeroTrustAccessTag:ZeroTrustAccessTag")
public class ZeroTrustAccessTag extends com.pulumi.resources.CustomResource {
    /**
     * Identifier.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Identifier.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The number of applications that have this tag
     * 
     */
    @Export(name="appCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> appCount;

    /**
     * @return The number of applications that have this tag
     * 
     */
    public Output<Integer> appCount() {
        return this.appCount;
    }
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The name of the tag
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the tag
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ZeroTrustAccessTag(java.lang.String name) {
        this(name, ZeroTrustAccessTagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ZeroTrustAccessTag(java.lang.String name, ZeroTrustAccessTagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ZeroTrustAccessTag(java.lang.String name, ZeroTrustAccessTagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustAccessTag:ZeroTrustAccessTag", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ZeroTrustAccessTag(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustAccessTagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustAccessTag:ZeroTrustAccessTag", name, state, makeResourceOptions(options, id), false);
    }

    private static ZeroTrustAccessTagArgs makeArgs(ZeroTrustAccessTagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ZeroTrustAccessTagArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("cloudflare:index/accessTag:AccessTag").build())
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
    public static ZeroTrustAccessTag get(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustAccessTagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ZeroTrustAccessTag(name, id, state, options);
    }
}
