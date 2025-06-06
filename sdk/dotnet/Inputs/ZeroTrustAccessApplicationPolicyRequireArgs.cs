// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustAccessApplicationPolicyRequireArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An empty object which matches on all service tokens.
        /// </summary>
        [Input("anyValidServiceToken")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireAnyValidServiceTokenArgs>? AnyValidServiceToken { get; set; }

        [Input("authContext")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireAuthContextArgs>? AuthContext { get; set; }

        [Input("authMethod")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireAuthMethodArgs>? AuthMethod { get; set; }

        [Input("azureAd")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireAzureAdArgs>? AzureAd { get; set; }

        [Input("certificate")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireCertificateArgs>? Certificate { get; set; }

        [Input("commonName")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireCommonNameArgs>? CommonName { get; set; }

        [Input("devicePosture")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireDevicePostureArgs>? DevicePosture { get; set; }

        [Input("email")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireEmailArgs>? Email { get; set; }

        [Input("emailDomain")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireEmailDomainArgs>? EmailDomain { get; set; }

        [Input("emailList")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireEmailListArgs>? EmailList { get; set; }

        /// <summary>
        /// An empty object which matches on all users.
        /// </summary>
        [Input("everyone")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireEveryoneArgs>? Everyone { get; set; }

        [Input("externalEvaluation")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireExternalEvaluationArgs>? ExternalEvaluation { get; set; }

        [Input("geo")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireGeoArgs>? Geo { get; set; }

        [Input("githubOrganization")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireGithubOrganizationArgs>? GithubOrganization { get; set; }

        [Input("group")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireGroupArgs>? Group { get; set; }

        [Input("gsuite")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireGsuiteArgs>? Gsuite { get; set; }

        [Input("ip")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireIpArgs>? Ip { get; set; }

        [Input("ipList")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireIpListArgs>? IpList { get; set; }

        [Input("loginMethod")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireLoginMethodArgs>? LoginMethod { get; set; }

        [Input("okta")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireOktaArgs>? Okta { get; set; }

        [Input("saml")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireSamlArgs>? Saml { get; set; }

        [Input("serviceToken")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyRequireServiceTokenArgs>? ServiceToken { get; set; }

        public ZeroTrustAccessApplicationPolicyRequireArgs()
        {
        }
        public static new ZeroTrustAccessApplicationPolicyRequireArgs Empty => new ZeroTrustAccessApplicationPolicyRequireArgs();
    }
}
