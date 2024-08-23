// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.ZeroTrustListArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustListState;
import com.pulumi.cloudflare.outputs.ZeroTrustListItemsWithDescription;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Teams List resource. Teams lists are
 * referenced when creating secure web gateway policies or device
 * posture rules.
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
 * import com.pulumi.cloudflare.ZeroTrustList;
 * import com.pulumi.cloudflare.ZeroTrustListArgs;
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
 *         var example = new ZeroTrustList("example", ZeroTrustListArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("Corporate devices")
 *             .type("SERIAL")
 *             .description("Serial numbers for all corporate devices.")
 *             .items(            
 *                 "8GE8721REF",
 *                 "5RE8543EGG",
 *                 "1YE2880LNP")
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
 * $ pulumi import cloudflare:index/zeroTrustList:ZeroTrustList example &lt;account_id&gt;/&lt;teams_list_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/zeroTrustList:ZeroTrustList")
public class ZeroTrustList extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The description of the teams list.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the teams list.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The items of the teams list.
     * 
     */
    @Export(name="items", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> items;

    /**
     * @return The items of the teams list.
     * 
     */
    public Output<Optional<List<String>>> items() {
        return Codegen.optional(this.items);
    }
    /**
     * The items of the teams list that has explicit description.
     * 
     */
    @Export(name="itemsWithDescriptions", refs={List.class,ZeroTrustListItemsWithDescription.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ZeroTrustListItemsWithDescription>> itemsWithDescriptions;

    /**
     * @return The items of the teams list that has explicit description.
     * 
     */
    public Output<Optional<List<ZeroTrustListItemsWithDescription>>> itemsWithDescriptions() {
        return Codegen.optional(this.itemsWithDescriptions);
    }
    /**
     * Name of the teams list.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the teams list.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The teams list type. Available values: `IP`, `SERIAL`, `URL`, `DOMAIN`, `EMAIL`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The teams list type. Available values: `IP`, `SERIAL`, `URL`, `DOMAIN`, `EMAIL`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ZeroTrustList(java.lang.String name) {
        this(name, ZeroTrustListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ZeroTrustList(java.lang.String name, ZeroTrustListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ZeroTrustList(java.lang.String name, ZeroTrustListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustList:ZeroTrustList", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ZeroTrustList(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustList:ZeroTrustList", name, state, makeResourceOptions(options, id), false);
    }

    private static ZeroTrustListArgs makeArgs(ZeroTrustListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ZeroTrustListArgs.Empty : args;
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
    public static ZeroTrustList get(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ZeroTrustList(name, id, state, options);
    }
}