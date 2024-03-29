// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class PagesProjectDeploymentConfigsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration for preview deploys.
        /// </summary>
        [Input("preview")]
        public Input<Inputs.PagesProjectDeploymentConfigsPreviewGetArgs>? Preview { get; set; }

        /// <summary>
        /// Configuration for production deploys.
        /// </summary>
        [Input("production")]
        public Input<Inputs.PagesProjectDeploymentConfigsProductionGetArgs>? Production { get; set; }

        public PagesProjectDeploymentConfigsGetArgs()
        {
        }
        public static new PagesProjectDeploymentConfigsGetArgs Empty => new PagesProjectDeploymentConfigsGetArgs();
    }
}
