// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TeamsAccountSettingsAppControlSettings {
    /**
     * @return Enable App Control
     * 
     */
    private @Nullable Boolean enabled;

    private TeamsAccountSettingsAppControlSettings() {}
    /**
     * @return Enable App Control
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeamsAccountSettingsAppControlSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(TeamsAccountSettingsAppControlSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        public TeamsAccountSettingsAppControlSettings build() {
            final var _resultValue = new TeamsAccountSettingsAppControlSettings();
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
