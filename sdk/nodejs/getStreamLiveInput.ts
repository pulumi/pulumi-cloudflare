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
 * const exampleStreamLiveInput = cloudflare.getStreamLiveInput({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     liveInputIdentifier: "66be4bf738797e01e1fca35a7bdecdcd",
 * });
 * ```
 */
export function getStreamLiveInput(args: GetStreamLiveInputArgs, opts?: pulumi.InvokeOptions): Promise<GetStreamLiveInputResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getStreamLiveInput:getStreamLiveInput", {
        "accountId": args.accountId,
        "liveInputIdentifier": args.liveInputIdentifier,
    }, opts);
}

/**
 * A collection of arguments for invoking getStreamLiveInput.
 */
export interface GetStreamLiveInputArgs {
    /**
     * Identifier.
     */
    accountId: string;
    /**
     * A unique identifier for a live input.
     */
    liveInputIdentifier: string;
}

/**
 * A collection of values returned by getStreamLiveInput.
 */
export interface GetStreamLiveInputResult {
    /**
     * Identifier.
     */
    readonly accountId: string;
    /**
     * The date and time the live input was created.
     */
    readonly created: string;
    /**
     * Indicates the number of days after which the live inputs recordings will be deleted. When a stream completes and the recording is ready, the value is used to calculate a scheduled deletion date for that recording. Omit the field to indicate no change, or include with a `null` value to remove an existing scheduled deletion.
     */
    readonly deleteRecordingAfterDays: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A unique identifier for a live input.
     */
    readonly liveInputIdentifier: string;
    /**
     * A user modifiable key-value store used to reference other systems of record for managing live inputs.
     */
    readonly meta: string;
    /**
     * The date and time the live input was last modified.
     */
    readonly modified: string;
    /**
     * Records the input to a Cloudflare Stream video. Behavior depends on the mode. In most cases, the video will initially be viewable as a live video and transition to on-demand after a condition is satisfied.
     */
    readonly recording: outputs.GetStreamLiveInputRecording;
    /**
     * Details for streaming to an live input using RTMPS.
     */
    readonly rtmps: outputs.GetStreamLiveInputRtmps;
    /**
     * Details for playback from an live input using RTMPS.
     */
    readonly rtmpsPlayback: outputs.GetStreamLiveInputRtmpsPlayback;
    /**
     * Details for streaming to a live input using SRT.
     */
    readonly srt: outputs.GetStreamLiveInputSrt;
    /**
     * Details for playback from an live input using SRT.
     */
    readonly srtPlayback: outputs.GetStreamLiveInputSrtPlayback;
    /**
     * The connection status of a live input.
     * Available values: "connected", "reconnected", "reconnecting", "client*disconnect", "ttl*exceeded", "failed*to*connect", "failed*to*reconnect", "new*configuration*accepted".
     */
    readonly status: string;
    /**
     * A unique identifier for a live input.
     */
    readonly uid: string;
    /**
     * Details for streaming to a live input using WebRTC.
     */
    readonly webRtc: outputs.GetStreamLiveInputWebRtc;
    /**
     * Details for playback from a live input using WebRTC.
     */
    readonly webRtcPlayback: outputs.GetStreamLiveInputWebRtcPlayback;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleStreamLiveInput = cloudflare.getStreamLiveInput({
 *     accountId: "023e105f4ecef8ad9ca31a8372d0c353",
 *     liveInputIdentifier: "66be4bf738797e01e1fca35a7bdecdcd",
 * });
 * ```
 */
export function getStreamLiveInputOutput(args: GetStreamLiveInputOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetStreamLiveInputResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getStreamLiveInput:getStreamLiveInput", {
        "accountId": args.accountId,
        "liveInputIdentifier": args.liveInputIdentifier,
    }, opts);
}

/**
 * A collection of arguments for invoking getStreamLiveInput.
 */
export interface GetStreamLiveInputOutputArgs {
    /**
     * Identifier.
     */
    accountId: pulumi.Input<string>;
    /**
     * A unique identifier for a live input.
     */
    liveInputIdentifier: pulumi.Input<string>;
}
