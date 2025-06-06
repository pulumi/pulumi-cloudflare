// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleZoneCacheReserve = cloudflare.getZoneCacheReserve({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getZoneCacheReserve(args: GetZoneCacheReserveArgs, opts?: pulumi.InvokeOptions): Promise<GetZoneCacheReserveResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getZoneCacheReserve:getZoneCacheReserve", {
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getZoneCacheReserve.
 */
export interface GetZoneCacheReserveArgs {
    /**
     * Identifier
     */
    zoneId: string;
}

/**
 * A collection of values returned by getZoneCacheReserve.
 */
export interface GetZoneCacheReserveResult {
    /**
     * Whether the setting is editable
     */
    readonly editable: boolean;
    /**
     * ID of the zone setting.
     * Available values: "cacheReserve".
     */
    readonly id: string;
    /**
     * Last time this setting was modified.
     */
    readonly modifiedOn: string;
    /**
     * The value of the feature
     * Available values: "on", "off".
     */
    readonly value: string;
    /**
     * Identifier
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
 * const exampleZoneCacheReserve = cloudflare.getZoneCacheReserve({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getZoneCacheReserveOutput(args: GetZoneCacheReserveOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetZoneCacheReserveResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getZoneCacheReserve:getZoneCacheReserve", {
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getZoneCacheReserve.
 */
export interface GetZoneCacheReserveOutputArgs {
    /**
     * Identifier
     */
    zoneId: pulumi.Input<string>;
}
