// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class PageRuleActionsCacheKeyFieldsUserArgs : global::Pulumi.ResourceArgs
    {
        [Input("deviceType")]
        public Input<bool>? DeviceType { get; set; }

        [Input("geo")]
        public Input<bool>? Geo { get; set; }

        [Input("lang")]
        public Input<bool>? Lang { get; set; }

        public PageRuleActionsCacheKeyFieldsUserArgs()
        {
        }
        public static new PageRuleActionsCacheKeyFieldsUserArgs Empty => new PageRuleActionsCacheKeyFieldsUserArgs();
    }
}
