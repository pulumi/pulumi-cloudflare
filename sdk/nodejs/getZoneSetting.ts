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
 * const exampleZoneSetting = cloudflare.getZoneSetting({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     settingId: "always_online",
 * });
 * ```
 */
export function getZoneSetting(args: GetZoneSettingArgs, opts?: pulumi.InvokeOptions): Promise<GetZoneSettingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getZoneSetting:getZoneSetting", {
        "settingId": args.settingId,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getZoneSetting.
 */
export interface GetZoneSettingArgs {
    /**
     * Setting name
     */
    settingId: string;
    /**
     * Identifier
     */
    zoneId: string;
}

/**
 * A collection of values returned by getZoneSetting.
 */
export interface GetZoneSettingResult {
    /**
     * Whether or not this setting can be modified for this zone (based on your Cloudflare plan level).
     */
    readonly editable: boolean;
    /**
     * ssl-recommender enrollment setting.
     */
    readonly enabled: boolean;
    /**
     * ID of the zone setting.
     * Available values: "0rtt", "advanced*ddos", "aegis", "always*online", "always*use*https", "automatic*https*rewrites", "brotli", "browser*cache*ttl", "browser*check", "cache*level", "challenge*ttl", "china*network*enabled", "ciphers", "cname*flattening", "development*mode", "early*hints", "edge*cache*ttl", "email*obfuscation", "h2*prioritization", "hotlink*protection", "http2", "http3", "image*resizing", "ip*geolocation", "ipv6", "max*upload", "min*tls*version", "mirage", "nel", "opportunistic*encryption", "opportunistic*onion", "orange*to*orange", "origin*error*page*pass*thru", "origin*h2*max*streams", "origin*max*http*version", "polish", "prefetch*preload", "privacy*pass", "proxy*read*timeout", "pseudo*ipv4", "replace*insecure*js", "response*buffering", "rocket*loader", "automatic*platform*optimization", "security*header", "security*level", "server*side*exclude", "sha1*support", "sort*query*string*for*cache", "ssl", "ssl*recommender", "tls*1*2*only", "tls*1*3", "tls*client*auth", "transformations", "transformations*allowed*origins", "true*client*ip_header", "waf", "webp", "websockets".
     */
    readonly id: string;
    /**
     * last time this setting was modified.
     */
    readonly modifiedOn: string;
    /**
     * Setting name
     */
    readonly settingId: string;
    /**
     * Value of the zone setting.
     * Notes: The interval (in seconds) from when development mode expires (positive integer) or last expired (negative integer) for the domain. If development mode has never been enabled, this value is false.
     */
    readonly timeRemaining: number;
    /**
     * Current value of the zone setting.
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
 * const exampleZoneSetting = cloudflare.getZoneSetting({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     settingId: "always_online",
 * });
 * ```
 */
export function getZoneSettingOutput(args: GetZoneSettingOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetZoneSettingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getZoneSetting:getZoneSetting", {
        "settingId": args.settingId,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getZoneSetting.
 */
export interface GetZoneSettingOutputArgs {
    /**
     * Setting name
     */
    settingId: pulumi.Input<string>;
    /**
     * Identifier
     */
    zoneId: pulumi.Input<string>;
}
