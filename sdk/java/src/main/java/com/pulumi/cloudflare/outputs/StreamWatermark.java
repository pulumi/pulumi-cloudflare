// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamWatermark {
    /**
     * @return The date and a time a watermark profile was created.
     * 
     */
    private @Nullable String created;
    /**
     * @return The source URL for a downloaded image. If the watermark profile was created via direct upload, this field is null.
     * 
     */
    private @Nullable String downloadedFrom;
    /**
     * @return The height of the image in pixels.
     * 
     */
    private @Nullable Integer height;
    /**
     * @return A short description of the watermark profile.
     * 
     */
    private @Nullable String name;
    /**
     * @return The translucency of the image. A value of `0.0` makes the image completely transparent, and `1.0` makes the image completely opaque. Note that if the image is already semi-transparent, setting this to `1.0` will not make the image completely opaque.
     * 
     */
    private @Nullable Double opacity;
    /**
     * @return The whitespace between the adjacent edges (determined by position) of the video and the image. `0.0` indicates no padding, and `1.0` indicates a fully padded video width or length, as determined by the algorithm.
     * 
     */
    private @Nullable Double padding;
    /**
     * @return The location of the image. Valid positions are: `upperRight`, `upperLeft`, `lowerLeft`, `lowerRight`, and `center`. Note that `center` ignores the `padding` parameter.
     * 
     */
    private @Nullable String position;
    /**
     * @return The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. `0.0` indicates no scaling (use the size of the image as-is), and `1.0`fills the entire video.
     * 
     */
    private @Nullable Double scale;
    /**
     * @return The size of the image in bytes.
     * 
     */
    private @Nullable Double size;
    /**
     * @return The unique identifier for a watermark profile.
     * 
     */
    private @Nullable String uid;
    /**
     * @return The width of the image in pixels.
     * 
     */
    private @Nullable Integer width;

    private StreamWatermark() {}
    /**
     * @return The date and a time a watermark profile was created.
     * 
     */
    public Optional<String> created() {
        return Optional.ofNullable(this.created);
    }
    /**
     * @return The source URL for a downloaded image. If the watermark profile was created via direct upload, this field is null.
     * 
     */
    public Optional<String> downloadedFrom() {
        return Optional.ofNullable(this.downloadedFrom);
    }
    /**
     * @return The height of the image in pixels.
     * 
     */
    public Optional<Integer> height() {
        return Optional.ofNullable(this.height);
    }
    /**
     * @return A short description of the watermark profile.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The translucency of the image. A value of `0.0` makes the image completely transparent, and `1.0` makes the image completely opaque. Note that if the image is already semi-transparent, setting this to `1.0` will not make the image completely opaque.
     * 
     */
    public Optional<Double> opacity() {
        return Optional.ofNullable(this.opacity);
    }
    /**
     * @return The whitespace between the adjacent edges (determined by position) of the video and the image. `0.0` indicates no padding, and `1.0` indicates a fully padded video width or length, as determined by the algorithm.
     * 
     */
    public Optional<Double> padding() {
        return Optional.ofNullable(this.padding);
    }
    /**
     * @return The location of the image. Valid positions are: `upperRight`, `upperLeft`, `lowerLeft`, `lowerRight`, and `center`. Note that `center` ignores the `padding` parameter.
     * 
     */
    public Optional<String> position() {
        return Optional.ofNullable(this.position);
    }
    /**
     * @return The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. `0.0` indicates no scaling (use the size of the image as-is), and `1.0`fills the entire video.
     * 
     */
    public Optional<Double> scale() {
        return Optional.ofNullable(this.scale);
    }
    /**
     * @return The size of the image in bytes.
     * 
     */
    public Optional<Double> size() {
        return Optional.ofNullable(this.size);
    }
    /**
     * @return The unique identifier for a watermark profile.
     * 
     */
    public Optional<String> uid() {
        return Optional.ofNullable(this.uid);
    }
    /**
     * @return The width of the image in pixels.
     * 
     */
    public Optional<Integer> width() {
        return Optional.ofNullable(this.width);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamWatermark defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String created;
        private @Nullable String downloadedFrom;
        private @Nullable Integer height;
        private @Nullable String name;
        private @Nullable Double opacity;
        private @Nullable Double padding;
        private @Nullable String position;
        private @Nullable Double scale;
        private @Nullable Double size;
        private @Nullable String uid;
        private @Nullable Integer width;
        public Builder() {}
        public Builder(StreamWatermark defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.downloadedFrom = defaults.downloadedFrom;
    	      this.height = defaults.height;
    	      this.name = defaults.name;
    	      this.opacity = defaults.opacity;
    	      this.padding = defaults.padding;
    	      this.position = defaults.position;
    	      this.scale = defaults.scale;
    	      this.size = defaults.size;
    	      this.uid = defaults.uid;
    	      this.width = defaults.width;
        }

        @CustomType.Setter
        public Builder created(@Nullable String created) {

            this.created = created;
            return this;
        }
        @CustomType.Setter
        public Builder downloadedFrom(@Nullable String downloadedFrom) {

            this.downloadedFrom = downloadedFrom;
            return this;
        }
        @CustomType.Setter
        public Builder height(@Nullable Integer height) {

            this.height = height;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder opacity(@Nullable Double opacity) {

            this.opacity = opacity;
            return this;
        }
        @CustomType.Setter
        public Builder padding(@Nullable Double padding) {

            this.padding = padding;
            return this;
        }
        @CustomType.Setter
        public Builder position(@Nullable String position) {

            this.position = position;
            return this;
        }
        @CustomType.Setter
        public Builder scale(@Nullable Double scale) {

            this.scale = scale;
            return this;
        }
        @CustomType.Setter
        public Builder size(@Nullable Double size) {

            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder uid(@Nullable String uid) {

            this.uid = uid;
            return this;
        }
        @CustomType.Setter
        public Builder width(@Nullable Integer width) {

            this.width = width;
            return this;
        }
        public StreamWatermark build() {
            final var _resultValue = new StreamWatermark();
            _resultValue.created = created;
            _resultValue.downloadedFrom = downloadedFrom;
            _resultValue.height = height;
            _resultValue.name = name;
            _resultValue.opacity = opacity;
            _resultValue.padding = padding;
            _resultValue.position = position;
            _resultValue.scale = scale;
            _resultValue.size = size;
            _resultValue.uid = uid;
            _resultValue.width = width;
            return _resultValue;
        }
    }
}
