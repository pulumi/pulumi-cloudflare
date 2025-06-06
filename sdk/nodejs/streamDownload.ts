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
 * const exampleStreamDownload = new cloudflare.StreamDownload("example_stream_download", {
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     identifier: "ea95132c15732412d22c1476fa83f27a",
 * });
 * ```
 */
export class StreamDownload extends pulumi.CustomResource {
    /**
     * Get an existing StreamDownload resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StreamDownloadState, opts?: pulumi.CustomResourceOptions): StreamDownload {
        return new StreamDownload(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/streamDownload:StreamDownload';

    /**
     * Returns true if the given object is an instance of StreamDownload.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StreamDownload {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StreamDownload.__pulumiType;
    }

    /**
     * Identifier.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * A Cloudflare-generated unique identifier for a media item.
     */
    public readonly identifier!: pulumi.Output<string>;

    /**
     * Create a StreamDownload resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StreamDownloadArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StreamDownloadArgs | StreamDownloadState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StreamDownloadState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
        } else {
            const args = argsOrState as StreamDownloadArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StreamDownload.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StreamDownload resources.
 */
export interface StreamDownloadState {
    /**
     * Identifier.
     */
    accountId?: pulumi.Input<string>;
    /**
     * A Cloudflare-generated unique identifier for a media item.
     */
    identifier?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StreamDownload resource.
 */
export interface StreamDownloadArgs {
    /**
     * Identifier.
     */
    accountId: pulumi.Input<string>;
    /**
     * A Cloudflare-generated unique identifier for a media item.
     */
    identifier: pulumi.Input<string>;
}
