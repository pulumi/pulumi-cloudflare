// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RateLimitMatchResponse {
    /**
     * @return When true, only the uncached traffic served from your origin servers will count towards rate limiting. In this case, any cached traffic served by Cloudflare will not count towards rate limiting. This field is optional.
     * Notes: This field is deprecated. Instead, use response headers and set &#34;origin*traffic&#34; to &#34;false&#34; to avoid legacy behaviour interacting with the &#34;response*headers&#34; property.
     * 
     */
    private @Nullable Boolean originTraffic;

    private RateLimitMatchResponse() {}
    /**
     * @return When true, only the uncached traffic served from your origin servers will count towards rate limiting. In this case, any cached traffic served by Cloudflare will not count towards rate limiting. This field is optional.
     * Notes: This field is deprecated. Instead, use response headers and set &#34;origin*traffic&#34; to &#34;false&#34; to avoid legacy behaviour interacting with the &#34;response*headers&#34; property.
     * 
     */
    public Optional<Boolean> originTraffic() {
        return Optional.ofNullable(this.originTraffic);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RateLimitMatchResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean originTraffic;
        public Builder() {}
        public Builder(RateLimitMatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.originTraffic = defaults.originTraffic;
        }

        @CustomType.Setter
        public Builder originTraffic(@Nullable Boolean originTraffic) {

            this.originTraffic = originTraffic;
            return this;
        }
        public RateLimitMatchResponse build() {
            final var _resultValue = new RateLimitMatchResponse();
            _resultValue.originTraffic = originTraffic;
            return _resultValue;
        }
    }
}
