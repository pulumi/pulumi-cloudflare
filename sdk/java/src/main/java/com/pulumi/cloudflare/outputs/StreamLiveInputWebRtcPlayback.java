// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamLiveInputWebRtcPlayback {
    /**
     * @return The URL used to play live video over WebRTC.
     * 
     */
    private @Nullable String url;

    private StreamLiveInputWebRtcPlayback() {}
    /**
     * @return The URL used to play live video over WebRTC.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamLiveInputWebRtcPlayback defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String url;
        public Builder() {}
        public Builder(StreamLiveInputWebRtcPlayback defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder url(@Nullable String url) {

            this.url = url;
            return this;
        }
        public StreamLiveInputWebRtcPlayback build() {
            final var _resultValue = new StreamLiveInputWebRtcPlayback();
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
