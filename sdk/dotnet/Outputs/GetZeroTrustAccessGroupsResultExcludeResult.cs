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
    public sealed class GetZeroTrustAccessGroupsResultExcludeResult
    {
        /// <summary>
        /// An empty object which matches on all service tokens.
        /// </summary>
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeAnyValidServiceTokenResult AnyValidServiceToken;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeAuthContextResult AuthContext;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeAuthMethodResult AuthMethod;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeAzureAdResult AzureAd;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeCertificateResult Certificate;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeCommonNameResult CommonName;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeDevicePostureResult DevicePosture;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeEmailResult Email;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeEmailDomainResult EmailDomain;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeEmailListResult EmailList;
        /// <summary>
        /// An empty object which matches on all users.
        /// </summary>
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeEveryoneResult Everyone;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeExternalEvaluationResult ExternalEvaluation;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeGeoResult Geo;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeGithubOrganizationResult GithubOrganization;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeGroupResult Group;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeGsuiteResult Gsuite;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeIpResult Ip;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeIpListResult IpList;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeLoginMethodResult LoginMethod;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeOktaResult Okta;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeSamlResult Saml;
        public readonly Outputs.GetZeroTrustAccessGroupsResultExcludeServiceTokenResult ServiceToken;

        [OutputConstructor]
        private GetZeroTrustAccessGroupsResultExcludeResult(
            Outputs.GetZeroTrustAccessGroupsResultExcludeAnyValidServiceTokenResult anyValidServiceToken,

            Outputs.GetZeroTrustAccessGroupsResultExcludeAuthContextResult authContext,

            Outputs.GetZeroTrustAccessGroupsResultExcludeAuthMethodResult authMethod,

            Outputs.GetZeroTrustAccessGroupsResultExcludeAzureAdResult azureAd,

            Outputs.GetZeroTrustAccessGroupsResultExcludeCertificateResult certificate,

            Outputs.GetZeroTrustAccessGroupsResultExcludeCommonNameResult commonName,

            Outputs.GetZeroTrustAccessGroupsResultExcludeDevicePostureResult devicePosture,

            Outputs.GetZeroTrustAccessGroupsResultExcludeEmailResult email,

            Outputs.GetZeroTrustAccessGroupsResultExcludeEmailDomainResult emailDomain,

            Outputs.GetZeroTrustAccessGroupsResultExcludeEmailListResult emailList,

            Outputs.GetZeroTrustAccessGroupsResultExcludeEveryoneResult everyone,

            Outputs.GetZeroTrustAccessGroupsResultExcludeExternalEvaluationResult externalEvaluation,

            Outputs.GetZeroTrustAccessGroupsResultExcludeGeoResult geo,

            Outputs.GetZeroTrustAccessGroupsResultExcludeGithubOrganizationResult githubOrganization,

            Outputs.GetZeroTrustAccessGroupsResultExcludeGroupResult group,

            Outputs.GetZeroTrustAccessGroupsResultExcludeGsuiteResult gsuite,

            Outputs.GetZeroTrustAccessGroupsResultExcludeIpResult ip,

            Outputs.GetZeroTrustAccessGroupsResultExcludeIpListResult ipList,

            Outputs.GetZeroTrustAccessGroupsResultExcludeLoginMethodResult loginMethod,

            Outputs.GetZeroTrustAccessGroupsResultExcludeOktaResult okta,

            Outputs.GetZeroTrustAccessGroupsResultExcludeSamlResult saml,

            Outputs.GetZeroTrustAccessGroupsResultExcludeServiceTokenResult serviceToken)
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
