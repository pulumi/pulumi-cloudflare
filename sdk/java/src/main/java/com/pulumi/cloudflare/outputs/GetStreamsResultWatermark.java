// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetStreamsResultWatermark {
    /**
     * @return The date and a time a watermark profile was created.
     * 
     */
    private String created;
    /**
     * @return The source URL for a downloaded image. If the watermark profile was created via direct upload, this field is null.
     * 
     */
    private String downloadedFrom;
    /**
     * @return The height of the image in pixels.
     * 
     */
    private Integer height;
    /**
     * @return A short description of the watermark profile.
     * 
     */
    private String name;
    /**
     * @return The translucency of the image. A value of `0.0` makes the image completely transparent, and `1.0` makes the image completely opaque. Note that if the image is already semi-transparent, setting this to `1.0` will not make the image completely opaque.
     * 
     */
    private Double opacity;
    /**
     * @return The whitespace between the adjacent edges (determined by position) of the video and the image. `0.0` indicates no padding, and `1.0` indicates a fully padded video width or length, as determined by the algorithm.
     * 
     */
    private Double padding;
    /**
     * @return The location of the image. Valid positions are: `upperRight`, `upperLeft`, `lowerLeft`, `lowerRight`, and `center`. Note that `center` ignores the `padding` parameter.
     * 
     */
    private String position;
    /**
     * @return The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. `0.0` indicates no scaling (use the size of the image as-is), and `1.0`fills the entire video.
     * 
     */
    private Double scale;
    /**
     * @return The size of the image in bytes.
     * 
     */
    private Double size;
    /**
     * @return The unique identifier for a watermark profile.
     * 
     */
    private String uid;
    /**
     * @return The width of the image in pixels.
     * 
     */
    private Integer width;

    private GetStreamsResultWatermark() {}
    /**
     * @return The date and a time a watermark profile was created.
     * 
     */
    public String created() {
        return this.created;
    }
    /**
     * @return The source URL for a downloaded image. If the watermark profile was created via direct upload, this field is null.
     * 
     */
    public String downloadedFrom() {
        return this.downloadedFrom;
    }
    /**
     * @return The height of the image in pixels.
     * 
     */
    public Integer height() {
        return this.height;
    }
    /**
     * @return A short description of the watermark profile.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The translucency of the image. A value of `0.0` makes the image completely transparent, and `1.0` makes the image completely opaque. Note that if the image is already semi-transparent, setting this to `1.0` will not make the image completely opaque.
     * 
     */
    public Double opacity() {
        return this.opacity;
    }
    /**
     * @return The whitespace between the adjacent edges (determined by position) of the video and the image. `0.0` indicates no padding, and `1.0` indicates a fully padded video width or length, as determined by the algorithm.
     * 
     */
    public Double padding() {
        return this.padding;
    }
    /**
     * @return The location of the image. Valid positions are: `upperRight`, `upperLeft`, `lowerLeft`, `lowerRight`, and `center`. Note that `center` ignores the `padding` parameter.
     * 
     */
    public String position() {
        return this.position;
    }
    /**
     * @return The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. `0.0` indicates no scaling (use the size of the image as-is), and `1.0`fills the entire video.
     * 
     */
    public Double scale() {
        return this.scale;
    }
    /**
     * @return The size of the image in bytes.
     * 
     */
    public Double size() {
        return this.size;
    }
    /**
     * @return The unique identifier for a watermark profile.
     * 
     */
    public String uid() {
        return this.uid;
    }
    /**
     * @return The width of the image in pixels.
     * 
     */
    public Integer width() {
        return this.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamsResultWatermark defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String created;
        private String downloadedFrom;
        private Integer height;
        private String name;
        private Double opacity;
        private Double padding;
        private String position;
        private Double scale;
        private Double size;
        private String uid;
        private Integer width;
        public Builder() {}
        public Builder(GetStreamsResultWatermark defaults) {
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
        public Builder created(String created) {
            if (created == null) {
              throw new MissingRequiredPropertyException("GetStreamsResultWatermark", "created");
            }
            this.created = created;
            return this;
        }
        @CustomType.Setter
        public Builder downloadedFrom(String downloadedFrom) {
            if (downloadedFrom == null) {
              throw new MissingRequiredPropertyException("GetStreamsResultWatermark", "downloadedFrom");
            }
            this.downloadedFrom = downloadedFrom;
            return this;
        }
        @CustomType.Setter
        public Builder height(Integer height) {
            if (height == null) {
              throw new MissingRequiredPropertyException("GetStreamsResultWatermark", "height");
            }
            this.height = height;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetStreamsResultWatermark", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder opacity(Double opacity) {
            if (opacity == null) {
              throw new MissingRequiredPropertyException("GetStreamsResultWatermark", "opacity");
            }
            this.opacity = opacity;
            return this;
        }
        @CustomType.Setter
        public Builder padding(Double padding) {
            if (padding == null) {
              throw new MissingRequiredPropertyException("GetStreamsResultWatermark", "padding");
            }
            this.padding = padding;
            return this;
        }
        @CustomType.Setter
        public Builder position(String position) {
            if (position == null) {
              throw new MissingRequiredPropertyException("GetStreamsResultWatermark", "position");
            }
            this.position = position;
            return this;
        }
        @CustomType.Setter
        public Builder scale(Double scale) {
            if (scale == null) {
              throw new MissingRequiredPropertyException("GetStreamsResultWatermark", "scale");
            }
            this.scale = scale;
            return this;
        }
        @CustomType.Setter
        public Builder size(Double size) {
            if (size == null) {
              throw new MissingRequiredPropertyException("GetStreamsResultWatermark", "size");
            }
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder uid(String uid) {
            if (uid == null) {
              throw new MissingRequiredPropertyException("GetStreamsResultWatermark", "uid");
            }
            this.uid = uid;
            return this;
        }
        @CustomType.Setter
        public Builder width(Integer width) {
            if (width == null) {
              throw new MissingRequiredPropertyException("GetStreamsResultWatermark", "width");
            }
            this.width = width;
            return this;
        }
        public GetStreamsResultWatermark build() {
            final var _resultValue = new GetStreamsResultWatermark();
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
