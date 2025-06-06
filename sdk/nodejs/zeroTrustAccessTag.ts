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
 * const exampleZeroTrustAccessTag = new cloudflare.ZeroTrustAccessTag("example_zero_trust_access_tag", {
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     name: "engineers",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/zeroTrustAccessTag:ZeroTrustAccessTag example '<account_id>/<tag_name>'
 * ```
 */
export class ZeroTrustAccessTag extends pulumi.CustomResource {
    /**
     * Get an existing ZeroTrustAccessTag resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZeroTrustAccessTagState, opts?: pulumi.CustomResourceOptions): ZeroTrustAccessTag {
        return new ZeroTrustAccessTag(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/zeroTrustAccessTag:ZeroTrustAccessTag';

    /**
     * Returns true if the given object is an instance of ZeroTrustAccessTag.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ZeroTrustAccessTag {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ZeroTrustAccessTag.__pulumiType;
    }

    /**
     * Identifier.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The number of applications that have this tag
     */
    public /*out*/ readonly appCount!: pulumi.Output<number>;
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The name of the tag
     */
    public readonly name!: pulumi.Output<string>;
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;

    /**
     * Create a ZeroTrustAccessTag resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ZeroTrustAccessTagArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ZeroTrustAccessTagArgs | ZeroTrustAccessTagState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ZeroTrustAccessTagState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["appCount"] = state ? state.appCount : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
        } else {
            const args = argsOrState as ZeroTrustAccessTagArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["appCount"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "cloudflare:index/accessTag:AccessTag" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(ZeroTrustAccessTag.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ZeroTrustAccessTag resources.
 */
export interface ZeroTrustAccessTagState {
    /**
     * Identifier.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The number of applications that have this tag
     */
    appCount?: pulumi.Input<number>;
    createdAt?: pulumi.Input<string>;
    /**
     * The name of the tag
     */
    name?: pulumi.Input<string>;
    updatedAt?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ZeroTrustAccessTag resource.
 */
export interface ZeroTrustAccessTagArgs {
    /**
     * Identifier.
     */
    accountId: pulumi.Input<string>;
    /**
     * The name of the tag
     */
    name: pulumi.Input<string>;
}
