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
    public sealed class SnippetFile
    {
        /// <summary>
        /// Content of the snippet file.
        /// </summary>
        public readonly string? Content;
        /// <summary>
        /// Name of the snippet file.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private SnippetFile(
            string? content,

            string name)
        {
            Content = content;
            Name = name;
        }
    }
}