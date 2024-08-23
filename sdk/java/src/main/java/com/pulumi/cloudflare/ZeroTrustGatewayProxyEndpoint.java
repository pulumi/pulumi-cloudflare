// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.ZeroTrustGatewayProxyEndpointArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustGatewayProxyEndpointState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Teams Proxy Endpoint resource. Teams Proxy
 * Endpoints are used for pointing proxy clients at Cloudflare Secure
 * Gateway.
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
 * import com.pulumi.cloudflare.ZeroTrustGatewayProxyEndpoint;
 * import com.pulumi.cloudflare.ZeroTrustGatewayProxyEndpointArgs;
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
 *         var example = new ZeroTrustGatewayProxyEndpoint("example", ZeroTrustGatewayProxyEndpointArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("office")
 *             .ips("192.0.2.0/24")
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
 * $ pulumi import cloudflare:index/zeroTrustGatewayProxyEndpoint:ZeroTrustGatewayProxyEndpoint example &lt;account_id&gt;/&lt;proxy_endpoint_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/zeroTrustGatewayProxyEndpoint:ZeroTrustGatewayProxyEndpoint")
public class ZeroTrustGatewayProxyEndpoint extends com.pulumi.resources.CustomResource {
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
     * The networks CIDRs that will be allowed to initiate proxy connections.
     * 
     */
    @Export(name="ips", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> ips;

    /**
     * @return The networks CIDRs that will be allowed to initiate proxy connections.
     * 
     */
    public Output<List<String>> ips() {
        return this.ips;
    }
    /**
     * Name of the teams proxy endpoint.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the teams proxy endpoint.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The FQDN that proxy clients should be pointed at.
     * 
     */
    @Export(name="subdomain", refs={String.class}, tree="[0]")
    private Output<String> subdomain;

    /**
     * @return The FQDN that proxy clients should be pointed at.
     * 
     */
    public Output<String> subdomain() {
        return this.subdomain;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ZeroTrustGatewayProxyEndpoint(java.lang.String name) {
        this(name, ZeroTrustGatewayProxyEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ZeroTrustGatewayProxyEndpoint(java.lang.String name, ZeroTrustGatewayProxyEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ZeroTrustGatewayProxyEndpoint(java.lang.String name, ZeroTrustGatewayProxyEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustGatewayProxyEndpoint:ZeroTrustGatewayProxyEndpoint", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ZeroTrustGatewayProxyEndpoint(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustGatewayProxyEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustGatewayProxyEndpoint:ZeroTrustGatewayProxyEndpoint", name, state, makeResourceOptions(options, id), false);
    }

    private static ZeroTrustGatewayProxyEndpointArgs makeArgs(ZeroTrustGatewayProxyEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ZeroTrustGatewayProxyEndpointArgs.Empty : args;
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
    public static ZeroTrustGatewayProxyEndpoint get(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustGatewayProxyEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ZeroTrustGatewayProxyEndpoint(name, id, state, options);
    }
}