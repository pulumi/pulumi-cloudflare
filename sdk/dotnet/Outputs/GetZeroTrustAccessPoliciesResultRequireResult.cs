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
    public sealed class GetZeroTrustAccessPoliciesResultRequireResult
    {
        /// <summary>
        /// An empty object which matches on all service tokens.
        /// </summary>
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireAnyValidServiceTokenResult AnyValidServiceToken;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireAuthContextResult AuthContext;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireAuthMethodResult AuthMethod;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireAzureAdResult AzureAd;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireCertificateResult Certificate;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireCommonNameResult CommonName;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireDevicePostureResult DevicePosture;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireEmailResult Email;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireEmailDomainResult EmailDomain;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireEmailListResult EmailList;
        /// <summary>
        /// An empty object which matches on all users.
        /// </summary>
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireEveryoneResult Everyone;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireExternalEvaluationResult ExternalEvaluation;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireGeoResult Geo;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireGithubOrganizationResult GithubOrganization;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireGroupResult Group;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireGsuiteResult Gsuite;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireIpResult Ip;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireIpListResult IpList;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireLoginMethodResult LoginMethod;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireOktaResult Okta;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireSamlResult Saml;
        public readonly Outputs.GetZeroTrustAccessPoliciesResultRequireServiceTokenResult ServiceToken;

        [OutputConstructor]
        private GetZeroTrustAccessPoliciesResultRequireResult(
            Outputs.GetZeroTrustAccessPoliciesResultRequireAnyValidServiceTokenResult anyValidServiceToken,

            Outputs.GetZeroTrustAccessPoliciesResultRequireAuthContextResult authContext,

            Outputs.GetZeroTrustAccessPoliciesResultRequireAuthMethodResult authMethod,

            Outputs.GetZeroTrustAccessPoliciesResultRequireAzureAdResult azureAd,

            Outputs.GetZeroTrustAccessPoliciesResultRequireCertificateResult certificate,

            Outputs.GetZeroTrustAccessPoliciesResultRequireCommonNameResult commonName,

            Outputs.GetZeroTrustAccessPoliciesResultRequireDevicePostureResult devicePosture,

            Outputs.GetZeroTrustAccessPoliciesResultRequireEmailResult email,

            Outputs.GetZeroTrustAccessPoliciesResultRequireEmailDomainResult emailDomain,

            Outputs.GetZeroTrustAccessPoliciesResultRequireEmailListResult emailList,

            Outputs.GetZeroTrustAccessPoliciesResultRequireEveryoneResult everyone,

            Outputs.GetZeroTrustAccessPoliciesResultRequireExternalEvaluationResult externalEvaluation,

            Outputs.GetZeroTrustAccessPoliciesResultRequireGeoResult geo,

            Outputs.GetZeroTrustAccessPoliciesResultRequireGithubOrganizationResult githubOrganization,

            Outputs.GetZeroTrustAccessPoliciesResultRequireGroupResult group,

            Outputs.GetZeroTrustAccessPoliciesResultRequireGsuiteResult gsuite,

            Outputs.GetZeroTrustAccessPoliciesResultRequireIpResult ip,

            Outputs.GetZeroTrustAccessPoliciesResultRequireIpListResult ipList,

            Outputs.GetZeroTrustAccessPoliciesResultRequireLoginMethodResult loginMethod,

            Outputs.GetZeroTrustAccessPoliciesResultRequireOktaResult okta,

            Outputs.GetZeroTrustAccessPoliciesResultRequireSamlResult saml,

            Outputs.GetZeroTrustAccessPoliciesResultRequireServiceTokenResult serviceToken)
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
