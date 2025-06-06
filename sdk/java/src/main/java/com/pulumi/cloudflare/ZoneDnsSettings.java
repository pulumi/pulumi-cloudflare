// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.ZoneDnsSettingsArgs;
import com.pulumi.cloudflare.inputs.ZoneDnsSettingsState;
import com.pulumi.cloudflare.outputs.ZoneDnsSettingsInternalDns;
import com.pulumi.cloudflare.outputs.ZoneDnsSettingsNameservers;
import com.pulumi.cloudflare.outputs.ZoneDnsSettingsSoa;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="cloudflare:index/zoneDnsSettings:ZoneDnsSettings")
public class ZoneDnsSettings extends com.pulumi.resources.CustomResource {
    /**
     * Whether to flatten all CNAME records in the zone. Note that, due to DNS limitations, a CNAME record at the zone apex will always be flattened.
     * 
     */
    @Export(name="flattenAllCnames", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> flattenAllCnames;

    /**
     * @return Whether to flatten all CNAME records in the zone. Note that, due to DNS limitations, a CNAME record at the zone apex will always be flattened.
     * 
     */
    public Output<Optional<Boolean>> flattenAllCnames() {
        return Codegen.optional(this.flattenAllCnames);
    }
    /**
     * Whether to enable Foundation DNS Advanced Nameservers on the zone.
     * 
     */
    @Export(name="foundationDns", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> foundationDns;

    /**
     * @return Whether to enable Foundation DNS Advanced Nameservers on the zone.
     * 
     */
    public Output<Optional<Boolean>> foundationDns() {
        return Codegen.optional(this.foundationDns);
    }
    /**
     * Settings for this internal zone.
     * 
     */
    @Export(name="internalDns", refs={ZoneDnsSettingsInternalDns.class}, tree="[0]")
    private Output</* @Nullable */ ZoneDnsSettingsInternalDns> internalDns;

    /**
     * @return Settings for this internal zone.
     * 
     */
    public Output<Optional<ZoneDnsSettingsInternalDns>> internalDns() {
        return Codegen.optional(this.internalDns);
    }
    /**
     * Whether to enable multi-provider DNS, which causes Cloudflare to activate the zone even when non-Cloudflare NS records exist, and to respect NS records at the zone apex during outbound zone transfers.
     * 
     */
    @Export(name="multiProvider", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> multiProvider;

    /**
     * @return Whether to enable multi-provider DNS, which causes Cloudflare to activate the zone even when non-Cloudflare NS records exist, and to respect NS records at the zone apex during outbound zone transfers.
     * 
     */
    public Output<Optional<Boolean>> multiProvider() {
        return Codegen.optional(this.multiProvider);
    }
    /**
     * Settings determining the nameservers through which the zone should be available.
     * 
     */
    @Export(name="nameservers", refs={ZoneDnsSettingsNameservers.class}, tree="[0]")
    private Output</* @Nullable */ ZoneDnsSettingsNameservers> nameservers;

    /**
     * @return Settings determining the nameservers through which the zone should be available.
     * 
     */
    public Output<Optional<ZoneDnsSettingsNameservers>> nameservers() {
        return Codegen.optional(this.nameservers);
    }
    /**
     * The time to live (TTL) of the zone&#39;s nameserver (NS) records.
     * 
     */
    @Export(name="nsTtl", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> nsTtl;

    /**
     * @return The time to live (TTL) of the zone&#39;s nameserver (NS) records.
     * 
     */
    public Output<Optional<Double>> nsTtl() {
        return Codegen.optional(this.nsTtl);
    }
    /**
     * Allows a Secondary DNS zone to use (proxied) override records and CNAME flattening at the zone apex.
     * 
     */
    @Export(name="secondaryOverrides", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> secondaryOverrides;

    /**
     * @return Allows a Secondary DNS zone to use (proxied) override records and CNAME flattening at the zone apex.
     * 
     */
    public Output<Optional<Boolean>> secondaryOverrides() {
        return Codegen.optional(this.secondaryOverrides);
    }
    /**
     * Components of the zone&#39;s SOA record.
     * 
     */
    @Export(name="soa", refs={ZoneDnsSettingsSoa.class}, tree="[0]")
    private Output</* @Nullable */ ZoneDnsSettingsSoa> soa;

    /**
     * @return Components of the zone&#39;s SOA record.
     * 
     */
    public Output<Optional<ZoneDnsSettingsSoa>> soa() {
        return Codegen.optional(this.soa);
    }
    /**
     * Identifier.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return Identifier.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }
    /**
     * Whether the zone mode is a regular or CDN/DNS only zone.
     * Available values: &#34;standard&#34;, &#34;cdn*only&#34;, &#34;dns*only&#34;.
     * 
     */
    @Export(name="zoneMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> zoneMode;

    /**
     * @return Whether the zone mode is a regular or CDN/DNS only zone.
     * Available values: &#34;standard&#34;, &#34;cdn*only&#34;, &#34;dns*only&#34;.
     * 
     */
    public Output<Optional<String>> zoneMode() {
        return Codegen.optional(this.zoneMode);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ZoneDnsSettings(java.lang.String name) {
        this(name, ZoneDnsSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ZoneDnsSettings(java.lang.String name, ZoneDnsSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ZoneDnsSettings(java.lang.String name, ZoneDnsSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zoneDnsSettings:ZoneDnsSettings", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ZoneDnsSettings(java.lang.String name, Output<java.lang.String> id, @Nullable ZoneDnsSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zoneDnsSettings:ZoneDnsSettings", name, state, makeResourceOptions(options, id), false);
    }

    private static ZoneDnsSettingsArgs makeArgs(ZoneDnsSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ZoneDnsSettingsArgs.Empty : args;
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
    public static ZoneDnsSettings get(java.lang.String name, Output<java.lang.String> id, @Nullable ZoneDnsSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ZoneDnsSettings(name, id, state, options);
    }
}
