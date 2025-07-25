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
 * const exampleSchemaValidationOperationSettings = cloudflare.getSchemaValidationOperationSettings({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     operationId: "f174e90a-fafe-4643-bbbc-4a0ed4fc8415",
 * });
 * ```
 */
export function getSchemaValidationOperationSettings(args: GetSchemaValidationOperationSettingsArgs, opts?: pulumi.InvokeOptions): Promise<GetSchemaValidationOperationSettingsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getSchemaValidationOperationSettings:getSchemaValidationOperationSettings", {
        "operationId": args.operationId,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSchemaValidationOperationSettings.
 */
export interface GetSchemaValidationOperationSettingsArgs {
    operationId: string;
    zoneId: string;
}

/**
 * A collection of values returned by getSchemaValidationOperationSettings.
 */
export interface GetSchemaValidationOperationSettingsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly mitigationAction: string;
    readonly operationId: string;
    readonly zoneId: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleSchemaValidationOperationSettings = cloudflare.getSchemaValidationOperationSettings({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     operationId: "f174e90a-fafe-4643-bbbc-4a0ed4fc8415",
 * });
 * ```
 */
export function getSchemaValidationOperationSettingsOutput(args: GetSchemaValidationOperationSettingsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSchemaValidationOperationSettingsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getSchemaValidationOperationSettings:getSchemaValidationOperationSettings", {
        "operationId": args.operationId,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSchemaValidationOperationSettings.
 */
export interface GetSchemaValidationOperationSettingsOutputArgs {
    operationId: pulumi.Input<string>;
    zoneId: pulumi.Input<string>;
}
