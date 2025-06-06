// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessPolicyRequireArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An empty object which matches on all service tokens.
        /// </summary>
        [Input("anyValidServiceToken")]
        public Input<Inputs.AccessPolicyRequireAnyValidServiceTokenArgs>? AnyValidServiceToken { get; set; }

        [Input("authContext")]
        public Input<Inputs.AccessPolicyRequireAuthContextArgs>? AuthContext { get; set; }

        [Input("authMethod")]
        public Input<Inputs.AccessPolicyRequireAuthMethodArgs>? AuthMethod { get; set; }

        [Input("azureAd")]
        public Input<Inputs.AccessPolicyRequireAzureAdArgs>? AzureAd { get; set; }

        [Input("certificate")]
        public Input<Inputs.AccessPolicyRequireCertificateArgs>? Certificate { get; set; }

        [Input("commonName")]
        public Input<Inputs.AccessPolicyRequireCommonNameArgs>? CommonName { get; set; }

        [Input("devicePosture")]
        public Input<Inputs.AccessPolicyRequireDevicePostureArgs>? DevicePosture { get; set; }

        [Input("email")]
        public Input<Inputs.AccessPolicyRequireEmailArgs>? Email { get; set; }

        [Input("emailDomain")]
        public Input<Inputs.AccessPolicyRequireEmailDomainArgs>? EmailDomain { get; set; }

        [Input("emailList")]
        public Input<Inputs.AccessPolicyRequireEmailListArgs>? EmailList { get; set; }

        /// <summary>
        /// An empty object which matches on all users.
        /// </summary>
        [Input("everyone")]
        public Input<Inputs.AccessPolicyRequireEveryoneArgs>? Everyone { get; set; }

        [Input("externalEvaluation")]
        public Input<Inputs.AccessPolicyRequireExternalEvaluationArgs>? ExternalEvaluation { get; set; }

        [Input("geo")]
        public Input<Inputs.AccessPolicyRequireGeoArgs>? Geo { get; set; }

        [Input("githubOrganization")]
        public Input<Inputs.AccessPolicyRequireGithubOrganizationArgs>? GithubOrganization { get; set; }

        [Input("group")]
        public Input<Inputs.AccessPolicyRequireGroupArgs>? Group { get; set; }

        [Input("gsuite")]
        public Input<Inputs.AccessPolicyRequireGsuiteArgs>? Gsuite { get; set; }

        [Input("ip")]
        public Input<Inputs.AccessPolicyRequireIpArgs>? Ip { get; set; }

        [Input("ipList")]
        public Input<Inputs.AccessPolicyRequireIpListArgs>? IpList { get; set; }

        [Input("loginMethod")]
        public Input<Inputs.AccessPolicyRequireLoginMethodArgs>? LoginMethod { get; set; }

        [Input("okta")]
        public Input<Inputs.AccessPolicyRequireOktaArgs>? Okta { get; set; }

        [Input("saml")]
        public Input<Inputs.AccessPolicyRequireSamlArgs>? Saml { get; set; }

        [Input("serviceToken")]
        public Input<Inputs.AccessPolicyRequireServiceTokenArgs>? ServiceToken { get; set; }

        public AccessPolicyRequireArgs()
        {
        }
        public static new AccessPolicyRequireArgs Empty => new AccessPolicyRequireArgs();
    }
}
