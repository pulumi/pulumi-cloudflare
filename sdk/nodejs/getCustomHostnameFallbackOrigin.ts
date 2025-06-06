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
 * const exampleCustomHostnameFallbackOrigin = cloudflare.getCustomHostnameFallbackOrigin({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getCustomHostnameFallbackOrigin(args: GetCustomHostnameFallbackOriginArgs, opts?: pulumi.InvokeOptions): Promise<GetCustomHostnameFallbackOriginResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getCustomHostnameFallbackOrigin:getCustomHostnameFallbackOrigin", {
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCustomHostnameFallbackOrigin.
 */
export interface GetCustomHostnameFallbackOriginArgs {
    /**
     * Identifier.
     */
    zoneId: string;
}

/**
 * A collection of values returned by getCustomHostnameFallbackOrigin.
 */
export interface GetCustomHostnameFallbackOriginResult {
    /**
     * This is the time the fallback origin was created.
     */
    readonly createdAt: string;
    /**
     * These are errors that were encountered while trying to activate a fallback origin.
     */
    readonly errors: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Your origin hostname that requests to your custom hostnames will be sent to.
     */
    readonly origin: string;
    /**
     * Status of the fallback origin's activation.
     * Available values: "initializing", "pending*deployment", "pending*deletion", "active", "deployment*timed*out", "deletion*timed*out".
     */
    readonly status: string;
    /**
     * This is the time the fallback origin was updated.
     */
    readonly updatedAt: string;
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
 * const exampleCustomHostnameFallbackOrigin = cloudflare.getCustomHostnameFallbackOrigin({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getCustomHostnameFallbackOriginOutput(args: GetCustomHostnameFallbackOriginOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCustomHostnameFallbackOriginResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getCustomHostnameFallbackOrigin:getCustomHostnameFallbackOrigin", {
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCustomHostnameFallbackOrigin.
 */
export interface GetCustomHostnameFallbackOriginOutputArgs {
    /**
     * Identifier.
     */
    zoneId: pulumi.Input<string>;
}
