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
 * const exampleZoneDnssec = new cloudflare.ZoneDnssec("example_zone_dnssec", {
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     dnssecMultiSigner: false,
 *     dnssecPresigned: true,
 *     dnssecUseNsec3: false,
 *     status: "active",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/zoneDnssec:ZoneDnssec example '<zone_id>'
 * ```
 */
export class ZoneDnssec extends pulumi.CustomResource {
    /**
     * Get an existing ZoneDnssec resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZoneDnssecState, opts?: pulumi.CustomResourceOptions): ZoneDnssec {
        return new ZoneDnssec(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/zoneDnssec:ZoneDnssec';

    /**
     * Returns true if the given object is an instance of ZoneDnssec.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ZoneDnssec {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ZoneDnssec.__pulumiType;
    }

    /**
     * Algorithm key code.
     */
    public /*out*/ readonly algorithm!: pulumi.Output<string>;
    /**
     * Digest hash.
     */
    public /*out*/ readonly digest!: pulumi.Output<string>;
    /**
     * Type of digest algorithm.
     */
    public /*out*/ readonly digestAlgorithm!: pulumi.Output<string>;
    /**
     * Coded type for digest algorithm.
     */
    public /*out*/ readonly digestType!: pulumi.Output<string>;
    /**
     * If true, multi-signer DNSSEC is enabled on the zone, allowing multiple
     * providers to serve a DNSSEC-signed zone at the same time.
     * This is required for DNSKEY records (except those automatically
     * generated by Cloudflare) to be added to the zone.
     */
    public readonly dnssecMultiSigner!: pulumi.Output<boolean | undefined>;
    /**
     * If true, allows Cloudflare to transfer in a DNSSEC-signed zone including signatures from an external provider, without
     * requiring Cloudflare to sign any records on the fly. Note that this feature has some limitations. See [Cloudflare as
     * Secondary](https://developers.cloudflare.com/dns/zone-setups/zone-transfers/cloudflare-as-secondary/setup/#dnssec) for
     * details.
     */
    public readonly dnssecPresigned!: pulumi.Output<boolean | undefined>;
    /**
     * If true, enables the use of NSEC3 together with DNSSEC on the zone. Combined with setting dnssecPresigned to true, this
     * enables the use of NSEC3 records when transferring in from an external provider. If dnssecPresigned is instead set to
     * false (default), NSEC3 records will be generated and signed at request time. See [DNSSEC with
     * NSEC3](https://developers.cloudflare.com/dns/dnssec/enable-nsec3/) for details.
     */
    public readonly dnssecUseNsec3!: pulumi.Output<boolean | undefined>;
    /**
     * Full DS record.
     */
    public /*out*/ readonly ds!: pulumi.Output<string>;
    /**
     * Flag for DNSSEC record.
     */
    public /*out*/ readonly flags!: pulumi.Output<number>;
    /**
     * Code for key tag.
     */
    public /*out*/ readonly keyTag!: pulumi.Output<number>;
    /**
     * Algorithm key type.
     */
    public /*out*/ readonly keyType!: pulumi.Output<string>;
    /**
     * When DNSSEC was last modified.
     */
    public /*out*/ readonly modifiedOn!: pulumi.Output<string>;
    /**
     * Public key for DS record.
     */
    public /*out*/ readonly publicKey!: pulumi.Output<string>;
    /**
     * Status of DNSSEC, based on user-desired state and presence of necessary records. Available values: "active", "disabled".
     */
    public readonly status!: pulumi.Output<string | undefined>;
    /**
     * Identifier.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a ZoneDnssec resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ZoneDnssecArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ZoneDnssecArgs | ZoneDnssecState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ZoneDnssecState | undefined;
            resourceInputs["algorithm"] = state ? state.algorithm : undefined;
            resourceInputs["digest"] = state ? state.digest : undefined;
            resourceInputs["digestAlgorithm"] = state ? state.digestAlgorithm : undefined;
            resourceInputs["digestType"] = state ? state.digestType : undefined;
            resourceInputs["dnssecMultiSigner"] = state ? state.dnssecMultiSigner : undefined;
            resourceInputs["dnssecPresigned"] = state ? state.dnssecPresigned : undefined;
            resourceInputs["dnssecUseNsec3"] = state ? state.dnssecUseNsec3 : undefined;
            resourceInputs["ds"] = state ? state.ds : undefined;
            resourceInputs["flags"] = state ? state.flags : undefined;
            resourceInputs["keyTag"] = state ? state.keyTag : undefined;
            resourceInputs["keyType"] = state ? state.keyType : undefined;
            resourceInputs["modifiedOn"] = state ? state.modifiedOn : undefined;
            resourceInputs["publicKey"] = state ? state.publicKey : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ZoneDnssecArgs | undefined;
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["dnssecMultiSigner"] = args ? args.dnssecMultiSigner : undefined;
            resourceInputs["dnssecPresigned"] = args ? args.dnssecPresigned : undefined;
            resourceInputs["dnssecUseNsec3"] = args ? args.dnssecUseNsec3 : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["algorithm"] = undefined /*out*/;
            resourceInputs["digest"] = undefined /*out*/;
            resourceInputs["digestAlgorithm"] = undefined /*out*/;
            resourceInputs["digestType"] = undefined /*out*/;
            resourceInputs["ds"] = undefined /*out*/;
            resourceInputs["flags"] = undefined /*out*/;
            resourceInputs["keyTag"] = undefined /*out*/;
            resourceInputs["keyType"] = undefined /*out*/;
            resourceInputs["modifiedOn"] = undefined /*out*/;
            resourceInputs["publicKey"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ZoneDnssec.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ZoneDnssec resources.
 */
export interface ZoneDnssecState {
    /**
     * Algorithm key code.
     */
    algorithm?: pulumi.Input<string>;
    /**
     * Digest hash.
     */
    digest?: pulumi.Input<string>;
    /**
     * Type of digest algorithm.
     */
    digestAlgorithm?: pulumi.Input<string>;
    /**
     * Coded type for digest algorithm.
     */
    digestType?: pulumi.Input<string>;
    /**
     * If true, multi-signer DNSSEC is enabled on the zone, allowing multiple
     * providers to serve a DNSSEC-signed zone at the same time.
     * This is required for DNSKEY records (except those automatically
     * generated by Cloudflare) to be added to the zone.
     */
    dnssecMultiSigner?: pulumi.Input<boolean>;
    /**
     * If true, allows Cloudflare to transfer in a DNSSEC-signed zone including signatures from an external provider, without
     * requiring Cloudflare to sign any records on the fly. Note that this feature has some limitations. See [Cloudflare as
     * Secondary](https://developers.cloudflare.com/dns/zone-setups/zone-transfers/cloudflare-as-secondary/setup/#dnssec) for
     * details.
     */
    dnssecPresigned?: pulumi.Input<boolean>;
    /**
     * If true, enables the use of NSEC3 together with DNSSEC on the zone. Combined with setting dnssecPresigned to true, this
     * enables the use of NSEC3 records when transferring in from an external provider. If dnssecPresigned is instead set to
     * false (default), NSEC3 records will be generated and signed at request time. See [DNSSEC with
     * NSEC3](https://developers.cloudflare.com/dns/dnssec/enable-nsec3/) for details.
     */
    dnssecUseNsec3?: pulumi.Input<boolean>;
    /**
     * Full DS record.
     */
    ds?: pulumi.Input<string>;
    /**
     * Flag for DNSSEC record.
     */
    flags?: pulumi.Input<number>;
    /**
     * Code for key tag.
     */
    keyTag?: pulumi.Input<number>;
    /**
     * Algorithm key type.
     */
    keyType?: pulumi.Input<string>;
    /**
     * When DNSSEC was last modified.
     */
    modifiedOn?: pulumi.Input<string>;
    /**
     * Public key for DS record.
     */
    publicKey?: pulumi.Input<string>;
    /**
     * Status of DNSSEC, based on user-desired state and presence of necessary records. Available values: "active", "disabled".
     */
    status?: pulumi.Input<string>;
    /**
     * Identifier.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ZoneDnssec resource.
 */
export interface ZoneDnssecArgs {
    /**
     * If true, multi-signer DNSSEC is enabled on the zone, allowing multiple
     * providers to serve a DNSSEC-signed zone at the same time.
     * This is required for DNSKEY records (except those automatically
     * generated by Cloudflare) to be added to the zone.
     */
    dnssecMultiSigner?: pulumi.Input<boolean>;
    /**
     * If true, allows Cloudflare to transfer in a DNSSEC-signed zone including signatures from an external provider, without
     * requiring Cloudflare to sign any records on the fly. Note that this feature has some limitations. See [Cloudflare as
     * Secondary](https://developers.cloudflare.com/dns/zone-setups/zone-transfers/cloudflare-as-secondary/setup/#dnssec) for
     * details.
     */
    dnssecPresigned?: pulumi.Input<boolean>;
    /**
     * If true, enables the use of NSEC3 together with DNSSEC on the zone. Combined with setting dnssecPresigned to true, this
     * enables the use of NSEC3 records when transferring in from an external provider. If dnssecPresigned is instead set to
     * false (default), NSEC3 records will be generated and signed at request time. See [DNSSEC with
     * NSEC3](https://developers.cloudflare.com/dns/dnssec/enable-nsec3/) for details.
     */
    dnssecUseNsec3?: pulumi.Input<boolean>;
    /**
     * Status of DNSSEC, based on user-desired state and presence of necessary records. Available values: "active", "disabled".
     */
    status?: pulumi.Input<string>;
    /**
     * Identifier.
     */
    zoneId: pulumi.Input<string>;
}
