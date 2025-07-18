// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class R2BucketLockRuleConditionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("date")]
        public Input<string>? Date { get; set; }

        [Input("maxAgeSeconds")]
        public Input<int>? MaxAgeSeconds { get; set; }

        /// <summary>
        /// Available values: "Age", "Date", "Indefinite".
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public R2BucketLockRuleConditionGetArgs()
        {
        }
        public static new R2BucketLockRuleConditionGetArgs Empty => new R2BucketLockRuleConditionGetArgs();
    }
}
