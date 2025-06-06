// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountMemberFilter {
    /**
     * @return Direction to order results.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    private @Nullable String direction;
    /**
     * @return Field to order results by.
     * Available values: &#34;user.first*name&#34;, &#34;user.last*name&#34;, &#34;user.email&#34;, &#34;status&#34;.
     * 
     */
    private @Nullable String order;
    /**
     * @return A member&#39;s status in the account.
     * Available values: &#34;accepted&#34;, &#34;pending&#34;, &#34;rejected&#34;.
     * 
     */
    private @Nullable String status;

    private GetAccountMemberFilter() {}
    /**
     * @return Direction to order results.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
    }
    /**
     * @return Field to order results by.
     * Available values: &#34;user.first*name&#34;, &#34;user.last*name&#34;, &#34;user.email&#34;, &#34;status&#34;.
     * 
     */
    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }
    /**
     * @return A member&#39;s status in the account.
     * Available values: &#34;accepted&#34;, &#34;pending&#34;, &#34;rejected&#34;.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountMemberFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String direction;
        private @Nullable String order;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetAccountMemberFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.order = defaults.order;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder direction(@Nullable String direction) {

            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder order(@Nullable String order) {

            this.order = order;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public GetAccountMemberFilter build() {
            final var _resultValue = new GetAccountMemberFilter();
            _resultValue.direction = direction;
            _resultValue.order = order;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
