// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RateLimitMatchRequest {
    /**
     * @return The HTTP methods to match. You can specify a subset (for example, `[&#39;POST&#39;,&#39;PUT&#39;]`) or all methods (`[&#39;_ALL_&#39;]`). This field is optional when creating a rate limit.
     * 
     */
    private @Nullable List<String> methods;
    /**
     * @return The HTTP schemes to match. You can specify one scheme (`[&#39;HTTPS&#39;]`), both schemes (`[&#39;HTTP&#39;,&#39;HTTPS&#39;]`), or all schemes (`[&#39;_ALL_&#39;]`). This field is optional.
     * 
     */
    private @Nullable List<String> schemes;
    /**
     * @return The URL pattern to match, composed of a host and a path such as `example.org/path*`. Normalization is applied before the pattern is matched. `*` wildcards are expanded to match applicable traffic. Query strings are not matched. Set the value to `*` to match all traffic to your zone.
     * 
     */
    private @Nullable String url;

    private RateLimitMatchRequest() {}
    /**
     * @return The HTTP methods to match. You can specify a subset (for example, `[&#39;POST&#39;,&#39;PUT&#39;]`) or all methods (`[&#39;_ALL_&#39;]`). This field is optional when creating a rate limit.
     * 
     */
    public List<String> methods() {
        return this.methods == null ? List.of() : this.methods;
    }
    /**
     * @return The HTTP schemes to match. You can specify one scheme (`[&#39;HTTPS&#39;]`), both schemes (`[&#39;HTTP&#39;,&#39;HTTPS&#39;]`), or all schemes (`[&#39;_ALL_&#39;]`). This field is optional.
     * 
     */
    public List<String> schemes() {
        return this.schemes == null ? List.of() : this.schemes;
    }
    /**
     * @return The URL pattern to match, composed of a host and a path such as `example.org/path*`. Normalization is applied before the pattern is matched. `*` wildcards are expanded to match applicable traffic. Query strings are not matched. Set the value to `*` to match all traffic to your zone.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RateLimitMatchRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> methods;
        private @Nullable List<String> schemes;
        private @Nullable String url;
        public Builder() {}
        public Builder(RateLimitMatchRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methods = defaults.methods;
    	      this.schemes = defaults.schemes;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder methods(@Nullable List<String> methods) {

            this.methods = methods;
            return this;
        }
        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }
        @CustomType.Setter
        public Builder schemes(@Nullable List<String> schemes) {

            this.schemes = schemes;
            return this;
        }
        public Builder schemes(String... schemes) {
            return schemes(List.of(schemes));
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {

            this.url = url;
            return this;
        }
        public RateLimitMatchRequest build() {
            final var _resultValue = new RateLimitMatchRequest();
            _resultValue.methods = methods;
            _resultValue.schemes = schemes;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
