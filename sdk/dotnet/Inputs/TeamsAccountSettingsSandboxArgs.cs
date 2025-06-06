// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class TeamsAccountSettingsSandboxArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable sandbox.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Action to take when the file cannot be scanned.
        /// Available values: "allow", "block".
        /// </summary>
        [Input("fallbackAction")]
        public Input<string>? FallbackAction { get; set; }

        public TeamsAccountSettingsSandboxArgs()
        {
        }
        public static new TeamsAccountSettingsSandboxArgs Empty => new TeamsAccountSettingsSandboxArgs();
    }
}
