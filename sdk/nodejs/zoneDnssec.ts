// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Zone DNSSEC resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleZone = new cloudflare.Zone("exampleZone", {zone: "example.com"});
 * const exampleZoneDnssec = new cloudflare.ZoneDnssec("exampleZoneDnssec", {zoneId: exampleZone.id});
 * ```
 *
 * ## Import
 *
 * Zone DNSSEC resource can be imported using a zone ID, e.g.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/zoneDnssec:ZoneDnssec example d41d8cd98f00b204e9800998ecf8427e
 * ```
 *
 *  where* `d41d8cd98f00b204e9800998ecf8427e` - zone ID, as returned from [API](https://api.cloudflare.com/#zone-list-zones)
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
     * Zone DNSSEC algorithm.
     */
    public /*out*/ readonly algorithm!: pulumi.Output<string>;
    /**
     * Zone DNSSEC digest.
     */
    public /*out*/ readonly digest!: pulumi.Output<string>;
    /**
     * Digest algorithm use for Zone DNSSEC.
     */
    public /*out*/ readonly digestAlgorithm!: pulumi.Output<string>;
    /**
     * Digest Type for Zone DNSSEC.
     */
    public /*out*/ readonly digestType!: pulumi.Output<string>;
    /**
     * DS for the Zone DNSSEC.
     */
    public /*out*/ readonly ds!: pulumi.Output<string>;
    /**
     * Zone DNSSEC flags.
     */
    public /*out*/ readonly flags!: pulumi.Output<number>;
    /**
     * Key Tag for the Zone DNSSEC.
     */
    public /*out*/ readonly keyTag!: pulumi.Output<number>;
    /**
     * Key type used for Zone DNSSEC.
     */
    public /*out*/ readonly keyType!: pulumi.Output<string>;
    /**
     * Zone DNSSEC updated time.
     */
    public readonly modifiedOn!: pulumi.Output<string>;
    /**
     * Public Key for the Zone DNSSEC.
     */
    public /*out*/ readonly publicKey!: pulumi.Output<string>;
    /**
     * The status of the Zone DNSSEC.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The zone id for the zone.
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
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ZoneDnssecState | undefined;
            inputs["algorithm"] = state ? state.algorithm : undefined;
            inputs["digest"] = state ? state.digest : undefined;
            inputs["digestAlgorithm"] = state ? state.digestAlgorithm : undefined;
            inputs["digestType"] = state ? state.digestType : undefined;
            inputs["ds"] = state ? state.ds : undefined;
            inputs["flags"] = state ? state.flags : undefined;
            inputs["keyTag"] = state ? state.keyTag : undefined;
            inputs["keyType"] = state ? state.keyType : undefined;
            inputs["modifiedOn"] = state ? state.modifiedOn : undefined;
            inputs["publicKey"] = state ? state.publicKey : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ZoneDnssecArgs | undefined;
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            inputs["modifiedOn"] = args ? args.modifiedOn : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
            inputs["algorithm"] = undefined /*out*/;
            inputs["digest"] = undefined /*out*/;
            inputs["digestAlgorithm"] = undefined /*out*/;
            inputs["digestType"] = undefined /*out*/;
            inputs["ds"] = undefined /*out*/;
            inputs["flags"] = undefined /*out*/;
            inputs["keyTag"] = undefined /*out*/;
            inputs["keyType"] = undefined /*out*/;
            inputs["publicKey"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ZoneDnssec.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ZoneDnssec resources.
 */
export interface ZoneDnssecState {
    /**
     * Zone DNSSEC algorithm.
     */
    readonly algorithm?: pulumi.Input<string>;
    /**
     * Zone DNSSEC digest.
     */
    readonly digest?: pulumi.Input<string>;
    /**
     * Digest algorithm use for Zone DNSSEC.
     */
    readonly digestAlgorithm?: pulumi.Input<string>;
    /**
     * Digest Type for Zone DNSSEC.
     */
    readonly digestType?: pulumi.Input<string>;
    /**
     * DS for the Zone DNSSEC.
     */
    readonly ds?: pulumi.Input<string>;
    /**
     * Zone DNSSEC flags.
     */
    readonly flags?: pulumi.Input<number>;
    /**
     * Key Tag for the Zone DNSSEC.
     */
    readonly keyTag?: pulumi.Input<number>;
    /**
     * Key type used for Zone DNSSEC.
     */
    readonly keyType?: pulumi.Input<string>;
    /**
     * Zone DNSSEC updated time.
     */
    readonly modifiedOn?: pulumi.Input<string>;
    /**
     * Public Key for the Zone DNSSEC.
     */
    readonly publicKey?: pulumi.Input<string>;
    /**
     * The status of the Zone DNSSEC.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * The zone id for the zone.
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ZoneDnssec resource.
 */
export interface ZoneDnssecArgs {
    /**
     * Zone DNSSEC updated time.
     */
    readonly modifiedOn?: pulumi.Input<string>;
    /**
     * The zone id for the zone.
     */
    readonly zoneId: pulumi.Input<string>;
}
