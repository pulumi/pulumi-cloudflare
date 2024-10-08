// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsAntivirusNotificationSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustGatewaySettingsAntivirusArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustGatewaySettingsAntivirusArgs Empty = new ZeroTrustGatewaySettingsAntivirusArgs();

    /**
     * Scan on file download.
     * 
     */
    @Import(name="enabledDownloadPhase", required=true)
    private Output<Boolean> enabledDownloadPhase;

    /**
     * @return Scan on file download.
     * 
     */
    public Output<Boolean> enabledDownloadPhase() {
        return this.enabledDownloadPhase;
    }

    /**
     * Scan on file upload.
     * 
     */
    @Import(name="enabledUploadPhase", required=true)
    private Output<Boolean> enabledUploadPhase;

    /**
     * @return Scan on file upload.
     * 
     */
    public Output<Boolean> enabledUploadPhase() {
        return this.enabledUploadPhase;
    }

    /**
     * Block requests for files that cannot be scanned.
     * 
     */
    @Import(name="failClosed", required=true)
    private Output<Boolean> failClosed;

    /**
     * @return Block requests for files that cannot be scanned.
     * 
     */
    public Output<Boolean> failClosed() {
        return this.failClosed;
    }

    /**
     * Set notifications for antivirus.
     * 
     */
    @Import(name="notificationSettings")
    private @Nullable Output<ZeroTrustGatewaySettingsAntivirusNotificationSettingsArgs> notificationSettings;

    /**
     * @return Set notifications for antivirus.
     * 
     */
    public Optional<Output<ZeroTrustGatewaySettingsAntivirusNotificationSettingsArgs>> notificationSettings() {
        return Optional.ofNullable(this.notificationSettings);
    }

    private ZeroTrustGatewaySettingsAntivirusArgs() {}

    private ZeroTrustGatewaySettingsAntivirusArgs(ZeroTrustGatewaySettingsAntivirusArgs $) {
        this.enabledDownloadPhase = $.enabledDownloadPhase;
        this.enabledUploadPhase = $.enabledUploadPhase;
        this.failClosed = $.failClosed;
        this.notificationSettings = $.notificationSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustGatewaySettingsAntivirusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustGatewaySettingsAntivirusArgs $;

        public Builder() {
            $ = new ZeroTrustGatewaySettingsAntivirusArgs();
        }

        public Builder(ZeroTrustGatewaySettingsAntivirusArgs defaults) {
            $ = new ZeroTrustGatewaySettingsAntivirusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabledDownloadPhase Scan on file download.
         * 
         * @return builder
         * 
         */
        public Builder enabledDownloadPhase(Output<Boolean> enabledDownloadPhase) {
            $.enabledDownloadPhase = enabledDownloadPhase;
            return this;
        }

        /**
         * @param enabledDownloadPhase Scan on file download.
         * 
         * @return builder
         * 
         */
        public Builder enabledDownloadPhase(Boolean enabledDownloadPhase) {
            return enabledDownloadPhase(Output.of(enabledDownloadPhase));
        }

        /**
         * @param enabledUploadPhase Scan on file upload.
         * 
         * @return builder
         * 
         */
        public Builder enabledUploadPhase(Output<Boolean> enabledUploadPhase) {
            $.enabledUploadPhase = enabledUploadPhase;
            return this;
        }

        /**
         * @param enabledUploadPhase Scan on file upload.
         * 
         * @return builder
         * 
         */
        public Builder enabledUploadPhase(Boolean enabledUploadPhase) {
            return enabledUploadPhase(Output.of(enabledUploadPhase));
        }

        /**
         * @param failClosed Block requests for files that cannot be scanned.
         * 
         * @return builder
         * 
         */
        public Builder failClosed(Output<Boolean> failClosed) {
            $.failClosed = failClosed;
            return this;
        }

        /**
         * @param failClosed Block requests for files that cannot be scanned.
         * 
         * @return builder
         * 
         */
        public Builder failClosed(Boolean failClosed) {
            return failClosed(Output.of(failClosed));
        }

        /**
         * @param notificationSettings Set notifications for antivirus.
         * 
         * @return builder
         * 
         */
        public Builder notificationSettings(@Nullable Output<ZeroTrustGatewaySettingsAntivirusNotificationSettingsArgs> notificationSettings) {
            $.notificationSettings = notificationSettings;
            return this;
        }

        /**
         * @param notificationSettings Set notifications for antivirus.
         * 
         * @return builder
         * 
         */
        public Builder notificationSettings(ZeroTrustGatewaySettingsAntivirusNotificationSettingsArgs notificationSettings) {
            return notificationSettings(Output.of(notificationSettings));
        }

        public ZeroTrustGatewaySettingsAntivirusArgs build() {
            if ($.enabledDownloadPhase == null) {
                throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsAntivirusArgs", "enabledDownloadPhase");
            }
            if ($.enabledUploadPhase == null) {
                throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsAntivirusArgs", "enabledUploadPhase");
            }
            if ($.failClosed == null) {
                throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsAntivirusArgs", "failClosed");
            }
            return $;
        }
    }

}
