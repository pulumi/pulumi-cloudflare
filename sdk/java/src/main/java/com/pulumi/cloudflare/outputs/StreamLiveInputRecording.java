// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamLiveInputRecording {
    /**
     * @return Lists the origins allowed to display videos created with this input. Enter allowed origin domains in an array and use `*` for wildcard subdomains. An empty array allows videos to be viewed on any origin.
     * 
     */
    private @Nullable List<String> allowedOrigins;
    /**
     * @return Disables reporting the number of live viewers when this property is set to `true`.
     * 
     */
    private @Nullable Boolean hideLiveViewerCount;
    /**
     * @return Specifies the recording behavior for the live input. Set this value to `off` to prevent a recording. Set the value to `automatic` to begin a recording and transition to on-demand after Stream Live stops receiving input.
     * Available values: &#34;off&#34;, &#34;automatic&#34;.
     * 
     */
    private @Nullable String mode;
    /**
     * @return Indicates if a video using the live input has the `requireSignedURLs` property set. Also enforces access controls on any video recording of the livestream with the live input.
     * 
     */
    private @Nullable Boolean requireSignedUrls;
    /**
     * @return Determines the amount of time a live input configured in `automatic` mode should wait before a recording transitions from live to on-demand. `0` is recommended for most use cases and indicates the platform default should be used.
     * 
     */
    private @Nullable Integer timeoutSeconds;

    private StreamLiveInputRecording() {}
    /**
     * @return Lists the origins allowed to display videos created with this input. Enter allowed origin domains in an array and use `*` for wildcard subdomains. An empty array allows videos to be viewed on any origin.
     * 
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins == null ? List.of() : this.allowedOrigins;
    }
    /**
     * @return Disables reporting the number of live viewers when this property is set to `true`.
     * 
     */
    public Optional<Boolean> hideLiveViewerCount() {
        return Optional.ofNullable(this.hideLiveViewerCount);
    }
    /**
     * @return Specifies the recording behavior for the live input. Set this value to `off` to prevent a recording. Set the value to `automatic` to begin a recording and transition to on-demand after Stream Live stops receiving input.
     * Available values: &#34;off&#34;, &#34;automatic&#34;.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return Indicates if a video using the live input has the `requireSignedURLs` property set. Also enforces access controls on any video recording of the livestream with the live input.
     * 
     */
    public Optional<Boolean> requireSignedUrls() {
        return Optional.ofNullable(this.requireSignedUrls);
    }
    /**
     * @return Determines the amount of time a live input configured in `automatic` mode should wait before a recording transitions from live to on-demand. `0` is recommended for most use cases and indicates the platform default should be used.
     * 
     */
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamLiveInputRecording defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> allowedOrigins;
        private @Nullable Boolean hideLiveViewerCount;
        private @Nullable String mode;
        private @Nullable Boolean requireSignedUrls;
        private @Nullable Integer timeoutSeconds;
        public Builder() {}
        public Builder(StreamLiveInputRecording defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.hideLiveViewerCount = defaults.hideLiveViewerCount;
    	      this.mode = defaults.mode;
    	      this.requireSignedUrls = defaults.requireSignedUrls;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        @CustomType.Setter
        public Builder allowedOrigins(@Nullable List<String> allowedOrigins) {

            this.allowedOrigins = allowedOrigins;
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }
        @CustomType.Setter
        public Builder hideLiveViewerCount(@Nullable Boolean hideLiveViewerCount) {

            this.hideLiveViewerCount = hideLiveViewerCount;
            return this;
        }
        @CustomType.Setter
        public Builder mode(@Nullable String mode) {

            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder requireSignedUrls(@Nullable Boolean requireSignedUrls) {

            this.requireSignedUrls = requireSignedUrls;
            return this;
        }
        @CustomType.Setter
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {

            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public StreamLiveInputRecording build() {
            final var _resultValue = new StreamLiveInputRecording();
            _resultValue.allowedOrigins = allowedOrigins;
            _resultValue.hideLiveViewerCount = hideLiveViewerCount;
            _resultValue.mode = mode;
            _resultValue.requireSignedUrls = requireSignedUrls;
            _resultValue.timeoutSeconds = timeoutSeconds;
            return _resultValue;
        }
    }
}
