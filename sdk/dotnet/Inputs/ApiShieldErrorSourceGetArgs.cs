// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ApiShieldErrorSourceGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("pointer")]
        public Input<string>? Pointer { get; set; }

        public ApiShieldErrorSourceGetArgs()
        {
        }
        public static new ApiShieldErrorSourceGetArgs Empty => new ApiShieldErrorSourceGetArgs();
    }
}
