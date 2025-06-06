// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/workersDeployment:WorkersDeployment example '<account_id>/<script_name>'
 * ```
 */
export class WorkersDeployment extends pulumi.CustomResource {
    /**
     * Get an existing WorkersDeployment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkersDeploymentState, opts?: pulumi.CustomResourceOptions): WorkersDeployment {
        return new WorkersDeployment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/workersDeployment:WorkersDeployment';

    /**
     * Returns true if the given object is an instance of WorkersDeployment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkersDeployment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkersDeployment.__pulumiType;
    }

    /**
     * Identifier.
     */
    public readonly accountId!: pulumi.Output<string>;
    public readonly annotations!: pulumi.Output<outputs.WorkersDeploymentAnnotations | undefined>;
    public /*out*/ readonly authorEmail!: pulumi.Output<string>;
    public /*out*/ readonly createdOn!: pulumi.Output<string>;
    public /*out*/ readonly deployments!: pulumi.Output<outputs.WorkersDeploymentDeployment[]>;
    /**
     * Name of the script.
     */
    public readonly scriptName!: pulumi.Output<string>;
    public /*out*/ readonly source!: pulumi.Output<string>;
    /**
     * Available values: "percentage".
     */
    public readonly strategy!: pulumi.Output<string>;
    public readonly versions!: pulumi.Output<outputs.WorkersDeploymentVersion[]>;

    /**
     * Create a WorkersDeployment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkersDeploymentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkersDeploymentArgs | WorkersDeploymentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkersDeploymentState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["authorEmail"] = state ? state.authorEmail : undefined;
            resourceInputs["createdOn"] = state ? state.createdOn : undefined;
            resourceInputs["deployments"] = state ? state.deployments : undefined;
            resourceInputs["scriptName"] = state ? state.scriptName : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
            resourceInputs["strategy"] = state ? state.strategy : undefined;
            resourceInputs["versions"] = state ? state.versions : undefined;
        } else {
            const args = argsOrState as WorkersDeploymentArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.scriptName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scriptName'");
            }
            if ((!args || args.strategy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'strategy'");
            }
            if ((!args || args.versions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'versions'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["scriptName"] = args ? args.scriptName : undefined;
            resourceInputs["strategy"] = args ? args.strategy : undefined;
            resourceInputs["versions"] = args ? args.versions : undefined;
            resourceInputs["authorEmail"] = undefined /*out*/;
            resourceInputs["createdOn"] = undefined /*out*/;
            resourceInputs["deployments"] = undefined /*out*/;
            resourceInputs["source"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WorkersDeployment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkersDeployment resources.
 */
export interface WorkersDeploymentState {
    /**
     * Identifier.
     */
    accountId?: pulumi.Input<string>;
    annotations?: pulumi.Input<inputs.WorkersDeploymentAnnotations>;
    authorEmail?: pulumi.Input<string>;
    createdOn?: pulumi.Input<string>;
    deployments?: pulumi.Input<pulumi.Input<inputs.WorkersDeploymentDeployment>[]>;
    /**
     * Name of the script.
     */
    scriptName?: pulumi.Input<string>;
    source?: pulumi.Input<string>;
    /**
     * Available values: "percentage".
     */
    strategy?: pulumi.Input<string>;
    versions?: pulumi.Input<pulumi.Input<inputs.WorkersDeploymentVersion>[]>;
}

/**
 * The set of arguments for constructing a WorkersDeployment resource.
 */
export interface WorkersDeploymentArgs {
    /**
     * Identifier.
     */
    accountId: pulumi.Input<string>;
    annotations?: pulumi.Input<inputs.WorkersDeploymentAnnotations>;
    /**
     * Name of the script.
     */
    scriptName: pulumi.Input<string>;
    /**
     * Available values: "percentage".
     */
    strategy: pulumi.Input<string>;
    versions: pulumi.Input<pulumi.Input<inputs.WorkersDeploymentVersion>[]>;
}
