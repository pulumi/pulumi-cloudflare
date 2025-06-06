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
 * const exampleLeakedCredentialCheck = cloudflare.getLeakedCredentialCheck({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getLeakedCredentialCheck(args: GetLeakedCredentialCheckArgs, opts?: pulumi.InvokeOptions): Promise<GetLeakedCredentialCheckResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getLeakedCredentialCheck:getLeakedCredentialCheck", {
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getLeakedCredentialCheck.
 */
export interface GetLeakedCredentialCheckArgs {
    /**
     * Defines an identifier.
     */
    zoneId: string;
}

/**
 * A collection of values returned by getLeakedCredentialCheck.
 */
export interface GetLeakedCredentialCheckResult {
    /**
     * Determines whether or not Leaked Credential Checks are enabled.
     */
    readonly enabled: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Defines an identifier.
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
 * const exampleLeakedCredentialCheck = cloudflare.getLeakedCredentialCheck({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getLeakedCredentialCheckOutput(args: GetLeakedCredentialCheckOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetLeakedCredentialCheckResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getLeakedCredentialCheck:getLeakedCredentialCheck", {
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getLeakedCredentialCheck.
 */
export interface GetLeakedCredentialCheckOutputArgs {
    /**
     * Defines an identifier.
     */
    zoneId: pulumi.Input<string>;
}
