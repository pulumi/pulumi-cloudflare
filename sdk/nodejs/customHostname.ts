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
 * $ pulumi import cloudflare:index/customHostname:CustomHostname example '<zone_id>/<custom_hostname_id>'
 * ```
 */
export class CustomHostname extends pulumi.CustomResource {
    /**
     * Get an existing CustomHostname resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomHostnameState, opts?: pulumi.CustomResourceOptions): CustomHostname {
        return new CustomHostname(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/customHostname:CustomHostname';

    /**
     * Returns true if the given object is an instance of CustomHostname.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CustomHostname {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CustomHostname.__pulumiType;
    }

    /**
     * This is the time the hostname was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Unique key/value metadata for this hostname. These are per-hostname (customer) settings.
     */
    public readonly customMetadata!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * a valid hostname that’s been added to your DNS zone as an A, AAAA, or CNAME record.
     */
    public readonly customOriginServer!: pulumi.Output<string | undefined>;
    /**
     * A hostname that will be sent to your custom origin server as SNI for TLS handshake. This can be a valid subdomain of the zone or custom origin server name or the string ':request*host*header:' which will cause the host header in the request to be used as SNI. Not configurable with default/fallback origin server.
     */
    public readonly customOriginSni!: pulumi.Output<string | undefined>;
    /**
     * The custom hostname that will point to your hostname via CNAME.
     */
    public readonly hostname!: pulumi.Output<string>;
    /**
     * This is a record which can be placed to activate a hostname.
     */
    public /*out*/ readonly ownershipVerification!: pulumi.Output<outputs.CustomHostnameOwnershipVerification>;
    /**
     * This presents the token to be served by the given http url to activate a hostname.
     */
    public /*out*/ readonly ownershipVerificationHttp!: pulumi.Output<outputs.CustomHostnameOwnershipVerificationHttp>;
    /**
     * SSL properties used when creating the custom hostname.
     */
    public readonly ssl!: pulumi.Output<outputs.CustomHostnameSsl>;
    /**
     * Status of the hostname's activation.
     * Available values: "active", "pending", "active*redeploying", "moved", "pending*deletion", "deleted", "pending*blocked", "pending*migration", "pending*provisioned", "test*pending", "test*active", "test*active*apex", "test*blocked", "testFailed", "provisioned", "blocked".
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * These are errors that were encountered while trying to activate a hostname.
     */
    public /*out*/ readonly verificationErrors!: pulumi.Output<string[]>;
    /**
     * Identifier.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a CustomHostname resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomHostnameArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CustomHostnameArgs | CustomHostnameState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CustomHostnameState | undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["customMetadata"] = state ? state.customMetadata : undefined;
            resourceInputs["customOriginServer"] = state ? state.customOriginServer : undefined;
            resourceInputs["customOriginSni"] = state ? state.customOriginSni : undefined;
            resourceInputs["hostname"] = state ? state.hostname : undefined;
            resourceInputs["ownershipVerification"] = state ? state.ownershipVerification : undefined;
            resourceInputs["ownershipVerificationHttp"] = state ? state.ownershipVerificationHttp : undefined;
            resourceInputs["ssl"] = state ? state.ssl : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["verificationErrors"] = state ? state.verificationErrors : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as CustomHostnameArgs | undefined;
            if ((!args || args.hostname === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostname'");
            }
            if ((!args || args.ssl === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ssl'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["customMetadata"] = args ? args.customMetadata : undefined;
            resourceInputs["customOriginServer"] = args ? args.customOriginServer : undefined;
            resourceInputs["customOriginSni"] = args ? args.customOriginSni : undefined;
            resourceInputs["hostname"] = args ? args.hostname : undefined;
            resourceInputs["ssl"] = args ? args.ssl : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["ownershipVerification"] = undefined /*out*/;
            resourceInputs["ownershipVerificationHttp"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["verificationErrors"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CustomHostname.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomHostname resources.
 */
export interface CustomHostnameState {
    /**
     * This is the time the hostname was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Unique key/value metadata for this hostname. These are per-hostname (customer) settings.
     */
    customMetadata?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * a valid hostname that’s been added to your DNS zone as an A, AAAA, or CNAME record.
     */
    customOriginServer?: pulumi.Input<string>;
    /**
     * A hostname that will be sent to your custom origin server as SNI for TLS handshake. This can be a valid subdomain of the zone or custom origin server name or the string ':request*host*header:' which will cause the host header in the request to be used as SNI. Not configurable with default/fallback origin server.
     */
    customOriginSni?: pulumi.Input<string>;
    /**
     * The custom hostname that will point to your hostname via CNAME.
     */
    hostname?: pulumi.Input<string>;
    /**
     * This is a record which can be placed to activate a hostname.
     */
    ownershipVerification?: pulumi.Input<inputs.CustomHostnameOwnershipVerification>;
    /**
     * This presents the token to be served by the given http url to activate a hostname.
     */
    ownershipVerificationHttp?: pulumi.Input<inputs.CustomHostnameOwnershipVerificationHttp>;
    /**
     * SSL properties used when creating the custom hostname.
     */
    ssl?: pulumi.Input<inputs.CustomHostnameSsl>;
    /**
     * Status of the hostname's activation.
     * Available values: "active", "pending", "active*redeploying", "moved", "pending*deletion", "deleted", "pending*blocked", "pending*migration", "pending*provisioned", "test*pending", "test*active", "test*active*apex", "test*blocked", "testFailed", "provisioned", "blocked".
     */
    status?: pulumi.Input<string>;
    /**
     * These are errors that were encountered while trying to activate a hostname.
     */
    verificationErrors?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Identifier.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CustomHostname resource.
 */
export interface CustomHostnameArgs {
    /**
     * Unique key/value metadata for this hostname. These are per-hostname (customer) settings.
     */
    customMetadata?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * a valid hostname that’s been added to your DNS zone as an A, AAAA, or CNAME record.
     */
    customOriginServer?: pulumi.Input<string>;
    /**
     * A hostname that will be sent to your custom origin server as SNI for TLS handshake. This can be a valid subdomain of the zone or custom origin server name or the string ':request*host*header:' which will cause the host header in the request to be used as SNI. Not configurable with default/fallback origin server.
     */
    customOriginSni?: pulumi.Input<string>;
    /**
     * The custom hostname that will point to your hostname via CNAME.
     */
    hostname: pulumi.Input<string>;
    /**
     * SSL properties used when creating the custom hostname.
     */
    ssl: pulumi.Input<inputs.CustomHostnameSsl>;
    /**
     * Identifier.
     */
    zoneId: pulumi.Input<string>;
}
