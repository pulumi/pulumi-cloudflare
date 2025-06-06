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
 * const exampleKeylessCertificate = cloudflare.getKeylessCertificate({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     keylessCertificateId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getKeylessCertificate(args: GetKeylessCertificateArgs, opts?: pulumi.InvokeOptions): Promise<GetKeylessCertificateResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getKeylessCertificate:getKeylessCertificate", {
        "keylessCertificateId": args.keylessCertificateId,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getKeylessCertificate.
 */
export interface GetKeylessCertificateArgs {
    /**
     * Identifier.
     */
    keylessCertificateId?: string;
    /**
     * Identifier.
     */
    zoneId: string;
}

/**
 * A collection of values returned by getKeylessCertificate.
 */
export interface GetKeylessCertificateResult {
    /**
     * When the Keyless SSL was created.
     */
    readonly createdOn: string;
    /**
     * Whether or not the Keyless SSL is on or off.
     */
    readonly enabled: boolean;
    /**
     * The keyless SSL name.
     */
    readonly host: string;
    /**
     * Identifier.
     */
    readonly id: string;
    /**
     * Identifier.
     */
    readonly keylessCertificateId?: string;
    /**
     * When the Keyless SSL was last modified.
     */
    readonly modifiedOn: string;
    /**
     * The keyless SSL name.
     */
    readonly name: string;
    /**
     * Available permissions for the Keyless SSL for the current user requesting the item.
     */
    readonly permissions: string[];
    /**
     * The keyless SSL port used to communicate between Cloudflare and the client's Keyless SSL server.
     */
    readonly port: number;
    /**
     * Status of the Keyless SSL.
     * Available values: "active", "deleted".
     */
    readonly status: string;
    /**
     * Configuration for using Keyless SSL through a Cloudflare Tunnel
     */
    readonly tunnel: outputs.GetKeylessCertificateTunnel;
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
 * const exampleKeylessCertificate = cloudflare.getKeylessCertificate({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     keylessCertificateId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getKeylessCertificateOutput(args: GetKeylessCertificateOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetKeylessCertificateResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getKeylessCertificate:getKeylessCertificate", {
        "keylessCertificateId": args.keylessCertificateId,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getKeylessCertificate.
 */
export interface GetKeylessCertificateOutputArgs {
    /**
     * Identifier.
     */
    keylessCertificateId?: pulumi.Input<string>;
    /**
     * Identifier.
     */
    zoneId: pulumi.Input<string>;
}
