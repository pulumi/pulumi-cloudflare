// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Waiting Room Rules resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.WaitingRoomRules("example", {
 *     rules: [
 *         {
 *             action: "bypass_waiting_room",
 *             description: "bypass ip list",
 *             expression: "src.ip in {192.0.2.0 192.0.2.1}",
 *             status: "enabled",
 *         },
 *         {
 *             action: "bypass_waiting_room",
 *             description: "bypass query string",
 *             expression: "http.request.uri.query contains \"bypass=true\"",
 *             status: "enabled",
 *         },
 *     ],
 *     waitingRoomId: "d41d8cd98f00b204e9800998ecf8427e",
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/waitingRoomRules:WaitingRoomRules default <zone_id>/<waiting_room_id>
 * ```
 */
export class WaitingRoomRules extends pulumi.CustomResource {
    /**
     * Get an existing WaitingRoomRules resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WaitingRoomRulesState, opts?: pulumi.CustomResourceOptions): WaitingRoomRules {
        return new WaitingRoomRules(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/waitingRoomRules:WaitingRoomRules';

    /**
     * Returns true if the given object is an instance of WaitingRoomRules.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WaitingRoomRules {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WaitingRoomRules.__pulumiType;
    }

    /**
     * List of rules to apply to the ruleset.
     */
    public readonly rules!: pulumi.Output<outputs.WaitingRoomRulesRule[] | undefined>;
    /**
     * The Waiting Room ID the rules should apply to. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly waitingRoomId!: pulumi.Output<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a WaitingRoomRules resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WaitingRoomRulesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WaitingRoomRulesArgs | WaitingRoomRulesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WaitingRoomRulesState | undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
            resourceInputs["waitingRoomId"] = state ? state.waitingRoomId : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as WaitingRoomRulesArgs | undefined;
            if ((!args || args.waitingRoomId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'waitingRoomId'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["rules"] = args ? args.rules : undefined;
            resourceInputs["waitingRoomId"] = args ? args.waitingRoomId : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WaitingRoomRules.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WaitingRoomRules resources.
 */
export interface WaitingRoomRulesState {
    /**
     * List of rules to apply to the ruleset.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.WaitingRoomRulesRule>[]>;
    /**
     * The Waiting Room ID the rules should apply to. **Modifying this attribute will force creation of a new resource.**
     */
    waitingRoomId?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WaitingRoomRules resource.
 */
export interface WaitingRoomRulesArgs {
    /**
     * List of rules to apply to the ruleset.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.WaitingRoomRulesRule>[]>;
    /**
     * The Waiting Room ID the rules should apply to. **Modifying this attribute will force creation of a new resource.**
     */
    waitingRoomId: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId: pulumi.Input<string>;
}