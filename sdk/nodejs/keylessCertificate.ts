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
 * $ pulumi import cloudflare:index/keylessCertificate:KeylessCertificate example '<zone_id>/<keyless_certificate_id>'
 * ```
 */
export class KeylessCertificate extends pulumi.CustomResource {
    /**
     * Get an existing KeylessCertificate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KeylessCertificateState, opts?: pulumi.CustomResourceOptions): KeylessCertificate {
        return new KeylessCertificate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/keylessCertificate:KeylessCertificate';

    /**
     * Returns true if the given object is an instance of KeylessCertificate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KeylessCertificate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KeylessCertificate.__pulumiType;
    }

    /**
     * A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
     * Available values: "ubiquitous", "optimal", "force".
     */
    public readonly bundleMethod!: pulumi.Output<string>;
    /**
     * The zone's SSL certificate or SSL certificate and intermediate(s).
     */
    public readonly certificate!: pulumi.Output<string>;
    /**
     * When the Keyless SSL was created.
     */
    public /*out*/ readonly createdOn!: pulumi.Output<string>;
    /**
     * Whether or not the Keyless SSL is on or off.
     *
     * @deprecated This attribute is deprecated.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The keyless SSL name.
     */
    public readonly host!: pulumi.Output<string>;
    /**
     * When the Keyless SSL was last modified.
     */
    public /*out*/ readonly modifiedOn!: pulumi.Output<string>;
    /**
     * The keyless SSL name.
     */
    public readonly name!: pulumi.Output<string | undefined>;
    /**
     * Available permissions for the Keyless SSL for the current user requesting the item.
     */
    public /*out*/ readonly permissions!: pulumi.Output<string[]>;
    /**
     * The keyless SSL port used to communicate between Cloudflare and the client's Keyless SSL server.
     */
    public readonly port!: pulumi.Output<number>;
    /**
     * Status of the Keyless SSL.
     * Available values: "active", "deleted".
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Configuration for using Keyless SSL through a Cloudflare Tunnel
     */
    public readonly tunnel!: pulumi.Output<outputs.KeylessCertificateTunnel | undefined>;
    /**
     * Identifier.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a KeylessCertificate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KeylessCertificateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KeylessCertificateArgs | KeylessCertificateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KeylessCertificateState | undefined;
            resourceInputs["bundleMethod"] = state ? state.bundleMethod : undefined;
            resourceInputs["certificate"] = state ? state.certificate : undefined;
            resourceInputs["createdOn"] = state ? state.createdOn : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["host"] = state ? state.host : undefined;
            resourceInputs["modifiedOn"] = state ? state.modifiedOn : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["permissions"] = state ? state.permissions : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tunnel"] = state ? state.tunnel : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as KeylessCertificateArgs | undefined;
            if ((!args || args.certificate === undefined) && !opts.urn) {
                throw new Error("Missing required property 'certificate'");
            }
            if ((!args || args.host === undefined) && !opts.urn) {
                throw new Error("Missing required property 'host'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["bundleMethod"] = args ? args.bundleMethod : undefined;
            resourceInputs["certificate"] = args ? args.certificate : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["host"] = args ? args.host : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["port"] = args ? args.port : undefined;
            resourceInputs["tunnel"] = args ? args.tunnel : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["createdOn"] = undefined /*out*/;
            resourceInputs["modifiedOn"] = undefined /*out*/;
            resourceInputs["permissions"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(KeylessCertificate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KeylessCertificate resources.
 */
export interface KeylessCertificateState {
    /**
     * A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
     * Available values: "ubiquitous", "optimal", "force".
     */
    bundleMethod?: pulumi.Input<string>;
    /**
     * The zone's SSL certificate or SSL certificate and intermediate(s).
     */
    certificate?: pulumi.Input<string>;
    /**
     * When the Keyless SSL was created.
     */
    createdOn?: pulumi.Input<string>;
    /**
     * Whether or not the Keyless SSL is on or off.
     *
     * @deprecated This attribute is deprecated.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The keyless SSL name.
     */
    host?: pulumi.Input<string>;
    /**
     * When the Keyless SSL was last modified.
     */
    modifiedOn?: pulumi.Input<string>;
    /**
     * The keyless SSL name.
     */
    name?: pulumi.Input<string>;
    /**
     * Available permissions for the Keyless SSL for the current user requesting the item.
     */
    permissions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The keyless SSL port used to communicate between Cloudflare and the client's Keyless SSL server.
     */
    port?: pulumi.Input<number>;
    /**
     * Status of the Keyless SSL.
     * Available values: "active", "deleted".
     */
    status?: pulumi.Input<string>;
    /**
     * Configuration for using Keyless SSL through a Cloudflare Tunnel
     */
    tunnel?: pulumi.Input<inputs.KeylessCertificateTunnel>;
    /**
     * Identifier.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a KeylessCertificate resource.
 */
export interface KeylessCertificateArgs {
    /**
     * A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
     * Available values: "ubiquitous", "optimal", "force".
     */
    bundleMethod?: pulumi.Input<string>;
    /**
     * The zone's SSL certificate or SSL certificate and intermediate(s).
     */
    certificate: pulumi.Input<string>;
    /**
     * Whether or not the Keyless SSL is on or off.
     *
     * @deprecated This attribute is deprecated.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The keyless SSL name.
     */
    host: pulumi.Input<string>;
    /**
     * The keyless SSL name.
     */
    name?: pulumi.Input<string>;
    /**
     * The keyless SSL port used to communicate between Cloudflare and the client's Keyless SSL server.
     */
    port?: pulumi.Input<number>;
    /**
     * Configuration for using Keyless SSL through a Cloudflare Tunnel
     */
    tunnel?: pulumi.Input<inputs.KeylessCertificateTunnel>;
    /**
     * Identifier.
     */
    zoneId: pulumi.Input<string>;
}
