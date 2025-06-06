// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustAccessPolicyRequireArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An empty object which matches on all service tokens.
        /// </summary>
        [Input("anyValidServiceToken")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireAnyValidServiceTokenArgs>? AnyValidServiceToken { get; set; }

        [Input("authContext")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireAuthContextArgs>? AuthContext { get; set; }

        [Input("authMethod")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireAuthMethodArgs>? AuthMethod { get; set; }

        [Input("azureAd")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireAzureAdArgs>? AzureAd { get; set; }

        [Input("certificate")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireCertificateArgs>? Certificate { get; set; }

        [Input("commonName")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireCommonNameArgs>? CommonName { get; set; }

        [Input("devicePosture")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireDevicePostureArgs>? DevicePosture { get; set; }

        [Input("email")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireEmailArgs>? Email { get; set; }

        [Input("emailDomain")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireEmailDomainArgs>? EmailDomain { get; set; }

        [Input("emailList")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireEmailListArgs>? EmailList { get; set; }

        /// <summary>
        /// An empty object which matches on all users.
        /// </summary>
        [Input("everyone")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireEveryoneArgs>? Everyone { get; set; }

        [Input("externalEvaluation")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireExternalEvaluationArgs>? ExternalEvaluation { get; set; }

        [Input("geo")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireGeoArgs>? Geo { get; set; }

        [Input("githubOrganization")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireGithubOrganizationArgs>? GithubOrganization { get; set; }

        [Input("group")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireGroupArgs>? Group { get; set; }

        [Input("gsuite")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireGsuiteArgs>? Gsuite { get; set; }

        [Input("ip")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireIpArgs>? Ip { get; set; }

        [Input("ipList")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireIpListArgs>? IpList { get; set; }

        [Input("loginMethod")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireLoginMethodArgs>? LoginMethod { get; set; }

        [Input("okta")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireOktaArgs>? Okta { get; set; }

        [Input("saml")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireSamlArgs>? Saml { get; set; }

        [Input("serviceToken")]
        public Input<Inputs.ZeroTrustAccessPolicyRequireServiceTokenArgs>? ServiceToken { get; set; }

        public ZeroTrustAccessPolicyRequireArgs()
        {
        }
        public static new ZeroTrustAccessPolicyRequireArgs Empty => new ZeroTrustAccessPolicyRequireArgs();
    }
}
