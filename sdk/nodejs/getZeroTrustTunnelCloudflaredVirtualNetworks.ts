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
 * const exampleZeroTrustTunnelCloudflaredVirtualNetworks = cloudflare.getZeroTrustTunnelCloudflaredVirtualNetworks({
 *     accountId: "699d98642c564d2e855e9661899b7252",
 *     id: "f70ff985-a4ef-4643-bbbc-4a0ed4fc8415",
 *     isDefault: true,
 *     isDeleted: true,
 *     name: "us-east-1-vpc",
 * });
 * ```
 */
export function getZeroTrustTunnelCloudflaredVirtualNetworks(args: GetZeroTrustTunnelCloudflaredVirtualNetworksArgs, opts?: pulumi.InvokeOptions): Promise<GetZeroTrustTunnelCloudflaredVirtualNetworksResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getZeroTrustTunnelCloudflaredVirtualNetworks:getZeroTrustTunnelCloudflaredVirtualNetworks", {
        "accountId": args.accountId,
        "id": args.id,
        "isDefault": args.isDefault,
        "isDeleted": args.isDeleted,
        "maxItems": args.maxItems,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getZeroTrustTunnelCloudflaredVirtualNetworks.
 */
export interface GetZeroTrustTunnelCloudflaredVirtualNetworksArgs {
    /**
     * Cloudflare account ID
     */
    accountId: string;
    /**
     * UUID of the virtual network.
     */
    id?: string;
    /**
     * If `true`, only include the default virtual network. If `false`, exclude the default virtual network. If empty, all virtual networks will be included.
     */
    isDefault?: boolean;
    /**
     * If `true`, only include deleted virtual networks. If `false`, exclude deleted virtual networks. If empty, all virtual networks will be included.
     */
    isDeleted?: boolean;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: number;
    /**
     * A user-friendly name for the virtual network.
     */
    name?: string;
}

/**
 * A collection of values returned by getZeroTrustTunnelCloudflaredVirtualNetworks.
 */
export interface GetZeroTrustTunnelCloudflaredVirtualNetworksResult {
    /**
     * Cloudflare account ID
     */
    readonly accountId: string;
    /**
     * UUID of the virtual network.
     */
    readonly id?: string;
    /**
     * If `true`, only include the default virtual network. If `false`, exclude the default virtual network. If empty, all virtual networks will be included.
     */
    readonly isDefault?: boolean;
    /**
     * If `true`, only include deleted virtual networks. If `false`, exclude deleted virtual networks. If empty, all virtual networks will be included.
     */
    readonly isDeleted?: boolean;
    /**
     * Max items to fetch, default: 1000
     */
    readonly maxItems?: number;
    /**
     * A user-friendly name for the virtual network.
     */
    readonly name?: string;
    /**
     * The items returned by the data source
     */
    readonly results: outputs.GetZeroTrustTunnelCloudflaredVirtualNetworksResult[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleZeroTrustTunnelCloudflaredVirtualNetworks = cloudflare.getZeroTrustTunnelCloudflaredVirtualNetworks({
 *     accountId: "699d98642c564d2e855e9661899b7252",
 *     id: "f70ff985-a4ef-4643-bbbc-4a0ed4fc8415",
 *     isDefault: true,
 *     isDeleted: true,
 *     name: "us-east-1-vpc",
 * });
 * ```
 */
export function getZeroTrustTunnelCloudflaredVirtualNetworksOutput(args: GetZeroTrustTunnelCloudflaredVirtualNetworksOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetZeroTrustTunnelCloudflaredVirtualNetworksResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getZeroTrustTunnelCloudflaredVirtualNetworks:getZeroTrustTunnelCloudflaredVirtualNetworks", {
        "accountId": args.accountId,
        "id": args.id,
        "isDefault": args.isDefault,
        "isDeleted": args.isDeleted,
        "maxItems": args.maxItems,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getZeroTrustTunnelCloudflaredVirtualNetworks.
 */
export interface GetZeroTrustTunnelCloudflaredVirtualNetworksOutputArgs {
    /**
     * Cloudflare account ID
     */
    accountId: pulumi.Input<string>;
    /**
     * UUID of the virtual network.
     */
    id?: pulumi.Input<string>;
    /**
     * If `true`, only include the default virtual network. If `false`, exclude the default virtual network. If empty, all virtual networks will be included.
     */
    isDefault?: pulumi.Input<boolean>;
    /**
     * If `true`, only include deleted virtual networks. If `false`, exclude deleted virtual networks. If empty, all virtual networks will be included.
     */
    isDeleted?: pulumi.Input<boolean>;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: pulumi.Input<number>;
    /**
     * A user-friendly name for the virtual network.
     */
    name?: pulumi.Input<string>;
}
