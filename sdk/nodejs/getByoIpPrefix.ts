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
 * const exampleByoIpPrefix = cloudflare.getByoIpPrefix({
 *     accountId: "258def64c72dae45f3e4c8516e2111f2",
 *     prefixId: "2af39739cc4e3b5910c918468bb89828",
 * });
 * ```
 */
export function getByoIpPrefix(args: GetByoIpPrefixArgs, opts?: pulumi.InvokeOptions): Promise<GetByoIpPrefixResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getByoIpPrefix:getByoIpPrefix", {
        "accountId": args.accountId,
        "prefixId": args.prefixId,
    }, opts);
}

/**
 * A collection of arguments for invoking getByoIpPrefix.
 */
export interface GetByoIpPrefixArgs {
    /**
     * Identifier of a Cloudflare account.
     */
    accountId: string;
    /**
     * Identifier of an IP Prefix.
     */
    prefixId?: string;
}

/**
 * A collection of values returned by getByoIpPrefix.
 */
export interface GetByoIpPrefixResult {
    /**
     * Identifier of a Cloudflare account.
     */
    readonly accountId: string;
    /**
     * Prefix advertisement status to the Internet. This field is only not 'null' if on demand is enabled.
     */
    readonly advertised: boolean;
    /**
     * Last time the advertisement status was changed. This field is only not 'null' if on demand is enabled.
     */
    readonly advertisedModifiedAt: string;
    /**
     * Approval state of the prefix (P = pending, V = active).
     */
    readonly approved: string;
    /**
     * Autonomous System Number (ASN) the prefix will be advertised under.
     */
    readonly asn: number;
    /**
     * IP Prefix in Classless Inter-Domain Routing format.
     */
    readonly cidr: string;
    readonly createdAt: string;
    /**
     * Description of the prefix.
     */
    readonly description: string;
    /**
     * Identifier of an IP Prefix.
     */
    readonly id: string;
    /**
     * Identifier for the uploaded LOA document.
     */
    readonly loaDocumentId: string;
    readonly modifiedAt: string;
    /**
     * Whether advertisement of the prefix to the Internet may be dynamically enabled or disabled.
     */
    readonly onDemandEnabled: boolean;
    /**
     * Whether advertisement status of the prefix is locked, meaning it cannot be changed.
     */
    readonly onDemandLocked: boolean;
    /**
     * Identifier of an IP Prefix.
     */
    readonly prefixId?: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleByoIpPrefix = cloudflare.getByoIpPrefix({
 *     accountId: "258def64c72dae45f3e4c8516e2111f2",
 *     prefixId: "2af39739cc4e3b5910c918468bb89828",
 * });
 * ```
 */
export function getByoIpPrefixOutput(args: GetByoIpPrefixOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetByoIpPrefixResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getByoIpPrefix:getByoIpPrefix", {
        "accountId": args.accountId,
        "prefixId": args.prefixId,
    }, opts);
}

/**
 * A collection of arguments for invoking getByoIpPrefix.
 */
export interface GetByoIpPrefixOutputArgs {
    /**
     * Identifier of a Cloudflare account.
     */
    accountId: pulumi.Input<string>;
    /**
     * Identifier of an IP Prefix.
     */
    prefixId?: pulumi.Input<string>;
}
