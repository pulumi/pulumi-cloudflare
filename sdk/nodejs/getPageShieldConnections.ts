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
 * const examplePageShieldConnections = cloudflare.getPageShieldConnections({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     connectionId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getPageShieldConnections(args: GetPageShieldConnectionsArgs, opts?: pulumi.InvokeOptions): Promise<GetPageShieldConnectionsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getPageShieldConnections:getPageShieldConnections", {
        "connectionId": args.connectionId,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getPageShieldConnections.
 */
export interface GetPageShieldConnectionsArgs {
    /**
     * Identifier
     */
    connectionId: string;
    /**
     * Identifier
     */
    zoneId: string;
}

/**
 * A collection of values returned by getPageShieldConnections.
 */
export interface GetPageShieldConnectionsResult {
    readonly addedAt: string;
    /**
     * Identifier
     */
    readonly connectionId: string;
    readonly domainReportedMalicious: boolean;
    readonly firstPageUrl: string;
    readonly firstSeenAt: string;
    readonly host: string;
    /**
     * Identifier
     */
    readonly id: string;
    readonly lastSeenAt: string;
    readonly maliciousDomainCategories: string[];
    readonly maliciousUrlCategories: string[];
    readonly pageUrls: string[];
    readonly url: string;
    readonly urlContainsCdnCgiPath: boolean;
    readonly urlReportedMalicious: boolean;
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
 * const examplePageShieldConnections = cloudflare.getPageShieldConnections({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     connectionId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getPageShieldConnectionsOutput(args: GetPageShieldConnectionsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPageShieldConnectionsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getPageShieldConnections:getPageShieldConnections", {
        "connectionId": args.connectionId,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getPageShieldConnections.
 */
export interface GetPageShieldConnectionsOutputArgs {
    /**
     * Identifier
     */
    connectionId: pulumi.Input<string>;
    /**
     * Identifier
     */
    zoneId: pulumi.Input<string>;
}
