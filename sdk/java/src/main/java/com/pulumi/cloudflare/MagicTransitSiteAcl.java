// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.MagicTransitSiteAclArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.MagicTransitSiteAclState;
import com.pulumi.cloudflare.outputs.MagicTransitSiteAclLan1;
import com.pulumi.cloudflare.outputs.MagicTransitSiteAclLan2;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
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
 * $ pulumi import cloudflare:index/magicTransitSiteAcl:MagicTransitSiteAcl example &#39;&lt;account_id&gt;/&lt;site_id&gt;/&lt;acl_id&gt;&#39;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/magicTransitSiteAcl:MagicTransitSiteAcl")
public class MagicTransitSiteAcl extends com.pulumi.resources.CustomResource {
    /**
     * Identifier
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Identifier
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Description for the ACL.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description for the ACL.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The desired forwarding action for this ACL policy. If set to &#34;false&#34;, the policy will forward traffic to Cloudflare. If set to &#34;true&#34;, the policy will forward traffic locally on the Magic Connector. If not included in request, will default to false.
     * 
     */
    @Export(name="forwardLocally", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forwardLocally;

    /**
     * @return The desired forwarding action for this ACL policy. If set to &#34;false&#34;, the policy will forward traffic to Cloudflare. If set to &#34;true&#34;, the policy will forward traffic locally on the Magic Connector. If not included in request, will default to false.
     * 
     */
    public Output<Optional<Boolean>> forwardLocally() {
        return Codegen.optional(this.forwardLocally);
    }
    @Export(name="lan1", refs={MagicTransitSiteAclLan1.class}, tree="[0]")
    private Output<MagicTransitSiteAclLan1> lan1;

    public Output<MagicTransitSiteAclLan1> lan1() {
        return this.lan1;
    }
    @Export(name="lan2", refs={MagicTransitSiteAclLan2.class}, tree="[0]")
    private Output<MagicTransitSiteAclLan2> lan2;

    public Output<MagicTransitSiteAclLan2> lan2() {
        return this.lan2;
    }
    /**
     * The name of the ACL.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the ACL.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="protocols", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> protocols;

    public Output<Optional<List<String>>> protocols() {
        return Codegen.optional(this.protocols);
    }
    /**
     * Identifier
     * 
     */
    @Export(name="siteId", refs={String.class}, tree="[0]")
    private Output<String> siteId;

    /**
     * @return Identifier
     * 
     */
    public Output<String> siteId() {
        return this.siteId;
    }
    /**
     * The desired traffic direction for this ACL policy. If set to &#34;false&#34;, the policy will allow bidirectional traffic. If set to &#34;true&#34;, the policy will only allow traffic in one direction. If not included in request, will default to false.
     * 
     */
    @Export(name="unidirectional", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> unidirectional;

    /**
     * @return The desired traffic direction for this ACL policy. If set to &#34;false&#34;, the policy will allow bidirectional traffic. If set to &#34;true&#34;, the policy will only allow traffic in one direction. If not included in request, will default to false.
     * 
     */
    public Output<Optional<Boolean>> unidirectional() {
        return Codegen.optional(this.unidirectional);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MagicTransitSiteAcl(java.lang.String name) {
        this(name, MagicTransitSiteAclArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MagicTransitSiteAcl(java.lang.String name, MagicTransitSiteAclArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MagicTransitSiteAcl(java.lang.String name, MagicTransitSiteAclArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/magicTransitSiteAcl:MagicTransitSiteAcl", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private MagicTransitSiteAcl(java.lang.String name, Output<java.lang.String> id, @Nullable MagicTransitSiteAclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/magicTransitSiteAcl:MagicTransitSiteAcl", name, state, makeResourceOptions(options, id), false);
    }

    private static MagicTransitSiteAclArgs makeArgs(MagicTransitSiteAclArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MagicTransitSiteAclArgs.Empty : args;
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
    public static MagicTransitSiteAcl get(java.lang.String name, Output<java.lang.String> id, @Nullable MagicTransitSiteAclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MagicTransitSiteAcl(name, id, state, options);
    }
}
