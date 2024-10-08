// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.CloudConnectorRulesRuleParameters;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudConnectorRulesRule {
    /**
     * @return Brief summary of the cloud connector rule and its intended use.
     * 
     */
    private @Nullable String description;
    /**
     * @return Whether the headers rule is active.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Criteria for an HTTP request to trigger the cloud connector rule. Uses the Firewall Rules expression language based on Wireshark display filters.
     * 
     */
    private String expression;
    /**
     * @return Cloud Connector Rule Parameters
     * 
     */
    private @Nullable CloudConnectorRulesRuleParameters parameters;
    /**
     * @return Type of provider. Available values: `aws_s3`, `cloudflare_r2`, `azure_storage`, `gcp_storage`
     * 
     */
    private String provider;

    private CloudConnectorRulesRule() {}
    /**
     * @return Brief summary of the cloud connector rule and its intended use.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Whether the headers rule is active.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Criteria for an HTTP request to trigger the cloud connector rule. Uses the Firewall Rules expression language based on Wireshark display filters.
     * 
     */
    public String expression() {
        return this.expression;
    }
    /**
     * @return Cloud Connector Rule Parameters
     * 
     */
    public Optional<CloudConnectorRulesRuleParameters> parameters() {
        return Optional.ofNullable(this.parameters);
    }
    /**
     * @return Type of provider. Available values: `aws_s3`, `cloudflare_r2`, `azure_storage`, `gcp_storage`
     * 
     */
    public String provider() {
        return this.provider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudConnectorRulesRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable Boolean enabled;
        private String expression;
        private @Nullable CloudConnectorRulesRuleParameters parameters;
        private String provider;
        public Builder() {}
        public Builder(CloudConnectorRulesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.expression = defaults.expression;
    	      this.parameters = defaults.parameters;
    	      this.provider = defaults.provider;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder expression(String expression) {
            if (expression == null) {
              throw new MissingRequiredPropertyException("CloudConnectorRulesRule", "expression");
            }
            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable CloudConnectorRulesRuleParameters parameters) {

            this.parameters = parameters;
            return this;
        }
        @CustomType.Setter
        public Builder provider(String provider) {
            if (provider == null) {
              throw new MissingRequiredPropertyException("CloudConnectorRulesRule", "provider");
            }
            this.provider = provider;
            return this;
        }
        public CloudConnectorRulesRule build() {
            final var _resultValue = new CloudConnectorRulesRule();
            _resultValue.description = description;
            _resultValue.enabled = enabled;
            _resultValue.expression = expression;
            _resultValue.parameters = parameters;
            _resultValue.provider = provider;
            return _resultValue;
        }
    }
}
