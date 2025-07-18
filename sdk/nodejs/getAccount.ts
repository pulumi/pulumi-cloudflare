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
 * const exampleAccount = cloudflare.getAccount({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getAccount(args?: GetAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getAccount:getAccount", {
        "accountId": args.accountId,
        "filter": args.filter,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccount.
 */
export interface GetAccountArgs {
    /**
     * Account identifier tag.
     */
    accountId?: string;
    filter?: inputs.GetAccountFilter;
}

/**
 * A collection of values returned by getAccount.
 */
export interface GetAccountResult {
    /**
     * Account identifier tag.
     */
    readonly accountId?: string;
    /**
     * Timestamp for the creation of the account
     */
    readonly createdOn: string;
    readonly filter?: outputs.GetAccountFilter;
    /**
     * Account identifier tag.
     */
    readonly id: string;
    /**
     * Account name
     */
    readonly name: string;
    /**
     * Account settings
     */
    readonly settings: outputs.GetAccountSettings;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleAccount = cloudflare.getAccount({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getAccountOutput(args?: GetAccountOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAccountResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getAccount:getAccount", {
        "accountId": args.accountId,
        "filter": args.filter,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccount.
 */
export interface GetAccountOutputArgs {
    /**
     * Account identifier tag.
     */
    accountId?: pulumi.Input<string>;
    filter?: pulumi.Input<inputs.GetAccountFilterArgs>;
}
