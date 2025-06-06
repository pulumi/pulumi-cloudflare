// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustAccessApplicationPolicyRequireGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An empty object which matches on all service tokens.
        /// </summary>
        [Input("anyValidServiceToken")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireAnyValidServiceTokenGetArgs>? AnyValidServiceToken { get; set; }

        [Input("authContext")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireAuthContextGetArgs>? AuthContext { get; set; }

        [Input("authMethod")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireAuthMethodGetArgs>? AuthMethod { get; set; }

        [Input("azureAd")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireAzureAdGetArgs>? AzureAd { get; set; }

        [Input("certificate")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireCertificateGetArgs>? Certificate { get; set; }

        [Input("commonName")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireCommonNameGetArgs>? CommonName { get; set; }

        [Input("devicePosture")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireDevicePostureGetArgs>? DevicePosture { get; set; }

        [Input("email")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireEmailGetArgs>? Email { get; set; }

        [Input("emailDomain")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireEmailDomainGetArgs>? EmailDomain { get; set; }

        [Input("emailList")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireEmailListGetArgs>? EmailList { get; set; }

        /// <summary>
        /// An empty object which matches on all users.
        /// </summary>
        [Input("everyone")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireEveryoneGetArgs>? Everyone { get; set; }

        [Input("externalEvaluation")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireExternalEvaluationGetArgs>? ExternalEvaluation { get; set; }

        [Input("geo")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireGeoGetArgs>? Geo { get; set; }

        [Input("githubOrganization")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireGithubOrganizationGetArgs>? GithubOrganization { get; set; }

        [Input("group")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireGroupGetArgs>? Group { get; set; }

        [Input("gsuite")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireGsuiteGetArgs>? Gsuite { get; set; }

        [Input("ip")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireIpGetArgs>? Ip { get; set; }

        [Input("ipList")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireIpListGetArgs>? IpList { get; set; }

        [Input("loginMethod")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireLoginMethodGetArgs>? LoginMethod { get; set; }

        [Input("okta")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireOktaGetArgs>? Okta { get; set; }

        [Input("saml")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireSamlGetArgs>? Saml { get; set; }

        [Input("serviceToken")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireServiceTokenGetArgs>? ServiceToken { get; set; }

        public ZeroTrustAccessApplicationPolicyRequireGetArgs()
        {
        }
        public static new ZeroTrustAccessApplicationPolicyRequireGetArgs Empty => new ZeroTrustAccessApplicationPolicyRequireGetArgs();
    }
}
