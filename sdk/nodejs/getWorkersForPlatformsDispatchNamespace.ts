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
 * const exampleWorkersForPlatformsDispatchNamespace = cloudflare.getWorkersForPlatformsDispatchNamespace({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     dispatchNamespace: "my-dispatch-namespace",
 * });
 * ```
 */
export function getWorkersForPlatformsDispatchNamespace(args: GetWorkersForPlatformsDispatchNamespaceArgs, opts?: pulumi.InvokeOptions): Promise<GetWorkersForPlatformsDispatchNamespaceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getWorkersForPlatformsDispatchNamespace:getWorkersForPlatformsDispatchNamespace", {
        "accountId": args.accountId,
        "dispatchNamespace": args.dispatchNamespace,
    }, opts);
}

/**
 * A collection of arguments for invoking getWorkersForPlatformsDispatchNamespace.
 */
export interface GetWorkersForPlatformsDispatchNamespaceArgs {
    /**
     * Identifier.
     */
    accountId: string;
    /**
     * Name of the Workers for Platforms dispatch namespace.
     */
    dispatchNamespace?: string;
}

/**
 * A collection of values returned by getWorkersForPlatformsDispatchNamespace.
 */
export interface GetWorkersForPlatformsDispatchNamespaceResult {
    /**
     * Identifier.
     */
    readonly accountId: string;
    /**
     * Identifier.
     */
    readonly createdBy: string;
    /**
     * When the script was created.
     */
    readonly createdOn: string;
    /**
     * Name of the Workers for Platforms dispatch namespace.
     */
    readonly dispatchNamespace?: string;
    /**
     * Name of the Workers for Platforms dispatch namespace.
     */
    readonly id: string;
    /**
     * Identifier.
     */
    readonly modifiedBy: string;
    /**
     * When the script was last modified.
     */
    readonly modifiedOn: string;
    /**
     * API Resource UUID tag.
     */
    readonly namespaceId: string;
    /**
     * Name of the Workers for Platforms dispatch namespace.
     */
    readonly namespaceName: string;
    /**
     * The current number of scripts in this Dispatch Namespace.
     */
    readonly scriptCount: number;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleWorkersForPlatformsDispatchNamespace = cloudflare.getWorkersForPlatformsDispatchNamespace({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     dispatchNamespace: "my-dispatch-namespace",
 * });
 * ```
 */
export function getWorkersForPlatformsDispatchNamespaceOutput(args: GetWorkersForPlatformsDispatchNamespaceOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetWorkersForPlatformsDispatchNamespaceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getWorkersForPlatformsDispatchNamespace:getWorkersForPlatformsDispatchNamespace", {
        "accountId": args.accountId,
        "dispatchNamespace": args.dispatchNamespace,
    }, opts);
}

/**
 * A collection of arguments for invoking getWorkersForPlatformsDispatchNamespace.
 */
export interface GetWorkersForPlatformsDispatchNamespaceOutputArgs {
    /**
     * Identifier.
     */
    accountId: pulumi.Input<string>;
    /**
     * Name of the Workers for Platforms dispatch namespace.
     */
    dispatchNamespace?: pulumi.Input<string>;
}
