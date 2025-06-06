// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustDlpCustomProfileEntryArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("pattern")]
        public Input<Inputs.ZeroTrustDlpCustomProfileEntryPatternArgs>? Pattern { get; set; }

        [Input("words")]
        private InputList<string>? _words;
        public InputList<string> Words
        {
            get => _words ?? (_words = new InputList<string>());
            set => _words = value;
        }

        public ZeroTrustDlpCustomProfileEntryArgs()
        {
        }
        public static new ZeroTrustDlpCustomProfileEntryArgs Empty => new ZeroTrustDlpCustomProfileEntryArgs();
    }
}
