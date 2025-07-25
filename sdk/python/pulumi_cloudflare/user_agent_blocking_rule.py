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

__all__ = ['UserAgentBlockingRuleArgs', 'UserAgentBlockingRule']

@pulumi.input_type
class UserAgentBlockingRuleArgs:
    def __init__(__self__, *,
                 configuration: pulumi.Input['UserAgentBlockingRuleConfigurationArgs'],
                 mode: pulumi.Input[_builtins.str],
                 zone_id: pulumi.Input[_builtins.str],
                 ua_rule_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a UserAgentBlockingRule resource.
        :param pulumi.Input[_builtins.str] mode: The action to apply to a matched request.
               Available values: "block", "challenge", "whitelist", "js*challenge", "managed*challenge".
        :param pulumi.Input[_builtins.str] zone_id: Defines an identifier.
        :param pulumi.Input[_builtins.str] ua_rule_id: The unique identifier of the User Agent Blocking rule.
        """
        pulumi.set(__self__, "configuration", configuration)
        pulumi.set(__self__, "mode", mode)
        pulumi.set(__self__, "zone_id", zone_id)
        if ua_rule_id is not None:
            pulumi.set(__self__, "ua_rule_id", ua_rule_id)

    @_builtins.property
    @pulumi.getter
    def configuration(self) -> pulumi.Input['UserAgentBlockingRuleConfigurationArgs']:
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: pulumi.Input['UserAgentBlockingRuleConfigurationArgs']):
        pulumi.set(self, "configuration", value)

    @_builtins.property
    @pulumi.getter
    def mode(self) -> pulumi.Input[_builtins.str]:
        """
        The action to apply to a matched request.
        Available values: "block", "challenge", "whitelist", "js*challenge", "managed*challenge".
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "mode", value)

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[_builtins.str]:
        """
        Defines an identifier.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "zone_id", value)

    @_builtins.property
    @pulumi.getter(name="uaRuleId")
    def ua_rule_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The unique identifier of the User Agent Blocking rule.
        """
        return pulumi.get(self, "ua_rule_id")

    @ua_rule_id.setter
    def ua_rule_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "ua_rule_id", value)


@pulumi.input_type
class _UserAgentBlockingRuleState:
    def __init__(__self__, *,
                 configuration: Optional[pulumi.Input['UserAgentBlockingRuleConfigurationArgs']] = None,
                 mode: Optional[pulumi.Input[_builtins.str]] = None,
                 ua_rule_id: Optional[pulumi.Input[_builtins.str]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering UserAgentBlockingRule resources.
        :param pulumi.Input[_builtins.str] mode: The action to apply to a matched request.
               Available values: "block", "challenge", "whitelist", "js*challenge", "managed*challenge".
        :param pulumi.Input[_builtins.str] ua_rule_id: The unique identifier of the User Agent Blocking rule.
        :param pulumi.Input[_builtins.str] zone_id: Defines an identifier.
        """
        if configuration is not None:
            pulumi.set(__self__, "configuration", configuration)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if ua_rule_id is not None:
            pulumi.set(__self__, "ua_rule_id", ua_rule_id)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter
    def configuration(self) -> Optional[pulumi.Input['UserAgentBlockingRuleConfigurationArgs']]:
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: Optional[pulumi.Input['UserAgentBlockingRuleConfigurationArgs']]):
        pulumi.set(self, "configuration", value)

    @_builtins.property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The action to apply to a matched request.
        Available values: "block", "challenge", "whitelist", "js*challenge", "managed*challenge".
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "mode", value)

    @_builtins.property
    @pulumi.getter(name="uaRuleId")
    def ua_rule_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The unique identifier of the User Agent Blocking rule.
        """
        return pulumi.get(self, "ua_rule_id")

    @ua_rule_id.setter
    def ua_rule_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "ua_rule_id", value)

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Defines an identifier.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "zone_id", value)


