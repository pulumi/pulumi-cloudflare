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
 * const exampleFirewallRules = cloudflare.getFirewallRules({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     id: "372e67954025e0ba6aaa6d586b9e0b60",
 *     action: "block",
 *     description: "mir",
 *     paused: false,
 * });
 * ```
 */
export function getFirewallRules(args: GetFirewallRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetFirewallRulesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getFirewallRules:getFirewallRules", {
        "action": args.action,
        "description": args.description,
        "id": args.id,
        "maxItems": args.maxItems,
        "paused": args.paused,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFirewallRules.
 */
export interface GetFirewallRulesArgs {
    /**
     * The action to search for. Must be an exact match.
     */
    action?: string;
    /**
     * A case-insensitive string to find in the description.
     */
    description?: string;
    /**
     * The unique identifier of the firewall rule.
     */
    id?: string;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: number;
    /**
     * When true, indicates that the firewall rule is currently paused.
     */
    paused?: boolean;
    /**
     * Defines an identifier.
     */
    zoneId: string;
}

/**
 * A collection of values returned by getFirewallRules.
 */
export interface GetFirewallRulesResult {
    /**
     * The action to search for. Must be an exact match.
     */
    readonly action?: string;
    /**
     * A case-insensitive string to find in the description.
     */
    readonly description?: string;
    /**
     * The unique identifier of the firewall rule.
     */
    readonly id?: string;
    /**
     * Max items to fetch, default: 1000
     */
    readonly maxItems?: number;
    /**
     * When true, indicates that the firewall rule is currently paused.
     */
    readonly paused?: boolean;
    /**
     * The items returned by the data source
     */
    readonly results: outputs.GetFirewallRulesResult[];
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
 * const exampleFirewallRules = cloudflare.getFirewallRules({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     id: "372e67954025e0ba6aaa6d586b9e0b60",
 *     action: "block",
 *     description: "mir",
 *     paused: false,
 * });
 * ```
 */
export function getFirewallRulesOutput(args: GetFirewallRulesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetFirewallRulesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getFirewallRules:getFirewallRules", {
        "action": args.action,
        "description": args.description,
        "id": args.id,
        "maxItems": args.maxItems,
        "paused": args.paused,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getFirewallRules.
 */
export interface GetFirewallRulesOutputArgs {
    /**
     * The action to search for. Must be an exact match.
     */
    action?: pulumi.Input<string>;
    /**
     * A case-insensitive string to find in the description.
     */
    description?: pulumi.Input<string>;
    /**
     * The unique identifier of the firewall rule.
     */
    id?: pulumi.Input<string>;
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: pulumi.Input<number>;
    /**
     * When true, indicates that the firewall rule is currently paused.
     */
    paused?: pulumi.Input<boolean>;
    /**
     * Defines an identifier.
     */
    zoneId: pulumi.Input<string>;
}
