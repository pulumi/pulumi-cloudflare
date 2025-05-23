// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamWatermarkArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamWatermarkArgs Empty = new StreamWatermarkArgs();

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
     * The image file to upload.
     * 
     */
    @Import(name="file", required=true)
    private Output<String> file;

    /**
     * @return The image file to upload.
     * 
     */
    public Output<String> file() {
        return this.file;
    }

    /**
     * The unique identifier for a watermark profile.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return The unique identifier for a watermark profile.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * A short description of the watermark profile.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A short description of the watermark profile.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The translucency of the image. A value of `0.0` makes the image completely transparent, and `1.0` makes the image completely opaque. Note that if the image is already semi-transparent, setting this to `1.0` will not make the image completely opaque.
     * 
     */
    @Import(name="opacity")
    private @Nullable Output<Double> opacity;

    /**
     * @return The translucency of the image. A value of `0.0` makes the image completely transparent, and `1.0` makes the image completely opaque. Note that if the image is already semi-transparent, setting this to `1.0` will not make the image completely opaque.
     * 
     */
    public Optional<Output<Double>> opacity() {
        return Optional.ofNullable(this.opacity);
    }

    /**
     * The whitespace between the adjacent edges (determined by position) of the video and the image. `0.0` indicates no padding, and `1.0` indicates a fully padded video width or length, as determined by the algorithm.
     * 
     */
    @Import(name="padding")
    private @Nullable Output<Double> padding;

    /**
     * @return The whitespace between the adjacent edges (determined by position) of the video and the image. `0.0` indicates no padding, and `1.0` indicates a fully padded video width or length, as determined by the algorithm.
     * 
     */
    public Optional<Output<Double>> padding() {
        return Optional.ofNullable(this.padding);
    }

    /**
     * The location of the image. Valid positions are: `upperRight`, `upperLeft`, `lowerLeft`, `lowerRight`, and `center`. Note that `center` ignores the `padding` parameter.
     * 
     */
    @Import(name="position")
    private @Nullable Output<String> position;

    /**
     * @return The location of the image. Valid positions are: `upperRight`, `upperLeft`, `lowerLeft`, `lowerRight`, and `center`. Note that `center` ignores the `padding` parameter.
     * 
     */
    public Optional<Output<String>> position() {
        return Optional.ofNullable(this.position);
    }

    /**
     * The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. `0.0` indicates no scaling (use the size of the image as-is), and `1.0`fills the entire video.
     * 
     */
    @Import(name="scale")
    private @Nullable Output<Double> scale;

    /**
     * @return The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. `0.0` indicates no scaling (use the size of the image as-is), and `1.0`fills the entire video.
     * 
     */
    public Optional<Output<Double>> scale() {
        return Optional.ofNullable(this.scale);
    }

    private StreamWatermarkArgs() {}

    private StreamWatermarkArgs(StreamWatermarkArgs $) {
        this.accountId = $.accountId;
        this.file = $.file;
        this.identifier = $.identifier;
        this.name = $.name;
        this.opacity = $.opacity;
        this.padding = $.padding;
        this.position = $.position;
        this.scale = $.scale;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamWatermarkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamWatermarkArgs $;

        public Builder() {
            $ = new StreamWatermarkArgs();
        }

        public Builder(StreamWatermarkArgs defaults) {
            $ = new StreamWatermarkArgs(Objects.requireNonNull(defaults));
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
         * @param file The image file to upload.
         * 
         * @return builder
         * 
         */
        public Builder file(Output<String> file) {
            $.file = file;
            return this;
        }

        /**
         * @param file The image file to upload.
         * 
         * @return builder
         * 
         */
        public Builder file(String file) {
            return file(Output.of(file));
        }

        /**
         * @param identifier The unique identifier for a watermark profile.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier The unique identifier for a watermark profile.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param name A short description of the watermark profile.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A short description of the watermark profile.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param opacity The translucency of the image. A value of `0.0` makes the image completely transparent, and `1.0` makes the image completely opaque. Note that if the image is already semi-transparent, setting this to `1.0` will not make the image completely opaque.
         * 
         * @return builder
         * 
         */
        public Builder opacity(@Nullable Output<Double> opacity) {
            $.opacity = opacity;
            return this;
        }

        /**
         * @param opacity The translucency of the image. A value of `0.0` makes the image completely transparent, and `1.0` makes the image completely opaque. Note that if the image is already semi-transparent, setting this to `1.0` will not make the image completely opaque.
         * 
         * @return builder
         * 
         */
        public Builder opacity(Double opacity) {
            return opacity(Output.of(opacity));
        }

        /**
         * @param padding The whitespace between the adjacent edges (determined by position) of the video and the image. `0.0` indicates no padding, and `1.0` indicates a fully padded video width or length, as determined by the algorithm.
         * 
         * @return builder
         * 
         */
        public Builder padding(@Nullable Output<Double> padding) {
            $.padding = padding;
            return this;
        }

        /**
         * @param padding The whitespace between the adjacent edges (determined by position) of the video and the image. `0.0` indicates no padding, and `1.0` indicates a fully padded video width or length, as determined by the algorithm.
         * 
         * @return builder
         * 
         */
        public Builder padding(Double padding) {
            return padding(Output.of(padding));
        }

        /**
         * @param position The location of the image. Valid positions are: `upperRight`, `upperLeft`, `lowerLeft`, `lowerRight`, and `center`. Note that `center` ignores the `padding` parameter.
         * 
         * @return builder
         * 
         */
        public Builder position(@Nullable Output<String> position) {
            $.position = position;
            return this;
        }

        /**
         * @param position The location of the image. Valid positions are: `upperRight`, `upperLeft`, `lowerLeft`, `lowerRight`, and `center`. Note that `center` ignores the `padding` parameter.
         * 
         * @return builder
         * 
         */
        public Builder position(String position) {
            return position(Output.of(position));
        }

        /**
         * @param scale The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. `0.0` indicates no scaling (use the size of the image as-is), and `1.0`fills the entire video.
         * 
         * @return builder
         * 
         */
        public Builder scale(@Nullable Output<Double> scale) {
            $.scale = scale;
            return this;
        }

        /**
         * @param scale The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. `0.0` indicates no scaling (use the size of the image as-is), and `1.0`fills the entire video.
         * 
         * @return builder
         * 
         */
        public Builder scale(Double scale) {
            return scale(Output.of(scale));
        }

        public StreamWatermarkArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("StreamWatermarkArgs", "accountId");
            }
            if ($.file == null) {
                throw new MissingRequiredPropertyException("StreamWatermarkArgs", "file");
            }
            return $;
        }
    }

}
