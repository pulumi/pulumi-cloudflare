// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.RulesetRuleActionParametersEdgeTtlStatusCodeTtl;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleActionParametersEdgeTtl {
    /**
     * @return The TTL (in seconds) if you choose override_origin mode.
     * 
     */
    private @Nullable Integer default_;
    /**
     * @return Edge TTL options.
     * Available values: &#34;respect*origin&#34;, &#34;bypass*by*default&#34;, &#34;override*origin&#34;.
     * 
     */
    private String mode;
    /**
     * @return List of single status codes, or status code ranges to apply the selected mode.
     * 
     */
    private @Nullable List<RulesetRuleActionParametersEdgeTtlStatusCodeTtl> statusCodeTtls;

    private RulesetRuleActionParametersEdgeTtl() {}
    /**
     * @return The TTL (in seconds) if you choose override_origin mode.
     * 
     */
    public Optional<Integer> default_() {
        return Optional.ofNullable(this.default_);
    }
    /**
     * @return Edge TTL options.
     * Available values: &#34;respect*origin&#34;, &#34;bypass*by*default&#34;, &#34;override*origin&#34;.
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return List of single status codes, or status code ranges to apply the selected mode.
     * 
     */
    public List<RulesetRuleActionParametersEdgeTtlStatusCodeTtl> statusCodeTtls() {
        return this.statusCodeTtls == null ? List.of() : this.statusCodeTtls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParametersEdgeTtl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer default_;
        private String mode;
        private @Nullable List<RulesetRuleActionParametersEdgeTtlStatusCodeTtl> statusCodeTtls;
        public Builder() {}
        public Builder(RulesetRuleActionParametersEdgeTtl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.mode = defaults.mode;
    	      this.statusCodeTtls = defaults.statusCodeTtls;
        }

        @CustomType.Setter("default")
        public Builder default_(@Nullable Integer default_) {

            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("RulesetRuleActionParametersEdgeTtl", "mode");
            }
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder statusCodeTtls(@Nullable List<RulesetRuleActionParametersEdgeTtlStatusCodeTtl> statusCodeTtls) {

            this.statusCodeTtls = statusCodeTtls;
            return this;
        }
        public Builder statusCodeTtls(RulesetRuleActionParametersEdgeTtlStatusCodeTtl... statusCodeTtls) {
            return statusCodeTtls(List.of(statusCodeTtls));
        }
        public RulesetRuleActionParametersEdgeTtl build() {
            final var _resultValue = new RulesetRuleActionParametersEdgeTtl();
            _resultValue.default_ = default_;
            _resultValue.mode = mode;
            _resultValue.statusCodeTtls = statusCodeTtls;
            return _resultValue;
        }
    }
}
