// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetAccountsResult;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountsInvokeResult {
    /**
     * @return Direction to order results.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    private @Nullable String direction;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Max items to fetch, default: 1000
     * 
     */
    private @Nullable Integer maxItems;
    /**
     * @return Name of the account.
     * 
     */
    private @Nullable String name;
    /**
     * @return The items returned by the data source
     * 
     */
    private List<GetAccountsResult> results;

    private GetAccountsInvokeResult() {}
    /**
     * @return Direction to order results.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Max items to fetch, default: 1000
     * 
     */
    public Optional<Integer> maxItems() {
        return Optional.ofNullable(this.maxItems);
    }
    /**
     * @return Name of the account.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The items returned by the data source
     * 
     */
    public List<GetAccountsResult> results() {
        return this.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountsInvokeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String direction;
        private String id;
        private @Nullable Integer maxItems;
        private @Nullable String name;
        private List<GetAccountsResult> results;
        public Builder() {}
        public Builder(GetAccountsInvokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.id = defaults.id;
    	      this.maxItems = defaults.maxItems;
    	      this.name = defaults.name;
    	      this.results = defaults.results;
        }

        @CustomType.Setter
        public Builder direction(@Nullable String direction) {

            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAccountsInvokeResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder maxItems(@Nullable Integer maxItems) {

            this.maxItems = maxItems;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder results(List<GetAccountsResult> results) {
            if (results == null) {
              throw new MissingRequiredPropertyException("GetAccountsInvokeResult", "results");
            }
            this.results = results;
            return this;
        }
        public Builder results(GetAccountsResult... results) {
            return results(List.of(results));
        }
        public GetAccountsInvokeResult build() {
            final var _resultValue = new GetAccountsInvokeResult();
            _resultValue.direction = direction;
            _resultValue.id = id;
            _resultValue.maxItems = maxItems;
            _resultValue.name = name;
            _resultValue.results = results;
            return _resultValue;
        }
    }
}
