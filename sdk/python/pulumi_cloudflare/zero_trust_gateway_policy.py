# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
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

__all__ = ['ZeroTrustGatewayPolicyArgs', 'ZeroTrustGatewayPolicy']

@pulumi.input_type
class ZeroTrustGatewayPolicyArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 action: pulumi.Input[str],
                 description: pulumi.Input[str],
                 name: pulumi.Input[str],
                 precedence: pulumi.Input[int],
                 device_posture: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 identity: Optional[pulumi.Input[str]] = None,
                 rule_settings: Optional[pulumi.Input['ZeroTrustGatewayPolicyRuleSettingsArgs']] = None,
                 traffic: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ZeroTrustGatewayPolicy resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] action: The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4_override`, `egress`, `audit_ssh`, `resolve`.
        :param pulumi.Input[str] description: The description of the teams rule.
        :param pulumi.Input[str] name: The name of the teams rule.
        :param pulumi.Input[int] precedence: The evaluation precedence of the teams rule.
        :param pulumi.Input[str] device_posture: The wirefilter expression to be used for device_posture check matching.
        :param pulumi.Input[bool] enabled: Indicator of rule enablement.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] filters: The protocol or layer to evaluate the traffic and identity expressions.
        :param pulumi.Input[str] identity: The wirefilter expression to be used for identity matching.
        :param pulumi.Input['ZeroTrustGatewayPolicyRuleSettingsArgs'] rule_settings: Additional rule settings.
        :param pulumi.Input[str] traffic: The wirefilter expression to be used for traffic matching.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "action", action)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "precedence", precedence)
        if device_posture is not None:
            pulumi.set(__self__, "device_posture", device_posture)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if filters is not None:
            pulumi.set(__self__, "filters", filters)
        if identity is not None:
            pulumi.set(__self__, "identity", identity)
        if rule_settings is not None:
            pulumi.set(__self__, "rule_settings", rule_settings)
        if traffic is not None:
            pulumi.set(__self__, "traffic", traffic)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Input[str]:
        """
        The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4_override`, `egress`, `audit_ssh`, `resolve`.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: pulumi.Input[str]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        The description of the teams rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name of the teams rule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def precedence(self) -> pulumi.Input[int]:
        """
        The evaluation precedence of the teams rule.
        """
        return pulumi.get(self, "precedence")

    @precedence.setter
    def precedence(self, value: pulumi.Input[int]):
        pulumi.set(self, "precedence", value)

    @property
    @pulumi.getter(name="devicePosture")
    def device_posture(self) -> Optional[pulumi.Input[str]]:
        """
        The wirefilter expression to be used for device_posture check matching.
        """
        return pulumi.get(self, "device_posture")

    @device_posture.setter
    def device_posture(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_posture", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicator of rule enablement.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def filters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The protocol or layer to evaluate the traffic and identity expressions.
        """
        return pulumi.get(self, "filters")

    @filters.setter
    def filters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "filters", value)

    @property
    @pulumi.getter
    def identity(self) -> Optional[pulumi.Input[str]]:
        """
        The wirefilter expression to be used for identity matching.
        """
        return pulumi.get(self, "identity")

    @identity.setter
    def identity(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identity", value)

    @property
    @pulumi.getter(name="ruleSettings")
    def rule_settings(self) -> Optional[pulumi.Input['ZeroTrustGatewayPolicyRuleSettingsArgs']]:
        """
        Additional rule settings.
        """
        return pulumi.get(self, "rule_settings")

    @rule_settings.setter
    def rule_settings(self, value: Optional[pulumi.Input['ZeroTrustGatewayPolicyRuleSettingsArgs']]):
        pulumi.set(self, "rule_settings", value)

    @property
    @pulumi.getter
    def traffic(self) -> Optional[pulumi.Input[str]]:
        """
        The wirefilter expression to be used for traffic matching.
        """
        return pulumi.get(self, "traffic")

    @traffic.setter
    def traffic(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic", value)


@pulumi.input_type
class _ZeroTrustGatewayPolicyState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 device_posture: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 identity: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 precedence: Optional[pulumi.Input[int]] = None,
                 rule_settings: Optional[pulumi.Input['ZeroTrustGatewayPolicyRuleSettingsArgs']] = None,
                 traffic: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering ZeroTrustGatewayPolicy resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] action: The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4_override`, `egress`, `audit_ssh`, `resolve`.
        :param pulumi.Input[str] description: The description of the teams rule.
        :param pulumi.Input[str] device_posture: The wirefilter expression to be used for device_posture check matching.
        :param pulumi.Input[bool] enabled: Indicator of rule enablement.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] filters: The protocol or layer to evaluate the traffic and identity expressions.
        :param pulumi.Input[str] identity: The wirefilter expression to be used for identity matching.
        :param pulumi.Input[str] name: The name of the teams rule.
        :param pulumi.Input[int] precedence: The evaluation precedence of the teams rule.
        :param pulumi.Input['ZeroTrustGatewayPolicyRuleSettingsArgs'] rule_settings: Additional rule settings.
        :param pulumi.Input[str] traffic: The wirefilter expression to be used for traffic matching.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if action is not None:
            pulumi.set(__self__, "action", action)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if device_posture is not None:
            pulumi.set(__self__, "device_posture", device_posture)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
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
        if traffic is not None:
            pulumi.set(__self__, "traffic", traffic)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def action(self) -> Optional[pulumi.Input[str]]:
        """
        The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4_override`, `egress`, `audit_ssh`, `resolve`.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the teams rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="devicePosture")
    def device_posture(self) -> Optional[pulumi.Input[str]]:
        """
        The wirefilter expression to be used for device_posture check matching.
        """
        return pulumi.get(self, "device_posture")

    @device_posture.setter
    def device_posture(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_posture", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicator of rule enablement.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def filters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The protocol or layer to evaluate the traffic and identity expressions.
        """
        return pulumi.get(self, "filters")

    @filters.setter
    def filters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "filters", value)

    @property
    @pulumi.getter
    def identity(self) -> Optional[pulumi.Input[str]]:
        """
        The wirefilter expression to be used for identity matching.
        """
        return pulumi.get(self, "identity")

    @identity.setter
    def identity(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identity", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the teams rule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def precedence(self) -> Optional[pulumi.Input[int]]:
        """
        The evaluation precedence of the teams rule.
        """
        return pulumi.get(self, "precedence")

    @precedence.setter
    def precedence(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "precedence", value)

    @property
    @pulumi.getter(name="ruleSettings")
    def rule_settings(self) -> Optional[pulumi.Input['ZeroTrustGatewayPolicyRuleSettingsArgs']]:
        """
        Additional rule settings.
        """
        return pulumi.get(self, "rule_settings")

    @rule_settings.setter
    def rule_settings(self, value: Optional[pulumi.Input['ZeroTrustGatewayPolicyRuleSettingsArgs']]):
        pulumi.set(self, "rule_settings", value)

    @property
    @pulumi.getter
    def traffic(self) -> Optional[pulumi.Input[str]]:
        """
        The wirefilter expression to be used for traffic matching.
        """
        return pulumi.get(self, "traffic")

    @traffic.setter
    def traffic(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "version", value)


class ZeroTrustGatewayPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 device_posture: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 identity: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 precedence: Optional[pulumi.Input[int]] = None,
                 rule_settings: Optional[pulumi.Input[Union['ZeroTrustGatewayPolicyRuleSettingsArgs', 'ZeroTrustGatewayPolicyRuleSettingsArgsDict']]] = None,
                 traffic: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare Teams rule resource. Teams rules comprise secure web gateway policies.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.ZeroTrustGatewayPolicy("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="office",
            description="desc",
            precedence=1,
            action="block",
            filters=["http"],
            traffic="http.request.uri == \\"https://www.example.com/malicious\\"",
            rule_settings={
                "block_page_enabled": True,
                "block_page_reason": "access not permitted",
            })
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/zeroTrustGatewayPolicy:ZeroTrustGatewayPolicy example <account_id>/<teams_rule_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] action: The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4_override`, `egress`, `audit_ssh`, `resolve`.
        :param pulumi.Input[str] description: The description of the teams rule.
        :param pulumi.Input[str] device_posture: The wirefilter expression to be used for device_posture check matching.
        :param pulumi.Input[bool] enabled: Indicator of rule enablement.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] filters: The protocol or layer to evaluate the traffic and identity expressions.
        :param pulumi.Input[str] identity: The wirefilter expression to be used for identity matching.
        :param pulumi.Input[str] name: The name of the teams rule.
        :param pulumi.Input[int] precedence: The evaluation precedence of the teams rule.
        :param pulumi.Input[Union['ZeroTrustGatewayPolicyRuleSettingsArgs', 'ZeroTrustGatewayPolicyRuleSettingsArgsDict']] rule_settings: Additional rule settings.
        :param pulumi.Input[str] traffic: The wirefilter expression to be used for traffic matching.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ZeroTrustGatewayPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare Teams rule resource. Teams rules comprise secure web gateway policies.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.ZeroTrustGatewayPolicy("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="office",
            description="desc",
            precedence=1,
            action="block",
            filters=["http"],
            traffic="http.request.uri == \\"https://www.example.com/malicious\\"",
            rule_settings={
                "block_page_enabled": True,
                "block_page_reason": "access not permitted",
            })
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/zeroTrustGatewayPolicy:ZeroTrustGatewayPolicy example <account_id>/<teams_rule_id>
        ```

        :param str resource_name: The name of the resource.
        :param ZeroTrustGatewayPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ZeroTrustGatewayPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 device_posture: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 identity: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 precedence: Optional[pulumi.Input[int]] = None,
                 rule_settings: Optional[pulumi.Input[Union['ZeroTrustGatewayPolicyRuleSettingsArgs', 'ZeroTrustGatewayPolicyRuleSettingsArgsDict']]] = None,
                 traffic: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ZeroTrustGatewayPolicyArgs.__new__(ZeroTrustGatewayPolicyArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if action is None and not opts.urn:
                raise TypeError("Missing required property 'action'")
            __props__.__dict__["action"] = action
            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            __props__.__dict__["device_posture"] = device_posture
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["filters"] = filters
            __props__.__dict__["identity"] = identity
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            if precedence is None and not opts.urn:
                raise TypeError("Missing required property 'precedence'")
            __props__.__dict__["precedence"] = precedence
            __props__.__dict__["rule_settings"] = rule_settings
            __props__.__dict__["traffic"] = traffic
            __props__.__dict__["version"] = None
        super(ZeroTrustGatewayPolicy, __self__).__init__(
            'cloudflare:index/zeroTrustGatewayPolicy:ZeroTrustGatewayPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            action: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            device_posture: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            identity: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            precedence: Optional[pulumi.Input[int]] = None,
            rule_settings: Optional[pulumi.Input[Union['ZeroTrustGatewayPolicyRuleSettingsArgs', 'ZeroTrustGatewayPolicyRuleSettingsArgsDict']]] = None,
            traffic: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[int]] = None) -> 'ZeroTrustGatewayPolicy':
        """
        Get an existing ZeroTrustGatewayPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] action: The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4_override`, `egress`, `audit_ssh`, `resolve`.
        :param pulumi.Input[str] description: The description of the teams rule.
        :param pulumi.Input[str] device_posture: The wirefilter expression to be used for device_posture check matching.
        :param pulumi.Input[bool] enabled: Indicator of rule enablement.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] filters: The protocol or layer to evaluate the traffic and identity expressions.
        :param pulumi.Input[str] identity: The wirefilter expression to be used for identity matching.
        :param pulumi.Input[str] name: The name of the teams rule.
        :param pulumi.Input[int] precedence: The evaluation precedence of the teams rule.
        :param pulumi.Input[Union['ZeroTrustGatewayPolicyRuleSettingsArgs', 'ZeroTrustGatewayPolicyRuleSettingsArgsDict']] rule_settings: Additional rule settings.
        :param pulumi.Input[str] traffic: The wirefilter expression to be used for traffic matching.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ZeroTrustGatewayPolicyState.__new__(_ZeroTrustGatewayPolicyState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["action"] = action
        __props__.__dict__["description"] = description
        __props__.__dict__["device_posture"] = device_posture
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["filters"] = filters
        __props__.__dict__["identity"] = identity
        __props__.__dict__["name"] = name
        __props__.__dict__["precedence"] = precedence
        __props__.__dict__["rule_settings"] = rule_settings
        __props__.__dict__["traffic"] = traffic
        __props__.__dict__["version"] = version
        return ZeroTrustGatewayPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def action(self) -> pulumi.Output[str]:
        """
        The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4_override`, `egress`, `audit_ssh`, `resolve`.
        """
        return pulumi.get(self, "action")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        The description of the teams rule.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="devicePosture")
    def device_posture(self) -> pulumi.Output[str]:
        """
        The wirefilter expression to be used for device_posture check matching.
        """
        return pulumi.get(self, "device_posture")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicator of rule enablement.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def filters(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The protocol or layer to evaluate the traffic and identity expressions.
        """
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def identity(self) -> pulumi.Output[str]:
        """
        The wirefilter expression to be used for identity matching.
        """
        return pulumi.get(self, "identity")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the teams rule.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def precedence(self) -> pulumi.Output[int]:
        """
        The evaluation precedence of the teams rule.
        """
        return pulumi.get(self, "precedence")

    @property
    @pulumi.getter(name="ruleSettings")
    def rule_settings(self) -> pulumi.Output['outputs.ZeroTrustGatewayPolicyRuleSettings']:
        """
        Additional rule settings.
        """
        return pulumi.get(self, "rule_settings")

    @property
    @pulumi.getter
    def traffic(self) -> pulumi.Output[str]:
        """
        The wirefilter expression to be used for traffic matching.
        """
        return pulumi.get(self, "traffic")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[int]:
        return pulumi.get(self, "version")