@pulumi.type_token("cloudflare:index/userAgentBlockingRule:UserAgentBlockingRule")
class UserAgentBlockingRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configuration: Optional[pulumi.Input[Union['UserAgentBlockingRuleConfigurationArgs', 'UserAgentBlockingRuleConfigurationArgsDict']]] = None,
                 mode: Optional[pulumi.Input[_builtins.str]] = None,
                 ua_rule_id: Optional[pulumi.Input[_builtins.str]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_user_agent_blocking_rule = cloudflare.UserAgentBlockingRule("example_user_agent_blocking_rule",
            zone_id="023e105f4ecef8ad9ca31a8372d0c353",
            configuration={
                "target": "ua",
                "value": "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)",
            },
            mode="challenge")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] mode: The action to apply to a matched request.
               Available values: "block", "challenge", "whitelist", "js*challenge", "managed*challenge".
        :param pulumi.Input[_builtins.str] ua_rule_id: The unique identifier of the User Agent Blocking rule.
        :param pulumi.Input[_builtins.str] zone_id: Defines an identifier.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserAgentBlockingRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_user_agent_blocking_rule = cloudflare.UserAgentBlockingRule("example_user_agent_blocking_rule",
            zone_id="023e105f4ecef8ad9ca31a8372d0c353",
            configuration={
                "target": "ua",
                "value": "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)",
            },
            mode="challenge")
        ```

        :param str resource_name: The name of the resource.
        :param UserAgentBlockingRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserAgentBlockingRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configuration: Optional[pulumi.Input[Union['UserAgentBlockingRuleConfigurationArgs', 'UserAgentBlockingRuleConfigurationArgsDict']]] = None,
                 mode: Optional[pulumi.Input[_builtins.str]] = None,
                 ua_rule_id: Optional[pulumi.Input[_builtins.str]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserAgentBlockingRuleArgs.__new__(UserAgentBlockingRuleArgs)

            if configuration is None and not opts.urn:
                raise TypeError("Missing required property 'configuration'")
            __props__.__dict__["configuration"] = configuration
            if mode is None and not opts.urn:
                raise TypeError("Missing required property 'mode'")
            __props__.__dict__["mode"] = mode
            __props__.__dict__["ua_rule_id"] = ua_rule_id
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
        super(UserAgentBlockingRule, __self__).__init__(
            'cloudflare:index/userAgentBlockingRule:UserAgentBlockingRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            configuration: Optional[pulumi.Input[Union['UserAgentBlockingRuleConfigurationArgs', 'UserAgentBlockingRuleConfigurationArgsDict']]] = None,
            mode: Optional[pulumi.Input[_builtins.str]] = None,
            ua_rule_id: Optional[pulumi.Input[_builtins.str]] = None,
            zone_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'UserAgentBlockingRule':
        """
        Get an existing UserAgentBlockingRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] mode: The action to apply to a matched request.
               Available values: "block", "challenge", "whitelist", "js*challenge", "managed*challenge".
        :param pulumi.Input[_builtins.str] ua_rule_id: The unique identifier of the User Agent Blocking rule.
        :param pulumi.Input[_builtins.str] zone_id: Defines an identifier.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserAgentBlockingRuleState.__new__(_UserAgentBlockingRuleState)

        __props__.__dict__["configuration"] = configuration
        __props__.__dict__["mode"] = mode
        __props__.__dict__["ua_rule_id"] = ua_rule_id
        __props__.__dict__["zone_id"] = zone_id
        return UserAgentBlockingRule(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def configuration(self) -> pulumi.Output['outputs.UserAgentBlockingRuleConfiguration']:
        return pulumi.get(self, "configuration")

    @_builtins.property
    @pulumi.getter
    def mode(self) -> pulumi.Output[_builtins.str]:
        """
        The action to apply to a matched request.
        Available values: "block", "challenge", "whitelist", "js*challenge", "managed*challenge".
        """
        return pulumi.get(self, "mode")

    @_builtins.property
    @pulumi.getter(name="uaRuleId")
    def ua_rule_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The unique identifier of the User Agent Blocking rule.
        """
        return pulumi.get(self, "ua_rule_id")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[_builtins.str]:
        """
        Defines an identifier.
        """
        return pulumi.get(self, "zone_id")

