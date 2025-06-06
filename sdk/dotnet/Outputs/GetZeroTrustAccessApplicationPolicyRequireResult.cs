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
    public sealed class GetZeroTrustAccessApplicationPolicyRequireResult
    {
        /// <summary>
        /// An empty object which matches on all service tokens.
        /// </summary>
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireAnyValidServiceTokenResult AnyValidServiceToken;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireAuthContextResult AuthContext;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireAuthMethodResult AuthMethod;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireAzureAdResult AzureAd;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireCertificateResult Certificate;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireCommonNameResult CommonName;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireDevicePostureResult DevicePosture;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireEmailResult Email;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireEmailDomainResult EmailDomain;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireEmailListResult EmailList;
        /// <summary>
        /// An empty object which matches on all users.
        /// </summary>
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireEveryoneResult Everyone;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireExternalEvaluationResult ExternalEvaluation;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireGeoResult Geo;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireGithubOrganizationResult GithubOrganization;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireGroupResult Group;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireGsuiteResult Gsuite;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireIpResult Ip;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireIpListResult IpList;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireLoginMethodResult LoginMethod;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireOktaResult Okta;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireSamlResult Saml;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyRequireServiceTokenResult ServiceToken;

        [OutputConstructor]
        private GetZeroTrustAccessApplicationPolicyRequireResult(
            Outputs.GetZeroTrustAccessApplicationPolicyRequireAnyValidServiceTokenResult anyValidServiceToken,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireAuthContextResult authContext,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireAuthMethodResult authMethod,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireAzureAdResult azureAd,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireCertificateResult certificate,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireCommonNameResult commonName,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireDevicePostureResult devicePosture,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireEmailResult email,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireEmailDomainResult emailDomain,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireEmailListResult emailList,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireEveryoneResult everyone,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireExternalEvaluationResult externalEvaluation,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireGeoResult geo,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireGithubOrganizationResult githubOrganization,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireGroupResult group,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireGsuiteResult gsuite,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireIpResult ip,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireIpListResult ipList,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireLoginMethodResult loginMethod,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireOktaResult okta,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireSamlResult saml,

            Outputs.GetZeroTrustAccessApplicationPolicyRequireServiceTokenResult serviceToken)
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
