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
    public sealed class AccessGroupRequire
    {
        /// <summary>
        /// An empty object which matches on all service tokens.
        /// </summary>
        public readonly Outputs.AccessGroupRequireAnyValidServiceToken? AnyValidServiceToken;
        public readonly Outputs.AccessGroupRequireAuthContext? AuthContext;
        public readonly Outputs.AccessGroupRequireAuthMethod? AuthMethod;
        public readonly Outputs.AccessGroupRequireAzureAd? AzureAd;
        public readonly Outputs.AccessGroupRequireCertificate? Certificate;
        public readonly Outputs.AccessGroupRequireCommonName? CommonName;
        public readonly Outputs.AccessGroupRequireDevicePosture? DevicePosture;
        public readonly Outputs.AccessGroupRequireEmail? Email;
        public readonly Outputs.AccessGroupRequireEmailDomain? EmailDomain;
        public readonly Outputs.AccessGroupRequireEmailList? EmailList;
        /// <summary>
        /// An empty object which matches on all users.
        /// </summary>
        public readonly Outputs.AccessGroupRequireEveryone? Everyone;
        public readonly Outputs.AccessGroupRequireExternalEvaluation? ExternalEvaluation;
        public readonly Outputs.AccessGroupRequireGeo? Geo;
        public readonly Outputs.AccessGroupRequireGithubOrganization? GithubOrganization;
        public readonly Outputs.AccessGroupRequireGroup? Group;
        public readonly Outputs.AccessGroupRequireGsuite? Gsuite;
        public readonly Outputs.AccessGroupRequireIp? Ip;
        public readonly Outputs.AccessGroupRequireIpList? IpList;
        public readonly Outputs.AccessGroupRequireLoginMethod? LoginMethod;
        public readonly Outputs.AccessGroupRequireOkta? Okta;
        public readonly Outputs.AccessGroupRequireSaml? Saml;
        public readonly Outputs.AccessGroupRequireServiceToken? ServiceToken;

        [OutputConstructor]
        private AccessGroupRequire(
            Outputs.AccessGroupRequireAnyValidServiceToken? anyValidServiceToken,

            Outputs.AccessGroupRequireAuthContext? authContext,

            Outputs.AccessGroupRequireAuthMethod? authMethod,

            Outputs.AccessGroupRequireAzureAd? azureAd,

            Outputs.AccessGroupRequireCertificate? certificate,

            Outputs.AccessGroupRequireCommonName? commonName,

            Outputs.AccessGroupRequireDevicePosture? devicePosture,

            Outputs.AccessGroupRequireEmail? email,

            Outputs.AccessGroupRequireEmailDomain? emailDomain,

            Outputs.AccessGroupRequireEmailList? emailList,

            Outputs.AccessGroupRequireEveryone? everyone,

            Outputs.AccessGroupRequireExternalEvaluation? externalEvaluation,

            Outputs.AccessGroupRequireGeo? geo,

            Outputs.AccessGroupRequireGithubOrganization? githubOrganization,

            Outputs.AccessGroupRequireGroup? group,

            Outputs.AccessGroupRequireGsuite? gsuite,

            Outputs.AccessGroupRequireIp? ip,

            Outputs.AccessGroupRequireIpList? ipList,

            Outputs.AccessGroupRequireLoginMethod? loginMethod,

            Outputs.AccessGroupRequireOkta? okta,

            Outputs.AccessGroupRequireSaml? saml,

            Outputs.AccessGroupRequireServiceToken? serviceToken)
        {
            AnyValidServiceToken = anyValidServiceToken;
            AuthContext = authContext;
            AuthMethod = authMethod;
            AzureAd = azureAd;
            Certificate = certificate;
            CommonName = commonName;
            DevicePosture = devicePosture;
            Email = email;
            EmailDomain = emailDomain;
            EmailList = emailList;
            Everyone = everyone;
            ExternalEvaluation = externalEvaluation;
            Geo = geo;
            GithubOrganization = githubOrganization;
            Group = group;
            Gsuite = gsuite;
            Ip = ip;
            IpList = ipList;
            LoginMethod = loginMethod;
            Okta = okta;
            Saml = saml;
            ServiceToken = serviceToken;
        }
    }
}
