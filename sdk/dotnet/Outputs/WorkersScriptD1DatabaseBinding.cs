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
    public sealed class WorkersScriptD1DatabaseBinding
    {
        /// <summary>
        /// Database ID of D1 database to use.
        /// </summary>
        public readonly string DatabaseId;
        /// <summary>
        /// The global variable for the binding in your Worker code.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private WorkersScriptD1DatabaseBinding(
            string databaseId,

            string name)
        {
            DatabaseId = databaseId;
            Name = name;
        }
    }
}
