// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.EmailSecurityImpersonationRegistryArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.EmailSecurityImpersonationRegistryState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
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
 * import com.pulumi.cloudflare.EmailSecurityImpersonationRegistry;
 * import com.pulumi.cloudflare.EmailSecurityImpersonationRegistryArgs;
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
 *         var exampleEmailSecurityImpersonationRegistry = new EmailSecurityImpersonationRegistry("exampleEmailSecurityImpersonationRegistry", EmailSecurityImpersonationRegistryArgs.builder()
 *             .accountId("023e105f4ecef8ad9ca31a8372d0c353")
 *             .email("email")
 *             .isEmailRegex(true)
 *             .name("name")
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
 * $ pulumi import cloudflare:index/emailSecurityImpersonationRegistry:EmailSecurityImpersonationRegistry example &#39;&lt;account_id&gt;/&lt;display_name_id&gt;&#39;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/emailSecurityImpersonationRegistry:EmailSecurityImpersonationRegistry")
public class EmailSecurityImpersonationRegistry extends com.pulumi.resources.CustomResource {
    /**
     * Account Identifier
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account Identifier
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    @Export(name="comments", refs={String.class}, tree="[0]")
    private Output<String> comments;

    public Output<String> comments() {
        return this.comments;
    }
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt;
    }
    @Export(name="directoryId", refs={Integer.class}, tree="[0]")
    private Output<Integer> directoryId;

    public Output<Integer> directoryId() {
        return this.directoryId;
    }
    @Export(name="directoryNodeId", refs={Integer.class}, tree="[0]")
    private Output<Integer> directoryNodeId;

    public Output<Integer> directoryNodeId() {
        return this.directoryNodeId;
    }
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output<String> email;

    public Output<String> email() {
        return this.email;
    }
    /**
     * @deprecated
     * This attribute is deprecated.
     * 
     */
    @Deprecated /* This attribute is deprecated. */
    @Export(name="externalDirectoryNodeId", refs={String.class}, tree="[0]")
    private Output<String> externalDirectoryNodeId;

    public Output<String> externalDirectoryNodeId() {
        return this.externalDirectoryNodeId;
    }
    @Export(name="isEmailRegex", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isEmailRegex;

    public Output<Boolean> isEmailRegex() {
        return this.isEmailRegex;
    }
    @Export(name="lastModified", refs={String.class}, tree="[0]")
    private Output<String> lastModified;

    public Output<String> lastModified() {
        return this.lastModified;
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="provenance", refs={String.class}, tree="[0]")
    private Output<String> provenance;

    public Output<String> provenance() {
        return this.provenance;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EmailSecurityImpersonationRegistry(java.lang.String name) {
        this(name, EmailSecurityImpersonationRegistryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EmailSecurityImpersonationRegistry(java.lang.String name, EmailSecurityImpersonationRegistryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EmailSecurityImpersonationRegistry(java.lang.String name, EmailSecurityImpersonationRegistryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/emailSecurityImpersonationRegistry:EmailSecurityImpersonationRegistry", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private EmailSecurityImpersonationRegistry(java.lang.String name, Output<java.lang.String> id, @Nullable EmailSecurityImpersonationRegistryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/emailSecurityImpersonationRegistry:EmailSecurityImpersonationRegistry", name, state, makeResourceOptions(options, id), false);
    }

    private static EmailSecurityImpersonationRegistryArgs makeArgs(EmailSecurityImpersonationRegistryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EmailSecurityImpersonationRegistryArgs.Empty : args;
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
    public static EmailSecurityImpersonationRegistry get(java.lang.String name, Output<java.lang.String> id, @Nullable EmailSecurityImpersonationRegistryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EmailSecurityImpersonationRegistry(name, id, state, options);
    }
}
