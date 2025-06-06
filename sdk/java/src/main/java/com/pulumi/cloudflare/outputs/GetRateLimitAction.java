// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetRateLimitActionResponse;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRateLimitAction {
    /**
     * @return The action to perform.
     * Available values: &#34;simulate&#34;, &#34;ban&#34;, &#34;challenge&#34;, &#34;js*challenge&#34;, &#34;managed*challenge&#34;.
     * 
     */
    private String mode;
    /**
     * @return A custom content type and reponse to return when the threshold is exceeded. The custom response configured in this object will override the custom error for the zone. This object is optional.
     * Notes: If you omit this object, Cloudflare will use the default HTML error page. If &#34;mode&#34; is &#34;challenge&#34;, &#34;managed*challenge&#34;, or &#34;js*challenge&#34;, Cloudflare will use the zone challenge pages and you should not provide the &#34;response&#34; object.
     * 
     */
    private GetRateLimitActionResponse response;
    /**
     * @return The time in seconds during which Cloudflare will perform the mitigation action. Must be an integer value greater than or equal to the period.
     * Notes: If &#34;mode&#34; is &#34;challenge&#34;, &#34;managed*challenge&#34;, or &#34;js*challenge&#34;, Cloudflare will use the zone&#39;s Challenge Passage time and you should not provide this value.
     * 
     */
    private Double timeout;

    private GetRateLimitAction() {}
    /**
     * @return The action to perform.
     * Available values: &#34;simulate&#34;, &#34;ban&#34;, &#34;challenge&#34;, &#34;js*challenge&#34;, &#34;managed*challenge&#34;.
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return A custom content type and reponse to return when the threshold is exceeded. The custom response configured in this object will override the custom error for the zone. This object is optional.
     * Notes: If you omit this object, Cloudflare will use the default HTML error page. If &#34;mode&#34; is &#34;challenge&#34;, &#34;managed*challenge&#34;, or &#34;js*challenge&#34;, Cloudflare will use the zone challenge pages and you should not provide the &#34;response&#34; object.
     * 
     */
    public GetRateLimitActionResponse response() {
        return this.response;
    }
    /**
     * @return The time in seconds during which Cloudflare will perform the mitigation action. Must be an integer value greater than or equal to the period.
     * Notes: If &#34;mode&#34; is &#34;challenge&#34;, &#34;managed*challenge&#34;, or &#34;js*challenge&#34;, Cloudflare will use the zone&#39;s Challenge Passage time and you should not provide this value.
     * 
     */
    public Double timeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRateLimitAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mode;
        private GetRateLimitActionResponse response;
        private Double timeout;
        public Builder() {}
        public Builder(GetRateLimitAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.response = defaults.response;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("GetRateLimitAction", "mode");
            }
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder response(GetRateLimitActionResponse response) {
            if (response == null) {
              throw new MissingRequiredPropertyException("GetRateLimitAction", "response");
            }
            this.response = response;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(Double timeout) {
            if (timeout == null) {
              throw new MissingRequiredPropertyException("GetRateLimitAction", "timeout");
            }
            this.timeout = timeout;
            return this;
        }
        public GetRateLimitAction build() {
            final var _resultValue = new GetRateLimitAction();
            _resultValue.mode = mode;
            _resultValue.response = response;
            _resultValue.timeout = timeout;
            return _resultValue;
        }
    }
}
