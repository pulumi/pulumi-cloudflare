// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class NotificationPolicyFiltersGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enableds")]
        private InputList<string>? _enableds;

        /// <summary>
        /// State of the pool to alert on.
        /// </summary>
        public InputList<string> Enableds
        {
            get => _enableds ?? (_enableds = new InputList<string>());
            set => _enableds = value;
        }

        [Input("eventSources")]
        private InputList<string>? _eventSources;

        /// <summary>
        /// Source configuration to alert on for pool or origin.
        /// </summary>
        public InputList<string> EventSources
        {
            get => _eventSources ?? (_eventSources = new InputList<string>());
            set => _eventSources = value;
        }

        [Input("eventTypes")]
        private InputList<string>? _eventTypes;

        /// <summary>
        /// Stream event type to alert on.
        /// </summary>
        public InputList<string> EventTypes
        {
            get => _eventTypes ?? (_eventTypes = new InputList<string>());
            set => _eventTypes = value;
        }

        [Input("healthCheckIds")]
        private InputList<string>? _healthCheckIds;

        /// <summary>
        /// Identifier health check.
        /// </summary>
        public InputList<string> HealthCheckIds
        {
            get => _healthCheckIds ?? (_healthCheckIds = new InputList<string>());
            set => _healthCheckIds = value;
        }

        [Input("inputIds")]
        private InputList<string>? _inputIds;

        /// <summary>
        /// Stream input id to alert on.
        /// </summary>
        public InputList<string> InputIds
        {
            get => _inputIds ?? (_inputIds = new InputList<string>());
            set => _inputIds = value;
        }

        [Input("limits")]
        private InputList<string>? _limits;

        /// <summary>
        /// A numerical limit. Example: `100`.
        /// </summary>
        public InputList<string> Limits
        {
            get => _limits ?? (_limits = new InputList<string>());
            set => _limits = value;
        }

        [Input("newHealths")]
        private InputList<string>? _newHealths;

        /// <summary>
        /// Health status to alert on for pool or origin.
        /// </summary>
        public InputList<string> NewHealths
        {
            get => _newHealths ?? (_newHealths = new InputList<string>());
            set => _newHealths = value;
        }

        [Input("packetsPerSeconds")]
        private InputList<string>? _packetsPerSeconds;

        /// <summary>
        /// Packets per second threshold for dos alert.
        /// </summary>
        public InputList<string> PacketsPerSeconds
        {
            get => _packetsPerSeconds ?? (_packetsPerSeconds = new InputList<string>());
            set => _packetsPerSeconds = value;
        }

        [Input("poolIds")]
        private InputList<string>? _poolIds;

        /// <summary>
        /// Load balancer pool identifier.
        /// </summary>
        public InputList<string> PoolIds
        {
            get => _poolIds ?? (_poolIds = new InputList<string>());
            set => _poolIds = value;
        }

        [Input("products")]
        private InputList<string>? _products;

        /// <summary>
        /// Product name. Available values: `worker_requests`, `worker_durable_objects_requests`, `worker_durable_objects_duration`, `worker_durable_objects_data_transfer`, `worker_durable_objects_stored_data`, `worker_durable_objects_storage_deletes`, `worker_durable_objects_storage_writes`, `worker_durable_objects_storage_reads`.
        /// </summary>
        public InputList<string> Products
        {
            get => _products ?? (_products = new InputList<string>());
            set => _products = value;
        }

        [Input("protocols")]
        private InputList<string>? _protocols;

        /// <summary>
        /// Protocol to alert on for dos.
        /// </summary>
        public InputList<string> Protocols
        {
            get => _protocols ?? (_protocols = new InputList<string>());
            set => _protocols = value;
        }

        [Input("requestsPerSeconds")]
        private InputList<string>? _requestsPerSeconds;

        /// <summary>
        /// Requests per second threshold for dos alert.
        /// </summary>
        public InputList<string> RequestsPerSeconds
        {
            get => _requestsPerSeconds ?? (_requestsPerSeconds = new InputList<string>());
            set => _requestsPerSeconds = value;
        }

        [Input("services")]
        private InputList<string>? _services;

        /// <summary>
        /// A list of clickhouse services to alert on.
        /// </summary>
        public InputList<string> Services
        {
            get => _services ?? (_services = new InputList<string>());
            set => _services = value;
        }

        [Input("slos")]
        private InputList<string>? _slos;

        /// <summary>
        /// A numerical limit. Example: `99.9`.
        /// </summary>
        public InputList<string> Slos
        {
            get => _slos ?? (_slos = new InputList<string>());
            set => _slos = value;
        }

        [Input("statuses")]
        private InputList<string>? _statuses;

        /// <summary>
        /// Status to alert on.
        /// </summary>
        public InputList<string> Statuses
        {
            get => _statuses ?? (_statuses = new InputList<string>());
            set => _statuses = value;
        }

        [Input("targetHosts")]
        private InputList<string>? _targetHosts;

        /// <summary>
        /// Target host to alert on for dos.
        /// </summary>
        public InputList<string> TargetHosts
        {
            get => _targetHosts ?? (_targetHosts = new InputList<string>());
            set => _targetHosts = value;
        }

        [Input("targetZoneNames")]
        private InputList<string>? _targetZoneNames;

        /// <summary>
        /// Target domain to alert on.
        /// </summary>
        public InputList<string> TargetZoneNames
        {
            get => _targetZoneNames ?? (_targetZoneNames = new InputList<string>());
            set => _targetZoneNames = value;
        }

        [Input("zones")]
        private InputList<string>? _zones;

        /// <summary>
        /// A list of zone identifiers.
        /// </summary>
        public InputList<string> Zones
        {
            get => _zones ?? (_zones = new InputList<string>());
            set => _zones = value;
        }

        public NotificationPolicyFiltersGetArgs()
        {
        }
        public static new NotificationPolicyFiltersGetArgs Empty => new NotificationPolicyFiltersGetArgs();
    }
}