// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.ZeroTrustDlpCustomProfileArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileState;
import com.pulumi.cloudflare.outputs.ZeroTrustDlpCustomProfileContextAwareness;
import com.pulumi.cloudflare.outputs.ZeroTrustDlpCustomProfileEntry;
import com.pulumi.cloudflare.outputs.ZeroTrustDlpCustomProfileSharedEntry;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import cloudflare:index/zeroTrustDlpCustomProfile:ZeroTrustDlpCustomProfile example &#39;&lt;account_id&gt;/&lt;profile_id&gt;&#39;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/zeroTrustDlpCustomProfile:ZeroTrustDlpCustomProfile")
public class ZeroTrustDlpCustomProfile extends com.pulumi.resources.CustomResource {
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }
    @Export(name="aiContextEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> aiContextEnabled;

    public Output<Optional<Boolean>> aiContextEnabled() {
        return Codegen.optional(this.aiContextEnabled);
    }
    /**
     * Related DLP policies will trigger when the match count exceeds the number set.
     * 
     */
    @Export(name="allowedMatchCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> allowedMatchCount;

    /**
     * @return Related DLP policies will trigger when the match count exceeds the number set.
     * 
     */
    public Output<Integer> allowedMatchCount() {
        return this.allowedMatchCount;
    }
    @Export(name="confidenceThreshold", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> confidenceThreshold;

    public Output<Optional<String>> confidenceThreshold() {
        return Codegen.optional(this.confidenceThreshold);
    }
    /**
     * Scan the context of predefined entries to only return matches surrounded by keywords.
     * 
     */
    @Export(name="contextAwareness", refs={ZeroTrustDlpCustomProfileContextAwareness.class}, tree="[0]")
    private Output</* @Nullable */ ZeroTrustDlpCustomProfileContextAwareness> contextAwareness;

    /**
     * @return Scan the context of predefined entries to only return matches surrounded by keywords.
     * 
     */
    public Output<Optional<ZeroTrustDlpCustomProfileContextAwareness>> contextAwareness() {
        return Codegen.optional(this.contextAwareness);
    }
    /**
     * When the profile was created.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return When the profile was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The description of the profile.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the profile.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="entries", refs={List.class,ZeroTrustDlpCustomProfileEntry.class}, tree="[0,1]")
    private Output<List<ZeroTrustDlpCustomProfileEntry>> entries;

    public Output<List<ZeroTrustDlpCustomProfileEntry>> entries() {
        return this.entries;
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="ocrEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ocrEnabled;

    public Output<Optional<Boolean>> ocrEnabled() {
        return Codegen.optional(this.ocrEnabled);
    }
    /**
     * Whether this profile can be accessed by anyone.
     * 
     */
    @Export(name="openAccess", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> openAccess;

    /**
     * @return Whether this profile can be accessed by anyone.
     * 
     */
    public Output<Boolean> openAccess() {
        return this.openAccess;
    }
    /**
     * Entries from other profiles (e.g. pre-defined Cloudflare profiles, or your Microsoft Information Protection profiles).
     * 
     */
    @Export(name="sharedEntries", refs={List.class,ZeroTrustDlpCustomProfileSharedEntry.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ZeroTrustDlpCustomProfileSharedEntry>> sharedEntries;

    /**
     * @return Entries from other profiles (e.g. pre-defined Cloudflare profiles, or your Microsoft Information Protection profiles).
     * 
     */
    public Output<Optional<List<ZeroTrustDlpCustomProfileSharedEntry>>> sharedEntries() {
        return Codegen.optional(this.sharedEntries);
    }
    /**
     * Available values: &#34;custom&#34;, &#34;predefined&#34;, &#34;integration&#34;.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Available values: &#34;custom&#34;, &#34;predefined&#34;, &#34;integration&#34;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * When the profile was lasted updated.
     * 
     */
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    /**
     * @return When the profile was lasted updated.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ZeroTrustDlpCustomProfile(java.lang.String name) {
        this(name, ZeroTrustDlpCustomProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ZeroTrustDlpCustomProfile(java.lang.String name, ZeroTrustDlpCustomProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ZeroTrustDlpCustomProfile(java.lang.String name, ZeroTrustDlpCustomProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustDlpCustomProfile:ZeroTrustDlpCustomProfile", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ZeroTrustDlpCustomProfile(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustDlpCustomProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustDlpCustomProfile:ZeroTrustDlpCustomProfile", name, state, makeResourceOptions(options, id), false);
    }

    private static ZeroTrustDlpCustomProfileArgs makeArgs(ZeroTrustDlpCustomProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ZeroTrustDlpCustomProfileArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("cloudflare:index/dlpCustomProfile:DlpCustomProfile").build())
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
    public static ZeroTrustDlpCustomProfile get(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustDlpCustomProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ZeroTrustDlpCustomProfile(name, id, state, options);
    }
}
