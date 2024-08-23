// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Access Group resource. Access Groups are used
 * in conjunction with Access Policies to restrict access to a
 * particular resource based on group membership.
 *
 * > It's required that an `accountId` or `zoneId` is provided and in
 *    most cases using either is fine. However, if you're using a scoped
 *    access token, you must provide the argument that matches the token's
 *    scope. For example, an access token that is scoped to the "example.com"
 *    zone needs to use the `zoneId` argument.
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/zeroTrustAccessGroup:ZeroTrustAccessGroup example <account_id>/<group_id>
 * ```
 */
export class ZeroTrustAccessGroup extends pulumi.CustomResource {
    /**
     * Get an existing ZeroTrustAccessGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZeroTrustAccessGroupState, opts?: pulumi.CustomResourceOptions): ZeroTrustAccessGroup {
        return new ZeroTrustAccessGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/zeroTrustAccessGroup:ZeroTrustAccessGroup';

    /**
     * Returns true if the given object is an instance of ZeroTrustAccessGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ZeroTrustAccessGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ZeroTrustAccessGroup.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    public readonly excludes!: pulumi.Output<outputs.ZeroTrustAccessGroupExclude[] | undefined>;
    public readonly includes!: pulumi.Output<outputs.ZeroTrustAccessGroupInclude[]>;
    public readonly name!: pulumi.Output<string>;
    public readonly requires!: pulumi.Output<outputs.ZeroTrustAccessGroupRequire[] | undefined>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a ZeroTrustAccessGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ZeroTrustAccessGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ZeroTrustAccessGroupArgs | ZeroTrustAccessGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ZeroTrustAccessGroupState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["excludes"] = state ? state.excludes : undefined;
            resourceInputs["includes"] = state ? state.includes : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["requires"] = state ? state.requires : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ZeroTrustAccessGroupArgs | undefined;
            if ((!args || args.includes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'includes'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["excludes"] = args ? args.excludes : undefined;
            resourceInputs["includes"] = args ? args.includes : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["requires"] = args ? args.requires : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ZeroTrustAccessGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ZeroTrustAccessGroup resources.
 */
export interface ZeroTrustAccessGroupState {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
     */
    accountId?: pulumi.Input<string>;
    excludes?: pulumi.Input<pulumi.Input<inputs.ZeroTrustAccessGroupExclude>[]>;
    includes?: pulumi.Input<pulumi.Input<inputs.ZeroTrustAccessGroupInclude>[]>;
    name?: pulumi.Input<string>;
    requires?: pulumi.Input<pulumi.Input<inputs.ZeroTrustAccessGroupRequire>[]>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ZeroTrustAccessGroup resource.
 */
export interface ZeroTrustAccessGroupArgs {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
     */
    accountId?: pulumi.Input<string>;
    excludes?: pulumi.Input<pulumi.Input<inputs.ZeroTrustAccessGroupExclude>[]>;
    includes: pulumi.Input<pulumi.Input<inputs.ZeroTrustAccessGroupInclude>[]>;
    name: pulumi.Input<string>;
    requires?: pulumi.Input<pulumi.Input<inputs.ZeroTrustAccessGroupRequire>[]>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}