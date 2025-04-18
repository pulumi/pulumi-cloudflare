// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamAudioTrackArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamAudioTrackArgs Empty = new StreamAudioTrackArgs();

    /**
     * The account identifier tag.
     * 
     */
    @Import(name="accountId", required=true)
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
    @Import(name="audioIdentifier")
    private @Nullable Output<String> audioIdentifier;

    /**
     * @return The unique identifier for an additional audio track.
     * 
     */
    public Optional<Output<String>> audioIdentifier() {
        return Optional.ofNullable(this.audioIdentifier);
    }

    /**
     * Denotes whether the audio track will be played by default in a player.
     * 
     */
    @Import(name="default")
    private @Nullable Output<Boolean> default_;

    /**
     * @return Denotes whether the audio track will be played by default in a player.
     * 
     */
    public Optional<Output<Boolean>> default_() {
        return Optional.ofNullable(this.default_);
    }

    /**
     * A Cloudflare-generated unique identifier for a media item.
     * 
     */
    @Import(name="identifier", required=true)
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
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return A string to uniquely identify the track amongst other audio track labels for the specified video.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    private StreamAudioTrackArgs() {}

    private StreamAudioTrackArgs(StreamAudioTrackArgs $) {
        this.accountId = $.accountId;
        this.audioIdentifier = $.audioIdentifier;
        this.default_ = $.default_;
        this.identifier = $.identifier;
        this.label = $.label;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamAudioTrackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamAudioTrackArgs $;

        public Builder() {
            $ = new StreamAudioTrackArgs();
        }

        public Builder(StreamAudioTrackArgs defaults) {
            $ = new StreamAudioTrackArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier tag.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier tag.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param audioIdentifier The unique identifier for an additional audio track.
         * 
         * @return builder
         * 
         */
        public Builder audioIdentifier(@Nullable Output<String> audioIdentifier) {
            $.audioIdentifier = audioIdentifier;
            return this;
        }

        /**
         * @param audioIdentifier The unique identifier for an additional audio track.
         * 
         * @return builder
         * 
         */
        public Builder audioIdentifier(String audioIdentifier) {
            return audioIdentifier(Output.of(audioIdentifier));
        }

        /**
         * @param default_ Denotes whether the audio track will be played by default in a player.
         * 
         * @return builder
         * 
         */
        public Builder default_(@Nullable Output<Boolean> default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param default_ Denotes whether the audio track will be played by default in a player.
         * 
         * @return builder
         * 
         */
        public Builder default_(Boolean default_) {
            return default_(Output.of(default_));
        }

        /**
         * @param identifier A Cloudflare-generated unique identifier for a media item.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier A Cloudflare-generated unique identifier for a media item.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param label A string to uniquely identify the track amongst other audio track labels for the specified video.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label A string to uniquely identify the track amongst other audio track labels for the specified video.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        public StreamAudioTrackArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("StreamAudioTrackArgs", "accountId");
            }
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("StreamAudioTrackArgs", "identifier");
            }
            return $;
        }
    }

}
