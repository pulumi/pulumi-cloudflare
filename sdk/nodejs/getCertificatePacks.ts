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
 * const exampleCertificatePacks = cloudflare.getCertificatePacks({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     status: "all",
 * });
 * ```
 */
export function getCertificatePacks(args: GetCertificatePacksArgs, opts?: pulumi.InvokeOptions): Promise<GetCertificatePacksResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getCertificatePacks:getCertificatePacks", {
        "maxItems": args.maxItems,
        "status": args.status,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCertificatePacks.
 */
export interface GetCertificatePacksArgs {
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: number;
    /**
     * Include Certificate Packs of all statuses, not just active ones.
     * Available values: "all".
     */
    status?: string;
    /**
     * Identifier.
     */
    zoneId: string;
}

/**
 * A collection of values returned by getCertificatePacks.
 */
export interface GetCertificatePacksResult {
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
    readonly results: outputs.GetCertificatePacksResult[];
    /**
     * Include Certificate Packs of all statuses, not just active ones.
     * Available values: "all".
     */
    readonly status?: string;
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
 * const exampleCertificatePacks = cloudflare.getCertificatePacks({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     status: "all",
 * });
 * ```
 */
export function getCertificatePacksOutput(args: GetCertificatePacksOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCertificatePacksResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getCertificatePacks:getCertificatePacks", {
        "maxItems": args.maxItems,
        "status": args.status,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCertificatePacks.
 */
export interface GetCertificatePacksOutputArgs {
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: pulumi.Input<number>;
    /**
     * Include Certificate Packs of all statuses, not just active ones.
     * Available values: "all".
     */
    status?: pulumi.Input<string>;
    /**
     * Identifier.
     */
    zoneId: pulumi.Input<string>;
}
