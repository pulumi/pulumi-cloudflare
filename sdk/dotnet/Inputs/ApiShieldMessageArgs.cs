// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ApiShieldMessageArgs : global::Pulumi.ResourceArgs
    {
        [Input("code")]
        public Input<int>? Code { get; set; }

        [Input("documentationUrl")]
        public Input<string>? DocumentationUrl { get; set; }

        [Input("message")]
        public Input<string>? Message { get; set; }

        [Input("source")]
        public Input<Inputs.ApiShieldMessageSourceArgs>? Source { get; set; }

        public ApiShieldMessageArgs()
        {
        }
        public static new ApiShieldMessageArgs Empty => new ApiShieldMessageArgs();
    }
}
