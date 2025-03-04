// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this datasource to lookup a tunnel in an account.
 */
export function getZeroTrustTunnelCloudflared(args: GetZeroTrustTunnelCloudflaredArgs, opts?: pulumi.InvokeOptions): Promise<GetZeroTrustTunnelCloudflaredResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getZeroTrustTunnelCloudflared:getZeroTrustTunnelCloudflared", {
        "accountId": args.accountId,
        "isDeleted": args.isDeleted,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getZeroTrustTunnelCloudflared.
 */
export interface GetZeroTrustTunnelCloudflaredArgs {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId: string;
    /**
     * If true, only include deleted tunnels. If false, exclude deleted tunnels. If empty, all tunnels will be included. **Modifying this attribute will force creation of a new resource.**
     */
    isDeleted?: boolean;
    /**
     * Name of the tunnel. **Modifying this attribute will force creation of a new resource.**
     */
    name: string;
}

/**
 * A collection of values returned by getZeroTrustTunnelCloudflared.
 */
export interface GetZeroTrustTunnelCloudflaredResult {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    readonly accountId: string;
    /**
     * ID of the tunnel.
     */
    readonly id: string;
    /**
     * If true, only include deleted tunnels. If false, exclude deleted tunnels. If empty, all tunnels will be included. **Modifying this attribute will force creation of a new resource.**
     */
    readonly isDeleted?: boolean;
    /**
     * Name of the tunnel. **Modifying this attribute will force creation of a new resource.**
     */
    readonly name: string;
    /**
     * Whether the tunnel can be configured remotely from the Zero Trust dashboard.
     */
    readonly remoteConfig: boolean;
    /**
     * The status of the tunnel. Available values: `inactive`, `degraded`, `healthy`, `down`.
     */
    readonly status: string;
    /**
     * The type of the tunnel. Available values: `cfdTunnel`, `warpConnector`.
     */
    readonly tunnelType: string;
}
/**
 * Use this datasource to lookup a tunnel in an account.
 */
export function getZeroTrustTunnelCloudflaredOutput(args: GetZeroTrustTunnelCloudflaredOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetZeroTrustTunnelCloudflaredResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getZeroTrustTunnelCloudflared:getZeroTrustTunnelCloudflared", {
        "accountId": args.accountId,
        "isDeleted": args.isDeleted,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getZeroTrustTunnelCloudflared.
 */
export interface GetZeroTrustTunnelCloudflaredOutputArgs {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId: pulumi.Input<string>;
    /**
     * If true, only include deleted tunnels. If false, exclude deleted tunnels. If empty, all tunnels will be included. **Modifying this attribute will force creation of a new resource.**
     */
    isDeleted?: pulumi.Input<boolean>;
    /**
     * Name of the tunnel. **Modifying this attribute will force creation of a new resource.**
     */
    name: pulumi.Input<string>;
}
