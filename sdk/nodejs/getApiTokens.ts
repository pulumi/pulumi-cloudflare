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
 * const exampleApiTokens = cloudflare.getApiTokens({
 *     direction: "desc",
 * });
 * ```
 */
export function getApiTokens(args?: GetApiTokensArgs, opts?: pulumi.InvokeOptions): Promise<GetApiTokensResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getApiTokens:getApiTokens", {
        "direction": args.direction,
        "maxItems": args.maxItems,
    }, opts);
}

/**
 * A collection of arguments for invoking getApiTokens.
 */
export interface GetApiTokensArgs {
    /**
     * Direction to order results.
     * Available values: "asc", "desc".
     */
    direction?: string;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: number;
}

/**
 * A collection of values returned by getApiTokens.
 */
export interface GetApiTokensResult {
    /**
     * Direction to order results.
     * Available values: "asc", "desc".
     */
    readonly direction?: string;
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
    readonly results: outputs.GetApiTokensResult[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleApiTokens = cloudflare.getApiTokens({
 *     direction: "desc",
 * });
 * ```
 */
export function getApiTokensOutput(args?: GetApiTokensOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetApiTokensResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getApiTokens:getApiTokens", {
        "direction": args.direction,
        "maxItems": args.maxItems,
    }, opts);
}

/**
 * A collection of arguments for invoking getApiTokens.
 */
export interface GetApiTokensOutputArgs {
    /**
     * Direction to order results.
     * Available values: "asc", "desc".
     */
    direction?: pulumi.Input<string>;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: pulumi.Input<number>;
}
