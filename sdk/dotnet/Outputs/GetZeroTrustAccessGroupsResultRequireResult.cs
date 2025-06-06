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
    public sealed class GetZeroTrustAccessGroupsResultRequireResult
    {
        /// <summary>
        /// An empty object which matches on all service tokens.
        /// </summary>
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireAnyValidServiceTokenResult AnyValidServiceToken;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireAuthContextResult AuthContext;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireAuthMethodResult AuthMethod;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireAzureAdResult AzureAd;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireCertificateResult Certificate;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireCommonNameResult CommonName;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireDevicePostureResult DevicePosture;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireEmailResult Email;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireEmailDomainResult EmailDomain;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireEmailListResult EmailList;
        /// <summary>
        /// An empty object which matches on all users.
        /// </summary>
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireEveryoneResult Everyone;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireExternalEvaluationResult ExternalEvaluation;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireGeoResult Geo;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireGithubOrganizationResult GithubOrganization;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireGroupResult Group;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireGsuiteResult Gsuite;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireIpResult Ip;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireIpListResult IpList;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireLoginMethodResult LoginMethod;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireOktaResult Okta;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireSamlResult Saml;
        public readonly Outputs.GetZeroTrustAccessGroupsResultRequireServiceTokenResult ServiceToken;

        [OutputConstructor]
        private GetZeroTrustAccessGroupsResultRequireResult(
            Outputs.GetZeroTrustAccessGroupsResultRequireAnyValidServiceTokenResult anyValidServiceToken,

            Outputs.GetZeroTrustAccessGroupsResultRequireAuthContextResult authContext,

            Outputs.GetZeroTrustAccessGroupsResultRequireAuthMethodResult authMethod,

            Outputs.GetZeroTrustAccessGroupsResultRequireAzureAdResult azureAd,

            Outputs.GetZeroTrustAccessGroupsResultRequireCertificateResult certificate,

            Outputs.GetZeroTrustAccessGroupsResultRequireCommonNameResult commonName,

            Outputs.GetZeroTrustAccessGroupsResultRequireDevicePostureResult devicePosture,

            Outputs.GetZeroTrustAccessGroupsResultRequireEmailResult email,

            Outputs.GetZeroTrustAccessGroupsResultRequireEmailDomainResult emailDomain,

            Outputs.GetZeroTrustAccessGroupsResultRequireEmailListResult emailList,

            Outputs.GetZeroTrustAccessGroupsResultRequireEveryoneResult everyone,

            Outputs.GetZeroTrustAccessGroupsResultRequireExternalEvaluationResult externalEvaluation,

            Outputs.GetZeroTrustAccessGroupsResultRequireGeoResult geo,

            Outputs.GetZeroTrustAccessGroupsResultRequireGithubOrganizationResult githubOrganization,

            Outputs.GetZeroTrustAccessGroupsResultRequireGroupResult group,

            Outputs.GetZeroTrustAccessGroupsResultRequireGsuiteResult gsuite,

            Outputs.GetZeroTrustAccessGroupsResultRequireIpResult ip,

            Outputs.GetZeroTrustAccessGroupsResultRequireIpListResult ipList,

            Outputs.GetZeroTrustAccessGroupsResultRequireLoginMethodResult loginMethod,

            Outputs.GetZeroTrustAccessGroupsResultRequireOktaResult okta,

            Outputs.GetZeroTrustAccessGroupsResultRequireSamlResult saml,

            Outputs.GetZeroTrustAccessGroupsResultRequireServiceTokenResult serviceToken)
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
