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
 * const exampleHostnameTlsSetting = cloudflare.getHostnameTlsSetting({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     settingId: "ciphers",
 * });
 * ```
 */
export function getHostnameTlsSetting(args: GetHostnameTlsSettingArgs, opts?: pulumi.InvokeOptions): Promise<GetHostnameTlsSettingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getHostnameTlsSetting:getHostnameTlsSetting", {
        "settingId": args.settingId,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getHostnameTlsSetting.
 */
export interface GetHostnameTlsSettingArgs {
    /**
     * The TLS Setting name.
     * Available values: "ciphers", "min*tls*version", "http2".
     */
    settingId: string;
    /**
     * Identifier.
     */
    zoneId: string;
}

/**
 * A collection of values returned by getHostnameTlsSetting.
 */
export interface GetHostnameTlsSettingResult {
    /**
     * This is the time the tls setting was originally created for this hostname.
     */
    readonly createdAt: string;
    /**
     * The hostname for which the tls settings are set.
     */
    readonly hostname: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The TLS Setting name.
     * Available values: "ciphers", "min*tls*version", "http2".
     */
    readonly settingId: string;
    /**
     * Deployment status for the given tls setting.
     */
    readonly status: string;
    /**
     * This is the time the tls setting was updated.
     */
    readonly updatedAt: string;
    /**
     * The tls setting value.
     */
    readonly value: number;
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
 * const exampleHostnameTlsSetting = cloudflare.getHostnameTlsSetting({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     settingId: "ciphers",
 * });
 * ```
 */
export function getHostnameTlsSettingOutput(args: GetHostnameTlsSettingOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetHostnameTlsSettingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getHostnameTlsSetting:getHostnameTlsSetting", {
        "settingId": args.settingId,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getHostnameTlsSetting.
 */
export interface GetHostnameTlsSettingOutputArgs {
    /**
     * The TLS Setting name.
     * Available values: "ciphers", "min*tls*version", "http2".
     */
    settingId: pulumi.Input<string>;
    /**
     * Identifier.
     */
    zoneId: pulumi.Input<string>;
}
