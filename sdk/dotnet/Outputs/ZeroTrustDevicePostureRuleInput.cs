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
    public sealed class ZeroTrustDevicePostureRuleInput
    {
        /// <summary>
        /// The number of active threats from SentinelOne.
        /// </summary>
        public readonly int? ActiveThreats;
        /// <summary>
        /// The UUID of a Cloudflare managed certificate.
        /// </summary>
        public readonly string? CertificateId;
        /// <summary>
        /// Specific volume(s) to check for encryption.
        /// </summary>
        public readonly ImmutableArray<string> CheckDisks;
        /// <summary>
        /// Confirm the certificate was not imported from another device.
        /// </summary>
        public readonly bool? CheckPrivateKey;
        /// <summary>
        /// The common name for a certificate.
        /// </summary>
        public readonly string? Cn;
        /// <summary>
        /// The workspace one or intune device compliance status. `compliant` and `noncompliant` are values supported by both providers. `unknown`, `conflict`, `error`, `ingraceperiod` values are only supported by intune. Available values: `compliant`, `noncompliant`, `unknown`, `conflict`, `error`, `ingraceperiod`.
        /// </summary>
        public readonly string? ComplianceStatus;
        /// <summary>
        /// The workspace one or intune connection id.
        /// </summary>
        public readonly string? ConnectionId;
        /// <summary>
        /// The count comparison operator for kolide. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
        /// </summary>
        public readonly string? CountOperator;
        /// <summary>
        /// The domain that the client must join.
        /// </summary>
        public readonly string? Domain;
        /// <summary>
        /// The datetime a device last seen in RFC 3339 format from Tanium.
        /// </summary>
        public readonly string? EidLastSeen;
        /// <summary>
        /// True if the firewall must be enabled.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Checks if the file should exist.
        /// </summary>
        public readonly bool? Exists;
        /// <summary>
        /// List of values indicating purposes for which the certificate public key can be used. Available values: `clientAuth`, `emailProtection`
        /// </summary>
        public readonly ImmutableArray<string> ExtendedKeyUsages;
        /// <summary>
        /// The Teams List id. Required for `serial_number` and `unique_client_id` rule types.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// True if SentinelOne device is infected.
        /// </summary>
        public readonly bool? Infected;
        /// <summary>
        /// True if SentinelOne device is active.
        /// </summary>
        public readonly bool? IsActive;
        /// <summary>
        /// The number of issues for kolide.
        /// </summary>
        public readonly string? IssueCount;
        /// <summary>
        /// The duration of time that the host was last seen from Crowdstrike. Must be in the format `1h` or `30m`. Valid units are `d`, `h` and `m`.
        /// </summary>
        public readonly string? LastSeen;
        /// <summary>
        /// List of locations to check for client certificate.
        /// </summary>
        public readonly ImmutableArray<Outputs.ZeroTrustDevicePostureRuleInputLocation> Locations;
        /// <summary>
        /// The network status from SentinelOne. Available values: `connected`, `disconnected`, `disconnecting`, `connecting`.
        /// </summary>
        public readonly string? NetworkStatus;
        /// <summary>
        /// The version comparison operator. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
        /// </summary>
        public readonly string? Operator;
        /// <summary>
        /// OS signal score from Crowdstrike. Value must be between 1 and 100.
        /// </summary>
        public readonly string? Os;
        /// <summary>
        /// The operating system excluding version information.
        /// </summary>
        public readonly string? OsDistroName;
        /// <summary>
        /// The operating system version excluding OS name information or release name.
        /// </summary>
        public readonly string? OsDistroRevision;
        /// <summary>
        /// Extra version value following the operating system semantic version.
        /// </summary>
        public readonly string? OsVersionExtra;
        /// <summary>
        /// Overall ZTA score from Crowdstrike. Value must be between 1 and 100.
        /// </summary>
        public readonly string? Overall;
        /// <summary>
        /// The path to the file.
        /// </summary>
        public readonly string? Path;
        /// <summary>
        /// True if all drives must be encrypted.
        /// </summary>
        public readonly bool? RequireAll;
        /// <summary>
        /// The risk level from Tanium. Available values: `low`, `medium`, `high`, `critical`.
        /// </summary>
        public readonly string? RiskLevel;
        /// <summary>
        /// Checks if the application should be running.
        /// </summary>
        public readonly bool? Running;
        /// <summary>
        /// Sensor signal score from Crowdstrike. Value must be between 1 and 100.
        /// </summary>
        public readonly string? SensorConfig;
        /// <summary>
        /// The sha256 hash of the file.
        /// </summary>
        public readonly string? Sha256;
        /// <summary>
        /// The host’s current online status from Crowdstrike. Available values: `online`, `offline`, `unknown`.
        /// </summary>
        public readonly string? State;
        /// <summary>
        /// The thumbprint of the file certificate.
        /// </summary>
        public readonly string? Thumbprint;
        /// <summary>
        /// The total score from Tanium.
        /// </summary>
        public readonly int? TotalScore;
        /// <summary>
        /// The operating system semantic version.
        /// </summary>
        public readonly string? Version;
        /// <summary>
        /// The version comparison operator for crowdstrike. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
        /// </summary>
        public readonly string? VersionOperator;

        [OutputConstructor]
        private ZeroTrustDevicePostureRuleInput(
            int? activeThreats,

            string? certificateId,

            ImmutableArray<string> checkDisks,

            bool? checkPrivateKey,

            string? cn,

            string? complianceStatus,

            string? connectionId,

            string? countOperator,

            string? domain,

            string? eidLastSeen,

            bool? enabled,

            bool? exists,

            ImmutableArray<string> extendedKeyUsages,

            string? id,

            bool? infected,

            bool? isActive,

            string? issueCount,

            string? lastSeen,

            ImmutableArray<Outputs.ZeroTrustDevicePostureRuleInputLocation> locations,

            string? networkStatus,

            string? @operator,

            string? os,

            string? osDistroName,

            string? osDistroRevision,

            string? osVersionExtra,

            string? overall,

            string? path,

            bool? requireAll,

            string? riskLevel,

            bool? running,

            string? sensorConfig,

            string? sha256,

            string? state,

            string? thumbprint,

            int? totalScore,

            string? version,

            string? versionOperator)
        {
            ActiveThreats = activeThreats;
            CertificateId = certificateId;
            CheckDisks = checkDisks;
            CheckPrivateKey = checkPrivateKey;
            Cn = cn;
            ComplianceStatus = complianceStatus;
            ConnectionId = connectionId;
            CountOperator = countOperator;
            Domain = domain;
            EidLastSeen = eidLastSeen;
            Enabled = enabled;
            Exists = exists;
            ExtendedKeyUsages = extendedKeyUsages;
            Id = id;
            Infected = infected;
            IsActive = isActive;
            IssueCount = issueCount;
            LastSeen = lastSeen;
            Locations = locations;
            NetworkStatus = networkStatus;
            Operator = @operator;
            Os = os;
            OsDistroName = osDistroName;
            OsDistroRevision = osDistroRevision;
            OsVersionExtra = osVersionExtra;
            Overall = overall;
            Path = path;
            RequireAll = requireAll;
            RiskLevel = riskLevel;
            Running = running;
            SensorConfig = sensorConfig;
            Sha256 = sha256;
            State = state;
            Thumbprint = thumbprint;
            TotalScore = totalScore;
            Version = version;
            VersionOperator = versionOperator;
        }
    }
}