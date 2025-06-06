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
 * const exampleCloudforceOneRequests = cloudflare.getCloudforceOneRequests({
 *     accountIdentifier: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getCloudforceOneRequests(args: GetCloudforceOneRequestsArgs, opts?: pulumi.InvokeOptions): Promise<GetCloudforceOneRequestsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getCloudforceOneRequests:getCloudforceOneRequests", {
        "accountIdentifier": args.accountIdentifier,
        "maxItems": args.maxItems,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudforceOneRequests.
 */
export interface GetCloudforceOneRequestsArgs {
    /**
     * Identifier
     */
    accountIdentifier: string;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: number;
}

/**
 * A collection of values returned by getCloudforceOneRequests.
 */
export interface GetCloudforceOneRequestsResult {
    /**
     * Identifier
     */
    readonly accountIdentifier: string;
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
    readonly results: outputs.GetCloudforceOneRequestsResult[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleCloudforceOneRequests = cloudflare.getCloudforceOneRequests({
 *     accountIdentifier: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getCloudforceOneRequestsOutput(args: GetCloudforceOneRequestsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCloudforceOneRequestsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getCloudforceOneRequests:getCloudforceOneRequests", {
        "accountIdentifier": args.accountIdentifier,
        "maxItems": args.maxItems,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudforceOneRequests.
 */
export interface GetCloudforceOneRequestsOutputArgs {
    /**
     * Identifier
     */
    accountIdentifier: pulumi.Input<string>;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: pulumi.Input<number>;
}
