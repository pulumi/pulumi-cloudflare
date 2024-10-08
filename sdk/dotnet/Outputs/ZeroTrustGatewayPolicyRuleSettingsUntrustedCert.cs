// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class ZeroTrustGatewayPolicyRuleSettingsUntrustedCert
    {
        /// <summary>
        /// Action to be taken when the SSL certificate of upstream is invalid. Available values: `pass_through`, `block`, `error`.
        /// </summary>
        public readonly string? Action;

        [OutputConstructor]
        private ZeroTrustGatewayPolicyRuleSettingsUntrustedCert(string? action)
        {
            Action = action;
        }
    }
}
