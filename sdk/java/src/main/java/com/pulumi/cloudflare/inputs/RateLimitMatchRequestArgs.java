// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RateLimitMatchRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final RateLimitMatchRequestArgs Empty = new RateLimitMatchRequestArgs();

    /**
     * The HTTP methods to match. You can specify a subset (for example, `[&#39;POST&#39;,&#39;PUT&#39;]`) or all methods (`[&#39;_ALL_&#39;]`). This field is optional when creating a rate limit.
     * 
     */
    @Import(name="methods")
    private @Nullable Output<List<String>> methods;

    /**
     * @return The HTTP methods to match. You can specify a subset (for example, `[&#39;POST&#39;,&#39;PUT&#39;]`) or all methods (`[&#39;_ALL_&#39;]`). This field is optional when creating a rate limit.
     * 
     */
    public Optional<Output<List<String>>> methods() {
        return Optional.ofNullable(this.methods);
    }

    /**
     * The HTTP schemes to match. You can specify one scheme (`[&#39;HTTPS&#39;]`), both schemes (`[&#39;HTTP&#39;,&#39;HTTPS&#39;]`), or all schemes (`[&#39;_ALL_&#39;]`). This field is optional.
     * 
     */
    @Import(name="schemes")
    private @Nullable Output<List<String>> schemes;

    /**
     * @return The HTTP schemes to match. You can specify one scheme (`[&#39;HTTPS&#39;]`), both schemes (`[&#39;HTTP&#39;,&#39;HTTPS&#39;]`), or all schemes (`[&#39;_ALL_&#39;]`). This field is optional.
     * 
     */
    public Optional<Output<List<String>>> schemes() {
        return Optional.ofNullable(this.schemes);
    }

    /**
     * The URL pattern to match, composed of a host and a path such as `example.org/path*`. Normalization is applied before the pattern is matched. `*` wildcards are expanded to match applicable traffic. Query strings are not matched. Set the value to `*` to match all traffic to your zone.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The URL pattern to match, composed of a host and a path such as `example.org/path*`. Normalization is applied before the pattern is matched. `*` wildcards are expanded to match applicable traffic. Query strings are not matched. Set the value to `*` to match all traffic to your zone.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private RateLimitMatchRequestArgs() {}

    private RateLimitMatchRequestArgs(RateLimitMatchRequestArgs $) {
        this.methods = $.methods;
        this.schemes = $.schemes;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RateLimitMatchRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RateLimitMatchRequestArgs $;

        public Builder() {
            $ = new RateLimitMatchRequestArgs();
        }

        public Builder(RateLimitMatchRequestArgs defaults) {
            $ = new RateLimitMatchRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param methods The HTTP methods to match. You can specify a subset (for example, `[&#39;POST&#39;,&#39;PUT&#39;]`) or all methods (`[&#39;_ALL_&#39;]`). This field is optional when creating a rate limit.
         * 
         * @return builder
         * 
         */
        public Builder methods(@Nullable Output<List<String>> methods) {
            $.methods = methods;
            return this;
        }

        /**
         * @param methods The HTTP methods to match. You can specify a subset (for example, `[&#39;POST&#39;,&#39;PUT&#39;]`) or all methods (`[&#39;_ALL_&#39;]`). This field is optional when creating a rate limit.
         * 
         * @return builder
         * 
         */
        public Builder methods(List<String> methods) {
            return methods(Output.of(methods));
        }

        /**
         * @param methods The HTTP methods to match. You can specify a subset (for example, `[&#39;POST&#39;,&#39;PUT&#39;]`) or all methods (`[&#39;_ALL_&#39;]`). This field is optional when creating a rate limit.
         * 
         * @return builder
         * 
         */
        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }

        /**
         * @param schemes The HTTP schemes to match. You can specify one scheme (`[&#39;HTTPS&#39;]`), both schemes (`[&#39;HTTP&#39;,&#39;HTTPS&#39;]`), or all schemes (`[&#39;_ALL_&#39;]`). This field is optional.
         * 
         * @return builder
         * 
         */
        public Builder schemes(@Nullable Output<List<String>> schemes) {
            $.schemes = schemes;
            return this;
        }

        /**
         * @param schemes The HTTP schemes to match. You can specify one scheme (`[&#39;HTTPS&#39;]`), both schemes (`[&#39;HTTP&#39;,&#39;HTTPS&#39;]`), or all schemes (`[&#39;_ALL_&#39;]`). This field is optional.
         * 
         * @return builder
         * 
         */
        public Builder schemes(List<String> schemes) {
            return schemes(Output.of(schemes));
        }

        /**
         * @param schemes The HTTP schemes to match. You can specify one scheme (`[&#39;HTTPS&#39;]`), both schemes (`[&#39;HTTP&#39;,&#39;HTTPS&#39;]`), or all schemes (`[&#39;_ALL_&#39;]`). This field is optional.
         * 
         * @return builder
         * 
         */
        public Builder schemes(String... schemes) {
            return schemes(List.of(schemes));
        }

        /**
         * @param url The URL pattern to match, composed of a host and a path such as `example.org/path*`. Normalization is applied before the pattern is matched. `*` wildcards are expanded to match applicable traffic. Query strings are not matched. Set the value to `*` to match all traffic to your zone.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL pattern to match, composed of a host and a path such as `example.org/path*`. Normalization is applied before the pattern is matched. `*` wildcards are expanded to match applicable traffic. Query strings are not matched. Set the value to `*` to match all traffic to your zone.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public RateLimitMatchRequestArgs build() {
            return $;
        }
    }

}
