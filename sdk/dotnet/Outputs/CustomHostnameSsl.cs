// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class CustomHostnameSsl
    {
        public readonly string? CertificateAuthority;
        public readonly string? CnameName;
        public readonly string? CnameTarget;
        /// <summary>
        /// If a custom uploaded certificate is used.
        /// </summary>
        public readonly string? CustomCertificate;
        /// <summary>
        /// The key for a custom uploaded certificate.
        /// </summary>
        public readonly string? CustomKey;
        /// <summary>
        /// Domain control validation (DCV) method used for this
        /// hostname. Valid values are `"txt"`, `"http"` and `"email"`.
        /// </summary>
        public readonly string? Method;
        /// <summary>
        /// SSL/TLS settings for the certificate. See further notes below.
        /// </summary>
        public readonly ImmutableArray<Outputs.CustomHostnameSslSetting> Settings;
        public readonly string? Status;
        /// <summary>
        /// Level of validation to be used for this hostname. Domain validation ("dv") must be used.
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// Indicates whether the certificate covers a wildcard.
        /// </summary>
        public readonly bool? Wildcard;

        [OutputConstructor]
        private CustomHostnameSsl(
            string? certificateAuthority,

            string? cnameName,

            string? cnameTarget,

            string? customCertificate,

            string? customKey,

            string? method,

            ImmutableArray<Outputs.CustomHostnameSslSetting> settings,

            string? status,

            string? type,

            bool? wildcard)
        {
            CertificateAuthority = certificateAuthority;
            CnameName = cnameName;
            CnameTarget = cnameTarget;
            CustomCertificate = customCertificate;
            CustomKey = customKey;
            Method = method;
            Settings = settings;
            Status = status;
            Type = type;
            Wildcard = wildcard;
        }
    }
}