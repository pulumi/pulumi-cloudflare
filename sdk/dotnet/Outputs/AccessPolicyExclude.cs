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
    public sealed class AccessPolicyExclude
    {
        /// <summary>
        /// An empty object which matches on all service tokens.
        /// </summary>
        public readonly Outputs.AccessPolicyExcludeAnyValidServiceToken? AnyValidServiceToken;
        public readonly Outputs.AccessPolicyExcludeAuthContext? AuthContext;
        public readonly Outputs.AccessPolicyExcludeAuthMethod? AuthMethod;
        public readonly Outputs.AccessPolicyExcludeAzureAd? AzureAd;
        public readonly Outputs.AccessPolicyExcludeCertificate? Certificate;
        public readonly Outputs.AccessPolicyExcludeCommonName? CommonName;
        public readonly Outputs.AccessPolicyExcludeDevicePosture? DevicePosture;
        public readonly Outputs.AccessPolicyExcludeEmail? Email;
        public readonly Outputs.AccessPolicyExcludeEmailDomain? EmailDomain;
        public readonly Outputs.AccessPolicyExcludeEmailList? EmailList;
        /// <summary>
        /// An empty object which matches on all users.
        /// </summary>
        public readonly Outputs.AccessPolicyExcludeEveryone? Everyone;
        public readonly Outputs.AccessPolicyExcludeExternalEvaluation? ExternalEvaluation;
        public readonly Outputs.AccessPolicyExcludeGeo? Geo;
        public readonly Outputs.AccessPolicyExcludeGithubOrganization? GithubOrganization;
        public readonly Outputs.AccessPolicyExcludeGroup? Group;
        public readonly Outputs.AccessPolicyExcludeGsuite? Gsuite;
        public readonly Outputs.AccessPolicyExcludeIp? Ip;
        public readonly Outputs.AccessPolicyExcludeIpList? IpList;
        public readonly Outputs.AccessPolicyExcludeLoginMethod? LoginMethod;
        public readonly Outputs.AccessPolicyExcludeOkta? Okta;
        public readonly Outputs.AccessPolicyExcludeSaml? Saml;
        public readonly Outputs.AccessPolicyExcludeServiceToken? ServiceToken;

        [OutputConstructor]
        private AccessPolicyExclude(
            Outputs.AccessPolicyExcludeAnyValidServiceToken? anyValidServiceToken,

            Outputs.AccessPolicyExcludeAuthContext? authContext,

            Outputs.AccessPolicyExcludeAuthMethod? authMethod,

            Outputs.AccessPolicyExcludeAzureAd? azureAd,

            Outputs.AccessPolicyExcludeCertificate? certificate,

            Outputs.AccessPolicyExcludeCommonName? commonName,

            Outputs.AccessPolicyExcludeDevicePosture? devicePosture,

            Outputs.AccessPolicyExcludeEmail? email,

            Outputs.AccessPolicyExcludeEmailDomain? emailDomain,

            Outputs.AccessPolicyExcludeEmailList? emailList,

            Outputs.AccessPolicyExcludeEveryone? everyone,

            Outputs.AccessPolicyExcludeExternalEvaluation? externalEvaluation,

            Outputs.AccessPolicyExcludeGeo? geo,

            Outputs.AccessPolicyExcludeGithubOrganization? githubOrganization,

            Outputs.AccessPolicyExcludeGroup? group,

            Outputs.AccessPolicyExcludeGsuite? gsuite,

            Outputs.AccessPolicyExcludeIp? ip,

            Outputs.AccessPolicyExcludeIpList? ipList,

            Outputs.AccessPolicyExcludeLoginMethod? loginMethod,

            Outputs.AccessPolicyExcludeOkta? okta,

            Outputs.AccessPolicyExcludeSaml? saml,

            Outputs.AccessPolicyExcludeServiceToken? serviceToken)
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
