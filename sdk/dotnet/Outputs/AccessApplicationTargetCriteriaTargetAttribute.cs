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
    public sealed class AccessApplicationTargetCriteriaTargetAttribute
    {
        /// <summary>
        /// The key of the attribute.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The values of the attribute.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private AccessApplicationTargetCriteriaTargetAttribute(
            string name,

            ImmutableArray<string> values)
        {
            Name = name;
            Values = values;
        }
    }
}
