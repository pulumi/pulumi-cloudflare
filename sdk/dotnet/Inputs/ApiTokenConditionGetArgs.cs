// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ApiTokenConditionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Client IP restrictions.
        /// </summary>
        [Input("requestIp")]
        public Input<Inputs.ApiTokenConditionRequestIpGetArgs>? RequestIp { get; set; }

        public ApiTokenConditionGetArgs()
        {
        }
        public static new ApiTokenConditionGetArgs Empty => new ApiTokenConditionGetArgs();
    }
}
