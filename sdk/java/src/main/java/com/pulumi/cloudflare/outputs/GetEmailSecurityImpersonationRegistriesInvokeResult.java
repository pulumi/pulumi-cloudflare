// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetEmailSecurityImpersonationRegistriesResult;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEmailSecurityImpersonationRegistriesInvokeResult {
    /**
     * @return Account Identifier
     * 
     */
    private String accountId;
    /**
     * @return The sorting direction.
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
     * @return The field to sort by.
     * Available values: &#34;name&#34;, &#34;email&#34;, &#34;created_at&#34;.
     * 
     */
    private @Nullable String order;
    /**
     * @return Available values: &#34;A1S*INTERNAL&#34;, &#34;SNOOPY-CASB*OFFICE*365&#34;, &#34;SNOOPY-OFFICE*365&#34;, &#34;SNOOPY-GOOGLE_DIRECTORY&#34;.
     * 
     */
    private @Nullable String provenance;
    /**
     * @return The items returned by the data source
     * 
     */
    private List<GetEmailSecurityImpersonationRegistriesResult> results;
    /**
     * @return Allows searching in multiple properties of a record simultaneously.
     * This parameter is intended for human users, not automation. Its exact
     * behavior is intentionally left unspecified and is subject to change
     * in the future.
     * 
     */
    private @Nullable String search;

    private GetEmailSecurityImpersonationRegistriesInvokeResult() {}
    /**
     * @return Account Identifier
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return The sorting direction.
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
     * @return The field to sort by.
     * Available values: &#34;name&#34;, &#34;email&#34;, &#34;created_at&#34;.
     * 
     */
    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }
    /**
     * @return Available values: &#34;A1S*INTERNAL&#34;, &#34;SNOOPY-CASB*OFFICE*365&#34;, &#34;SNOOPY-OFFICE*365&#34;, &#34;SNOOPY-GOOGLE_DIRECTORY&#34;.
     * 
     */
    public Optional<String> provenance() {
        return Optional.ofNullable(this.provenance);
    }
    /**
     * @return The items returned by the data source
     * 
     */
    public List<GetEmailSecurityImpersonationRegistriesResult> results() {
        return this.results;
    }
    /**
     * @return Allows searching in multiple properties of a record simultaneously.
     * This parameter is intended for human users, not automation. Its exact
     * behavior is intentionally left unspecified and is subject to change
     * in the future.
     * 
     */
    public Optional<String> search() {
        return Optional.ofNullable(this.search);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEmailSecurityImpersonationRegistriesInvokeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private @Nullable String direction;
        private String id;
        private @Nullable Integer maxItems;
        private @Nullable String order;
        private @Nullable String provenance;
        private List<GetEmailSecurityImpersonationRegistriesResult> results;
        private @Nullable String search;
        public Builder() {}
        public Builder(GetEmailSecurityImpersonationRegistriesInvokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.direction = defaults.direction;
    	      this.id = defaults.id;
    	      this.maxItems = defaults.maxItems;
    	      this.order = defaults.order;
    	      this.provenance = defaults.provenance;
    	      this.results = defaults.results;
    	      this.search = defaults.search;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetEmailSecurityImpersonationRegistriesInvokeResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder direction(@Nullable String direction) {

            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetEmailSecurityImpersonationRegistriesInvokeResult", "id");
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
        public Builder order(@Nullable String order) {

            this.order = order;
            return this;
        }
        @CustomType.Setter
        public Builder provenance(@Nullable String provenance) {

            this.provenance = provenance;
            return this;
        }
        @CustomType.Setter
        public Builder results(List<GetEmailSecurityImpersonationRegistriesResult> results) {
            if (results == null) {
              throw new MissingRequiredPropertyException("GetEmailSecurityImpersonationRegistriesInvokeResult", "results");
            }
            this.results = results;
            return this;
        }
        public Builder results(GetEmailSecurityImpersonationRegistriesResult... results) {
            return results(List.of(results));
        }
        @CustomType.Setter
        public Builder search(@Nullable String search) {

            this.search = search;
            return this;
        }
        public GetEmailSecurityImpersonationRegistriesInvokeResult build() {
            final var _resultValue = new GetEmailSecurityImpersonationRegistriesInvokeResult();
            _resultValue.accountId = accountId;
            _resultValue.direction = direction;
            _resultValue.id = id;
            _resultValue.maxItems = maxItems;
            _resultValue.order = order;
            _resultValue.provenance = provenance;
            _resultValue.results = results;
            _resultValue.search = search;
            return _resultValue;
        }
    }
}
