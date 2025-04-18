// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetAccountMemberFilter;
import com.pulumi.cloudflare.outputs.GetAccountMemberPolicy;
import com.pulumi.cloudflare.outputs.GetAccountMemberRole;
import com.pulumi.cloudflare.outputs.GetAccountMemberUser;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountMemberResult {
    /**
     * @return Account identifier tag.
     * 
     */
    private String accountId;
    private @Nullable GetAccountMemberFilter filter;
    /**
     * @return Membership identifier tag.
     * 
     */
    private String id;
    /**
     * @return Membership identifier tag.
     * 
     */
    private @Nullable String memberId;
    /**
     * @return Access policy for the membership
     * 
     */
    private List<GetAccountMemberPolicy> policies;
    /**
     * @return Roles assigned to this Member.
     * 
     */
    private List<GetAccountMemberRole> roles;
    /**
     * @return A member&#39;s status in the account.
     * Available values: &#34;accepted&#34;, &#34;pending&#34;.
     * 
     */
    private String status;
    /**
     * @return Details of the user associated to the membership.
     * 
     */
    private GetAccountMemberUser user;

    private GetAccountMemberResult() {}
    /**
     * @return Account identifier tag.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    public Optional<GetAccountMemberFilter> filter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * @return Membership identifier tag.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Membership identifier tag.
     * 
     */
    public Optional<String> memberId() {
        return Optional.ofNullable(this.memberId);
    }
    /**
     * @return Access policy for the membership
     * 
     */
    public List<GetAccountMemberPolicy> policies() {
        return this.policies;
    }
    /**
     * @return Roles assigned to this Member.
     * 
     */
    public List<GetAccountMemberRole> roles() {
        return this.roles;
    }
    /**
     * @return A member&#39;s status in the account.
     * Available values: &#34;accepted&#34;, &#34;pending&#34;.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Details of the user associated to the membership.
     * 
     */
    public GetAccountMemberUser user() {
        return this.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountMemberResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private @Nullable GetAccountMemberFilter filter;
        private String id;
        private @Nullable String memberId;
        private List<GetAccountMemberPolicy> policies;
        private List<GetAccountMemberRole> roles;
        private String status;
        private GetAccountMemberUser user;
        public Builder() {}
        public Builder(GetAccountMemberResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.memberId = defaults.memberId;
    	      this.policies = defaults.policies;
    	      this.roles = defaults.roles;
    	      this.status = defaults.status;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetAccountMemberResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder filter(@Nullable GetAccountMemberFilter filter) {

            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAccountMemberResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder memberId(@Nullable String memberId) {

            this.memberId = memberId;
            return this;
        }
        @CustomType.Setter
        public Builder policies(List<GetAccountMemberPolicy> policies) {
            if (policies == null) {
              throw new MissingRequiredPropertyException("GetAccountMemberResult", "policies");
            }
            this.policies = policies;
            return this;
        }
        public Builder policies(GetAccountMemberPolicy... policies) {
            return policies(List.of(policies));
        }
        @CustomType.Setter
        public Builder roles(List<GetAccountMemberRole> roles) {
            if (roles == null) {
              throw new MissingRequiredPropertyException("GetAccountMemberResult", "roles");
            }
            this.roles = roles;
            return this;
        }
        public Builder roles(GetAccountMemberRole... roles) {
            return roles(List.of(roles));
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetAccountMemberResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder user(GetAccountMemberUser user) {
            if (user == null) {
              throw new MissingRequiredPropertyException("GetAccountMemberResult", "user");
            }
            this.user = user;
            return this;
        }
        public GetAccountMemberResult build() {
            final var _resultValue = new GetAccountMemberResult();
            _resultValue.accountId = accountId;
            _resultValue.filter = filter;
            _resultValue.id = id;
            _resultValue.memberId = memberId;
            _resultValue.policies = policies;
            _resultValue.roles = roles;
            _resultValue.status = status;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
