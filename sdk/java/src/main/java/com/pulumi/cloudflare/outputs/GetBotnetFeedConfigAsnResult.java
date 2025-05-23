// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBotnetFeedConfigAsnResult {
    /**
     * @return Identifier.
     * 
     */
    private String accountId;
    private Integer asn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetBotnetFeedConfigAsnResult() {}
    /**
     * @return Identifier.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    public Integer asn() {
        return this.asn;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotnetFeedConfigAsnResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private Integer asn;
        private String id;
        public Builder() {}
        public Builder(GetBotnetFeedConfigAsnResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.asn = defaults.asn;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetBotnetFeedConfigAsnResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder asn(Integer asn) {
            if (asn == null) {
              throw new MissingRequiredPropertyException("GetBotnetFeedConfigAsnResult", "asn");
            }
            this.asn = asn;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBotnetFeedConfigAsnResult", "id");
            }
            this.id = id;
            return this;
        }
        public GetBotnetFeedConfigAsnResult build() {
            final var _resultValue = new GetBotnetFeedConfigAsnResult();
            _resultValue.accountId = accountId;
            _resultValue.asn = asn;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
