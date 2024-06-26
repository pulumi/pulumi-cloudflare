// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;


public final class ZoneSettingsOverrideInitialSettingNelArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZoneSettingsOverrideInitialSettingNelArgs Empty = new ZoneSettingsOverrideInitialSettingNelArgs();

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private ZoneSettingsOverrideInitialSettingNelArgs() {}

    private ZoneSettingsOverrideInitialSettingNelArgs(ZoneSettingsOverrideInitialSettingNelArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZoneSettingsOverrideInitialSettingNelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZoneSettingsOverrideInitialSettingNelArgs $;

        public Builder() {
            $ = new ZoneSettingsOverrideInitialSettingNelArgs();
        }

        public Builder(ZoneSettingsOverrideInitialSettingNelArgs defaults) {
            $ = new ZoneSettingsOverrideInitialSettingNelArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ZoneSettingsOverrideInitialSettingNelArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("ZoneSettingsOverrideInitialSettingNelArgs", "enabled");
            }
            return $;
        }
    }

}
