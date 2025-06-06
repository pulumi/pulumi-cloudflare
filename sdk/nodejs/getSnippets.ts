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
 * const exampleSnippets = cloudflare.getSnippets({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     snippetName: "snippet_name_01",
 * });
 * ```
 */
export function getSnippets(args: GetSnippetsArgs, opts?: pulumi.InvokeOptions): Promise<GetSnippetsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getSnippets:getSnippets", {
        "snippetName": args.snippetName,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSnippets.
 */
export interface GetSnippetsArgs {
    /**
     * Snippet identifying name
     */
    snippetName: string;
    /**
     * Identifier
     */
    zoneId: string;
}

/**
 * A collection of values returned by getSnippets.
 */
export interface GetSnippetsResult {
    /**
     * Creation time of the snippet
     */
    readonly createdOn: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Modification time of the snippet
     */
    readonly modifiedOn: string;
    /**
     * Snippet identifying name
     */
    readonly snippetName: string;
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
 * const exampleSnippets = cloudflare.getSnippets({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     snippetName: "snippet_name_01",
 * });
 * ```
 */
export function getSnippetsOutput(args: GetSnippetsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSnippetsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getSnippets:getSnippets", {
        "snippetName": args.snippetName,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSnippets.
 */
export interface GetSnippetsOutputArgs {
    /**
     * Snippet identifying name
     */
    snippetName: pulumi.Input<string>;
    /**
     * Identifier
     */
    zoneId: pulumi.Input<string>;
}
