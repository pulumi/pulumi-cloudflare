// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ApiShieldMessageSourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiShieldMessageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiShieldMessageArgs Empty = new ApiShieldMessageArgs();

    @Import(name="code")
    private @Nullable Output<Integer> code;

    public Optional<Output<Integer>> code() {
        return Optional.ofNullable(this.code);
    }

    @Import(name="documentationUrl")
    private @Nullable Output<String> documentationUrl;

    public Optional<Output<String>> documentationUrl() {
        return Optional.ofNullable(this.documentationUrl);
    }

    @Import(name="message")
    private @Nullable Output<String> message;

    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    @Import(name="source")
    private @Nullable Output<ApiShieldMessageSourceArgs> source;

    public Optional<Output<ApiShieldMessageSourceArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    private ApiShieldMessageArgs() {}

    private ApiShieldMessageArgs(ApiShieldMessageArgs $) {
        this.code = $.code;
        this.documentationUrl = $.documentationUrl;
        this.message = $.message;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiShieldMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiShieldMessageArgs $;

        public Builder() {
            $ = new ApiShieldMessageArgs();
        }

        public Builder(ApiShieldMessageArgs defaults) {
            $ = new ApiShieldMessageArgs(Objects.requireNonNull(defaults));
        }

        public Builder code(@Nullable Output<Integer> code) {
            $.code = code;
            return this;
        }

        public Builder code(Integer code) {
            return code(Output.of(code));
        }

        public Builder documentationUrl(@Nullable Output<String> documentationUrl) {
            $.documentationUrl = documentationUrl;
            return this;
        }

        public Builder documentationUrl(String documentationUrl) {
            return documentationUrl(Output.of(documentationUrl));
        }

        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        public Builder message(String message) {
            return message(Output.of(message));
        }

        public Builder source(@Nullable Output<ApiShieldMessageSourceArgs> source) {
            $.source = source;
            return this;
        }

        public Builder source(ApiShieldMessageSourceArgs source) {
            return source(Output.of(source));
        }

        public ApiShieldMessageArgs build() {
            return $;
        }
    }

}
