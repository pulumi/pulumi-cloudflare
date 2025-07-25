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

__all__ = ['EmailRoutingRuleArgs', 'EmailRoutingRule']

@pulumi.input_type
class EmailRoutingRuleArgs:
    def __init__(__self__, *,
                 actions: pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleActionArgs']]],
                 matchers: pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleMatcherArgs']]],
                 zone_id: pulumi.Input[_builtins.str],
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 priority: Optional[pulumi.Input[_builtins.float]] = None):
        """
        The set of arguments for constructing a EmailRoutingRule resource.
        :param pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleActionArgs']]] actions: List actions patterns.
        :param pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleMatcherArgs']]] matchers: Matching patterns to forward to your actions.
        :param pulumi.Input[_builtins.str] zone_id: Identifier.
        :param pulumi.Input[_builtins.bool] enabled: Routing rule status.
        :param pulumi.Input[_builtins.str] name: Routing rule name.
        :param pulumi.Input[_builtins.float] priority: Priority of the routing rule.
        """
        pulumi.set(__self__, "actions", actions)
        pulumi.set(__self__, "matchers", matchers)
        pulumi.set(__self__, "zone_id", zone_id)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)

    @_builtins.property
    @pulumi.getter
    def actions(self) -> pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleActionArgs']]]:
        """
        List actions patterns.
        """
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleActionArgs']]]):
        pulumi.set(self, "actions", value)

    @_builtins.property
    @pulumi.getter
    def matchers(self) -> pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleMatcherArgs']]]:
        """
        Matching patterns to forward to your actions.
        """
        return pulumi.get(self, "matchers")

    @matchers.setter
    def matchers(self, value: pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleMatcherArgs']]]):
        pulumi.set(self, "matchers", value)

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[_builtins.str]:
        """
        Identifier.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "zone_id", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Routing rule status.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Routing rule name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[_builtins.float]]:
        """
        Priority of the routing rule.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[_builtins.float]]):
        pulumi.set(self, "priority", value)


