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
 * const exampleAccountApiTokenPermissionGroupsList = cloudflare.getAccountApiTokenPermissionGroupsList({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getAccountApiTokenPermissionGroupsList(args: GetAccountApiTokenPermissionGroupsListArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountApiTokenPermissionGroupsListResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getAccountApiTokenPermissionGroupsList:getAccountApiTokenPermissionGroupsList", {
        "accountId": args.accountId,
        "maxItems": args.maxItems,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccountApiTokenPermissionGroupsList.
 */
export interface GetAccountApiTokenPermissionGroupsListArgs {
    /**
     * Account identifier tag.
     */
    accountId: string;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: number;
}

/**
 * A collection of values returned by getAccountApiTokenPermissionGroupsList.
 */
export interface GetAccountApiTokenPermissionGroupsListResult {
    /**
     * Account identifier tag.
     */
    readonly accountId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Max items to fetch, default: 1000
     */
    readonly maxItems?: number;
    /**
     * The items returned by the data source
     */
    readonly results: outputs.GetAccountApiTokenPermissionGroupsListResult[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleAccountApiTokenPermissionGroupsList = cloudflare.getAccountApiTokenPermissionGroupsList({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getAccountApiTokenPermissionGroupsListOutput(args: GetAccountApiTokenPermissionGroupsListOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAccountApiTokenPermissionGroupsListResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getAccountApiTokenPermissionGroupsList:getAccountApiTokenPermissionGroupsList", {
        "accountId": args.accountId,
        "maxItems": args.maxItems,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccountApiTokenPermissionGroupsList.
 */
export interface GetAccountApiTokenPermissionGroupsListOutputArgs {
    /**
     * Account identifier tag.
     */
    accountId: pulumi.Input<string>;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: pulumi.Input<number>;
}
