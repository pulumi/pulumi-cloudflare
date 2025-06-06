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
 * const exampleR2BucketLifecycle = cloudflare.getR2BucketLifecycle({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     bucketName: "example-bucket",
 * });
 * ```
 */
export function getR2BucketLifecycle(args: GetR2BucketLifecycleArgs, opts?: pulumi.InvokeOptions): Promise<GetR2BucketLifecycleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getR2BucketLifecycle:getR2BucketLifecycle", {
        "accountId": args.accountId,
        "bucketName": args.bucketName,
    }, opts);
}

/**
 * A collection of arguments for invoking getR2BucketLifecycle.
 */
export interface GetR2BucketLifecycleArgs {
    /**
     * Account ID.
     */
    accountId: string;
    /**
     * Name of the bucket.
     */
    bucketName: string;
}

/**
 * A collection of values returned by getR2BucketLifecycle.
 */
export interface GetR2BucketLifecycleResult {
    /**
     * Account ID.
     */
    readonly accountId: string;
    /**
     * Name of the bucket.
     */
    readonly bucketName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly rules: outputs.GetR2BucketLifecycleRule[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleR2BucketLifecycle = cloudflare.getR2BucketLifecycle({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     bucketName: "example-bucket",
 * });
 * ```
 */
export function getR2BucketLifecycleOutput(args: GetR2BucketLifecycleOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetR2BucketLifecycleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getR2BucketLifecycle:getR2BucketLifecycle", {
        "accountId": args.accountId,
        "bucketName": args.bucketName,
    }, opts);
}

/**
 * A collection of arguments for invoking getR2BucketLifecycle.
 */
export interface GetR2BucketLifecycleOutputArgs {
    /**
     * Account ID.
     */
    accountId: pulumi.Input<string>;
    /**
     * Name of the bucket.
     */
    bucketName: pulumi.Input<string>;
}
