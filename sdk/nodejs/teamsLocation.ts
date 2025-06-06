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
 * const exampleZeroTrustDnsLocation = new cloudflare.ZeroTrustDnsLocation("example_zero_trust_dns_location", {
 *     accountId: "699d98642c564d2e855e9661899b7252",
 *     name: "Austin Office Location",
 *     clientDefault: false,
 *     dnsDestinationIpsId: "0e4a32c6-6fb8-4858-9296-98f51631e8e6",
 *     ecsSupport: false,
 *     endpoints: {
 *         doh: {
 *             enabled: true,
 *             networks: [{
 *                 network: "2001:85a3::/64",
 *             }],
 *             requireToken: true,
 *         },
 *         dot: {
 *             enabled: true,
 *             networks: [{
 *                 network: "2001:85a3::/64",
 *             }],
 *         },
 *         ipv4: {
 *             enabled: true,
 *         },
 *         ipv6: {
 *             enabled: true,
 *             networks: [{
 *                 network: "2001:85a3::/64",
 *             }],
 *         },
 *     },
 *     networks: [{
 *         network: "192.0.2.1/32",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/teamsLocation:TeamsLocation example '<account_id>/<location_id>'
 * ```
 *
 * @deprecated cloudflare.index/teamslocation.TeamsLocation has been deprecated in favor of cloudflare.index/zerotrustdnslocation.ZeroTrustDnsLocation
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
        pulumi.log.warn("TeamsLocation is deprecated: cloudflare.index/teamslocation.TeamsLocation has been deprecated in favor of cloudflare.index/zerotrustdnslocation.ZeroTrustDnsLocation")
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

    public readonly accountId!: pulumi.Output<string>;
    /**
     * True if the location is the default location.
     */
    public readonly clientDefault!: pulumi.Output<boolean>;
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The identifier of the pair of IPv4 addresses assigned to this location. When creating a location, if this field is absent or set with null, the pair of shared IPv4 addresses (0e4a32c6-6fb8-4858-9296-98f51631e8e6) is auto-assigned. When updating a location, if the field is absent or set with null, the pre-assigned pair remains unchanged.
     */
    public readonly dnsDestinationIpsId!: pulumi.Output<string | undefined>;
    /**
     * The uuid identifier of the IPv6 block brought to the gateway, so that this location's IPv6 address is allocated from the Bring Your Own Ipv6(BYOIPv6) block and not from the standard CloudFlare IPv6 block.
     */
    public /*out*/ readonly dnsDestinationIpv6BlockId!: pulumi.Output<string>;
    /**
     * The DNS over HTTPS domain to send DNS requests to. This field is auto-generated by Gateway.
     */
    public /*out*/ readonly dohSubdomain!: pulumi.Output<string>;
    /**
     * True if the location needs to resolve EDNS queries.
     */
    public readonly ecsSupport!: pulumi.Output<boolean>;
    /**
     * The destination endpoints configured for this location. When updating a location, if this field is absent or set with null, the endpoints configuration remains unchanged.
     */
    public readonly endpoints!: pulumi.Output<outputs.TeamsLocationEndpoints | undefined>;
    /**
     * IPV6 destination ip assigned to this location. DNS requests sent to this IP will counted as the request under this location. This field is auto-generated by Gateway.
     */
    public /*out*/ readonly ip!: pulumi.Output<string>;
    /**
     * The primary destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
     */
    public /*out*/ readonly ipv4Destination!: pulumi.Output<string>;
    /**
     * The backup destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
     */
    public /*out*/ readonly ipv4DestinationBackup!: pulumi.Output<string>;
    /**
     * The name of the location.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A list of network ranges that requests from this location would originate from. A non-empty list is only effective if the ipv4 endpoint is enabled for this location.
     */
    public readonly networks!: pulumi.Output<outputs.TeamsLocationNetwork[] | undefined>;
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;

    /**
     * Create a TeamsLocation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    /** @deprecated cloudflare.index/teamslocation.TeamsLocation has been deprecated in favor of cloudflare.index/zerotrustdnslocation.ZeroTrustDnsLocation */
    constructor(name: string, args: TeamsLocationArgs, opts?: pulumi.CustomResourceOptions)
    /** @deprecated cloudflare.index/teamslocation.TeamsLocation has been deprecated in favor of cloudflare.index/zerotrustdnslocation.ZeroTrustDnsLocation */
    constructor(name: string, argsOrState?: TeamsLocationArgs | TeamsLocationState, opts?: pulumi.CustomResourceOptions) {
        pulumi.log.warn("TeamsLocation is deprecated: cloudflare.index/teamslocation.TeamsLocation has been deprecated in favor of cloudflare.index/zerotrustdnslocation.ZeroTrustDnsLocation")
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TeamsLocationState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["clientDefault"] = state ? state.clientDefault : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
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
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
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
            resourceInputs["ecsSupport"] = args ? args.ecsSupport : undefined;
            resourceInputs["endpoints"] = args ? args.endpoints : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networks"] = args ? args.networks : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["dnsDestinationIpv6BlockId"] = undefined /*out*/;
            resourceInputs["dohSubdomain"] = undefined /*out*/;
            resourceInputs["ip"] = undefined /*out*/;
            resourceInputs["ipv4Destination"] = undefined /*out*/;
            resourceInputs["ipv4DestinationBackup"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "cloudflare:index/teamsLocation:TeamsLocation" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(TeamsLocation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TeamsLocation resources.
 */
export interface TeamsLocationState {
    accountId?: pulumi.Input<string>;
    /**
     * True if the location is the default location.
     */
    clientDefault?: pulumi.Input<boolean>;
    createdAt?: pulumi.Input<string>;
    /**
     * The identifier of the pair of IPv4 addresses assigned to this location. When creating a location, if this field is absent or set with null, the pair of shared IPv4 addresses (0e4a32c6-6fb8-4858-9296-98f51631e8e6) is auto-assigned. When updating a location, if the field is absent or set with null, the pre-assigned pair remains unchanged.
     */
    dnsDestinationIpsId?: pulumi.Input<string>;
    /**
     * The uuid identifier of the IPv6 block brought to the gateway, so that this location's IPv6 address is allocated from the Bring Your Own Ipv6(BYOIPv6) block and not from the standard CloudFlare IPv6 block.
     */
    dnsDestinationIpv6BlockId?: pulumi.Input<string>;
    /**
     * The DNS over HTTPS domain to send DNS requests to. This field is auto-generated by Gateway.
     */
    dohSubdomain?: pulumi.Input<string>;
    /**
     * True if the location needs to resolve EDNS queries.
     */
    ecsSupport?: pulumi.Input<boolean>;
    /**
     * The destination endpoints configured for this location. When updating a location, if this field is absent or set with null, the endpoints configuration remains unchanged.
     */
    endpoints?: pulumi.Input<inputs.TeamsLocationEndpoints>;
    /**
     * IPV6 destination ip assigned to this location. DNS requests sent to this IP will counted as the request under this location. This field is auto-generated by Gateway.
     */
    ip?: pulumi.Input<string>;
    /**
     * The primary destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
     */
    ipv4Destination?: pulumi.Input<string>;
    /**
     * The backup destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
     */
    ipv4DestinationBackup?: pulumi.Input<string>;
    /**
     * The name of the location.
     */
    name?: pulumi.Input<string>;
    /**
     * A list of network ranges that requests from this location would originate from. A non-empty list is only effective if the ipv4 endpoint is enabled for this location.
     */
    networks?: pulumi.Input<pulumi.Input<inputs.TeamsLocationNetwork>[]>;
    updatedAt?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TeamsLocation resource.
 */
export interface TeamsLocationArgs {
    accountId: pulumi.Input<string>;
    /**
     * True if the location is the default location.
     */
    clientDefault?: pulumi.Input<boolean>;
    /**
     * The identifier of the pair of IPv4 addresses assigned to this location. When creating a location, if this field is absent or set with null, the pair of shared IPv4 addresses (0e4a32c6-6fb8-4858-9296-98f51631e8e6) is auto-assigned. When updating a location, if the field is absent or set with null, the pre-assigned pair remains unchanged.
     */
    dnsDestinationIpsId?: pulumi.Input<string>;
    /**
     * True if the location needs to resolve EDNS queries.
     */
    ecsSupport?: pulumi.Input<boolean>;
    /**
     * The destination endpoints configured for this location. When updating a location, if this field is absent or set with null, the endpoints configuration remains unchanged.
     */
    endpoints?: pulumi.Input<inputs.TeamsLocationEndpoints>;
    /**
     * The name of the location.
     */
    name: pulumi.Input<string>;
    /**
     * A list of network ranges that requests from this location would originate from. A non-empty list is only effective if the ipv4 endpoint is enabled for this location.
     */
    networks?: pulumi.Input<pulumi.Input<inputs.TeamsLocationNetwork>[]>;
}
