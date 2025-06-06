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
 * const exampleAccountDnsSettings = cloudflare.getAccountDnsSettings({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getAccountDnsSettings(args: GetAccountDnsSettingsArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountDnsSettingsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getAccountDnsSettings:getAccountDnsSettings", {
        "accountId": args.accountId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccountDnsSettings.
 */
export interface GetAccountDnsSettingsArgs {
    /**
     * Identifier.
     */
    accountId: string;
}

/**
 * A collection of values returned by getAccountDnsSettings.
 */
export interface GetAccountDnsSettingsResult {
    /**
     * Identifier.
     */
    readonly accountId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly zoneDefaults: outputs.GetAccountDnsSettingsZoneDefaults;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleAccountDnsSettings = cloudflare.getAccountDnsSettings({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 * });
 * ```
 */
export function getAccountDnsSettingsOutput(args: GetAccountDnsSettingsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAccountDnsSettingsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getAccountDnsSettings:getAccountDnsSettings", {
        "accountId": args.accountId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccountDnsSettings.
 */
export interface GetAccountDnsSettingsOutputArgs {
    /**
     * Identifier.
     */
    accountId: pulumi.Input<string>;
}
