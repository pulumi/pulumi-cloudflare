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
 * const exampleSchemaValidationOperationSettings = new cloudflare.SchemaValidationOperationSettings("example_schema_validation_operation_settings", {
 *     zoneId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     operationId: "f174e90a-fafe-4643-bbbc-4a0ed4fc8415",
 *     mitigationAction: "block",
 * });
 * ```
 */
export class SchemaValidationOperationSettings extends pulumi.CustomResource {
    /**
     * Get an existing SchemaValidationOperationSettings resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SchemaValidationOperationSettingsState, opts?: pulumi.CustomResourceOptions): SchemaValidationOperationSettings {
        return new SchemaValidationOperationSettings(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/schemaValidationOperationSettings:SchemaValidationOperationSettings';

    /**
     * Returns true if the given object is an instance of SchemaValidationOperationSettings.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SchemaValidationOperationSettings {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SchemaValidationOperationSettings.__pulumiType;
    }

    /**
     * When set, this applies a mitigation action to this operation - `"log"` - log request when request does not conform to
     * schema for this operation - `"block"` - deny access to the site when request does not conform to schema for this
     * operation - `"none"` - will skip mitigation for this operation - `null` - clears any mitigation action Available values:
     * "log", "block", "none".
     */
    public readonly mitigationAction!: pulumi.Output<string>;
    /**
     * UUID.
     */
    public readonly operationId!: pulumi.Output<string>;
    /**
     * Identifier.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a SchemaValidationOperationSettings resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SchemaValidationOperationSettingsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SchemaValidationOperationSettingsArgs | SchemaValidationOperationSettingsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SchemaValidationOperationSettingsState | undefined;
            resourceInputs["mitigationAction"] = state ? state.mitigationAction : undefined;
            resourceInputs["operationId"] = state ? state.operationId : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as SchemaValidationOperationSettingsArgs | undefined;
            if ((!args || args.mitigationAction === undefined) && !opts.urn) {
                throw new Error("Missing required property 'mitigationAction'");
            }
            if ((!args || args.operationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'operationId'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["mitigationAction"] = args ? args.mitigationAction : undefined;
            resourceInputs["operationId"] = args ? args.operationId : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SchemaValidationOperationSettings.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SchemaValidationOperationSettings resources.
 */
export interface SchemaValidationOperationSettingsState {
    /**
     * When set, this applies a mitigation action to this operation - `"log"` - log request when request does not conform to
     * schema for this operation - `"block"` - deny access to the site when request does not conform to schema for this
     * operation - `"none"` - will skip mitigation for this operation - `null` - clears any mitigation action Available values:
     * "log", "block", "none".
     */
    mitigationAction?: pulumi.Input<string>;
    /**
     * UUID.
     */
    operationId?: pulumi.Input<string>;
    /**
     * Identifier.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SchemaValidationOperationSettings resource.
 */
export interface SchemaValidationOperationSettingsArgs {
    /**
     * When set, this applies a mitigation action to this operation - `"log"` - log request when request does not conform to
     * schema for this operation - `"block"` - deny access to the site when request does not conform to schema for this
     * operation - `"none"` - will skip mitigation for this operation - `null` - clears any mitigation action Available values:
     * "log", "block", "none".
     */
    mitigationAction: pulumi.Input<string>;
    /**
     * UUID.
     */
    operationId: pulumi.Input<string>;
    /**
     * Identifier.
     */
    zoneId: pulumi.Input<string>;
}
