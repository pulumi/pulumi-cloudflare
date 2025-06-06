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
 * const exampleByoIpPrefix = new cloudflare.ByoIpPrefix("example_byo_ip_prefix", {
 *     accountId: "258def64c72dae45f3e4c8516e2111f2",
 *     asn: 209242,
 *     cidr: "192.0.2.0/24",
 *     loaDocumentId: "d933b1530bc56c9953cf8ce166da8004",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/byoIpPrefix:ByoIpPrefix example '<account_id>/<prefix_id>'
 * ```
 */
export class ByoIpPrefix extends pulumi.CustomResource {
    /**
     * Get an existing ByoIpPrefix resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ByoIpPrefixState, opts?: pulumi.CustomResourceOptions): ByoIpPrefix {
        return new ByoIpPrefix(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/byoIpPrefix:ByoIpPrefix';

    /**
     * Returns true if the given object is an instance of ByoIpPrefix.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ByoIpPrefix {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ByoIpPrefix.__pulumiType;
    }

    /**
     * Identifier of a Cloudflare account.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Prefix advertisement status to the Internet. This field is only not 'null' if on demand is enabled.
     */
    public /*out*/ readonly advertised!: pulumi.Output<boolean>;
    /**
     * Last time the advertisement status was changed. This field is only not 'null' if on demand is enabled.
     */
    public /*out*/ readonly advertisedModifiedAt!: pulumi.Output<string>;
    /**
     * Approval state of the prefix (P = pending, V = active).
     */
    public /*out*/ readonly approved!: pulumi.Output<string>;
    /**
     * Autonomous System Number (ASN) the prefix will be advertised under.
     */
    public readonly asn!: pulumi.Output<number>;
    /**
     * IP Prefix in Classless Inter-Domain Routing format.
     */
    public readonly cidr!: pulumi.Output<string>;
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Description of the prefix.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Identifier for the uploaded LOA document.
     */
    public readonly loaDocumentId!: pulumi.Output<string>;
    public /*out*/ readonly modifiedAt!: pulumi.Output<string>;
    /**
     * Whether advertisement of the prefix to the Internet may be dynamically enabled or disabled.
     */
    public /*out*/ readonly onDemandEnabled!: pulumi.Output<boolean>;
    /**
     * Whether advertisement status of the prefix is locked, meaning it cannot be changed.
     */
    public /*out*/ readonly onDemandLocked!: pulumi.Output<boolean>;

    /**
     * Create a ByoIpPrefix resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ByoIpPrefixArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ByoIpPrefixArgs | ByoIpPrefixState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ByoIpPrefixState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["advertised"] = state ? state.advertised : undefined;
            resourceInputs["advertisedModifiedAt"] = state ? state.advertisedModifiedAt : undefined;
            resourceInputs["approved"] = state ? state.approved : undefined;
            resourceInputs["asn"] = state ? state.asn : undefined;
            resourceInputs["cidr"] = state ? state.cidr : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["loaDocumentId"] = state ? state.loaDocumentId : undefined;
            resourceInputs["modifiedAt"] = state ? state.modifiedAt : undefined;
            resourceInputs["onDemandEnabled"] = state ? state.onDemandEnabled : undefined;
            resourceInputs["onDemandLocked"] = state ? state.onDemandLocked : undefined;
        } else {
            const args = argsOrState as ByoIpPrefixArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.asn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'asn'");
            }
            if ((!args || args.cidr === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cidr'");
            }
            if ((!args || args.loaDocumentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'loaDocumentId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["asn"] = args ? args.asn : undefined;
            resourceInputs["cidr"] = args ? args.cidr : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["loaDocumentId"] = args ? args.loaDocumentId : undefined;
            resourceInputs["advertised"] = undefined /*out*/;
            resourceInputs["advertisedModifiedAt"] = undefined /*out*/;
            resourceInputs["approved"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["modifiedAt"] = undefined /*out*/;
            resourceInputs["onDemandEnabled"] = undefined /*out*/;
            resourceInputs["onDemandLocked"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ByoIpPrefix.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ByoIpPrefix resources.
 */
export interface ByoIpPrefixState {
    /**
     * Identifier of a Cloudflare account.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Prefix advertisement status to the Internet. This field is only not 'null' if on demand is enabled.
     */
    advertised?: pulumi.Input<boolean>;
    /**
     * Last time the advertisement status was changed. This field is only not 'null' if on demand is enabled.
     */
    advertisedModifiedAt?: pulumi.Input<string>;
    /**
     * Approval state of the prefix (P = pending, V = active).
     */
    approved?: pulumi.Input<string>;
    /**
     * Autonomous System Number (ASN) the prefix will be advertised under.
     */
    asn?: pulumi.Input<number>;
    /**
     * IP Prefix in Classless Inter-Domain Routing format.
     */
    cidr?: pulumi.Input<string>;
    createdAt?: pulumi.Input<string>;
    /**
     * Description of the prefix.
     */
    description?: pulumi.Input<string>;
    /**
     * Identifier for the uploaded LOA document.
     */
    loaDocumentId?: pulumi.Input<string>;
    modifiedAt?: pulumi.Input<string>;
    /**
     * Whether advertisement of the prefix to the Internet may be dynamically enabled or disabled.
     */
    onDemandEnabled?: pulumi.Input<boolean>;
    /**
     * Whether advertisement status of the prefix is locked, meaning it cannot be changed.
     */
    onDemandLocked?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a ByoIpPrefix resource.
 */
export interface ByoIpPrefixArgs {
    /**
     * Identifier of a Cloudflare account.
     */
    accountId: pulumi.Input<string>;
    /**
     * Autonomous System Number (ASN) the prefix will be advertised under.
     */
    asn: pulumi.Input<number>;
    /**
     * IP Prefix in Classless Inter-Domain Routing format.
     */
    cidr: pulumi.Input<string>;
    /**
     * Description of the prefix.
     */
    description?: pulumi.Input<string>;
    /**
     * Identifier for the uploaded LOA document.
     */
    loaDocumentId: pulumi.Input<string>;
}
