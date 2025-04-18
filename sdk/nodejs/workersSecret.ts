// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
 * const exampleWorkersForPlatformsScriptSecret = new cloudflare.WorkersForPlatformsScriptSecret("example_workers_for_platforms_script_secret", {
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     dispatchNamespace: "my-dispatch-namespace",
 *     scriptName: "this-is_my_script-01",
 *     name: "MY_SECRET",
 *     text: "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9",
 *     type: "secret_text",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/workersSecret:WorkersSecret example '<account_id>/<dispatch_namespace>/<script_name>/<secret_name>'
 * ```
 *
 * @deprecated cloudflare.index/workerssecret.WorkersSecret has been deprecated in favor of cloudflare.index/workersforplatformsscriptsecret.WorkersForPlatformsScriptSecret
 */
export class WorkersSecret extends pulumi.CustomResource {
    /**
     * Get an existing WorkersSecret resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkersSecretState, opts?: pulumi.CustomResourceOptions): WorkersSecret {
        pulumi.log.warn("WorkersSecret is deprecated: cloudflare.index/workerssecret.WorkersSecret has been deprecated in favor of cloudflare.index/workersforplatformsscriptsecret.WorkersForPlatformsScriptSecret")
        return new WorkersSecret(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/workersSecret:WorkersSecret';

    /**
     * Returns true if the given object is an instance of WorkersSecret.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkersSecret {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkersSecret.__pulumiType;
    }

    /**
     * Identifier.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Name of the Workers for Platforms dispatch namespace.
     */
    public readonly dispatchNamespace!: pulumi.Output<string>;
    /**
     * The name of this secret, this is what will be used to access it inside the Worker.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Name of the script, used in URLs and route configuration.
     */
    public readonly scriptName!: pulumi.Output<string>;
    /**
     * The value of the secret.
     */
    public readonly text!: pulumi.Output<string | undefined>;
    /**
     * The type of secret to put.
     * Available values: "secretText".
     */
    public readonly type!: pulumi.Output<string | undefined>;

    /**
     * Create a WorkersSecret resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    /** @deprecated cloudflare.index/workerssecret.WorkersSecret has been deprecated in favor of cloudflare.index/workersforplatformsscriptsecret.WorkersForPlatformsScriptSecret */
    constructor(name: string, args: WorkersSecretArgs, opts?: pulumi.CustomResourceOptions)
    /** @deprecated cloudflare.index/workerssecret.WorkersSecret has been deprecated in favor of cloudflare.index/workersforplatformsscriptsecret.WorkersForPlatformsScriptSecret */
    constructor(name: string, argsOrState?: WorkersSecretArgs | WorkersSecretState, opts?: pulumi.CustomResourceOptions) {
        pulumi.log.warn("WorkersSecret is deprecated: cloudflare.index/workerssecret.WorkersSecret has been deprecated in favor of cloudflare.index/workersforplatformsscriptsecret.WorkersForPlatformsScriptSecret")
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkersSecretState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["dispatchNamespace"] = state ? state.dispatchNamespace : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["scriptName"] = state ? state.scriptName : undefined;
            resourceInputs["text"] = state ? state.text : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as WorkersSecretArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.dispatchNamespace === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dispatchNamespace'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.scriptName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scriptName'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["dispatchNamespace"] = args ? args.dispatchNamespace : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["scriptName"] = args ? args.scriptName : undefined;
            resourceInputs["text"] = args?.text ? pulumi.secret(args.text) : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "cloudflare:index/workersSecret:WorkersSecret" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        const secretOpts = { additionalSecretOutputs: ["text"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(WorkersSecret.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkersSecret resources.
 */
export interface WorkersSecretState {
    /**
     * Identifier.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Name of the Workers for Platforms dispatch namespace.
     */
    dispatchNamespace?: pulumi.Input<string>;
    /**
     * The name of this secret, this is what will be used to access it inside the Worker.
     */
    name?: pulumi.Input<string>;
    /**
     * Name of the script, used in URLs and route configuration.
     */
    scriptName?: pulumi.Input<string>;
    /**
     * The value of the secret.
     */
    text?: pulumi.Input<string>;
    /**
     * The type of secret to put.
     * Available values: "secretText".
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WorkersSecret resource.
 */
export interface WorkersSecretArgs {
    /**
     * Identifier.
     */
    accountId: pulumi.Input<string>;
    /**
     * Name of the Workers for Platforms dispatch namespace.
     */
    dispatchNamespace: pulumi.Input<string>;
    /**
     * The name of this secret, this is what will be used to access it inside the Worker.
     */
    name: pulumi.Input<string>;
    /**
     * Name of the script, used in URLs and route configuration.
     */
    scriptName: pulumi.Input<string>;
    /**
     * The value of the secret.
     */
    text?: pulumi.Input<string>;
    /**
     * The type of secret to put.
     * Available values: "secretText".
     */
    type?: pulumi.Input<string>;
}
