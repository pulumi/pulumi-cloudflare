// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class Snippet extends pulumi.CustomResource {
    /**
     * Get an existing Snippet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SnippetState, opts?: pulumi.CustomResourceOptions): Snippet {
        return new Snippet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/snippet:Snippet';

    /**
     * Returns true if the given object is an instance of Snippet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Snippet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Snippet.__pulumiType;
    }

    /**
     * List of Snippet Files
     */
    public readonly files!: pulumi.Output<outputs.SnippetFile[] | undefined>;
    /**
     * Main module file name of the snippet.
     */
    public readonly mainModule!: pulumi.Output<string>;
    /**
     * Name of the snippet.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The zone identifier to target for the resource.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a Snippet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SnippetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SnippetArgs | SnippetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SnippetState | undefined;
            resourceInputs["files"] = state ? state.files : undefined;
            resourceInputs["mainModule"] = state ? state.mainModule : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as SnippetArgs | undefined;
            if ((!args || args.mainModule === undefined) && !opts.urn) {
                throw new Error("Missing required property 'mainModule'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["files"] = args ? args.files : undefined;
            resourceInputs["mainModule"] = args ? args.mainModule : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Snippet.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Snippet resources.
 */
export interface SnippetState {
    /**
     * List of Snippet Files
     */
    files?: pulumi.Input<pulumi.Input<inputs.SnippetFile>[]>;
    /**
     * Main module file name of the snippet.
     */
    mainModule?: pulumi.Input<string>;
    /**
     * Name of the snippet.
     */
    name?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Snippet resource.
 */
export interface SnippetArgs {
    /**
     * List of Snippet Files
     */
    files?: pulumi.Input<pulumi.Input<inputs.SnippetFile>[]>;
    /**
     * Main module file name of the snippet.
     */
    mainModule: pulumi.Input<string>;
    /**
     * Name of the snippet.
     */
    name: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId: pulumi.Input<string>;
}