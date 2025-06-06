// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetStreamPlayback {
    /**
     * @return DASH Media Presentation Description for the video.
     * 
     */
    private String dash;
    /**
     * @return The HLS manifest for the video.
     * 
     */
    private String hls;

    private GetStreamPlayback() {}
    /**
     * @return DASH Media Presentation Description for the video.
     * 
     */
    public String dash() {
        return this.dash;
    }
    /**
     * @return The HLS manifest for the video.
     * 
     */
    public String hls() {
        return this.hls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamPlayback defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dash;
        private String hls;
        public Builder() {}
        public Builder(GetStreamPlayback defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dash = defaults.dash;
    	      this.hls = defaults.hls;
        }

        @CustomType.Setter
        public Builder dash(String dash) {
            if (dash == null) {
              throw new MissingRequiredPropertyException("GetStreamPlayback", "dash");
            }
            this.dash = dash;
            return this;
        }
        @CustomType.Setter
        public Builder hls(String hls) {
            if (hls == null) {
              throw new MissingRequiredPropertyException("GetStreamPlayback", "hls");
            }
            this.hls = hls;
            return this;
        }
        public GetStreamPlayback build() {
            final var _resultValue = new GetStreamPlayback();
            _resultValue.dash = dash;
            _resultValue.hls = hls;
            return _resultValue;
        }
    }
}
