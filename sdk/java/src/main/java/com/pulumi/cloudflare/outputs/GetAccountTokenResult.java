// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetAccountTokenCondition;
import com.pulumi.cloudflare.outputs.GetAccountTokenFilter;
import com.pulumi.cloudflare.outputs.GetAccountTokenPolicy;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountTokenResult {
    /**
     * @return Account identifier tag.
     * 
     */
    private String accountId;
    private GetAccountTokenCondition condition;
    /**
     * @return The expiration time on or after which the JWT MUST NOT be accepted for processing.
     * 
     */
    private String expiresOn;
    private @Nullable GetAccountTokenFilter filter;
    /**
     * @return Token identifier tag.
     * 
     */
    private String id;
    /**
     * @return The time on which the token was created.
     * 
     */
    private String issuedOn;
    /**
     * @return Last time the token was used.
     * 
     */
    private String lastUsedOn;
    /**
     * @return Last time the token was modified.
     * 
     */
    private String modifiedOn;
    /**
     * @return Token name.
     * 
     */
    private String name;
    /**
     * @return The time before which the token MUST NOT be accepted for processing.
     * 
     */
    private String notBefore;
    /**
     * @return List of access policies assigned to the token.
     * 
     */
    private List<GetAccountTokenPolicy> policies;
    /**
     * @return Status of the token.
     * Available values: &#34;active&#34;, &#34;disabled&#34;, &#34;expired&#34;.
     * 
     */
    private String status;
    /**
     * @return Token identifier tag.
     * 
     */
    private @Nullable String tokenId;

    private GetAccountTokenResult() {}
    /**
     * @return Account identifier tag.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    public GetAccountTokenCondition condition() {
        return this.condition;
    }
    /**
     * @return The expiration time on or after which the JWT MUST NOT be accepted for processing.
     * 
     */
    public String expiresOn() {
        return this.expiresOn;
    }
    public Optional<GetAccountTokenFilter> filter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * @return Token identifier tag.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The time on which the token was created.
     * 
     */
    public String issuedOn() {
        return this.issuedOn;
    }
    /**
     * @return Last time the token was used.
     * 
     */
    public String lastUsedOn() {
        return this.lastUsedOn;
    }
    /**
     * @return Last time the token was modified.
     * 
     */
    public String modifiedOn() {
        return this.modifiedOn;
    }
    /**
     * @return Token name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The time before which the token MUST NOT be accepted for processing.
     * 
     */
    public String notBefore() {
        return this.notBefore;
    }
    /**
     * @return List of access policies assigned to the token.
     * 
     */
    public List<GetAccountTokenPolicy> policies() {
        return this.policies;
    }
    /**
     * @return Status of the token.
     * Available values: &#34;active&#34;, &#34;disabled&#34;, &#34;expired&#34;.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Token identifier tag.
     * 
     */
    public Optional<String> tokenId() {
        return Optional.ofNullable(this.tokenId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountTokenResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private GetAccountTokenCondition condition;
        private String expiresOn;
        private @Nullable GetAccountTokenFilter filter;
        private String id;
        private String issuedOn;
        private String lastUsedOn;
        private String modifiedOn;
        private String name;
        private String notBefore;
        private List<GetAccountTokenPolicy> policies;
        private String status;
        private @Nullable String tokenId;
        public Builder() {}
        public Builder(GetAccountTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.condition = defaults.condition;
    	      this.expiresOn = defaults.expiresOn;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.issuedOn = defaults.issuedOn;
    	      this.lastUsedOn = defaults.lastUsedOn;
    	      this.modifiedOn = defaults.modifiedOn;
    	      this.name = defaults.name;
    	      this.notBefore = defaults.notBefore;
    	      this.policies = defaults.policies;
    	      this.status = defaults.status;
    	      this.tokenId = defaults.tokenId;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetAccountTokenResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder condition(GetAccountTokenCondition condition) {
            if (condition == null) {
              throw new MissingRequiredPropertyException("GetAccountTokenResult", "condition");
            }
            this.condition = condition;
            return this;
        }
        @CustomType.Setter
        public Builder expiresOn(String expiresOn) {
            if (expiresOn == null) {
              throw new MissingRequiredPropertyException("GetAccountTokenResult", "expiresOn");
            }
            this.expiresOn = expiresOn;
            return this;
        }
        @CustomType.Setter
        public Builder filter(@Nullable GetAccountTokenFilter filter) {

            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAccountTokenResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder issuedOn(String issuedOn) {
            if (issuedOn == null) {
              throw new MissingRequiredPropertyException("GetAccountTokenResult", "issuedOn");
            }
            this.issuedOn = issuedOn;
            return this;
        }
        @CustomType.Setter
        public Builder lastUsedOn(String lastUsedOn) {
            if (lastUsedOn == null) {
              throw new MissingRequiredPropertyException("GetAccountTokenResult", "lastUsedOn");
            }
            this.lastUsedOn = lastUsedOn;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedOn(String modifiedOn) {
            if (modifiedOn == null) {
              throw new MissingRequiredPropertyException("GetAccountTokenResult", "modifiedOn");
            }
            this.modifiedOn = modifiedOn;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAccountTokenResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder notBefore(String notBefore) {
            if (notBefore == null) {
              throw new MissingRequiredPropertyException("GetAccountTokenResult", "notBefore");
            }
            this.notBefore = notBefore;
            return this;
        }
        @CustomType.Setter
        public Builder policies(List<GetAccountTokenPolicy> policies) {
            if (policies == null) {
              throw new MissingRequiredPropertyException("GetAccountTokenResult", "policies");
            }
            this.policies = policies;
            return this;
        }
        public Builder policies(GetAccountTokenPolicy... policies) {
            return policies(List.of(policies));
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetAccountTokenResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tokenId(@Nullable String tokenId) {

            this.tokenId = tokenId;
            return this;
        }
        public GetAccountTokenResult build() {
            final var _resultValue = new GetAccountTokenResult();
            _resultValue.accountId = accountId;
            _resultValue.condition = condition;
            _resultValue.expiresOn = expiresOn;
            _resultValue.filter = filter;
            _resultValue.id = id;
            _resultValue.issuedOn = issuedOn;
            _resultValue.lastUsedOn = lastUsedOn;
            _resultValue.modifiedOn = modifiedOn;
            _resultValue.name = name;
            _resultValue.notBefore = notBefore;
            _resultValue.policies = policies;
            _resultValue.status = status;
            _resultValue.tokenId = tokenId;
            return _resultValue;
        }
    }
}
