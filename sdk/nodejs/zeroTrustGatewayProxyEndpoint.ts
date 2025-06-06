// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleZeroTrustGatewayProxyEndpoint = new cloudflare.ZeroTrustGatewayProxyEndpoint("example_zero_trust_gateway_proxy_endpoint", {
 *     accountId: "699d98642c564d2e855e9661899b7252",
 *     ips: ["192.0.2.1/32"],
 *     name: "Devops team",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/zeroTrustGatewayProxyEndpoint:ZeroTrustGatewayProxyEndpoint example '<account_id>/<proxy_endpoint_id>'
 * ```
 */
export class ZeroTrustGatewayProxyEndpoint extends pulumi.CustomResource {
    /**
     * Get an existing ZeroTrustGatewayProxyEndpoint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZeroTrustGatewayProxyEndpointState, opts?: pulumi.CustomResourceOptions): ZeroTrustGatewayProxyEndpoint {
        return new ZeroTrustGatewayProxyEndpoint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/zeroTrustGatewayProxyEndpoint:ZeroTrustGatewayProxyEndpoint';

    /**
     * Returns true if the given object is an instance of ZeroTrustGatewayProxyEndpoint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ZeroTrustGatewayProxyEndpoint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ZeroTrustGatewayProxyEndpoint.__pulumiType;
    }

    public readonly accountId!: pulumi.Output<string>;
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * A list of CIDRs to restrict ingress connections.
     */
    public readonly ips!: pulumi.Output<string[]>;
    /**
     * The name of the proxy endpoint.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The subdomain to be used as the destination in the proxy client.
     */
    public /*out*/ readonly subdomain!: pulumi.Output<string>;
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;

    /**
     * Create a ZeroTrustGatewayProxyEndpoint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ZeroTrustGatewayProxyEndpointArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ZeroTrustGatewayProxyEndpointArgs | ZeroTrustGatewayProxyEndpointState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ZeroTrustGatewayProxyEndpointState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["ips"] = state ? state.ips : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["subdomain"] = state ? state.subdomain : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
        } else {
            const args = argsOrState as ZeroTrustGatewayProxyEndpointArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.ips === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ips'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["ips"] = args ? args.ips : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["subdomain"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "cloudflare:index/teamsProxyEndpoint:TeamsProxyEndpoint" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(ZeroTrustGatewayProxyEndpoint.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ZeroTrustGatewayProxyEndpoint resources.
 */
export interface ZeroTrustGatewayProxyEndpointState {
    accountId?: pulumi.Input<string>;
    createdAt?: pulumi.Input<string>;
    /**
     * A list of CIDRs to restrict ingress connections.
     */
    ips?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the proxy endpoint.
     */
    name?: pulumi.Input<string>;
    /**
     * The subdomain to be used as the destination in the proxy client.
     */
    subdomain?: pulumi.Input<string>;
    updatedAt?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ZeroTrustGatewayProxyEndpoint resource.
 */
export interface ZeroTrustGatewayProxyEndpointArgs {
    accountId: pulumi.Input<string>;
    /**
     * A list of CIDRs to restrict ingress connections.
     */
    ips: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the proxy endpoint.
     */
    name: pulumi.Input<string>;
}
