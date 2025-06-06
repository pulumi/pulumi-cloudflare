// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/ruleset:Ruleset example '<{accounts|zones}/{account_id|zone_id}>/<ruleset_id>'
 * ```
 */
export class Ruleset extends pulumi.CustomResource {
    /**
     * Get an existing Ruleset resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RulesetState, opts?: pulumi.CustomResourceOptions): Ruleset {
        return new Ruleset(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/ruleset:Ruleset';

    /**
     * Returns true if the given object is an instance of Ruleset.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Ruleset {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Ruleset.__pulumiType;
    }

    /**
     * The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * An informative description of the ruleset.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The kind of the ruleset.
     * Available values: "managed", "custom", "root", "zone".
     */
    public readonly kind!: pulumi.Output<string>;
    /**
     * The human-readable name of the ruleset.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The phase of the ruleset.
     * Available values: "ddos*l4", "ddos*l7", "http*config*settings", "http*custom*errors", "http*log*custom*fields", "http*ratelimit", "http*request*cache*settings", "http*request*dynamic*redirect", "http*request*firewall*custom", "http*request*firewall*managed", "http*request*late*transform", "http*request*origin", "http*request*redirect", "http*request*sanitize", "http*request*sbfm", "http*request*transform", "http*response*compression", "http*response*firewall*managed", "http*response*headers*transform", "magic*transit", "magic*transit*ids*managed", "magic*transit*managed", "magic*transit_ratelimit".
     */
    public readonly phase!: pulumi.Output<string>;
    /**
     * The list of rules in the ruleset.
     */
    public readonly rules!: pulumi.Output<outputs.RulesetRule[] | undefined>;
    /**
     * The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     */
    public readonly zoneId!: pulumi.Output<string | undefined>;

    /**
     * Create a Ruleset resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RulesetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RulesetArgs | RulesetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RulesetState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["kind"] = state ? state.kind : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["phase"] = state ? state.phase : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as RulesetArgs | undefined;
            if ((!args || args.kind === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kind'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.phase === undefined) && !opts.urn) {
                throw new Error("Missing required property 'phase'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["kind"] = args ? args.kind : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["phase"] = args ? args.phase : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Ruleset.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Ruleset resources.
 */
export interface RulesetState {
    /**
     * The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     */
    accountId?: pulumi.Input<string>;
    /**
     * An informative description of the ruleset.
     */
    description?: pulumi.Input<string>;
    /**
     * The kind of the ruleset.
     * Available values: "managed", "custom", "root", "zone".
     */
    kind?: pulumi.Input<string>;
    /**
     * The human-readable name of the ruleset.
     */
    name?: pulumi.Input<string>;
    /**
     * The phase of the ruleset.
     * Available values: "ddos*l4", "ddos*l7", "http*config*settings", "http*custom*errors", "http*log*custom*fields", "http*ratelimit", "http*request*cache*settings", "http*request*dynamic*redirect", "http*request*firewall*custom", "http*request*firewall*managed", "http*request*late*transform", "http*request*origin", "http*request*redirect", "http*request*sanitize", "http*request*sbfm", "http*request*transform", "http*response*compression", "http*response*firewall*managed", "http*response*headers*transform", "magic*transit", "magic*transit*ids*managed", "magic*transit*managed", "magic*transit_ratelimit".
     */
    phase?: pulumi.Input<string>;
    /**
     * The list of rules in the ruleset.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.RulesetRule>[]>;
    /**
     * The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Ruleset resource.
 */
export interface RulesetArgs {
    /**
     * The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     */
    accountId?: pulumi.Input<string>;
    /**
     * An informative description of the ruleset.
     */
    description?: pulumi.Input<string>;
    /**
     * The kind of the ruleset.
     * Available values: "managed", "custom", "root", "zone".
     */
    kind: pulumi.Input<string>;
    /**
     * The human-readable name of the ruleset.
     */
    name: pulumi.Input<string>;
    /**
     * The phase of the ruleset.
     * Available values: "ddos*l4", "ddos*l7", "http*config*settings", "http*custom*errors", "http*log*custom*fields", "http*ratelimit", "http*request*cache*settings", "http*request*dynamic*redirect", "http*request*firewall*custom", "http*request*firewall*managed", "http*request*late*transform", "http*request*origin", "http*request*redirect", "http*request*sanitize", "http*request*sbfm", "http*request*transform", "http*response*compression", "http*response*firewall*managed", "http*response*headers*transform", "magic*transit", "magic*transit*ids*managed", "magic*transit*managed", "magic*transit_ratelimit".
     */
    phase: pulumi.Input<string>;
    /**
     * The list of rules in the ruleset.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.RulesetRule>[]>;
    /**
     * The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     */
    zoneId?: pulumi.Input<string>;
}
