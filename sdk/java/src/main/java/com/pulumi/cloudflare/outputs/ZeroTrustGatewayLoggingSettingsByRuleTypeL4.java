// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZeroTrustGatewayLoggingSettingsByRuleTypeL4 {
    /**
     * @return Log all requests to this service.
     * 
     */
    private @Nullable Boolean logAll;
    /**
     * @return Log only blocking requests to this service.
     * 
     */
    private @Nullable Boolean logBlocks;

    private ZeroTrustGatewayLoggingSettingsByRuleTypeL4() {}
    /**
     * @return Log all requests to this service.
     * 
     */
    public Optional<Boolean> logAll() {
        return Optional.ofNullable(this.logAll);
    }
    /**
     * @return Log only blocking requests to this service.
     * 
     */
    public Optional<Boolean> logBlocks() {
        return Optional.ofNullable(this.logBlocks);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustGatewayLoggingSettingsByRuleTypeL4 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean logAll;
        private @Nullable Boolean logBlocks;
        public Builder() {}
        public Builder(ZeroTrustGatewayLoggingSettingsByRuleTypeL4 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logAll = defaults.logAll;
    	      this.logBlocks = defaults.logBlocks;
        }

        @CustomType.Setter
        public Builder logAll(@Nullable Boolean logAll) {

            this.logAll = logAll;
            return this;
        }
        @CustomType.Setter
        public Builder logBlocks(@Nullable Boolean logBlocks) {

            this.logBlocks = logBlocks;
            return this;
        }
        public ZeroTrustGatewayLoggingSettingsByRuleTypeL4 build() {
            final var _resultValue = new ZeroTrustGatewayLoggingSettingsByRuleTypeL4();
            _resultValue.logAll = logAll;
            _resultValue.logBlocks = logBlocks;
            return _resultValue;
        }
    }
}
