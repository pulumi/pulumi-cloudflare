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
 * const exampleKeylessCertificates = cloudflare.getKeylessCertificates({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getKeylessCertificates(args: GetKeylessCertificatesArgs, opts?: pulumi.InvokeOptions): Promise<GetKeylessCertificatesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getKeylessCertificates:getKeylessCertificates", {
        "maxItems": args.maxItems,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getKeylessCertificates.
 */
export interface GetKeylessCertificatesArgs {
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: number;
    /**
     * Identifier.
     */
    zoneId: string;
}

/**
 * A collection of values returned by getKeylessCertificates.
 */
export interface GetKeylessCertificatesResult {
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
    readonly results: outputs.GetKeylessCertificatesResult[];
    /**
     * Identifier.
     */
    readonly zoneId: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleKeylessCertificates = cloudflare.getKeylessCertificates({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getKeylessCertificatesOutput(args: GetKeylessCertificatesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetKeylessCertificatesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getKeylessCertificates:getKeylessCertificates", {
        "maxItems": args.maxItems,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getKeylessCertificates.
 */
export interface GetKeylessCertificatesOutputArgs {
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: pulumi.Input<number>;
    /**
     * Identifier.
     */
    zoneId: pulumi.Input<string>;
}
