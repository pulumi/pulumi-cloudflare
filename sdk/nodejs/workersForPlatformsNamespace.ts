// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The [Workers for Platforms](https://developers.cloudflare.com/cloudflare-for-platforms/workers-for-platforms/) resource allows you
 * to manage Cloudflare Workers for Platforms namespaces.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 * import * as std from "@pulumi/std";
 *
 * const example = new cloudflare.WorkersForPlatformsNamespace("example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "example-namespace",
 * });
 * const customerWorker1 = new cloudflare.WorkersScript("customer_worker_1", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "customer-worker-1",
 *     content: std.file({
 *         input: "script.js",
 *     }).then(invoke => invoke.result),
 *     dispatchNamespace: example.name,
 *     tags: ["free"],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/workersForPlatformsNamespace:WorkersForPlatformsNamespace example <account_id>/<namespace_name>
 * ```
 */
export class WorkersForPlatformsNamespace extends pulumi.CustomResource {
    /**
     * Get an existing WorkersForPlatformsNamespace resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkersForPlatformsNamespaceState, opts?: pulumi.CustomResourceOptions): WorkersForPlatformsNamespace {
        return new WorkersForPlatformsNamespace(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/workersForPlatformsNamespace:WorkersForPlatformsNamespace';

    /**
     * Returns true if the given object is an instance of WorkersForPlatformsNamespace.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkersForPlatformsNamespace {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkersForPlatformsNamespace.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The name of the Workers for Platforms namespace.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a WorkersForPlatformsNamespace resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkersForPlatformsNamespaceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkersForPlatformsNamespaceArgs | WorkersForPlatformsNamespaceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkersForPlatformsNamespaceState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as WorkersForPlatformsNamespaceArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WorkersForPlatformsNamespace.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkersForPlatformsNamespace resources.
 */
export interface WorkersForPlatformsNamespaceState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The name of the Workers for Platforms namespace.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WorkersForPlatformsNamespace resource.
 */
export interface WorkersForPlatformsNamespaceArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * The name of the Workers for Platforms namespace.
     */
    name: pulumi.Input<string>;
}
