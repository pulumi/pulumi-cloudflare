// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * The [Risk Behavior](https://developers.cloudflare.com/cloudflare-one/insights/risk-score/) resource allows you to configure Cloudflare Risk Behaviors for an account.
 */
export class RiskBehavior extends pulumi.CustomResource {
    /**
     * Get an existing RiskBehavior resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RiskBehaviorState, opts?: pulumi.CustomResourceOptions): RiskBehavior {
        return new RiskBehavior(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/riskBehavior:RiskBehavior';

    /**
     * Returns true if the given object is an instance of RiskBehavior.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RiskBehavior {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RiskBehavior.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Zero Trust risk behaviors configured on this account
     */
    public readonly behaviors!: pulumi.Output<outputs.RiskBehaviorBehavior[] | undefined>;

    /**
     * Create a RiskBehavior resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RiskBehaviorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RiskBehaviorArgs | RiskBehaviorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RiskBehaviorState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["behaviors"] = state ? state.behaviors : undefined;
        } else {
            const args = argsOrState as RiskBehaviorArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["behaviors"] = args ? args.behaviors : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RiskBehavior.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RiskBehavior resources.
 */
export interface RiskBehaviorState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Zero Trust risk behaviors configured on this account
     */
    behaviors?: pulumi.Input<pulumi.Input<inputs.RiskBehaviorBehavior>[]>;
}

/**
 * The set of arguments for constructing a RiskBehavior resource.
 */
export interface RiskBehaviorArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * Zero Trust risk behaviors configured on this account
     */
    behaviors?: pulumi.Input<pulumi.Input<inputs.RiskBehaviorBehavior>[]>;
}
