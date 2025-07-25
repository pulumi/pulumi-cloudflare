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
 * const exampleZeroTrustDevicePostureRule = cloudflare.getZeroTrustDevicePostureRule({
 *     accountId: "699d98642c564d2e855e9661899b7252",
 *     ruleId: "f174e90a-fafe-4643-bbbc-4a0ed4fc8415",
 * });
 * ```
 */
export function getZeroTrustDevicePostureRule(args: GetZeroTrustDevicePostureRuleArgs, opts?: pulumi.InvokeOptions): Promise<GetZeroTrustDevicePostureRuleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getZeroTrustDevicePostureRule:getZeroTrustDevicePostureRule", {
        "accountId": args.accountId,
        "ruleId": args.ruleId,
    }, opts);
}

/**
 * A collection of arguments for invoking getZeroTrustDevicePostureRule.
 */
export interface GetZeroTrustDevicePostureRuleArgs {
    accountId: string;
    /**
     * API UUID.
     */
    ruleId?: string;
}

/**
 * A collection of values returned by getZeroTrustDevicePostureRule.
 */
export interface GetZeroTrustDevicePostureRuleResult {
    readonly accountId: string;
    /**
     * The description of the device posture rule.
     */
    readonly description: string;
    /**
     * Sets the expiration time for a posture check result. If empty, the result remains valid until it is overwritten by new data from the WARP client.
     */
    readonly expiration: string;
    /**
     * API UUID.
     */
    readonly id: string;
    /**
     * The value to be checked against.
     */
    readonly input: outputs.GetZeroTrustDevicePostureRuleInput;
    /**
     * The conditions that the client must match to run the rule.
     */
    readonly matches: outputs.GetZeroTrustDevicePostureRuleMatch[];
    /**
     * The name of the device posture rule.
     */
    readonly name: string;
    /**
     * API UUID.
     */
    readonly ruleId?: string;
    /**
     * Polling frequency for the WARP client posture check. Default: `5m` (poll every five minutes). Minimum: `1m`.
     */
    readonly schedule: string;
    /**
     * The type of device posture rule.
     * Available values: "file", "application", "tanium", "gateway", "warp", "disk*encryption", "serial*number", "sentinelone", "carbonblack", "firewall", "os*version", "domain*joined", "client*certificate", "client*certificate*v2", "unique*client*id", "kolide", "tanium*s2s", "crowdstrike*s2s", "intune", "workspace*one", "sentinelone*s2s", "custom*s2s".
     */
    readonly type: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleZeroTrustDevicePostureRule = cloudflare.getZeroTrustDevicePostureRule({
 *     accountId: "699d98642c564d2e855e9661899b7252",
 *     ruleId: "f174e90a-fafe-4643-bbbc-4a0ed4fc8415",
 * });
 * ```
 */
export function getZeroTrustDevicePostureRuleOutput(args: GetZeroTrustDevicePostureRuleOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetZeroTrustDevicePostureRuleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getZeroTrustDevicePostureRule:getZeroTrustDevicePostureRule", {
        "accountId": args.accountId,
        "ruleId": args.ruleId,
    }, opts);
}

/**
 * A collection of arguments for invoking getZeroTrustDevicePostureRule.
 */
export interface GetZeroTrustDevicePostureRuleOutputArgs {
    accountId: pulumi.Input<string>;
    /**
     * API UUID.
     */
    ruleId?: pulumi.Input<string>;
}
