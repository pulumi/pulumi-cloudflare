// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustGatewaySettingsSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Activity log settings.
        /// </summary>
        [Input("activityLog")]
        public Input<Inputs.ZeroTrustGatewaySettingsSettingsActivityLogArgs>? ActivityLog { get; set; }

        /// <summary>
        /// Anti-virus settings.
        /// </summary>
        [Input("antivirus")]
        public Input<Inputs.ZeroTrustGatewaySettingsSettingsAntivirusArgs>? Antivirus { get; set; }

        /// <summary>
        /// Setting to enable App Control
        /// </summary>
        [Input("appControlSettings")]
        public Input<Inputs.ZeroTrustGatewaySettingsSettingsAppControlSettingsArgs>? AppControlSettings { get; set; }

        /// <summary>
        /// Block page layout settings.
        /// </summary>
        [Input("blockPage")]
        public Input<Inputs.ZeroTrustGatewaySettingsSettingsBlockPageArgs>? BlockPage { get; set; }

        /// <summary>
        /// DLP body scanning settings.
        /// </summary>
        [Input("bodyScanning")]
        public Input<Inputs.ZeroTrustGatewaySettingsSettingsBodyScanningArgs>? BodyScanning { get; set; }

        /// <summary>
        /// Browser isolation settings.
        /// </summary>
        [Input("browserIsolation")]
        public Input<Inputs.ZeroTrustGatewaySettingsSettingsBrowserIsolationArgs>? BrowserIsolation { get; set; }

        /// <summary>
        /// Certificate settings for Gateway TLS interception. If not specified, the Cloudflare Root CA will be used.
        /// </summary>
        [Input("certificate")]
        public Input<Inputs.ZeroTrustGatewaySettingsSettingsCertificateArgs>? Certificate { get; set; }

        /// <summary>
        /// Custom certificate settings for BYO-PKI. (deprecated and replaced by `certificate`)
        /// </summary>
        [Input("customCertificate")]
        public Input<Inputs.ZeroTrustGatewaySettingsSettingsCustomCertificateArgs>? CustomCertificate { get; set; }

        /// <summary>
        /// Extended e-mail matching settings.
        /// </summary>
        [Input("extendedEmailMatching")]
        public Input<Inputs.ZeroTrustGatewaySettingsSettingsExtendedEmailMatchingArgs>? ExtendedEmailMatching { get; set; }

        /// <summary>
        /// FIPS settings.
        /// </summary>
        [Input("fips")]
        public Input<Inputs.ZeroTrustGatewaySettingsSettingsFipsArgs>? Fips { get; set; }

        /// <summary>
        /// Setting to enable host selector in egress policies.
        /// </summary>
        [Input("hostSelector")]
        public Input<Inputs.ZeroTrustGatewaySettingsSettingsHostSelectorArgs>? HostSelector { get; set; }

        /// <summary>
        /// Protocol Detection settings.
        /// </summary>
        [Input("protocolDetection")]
        public Input<Inputs.ZeroTrustGatewaySettingsSettingsProtocolDetectionArgs>? ProtocolDetection { get; set; }

        /// <summary>
        /// Sandbox settings.
        /// </summary>
        [Input("sandbox")]
        public Input<Inputs.ZeroTrustGatewaySettingsSettingsSandboxArgs>? Sandbox { get; set; }

        /// <summary>
        /// TLS interception settings.
        /// </summary>
        [Input("tlsDecrypt")]
        public Input<Inputs.ZeroTrustGatewaySettingsSettingsTlsDecryptArgs>? TlsDecrypt { get; set; }

        public ZeroTrustGatewaySettingsSettingsArgs()
        {
        }
        public static new ZeroTrustGatewaySettingsSettingsArgs Empty => new ZeroTrustGatewaySettingsSettingsArgs();
    }
}
