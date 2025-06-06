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
 * const exampleAccountSubscription = cloudflare.getAccountSubscription({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getAccountSubscription(args: GetAccountSubscriptionArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountSubscriptionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getAccountSubscription:getAccountSubscription", {
        "accountId": args.accountId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccountSubscription.
 */
export interface GetAccountSubscriptionArgs {
    /**
     * Identifier
     */
    accountId: string;
}

/**
 * A collection of values returned by getAccountSubscription.
 */
export interface GetAccountSubscriptionResult {
    /**
     * Identifier
     */
    readonly accountId: string;
    /**
     * The monetary unit in which pricing information is displayed.
     */
    readonly currency: string;
    /**
     * The end of the current period and also when the next billing is due.
     */
    readonly currentPeriodEnd: string;
    /**
     * When the current billing period started. May match initial*period*start if this is the first period.
     */
    readonly currentPeriodStart: string;
    /**
     * How often the subscription is renewed automatically.
     * Available values: "weekly", "monthly", "quarterly", "yearly".
     */
    readonly frequency: string;
    /**
     * Subscription identifier tag.
     */
    readonly id: string;
    /**
     * The price of the subscription that will be billed, in US dollars.
     */
    readonly price: number;
    /**
     * The rate plan applied to the subscription.
     */
    readonly ratePlan: outputs.GetAccountSubscriptionRatePlan;
    /**
     * The state that the subscription is in.
     * Available values: "Trial", "Provisioned", "Paid", "AwaitingPayment", "Cancelled", "Failed", "Expired".
     */
    readonly state: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleAccountSubscription = cloudflare.getAccountSubscription({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getAccountSubscriptionOutput(args: GetAccountSubscriptionOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAccountSubscriptionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getAccountSubscription:getAccountSubscription", {
        "accountId": args.accountId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccountSubscription.
 */
export interface GetAccountSubscriptionOutputArgs {
    /**
     * Identifier
     */
    accountId: pulumi.Input<string>;
}
