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
    public sealed class WorkersScriptQueueBinding
    {
        /// <summary>
        /// The name of the global variable for the binding in your Worker code.
        /// </summary>
        public readonly string Binding;
        /// <summary>
        /// Name of the queue you want to use.
        /// </summary>
        public readonly string Queue;

        [OutputConstructor]
        private WorkersScriptQueueBinding(
            string binding,

            string queue)
        {
            Binding = binding;
            Queue = queue;
        }
    }
}
