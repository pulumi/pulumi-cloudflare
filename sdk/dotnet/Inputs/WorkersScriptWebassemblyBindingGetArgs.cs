// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class WorkersScriptWebassemblyBindingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The base64 encoded wasm module you want to store.
        /// </summary>
        [Input("module", required: true)]
        public Input<string> Module { get; set; } = null!;

        /// <summary>
        /// The global variable for the binding in your Worker code.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public WorkersScriptWebassemblyBindingGetArgs()
        {
        }
        public static new WorkersScriptWebassemblyBindingGetArgs Empty => new WorkersScriptWebassemblyBindingGetArgs();
    }
}
