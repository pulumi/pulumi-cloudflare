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
 * const exampleZeroTrustTunnelCloudflaredToken = cloudflare.getZeroTrustTunnelCloudflaredToken({
 *     accountId: "699d98642c564d2e855e9661899b7252",
 *     tunnelId: "f70ff985-a4ef-4643-bbbc-4a0ed4fc8415",
 * });
 * ```
 */
export function getZeroTrustTunnelCloudflaredToken(args: GetZeroTrustTunnelCloudflaredTokenArgs, opts?: pulumi.InvokeOptions): Promise<GetZeroTrustTunnelCloudflaredTokenResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getZeroTrustTunnelCloudflaredToken:getZeroTrustTunnelCloudflaredToken", {
        "accountId": args.accountId,
        "tunnelId": args.tunnelId,
    }, opts);
}

/**
 * A collection of arguments for invoking getZeroTrustTunnelCloudflaredToken.
 */
export interface GetZeroTrustTunnelCloudflaredTokenArgs {
    /**
     * Cloudflare account ID
     */
    accountId: string;
    /**
     * UUID of the tunnel.
     */
    tunnelId: string;
}

/**
 * A collection of values returned by getZeroTrustTunnelCloudflaredToken.
 */
export interface GetZeroTrustTunnelCloudflaredTokenResult {
    /**
     * Cloudflare account ID
     */
    readonly accountId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Tunnel Token is used as a mechanism to authenticate the operation of a tunnel.
     */
    readonly token: string;
    /**
     * UUID of the tunnel.
     */
    readonly tunnelId: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleZeroTrustTunnelCloudflaredToken = cloudflare.getZeroTrustTunnelCloudflaredToken({
 *     accountId: "699d98642c564d2e855e9661899b7252",
 *     tunnelId: "f70ff985-a4ef-4643-bbbc-4a0ed4fc8415",
 * });
 * ```
 */
export function getZeroTrustTunnelCloudflaredTokenOutput(args: GetZeroTrustTunnelCloudflaredTokenOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetZeroTrustTunnelCloudflaredTokenResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getZeroTrustTunnelCloudflaredToken:getZeroTrustTunnelCloudflaredToken", {
        "accountId": args.accountId,
        "tunnelId": args.tunnelId,
    }, opts);
}

/**
 * A collection of arguments for invoking getZeroTrustTunnelCloudflaredToken.
 */
export interface GetZeroTrustTunnelCloudflaredTokenOutputArgs {
    /**
     * Cloudflare account ID
     */
    accountId: pulumi.Input<string>;
    /**
     * UUID of the tunnel.
     */
    tunnelId: pulumi.Input<string>;
}
