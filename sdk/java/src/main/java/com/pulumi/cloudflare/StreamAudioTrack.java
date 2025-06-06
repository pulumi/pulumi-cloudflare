// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.StreamAudioTrackArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.StreamAudioTrackState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.StreamAudioTrack;
 * import com.pulumi.cloudflare.StreamAudioTrackArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleStreamAudioTrack = new StreamAudioTrack("exampleStreamAudioTrack", StreamAudioTrackArgs.builder()
 *             .accountId("023e105f4ecef8ad9ca31a8372d0c353")
 *             .identifier("ea95132c15732412d22c1476fa83f27a")
 *             .audioIdentifier("ea95132c15732412d22c1476fa83f27a")
 *             .default_(true)
 *             .label("director commentary")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="cloudflare:index/streamAudioTrack:StreamAudioTrack")
public class StreamAudioTrack extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier tag.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account identifier tag.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The unique identifier for an additional audio track.
     * 
     */
    @Export(name="audioIdentifier", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> audioIdentifier;

    /**
     * @return The unique identifier for an additional audio track.
     * 
     */
    public Output<Optional<String>> audioIdentifier() {
        return Codegen.optional(this.audioIdentifier);
    }
    /**
     * Denotes whether the audio track will be played by default in a player.
     * 
     */
    @Export(name="default", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> default_;

    /**
     * @return Denotes whether the audio track will be played by default in a player.
     * 
     */
    public Output<Boolean> default_() {
        return this.default_;
    }
    /**
     * A Cloudflare-generated unique identifier for a media item.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return A Cloudflare-generated unique identifier for a media item.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * A string to uniquely identify the track amongst other audio track labels for the specified video.
     * 
     */
    @Export(name="label", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> label;

    /**
     * @return A string to uniquely identify the track amongst other audio track labels for the specified video.
     * 
     */
    public Output<Optional<String>> label() {
        return Codegen.optional(this.label);
    }
    /**
     * Specifies the processing status of the video.
     * Available values: &#34;queued&#34;, &#34;ready&#34;, &#34;error&#34;.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Specifies the processing status of the video.
     * Available values: &#34;queued&#34;, &#34;ready&#34;, &#34;error&#34;.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A Cloudflare-generated unique identifier for a media item.
     * 
     */
    @Export(name="uid", refs={String.class}, tree="[0]")
    private Output<String> uid;

    /**
     * @return A Cloudflare-generated unique identifier for a media item.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StreamAudioTrack(java.lang.String name) {
        this(name, StreamAudioTrackArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StreamAudioTrack(java.lang.String name, StreamAudioTrackArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StreamAudioTrack(java.lang.String name, StreamAudioTrackArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/streamAudioTrack:StreamAudioTrack", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private StreamAudioTrack(java.lang.String name, Output<java.lang.String> id, @Nullable StreamAudioTrackState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/streamAudioTrack:StreamAudioTrack", name, state, makeResourceOptions(options, id), false);
    }

    private static StreamAudioTrackArgs makeArgs(StreamAudioTrackArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? StreamAudioTrackArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static StreamAudioTrack get(java.lang.String name, Output<java.lang.String> id, @Nullable StreamAudioTrackState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StreamAudioTrack(name, id, state, options);
    }
}
