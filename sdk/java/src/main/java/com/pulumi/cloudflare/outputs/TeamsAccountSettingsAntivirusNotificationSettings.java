// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TeamsAccountSettingsAntivirusNotificationSettings {
    /**
     * @return Set notification on
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return If true, context information will be passed as query parameters
     * 
     */
    private @Nullable Boolean includeContext;
    /**
     * @return Customize the message shown in the notification.
     * 
     */
    private @Nullable String msg;
    /**
     * @return Optional URL to direct users to additional information. If not set, the notification will open a block page.
     * 
     */
    private @Nullable String supportUrl;

    private TeamsAccountSettingsAntivirusNotificationSettings() {}
    /**
     * @return Set notification on
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return If true, context information will be passed as query parameters
     * 
     */
    public Optional<Boolean> includeContext() {
        return Optional.ofNullable(this.includeContext);
    }
    /**
     * @return Customize the message shown in the notification.
     * 
     */
    public Optional<String> msg() {
        return Optional.ofNullable(this.msg);
    }
    /**
     * @return Optional URL to direct users to additional information. If not set, the notification will open a block page.
     * 
     */
    public Optional<String> supportUrl() {
        return Optional.ofNullable(this.supportUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeamsAccountSettingsAntivirusNotificationSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Boolean includeContext;
        private @Nullable String msg;
        private @Nullable String supportUrl;
        public Builder() {}
        public Builder(TeamsAccountSettingsAntivirusNotificationSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.includeContext = defaults.includeContext;
    	      this.msg = defaults.msg;
    	      this.supportUrl = defaults.supportUrl;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder includeContext(@Nullable Boolean includeContext) {

            this.includeContext = includeContext;
            return this;
        }
        @CustomType.Setter
        public Builder msg(@Nullable String msg) {

            this.msg = msg;
            return this;
        }
        @CustomType.Setter
        public Builder supportUrl(@Nullable String supportUrl) {

            this.supportUrl = supportUrl;
            return this;
        }
        public TeamsAccountSettingsAntivirusNotificationSettings build() {
            final var _resultValue = new TeamsAccountSettingsAntivirusNotificationSettings();
            _resultValue.enabled = enabled;
            _resultValue.includeContext = includeContext;
            _resultValue.msg = msg;
            _resultValue.supportUrl = supportUrl;
            return _resultValue;
        }
    }
}
