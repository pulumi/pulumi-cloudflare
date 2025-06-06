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
 * const exampleWorkersCronTrigger = cloudflare.getWorkersCronTrigger({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     scriptName: "this-is_my_script-01",
 * });
 * ```
 */
export function getWorkersCronTrigger(args: GetWorkersCronTriggerArgs, opts?: pulumi.InvokeOptions): Promise<GetWorkersCronTriggerResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getWorkersCronTrigger:getWorkersCronTrigger", {
        "accountId": args.accountId,
        "scriptName": args.scriptName,
    }, opts);
}

/**
 * A collection of arguments for invoking getWorkersCronTrigger.
 */
export interface GetWorkersCronTriggerArgs {
    /**
     * Identifier.
     */
    accountId: string;
    /**
     * Name of the script, used in URLs and route configuration.
     */
    scriptName: string;
}

/**
 * A collection of values returned by getWorkersCronTrigger.
 */
export interface GetWorkersCronTriggerResult {
    /**
     * Identifier.
     */
    readonly accountId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly schedules: outputs.GetWorkersCronTriggerSchedule[];
    /**
     * Name of the script, used in URLs and route configuration.
     */
    readonly scriptName: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleWorkersCronTrigger = cloudflare.getWorkersCronTrigger({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     scriptName: "this-is_my_script-01",
 * });
 * ```
 */
export function getWorkersCronTriggerOutput(args: GetWorkersCronTriggerOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetWorkersCronTriggerResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getWorkersCronTrigger:getWorkersCronTrigger", {
        "accountId": args.accountId,
        "scriptName": args.scriptName,
    }, opts);
}

/**
 * A collection of arguments for invoking getWorkersCronTrigger.
 */
export interface GetWorkersCronTriggerOutputArgs {
    /**
     * Identifier.
     */
    accountId: pulumi.Input<string>;
    /**
     * Name of the script, used in URLs and route configuration.
     */
    scriptName: pulumi.Input<string>;
}
