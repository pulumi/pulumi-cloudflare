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
 * const exampleQueue = cloudflare.getQueue({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     queueId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getQueue(args: GetQueueArgs, opts?: pulumi.InvokeOptions): Promise<GetQueueResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getQueue:getQueue", {
        "accountId": args.accountId,
        "queueId": args.queueId,
    }, opts);
}

/**
 * A collection of arguments for invoking getQueue.
 */
export interface GetQueueArgs {
    /**
     * A Resource identifier.
     */
    accountId: string;
    /**
     * A Resource identifier.
     */
    queueId?: string;
}

/**
 * A collection of values returned by getQueue.
 */
export interface GetQueueResult {
    /**
     * A Resource identifier.
     */
    readonly accountId: string;
    readonly consumers: outputs.GetQueueConsumer[];
    readonly consumersTotalCount: number;
    readonly createdOn: string;
    /**
     * A Resource identifier.
     */
    readonly id: string;
    readonly modifiedOn: string;
    readonly producers: outputs.GetQueueProducer[];
    readonly producersTotalCount: number;
    /**
     * A Resource identifier.
     */
    readonly queueId: string;
    readonly queueName: string;
    readonly settings: outputs.GetQueueSettings;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleQueue = cloudflare.getQueue({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     queueId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getQueueOutput(args: GetQueueOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetQueueResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getQueue:getQueue", {
        "accountId": args.accountId,
        "queueId": args.queueId,
    }, opts);
}

/**
 * A collection of arguments for invoking getQueue.
 */
export interface GetQueueOutputArgs {
    /**
     * A Resource identifier.
     */
    accountId: pulumi.Input<string>;
    /**
     * A Resource identifier.
     */
    queueId?: pulumi.Input<string>;
}
