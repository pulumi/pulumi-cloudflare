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
 * const exampleWebAnalyticsSites = cloudflare.getWebAnalyticsSites({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     orderBy: "host",
 * });
 * ```
 */
export function getWebAnalyticsSites(args: GetWebAnalyticsSitesArgs, opts?: pulumi.InvokeOptions): Promise<GetWebAnalyticsSitesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getWebAnalyticsSites:getWebAnalyticsSites", {
        "accountId": args.accountId,
        "maxItems": args.maxItems,
        "orderBy": args.orderBy,
    }, opts);
}

/**
 * A collection of arguments for invoking getWebAnalyticsSites.
 */
export interface GetWebAnalyticsSitesArgs {
    /**
     * Identifier.
     */
    accountId: string;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: number;
    /**
     * The property used to sort the list of results.
     * Available values: "host", "created".
     */
    orderBy?: string;
}

/**
 * A collection of values returned by getWebAnalyticsSites.
 */
export interface GetWebAnalyticsSitesResult {
    /**
     * Identifier.
     */
    readonly accountId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Max items to fetch, default: 1000
     */
    readonly maxItems?: number;
    /**
     * The property used to sort the list of results.
     * Available values: "host", "created".
     */
    readonly orderBy?: string;
    /**
     * The items returned by the data source
     */
    readonly results: outputs.GetWebAnalyticsSitesResult[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleWebAnalyticsSites = cloudflare.getWebAnalyticsSites({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     orderBy: "host",
 * });
 * ```
 */
export function getWebAnalyticsSitesOutput(args: GetWebAnalyticsSitesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetWebAnalyticsSitesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getWebAnalyticsSites:getWebAnalyticsSites", {
        "accountId": args.accountId,
        "maxItems": args.maxItems,
        "orderBy": args.orderBy,
    }, opts);
}

/**
 * A collection of arguments for invoking getWebAnalyticsSites.
 */
export interface GetWebAnalyticsSitesOutputArgs {
    /**
     * Identifier.
     */
    accountId: pulumi.Input<string>;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: pulumi.Input<number>;
    /**
     * The property used to sort the list of results.
     * Available values: "host", "created".
     */
    orderBy?: pulumi.Input<string>;
}
