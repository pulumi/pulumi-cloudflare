// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Teams Location resource. Teams Locations are
 * referenced when creating secure web gateway policies.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.TeamsLocation("example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "office",
 *     clientDefault: true,
 *     ecsSupport: false,
 *     networks: [
 *         {
 *             network: "203.0.113.1/32",
 *         },
 *         {
 *             network: "203.0.113.2/32",
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/teamsLocation:TeamsLocation example <account_id>/<teams_location_id>
 * ```
 */
export class TeamsLocation extends pulumi.CustomResource {
    /**
     * Get an existing TeamsLocation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TeamsLocationState, opts?: pulumi.CustomResourceOptions): TeamsLocation {
        return new TeamsLocation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/teamsLocation:TeamsLocation';

    /**
     * Returns true if the given object is an instance of TeamsLocation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TeamsLocation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TeamsLocation.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Indicator that anonymized logs are enabled.
     */
    public /*out*/ readonly anonymizedLogsEnabled!: pulumi.Output<boolean>;
    /**
     * Indicator that this is the default location.
     */
    public readonly clientDefault!: pulumi.Output<boolean | undefined>;
    /**
     * IPv4 binding assigned to this location.
     */
    public readonly dnsDestinationIpsId!: pulumi.Output<string>;
    /**
     * IPv6 block binding assigned to this location.
     */
    public readonly dnsDestinationIpv6BlockId!: pulumi.Output<string>;
    /**
     * The FQDN that DoH clients should be pointed at.
     */
    public /*out*/ readonly dohSubdomain!: pulumi.Output<string>;
    /**
     * Indicator that this location needs to resolve EDNS queries.
     */
    public readonly ecsSupport!: pulumi.Output<boolean | undefined>;
    /**
     * Endpoints assigned to this location.
     */
    public readonly endpoints!: pulumi.Output<outputs.TeamsLocationEndpoints | undefined>;
    /**
     * Client IP address.
     */
    public /*out*/ readonly ip!: pulumi.Output<string>;
    /**
     * IPv4 to direct all IPv4 DNS queries to.
     */
    public /*out*/ readonly ipv4Destination!: pulumi.Output<string>;
    /**
     * Backup IPv4 to direct all IPv4 DNS queries to.
     */
    public /*out*/ readonly ipv4DestinationBackup!: pulumi.Output<string>;
    /**
     * Name of the teams location.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The networks CIDRs that comprise the location.
     */
    public readonly networks!: pulumi.Output<outputs.TeamsLocationNetwork[] | undefined>;

    /**
     * Create a TeamsLocation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TeamsLocationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TeamsLocationArgs | TeamsLocationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TeamsLocationState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["anonymizedLogsEnabled"] = state ? state.anonymizedLogsEnabled : undefined;
            resourceInputs["clientDefault"] = state ? state.clientDefault : undefined;
            resourceInputs["dnsDestinationIpsId"] = state ? state.dnsDestinationIpsId : undefined;
            resourceInputs["dnsDestinationIpv6BlockId"] = state ? state.dnsDestinationIpv6BlockId : undefined;
            resourceInputs["dohSubdomain"] = state ? state.dohSubdomain : undefined;
            resourceInputs["ecsSupport"] = state ? state.ecsSupport : undefined;
            resourceInputs["endpoints"] = state ? state.endpoints : undefined;
            resourceInputs["ip"] = state ? state.ip : undefined;
            resourceInputs["ipv4Destination"] = state ? state.ipv4Destination : undefined;
            resourceInputs["ipv4DestinationBackup"] = state ? state.ipv4DestinationBackup : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networks"] = state ? state.networks : undefined;
        } else {
            const args = argsOrState as TeamsLocationArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["clientDefault"] = args ? args.clientDefault : undefined;
            resourceInputs["dnsDestinationIpsId"] = args ? args.dnsDestinationIpsId : undefined;
            resourceInputs["dnsDestinationIpv6BlockId"] = args ? args.dnsDestinationIpv6BlockId : undefined;
            resourceInputs["ecsSupport"] = args ? args.ecsSupport : undefined;
            resourceInputs["endpoints"] = args ? args.endpoints : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networks"] = args ? args.networks : undefined;
            resourceInputs["anonymizedLogsEnabled"] = undefined /*out*/;
            resourceInputs["dohSubdomain"] = undefined /*out*/;
            resourceInputs["ip"] = undefined /*out*/;
            resourceInputs["ipv4Destination"] = undefined /*out*/;
            resourceInputs["ipv4DestinationBackup"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TeamsLocation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TeamsLocation resources.
 */
export interface TeamsLocationState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Indicator that anonymized logs are enabled.
     */
    anonymizedLogsEnabled?: pulumi.Input<boolean>;
    /**
     * Indicator that this is the default location.
     */
    clientDefault?: pulumi.Input<boolean>;
    /**
     * IPv4 binding assigned to this location.
     */
    dnsDestinationIpsId?: pulumi.Input<string>;
    /**
     * IPv6 block binding assigned to this location.
     */
    dnsDestinationIpv6BlockId?: pulumi.Input<string>;
    /**
     * The FQDN that DoH clients should be pointed at.
     */
    dohSubdomain?: pulumi.Input<string>;
    /**
     * Indicator that this location needs to resolve EDNS queries.
     */
    ecsSupport?: pulumi.Input<boolean>;
    /**
     * Endpoints assigned to this location.
     */
    endpoints?: pulumi.Input<inputs.TeamsLocationEndpoints>;
    /**
     * Client IP address.
     */
    ip?: pulumi.Input<string>;
    /**
     * IPv4 to direct all IPv4 DNS queries to.
     */
    ipv4Destination?: pulumi.Input<string>;
    /**
     * Backup IPv4 to direct all IPv4 DNS queries to.
     */
    ipv4DestinationBackup?: pulumi.Input<string>;
    /**
     * Name of the teams location.
     */
    name?: pulumi.Input<string>;
    /**
     * The networks CIDRs that comprise the location.
     */
    networks?: pulumi.Input<pulumi.Input<inputs.TeamsLocationNetwork>[]>;
}

/**
 * The set of arguments for constructing a TeamsLocation resource.
 */
export interface TeamsLocationArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * Indicator that this is the default location.
     */
    clientDefault?: pulumi.Input<boolean>;
    /**
     * IPv4 binding assigned to this location.
     */
    dnsDestinationIpsId?: pulumi.Input<string>;
    /**
     * IPv6 block binding assigned to this location.
     */
    dnsDestinationIpv6BlockId?: pulumi.Input<string>;
    /**
     * Indicator that this location needs to resolve EDNS queries.
     */
    ecsSupport?: pulumi.Input<boolean>;
    /**
     * Endpoints assigned to this location.
     */
    endpoints?: pulumi.Input<inputs.TeamsLocationEndpoints>;
    /**
     * Name of the teams location.
     */
    name: pulumi.Input<string>;
    /**
     * The networks CIDRs that comprise the location.
     */
    networks?: pulumi.Input<pulumi.Input<inputs.TeamsLocationNetwork>[]>;
}
