// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.ZeroTrustLocalFallbackDomainArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustLocalFallbackDomainState;
import com.pulumi.cloudflare.outputs.ZeroTrustLocalFallbackDomainDomain;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Fallback Domain resource. Fallback domains are
 * used to ignore DNS requests to a given list of domains. These DNS
 * requests will be passed back to other DNS servers configured on
 * existing network interfaces on the device.
 * 
 */
@ResourceType(type="cloudflare:index/zeroTrustLocalFallbackDomain:ZeroTrustLocalFallbackDomain")
public class ZeroTrustLocalFallbackDomain extends com.pulumi.resources.CustomResource {
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
    @Export(name="domains", refs={List.class,ZeroTrustLocalFallbackDomainDomain.class}, tree="[0,1]")
    private Output<List<ZeroTrustLocalFallbackDomainDomain>> domains;

    public Output<List<ZeroTrustLocalFallbackDomainDomain>> domains() {
        return this.domains;
    }
    /**
     * The settings policy for which to configure this fallback domain policy.
     * 
     */
    @Export(name="policyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> policyId;

    /**
     * @return The settings policy for which to configure this fallback domain policy.
     * 
     */
    public Output<Optional<String>> policyId() {
        return Codegen.optional(this.policyId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ZeroTrustLocalFallbackDomain(java.lang.String name) {
        this(name, ZeroTrustLocalFallbackDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ZeroTrustLocalFallbackDomain(java.lang.String name, ZeroTrustLocalFallbackDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ZeroTrustLocalFallbackDomain(java.lang.String name, ZeroTrustLocalFallbackDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustLocalFallbackDomain:ZeroTrustLocalFallbackDomain", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ZeroTrustLocalFallbackDomain(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustLocalFallbackDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustLocalFallbackDomain:ZeroTrustLocalFallbackDomain", name, state, makeResourceOptions(options, id), false);
    }

    private static ZeroTrustLocalFallbackDomainArgs makeArgs(ZeroTrustLocalFallbackDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ZeroTrustLocalFallbackDomainArgs.Empty : args;
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
    public static ZeroTrustLocalFallbackDomain get(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustLocalFallbackDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ZeroTrustLocalFallbackDomain(name, id, state, options);
    }
}
