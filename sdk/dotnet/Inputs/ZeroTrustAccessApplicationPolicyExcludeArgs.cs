// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustAccessApplicationPolicyExcludeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An empty object which matches on all service tokens.
        /// </summary>
        [Input("anyValidServiceToken")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeAnyValidServiceTokenArgs>? AnyValidServiceToken { get; set; }

        [Input("authContext")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeAuthContextArgs>? AuthContext { get; set; }

        [Input("authMethod")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeAuthMethodArgs>? AuthMethod { get; set; }

        [Input("azureAd")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeAzureAdArgs>? AzureAd { get; set; }

        [Input("certificate")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeCertificateArgs>? Certificate { get; set; }

        [Input("commonName")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeCommonNameArgs>? CommonName { get; set; }

        [Input("devicePosture")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeDevicePostureArgs>? DevicePosture { get; set; }

        [Input("email")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeEmailArgs>? Email { get; set; }

        [Input("emailDomain")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeEmailDomainArgs>? EmailDomain { get; set; }

        [Input("emailList")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeEmailListArgs>? EmailList { get; set; }

        /// <summary>
        /// An empty object which matches on all users.
        /// </summary>
        [Input("everyone")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeEveryoneArgs>? Everyone { get; set; }

        [Input("externalEvaluation")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeExternalEvaluationArgs>? ExternalEvaluation { get; set; }

        [Input("geo")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeGeoArgs>? Geo { get; set; }

        [Input("githubOrganization")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeGithubOrganizationArgs>? GithubOrganization { get; set; }

        [Input("group")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeGroupArgs>? Group { get; set; }

        [Input("gsuite")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeGsuiteArgs>? Gsuite { get; set; }

        [Input("ip")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeIpArgs>? Ip { get; set; }

        [Input("ipList")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeIpListArgs>? IpList { get; set; }

        [Input("loginMethod")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeLoginMethodArgs>? LoginMethod { get; set; }

        [Input("okta")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeOktaArgs>? Okta { get; set; }

        [Input("saml")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeSamlArgs>? Saml { get; set; }

        [Input("serviceToken")]
        public Input<Inputs.ZeroTrustAccessApplicationPolicyExcludeServiceTokenArgs>? ServiceToken { get; set; }

        public ZeroTrustAccessApplicationPolicyExcludeArgs()
        {
        }
        public static new ZeroTrustAccessApplicationPolicyExcludeArgs Empty => new ZeroTrustAccessApplicationPolicyExcludeArgs();
    }
}
