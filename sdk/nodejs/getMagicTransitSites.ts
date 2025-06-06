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
 * const exampleMagicTransitSites = cloudflare.getMagicTransitSites({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     connectorid: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getMagicTransitSites(args: GetMagicTransitSitesArgs, opts?: pulumi.InvokeOptions): Promise<GetMagicTransitSitesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getMagicTransitSites:getMagicTransitSites", {
        "accountId": args.accountId,
        "connectorid": args.connectorid,
        "maxItems": args.maxItems,
    }, opts);
}

/**
 * A collection of arguments for invoking getMagicTransitSites.
 */
export interface GetMagicTransitSitesArgs {
    /**
     * Identifier
     */
    accountId: string;
    /**
     * Identifier
     */
    connectorid?: string;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: number;
}

/**
 * A collection of values returned by getMagicTransitSites.
 */
export interface GetMagicTransitSitesResult {
    /**
     * Identifier
     */
    readonly accountId: string;
    /**
     * Identifier
     */
    readonly connectorid?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Max items to fetch, default: 1000
     */
    readonly maxItems?: number;
    /**
     * The items returned by the data source
     */
    readonly results: outputs.GetMagicTransitSitesResult[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleMagicTransitSites = cloudflare.getMagicTransitSites({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     connectorid: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getMagicTransitSitesOutput(args: GetMagicTransitSitesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetMagicTransitSitesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getMagicTransitSites:getMagicTransitSites", {
        "accountId": args.accountId,
        "connectorid": args.connectorid,
        "maxItems": args.maxItems,
    }, opts);
}

/**
 * A collection of arguments for invoking getMagicTransitSites.
 */
export interface GetMagicTransitSitesOutputArgs {
    /**
     * Identifier
     */
    accountId: pulumi.Input<string>;
    /**
     * Identifier
     */
    connectorid?: pulumi.Input<string>;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: pulumi.Input<number>;
}
