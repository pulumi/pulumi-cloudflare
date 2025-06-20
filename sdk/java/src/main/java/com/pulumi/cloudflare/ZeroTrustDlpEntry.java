// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.ZeroTrustDlpEntryArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustDlpEntryState;
import com.pulumi.cloudflare.outputs.ZeroTrustDlpEntryConfidence;
import com.pulumi.cloudflare.outputs.ZeroTrustDlpEntryPattern;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
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
 * import com.pulumi.cloudflare.ZeroTrustDlpEntry;
 * import com.pulumi.cloudflare.ZeroTrustDlpEntryArgs;
 * import com.pulumi.cloudflare.inputs.ZeroTrustDlpEntryPatternArgs;
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
 *         var exampleZeroTrustDlpEntry = new ZeroTrustDlpEntry("exampleZeroTrustDlpEntry", ZeroTrustDlpEntryArgs.builder()
 *             .accountId("account_id")
 *             .enabled(true)
 *             .name("name")
 *             .pattern(ZeroTrustDlpEntryPatternArgs.builder()
 *                 .regex("regex")
 *                 .validation("luhn")
 *                 .build())
 *             .profileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
 * $ pulumi import cloudflare:index/zeroTrustDlpEntry:ZeroTrustDlpEntry example &#39;&lt;account_id&gt;/&lt;entry_id&gt;&#39;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/zeroTrustDlpEntry:ZeroTrustDlpEntry")
public class ZeroTrustDlpEntry extends com.pulumi.resources.CustomResource {
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Only applies to custom word lists.
     * Determines if the words should be matched in a case-sensitive manner
     * Cannot be set to false if secret is true
     * 
     */
    @Export(name="caseSensitive", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> caseSensitive;

    /**
     * @return Only applies to custom word lists.
     * Determines if the words should be matched in a case-sensitive manner
     * Cannot be set to false if secret is true
     * 
     */
    public Output<Boolean> caseSensitive() {
        return this.caseSensitive;
    }
    @Export(name="confidence", refs={ZeroTrustDlpEntryConfidence.class}, tree="[0]")
    private Output<ZeroTrustDlpEntryConfidence> confidence;

    public Output<ZeroTrustDlpEntryConfidence> confidence() {
        return this.confidence;
    }
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt;
    }
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="pattern", refs={ZeroTrustDlpEntryPattern.class}, tree="[0]")
    private Output<ZeroTrustDlpEntryPattern> pattern;

    public Output<ZeroTrustDlpEntryPattern> pattern() {
        return this.pattern;
    }
    @Export(name="profileId", refs={String.class}, tree="[0]")
    private Output<String> profileId;

    public Output<String> profileId() {
        return this.profileId;
    }
    @Export(name="secret", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> secret;

    public Output<Boolean> secret() {
        return this.secret;
    }
    /**
     * Available values: &#34;custom&#34;, &#34;predefined&#34;, &#34;integration&#34;.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return Available values: &#34;custom&#34;, &#34;predefined&#34;, &#34;integration&#34;.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    public Output<String> updatedAt() {
        return this.updatedAt;
    }
    @Export(name="wordList", refs={String.class}, tree="[0]")
    private Output<String> wordList;

    public Output<String> wordList() {
        return this.wordList;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ZeroTrustDlpEntry(java.lang.String name) {
        this(name, ZeroTrustDlpEntryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ZeroTrustDlpEntry(java.lang.String name, ZeroTrustDlpEntryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ZeroTrustDlpEntry(java.lang.String name, ZeroTrustDlpEntryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustDlpEntry:ZeroTrustDlpEntry", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ZeroTrustDlpEntry(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustDlpEntryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustDlpEntry:ZeroTrustDlpEntry", name, state, makeResourceOptions(options, id), false);
    }

    private static ZeroTrustDlpEntryArgs makeArgs(ZeroTrustDlpEntryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ZeroTrustDlpEntryArgs.Empty : args;
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
    public static ZeroTrustDlpEntry get(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustDlpEntryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ZeroTrustDlpEntry(name, id, state, options);
    }
}
