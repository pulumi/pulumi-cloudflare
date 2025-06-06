// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class TeamsRuleRuleSettingsQuarantine
    {
        /// <summary>
        /// Types of files to sandbox.
        /// </summary>
        public readonly ImmutableArray<string> FileTypes;

        [OutputConstructor]
        private TeamsRuleRuleSettingsQuarantine(ImmutableArray<string> fileTypes)
        {
            FileTypes = fileTypes;
        }
    }
}
