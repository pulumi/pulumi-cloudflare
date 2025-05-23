// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.PageRuleActionsCacheKeyFieldsCookie;
import com.pulumi.cloudflare.outputs.PageRuleActionsCacheKeyFieldsHeader;
import com.pulumi.cloudflare.outputs.PageRuleActionsCacheKeyFieldsHost;
import com.pulumi.cloudflare.outputs.PageRuleActionsCacheKeyFieldsQueryString;
import com.pulumi.cloudflare.outputs.PageRuleActionsCacheKeyFieldsUser;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PageRuleActionsCacheKeyFields {
    private @Nullable PageRuleActionsCacheKeyFieldsCookie cookie;
    private @Nullable PageRuleActionsCacheKeyFieldsHeader header;
    private @Nullable PageRuleActionsCacheKeyFieldsHost host;
    private @Nullable PageRuleActionsCacheKeyFieldsQueryString queryString;
    private @Nullable PageRuleActionsCacheKeyFieldsUser user;

    private PageRuleActionsCacheKeyFields() {}
    public Optional<PageRuleActionsCacheKeyFieldsCookie> cookie() {
        return Optional.ofNullable(this.cookie);
    }
    public Optional<PageRuleActionsCacheKeyFieldsHeader> header() {
        return Optional.ofNullable(this.header);
    }
    public Optional<PageRuleActionsCacheKeyFieldsHost> host() {
        return Optional.ofNullable(this.host);
    }
    public Optional<PageRuleActionsCacheKeyFieldsQueryString> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    public Optional<PageRuleActionsCacheKeyFieldsUser> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PageRuleActionsCacheKeyFields defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PageRuleActionsCacheKeyFieldsCookie cookie;
        private @Nullable PageRuleActionsCacheKeyFieldsHeader header;
        private @Nullable PageRuleActionsCacheKeyFieldsHost host;
        private @Nullable PageRuleActionsCacheKeyFieldsQueryString queryString;
        private @Nullable PageRuleActionsCacheKeyFieldsUser user;
        public Builder() {}
        public Builder(PageRuleActionsCacheKeyFields defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookie = defaults.cookie;
    	      this.header = defaults.header;
    	      this.host = defaults.host;
    	      this.queryString = defaults.queryString;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder cookie(@Nullable PageRuleActionsCacheKeyFieldsCookie cookie) {

            this.cookie = cookie;
            return this;
        }
        @CustomType.Setter
        public Builder header(@Nullable PageRuleActionsCacheKeyFieldsHeader header) {

            this.header = header;
            return this;
        }
        @CustomType.Setter
        public Builder host(@Nullable PageRuleActionsCacheKeyFieldsHost host) {

            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder queryString(@Nullable PageRuleActionsCacheKeyFieldsQueryString queryString) {

            this.queryString = queryString;
            return this;
        }
        @CustomType.Setter
        public Builder user(@Nullable PageRuleActionsCacheKeyFieldsUser user) {

            this.user = user;
            return this;
        }
        public PageRuleActionsCacheKeyFields build() {
            final var _resultValue = new PageRuleActionsCacheKeyFields();
            _resultValue.cookie = cookie;
            _resultValue.header = header;
            _resultValue.host = host;
            _resultValue.queryString = queryString;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
