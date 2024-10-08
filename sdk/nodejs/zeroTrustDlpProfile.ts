// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare DLP Profile resource. Data Loss Prevention profiles
 * are a set of entries that can be matched in HTTP bodies or files.
 * They are referenced in Zero Trust Gateway rules.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Predefined profile must be imported, cannot be created
 * const creds = new cloudflare.ZeroTrustDlpProfile("creds", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "Credentials and Secrets",
 *     type: "predefined",
 *     allowedMatchCount: 3,
 *     entries: [
 *         {
 *             enabled: true,
 *             name: "Amazon AWS Access Key ID",
 *             id: "d8fcfc9c-773c-405e-8426-21ecbb67ba93",
 *         },
 *         {
 *             enabled: false,
 *             id: "2c0e33e1-71da-40c8-aad3-32e674ad3d96",
 *             name: "Amazon AWS Secret Access Key",
 *         },
 *         {
 *             enabled: true,
 *             id: "4e92c006-3802-4dff-bbe1-8e1513b1c92a",
 *             name: "Microsoft Azure Client Secret",
 *         },
 *         {
 *             enabled: false,
 *             id: "5c713294-2375-4904-abcf-e4a15be4d592",
 *             name: "SSH Private Key",
 *         },
 *         {
 *             enabled: true,
 *             id: "6c6579e4-d832-42d5-905c-8e53340930f2",
 *             name: "Google GCP API Key",
 *         },
 *     ],
 * });
 * // Custom profile
 * const exampleCustom = new cloudflare.ZeroTrustDlpProfile("example_custom", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "Example Custom Profile",
 *     description: "A profile with example entries",
 *     type: "custom",
 *     allowedMatchCount: 0,
 *     entries: [
 *         {
 *             name: "Matches visa credit cards",
 *             enabled: true,
 *             pattern: {
 *                 regex: "4\\d{3}([-\\. ])?\\d{4}([-\\. ])?\\d{4}([-\\. ])?\\d{4}",
 *                 validation: "luhn",
 *             },
 *         },
 *         {
 *             name: "Matches diners club card",
 *             enabled: true,
 *             pattern: {
 *                 regex: "(?:0[0-5]|[68][0-9])[0-9]{11}",
 *                 validation: "luhn",
 *             },
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/zeroTrustDlpProfile:ZeroTrustDlpProfile example <account_id>/<dlp_profile_id>
 * ```
 */
export class ZeroTrustDlpProfile extends pulumi.CustomResource {
    /**
     * Get an existing ZeroTrustDlpProfile resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZeroTrustDlpProfileState, opts?: pulumi.CustomResourceOptions): ZeroTrustDlpProfile {
        return new ZeroTrustDlpProfile(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/zeroTrustDlpProfile:ZeroTrustDlpProfile';

    /**
     * Returns true if the given object is an instance of ZeroTrustDlpProfile.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ZeroTrustDlpProfile {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ZeroTrustDlpProfile.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Related DLP policies will trigger when the match count exceeds the number set.
     */
    public readonly allowedMatchCount!: pulumi.Output<number>;
    /**
     * Scan the context of predefined entries to only return matches surrounded by keywords.
     */
    public readonly contextAwareness!: pulumi.Output<outputs.ZeroTrustDlpProfileContextAwareness>;
    /**
     * Brief summary of the profile and its intended use.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * List of entries to apply to the profile.
     */
    public readonly entries!: pulumi.Output<outputs.ZeroTrustDlpProfileEntry[]>;
    /**
     * Name of the profile. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * If true, scan images via OCR to determine if any text present matches filters.
     */
    public readonly ocrEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a ZeroTrustDlpProfile resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ZeroTrustDlpProfileArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ZeroTrustDlpProfileArgs | ZeroTrustDlpProfileState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ZeroTrustDlpProfileState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["allowedMatchCount"] = state ? state.allowedMatchCount : undefined;
            resourceInputs["contextAwareness"] = state ? state.contextAwareness : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["entries"] = state ? state.entries : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ocrEnabled"] = state ? state.ocrEnabled : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as ZeroTrustDlpProfileArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.allowedMatchCount === undefined) && !opts.urn) {
                throw new Error("Missing required property 'allowedMatchCount'");
            }
            if ((!args || args.entries === undefined) && !opts.urn) {
                throw new Error("Missing required property 'entries'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["allowedMatchCount"] = args ? args.allowedMatchCount : undefined;
            resourceInputs["contextAwareness"] = args ? args.contextAwareness : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["entries"] = args ? args.entries : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["ocrEnabled"] = args ? args.ocrEnabled : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ZeroTrustDlpProfile.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ZeroTrustDlpProfile resources.
 */
export interface ZeroTrustDlpProfileState {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId?: pulumi.Input<string>;
    /**
     * Related DLP policies will trigger when the match count exceeds the number set.
     */
    allowedMatchCount?: pulumi.Input<number>;
    /**
     * Scan the context of predefined entries to only return matches surrounded by keywords.
     */
    contextAwareness?: pulumi.Input<inputs.ZeroTrustDlpProfileContextAwareness>;
    /**
     * Brief summary of the profile and its intended use.
     */
    description?: pulumi.Input<string>;
    /**
     * List of entries to apply to the profile.
     */
    entries?: pulumi.Input<pulumi.Input<inputs.ZeroTrustDlpProfileEntry>[]>;
    /**
     * Name of the profile. **Modifying this attribute will force creation of a new resource.**
     */
    name?: pulumi.Input<string>;
    /**
     * If true, scan images via OCR to determine if any text present matches filters.
     */
    ocrEnabled?: pulumi.Input<boolean>;
    /**
     * The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ZeroTrustDlpProfile resource.
 */
export interface ZeroTrustDlpProfileArgs {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId: pulumi.Input<string>;
    /**
     * Related DLP policies will trigger when the match count exceeds the number set.
     */
    allowedMatchCount: pulumi.Input<number>;
    /**
     * Scan the context of predefined entries to only return matches surrounded by keywords.
     */
    contextAwareness?: pulumi.Input<inputs.ZeroTrustDlpProfileContextAwareness>;
    /**
     * Brief summary of the profile and its intended use.
     */
    description?: pulumi.Input<string>;
    /**
     * List of entries to apply to the profile.
     */
    entries: pulumi.Input<pulumi.Input<inputs.ZeroTrustDlpProfileEntry>[]>;
    /**
     * Name of the profile. **Modifying this attribute will force creation of a new resource.**
     */
    name: pulumi.Input<string>;
    /**
     * If true, scan images via OCR to determine if any text present matches filters.
     */
    ocrEnabled?: pulumi.Input<boolean>;
    /**
     * The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
     */
    type: pulumi.Input<string>;
}
