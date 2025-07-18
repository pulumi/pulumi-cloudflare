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
 * const exampleWaitingRoomSettings = cloudflare.getWaitingRoomSettings({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getWaitingRoomSettings(args: GetWaitingRoomSettingsArgs, opts?: pulumi.InvokeOptions): Promise<GetWaitingRoomSettingsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getWaitingRoomSettings:getWaitingRoomSettings", {
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWaitingRoomSettings.
 */
export interface GetWaitingRoomSettingsArgs {
    /**
     * Identifier.
     */
    zoneId: string;
}

/**
 * A collection of values returned by getWaitingRoomSettings.
 */
export interface GetWaitingRoomSettingsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone.
     * Verified search engine crawlers will not be tracked or counted by the waiting room system,
     * and will not appear in waiting room analytics.
     */
    readonly searchEngineCrawlerBypass: boolean;
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
 * const exampleWaitingRoomSettings = cloudflare.getWaitingRoomSettings({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getWaitingRoomSettingsOutput(args: GetWaitingRoomSettingsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetWaitingRoomSettingsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getWaitingRoomSettings:getWaitingRoomSettings", {
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWaitingRoomSettings.
 */
export interface GetWaitingRoomSettingsOutputArgs {
    /**
     * Identifier.
     */
    zoneId: pulumi.Input<string>;
}
