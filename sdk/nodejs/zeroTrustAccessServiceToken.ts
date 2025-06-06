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
 * const exampleZeroTrustAccessServiceToken = new cloudflare.ZeroTrustAccessServiceToken("example_zero_trust_access_service_token", {
 *     name: "CI/CD token",
 *     zoneId: "zone_id",
 *     duration: "60m",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/zeroTrustAccessServiceToken:ZeroTrustAccessServiceToken example '<{accounts|zones}/{account_id|zone_id}>/<service_token_id>'
 * ```
 */
export class ZeroTrustAccessServiceToken extends pulumi.CustomResource {
    /**
     * Get an existing ZeroTrustAccessServiceToken resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZeroTrustAccessServiceTokenState, opts?: pulumi.CustomResourceOptions): ZeroTrustAccessServiceToken {
        return new ZeroTrustAccessServiceToken(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/zeroTrustAccessServiceToken:ZeroTrustAccessServiceToken';

    /**
     * Returns true if the given object is an instance of ZeroTrustAccessServiceToken.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ZeroTrustAccessServiceToken {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ZeroTrustAccessServiceToken.__pulumiType;
    }

    /**
     * The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * The Client ID for the service token. Access will check for this value in the `CF-Access-Client-ID` request header.
     */
    public /*out*/ readonly clientId!: pulumi.Output<string>;
    /**
     * The Client Secret for the service token. Access will check for this value in the `CF-Access-Client-Secret` request header.
     */
    public /*out*/ readonly clientSecret!: pulumi.Output<string>;
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The duration for how long the service token will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h. The default is 1 year in hours (8760h).
     */
    public readonly duration!: pulumi.Output<string>;
    public /*out*/ readonly expiresAt!: pulumi.Output<string>;
    public /*out*/ readonly lastSeenAt!: pulumi.Output<string>;
    /**
     * The name of the service token.
     */
    public readonly name!: pulumi.Output<string>;
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;
    /**
     * The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     */
    public readonly zoneId!: pulumi.Output<string | undefined>;

    /**
     * Create a ZeroTrustAccessServiceToken resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ZeroTrustAccessServiceTokenArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ZeroTrustAccessServiceTokenArgs | ZeroTrustAccessServiceTokenState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ZeroTrustAccessServiceTokenState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["clientId"] = state ? state.clientId : undefined;
            resourceInputs["clientSecret"] = state ? state.clientSecret : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["duration"] = state ? state.duration : undefined;
            resourceInputs["expiresAt"] = state ? state.expiresAt : undefined;
            resourceInputs["lastSeenAt"] = state ? state.lastSeenAt : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ZeroTrustAccessServiceTokenArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["duration"] = args ? args.duration : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["clientId"] = undefined /*out*/;
            resourceInputs["clientSecret"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["expiresAt"] = undefined /*out*/;
            resourceInputs["lastSeenAt"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "cloudflare:index/accessServiceToken:AccessServiceToken" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        const secretOpts = { additionalSecretOutputs: ["clientSecret"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ZeroTrustAccessServiceToken.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ZeroTrustAccessServiceToken resources.
 */
export interface ZeroTrustAccessServiceTokenState {
    /**
     * The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The Client ID for the service token. Access will check for this value in the `CF-Access-Client-ID` request header.
     */
    clientId?: pulumi.Input<string>;
    /**
     * The Client Secret for the service token. Access will check for this value in the `CF-Access-Client-Secret` request header.
     */
    clientSecret?: pulumi.Input<string>;
    createdAt?: pulumi.Input<string>;
    /**
     * The duration for how long the service token will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h. The default is 1 year in hours (8760h).
     */
    duration?: pulumi.Input<string>;
    expiresAt?: pulumi.Input<string>;
    lastSeenAt?: pulumi.Input<string>;
    /**
     * The name of the service token.
     */
    name?: pulumi.Input<string>;
    updatedAt?: pulumi.Input<string>;
    /**
     * The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ZeroTrustAccessServiceToken resource.
 */
export interface ZeroTrustAccessServiceTokenArgs {
    /**
     * The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The duration for how long the service token will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h. The default is 1 year in hours (8760h).
     */
    duration?: pulumi.Input<string>;
    /**
     * The name of the service token.
     */
    name: pulumi.Input<string>;
    /**
     * The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     */
    zoneId?: pulumi.Input<string>;
}
