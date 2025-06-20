// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.HyperdriveConfigArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.HyperdriveConfigState;
import com.pulumi.cloudflare.outputs.HyperdriveConfigCaching;
import com.pulumi.cloudflare.outputs.HyperdriveConfigMtls;
import com.pulumi.cloudflare.outputs.HyperdriveConfigOrigin;
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
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import cloudflare:index/hyperdriveConfig:HyperdriveConfig example &#39;&lt;account_id&gt;/&lt;hyperdrive_id&gt;&#39;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/hyperdriveConfig:HyperdriveConfig")
public class HyperdriveConfig extends com.pulumi.resources.CustomResource {
    /**
     * Define configurations using a unique string identifier.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Define configurations using a unique string identifier.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    @Export(name="caching", refs={HyperdriveConfigCaching.class}, tree="[0]")
    private Output</* @Nullable */ HyperdriveConfigCaching> caching;

    public Output<Optional<HyperdriveConfigCaching>> caching() {
        return Codegen.optional(this.caching);
    }
    /**
     * Defines the creation time of the Hyperdrive configuration.
     * 
     */
    @Export(name="createdOn", refs={String.class}, tree="[0]")
    private Output<String> createdOn;

    /**
     * @return Defines the creation time of the Hyperdrive configuration.
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * Defines the last modified time of the Hyperdrive configuration.
     * 
     */
    @Export(name="modifiedOn", refs={String.class}, tree="[0]")
    private Output<String> modifiedOn;

    /**
     * @return Defines the last modified time of the Hyperdrive configuration.
     * 
     */
    public Output<String> modifiedOn() {
        return this.modifiedOn;
    }
    @Export(name="mtls", refs={HyperdriveConfigMtls.class}, tree="[0]")
    private Output</* @Nullable */ HyperdriveConfigMtls> mtls;

    public Output<Optional<HyperdriveConfigMtls>> mtls() {
        return Codegen.optional(this.mtls);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="origin", refs={HyperdriveConfigOrigin.class}, tree="[0]")
    private Output<HyperdriveConfigOrigin> origin;

    public Output<HyperdriveConfigOrigin> origin() {
        return this.origin;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HyperdriveConfig(java.lang.String name) {
        this(name, HyperdriveConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HyperdriveConfig(java.lang.String name, HyperdriveConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HyperdriveConfig(java.lang.String name, HyperdriveConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/hyperdriveConfig:HyperdriveConfig", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private HyperdriveConfig(java.lang.String name, Output<java.lang.String> id, @Nullable HyperdriveConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/hyperdriveConfig:HyperdriveConfig", name, state, makeResourceOptions(options, id), false);
    }

    private static HyperdriveConfigArgs makeArgs(HyperdriveConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? HyperdriveConfigArgs.Empty : args;
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
    public static HyperdriveConfig get(java.lang.String name, Output<java.lang.String> id, @Nullable HyperdriveConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HyperdriveConfig(name, id, state, options);
    }
}
