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
    public sealed class DlpCustomProfileEntry
    {
        public readonly bool Enabled;
        public readonly string Name;
        public readonly Outputs.DlpCustomProfileEntryPattern? Pattern;
        public readonly ImmutableArray<string> Words;

        [OutputConstructor]
        private DlpCustomProfileEntry(
            bool enabled,

            string name,

            Outputs.DlpCustomProfileEntryPattern? pattern,

            ImmutableArray<string> words)
        {
            Enabled = enabled;
            Name = name;
            Pattern = pattern;
            Words = words;
        }
    }
}
