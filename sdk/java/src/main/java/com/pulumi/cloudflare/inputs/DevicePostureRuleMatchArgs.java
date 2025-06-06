// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DevicePostureRuleMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final DevicePostureRuleMatchArgs Empty = new DevicePostureRuleMatchArgs();

    /**
     * Available values: &#34;windows&#34;, &#34;mac&#34;, &#34;linux&#34;, &#34;android&#34;, &#34;ios&#34;, &#34;chromeos&#34;.
     * 
     */
    @Import(name="platform")
    private @Nullable Output<String> platform;

    /**
     * @return Available values: &#34;windows&#34;, &#34;mac&#34;, &#34;linux&#34;, &#34;android&#34;, &#34;ios&#34;, &#34;chromeos&#34;.
     * 
     */
    public Optional<Output<String>> platform() {
        return Optional.ofNullable(this.platform);
    }

    private DevicePostureRuleMatchArgs() {}

    private DevicePostureRuleMatchArgs(DevicePostureRuleMatchArgs $) {
        this.platform = $.platform;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DevicePostureRuleMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DevicePostureRuleMatchArgs $;

        public Builder() {
            $ = new DevicePostureRuleMatchArgs();
        }

        public Builder(DevicePostureRuleMatchArgs defaults) {
            $ = new DevicePostureRuleMatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param platform Available values: &#34;windows&#34;, &#34;mac&#34;, &#34;linux&#34;, &#34;android&#34;, &#34;ios&#34;, &#34;chromeos&#34;.
         * 
         * @return builder
         * 
         */
        public Builder platform(@Nullable Output<String> platform) {
            $.platform = platform;
            return this;
        }

        /**
         * @param platform Available values: &#34;windows&#34;, &#34;mac&#34;, &#34;linux&#34;, &#34;android&#34;, &#34;ios&#34;, &#34;chromeos&#34;.
         * 
         * @return builder
         * 
         */
        public Builder platform(String platform) {
            return platform(Output.of(platform));
        }

        public DevicePostureRuleMatchArgs build() {
            return $;
        }
    }

}
