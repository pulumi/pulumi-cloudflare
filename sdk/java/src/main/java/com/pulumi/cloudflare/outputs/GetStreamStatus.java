// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetStreamStatus {
    /**
     * @return Specifies why the video failed to encode. This field is empty if the video is not in an `error` state. Preferred for programmatic use.
     * 
     */
    private String errorReasonCode;
    /**
     * @return Specifies why the video failed to encode using a human readable error message in English. This field is empty if the video is not in an `error` state.
     * 
     */
    private String errorReasonText;
    /**
     * @return Indicates the size of the entire upload in bytes. The value must be a non-negative integer.
     * 
     */
    private String pctComplete;
    /**
     * @return Specifies the processing status for all quality levels for a video.
     * Available values: &#34;pendingupload&#34;, &#34;downloading&#34;, &#34;queued&#34;, &#34;inprogress&#34;, &#34;ready&#34;, &#34;error&#34;.
     * 
     */
    private String state;

    private GetStreamStatus() {}
    /**
     * @return Specifies why the video failed to encode. This field is empty if the video is not in an `error` state. Preferred for programmatic use.
     * 
     */
    public String errorReasonCode() {
        return this.errorReasonCode;
    }
    /**
     * @return Specifies why the video failed to encode using a human readable error message in English. This field is empty if the video is not in an `error` state.
     * 
     */
    public String errorReasonText() {
        return this.errorReasonText;
    }
    /**
     * @return Indicates the size of the entire upload in bytes. The value must be a non-negative integer.
     * 
     */
    public String pctComplete() {
        return this.pctComplete;
    }
    /**
     * @return Specifies the processing status for all quality levels for a video.
     * Available values: &#34;pendingupload&#34;, &#34;downloading&#34;, &#34;queued&#34;, &#34;inprogress&#34;, &#34;ready&#34;, &#34;error&#34;.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String errorReasonCode;
        private String errorReasonText;
        private String pctComplete;
        private String state;
        public Builder() {}
        public Builder(GetStreamStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorReasonCode = defaults.errorReasonCode;
    	      this.errorReasonText = defaults.errorReasonText;
    	      this.pctComplete = defaults.pctComplete;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder errorReasonCode(String errorReasonCode) {
            if (errorReasonCode == null) {
              throw new MissingRequiredPropertyException("GetStreamStatus", "errorReasonCode");
            }
            this.errorReasonCode = errorReasonCode;
            return this;
        }
        @CustomType.Setter
        public Builder errorReasonText(String errorReasonText) {
            if (errorReasonText == null) {
              throw new MissingRequiredPropertyException("GetStreamStatus", "errorReasonText");
            }
            this.errorReasonText = errorReasonText;
            return this;
        }
        @CustomType.Setter
        public Builder pctComplete(String pctComplete) {
            if (pctComplete == null) {
              throw new MissingRequiredPropertyException("GetStreamStatus", "pctComplete");
            }
            this.pctComplete = pctComplete;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetStreamStatus", "state");
            }
            this.state = state;
            return this;
        }
        public GetStreamStatus build() {
            final var _resultValue = new GetStreamStatus();
            _resultValue.errorReasonCode = errorReasonCode;
            _resultValue.errorReasonText = errorReasonText;
            _resultValue.pctComplete = pctComplete;
            _resultValue.state = state;
            return _resultValue;
        }
    }
}
