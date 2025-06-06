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
 * const exampleD1Databases = cloudflare.getD1Databases({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     name: "name",
 * });
 * ```
 */
export function getD1Databases(args: GetD1DatabasesArgs, opts?: pulumi.InvokeOptions): Promise<GetD1DatabasesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getD1Databases:getD1Databases", {
        "accountId": args.accountId,
        "maxItems": args.maxItems,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getD1Databases.
 */
export interface GetD1DatabasesArgs {
    /**
     * Account identifier tag.
     */
    accountId: string;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: number;
    /**
     * a database name to search for.
     */
    name?: string;
}

/**
 * A collection of values returned by getD1Databases.
 */
export interface GetD1DatabasesResult {
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
     * a database name to search for.
     */
    readonly name?: string;
    /**
     * The items returned by the data source
     */
    readonly results: outputs.GetD1DatabasesResult[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleD1Databases = cloudflare.getD1Databases({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     name: "name",
 * });
 * ```
 */
export function getD1DatabasesOutput(args: GetD1DatabasesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetD1DatabasesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getD1Databases:getD1Databases", {
        "accountId": args.accountId,
        "maxItems": args.maxItems,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getD1Databases.
 */
export interface GetD1DatabasesOutputArgs {
    /**
     * Account identifier tag.
     */
    accountId: pulumi.Input<string>;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: pulumi.Input<number>;
    /**
     * a database name to search for.
     */
    name?: pulumi.Input<string>;
}
