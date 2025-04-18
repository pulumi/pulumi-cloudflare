// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.StreamWebhookArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.StreamWebhookState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
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
 * import com.pulumi.cloudflare.StreamWebhook;
 * import com.pulumi.cloudflare.StreamWebhookArgs;
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
 *         var exampleStreamWebhook = new StreamWebhook("exampleStreamWebhook", StreamWebhookArgs.builder()
 *             .accountId("023e105f4ecef8ad9ca31a8372d0c353")
 *             .notificationUrl("https://example.com")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="cloudflare:index/streamWebhook:StreamWebhook")
public class StreamWebhook extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier tag.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account identifier tag.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The URL where webhooks will be sent.
     * 
     */
    @Export(name="notificationUrl", refs={String.class}, tree="[0]")
    private Output<String> notificationUrl;

    /**
     * @return The URL where webhooks will be sent.
     * 
     */
    public Output<String> notificationUrl() {
        return this.notificationUrl;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StreamWebhook(java.lang.String name) {
        this(name, StreamWebhookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StreamWebhook(java.lang.String name, StreamWebhookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StreamWebhook(java.lang.String name, StreamWebhookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/streamWebhook:StreamWebhook", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private StreamWebhook(java.lang.String name, Output<java.lang.String> id, @Nullable StreamWebhookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/streamWebhook:StreamWebhook", name, state, makeResourceOptions(options, id), false);
    }

    private static StreamWebhookArgs makeArgs(StreamWebhookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? StreamWebhookArgs.Empty : args;
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
    public static StreamWebhook get(java.lang.String name, Output<java.lang.String> id, @Nullable StreamWebhookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StreamWebhook(name, id, state, options);
    }
}
