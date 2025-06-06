// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.ZeroTrustDnsLocationArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationState;
import com.pulumi.cloudflare.outputs.ZeroTrustDnsLocationEndpoints;
import com.pulumi.cloudflare.outputs.ZeroTrustDnsLocationNetwork;
import com.pulumi.core.Alias;
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
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.ZeroTrustDnsLocation;
 * import com.pulumi.cloudflare.ZeroTrustDnsLocationArgs;
 * import com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsArgs;
 * import com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsDohArgs;
 * import com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsDotArgs;
 * import com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsIpv4Args;
 * import com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsIpv6Args;
 * import com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationNetworkArgs;
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
 *         var exampleZeroTrustDnsLocation = new ZeroTrustDnsLocation("exampleZeroTrustDnsLocation", ZeroTrustDnsLocationArgs.builder()
 *             .accountId("699d98642c564d2e855e9661899b7252")
 *             .name("Austin Office Location")
 *             .clientDefault(false)
 *             .dnsDestinationIpsId("0e4a32c6-6fb8-4858-9296-98f51631e8e6")
 *             .ecsSupport(false)
 *             .endpoints(ZeroTrustDnsLocationEndpointsArgs.builder()
 *                 .doh(ZeroTrustDnsLocationEndpointsDohArgs.builder()
 *                     .enabled(true)
 *                     .networks(ZeroTrustDnsLocationEndpointsDohNetworkArgs.builder()
 *                         .network("2001:85a3::/64")
 *                         .build())
 *                     .requireToken(true)
 *                     .build())
 *                 .dot(ZeroTrustDnsLocationEndpointsDotArgs.builder()
 *                     .enabled(true)
 *                     .networks(ZeroTrustDnsLocationEndpointsDotNetworkArgs.builder()
 *                         .network("2001:85a3::/64")
 *                         .build())
 *                     .build())
 *                 .ipv4(ZeroTrustDnsLocationEndpointsIpv4Args.builder()
 *                     .enabled(true)
 *                     .build())
 *                 .ipv6(ZeroTrustDnsLocationEndpointsIpv6Args.builder()
 *                     .enabled(true)
 *                     .networks(ZeroTrustDnsLocationEndpointsIpv6NetworkArgs.builder()
 *                         .network("2001:85a3::/64")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .networks(ZeroTrustDnsLocationNetworkArgs.builder()
 *                 .network("192.0.2.1/32")
 *                 .build())
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
 * $ pulumi import cloudflare:index/zeroTrustDnsLocation:ZeroTrustDnsLocation example &#39;&lt;account_id&gt;/&lt;location_id&gt;&#39;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/zeroTrustDnsLocation:ZeroTrustDnsLocation")
public class ZeroTrustDnsLocation extends com.pulumi.resources.CustomResource {
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * True if the location is the default location.
     * 
     */
    @Export(name="clientDefault", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> clientDefault;

    /**
     * @return True if the location is the default location.
     * 
     */
    public Output<Boolean> clientDefault() {
        return this.clientDefault;
    }
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The identifier of the pair of IPv4 addresses assigned to this location. When creating a location, if this field is absent or set with null, the pair of shared IPv4 addresses (0e4a32c6-6fb8-4858-9296-98f51631e8e6) is auto-assigned. When updating a location, if the field is absent or set with null, the pre-assigned pair remains unchanged.
     * 
     */
    @Export(name="dnsDestinationIpsId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dnsDestinationIpsId;

    /**
     * @return The identifier of the pair of IPv4 addresses assigned to this location. When creating a location, if this field is absent or set with null, the pair of shared IPv4 addresses (0e4a32c6-6fb8-4858-9296-98f51631e8e6) is auto-assigned. When updating a location, if the field is absent or set with null, the pre-assigned pair remains unchanged.
     * 
     */
    public Output<Optional<String>> dnsDestinationIpsId() {
        return Codegen.optional(this.dnsDestinationIpsId);
    }
    /**
     * The uuid identifier of the IPv6 block brought to the gateway, so that this location&#39;s IPv6 address is allocated from the Bring Your Own Ipv6(BYOIPv6) block and not from the standard CloudFlare IPv6 block.
     * 
     */
    @Export(name="dnsDestinationIpv6BlockId", refs={String.class}, tree="[0]")
    private Output<String> dnsDestinationIpv6BlockId;

    /**
     * @return The uuid identifier of the IPv6 block brought to the gateway, so that this location&#39;s IPv6 address is allocated from the Bring Your Own Ipv6(BYOIPv6) block and not from the standard CloudFlare IPv6 block.
     * 
     */
    public Output<String> dnsDestinationIpv6BlockId() {
        return this.dnsDestinationIpv6BlockId;
    }
    /**
     * The DNS over HTTPS domain to send DNS requests to. This field is auto-generated by Gateway.
     * 
     */
    @Export(name="dohSubdomain", refs={String.class}, tree="[0]")
    private Output<String> dohSubdomain;

    /**
     * @return The DNS over HTTPS domain to send DNS requests to. This field is auto-generated by Gateway.
     * 
     */
    public Output<String> dohSubdomain() {
        return this.dohSubdomain;
    }
    /**
     * True if the location needs to resolve EDNS queries.
     * 
     */
    @Export(name="ecsSupport", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> ecsSupport;

    /**
     * @return True if the location needs to resolve EDNS queries.
     * 
     */
    public Output<Boolean> ecsSupport() {
        return this.ecsSupport;
    }
    /**
     * The destination endpoints configured for this location. When updating a location, if this field is absent or set with null, the endpoints configuration remains unchanged.
     * 
     */
    @Export(name="endpoints", refs={ZeroTrustDnsLocationEndpoints.class}, tree="[0]")
    private Output</* @Nullable */ ZeroTrustDnsLocationEndpoints> endpoints;

    /**
     * @return The destination endpoints configured for this location. When updating a location, if this field is absent or set with null, the endpoints configuration remains unchanged.
     * 
     */
    public Output<Optional<ZeroTrustDnsLocationEndpoints>> endpoints() {
        return Codegen.optional(this.endpoints);
    }
    /**
     * IPV6 destination ip assigned to this location. DNS requests sent to this IP will counted as the request under this location. This field is auto-generated by Gateway.
     * 
     */
    @Export(name="ip", refs={String.class}, tree="[0]")
    private Output<String> ip;

    /**
     * @return IPV6 destination ip assigned to this location. DNS requests sent to this IP will counted as the request under this location. This field is auto-generated by Gateway.
     * 
     */
    public Output<String> ip() {
        return this.ip;
    }
    /**
     * The primary destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
     * 
     */
    @Export(name="ipv4Destination", refs={String.class}, tree="[0]")
    private Output<String> ipv4Destination;

    /**
     * @return The primary destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
     * 
     */
    public Output<String> ipv4Destination() {
        return this.ipv4Destination;
    }
    /**
     * The backup destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
     * 
     */
    @Export(name="ipv4DestinationBackup", refs={String.class}, tree="[0]")
    private Output<String> ipv4DestinationBackup;

    /**
     * @return The backup destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
     * 
     */
    public Output<String> ipv4DestinationBackup() {
        return this.ipv4DestinationBackup;
    }
    /**
     * The name of the location.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the location.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of network ranges that requests from this location would originate from. A non-empty list is only effective if the ipv4 endpoint is enabled for this location.
     * 
     */
    @Export(name="networks", refs={List.class,ZeroTrustDnsLocationNetwork.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ZeroTrustDnsLocationNetwork>> networks;

    /**
     * @return A list of network ranges that requests from this location would originate from. A non-empty list is only effective if the ipv4 endpoint is enabled for this location.
     * 
     */
    public Output<Optional<List<ZeroTrustDnsLocationNetwork>>> networks() {
        return Codegen.optional(this.networks);
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
    public ZeroTrustDnsLocation(java.lang.String name) {
        this(name, ZeroTrustDnsLocationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ZeroTrustDnsLocation(java.lang.String name, ZeroTrustDnsLocationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ZeroTrustDnsLocation(java.lang.String name, ZeroTrustDnsLocationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustDnsLocation:ZeroTrustDnsLocation", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ZeroTrustDnsLocation(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustDnsLocationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustDnsLocation:ZeroTrustDnsLocation", name, state, makeResourceOptions(options, id), false);
    }

    private static ZeroTrustDnsLocationArgs makeArgs(ZeroTrustDnsLocationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ZeroTrustDnsLocationArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("cloudflare:index/teamsLocation:TeamsLocation").build())
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
    public static ZeroTrustDnsLocation get(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustDnsLocationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ZeroTrustDnsLocation(name, id, state, options);
    }
}
