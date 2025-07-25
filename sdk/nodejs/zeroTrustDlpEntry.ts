// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleZeroTrustDlpEntry = new cloudflare.ZeroTrustDlpEntry("example_zero_trust_dlp_entry", {
 *     accountId: "account_id",
 *     enabled: true,
 *     name: "name",
 *     pattern: {
 *         regex: "regex",
 *         validation: "luhn",
 *     },
 *     profileId: "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/zeroTrustDlpEntry:ZeroTrustDlpEntry example '<account_id>/<entry_id>'
 * ```
 */
export class ZeroTrustDlpEntry extends pulumi.CustomResource {
    /**
     * Get an existing ZeroTrustDlpEntry resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZeroTrustDlpEntryState, opts?: pulumi.CustomResourceOptions): ZeroTrustDlpEntry {
        return new ZeroTrustDlpEntry(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/zeroTrustDlpEntry:ZeroTrustDlpEntry';

    /**
     * Returns true if the given object is an instance of ZeroTrustDlpEntry.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ZeroTrustDlpEntry {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ZeroTrustDlpEntry.__pulumiType;
    }

    public readonly accountId!: pulumi.Output<string>;
    /**
     * Only applies to custom word lists.
     * Determines if the words should be matched in a case-sensitive manner
     * Cannot be set to false if secret is true
     */
    public /*out*/ readonly caseSensitive!: pulumi.Output<boolean>;
    public /*out*/ readonly confidence!: pulumi.Output<outputs.ZeroTrustDlpEntryConfidence>;
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    public readonly enabled!: pulumi.Output<boolean>;
    public readonly name!: pulumi.Output<string>;
    public readonly pattern!: pulumi.Output<outputs.ZeroTrustDlpEntryPattern>;
    public readonly profileId!: pulumi.Output<string>;
    public /*out*/ readonly secret!: pulumi.Output<boolean>;
    /**
     * Available values: "custom", "predefined", "integration".
     */
    public readonly type!: pulumi.Output<string | undefined>;
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;
    public /*out*/ readonly wordList!: pulumi.Output<string>;

    /**
     * Create a ZeroTrustDlpEntry resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ZeroTrustDlpEntryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ZeroTrustDlpEntryArgs | ZeroTrustDlpEntryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ZeroTrustDlpEntryState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["caseSensitive"] = state ? state.caseSensitive : undefined;
            resourceInputs["confidence"] = state ? state.confidence : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["pattern"] = state ? state.pattern : undefined;
            resourceInputs["profileId"] = state ? state.profileId : undefined;
            resourceInputs["secret"] = state ? state.secret : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
            resourceInputs["wordList"] = state ? state.wordList : undefined;
        } else {
            const args = argsOrState as ZeroTrustDlpEntryArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.pattern === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pattern'");
            }
            if ((!args || args.profileId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'profileId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["pattern"] = args ? args.pattern : undefined;
            resourceInputs["profileId"] = args ? args.profileId : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["caseSensitive"] = undefined /*out*/;
            resourceInputs["confidence"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["secret"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
            resourceInputs["wordList"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ZeroTrustDlpEntry.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ZeroTrustDlpEntry resources.
 */
export interface ZeroTrustDlpEntryState {
    accountId?: pulumi.Input<string>;
    /**
     * Only applies to custom word lists.
     * Determines if the words should be matched in a case-sensitive manner
     * Cannot be set to false if secret is true
     */
    caseSensitive?: pulumi.Input<boolean>;
    confidence?: pulumi.Input<inputs.ZeroTrustDlpEntryConfidence>;
    createdAt?: pulumi.Input<string>;
    enabled?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
    pattern?: pulumi.Input<inputs.ZeroTrustDlpEntryPattern>;
    profileId?: pulumi.Input<string>;
    secret?: pulumi.Input<boolean>;
    /**
     * Available values: "custom", "predefined", "integration".
     */
    type?: pulumi.Input<string>;
    updatedAt?: pulumi.Input<string>;
    wordList?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ZeroTrustDlpEntry resource.
 */
export interface ZeroTrustDlpEntryArgs {
    accountId: pulumi.Input<string>;
    enabled: pulumi.Input<boolean>;
    name: pulumi.Input<string>;
    pattern: pulumi.Input<inputs.ZeroTrustDlpEntryPattern>;
    profileId: pulumi.Input<string>;
    /**
     * Available values: "custom", "predefined", "integration".
     */
    type?: pulumi.Input<string>;
}
