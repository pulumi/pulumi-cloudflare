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
    public sealed class GetNotificationPolicyFiltersResult
    {
        /// <summary>
        /// Usage depends on specific alert type
        /// </summary>
        public readonly ImmutableArray<string> Actions;
        /// <summary>
        /// Used for configuring radar_notification
        /// </summary>
        public readonly ImmutableArray<string> AffectedAsns;
        /// <summary>
        /// Used for configuring incident_alert
        /// </summary>
        public readonly ImmutableArray<string> AffectedComponents;
        /// <summary>
        /// Used for configuring radar_notification
        /// </summary>
        public readonly ImmutableArray<string> AffectedLocations;
        /// <summary>
        /// Used for configuring maintenance*event*notification
        /// </summary>
        public readonly ImmutableArray<string> AirportCodes;
        /// <summary>
        /// Usage depends on specific alert type
        /// </summary>
        public readonly ImmutableArray<string> AlertTriggerPreferences;
        /// <summary>
        /// Usage depends on specific alert type
        /// </summary>
        public readonly ImmutableArray<string> AlertTriggerPreferencesValues;
        /// <summary>
        /// Used for configuring load*balancing*pool*enablement*alert
        /// </summary>
        public readonly ImmutableArray<string> Enableds;
        /// <summary>
        /// Used for configuring pages*event*alert
        /// </summary>
        public readonly ImmutableArray<string> Environments;
        /// <summary>
        /// Used for configuring load*balancing*health_alert
        /// </summary>
        public readonly ImmutableArray<string> EventSources;
        /// <summary>
        /// Usage depends on specific alert type
        /// </summary>
        public readonly ImmutableArray<string> EventTypes;
        /// <summary>
        /// Used for configuring pages*event*alert
        /// </summary>
        public readonly ImmutableArray<string> Events;
        /// <summary>
        /// Usage depends on specific alert type
        /// </summary>
        public readonly ImmutableArray<string> GroupBies;
        /// <summary>
        /// Used for configuring health*check*status_notification
        /// </summary>
        public readonly ImmutableArray<string> HealthCheckIds;
        /// <summary>
        /// Used for configuring incident_alert
        /// </summary>
        public readonly ImmutableArray<string> IncidentImpacts;
        /// <summary>
        /// Used for configuring stream*live*notifications
        /// </summary>
        public readonly ImmutableArray<string> InputIds;
        /// <summary>
        /// Used for configuring security*insights*alert
        /// </summary>
        public readonly ImmutableArray<string> InsightClasses;
        /// <summary>
        /// Used for configuring billing*usage*alert
        /// </summary>
        public readonly ImmutableArray<string> Limits;
        /// <summary>
        /// Used for configuring logo*match*alert
        /// </summary>
        public readonly ImmutableArray<string> LogoTags;
        /// <summary>
        /// Used for configuring advanced*ddos*attack*l4*alert
        /// </summary>
        public readonly ImmutableArray<string> MegabitsPerSeconds;
        /// <summary>
        /// Used for configuring load*balancing*health_alert
        /// </summary>
        public readonly ImmutableArray<string> NewHealths;
        /// <summary>
        /// Used for configuring tunnel*health*event
        /// </summary>
        public readonly ImmutableArray<string> NewStatuses;
        /// <summary>
        /// Used for configuring advanced*ddos*attack*l4*alert
        /// </summary>
        public readonly ImmutableArray<string> PacketsPerSeconds;
        /// <summary>
        /// Usage depends on specific alert type
        /// </summary>
        public readonly ImmutableArray<string> PoolIds;
        /// <summary>
        /// Usage depends on specific alert type
        /// </summary>
        public readonly ImmutableArray<string> PopNames;
        /// <summary>
        /// Used for configuring billing*usage*alert
        /// </summary>
        public readonly ImmutableArray<string> Products;
        /// <summary>
        /// Used for configuring pages*event*alert
        /// </summary>
        public readonly ImmutableArray<string> ProjectIds;
        /// <summary>
        /// Used for configuring advanced*ddos*attack*l4*alert
        /// </summary>
        public readonly ImmutableArray<string> Protocols;
        /// <summary>
        /// Usage depends on specific alert type
        /// </summary>
        public readonly ImmutableArray<string> QueryTags;
        /// <summary>
        /// Used for configuring advanced*ddos*attack*l7*alert
        /// </summary>
        public readonly ImmutableArray<string> RequestsPerSeconds;
        /// <summary>
        /// Usage depends on specific alert type
        /// </summary>
        public readonly ImmutableArray<string> Selectors;
        /// <summary>
        /// Used for configuring clickhouse*alert*fw*ent*anomaly
        /// </summary>
        public readonly ImmutableArray<string> Services;
        /// <summary>
        /// Usage depends on specific alert type
        /// </summary>
        public readonly ImmutableArray<string> Slos;
        /// <summary>
        /// Used for configuring health*check*status_notification
        /// </summary>
        public readonly ImmutableArray<string> Statuses;
        /// <summary>
        /// Used for configuring advanced*ddos*attack*l7*alert
        /// </summary>
        public readonly ImmutableArray<string> TargetHostnames;
        /// <summary>
        /// Used for configuring advanced*ddos*attack*l4*alert
        /// </summary>
        public readonly ImmutableArray<string> TargetIps;
        /// <summary>
        /// Used for configuring advanced*ddos*attack*l7*alert
        /// </summary>
        public readonly ImmutableArray<string> TargetZoneNames;
        /// <summary>
        /// Used for configuring traffic*anomalies*alert
        /// </summary>
        public readonly ImmutableArray<string> TrafficExclusions;
        /// <summary>
        /// Used for configuring tunnel*health*event
        /// </summary>
        public readonly ImmutableArray<string> TunnelIds;
        /// <summary>
        /// Usage depends on specific alert type
        /// </summary>
        public readonly ImmutableArray<string> TunnelNames;
        /// <summary>
        /// Usage depends on specific alert type
        /// </summary>
        public readonly ImmutableArray<string> Wheres;
        /// <summary>
        /// Usage depends on specific alert type
        /// </summary>
        public readonly ImmutableArray<string> Zones;

        [OutputConstructor]
        private GetNotificationPolicyFiltersResult(
            ImmutableArray<string> actions,

            ImmutableArray<string> affectedAsns,

            ImmutableArray<string> affectedComponents,

            ImmutableArray<string> affectedLocations,

            ImmutableArray<string> airportCodes,

            ImmutableArray<string> alertTriggerPreferences,

            ImmutableArray<string> alertTriggerPreferencesValues,

            ImmutableArray<string> enableds,

            ImmutableArray<string> environments,

            ImmutableArray<string> eventSources,

            ImmutableArray<string> eventTypes,

            ImmutableArray<string> events,

            ImmutableArray<string> groupBies,

            ImmutableArray<string> healthCheckIds,

            ImmutableArray<string> incidentImpacts,

            ImmutableArray<string> inputIds,

            ImmutableArray<string> insightClasses,

            ImmutableArray<string> limits,

            ImmutableArray<string> logoTags,

            ImmutableArray<string> megabitsPerSeconds,

            ImmutableArray<string> newHealths,

            ImmutableArray<string> newStatuses,

            ImmutableArray<string> packetsPerSeconds,

            ImmutableArray<string> poolIds,

            ImmutableArray<string> popNames,

            ImmutableArray<string> products,

            ImmutableArray<string> projectIds,

            ImmutableArray<string> protocols,

            ImmutableArray<string> queryTags,

            ImmutableArray<string> requestsPerSeconds,

            ImmutableArray<string> selectors,

            ImmutableArray<string> services,

            ImmutableArray<string> slos,

            ImmutableArray<string> statuses,

            ImmutableArray<string> targetHostnames,

            ImmutableArray<string> targetIps,

            ImmutableArray<string> targetZoneNames,

            ImmutableArray<string> trafficExclusions,

            ImmutableArray<string> tunnelIds,

            ImmutableArray<string> tunnelNames,

            ImmutableArray<string> wheres,

            ImmutableArray<string> zones)
        {
            Actions = actions;
            AffectedAsns = affectedAsns;
            AffectedComponents = affectedComponents;
            AffectedLocations = affectedLocations;
            AirportCodes = airportCodes;
            AlertTriggerPreferences = alertTriggerPreferences;
            AlertTriggerPreferencesValues = alertTriggerPreferencesValues;
            Enableds = enableds;
            Environments = environments;
            EventSources = eventSources;
            EventTypes = eventTypes;
            Events = events;
            GroupBies = groupBies;
            HealthCheckIds = healthCheckIds;
            IncidentImpacts = incidentImpacts;
            InputIds = inputIds;
            InsightClasses = insightClasses;
            Limits = limits;
            LogoTags = logoTags;
            MegabitsPerSeconds = megabitsPerSeconds;
            NewHealths = newHealths;
            NewStatuses = newStatuses;
            PacketsPerSeconds = packetsPerSeconds;
            PoolIds = poolIds;
            PopNames = popNames;
            Products = products;
            ProjectIds = projectIds;
            Protocols = protocols;
            QueryTags = queryTags;
            RequestsPerSeconds = requestsPerSeconds;
            Selectors = selectors;
            Services = services;
            Slos = slos;
            Statuses = statuses;
            TargetHostnames = targetHostnames;
            TargetIps = targetIps;
            TargetZoneNames = targetZoneNames;
            TrafficExclusions = trafficExclusions;
            TunnelIds = tunnelIds;
            TunnelNames = tunnelNames;
            Wheres = wheres;
            Zones = zones;
        }
    }
}
