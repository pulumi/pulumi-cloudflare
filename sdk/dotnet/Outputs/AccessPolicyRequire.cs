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
    public sealed class AccessPolicyRequire
    {
        /// <summary>
        /// An empty object which matches on all service tokens.
        /// </summary>
        public readonly Outputs.AccessPolicyRequireAnyValidServiceToken? AnyValidServiceToken;
        public readonly Outputs.AccessPolicyRequireAuthContext? AuthContext;
        public readonly Outputs.AccessPolicyRequireAuthMethod? AuthMethod;
        public readonly Outputs.AccessPolicyRequireAzureAd? AzureAd;
        public readonly Outputs.AccessPolicyRequireCertificate? Certificate;
        public readonly Outputs.AccessPolicyRequireCommonName? CommonName;
        public readonly Outputs.AccessPolicyRequireDevicePosture? DevicePosture;
        public readonly Outputs.AccessPolicyRequireEmail? Email;
        public readonly Outputs.AccessPolicyRequireEmailDomain? EmailDomain;
        public readonly Outputs.AccessPolicyRequireEmailList? EmailList;
        /// <summary>
        /// An empty object which matches on all users.
        /// </summary>
        public readonly Outputs.AccessPolicyRequireEveryone? Everyone;
        public readonly Outputs.AccessPolicyRequireExternalEvaluation? ExternalEvaluation;
        public readonly Outputs.AccessPolicyRequireGeo? Geo;
        public readonly Outputs.AccessPolicyRequireGithubOrganization? GithubOrganization;
        public readonly Outputs.AccessPolicyRequireGroup? Group;
        public readonly Outputs.AccessPolicyRequireGsuite? Gsuite;
        public readonly Outputs.AccessPolicyRequireIp? Ip;
        public readonly Outputs.AccessPolicyRequireIpList? IpList;
        public readonly Outputs.AccessPolicyRequireLoginMethod? LoginMethod;
        public readonly Outputs.AccessPolicyRequireOkta? Okta;
        public readonly Outputs.AccessPolicyRequireSaml? Saml;
        public readonly Outputs.AccessPolicyRequireServiceToken? ServiceToken;

        [OutputConstructor]
        private AccessPolicyRequire(
            Outputs.AccessPolicyRequireAnyValidServiceToken? anyValidServiceToken,

            Outputs.AccessPolicyRequireAuthContext? authContext,

            Outputs.AccessPolicyRequireAuthMethod? authMethod,

            Outputs.AccessPolicyRequireAzureAd? azureAd,

            Outputs.AccessPolicyRequireCertificate? certificate,

            Outputs.AccessPolicyRequireCommonName? commonName,

            Outputs.AccessPolicyRequireDevicePosture? devicePosture,

            Outputs.AccessPolicyRequireEmail? email,

            Outputs.AccessPolicyRequireEmailDomain? emailDomain,

            Outputs.AccessPolicyRequireEmailList? emailList,

            Outputs.AccessPolicyRequireEveryone? everyone,

            Outputs.AccessPolicyRequireExternalEvaluation? externalEvaluation,

            Outputs.AccessPolicyRequireGeo? geo,

            Outputs.AccessPolicyRequireGithubOrganization? githubOrganization,

            Outputs.AccessPolicyRequireGroup? group,

            Outputs.AccessPolicyRequireGsuite? gsuite,

            Outputs.AccessPolicyRequireIp? ip,

            Outputs.AccessPolicyRequireIpList? ipList,

            Outputs.AccessPolicyRequireLoginMethod? loginMethod,

            Outputs.AccessPolicyRequireOkta? okta,

            Outputs.AccessPolicyRequireSaml? saml,

            Outputs.AccessPolicyRequireServiceToken? serviceToken)
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
