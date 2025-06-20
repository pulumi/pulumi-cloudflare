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
 * const exampleZeroTrustDexTests = cloudflare.getZeroTrustDexTests({
 *     accountId: "01a7362d577a6c3019a474fd6f485823",
 * });
 * ```
 */
export function getZeroTrustDexTests(args: GetZeroTrustDexTestsArgs, opts?: pulumi.InvokeOptions): Promise<GetZeroTrustDexTestsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getZeroTrustDexTests:getZeroTrustDexTests", {
        "accountId": args.accountId,
        "maxItems": args.maxItems,
    }, opts);
}

/**
 * A collection of arguments for invoking getZeroTrustDexTests.
 */
export interface GetZeroTrustDexTestsArgs {
    accountId: string;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: number;
}

/**
 * A collection of values returned by getZeroTrustDexTests.
 */
export interface GetZeroTrustDexTestsResult {
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
    readonly results: outputs.GetZeroTrustDexTestsResult[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleZeroTrustDexTests = cloudflare.getZeroTrustDexTests({
 *     accountId: "01a7362d577a6c3019a474fd6f485823",
 * });
 * ```
 */
export function getZeroTrustDexTestsOutput(args: GetZeroTrustDexTestsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetZeroTrustDexTestsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getZeroTrustDexTests:getZeroTrustDexTests", {
        "accountId": args.accountId,
        "maxItems": args.maxItems,
    }, opts);
}

/**
 * A collection of arguments for invoking getZeroTrustDexTests.
 */
export interface GetZeroTrustDexTestsOutputArgs {
    accountId: pulumi.Input<string>;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: pulumi.Input<number>;
}
