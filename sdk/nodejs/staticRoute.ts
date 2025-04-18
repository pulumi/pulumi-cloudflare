// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
 * const exampleMagicWanStaticRoute = new cloudflare.MagicWanStaticRoute("example_magic_wan_static_route", {accountId: "023e105f4ecef8ad9ca31a8372d0c353"});
 * ```
 *
 * @deprecated cloudflare.index/staticroute.StaticRoute has been deprecated in favor of cloudflare.index/magicwanstaticroute.MagicWanStaticRoute
 */
export class StaticRoute extends pulumi.CustomResource {
    /**
     * Get an existing StaticRoute resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StaticRouteState, opts?: pulumi.CustomResourceOptions): StaticRoute {
        pulumi.log.warn("StaticRoute is deprecated: cloudflare.index/staticroute.StaticRoute has been deprecated in favor of cloudflare.index/magicwanstaticroute.MagicWanStaticRoute")
        return new StaticRoute(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/staticRoute:StaticRoute';

    /**
     * Returns true if the given object is an instance of StaticRoute.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StaticRoute {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StaticRoute.__pulumiType;
    }

    /**
     * Identifier
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * An optional human provided description of the static route.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    public /*out*/ readonly modified!: pulumi.Output<boolean>;
    public /*out*/ readonly modifiedRoute!: pulumi.Output<outputs.StaticRouteModifiedRoute>;
    /**
     * The next-hop IP Address for the static route.
     */
    public readonly nexthop!: pulumi.Output<string | undefined>;
    /**
     * IP Prefix in Classless Inter-Domain Routing format.
     */
    public readonly prefix!: pulumi.Output<string | undefined>;
    /**
     * Priority of the static route.
     */
    public readonly priority!: pulumi.Output<number | undefined>;
    public readonly route!: pulumi.Output<outputs.StaticRouteRoute>;
    /**
     * Identifier
     */
    public readonly routeId!: pulumi.Output<string | undefined>;
    public readonly routes!: pulumi.Output<outputs.StaticRouteRoute[]>;
    /**
     * Used only for ECMP routes.
     */
    public readonly scope!: pulumi.Output<outputs.StaticRouteScope>;
    /**
     * Optional weight of the ECMP scope - if provided.
     */
    public readonly weight!: pulumi.Output<number | undefined>;

    /**
     * Create a StaticRoute resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    /** @deprecated cloudflare.index/staticroute.StaticRoute has been deprecated in favor of cloudflare.index/magicwanstaticroute.MagicWanStaticRoute */
    constructor(name: string, args: StaticRouteArgs, opts?: pulumi.CustomResourceOptions)
    /** @deprecated cloudflare.index/staticroute.StaticRoute has been deprecated in favor of cloudflare.index/magicwanstaticroute.MagicWanStaticRoute */
    constructor(name: string, argsOrState?: StaticRouteArgs | StaticRouteState, opts?: pulumi.CustomResourceOptions) {
        pulumi.log.warn("StaticRoute is deprecated: cloudflare.index/staticroute.StaticRoute has been deprecated in favor of cloudflare.index/magicwanstaticroute.MagicWanStaticRoute")
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StaticRouteState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["modified"] = state ? state.modified : undefined;
            resourceInputs["modifiedRoute"] = state ? state.modifiedRoute : undefined;
            resourceInputs["nexthop"] = state ? state.nexthop : undefined;
            resourceInputs["prefix"] = state ? state.prefix : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["route"] = state ? state.route : undefined;
            resourceInputs["routeId"] = state ? state.routeId : undefined;
            resourceInputs["routes"] = state ? state.routes : undefined;
            resourceInputs["scope"] = state ? state.scope : undefined;
            resourceInputs["weight"] = state ? state.weight : undefined;
        } else {
            const args = argsOrState as StaticRouteArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["nexthop"] = args ? args.nexthop : undefined;
            resourceInputs["prefix"] = args ? args.prefix : undefined;
            resourceInputs["priority"] = args ? args.priority : undefined;
            resourceInputs["route"] = args ? args.route : undefined;
            resourceInputs["routeId"] = args ? args.routeId : undefined;
            resourceInputs["routes"] = args ? args.routes : undefined;
            resourceInputs["scope"] = args ? args.scope : undefined;
            resourceInputs["weight"] = args ? args.weight : undefined;
            resourceInputs["modified"] = undefined /*out*/;
            resourceInputs["modifiedRoute"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "cloudflare:index/staticRoute:StaticRoute" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(StaticRoute.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StaticRoute resources.
 */
export interface StaticRouteState {
    /**
     * Identifier
     */
    accountId?: pulumi.Input<string>;
    /**
     * An optional human provided description of the static route.
     */
    description?: pulumi.Input<string>;
    modified?: pulumi.Input<boolean>;
    modifiedRoute?: pulumi.Input<inputs.StaticRouteModifiedRoute>;
    /**
     * The next-hop IP Address for the static route.
     */
    nexthop?: pulumi.Input<string>;
    /**
     * IP Prefix in Classless Inter-Domain Routing format.
     */
    prefix?: pulumi.Input<string>;
    /**
     * Priority of the static route.
     */
    priority?: pulumi.Input<number>;
    route?: pulumi.Input<inputs.StaticRouteRoute>;
    /**
     * Identifier
     */
    routeId?: pulumi.Input<string>;
    routes?: pulumi.Input<pulumi.Input<inputs.StaticRouteRoute>[]>;
    /**
     * Used only for ECMP routes.
     */
    scope?: pulumi.Input<inputs.StaticRouteScope>;
    /**
     * Optional weight of the ECMP scope - if provided.
     */
    weight?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a StaticRoute resource.
 */
export interface StaticRouteArgs {
    /**
     * Identifier
     */
    accountId: pulumi.Input<string>;
    /**
     * An optional human provided description of the static route.
     */
    description?: pulumi.Input<string>;
    /**
     * The next-hop IP Address for the static route.
     */
    nexthop?: pulumi.Input<string>;
    /**
     * IP Prefix in Classless Inter-Domain Routing format.
     */
    prefix?: pulumi.Input<string>;
    /**
     * Priority of the static route.
     */
    priority?: pulumi.Input<number>;
    route?: pulumi.Input<inputs.StaticRouteRoute>;
    /**
     * Identifier
     */
    routeId?: pulumi.Input<string>;
    routes?: pulumi.Input<pulumi.Input<inputs.StaticRouteRoute>[]>;
    /**
     * Used only for ECMP routes.
     */
    scope?: pulumi.Input<inputs.StaticRouteScope>;
    /**
     * Optional weight of the ECMP scope - if provided.
     */
    weight?: pulumi.Input<number>;
}
