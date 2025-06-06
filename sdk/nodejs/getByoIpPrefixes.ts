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
 * const exampleByoIpPrefixes = cloudflare.getByoIpPrefixes({
 *     accountId: "258def64c72dae45f3e4c8516e2111f2",
 * });
 * ```
 */
export function getByoIpPrefixes(args: GetByoIpPrefixesArgs, opts?: pulumi.InvokeOptions): Promise<GetByoIpPrefixesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getByoIpPrefixes:getByoIpPrefixes", {
        "accountId": args.accountId,
        "maxItems": args.maxItems,
    }, opts);
}

/**
 * A collection of arguments for invoking getByoIpPrefixes.
 */
export interface GetByoIpPrefixesArgs {
    /**
     * Identifier of a Cloudflare account.
     */
    accountId: string;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: number;
}

/**
 * A collection of values returned by getByoIpPrefixes.
 */
export interface GetByoIpPrefixesResult {
    /**
     * Identifier of a Cloudflare account.
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
     * The items returned by the data source
     */
    readonly results: outputs.GetByoIpPrefixesResult[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleByoIpPrefixes = cloudflare.getByoIpPrefixes({
 *     accountId: "258def64c72dae45f3e4c8516e2111f2",
 * });
 * ```
 */
export function getByoIpPrefixesOutput(args: GetByoIpPrefixesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetByoIpPrefixesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getByoIpPrefixes:getByoIpPrefixes", {
        "accountId": args.accountId,
        "maxItems": args.maxItems,
    }, opts);
}

/**
 * A collection of arguments for invoking getByoIpPrefixes.
 */
export interface GetByoIpPrefixesOutputArgs {
    /**
     * Identifier of a Cloudflare account.
     */
    accountId: pulumi.Input<string>;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: pulumi.Input<number>;
}
