// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRulesetsRulesetRuleActionParametersMatchedData {
    /**
     * @return Public key to use within WAF Ruleset payload logging to view the HTTP request parameters. You can generate a public key [using the `matched-data-cli` command-line tool](https://developers.cloudflare.com/waf/managed-rulesets/payload-logging/command-line/generate-key-pair) or [in the Cloudflare dashboard](https://developers.cloudflare.com/waf/managed-rulesets/payload-logging/configure)
     * 
     */
    private @Nullable String publicKey;

    private GetRulesetsRulesetRuleActionParametersMatchedData() {}
    /**
     * @return Public key to use within WAF Ruleset payload logging to view the HTTP request parameters. You can generate a public key [using the `matched-data-cli` command-line tool](https://developers.cloudflare.com/waf/managed-rulesets/payload-logging/command-line/generate-key-pair) or [in the Cloudflare dashboard](https://developers.cloudflare.com/waf/managed-rulesets/payload-logging/configure)
     * 
     */
    public Optional<String> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetsRulesetRuleActionParametersMatchedData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String publicKey;
        public Builder() {}
        public Builder(GetRulesetsRulesetRuleActionParametersMatchedData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKey = defaults.publicKey;
        }

        @CustomType.Setter
        public Builder publicKey(@Nullable String publicKey) {

            this.publicKey = publicKey;
            return this;
        }
        public GetRulesetsRulesetRuleActionParametersMatchedData build() {
            final var _resultValue = new GetRulesetsRulesetRuleActionParametersMatchedData();
            _resultValue.publicKey = publicKey;
            return _resultValue;
        }
    }
}
