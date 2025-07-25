// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class ZeroTrustGatewaySettingsSettings
    {
        /// <summary>
        /// Activity log settings.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewaySettingsSettingsActivityLog? ActivityLog;
        /// <summary>
        /// Anti-virus settings.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewaySettingsSettingsAntivirus? Antivirus;
        /// <summary>
        /// Setting to enable App Control
        /// </summary>
        public readonly Outputs.ZeroTrustGatewaySettingsSettingsAppControlSettings? AppControlSettings;
        /// <summary>
        /// Block page layout settings.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewaySettingsSettingsBlockPage? BlockPage;
        /// <summary>
        /// DLP body scanning settings.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewaySettingsSettingsBodyScanning? BodyScanning;
        /// <summary>
        /// Browser isolation settings.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewaySettingsSettingsBrowserIsolation? BrowserIsolation;
        /// <summary>
        /// Certificate settings for Gateway TLS interception. If not specified, the Cloudflare Root CA will be used.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewaySettingsSettingsCertificate? Certificate;
        /// <summary>
        /// Custom certificate settings for BYO-PKI. (deprecated and replaced by `certificate`)
        /// </summary>
        public readonly Outputs.ZeroTrustGatewaySettingsSettingsCustomCertificate? CustomCertificate;
        /// <summary>
        /// Extended e-mail matching settings.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewaySettingsSettingsExtendedEmailMatching? ExtendedEmailMatching;
        /// <summary>
        /// FIPS settings.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewaySettingsSettingsFips? Fips;
        /// <summary>
        /// Setting to enable host selector in egress policies.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewaySettingsSettingsHostSelector? HostSelector;
        /// <summary>
        /// Protocol Detection settings.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewaySettingsSettingsProtocolDetection? ProtocolDetection;
        /// <summary>
        /// Sandbox settings.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewaySettingsSettingsSandbox? Sandbox;
        /// <summary>
        /// TLS interception settings.
        /// </summary>
        public readonly Outputs.ZeroTrustGatewaySettingsSettingsTlsDecrypt? TlsDecrypt;

        [OutputConstructor]
        private ZeroTrustGatewaySettingsSettings(
            Outputs.ZeroTrustGatewaySettingsSettingsActivityLog? activityLog,

            Outputs.ZeroTrustGatewaySettingsSettingsAntivirus? antivirus,

            Outputs.ZeroTrustGatewaySettingsSettingsAppControlSettings? appControlSettings,

            Outputs.ZeroTrustGatewaySettingsSettingsBlockPage? blockPage,

            Outputs.ZeroTrustGatewaySettingsSettingsBodyScanning? bodyScanning,

            Outputs.ZeroTrustGatewaySettingsSettingsBrowserIsolation? browserIsolation,

            Outputs.ZeroTrustGatewaySettingsSettingsCertificate? certificate,

            Outputs.ZeroTrustGatewaySettingsSettingsCustomCertificate? customCertificate,

            Outputs.ZeroTrustGatewaySettingsSettingsExtendedEmailMatching? extendedEmailMatching,

            Outputs.ZeroTrustGatewaySettingsSettingsFips? fips,

            Outputs.ZeroTrustGatewaySettingsSettingsHostSelector? hostSelector,

            Outputs.ZeroTrustGatewaySettingsSettingsProtocolDetection? protocolDetection,

            Outputs.ZeroTrustGatewaySettingsSettingsSandbox? sandbox,

            Outputs.ZeroTrustGatewaySettingsSettingsTlsDecrypt? tlsDecrypt)
        {
            ActivityLog = activityLog;
            Antivirus = antivirus;
            AppControlSettings = appControlSettings;
            BlockPage = blockPage;
            BodyScanning = bodyScanning;
            BrowserIsolation = browserIsolation;
            Certificate = certificate;
            CustomCertificate = customCertificate;
            ExtendedEmailMatching = extendedEmailMatching;
            Fips = fips;
            HostSelector = hostSelector;
            ProtocolDetection = protocolDetection;
            Sandbox = sandbox;
            TlsDecrypt = tlsDecrypt;
        }
    }
}
