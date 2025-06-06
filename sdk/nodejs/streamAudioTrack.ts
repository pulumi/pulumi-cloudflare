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
 * const exampleStreamAudioTrack = new cloudflare.StreamAudioTrack("example_stream_audio_track", {
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     identifier: "ea95132c15732412d22c1476fa83f27a",
 *     audioIdentifier: "ea95132c15732412d22c1476fa83f27a",
 *     "default": true,
 *     label: "director commentary",
 * });
 * ```
 */
export class StreamAudioTrack extends pulumi.CustomResource {
    /**
     * Get an existing StreamAudioTrack resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StreamAudioTrackState, opts?: pulumi.CustomResourceOptions): StreamAudioTrack {
        return new StreamAudioTrack(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/streamAudioTrack:StreamAudioTrack';

    /**
     * Returns true if the given object is an instance of StreamAudioTrack.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StreamAudioTrack {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StreamAudioTrack.__pulumiType;
    }

    /**
     * The account identifier tag.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The unique identifier for an additional audio track.
     */
    public readonly audioIdentifier!: pulumi.Output<string | undefined>;
    /**
     * Denotes whether the audio track will be played by default in a player.
     */
    public readonly default!: pulumi.Output<boolean>;
    /**
     * A Cloudflare-generated unique identifier for a media item.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * A string to uniquely identify the track amongst other audio track labels for the specified video.
     */
    public readonly label!: pulumi.Output<string | undefined>;
    /**
     * Specifies the processing status of the video.
     * Available values: "queued", "ready", "error".
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A Cloudflare-generated unique identifier for a media item.
     */
    public /*out*/ readonly uid!: pulumi.Output<string>;

    /**
     * Create a StreamAudioTrack resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StreamAudioTrackArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StreamAudioTrackArgs | StreamAudioTrackState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StreamAudioTrackState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["audioIdentifier"] = state ? state.audioIdentifier : undefined;
            resourceInputs["default"] = state ? state.default : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["label"] = state ? state.label : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["uid"] = state ? state.uid : undefined;
        } else {
            const args = argsOrState as StreamAudioTrackArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["audioIdentifier"] = args ? args.audioIdentifier : undefined;
            resourceInputs["default"] = args ? args.default : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["label"] = args ? args.label : undefined;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["uid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StreamAudioTrack.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StreamAudioTrack resources.
 */
export interface StreamAudioTrackState {
    /**
     * The account identifier tag.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The unique identifier for an additional audio track.
     */
    audioIdentifier?: pulumi.Input<string>;
    /**
     * Denotes whether the audio track will be played by default in a player.
     */
    default?: pulumi.Input<boolean>;
    /**
     * A Cloudflare-generated unique identifier for a media item.
     */
    identifier?: pulumi.Input<string>;
    /**
     * A string to uniquely identify the track amongst other audio track labels for the specified video.
     */
    label?: pulumi.Input<string>;
    /**
     * Specifies the processing status of the video.
     * Available values: "queued", "ready", "error".
     */
    status?: pulumi.Input<string>;
    /**
     * A Cloudflare-generated unique identifier for a media item.
     */
    uid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StreamAudioTrack resource.
 */
export interface StreamAudioTrackArgs {
    /**
     * The account identifier tag.
     */
    accountId: pulumi.Input<string>;
    /**
     * The unique identifier for an additional audio track.
     */
    audioIdentifier?: pulumi.Input<string>;
    /**
     * Denotes whether the audio track will be played by default in a player.
     */
    default?: pulumi.Input<boolean>;
    /**
     * A Cloudflare-generated unique identifier for a media item.
     */
    identifier: pulumi.Input<string>;
    /**
     * A string to uniquely identify the track amongst other audio track labels for the specified video.
     */
    label?: pulumi.Input<string>;
}
