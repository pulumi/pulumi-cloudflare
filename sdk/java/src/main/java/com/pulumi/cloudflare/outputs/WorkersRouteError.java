// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.WorkersRouteErrorSource;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkersRouteError {
    private @Nullable Integer code;
    private @Nullable String documentationUrl;
    private @Nullable String message;
    private @Nullable WorkersRouteErrorSource source;

    private WorkersRouteError() {}
    public Optional<Integer> code() {
        return Optional.ofNullable(this.code);
    }
    public Optional<String> documentationUrl() {
        return Optional.ofNullable(this.documentationUrl);
    }
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    public Optional<WorkersRouteErrorSource> source() {
        return Optional.ofNullable(this.source);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkersRouteError defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer code;
        private @Nullable String documentationUrl;
        private @Nullable String message;
        private @Nullable WorkersRouteErrorSource source;
        public Builder() {}
        public Builder(WorkersRouteError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.documentationUrl = defaults.documentationUrl;
    	      this.message = defaults.message;
    	      this.source = defaults.source;
        }

        @CustomType.Setter
        public Builder code(@Nullable Integer code) {

            this.code = code;
            return this;
        }
        @CustomType.Setter
        public Builder documentationUrl(@Nullable String documentationUrl) {

            this.documentationUrl = documentationUrl;
            return this;
        }
        @CustomType.Setter
        public Builder message(@Nullable String message) {

            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable WorkersRouteErrorSource source) {

            this.source = source;
            return this;
        }
        public WorkersRouteError build() {
            final var _resultValue = new WorkersRouteError();
            _resultValue.code = code;
            _resultValue.documentationUrl = documentationUrl;
            _resultValue.message = message;
            _resultValue.source = source;
            return _resultValue;
        }
    }
}
