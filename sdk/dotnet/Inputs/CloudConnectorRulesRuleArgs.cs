// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class CloudConnectorRulesRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("expression")]
        public Input<string>? Expression { get; set; }

        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Parameters of Cloud Connector Rule
        /// </summary>
        [Input("parameters")]
        public Input<Inputs.CloudConnectorRulesRuleParametersArgs>? Parameters { get; set; }

        /// <summary>
        /// Cloud Provider type
        /// Available values: "aws*s3", "cloudflare*r2", "gcp*storage", "azure*storage".
        /// </summary>
        [Input("provider")]
        public Input<string>? Provider { get; set; }

        public CloudConnectorRulesRuleArgs()
        {
        }
        public static new CloudConnectorRulesRuleArgs Empty => new CloudConnectorRulesRuleArgs();
    }
}
