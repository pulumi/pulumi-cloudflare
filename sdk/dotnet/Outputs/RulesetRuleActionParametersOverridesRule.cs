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
    public sealed class RulesetRuleActionParametersOverridesRule
    {
        /// <summary>
        /// Action to perform in the ruleset rule. Available values: `block`, `challenge`, `compress_response`, `ddos_dynamic`, `ddos_mitigation`, `execute`, `force_connection_close`, `js_challenge`, `log`, `log_custom_field`, `managed_challenge`, `redirect`, `rewrite`, `route`, `score`, `serve_error`, `set_cache_settings`, `set_config`, `skip`.
        /// </summary>
        public readonly string? Action;
        /// <summary>
        /// Whether the rule is active.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Unique rule identifier.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Anomaly score threshold to apply in the ruleset rule override. Only applicable to modsecurity-based rulesets.
        /// </summary>
        public readonly int? ScoreThreshold;
        /// <summary>
        /// Sensitivity level for a ruleset rule override.
        /// </summary>
        public readonly string? SensitivityLevel;

        [OutputConstructor]
        private RulesetRuleActionParametersOverridesRule(
            string? action,

            bool? enabled,

            string? id,

            int? scoreThreshold,

            string? sensitivityLevel)
        {
            Action = action;
            Enabled = enabled;
            Id = id;
            ScoreThreshold = scoreThreshold;
            SensitivityLevel = sensitivityLevel;
        }
    }
}
