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
 * const exampleR2BucketEventNotification = new cloudflare.R2BucketEventNotification("example_r2_bucket_event_notification", {
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     bucketName: "example-bucket",
 *     queueId: "queue_id",
 *     rules: [{
 *         actions: [
 *             "PutObject",
 *             "CopyObject",
 *         ],
 *         description: "Notifications from source bucket to queue",
 *         prefix: "img/",
 *         suffix: ".jpeg",
 *     }],
 * });
 * ```
 */
export class R2BucketEventNotification extends pulumi.CustomResource {
    /**
     * Get an existing R2BucketEventNotification resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: R2BucketEventNotificationState, opts?: pulumi.CustomResourceOptions): R2BucketEventNotification {
        return new R2BucketEventNotification(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/r2BucketEventNotification:R2BucketEventNotification';

    /**
     * Returns true if the given object is an instance of R2BucketEventNotification.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is R2BucketEventNotification {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === R2BucketEventNotification.__pulumiType;
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
     * Jurisdiction of the bucket
     */
    public readonly jurisdiction!: pulumi.Output<string>;
    /**
     * Queue ID.
     */
    public readonly queueId!: pulumi.Output<string>;
    /**
     * Name of the queue.
     */
    public /*out*/ readonly queueName!: pulumi.Output<string>;
    /**
     * Array of rules to drive notifications.
     */
    public readonly rules!: pulumi.Output<outputs.R2BucketEventNotificationRule[] | undefined>;

    /**
     * Create a R2BucketEventNotification resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: R2BucketEventNotificationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: R2BucketEventNotificationArgs | R2BucketEventNotificationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as R2BucketEventNotificationState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["bucketName"] = state ? state.bucketName : undefined;
            resourceInputs["jurisdiction"] = state ? state.jurisdiction : undefined;
            resourceInputs["queueId"] = state ? state.queueId : undefined;
            resourceInputs["queueName"] = state ? state.queueName : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
        } else {
            const args = argsOrState as R2BucketEventNotificationArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.bucketName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bucketName'");
            }
            if ((!args || args.queueId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'queueId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["bucketName"] = args ? args.bucketName : undefined;
            resourceInputs["jurisdiction"] = args ? args.jurisdiction : undefined;
            resourceInputs["queueId"] = args ? args.queueId : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
            resourceInputs["queueName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(R2BucketEventNotification.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering R2BucketEventNotification resources.
 */
export interface R2BucketEventNotificationState {
    /**
     * Account ID.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Name of the bucket.
     */
    bucketName?: pulumi.Input<string>;
    /**
     * Jurisdiction of the bucket
     */
    jurisdiction?: pulumi.Input<string>;
    /**
     * Queue ID.
     */
    queueId?: pulumi.Input<string>;
    /**
     * Name of the queue.
     */
    queueName?: pulumi.Input<string>;
    /**
     * Array of rules to drive notifications.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.R2BucketEventNotificationRule>[]>;
}

/**
 * The set of arguments for constructing a R2BucketEventNotification resource.
 */
export interface R2BucketEventNotificationArgs {
    /**
     * Account ID.
     */
    accountId: pulumi.Input<string>;
    /**
     * Name of the bucket.
     */
    bucketName: pulumi.Input<string>;
    /**
     * Jurisdiction of the bucket
     */
    jurisdiction?: pulumi.Input<string>;
    /**
     * Queue ID.
     */
    queueId: pulumi.Input<string>;
    /**
     * Array of rules to drive notifications.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.R2BucketEventNotificationRule>[]>;
}
