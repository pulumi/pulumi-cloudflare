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
 * const exampleCloudforceOneRequestMessage = new cloudflare.CloudforceOneRequestMessage("example_cloudforce_one_request_message", {
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     requestId: "f174e90a-fafe-4643-bbbc-4a0ed4fc8415",
 *     content: "Can you elaborate on the type of DoS that occurred?",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/cloudforceOneRequestMessage:CloudforceOneRequestMessage example '<account_id>/<request_id>/<page>/<per_page>'
 * ```
 */
export class CloudforceOneRequestMessage extends pulumi.CustomResource {
    /**
     * Get an existing CloudforceOneRequestMessage resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CloudforceOneRequestMessageState, opts?: pulumi.CustomResourceOptions): CloudforceOneRequestMessage {
        return new CloudforceOneRequestMessage(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/cloudforceOneRequestMessage:CloudforceOneRequestMessage';

    /**
     * Returns true if the given object is an instance of CloudforceOneRequestMessage.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CloudforceOneRequestMessage {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CloudforceOneRequestMessage.__pulumiType;
    }

    /**
     * Identifier.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Author of message.
     */
    public /*out*/ readonly author!: pulumi.Output<string>;
    /**
     * Content of message.
     */
    public readonly content!: pulumi.Output<string | undefined>;
    /**
     * Defines the message creation time.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * Whether the message is a follow-on request.
     */
    public /*out*/ readonly isFollowOnRequest!: pulumi.Output<boolean>;
    /**
     * UUID.
     */
    public readonly requestId!: pulumi.Output<string>;
    /**
     * Defines the message last updated time.
     */
    public /*out*/ readonly updated!: pulumi.Output<string>;

    /**
     * Create a CloudforceOneRequestMessage resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CloudforceOneRequestMessageArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CloudforceOneRequestMessageArgs | CloudforceOneRequestMessageState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CloudforceOneRequestMessageState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["author"] = state ? state.author : undefined;
            resourceInputs["content"] = state ? state.content : undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["isFollowOnRequest"] = state ? state.isFollowOnRequest : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["updated"] = state ? state.updated : undefined;
        } else {
            const args = argsOrState as CloudforceOneRequestMessageArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.requestId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'requestId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["content"] = args ? args.content : undefined;
            resourceInputs["requestId"] = args ? args.requestId : undefined;
            resourceInputs["author"] = undefined /*out*/;
            resourceInputs["created"] = undefined /*out*/;
            resourceInputs["isFollowOnRequest"] = undefined /*out*/;
            resourceInputs["updated"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CloudforceOneRequestMessage.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CloudforceOneRequestMessage resources.
 */
export interface CloudforceOneRequestMessageState {
    /**
     * Identifier.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Author of message.
     */
    author?: pulumi.Input<string>;
    /**
     * Content of message.
     */
    content?: pulumi.Input<string>;
    /**
     * Defines the message creation time.
     */
    created?: pulumi.Input<string>;
    /**
     * Whether the message is a follow-on request.
     */
    isFollowOnRequest?: pulumi.Input<boolean>;
    /**
     * UUID.
     */
    requestId?: pulumi.Input<string>;
    /**
     * Defines the message last updated time.
     */
    updated?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CloudforceOneRequestMessage resource.
 */
export interface CloudforceOneRequestMessageArgs {
    /**
     * Identifier.
     */
    accountId: pulumi.Input<string>;
    /**
     * Content of message.
     */
    content?: pulumi.Input<string>;
    /**
     * UUID.
     */
    requestId: pulumi.Input<string>;
}
