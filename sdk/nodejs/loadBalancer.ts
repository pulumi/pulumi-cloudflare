// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Load Balancer resource. This sits in front of a number of defined pools of origins and provides various options for geographically-aware load balancing. Note that the load balancing feature must be enabled in your Cloudflare account before you can use this resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const foo = new cloudflare.LoadBalancerPool("foo", {
 *     name: "example-lb-pool",
 *     origins: [{
 *         name: "example-1",
 *         address: "192.0.2.1",
 *         enabled: false,
 *     }],
 * });
 * // Define a load balancer which always points to a pool we define below
 * // In normal usage, would have different pools set for different pops (cloudflare points-of-presence) and/or for different regions
 * // Within each pop or region we can define multiple pools in failover order
 * const bar = new cloudflare.LoadBalancer("bar", {
 *     zoneId: "d41d8cd98f00b204e9800998ecf8427e",
 *     name: "example-load-balancer.example.com",
 *     fallbackPoolId: foo.id,
 *     defaultPoolIds: [foo.id],
 *     description: "example load balancer using geo-balancing",
 *     proxied: true,
 *     steeringPolicy: "geo",
 *     popPools: [{
 *         pop: "LAX",
 *         poolIds: [foo.id],
 *     }],
 *     regionPools: [{
 *         region: "WNAM",
 *         poolIds: [foo.id],
 *     }],
 * });
 * ```
 */
export class LoadBalancer extends pulumi.CustomResource {
    /**
     * Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadBalancerState, opts?: pulumi.CustomResourceOptions): LoadBalancer {
        return new LoadBalancer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/loadBalancer:LoadBalancer';

    /**
     * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoadBalancer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoadBalancer.__pulumiType;
    }

    /**
     * The RFC3339 timestamp of when the load balancer was created.
     */
    public /*out*/ readonly createdOn!: pulumi.Output<string>;
    /**
     * A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
     */
    public readonly defaultPoolIds!: pulumi.Output<string[]>;
    /**
     * Free text description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Enable or disable the load balancer. Defaults to `true` (enabled).
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The pool ID to use when all other pools are detected as unhealthy.
     */
    public readonly fallbackPoolId!: pulumi.Output<string>;
    /**
     * The RFC3339 timestamp of when the load balancer was last modified.
     */
    public /*out*/ readonly modifiedOn!: pulumi.Output<string>;
    /**
     * The DNS name (FQDN, including the zone) to associate with the load balancer.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
     */
    public readonly popPools!: pulumi.Output<outputs.LoadBalancerPopPool[]>;
    /**
     * Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
     */
    public readonly proxied!: pulumi.Output<boolean | undefined>;
    /**
     * A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
     */
    public readonly regionPools!: pulumi.Output<outputs.LoadBalancerRegionPool[]>;
    /**
     * Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.  Valid values are: `""`, `"none"`, `"cookie"`, and `"ipCookie"`.  Default is `""`.
     */
    public readonly sessionAffinity!: pulumi.Output<string | undefined>;
    /**
     * Configure cookie attributes for session affinity cookie. See the field documentation below.
     */
    public readonly sessionAffinityAttributes!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Time, in seconds, until this load balancers session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of 23 hours will be used unless `sessionAffinityTtl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between 1800 and 604800.
     */
    public readonly sessionAffinityTtl!: pulumi.Output<number | undefined>;
    /**
     * Determine which method the load balancer uses to determine the fastest route to your origin. Valid values are: `"off"`, `"geo"`, `"dynamicLatency"`, `"random"` or `""`. Default is `""`.
     */
    public readonly steeringPolicy!: pulumi.Output<string>;
    /**
     * Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
     */
    public readonly ttl!: pulumi.Output<number>;
    /**
     * The zone ID to add the load balancer to.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a LoadBalancer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoadBalancerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadBalancerArgs | LoadBalancerState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoadBalancerState | undefined;
            inputs["createdOn"] = state ? state.createdOn : undefined;
            inputs["defaultPoolIds"] = state ? state.defaultPoolIds : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["fallbackPoolId"] = state ? state.fallbackPoolId : undefined;
            inputs["modifiedOn"] = state ? state.modifiedOn : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["popPools"] = state ? state.popPools : undefined;
            inputs["proxied"] = state ? state.proxied : undefined;
            inputs["regionPools"] = state ? state.regionPools : undefined;
            inputs["sessionAffinity"] = state ? state.sessionAffinity : undefined;
            inputs["sessionAffinityAttributes"] = state ? state.sessionAffinityAttributes : undefined;
            inputs["sessionAffinityTtl"] = state ? state.sessionAffinityTtl : undefined;
            inputs["steeringPolicy"] = state ? state.steeringPolicy : undefined;
            inputs["ttl"] = state ? state.ttl : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as LoadBalancerArgs | undefined;
            if ((!args || args.defaultPoolIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'defaultPoolIds'");
            }
            if ((!args || args.fallbackPoolId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fallbackPoolId'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            inputs["defaultPoolIds"] = args ? args.defaultPoolIds : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["fallbackPoolId"] = args ? args.fallbackPoolId : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["popPools"] = args ? args.popPools : undefined;
            inputs["proxied"] = args ? args.proxied : undefined;
            inputs["regionPools"] = args ? args.regionPools : undefined;
            inputs["sessionAffinity"] = args ? args.sessionAffinity : undefined;
            inputs["sessionAffinityAttributes"] = args ? args.sessionAffinityAttributes : undefined;
            inputs["sessionAffinityTtl"] = args ? args.sessionAffinityTtl : undefined;
            inputs["steeringPolicy"] = args ? args.steeringPolicy : undefined;
            inputs["ttl"] = args ? args.ttl : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
            inputs["createdOn"] = undefined /*out*/;
            inputs["modifiedOn"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(LoadBalancer.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadBalancer resources.
 */
export interface LoadBalancerState {
    /**
     * The RFC3339 timestamp of when the load balancer was created.
     */
    readonly createdOn?: pulumi.Input<string>;
    /**
     * A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
     */
    readonly defaultPoolIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Free text description.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Enable or disable the load balancer. Defaults to `true` (enabled).
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * The pool ID to use when all other pools are detected as unhealthy.
     */
    readonly fallbackPoolId?: pulumi.Input<string>;
    /**
     * The RFC3339 timestamp of when the load balancer was last modified.
     */
    readonly modifiedOn?: pulumi.Input<string>;
    /**
     * The DNS name (FQDN, including the zone) to associate with the load balancer.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
     */
    readonly popPools?: pulumi.Input<pulumi.Input<inputs.LoadBalancerPopPool>[]>;
    /**
     * Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
     */
    readonly proxied?: pulumi.Input<boolean>;
    /**
     * A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
     */
    readonly regionPools?: pulumi.Input<pulumi.Input<inputs.LoadBalancerRegionPool>[]>;
    /**
     * Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.  Valid values are: `""`, `"none"`, `"cookie"`, and `"ipCookie"`.  Default is `""`.
     */
    readonly sessionAffinity?: pulumi.Input<string>;
    /**
     * Configure cookie attributes for session affinity cookie. See the field documentation below.
     */
    readonly sessionAffinityAttributes?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Time, in seconds, until this load balancers session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of 23 hours will be used unless `sessionAffinityTtl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between 1800 and 604800.
     */
    readonly sessionAffinityTtl?: pulumi.Input<number>;
    /**
     * Determine which method the load balancer uses to determine the fastest route to your origin. Valid values are: `"off"`, `"geo"`, `"dynamicLatency"`, `"random"` or `""`. Default is `""`.
     */
    readonly steeringPolicy?: pulumi.Input<string>;
    /**
     * Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
     */
    readonly ttl?: pulumi.Input<number>;
    /**
     * The zone ID to add the load balancer to.
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LoadBalancer resource.
 */
export interface LoadBalancerArgs {
    /**
     * A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
     */
    readonly defaultPoolIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Free text description.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Enable or disable the load balancer. Defaults to `true` (enabled).
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * The pool ID to use when all other pools are detected as unhealthy.
     */
    readonly fallbackPoolId: pulumi.Input<string>;
    /**
     * The DNS name (FQDN, including the zone) to associate with the load balancer.
     */
    readonly name: pulumi.Input<string>;
    /**
     * A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
     */
    readonly popPools?: pulumi.Input<pulumi.Input<inputs.LoadBalancerPopPool>[]>;
    /**
     * Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
     */
    readonly proxied?: pulumi.Input<boolean>;
    /**
     * A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
     */
    readonly regionPools?: pulumi.Input<pulumi.Input<inputs.LoadBalancerRegionPool>[]>;
    /**
     * Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.  Valid values are: `""`, `"none"`, `"cookie"`, and `"ipCookie"`.  Default is `""`.
     */
    readonly sessionAffinity?: pulumi.Input<string>;
    /**
     * Configure cookie attributes for session affinity cookie. See the field documentation below.
     */
    readonly sessionAffinityAttributes?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Time, in seconds, until this load balancers session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of 23 hours will be used unless `sessionAffinityTtl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between 1800 and 604800.
     */
    readonly sessionAffinityTtl?: pulumi.Input<number>;
    /**
     * Determine which method the load balancer uses to determine the fastest route to your origin. Valid values are: `"off"`, `"geo"`, `"dynamicLatency"`, `"random"` or `""`. Default is `""`.
     */
    readonly steeringPolicy?: pulumi.Input<string>;
    /**
     * Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
     */
    readonly ttl?: pulumi.Input<number>;
    /**
     * The zone ID to add the load balancer to.
     */
    readonly zoneId: pulumi.Input<string>;
}
