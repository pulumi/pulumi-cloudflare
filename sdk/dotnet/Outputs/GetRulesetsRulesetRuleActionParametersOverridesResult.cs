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
    public sealed class GetRulesetsRulesetRuleActionParametersOverridesResult
    {
        public readonly string? Action;
        public readonly ImmutableArray<Outputs.GetRulesetsRulesetRuleActionParametersOverridesCategoryResult> Categories;
        public readonly bool? Enabled;
        public readonly ImmutableArray<Outputs.GetRulesetsRulesetRuleActionParametersOverridesRuleResult> Rules;
        public readonly string? SensitivityLevel;
        public readonly string? Status;

        [OutputConstructor]
        private GetRulesetsRulesetRuleActionParametersOverridesResult(
            string? action,

            ImmutableArray<Outputs.GetRulesetsRulesetRuleActionParametersOverridesCategoryResult> categories,

            bool? enabled,

            ImmutableArray<Outputs.GetRulesetsRulesetRuleActionParametersOverridesRuleResult> rules,

            string? sensitivityLevel,

            string? status)
        {
            Action = action;
            Categories = categories;
            Enabled = enabled;
            Rules = rules;
            SensitivityLevel = sensitivityLevel;
            Status = status;
        }
    }
}