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
    public sealed class GetDevicesDeviceResult
    {
        /// <summary>
        /// When the device was created.
        /// </summary>
        public readonly string? Created;
        /// <summary>
        /// Whether the device has been deleted.
        /// </summary>
        public readonly bool? Deleted;
        /// <summary>
        /// The type of the device.
        /// </summary>
        public readonly string? DeviceType;
        /// <summary>
        /// Device ID.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// IPv4 or IPv6 address.
        /// </summary>
        public readonly string? Ip;
        /// <summary>
        /// The device's public key.
        /// </summary>
        public readonly string? Key;
        /// <summary>
        /// When the device was last seen.
        /// </summary>
        public readonly string? LastSeen;
        /// <summary>
        /// The device's MAC address.
        /// </summary>
        public readonly string? MacAddress;
        /// <summary>
        /// The device manufacturer's name.
        /// </summary>
        public readonly string? Manufacturer;
        /// <summary>
        /// The device model name.
        /// </summary>
        public readonly string? Model;
        /// <summary>
        /// The device name.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The Linux distribution name.
        /// </summary>
        public readonly string? OsDistroName;
        /// <summary>
        /// The Linux distribution revision.
        /// </summary>
        public readonly string? OsDistroRevision;
        /// <summary>
        /// The operating system version.
        /// </summary>
        public readonly string? OsVersion;
        /// <summary>
        /// Extra version value following the operating system version.
        /// </summary>
        public readonly string? OsVersionExtra;
        /// <summary>
        /// When the device was revoked.
        /// </summary>
        public readonly string? RevokedAt;
        /// <summary>
        /// The device's serial number.
        /// </summary>
        public readonly string? SerialNumber;
        /// <summary>
        /// When the device was updated.
        /// </summary>
        public readonly string? Updated;
        /// <summary>
        /// User's email.
        /// </summary>
        public readonly string? UserEmail;
        /// <summary>
        /// User's ID.
        /// </summary>
        public readonly string? UserId;
        /// <summary>
        /// User's Name.
        /// </summary>
        public readonly string? UserName;
        /// <summary>
        /// The WARP client version.
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private GetDevicesDeviceResult(
            string? created,

            bool? deleted,

            string? deviceType,

            string? id,

            string? ip,

            string? key,

            string? lastSeen,

            string? macAddress,

            string? manufacturer,

            string? model,

            string? name,

            string? osDistroName,

            string? osDistroRevision,

            string? osVersion,

            string? osVersionExtra,

            string? revokedAt,

            string? serialNumber,

            string? updated,

            string? userEmail,

            string? userId,

            string? userName,

            string? version)
        {
            Created = created;
            Deleted = deleted;
            DeviceType = deviceType;
            Id = id;
            Ip = ip;
            Key = key;
            LastSeen = lastSeen;
            MacAddress = macAddress;
            Manufacturer = manufacturer;
            Model = model;
            Name = name;
            OsDistroName = osDistroName;
            OsDistroRevision = osDistroRevision;
            OsVersion = osVersion;
            OsVersionExtra = osVersionExtra;
            RevokedAt = revokedAt;
            SerialNumber = serialNumber;
            Updated = updated;
            UserEmail = userEmail;
            UserId = userId;
            UserName = userName;
            Version = version;
        }
    }
}
