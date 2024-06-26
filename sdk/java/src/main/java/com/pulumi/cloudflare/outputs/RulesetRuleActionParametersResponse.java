// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleActionParametersResponse {
    /**
     * @return Body content to include in the response.
     * 
     */
    private @Nullable String content;
    /**
     * @return HTTP content type to send in the response.
     * 
     */
    private @Nullable String contentType;
    /**
     * @return HTTP status code to send in the response.
     * 
     */
    private @Nullable Integer statusCode;

    private RulesetRuleActionParametersResponse() {}
    /**
     * @return Body content to include in the response.
     * 
     */
    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }
    /**
     * @return HTTP content type to send in the response.
     * 
     */
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }
    /**
     * @return HTTP status code to send in the response.
     * 
     */
    public Optional<Integer> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParametersResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String content;
        private @Nullable String contentType;
        private @Nullable Integer statusCode;
        public Builder() {}
        public Builder(RulesetRuleActionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentType = defaults.contentType;
    	      this.statusCode = defaults.statusCode;
        }

        @CustomType.Setter
        public Builder content(@Nullable String content) {

            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder contentType(@Nullable String contentType) {

            this.contentType = contentType;
            return this;
        }
        @CustomType.Setter
        public Builder statusCode(@Nullable Integer statusCode) {

            this.statusCode = statusCode;
            return this;
        }
        public RulesetRuleActionParametersResponse build() {
            final var _resultValue = new RulesetRuleActionParametersResponse();
            _resultValue.content = content;
            _resultValue.contentType = contentType;
            _resultValue.statusCode = statusCode;
            return _resultValue;
        }
    }
}