@pulumi.input_type
class _EmailRoutingRuleState:
    def __init__(__self__, *,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleActionArgs']]]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 matchers: Optional[pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleMatcherArgs']]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 priority: Optional[pulumi.Input[_builtins.float]] = None,
                 tag: Optional[pulumi.Input[_builtins.str]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering EmailRoutingRule resources.
        :param pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleActionArgs']]] actions: List actions patterns.
        :param pulumi.Input[_builtins.bool] enabled: Routing rule status.
        :param pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleMatcherArgs']]] matchers: Matching patterns to forward to your actions.
        :param pulumi.Input[_builtins.str] name: Routing rule name.
        :param pulumi.Input[_builtins.float] priority: Priority of the routing rule.
        :param pulumi.Input[_builtins.str] tag: Routing rule tag. (Deprecated, replaced by routing rule identifier)
        :param pulumi.Input[_builtins.str] zone_id: Identifier.
        """
        if actions is not None:
            pulumi.set(__self__, "actions", actions)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if matchers is not None:
            pulumi.set(__self__, "matchers", matchers)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if tag is not None:
            warnings.warn("""This attribute is deprecated.""", DeprecationWarning)
            pulumi.log.warn("""tag is deprecated: This attribute is deprecated.""")
        if tag is not None:
            pulumi.set(__self__, "tag", tag)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter
    def actions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleActionArgs']]]]:
        """
        List actions patterns.
        """
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleActionArgs']]]]):
        pulumi.set(self, "actions", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Routing rule status.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter
    def matchers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleMatcherArgs']]]]:
        """
        Matching patterns to forward to your actions.
        """
        return pulumi.get(self, "matchers")

    @matchers.setter
    def matchers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EmailRoutingRuleMatcherArgs']]]]):
        pulumi.set(self, "matchers", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Routing rule name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[_builtins.float]]:
        """
        Priority of the routing rule.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[_builtins.float]]):
        pulumi.set(self, "priority", value)

    @_builtins.property
    @pulumi.getter
    @_utilities.deprecated("""This attribute is deprecated.""")
    def tag(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Routing rule tag. (Deprecated, replaced by routing rule identifier)
        """
        return pulumi.get(self, "tag")

    @tag.setter
    def tag(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "tag", value)

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Identifier.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "zone_id", value)


@pulumi.type_token("cloudflare:index/emailRoutingRule:EmailRoutingRule")
class EmailRoutingRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EmailRoutingRuleActionArgs', 'EmailRoutingRuleActionArgsDict']]]]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 matchers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EmailRoutingRuleMatcherArgs', 'EmailRoutingRuleMatcherArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 priority: Optional[pulumi.Input[_builtins.float]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import cloudflare:index/emailRoutingRule:EmailRoutingRule example '<zone_id>/<rule_identifier>'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['EmailRoutingRuleActionArgs', 'EmailRoutingRuleActionArgsDict']]]] actions: List actions patterns.
        :param pulumi.Input[_builtins.bool] enabled: Routing rule status.
        :param pulumi.Input[Sequence[pulumi.Input[Union['EmailRoutingRuleMatcherArgs', 'EmailRoutingRuleMatcherArgsDict']]]] matchers: Matching patterns to forward to your actions.
        :param pulumi.Input[_builtins.str] name: Routing rule name.
        :param pulumi.Input[_builtins.float] priority: Priority of the routing rule.
        :param pulumi.Input[_builtins.str] zone_id: Identifier.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EmailRoutingRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import cloudflare:index/emailRoutingRule:EmailRoutingRule example '<zone_id>/<rule_identifier>'
        ```

        :param str resource_name: The name of the resource.
        :param EmailRoutingRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EmailRoutingRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EmailRoutingRuleActionArgs', 'EmailRoutingRuleActionArgsDict']]]]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 matchers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EmailRoutingRuleMatcherArgs', 'EmailRoutingRuleMatcherArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 priority: Optional[pulumi.Input[_builtins.float]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EmailRoutingRuleArgs.__new__(EmailRoutingRuleArgs)

            if actions is None and not opts.urn:
                raise TypeError("Missing required property 'actions'")
            __props__.__dict__["actions"] = actions
            __props__.__dict__["enabled"] = enabled
            if matchers is None and not opts.urn:
                raise TypeError("Missing required property 'matchers'")
            __props__.__dict__["matchers"] = matchers
            __props__.__dict__["name"] = name
            __props__.__dict__["priority"] = priority
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["tag"] = None
        super(EmailRoutingRule, __self__).__init__(
            'cloudflare:index/emailRoutingRule:EmailRoutingRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            actions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EmailRoutingRuleActionArgs', 'EmailRoutingRuleActionArgsDict']]]]] = None,
            enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            matchers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EmailRoutingRuleMatcherArgs', 'EmailRoutingRuleMatcherArgsDict']]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            priority: Optional[pulumi.Input[_builtins.float]] = None,
            tag: Optional[pulumi.Input[_builtins.str]] = None,
            zone_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'EmailRoutingRule':
        """
        Get an existing EmailRoutingRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['EmailRoutingRuleActionArgs', 'EmailRoutingRuleActionArgsDict']]]] actions: List actions patterns.
        :param pulumi.Input[_builtins.bool] enabled: Routing rule status.
        :param pulumi.Input[Sequence[pulumi.Input[Union['EmailRoutingRuleMatcherArgs', 'EmailRoutingRuleMatcherArgsDict']]]] matchers: Matching patterns to forward to your actions.
        :param pulumi.Input[_builtins.str] name: Routing rule name.
        :param pulumi.Input[_builtins.float] priority: Priority of the routing rule.
        :param pulumi.Input[_builtins.str] tag: Routing rule tag. (Deprecated, replaced by routing rule identifier)
        :param pulumi.Input[_builtins.str] zone_id: Identifier.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EmailRoutingRuleState.__new__(_EmailRoutingRuleState)

        __props__.__dict__["actions"] = actions
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["matchers"] = matchers
        __props__.__dict__["name"] = name
        __props__.__dict__["priority"] = priority
        __props__.__dict__["tag"] = tag
        __props__.__dict__["zone_id"] = zone_id
        return EmailRoutingRule(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def actions(self) -> pulumi.Output[Sequence['outputs.EmailRoutingRuleAction']]:
        """
        List actions patterns.
        """
        return pulumi.get(self, "actions")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[_builtins.bool]:
        """
        Routing rule status.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter
    def matchers(self) -> pulumi.Output[Sequence['outputs.EmailRoutingRuleMatcher']]:
        """
        Matching patterns to forward to your actions.
        """
        return pulumi.get(self, "matchers")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Routing rule name.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def priority(self) -> pulumi.Output[_builtins.float]:
        """
        Priority of the routing rule.
        """
        return pulumi.get(self, "priority")

    @_builtins.property
    @pulumi.getter
    @_utilities.deprecated("""This attribute is deprecated.""")
    def tag(self) -> pulumi.Output[_builtins.str]:
        """
        Routing rule tag. (Deprecated, replaced by routing rule identifier)
        """
        return pulumi.get(self, "tag")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[_builtins.str]:
        """
        Identifier.
        """
        return pulumi.get(self, "zone_id")

