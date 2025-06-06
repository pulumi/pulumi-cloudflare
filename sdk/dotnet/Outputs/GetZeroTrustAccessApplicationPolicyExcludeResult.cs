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
    public sealed class GetZeroTrustAccessApplicationPolicyExcludeResult
    {
        /// <summary>
        /// An empty object which matches on all service tokens.
        /// </summary>
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeAnyValidServiceTokenResult AnyValidServiceToken;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeAuthContextResult AuthContext;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeAuthMethodResult AuthMethod;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeAzureAdResult AzureAd;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeCertificateResult Certificate;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeCommonNameResult CommonName;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeDevicePostureResult DevicePosture;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeEmailResult Email;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeEmailDomainResult EmailDomain;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeEmailListResult EmailList;
        /// <summary>
        /// An empty object which matches on all users.
        /// </summary>
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeEveryoneResult Everyone;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeExternalEvaluationResult ExternalEvaluation;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeGeoResult Geo;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeGithubOrganizationResult GithubOrganization;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeGroupResult Group;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeGsuiteResult Gsuite;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeIpResult Ip;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeIpListResult IpList;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeLoginMethodResult LoginMethod;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeOktaResult Okta;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeSamlResult Saml;
        public readonly Outputs.GetZeroTrustAccessApplicationPolicyExcludeServiceTokenResult ServiceToken;

        [OutputConstructor]
        private GetZeroTrustAccessApplicationPolicyExcludeResult(
            Outputs.GetZeroTrustAccessApplicationPolicyExcludeAnyValidServiceTokenResult anyValidServiceToken,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeAuthContextResult authContext,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeAuthMethodResult authMethod,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeAzureAdResult azureAd,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeCertificateResult certificate,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeCommonNameResult commonName,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeDevicePostureResult devicePosture,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeEmailResult email,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeEmailDomainResult emailDomain,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeEmailListResult emailList,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeEveryoneResult everyone,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeExternalEvaluationResult externalEvaluation,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeGeoResult geo,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeGithubOrganizationResult githubOrganization,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeGroupResult group,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeGsuiteResult gsuite,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeIpResult ip,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeIpListResult ipList,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeLoginMethodResult loginMethod,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeOktaResult okta,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeSamlResult saml,

            Outputs.GetZeroTrustAccessApplicationPolicyExcludeServiceTokenResult serviceToken)
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
