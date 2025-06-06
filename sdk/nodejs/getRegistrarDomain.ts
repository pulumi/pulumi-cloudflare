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
 * const exampleRegistrarDomain = cloudflare.getRegistrarDomain({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     domainName: "cloudflare.com",
 * });
 * ```
 */
export function getRegistrarDomain(args: GetRegistrarDomainArgs, opts?: pulumi.InvokeOptions): Promise<GetRegistrarDomainResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getRegistrarDomain:getRegistrarDomain", {
        "accountId": args.accountId,
        "domainName": args.domainName,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegistrarDomain.
 */
export interface GetRegistrarDomainArgs {
    /**
     * Identifier
     */
    accountId: string;
    /**
     * Domain name.
     */
    domainName: string;
}

/**
 * A collection of values returned by getRegistrarDomain.
 */
export interface GetRegistrarDomainResult {
    /**
     * Identifier
     */
    readonly accountId: string;
    /**
     * Domain name.
     */
    readonly domainName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleRegistrarDomain = cloudflare.getRegistrarDomain({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     domainName: "cloudflare.com",
 * });
 * ```
 */
export function getRegistrarDomainOutput(args: GetRegistrarDomainOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetRegistrarDomainResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getRegistrarDomain:getRegistrarDomain", {
        "accountId": args.accountId,
        "domainName": args.domainName,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegistrarDomain.
 */
export interface GetRegistrarDomainOutputArgs {
    /**
     * Identifier
     */
    accountId: pulumi.Input<string>;
    /**
     * Domain name.
     */
    domainName: pulumi.Input<string>;
}
