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

__all__ = ['SnippetRulesArgs', 'SnippetRules']

@pulumi.input_type
class SnippetRulesArgs:
    def __init__(__self__, *,
                 zone_id: pulumi.Input[str],
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['SnippetRulesRuleArgs']]]] = None):
        """
        The set of arguments for constructing a SnippetRules resource.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        :param pulumi.Input[Sequence[pulumi.Input['SnippetRulesRuleArgs']]] rules: List of Snippet Rules
        """
        pulumi.set(__self__, "zone_id", zone_id)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SnippetRulesRuleArgs']]]]:
        """
        List of Snippet Rules
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SnippetRulesRuleArgs']]]]):
        pulumi.set(self, "rules", value)


@pulumi.input_type
class _SnippetRulesState:
    def __init__(__self__, *,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['SnippetRulesRuleArgs']]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SnippetRules resources.
        :param pulumi.Input[Sequence[pulumi.Input['SnippetRulesRuleArgs']]] rules: List of Snippet Rules
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        if rules is not None:
            pulumi.set(__self__, "rules", rules)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SnippetRulesRuleArgs']]]]:
        """
        List of Snippet Rules
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SnippetRulesRuleArgs']]]]):
        pulumi.set(self, "rules", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class SnippetRules(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SnippetRulesRuleArgs', 'SnippetRulesRuleArgsDict']]]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The [Snippet Rules](https://developers.cloudflare.com/rules/snippets/) resource allows you to create and manage snippet rules for a zone.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['SnippetRulesRuleArgs', 'SnippetRulesRuleArgsDict']]]] rules: List of Snippet Rules
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SnippetRulesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The [Snippet Rules](https://developers.cloudflare.com/rules/snippets/) resource allows you to create and manage snippet rules for a zone.

        :param str resource_name: The name of the resource.
        :param SnippetRulesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SnippetRulesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SnippetRulesRuleArgs', 'SnippetRulesRuleArgsDict']]]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SnippetRulesArgs.__new__(SnippetRulesArgs)

            __props__.__dict__["rules"] = rules
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
        super(SnippetRules, __self__).__init__(
            'cloudflare:index/snippetRules:SnippetRules',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SnippetRulesRuleArgs', 'SnippetRulesRuleArgsDict']]]]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'SnippetRules':
        """
        Get an existing SnippetRules resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['SnippetRulesRuleArgs', 'SnippetRulesRuleArgsDict']]]] rules: List of Snippet Rules
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SnippetRulesState.__new__(_SnippetRulesState)

        __props__.__dict__["rules"] = rules
        __props__.__dict__["zone_id"] = zone_id
        return SnippetRules(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Optional[Sequence['outputs.SnippetRulesRule']]]:
        """
        List of Snippet Rules
        """
        return pulumi.get(self, "rules")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")

