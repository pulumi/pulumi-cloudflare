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
    public sealed class WorkerScriptBinding
    {
        /// <summary>
        /// R2 bucket to bind to.
        /// </summary>
        public readonly string? BucketName;
        /// <summary>
        /// Identifier of the certificate to bind to.
        /// </summary>
        public readonly string? CertificateId;
        /// <summary>
        /// The exported class name of the Durable Object.
        /// </summary>
        public readonly string? ClassName;
        /// <summary>
        /// The name of the dataset to bind to.
        /// </summary>
        public readonly string? Dataset;
        /// <summary>
        /// The environment of the script_name to bind to.
        /// </summary>
        public readonly string? Environment;
        /// <summary>
        /// Identifier of the D1 database to bind to.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Name of the Vectorize index to bind to.
        /// </summary>
        public readonly string? IndexName;
        /// <summary>
        /// JSON data to use.
        /// </summary>
        public readonly string? Json;
        /// <summary>
        /// A JavaScript variable name for the binding.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Namespace to bind to.
        /// </summary>
        public readonly string? Namespace;
        /// <summary>
        /// Namespace identifier tag.
        /// </summary>
        public readonly string? NamespaceId;
        /// <summary>
        /// Outbound worker.
        /// </summary>
        public readonly Outputs.WorkerScriptBindingOutbound? Outbound;
        /// <summary>
        /// Name of the Queue to bind to.
        /// </summary>
        public readonly string? QueueName;
        /// <summary>
        /// The script where the Durable Object is defined, if it is external to this Worker.
        /// </summary>
        public readonly string? ScriptName;
        /// <summary>
        /// Name of Worker to bind to.
        /// </summary>
        public readonly string? Service;
        /// <summary>
        /// The text value to use.
        /// </summary>
        public readonly string? Text;
        /// <summary>
        /// The kind of resource that the binding provides.
        /// Available values: "ai", "analytics*engine", "assets", "browser*rendering", "d1", "dispatch*namespace", "durable*object*namespace", "hyperdrive", "json", "kv*namespace", "mtls*certificate", "plain*text", "queue", "r2*bucket", "secret*text", "service", "tail*consumer", "vectorize", "version*metadata".
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private WorkerScriptBinding(
            string? bucketName,

            string? certificateId,

            string? className,

            string? dataset,

            string? environment,

            string? id,

            string? indexName,

            string? json,

            string name,

            string? @namespace,

            string? namespaceId,

            Outputs.WorkerScriptBindingOutbound? outbound,

            string? queueName,

            string? scriptName,

            string? service,

            string? text,

            string type)
        {
            BucketName = bucketName;
            CertificateId = certificateId;
            ClassName = className;
            Dataset = dataset;
            Environment = environment;
            Id = id;
            IndexName = indexName;
            Json = json;
            Name = name;
            Namespace = @namespace;
            NamespaceId = namespaceId;
            Outbound = outbound;
            QueueName = queueName;
            ScriptName = scriptName;
            Service = service;
            Text = text;
            Type = type;
        }
    }
}
