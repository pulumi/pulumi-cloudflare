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
    public sealed class WorkerScriptAssets
    {
        /// <summary>
        /// Configuration for assets within a Worker.
        /// </summary>
        public readonly Outputs.WorkerScriptAssetsConfig? Config;
        /// <summary>
        /// Token provided upon successful upload of all files from a registered manifest.
        /// </summary>
        public readonly string? Jwt;

        [OutputConstructor]
        private WorkerScriptAssets(
            Outputs.WorkerScriptAssetsConfig? config,

            string? jwt)
        {
            Config = config;
            Jwt = jwt;
        }
    }
}
