// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 */
export class R2BucketSippy extends pulumi.CustomResource {
    /**
     * Get an existing R2BucketSippy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: R2BucketSippyState, opts?: pulumi.CustomResourceOptions): R2BucketSippy {
        return new R2BucketSippy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/r2BucketSippy:R2BucketSippy';

    /**
     * Returns true if the given object is an instance of R2BucketSippy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is R2BucketSippy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === R2BucketSippy.__pulumiType;
    }

    /**
     * Account ID.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Name of the bucket.
     */
    public readonly bucketName!: pulumi.Output<string>;
    /**
     * R2 bucket to copy objects to.
     */
    public readonly destination!: pulumi.Output<outputs.R2BucketSippyDestination | undefined>;
    /**
     * State of Sippy for this bucket.
     */
    public /*out*/ readonly enabled!: pulumi.Output<boolean>;
    /**
     * Jurisdiction of the bucket
     */
    public readonly jurisdiction!: pulumi.Output<string>;
    /**
     * AWS S3 bucket to copy objects from.
     */
    public readonly source!: pulumi.Output<outputs.R2BucketSippySource | undefined>;

    /**
     * Create a R2BucketSippy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: R2BucketSippyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: R2BucketSippyArgs | R2BucketSippyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as R2BucketSippyState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["bucketName"] = state ? state.bucketName : undefined;
            resourceInputs["destination"] = state ? state.destination : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["jurisdiction"] = state ? state.jurisdiction : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
        } else {
            const args = argsOrState as R2BucketSippyArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.bucketName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bucketName'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["bucketName"] = args ? args.bucketName : undefined;
            resourceInputs["destination"] = args ? args.destination : undefined;
            resourceInputs["jurisdiction"] = args ? args.jurisdiction : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
            resourceInputs["enabled"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(R2BucketSippy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering R2BucketSippy resources.
 */
export interface R2BucketSippyState {
    /**
     * Account ID.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Name of the bucket.
     */
    bucketName?: pulumi.Input<string>;
    /**
     * R2 bucket to copy objects to.
     */
    destination?: pulumi.Input<inputs.R2BucketSippyDestination>;
    /**
     * State of Sippy for this bucket.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Jurisdiction of the bucket
     */
    jurisdiction?: pulumi.Input<string>;
    /**
     * AWS S3 bucket to copy objects from.
     */
    source?: pulumi.Input<inputs.R2BucketSippySource>;
}

/**
 * The set of arguments for constructing a R2BucketSippy resource.
 */
export interface R2BucketSippyArgs {
    /**
     * Account ID.
     */
    accountId: pulumi.Input<string>;
    /**
     * Name of the bucket.
     */
    bucketName: pulumi.Input<string>;
    /**
     * R2 bucket to copy objects to.
     */
    destination?: pulumi.Input<inputs.R2BucketSippyDestination>;
    /**
     * Jurisdiction of the bucket
     */
    jurisdiction?: pulumi.Input<string>;
    /**
     * AWS S3 bucket to copy objects from.
     */
    source?: pulumi.Input<inputs.R2BucketSippySource>;
}
