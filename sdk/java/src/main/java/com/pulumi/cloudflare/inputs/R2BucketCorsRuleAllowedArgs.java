// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class R2BucketCorsRuleAllowedArgs extends com.pulumi.resources.ResourceArgs {

    public static final R2BucketCorsRuleAllowedArgs Empty = new R2BucketCorsRuleAllowedArgs();

    /**
     * Specifies the value for the Access-Control-Allow-Headers header R2 sets when requesting objects in this bucket from a browser. Cross-origin requests that include custom headers (e.g. x-user-id) should specify these headers as AllowedHeaders.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<String>> headers;

    /**
     * @return Specifies the value for the Access-Control-Allow-Headers header R2 sets when requesting objects in this bucket from a browser. Cross-origin requests that include custom headers (e.g. x-user-id) should specify these headers as AllowedHeaders.
     * 
     */
    public Optional<Output<List<String>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * Specifies the value for the Access-Control-Allow-Methods header R2 sets when requesting objects in a bucket from a browser.
     * 
     */
    @Import(name="methods", required=true)
    private Output<List<String>> methods;

    /**
     * @return Specifies the value for the Access-Control-Allow-Methods header R2 sets when requesting objects in a bucket from a browser.
     * 
     */
    public Output<List<String>> methods() {
        return this.methods;
    }

    /**
     * Specifies the value for the Access-Control-Allow-Origin header R2 sets when requesting objects in a bucket from a browser.
     * 
     */
    @Import(name="origins", required=true)
    private Output<List<String>> origins;

    /**
     * @return Specifies the value for the Access-Control-Allow-Origin header R2 sets when requesting objects in a bucket from a browser.
     * 
     */
    public Output<List<String>> origins() {
        return this.origins;
    }

    private R2BucketCorsRuleAllowedArgs() {}

    private R2BucketCorsRuleAllowedArgs(R2BucketCorsRuleAllowedArgs $) {
        this.headers = $.headers;
        this.methods = $.methods;
        this.origins = $.origins;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(R2BucketCorsRuleAllowedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private R2BucketCorsRuleAllowedArgs $;

        public Builder() {
            $ = new R2BucketCorsRuleAllowedArgs();
        }

        public Builder(R2BucketCorsRuleAllowedArgs defaults) {
            $ = new R2BucketCorsRuleAllowedArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headers Specifies the value for the Access-Control-Allow-Headers header R2 sets when requesting objects in this bucket from a browser. Cross-origin requests that include custom headers (e.g. x-user-id) should specify these headers as AllowedHeaders.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<List<String>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers Specifies the value for the Access-Control-Allow-Headers header R2 sets when requesting objects in this bucket from a browser. Cross-origin requests that include custom headers (e.g. x-user-id) should specify these headers as AllowedHeaders.
         * 
         * @return builder
         * 
         */
        public Builder headers(List<String> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param headers Specifies the value for the Access-Control-Allow-Headers header R2 sets when requesting objects in this bucket from a browser. Cross-origin requests that include custom headers (e.g. x-user-id) should specify these headers as AllowedHeaders.
         * 
         * @return builder
         * 
         */
        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }

        /**
         * @param methods Specifies the value for the Access-Control-Allow-Methods header R2 sets when requesting objects in a bucket from a browser.
         * 
         * @return builder
         * 
         */
        public Builder methods(Output<List<String>> methods) {
            $.methods = methods;
            return this;
        }

        /**
         * @param methods Specifies the value for the Access-Control-Allow-Methods header R2 sets when requesting objects in a bucket from a browser.
         * 
         * @return builder
         * 
         */
        public Builder methods(List<String> methods) {
            return methods(Output.of(methods));
        }

        /**
         * @param methods Specifies the value for the Access-Control-Allow-Methods header R2 sets when requesting objects in a bucket from a browser.
         * 
         * @return builder
         * 
         */
        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }

        /**
         * @param origins Specifies the value for the Access-Control-Allow-Origin header R2 sets when requesting objects in a bucket from a browser.
         * 
         * @return builder
         * 
         */
        public Builder origins(Output<List<String>> origins) {
            $.origins = origins;
            return this;
        }

        /**
         * @param origins Specifies the value for the Access-Control-Allow-Origin header R2 sets when requesting objects in a bucket from a browser.
         * 
         * @return builder
         * 
         */
        public Builder origins(List<String> origins) {
            return origins(Output.of(origins));
        }

        /**
         * @param origins Specifies the value for the Access-Control-Allow-Origin header R2 sets when requesting objects in a bucket from a browser.
         * 
         * @return builder
         * 
         */
        public Builder origins(String... origins) {
            return origins(List.of(origins));
        }

        public R2BucketCorsRuleAllowedArgs build() {
            if ($.methods == null) {
                throw new MissingRequiredPropertyException("R2BucketCorsRuleAllowedArgs", "methods");
            }
            if ($.origins == null) {
                throw new MissingRequiredPropertyException("R2BucketCorsRuleAllowedArgs", "origins");
            }
            return $;
        }
    }

}
