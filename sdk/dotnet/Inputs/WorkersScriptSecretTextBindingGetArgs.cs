// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class WorkersScriptSecretTextBindingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The global variable for the binding in your Worker code.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("text", required: true)]
        private Input<string>? _text;

        /// <summary>
        /// The secret text you want to store.
        /// </summary>
        public Input<string>? Text
        {
            get => _text;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _text = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public WorkersScriptSecretTextBindingGetArgs()
        {
        }
        public static new WorkersScriptSecretTextBindingGetArgs Empty => new WorkersScriptSecretTextBindingGetArgs();
    }
}