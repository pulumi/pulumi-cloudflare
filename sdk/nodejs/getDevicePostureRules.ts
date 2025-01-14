// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to lookup a list of [Device Posture Rule](https://developers.cloudflare.com/cloudflare-one/identity/devices)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = cloudflare.getDevicePostureRules({
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "check for /dev/random",
 *     type: "file",
 * });
 * ```
 */
export function getDevicePostureRules(args: GetDevicePostureRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetDevicePostureRulesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getDevicePostureRules:getDevicePostureRules", {
        "accountId": args.accountId,
        "name": args.name,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getDevicePostureRules.
 */
export interface GetDevicePostureRulesArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: string;
    /**
     * Name of the Device Posture Rule.
     */
    name?: string;
    /**
     * The device posture rule type. Available values: `serialNumber`, `file`, `application`, `gateway`, `warp`, `domainJoined`, `osVersion`, `diskEncryption`, `firewall`, `clientCertificate`, `clientCertificateV2`, `workspaceOne`, `uniqueClientId`, `crowdstrikeS2s`, `sentinelone`, `kolide`, `taniumS2s`, `intune`, `sentineloneS2s`, `customS2s`.
     */
    type?: string;
}

/**
 * A collection of values returned by getDevicePostureRules.
 */
export interface GetDevicePostureRulesResult {
    /**
     * The account identifier to target for the resource.
     */
    readonly accountId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Name of the Device Posture Rule.
     */
    readonly name?: string;
    /**
     * A list of matching Device Posture Rules.
     */
    readonly rules: outputs.GetDevicePostureRulesRule[];
    /**
     * The device posture rule type. Available values: `serialNumber`, `file`, `application`, `gateway`, `warp`, `domainJoined`, `osVersion`, `diskEncryption`, `firewall`, `clientCertificate`, `clientCertificateV2`, `workspaceOne`, `uniqueClientId`, `crowdstrikeS2s`, `sentinelone`, `kolide`, `taniumS2s`, `intune`, `sentineloneS2s`, `customS2s`.
     */
    readonly type?: string;
}
/**
 * Use this data source to lookup a list of [Device Posture Rule](https://developers.cloudflare.com/cloudflare-one/identity/devices)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = cloudflare.getDevicePostureRules({
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "check for /dev/random",
 *     type: "file",
 * });
 * ```
 */
export function getDevicePostureRulesOutput(args: GetDevicePostureRulesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDevicePostureRulesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getDevicePostureRules:getDevicePostureRules", {
        "accountId": args.accountId,
        "name": args.name,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getDevicePostureRules.
 */
export interface GetDevicePostureRulesOutputArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * Name of the Device Posture Rule.
     */
    name?: pulumi.Input<string>;
    /**
     * The device posture rule type. Available values: `serialNumber`, `file`, `application`, `gateway`, `warp`, `domainJoined`, `osVersion`, `diskEncryption`, `firewall`, `clientCertificate`, `clientCertificateV2`, `workspaceOne`, `uniqueClientId`, `crowdstrikeS2s`, `sentinelone`, `kolide`, `taniumS2s`, `intune`, `sentineloneS2s`, `customS2s`.
     */
    type?: pulumi.Input<string>;
}
