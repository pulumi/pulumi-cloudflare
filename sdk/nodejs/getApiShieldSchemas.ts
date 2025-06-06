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
 * const exampleApiShieldSchemas = cloudflare.getApiShieldSchemas({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     validationEnabled: true,
 * });
 * ```
 */
export function getApiShieldSchemas(args: GetApiShieldSchemasArgs, opts?: pulumi.InvokeOptions): Promise<GetApiShieldSchemasResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getApiShieldSchemas:getApiShieldSchemas", {
        "maxItems": args.maxItems,
        "omitSource": args.omitSource,
        "validationEnabled": args.validationEnabled,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApiShieldSchemas.
 */
export interface GetApiShieldSchemasArgs {
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: number;
    /**
     * Omit the source-files of schemas and only retrieve their meta-data.
     */
    omitSource?: boolean;
    /**
     * Flag whether schema is enabled for validation.
     */
    validationEnabled?: boolean;
    /**
     * Identifier.
     */
    zoneId: string;
}

/**
 * A collection of values returned by getApiShieldSchemas.
 */
export interface GetApiShieldSchemasResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Max items to fetch, default: 1000
     */
    readonly maxItems?: number;
    /**
     * Omit the source-files of schemas and only retrieve their meta-data.
     */
    readonly omitSource: boolean;
    /**
     * The items returned by the data source
     */
    readonly results: outputs.GetApiShieldSchemasResult[];
    /**
     * Flag whether schema is enabled for validation.
     */
    readonly validationEnabled?: boolean;
    /**
     * Identifier.
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
 * const exampleApiShieldSchemas = cloudflare.getApiShieldSchemas({
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     validationEnabled: true,
 * });
 * ```
 */
export function getApiShieldSchemasOutput(args: GetApiShieldSchemasOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetApiShieldSchemasResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getApiShieldSchemas:getApiShieldSchemas", {
        "maxItems": args.maxItems,
        "omitSource": args.omitSource,
        "validationEnabled": args.validationEnabled,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getApiShieldSchemas.
 */
export interface GetApiShieldSchemasOutputArgs {
    /**
     * Max items to fetch, default: 1000
     */
    maxItems?: pulumi.Input<number>;
    /**
     * Omit the source-files of schemas and only retrieve their meta-data.
     */
    omitSource?: pulumi.Input<boolean>;
    /**
     * Flag whether schema is enabled for validation.
     */
    validationEnabled?: pulumi.Input<boolean>;
    /**
     * Identifier.
     */
    zoneId: pulumi.Input<string>;
}
