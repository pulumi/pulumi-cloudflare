# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['TeamsRuleArgs', 'TeamsRule']

@pulumi.input_type
class TeamsRuleArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[_builtins.str],
                 action: pulumi.Input[_builtins.str],
                 name: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 device_posture: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 expiration: Optional[pulumi.Input['TeamsRuleExpirationArgs']] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 identity: Optional[pulumi.Input[_builtins.str]] = None,
                 precedence: Optional[pulumi.Input[_builtins.int]] = None,
                 rule_settings: Optional[pulumi.Input['TeamsRuleRuleSettingsArgs']] = None,
                 schedule: Optional[pulumi.Input['TeamsRuleScheduleArgs']] = None,
                 traffic: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a TeamsRule resource.
        :param pulumi.Input[_builtins.str] action: The action to preform when the associated traffic, identity, and device posture expressions are either absent or evaluate to `true`.
               Available values: "on", "off", "allow", "block", "scan", "noscan", "safesearch", "ytrestricted", "isolate", "noisolate", "override", "l4_override", "egress", "resolve", "quarantine", "redirect".
        :param pulumi.Input[_builtins.str] name: The name of the rule.
        :param pulumi.Input[_builtins.str] description: The description of the rule.
        :param pulumi.Input[_builtins.str] device_posture: The wirefilter expression used for device posture check matching.
        :param pulumi.Input[_builtins.bool] enabled: True if the rule is enabled.
        :param pulumi.Input['TeamsRuleExpirationArgs'] expiration: The expiration time stamp and default duration of a DNS policy. Takes
               precedence over the policy's `schedule` configuration, if any.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] filters: The protocol or layer to evaluate the traffic, identity, and device posture expressions.
        :param pulumi.Input[_builtins.str] identity: The wirefilter expression used for identity matching.
        :param pulumi.Input['TeamsRuleRuleSettingsArgs'] rule_settings: Additional settings that modify the rule's action.
        :param pulumi.Input['TeamsRuleScheduleArgs'] schedule: The schedule for activating DNS policies. This does not apply to HTTP or network policies.
        :param pulumi.Input[_builtins.str] traffic: The wirefilter expression used for traffic matching.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "action", action)
        pulumi.set(__self__, "name", name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if device_posture is not None:
            pulumi.set(__self__, "device_posture", device_posture)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if expiration is not None:
            pulumi.set(__self__, "expiration", expiration)
        if filters is not None:
            pulumi.set(__self__, "filters", filters)
        if identity is not None:
            pulumi.set(__self__, "identity", identity)
        if precedence is not None:
            pulumi.set(__self__, "precedence", precedence)
        if rule_settings is not None:
            pulumi.set(__self__, "rule_settings", rule_settings)
        if schedule is not None:
            pulumi.set(__self__, "schedule", schedule)
        if traffic is not None:
            pulumi.set(__self__, "traffic", traffic)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[_builtins.str]:
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter
    def action(self) -> pulumi.Input[_builtins.str]:
        """
        The action to preform when the associated traffic, identity, and device posture expressions are either absent or evaluate to `true`.
        Available values: "on", "off", "allow", "block", "scan", "noscan", "safesearch", "ytrestricted", "isolate", "noisolate", "override", "l4_override", "egress", "resolve", "quarantine", "redirect".
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "action", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the rule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="devicePosture")
    def device_posture(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The wirefilter expression used for device posture check matching.
        """
        return pulumi.get(self, "device_posture")

    @device_posture.setter
    def device_posture(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "device_posture", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        True if the rule is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter
    def expiration(self) -> Optional[pulumi.Input['TeamsRuleExpirationArgs']]:
        """
        The expiration time stamp and default duration of a DNS policy. Takes
        precedence over the policy's `schedule` configuration, if any.
        """
        return pulumi.get(self, "expiration")

    @expiration.setter
    def expiration(self, value: Optional[pulumi.Input['TeamsRuleExpirationArgs']]):
        pulumi.set(self, "expiration", value)

    @_builtins.property
    @pulumi.getter
    def filters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The protocol or layer to evaluate the traffic, identity, and device posture expressions.
        """
        return pulumi.get(self, "filters")

    @filters.setter
    def filters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "filters", value)

    @_builtins.property
    @pulumi.getter
    def identity(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The wirefilter expression used for identity matching.
        """
        return pulumi.get(self, "identity")

    @identity.setter
    def identity(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "identity", value)

    @_builtins.property
    @pulumi.getter
    def precedence(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "precedence")

    @precedence.setter
    def precedence(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "precedence", value)

    @_builtins.property
    @pulumi.getter(name="ruleSettings")
    def rule_settings(self) -> Optional[pulumi.Input['TeamsRuleRuleSettingsArgs']]:
        """
        Additional settings that modify the rule's action.
        """
        return pulumi.get(self, "rule_settings")

    @rule_settings.setter
    def rule_settings(self, value: Optional[pulumi.Input['TeamsRuleRuleSettingsArgs']]):
        pulumi.set(self, "rule_settings", value)

    @_builtins.property
    @pulumi.getter
    def schedule(self) -> Optional[pulumi.Input['TeamsRuleScheduleArgs']]:
        """
        The schedule for activating DNS policies. This does not apply to HTTP or network policies.
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: Optional[pulumi.Input['TeamsRuleScheduleArgs']]):
        pulumi.set(self, "schedule", value)

    @_builtins.property
    @pulumi.getter
    def traffic(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The wirefilter expression used for traffic matching.
        """
        return pulumi.get(self, "traffic")

    @traffic.setter
    def traffic(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "traffic", value)


@pulumi.input_type
class _TeamsRuleState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 action: Optional[pulumi.Input[_builtins.str]] = None,
                 created_at: Optional[pulumi.Input[_builtins.str]] = None,
                 deleted_at: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 device_posture: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 expiration: Optional[pulumi.Input['TeamsRuleExpirationArgs']] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 identity: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 precedence: Optional[pulumi.Input[_builtins.int]] = None,
                 rule_settings: Optional[pulumi.Input['TeamsRuleRuleSettingsArgs']] = None,
                 schedule: Optional[pulumi.Input['TeamsRuleScheduleArgs']] = None,
                 traffic: Optional[pulumi.Input[_builtins.str]] = None,
                 updated_at: Optional[pulumi.Input[_builtins.str]] = None,
                 version: Optional[pulumi.Input[_builtins.int]] = None,
                 warning_status: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering TeamsRule resources.
        :param pulumi.Input[_builtins.str] action: The action to preform when the associated traffic, identity, and device posture expressions are either absent or evaluate to `true`.
               Available values: "on", "off", "allow", "block", "scan", "noscan", "safesearch", "ytrestricted", "isolate", "noisolate", "override", "l4_override", "egress", "resolve", "quarantine", "redirect".
        :param pulumi.Input[_builtins.str] deleted_at: Date of deletion, if any.
        :param pulumi.Input[_builtins.str] description: The description of the rule.
        :param pulumi.Input[_builtins.str] device_posture: The wirefilter expression used for device posture check matching.
        :param pulumi.Input[_builtins.bool] enabled: True if the rule is enabled.
        :param pulumi.Input['TeamsRuleExpirationArgs'] expiration: The expiration time stamp and default duration of a DNS policy. Takes
               precedence over the policy's `schedule` configuration, if any.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] filters: The protocol or layer to evaluate the traffic, identity, and device posture expressions.
        :param pulumi.Input[_builtins.str] identity: The wirefilter expression used for identity matching.
        :param pulumi.Input[_builtins.str] name: The name of the rule.
        :param pulumi.Input['TeamsRuleRuleSettingsArgs'] rule_settings: Additional settings that modify the rule's action.
        :param pulumi.Input['TeamsRuleScheduleArgs'] schedule: The schedule for activating DNS policies. This does not apply to HTTP or network policies.
        :param pulumi.Input[_builtins.str] traffic: The wirefilter expression used for traffic matching.
        :param pulumi.Input[_builtins.int] version: version number of the rule
        :param pulumi.Input[_builtins.str] warning_status: Warning for a misconfigured rule, if any.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if action is not None:
            pulumi.set(__self__, "action", action)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if deleted_at is not None:
            pulumi.set(__self__, "deleted_at", deleted_at)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if device_posture is not None:
            pulumi.set(__self__, "device_posture", device_posture)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if expiration is not None:
            pulumi.set(__self__, "expiration", expiration)
        if filters is not None:
            pulumi.set(__self__, "filters", filters)
        if identity is not None:
            pulumi.set(__self__, "identity", identity)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if precedence is not None:
            pulumi.set(__self__, "precedence", precedence)
        if rule_settings is not None:
            pulumi.set(__self__, "rule_settings", rule_settings)
        if schedule is not None:
            pulumi.set(__self__, "schedule", schedule)
        if traffic is not None:
            pulumi.set(__self__, "traffic", traffic)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)
        if version is not None:
            pulumi.set(__self__, "version", version)
        if warning_status is not None:
            pulumi.set(__self__, "warning_status", warning_status)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter
    def action(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The action to preform when the associated traffic, identity, and device posture expressions are either absent or evaluate to `true`.
        Available values: "on", "off", "allow", "block", "scan", "noscan", "safesearch", "ytrestricted", "isolate", "noisolate", "override", "l4_override", "egress", "resolve", "quarantine", "redirect".
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "action", value)

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "created_at", value)

    @_builtins.property
    @pulumi.getter(name="deletedAt")
    def deleted_at(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Date of deletion, if any.
        """
        return pulumi.get(self, "deleted_at")

    @deleted_at.setter
    def deleted_at(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "deleted_at", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="devicePosture")
    def device_posture(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The wirefilter expression used for device posture check matching.
        """
        return pulumi.get(self, "device_posture")

    @device_posture.setter
    def device_posture(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "device_posture", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        True if the rule is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter
    def expiration(self) -> Optional[pulumi.Input['TeamsRuleExpirationArgs']]:
        """
        The expiration time stamp and default duration of a DNS policy. Takes
        precedence over the policy's `schedule` configuration, if any.
        """
        return pulumi.get(self, "expiration")

    @expiration.setter
    def expiration(self, value: Optional[pulumi.Input['TeamsRuleExpirationArgs']]):
        pulumi.set(self, "expiration", value)

    @_builtins.property
    @pulumi.getter
    def filters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The protocol or layer to evaluate the traffic, identity, and device posture expressions.
        """
        return pulumi.get(self, "filters")

    @filters.setter
    def filters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "filters", value)

    @_builtins.property
    @pulumi.getter
    def identity(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The wirefilter expression used for identity matching.
        """
        return pulumi.get(self, "identity")

    @identity.setter
    def identity(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "identity", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the rule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def precedence(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "precedence")

    @precedence.setter
    def precedence(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "precedence", value)

    @_builtins.property
    @pulumi.getter(name="ruleSettings")
    def rule_settings(self) -> Optional[pulumi.Input['TeamsRuleRuleSettingsArgs']]:
        """
        Additional settings that modify the rule's action.
        """
        return pulumi.get(self, "rule_settings")

    @rule_settings.setter
    def rule_settings(self, value: Optional[pulumi.Input['TeamsRuleRuleSettingsArgs']]):
        pulumi.set(self, "rule_settings", value)

    @_builtins.property
    @pulumi.getter
    def schedule(self) -> Optional[pulumi.Input['TeamsRuleScheduleArgs']]:
        """
        The schedule for activating DNS policies. This does not apply to HTTP or network policies.
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: Optional[pulumi.Input['TeamsRuleScheduleArgs']]):
        pulumi.set(self, "schedule", value)

    @_builtins.property
    @pulumi.getter
    def traffic(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The wirefilter expression used for traffic matching.
        """
        return pulumi.get(self, "traffic")

    @traffic.setter
    def traffic(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "traffic", value)

    @_builtins.property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "updated_at", value)

    @_builtins.property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        version number of the rule
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "version", value)

    @_builtins.property
    @pulumi.getter(name="warningStatus")
    def warning_status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Warning for a misconfigured rule, if any.
        """
        return pulumi.get(self, "warning_status")

    @warning_status.setter
    def warning_status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "warning_status", value)


warnings.warn("""cloudflare.index/teamsrule.TeamsRule has been deprecated in favor of cloudflare.index/zerotrustgatewaypolicy.ZeroTrustGatewayPolicy""", DeprecationWarning)


@pulumi.type_token("cloudflare:index/teamsRule:TeamsRule")
class TeamsRule(pulumi.CustomResource):
    warnings.warn("""cloudflare.index/teamsrule.TeamsRule has been deprecated in favor of cloudflare.index/zerotrustgatewaypolicy.ZeroTrustGatewayPolicy""", DeprecationWarning)

    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 action: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 device_posture: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 expiration: Optional[pulumi.Input[Union['TeamsRuleExpirationArgs', 'TeamsRuleExpirationArgsDict']]] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 identity: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 precedence: Optional[pulumi.Input[_builtins.int]] = None,
                 rule_settings: Optional[pulumi.Input[Union['TeamsRuleRuleSettingsArgs', 'TeamsRuleRuleSettingsArgsDict']]] = None,
                 schedule: Optional[pulumi.Input[Union['TeamsRuleScheduleArgs', 'TeamsRuleScheduleArgsDict']]] = None,
                 traffic: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import cloudflare:index/teamsRule:TeamsRule example '<account_id>/<rule_id>'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] action: The action to preform when the associated traffic, identity, and device posture expressions are either absent or evaluate to `true`.
               Available values: "on", "off", "allow", "block", "scan", "noscan", "safesearch", "ytrestricted", "isolate", "noisolate", "override", "l4_override", "egress", "resolve", "quarantine", "redirect".
        :param pulumi.Input[_builtins.str] description: The description of the rule.
        :param pulumi.Input[_builtins.str] device_posture: The wirefilter expression used for device posture check matching.
        :param pulumi.Input[_builtins.bool] enabled: True if the rule is enabled.
        :param pulumi.Input[Union['TeamsRuleExpirationArgs', 'TeamsRuleExpirationArgsDict']] expiration: The expiration time stamp and default duration of a DNS policy. Takes
               precedence over the policy's `schedule` configuration, if any.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] filters: The protocol or layer to evaluate the traffic, identity, and device posture expressions.
        :param pulumi.Input[_builtins.str] identity: The wirefilter expression used for identity matching.
        :param pulumi.Input[_builtins.str] name: The name of the rule.
        :param pulumi.Input[Union['TeamsRuleRuleSettingsArgs', 'TeamsRuleRuleSettingsArgsDict']] rule_settings: Additional settings that modify the rule's action.
        :param pulumi.Input[Union['TeamsRuleScheduleArgs', 'TeamsRuleScheduleArgsDict']] schedule: The schedule for activating DNS policies. This does not apply to HTTP or network policies.
        :param pulumi.Input[_builtins.str] traffic: The wirefilter expression used for traffic matching.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TeamsRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import cloudflare:index/teamsRule:TeamsRule example '<account_id>/<rule_id>'
        ```

        :param str resource_name: The name of the resource.
        :param TeamsRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TeamsRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 action: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 device_posture: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 expiration: Optional[pulumi.Input[Union['TeamsRuleExpirationArgs', 'TeamsRuleExpirationArgsDict']]] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 identity: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 precedence: Optional[pulumi.Input[_builtins.int]] = None,
                 rule_settings: Optional[pulumi.Input[Union['TeamsRuleRuleSettingsArgs', 'TeamsRuleRuleSettingsArgsDict']]] = None,
                 schedule: Optional[pulumi.Input[Union['TeamsRuleScheduleArgs', 'TeamsRuleScheduleArgsDict']]] = None,
                 traffic: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        pulumi.log.warn("""TeamsRule is deprecated: cloudflare.index/teamsrule.TeamsRule has been deprecated in favor of cloudflare.index/zerotrustgatewaypolicy.ZeroTrustGatewayPolicy""")
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TeamsRuleArgs.__new__(TeamsRuleArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if action is None and not opts.urn:
                raise TypeError("Missing required property 'action'")
            __props__.__dict__["action"] = action
            __props__.__dict__["description"] = description
            __props__.__dict__["device_posture"] = device_posture
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["expiration"] = expiration
            __props__.__dict__["filters"] = filters
            __props__.__dict__["identity"] = identity
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["precedence"] = precedence
            __props__.__dict__["rule_settings"] = rule_settings
            __props__.__dict__["schedule"] = schedule
            __props__.__dict__["traffic"] = traffic
            __props__.__dict__["created_at"] = None
            __props__.__dict__["deleted_at"] = None
            __props__.__dict__["updated_at"] = None
            __props__.__dict__["version"] = None
            __props__.__dict__["warning_status"] = None
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="cloudflare:index/teamsRule:TeamsRule")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(TeamsRule, __self__).__init__(
            'cloudflare:index/teamsRule:TeamsRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[_builtins.str]] = None,
            action: Optional[pulumi.Input[_builtins.str]] = None,
            created_at: Optional[pulumi.Input[_builtins.str]] = None,
            deleted_at: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            device_posture: Optional[pulumi.Input[_builtins.str]] = None,
            enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            expiration: Optional[pulumi.Input[Union['TeamsRuleExpirationArgs', 'TeamsRuleExpirationArgsDict']]] = None,
            filters: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            identity: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            precedence: Optional[pulumi.Input[_builtins.int]] = None,
            rule_settings: Optional[pulumi.Input[Union['TeamsRuleRuleSettingsArgs', 'TeamsRuleRuleSettingsArgsDict']]] = None,
            schedule: Optional[pulumi.Input[Union['TeamsRuleScheduleArgs', 'TeamsRuleScheduleArgsDict']]] = None,
            traffic: Optional[pulumi.Input[_builtins.str]] = None,
            updated_at: Optional[pulumi.Input[_builtins.str]] = None,
            version: Optional[pulumi.Input[_builtins.int]] = None,
            warning_status: Optional[pulumi.Input[_builtins.str]] = None) -> 'TeamsRule':
        """
        Get an existing TeamsRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] action: The action to preform when the associated traffic, identity, and device posture expressions are either absent or evaluate to `true`.
               Available values: "on", "off", "allow", "block", "scan", "noscan", "safesearch", "ytrestricted", "isolate", "noisolate", "override", "l4_override", "egress", "resolve", "quarantine", "redirect".
        :param pulumi.Input[_builtins.str] deleted_at: Date of deletion, if any.
        :param pulumi.Input[_builtins.str] description: The description of the rule.
        :param pulumi.Input[_builtins.str] device_posture: The wirefilter expression used for device posture check matching.
        :param pulumi.Input[_builtins.bool] enabled: True if the rule is enabled.
        :param pulumi.Input[Union['TeamsRuleExpirationArgs', 'TeamsRuleExpirationArgsDict']] expiration: The expiration time stamp and default duration of a DNS policy. Takes
               precedence over the policy's `schedule` configuration, if any.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] filters: The protocol or layer to evaluate the traffic, identity, and device posture expressions.
        :param pulumi.Input[_builtins.str] identity: The wirefilter expression used for identity matching.
        :param pulumi.Input[_builtins.str] name: The name of the rule.
        :param pulumi.Input[Union['TeamsRuleRuleSettingsArgs', 'TeamsRuleRuleSettingsArgsDict']] rule_settings: Additional settings that modify the rule's action.
        :param pulumi.Input[Union['TeamsRuleScheduleArgs', 'TeamsRuleScheduleArgsDict']] schedule: The schedule for activating DNS policies. This does not apply to HTTP or network policies.
        :param pulumi.Input[_builtins.str] traffic: The wirefilter expression used for traffic matching.
        :param pulumi.Input[_builtins.int] version: version number of the rule
        :param pulumi.Input[_builtins.str] warning_status: Warning for a misconfigured rule, if any.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TeamsRuleState.__new__(_TeamsRuleState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["action"] = action
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["deleted_at"] = deleted_at
        __props__.__dict__["description"] = description
        __props__.__dict__["device_posture"] = device_posture
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["expiration"] = expiration
        __props__.__dict__["filters"] = filters
        __props__.__dict__["identity"] = identity
        __props__.__dict__["name"] = name
        __props__.__dict__["precedence"] = precedence
        __props__.__dict__["rule_settings"] = rule_settings
        __props__.__dict__["schedule"] = schedule
        __props__.__dict__["traffic"] = traffic
        __props__.__dict__["updated_at"] = updated_at
        __props__.__dict__["version"] = version
        __props__.__dict__["warning_status"] = warning_status
        return TeamsRule(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter
    def action(self) -> pulumi.Output[_builtins.str]:
        """
        The action to preform when the associated traffic, identity, and device posture expressions are either absent or evaluate to `true`.
        Available values: "on", "off", "allow", "block", "scan", "noscan", "safesearch", "ytrestricted", "isolate", "noisolate", "override", "l4_override", "egress", "resolve", "quarantine", "redirect".
        """
        return pulumi.get(self, "action")

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "created_at")

    @_builtins.property
    @pulumi.getter(name="deletedAt")
    def deleted_at(self) -> pulumi.Output[_builtins.str]:
        """
        Date of deletion, if any.
        """
        return pulumi.get(self, "deleted_at")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description of the rule.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="devicePosture")
    def device_posture(self) -> pulumi.Output[_builtins.str]:
        """
        The wirefilter expression used for device posture check matching.
        """
        return pulumi.get(self, "device_posture")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[_builtins.bool]:
        """
        True if the rule is enabled.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter
    def expiration(self) -> pulumi.Output['outputs.TeamsRuleExpiration']:
        """
        The expiration time stamp and default duration of a DNS policy. Takes
        precedence over the policy's `schedule` configuration, if any.
        """
        return pulumi.get(self, "expiration")

    @_builtins.property
    @pulumi.getter
    def filters(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        The protocol or layer to evaluate the traffic, identity, and device posture expressions.
        """
        return pulumi.get(self, "filters")

    @_builtins.property
    @pulumi.getter
    def identity(self) -> pulumi.Output[_builtins.str]:
        """
        The wirefilter expression used for identity matching.
        """
        return pulumi.get(self, "identity")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the rule.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def precedence(self) -> pulumi.Output[Optional[_builtins.int]]:
        return pulumi.get(self, "precedence")

    @_builtins.property
    @pulumi.getter(name="ruleSettings")
    def rule_settings(self) -> pulumi.Output['outputs.TeamsRuleRuleSettings']:
        """
        Additional settings that modify the rule's action.
        """
        return pulumi.get(self, "rule_settings")

    @_builtins.property
    @pulumi.getter
    def schedule(self) -> pulumi.Output[Optional['outputs.TeamsRuleSchedule']]:
        """
        The schedule for activating DNS policies. This does not apply to HTTP or network policies.
        """
        return pulumi.get(self, "schedule")

    @_builtins.property
    @pulumi.getter
    def traffic(self) -> pulumi.Output[_builtins.str]:
        """
        The wirefilter expression used for traffic matching.
        """
        return pulumi.get(self, "traffic")

    @_builtins.property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "updated_at")

    @_builtins.property
    @pulumi.getter
    def version(self) -> pulumi.Output[_builtins.int]:
        """
        version number of the rule
        """
        return pulumi.get(self, "version")

    @_builtins.property
    @pulumi.getter(name="warningStatus")
    def warning_status(self) -> pulumi.Output[_builtins.str]:
        """
        Warning for a misconfigured rule, if any.
        """
        return pulumi.get(self, "warning_status")

