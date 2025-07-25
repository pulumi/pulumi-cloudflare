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

__all__ = [
    'GetEmailRoutingRuleResult',
    'AwaitableGetEmailRoutingRuleResult',
    'get_email_routing_rule',
    'get_email_routing_rule_output',
]

@pulumi.output_type
class GetEmailRoutingRuleResult:
    """
    A collection of values returned by getEmailRoutingRule.
    """
    def __init__(__self__, actions=None, enabled=None, filter=None, id=None, matchers=None, name=None, priority=None, rule_identifier=None, tag=None, zone_id=None):
        if actions and not isinstance(actions, list):
            raise TypeError("Expected argument 'actions' to be a list")
        pulumi.set(__self__, "actions", actions)
        if enabled and not isinstance(enabled, bool):
            raise TypeError("Expected argument 'enabled' to be a bool")
        pulumi.set(__self__, "enabled", enabled)
        if filter and not isinstance(filter, dict):
            raise TypeError("Expected argument 'filter' to be a dict")
        pulumi.set(__self__, "filter", filter)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if matchers and not isinstance(matchers, list):
            raise TypeError("Expected argument 'matchers' to be a list")
        pulumi.set(__self__, "matchers", matchers)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if priority and not isinstance(priority, float):
            raise TypeError("Expected argument 'priority' to be a float")
        pulumi.set(__self__, "priority", priority)
        if rule_identifier and not isinstance(rule_identifier, str):
            raise TypeError("Expected argument 'rule_identifier' to be a str")
        pulumi.set(__self__, "rule_identifier", rule_identifier)
        if tag and not isinstance(tag, str):
            raise TypeError("Expected argument 'tag' to be a str")
        pulumi.set(__self__, "tag", tag)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter
    def actions(self) -> Sequence['outputs.GetEmailRoutingRuleActionResult']:
        """
        List actions patterns.
        """
        return pulumi.get(self, "actions")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> _builtins.bool:
        """
        Routing rule status.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter
    def filter(self) -> Optional['outputs.GetEmailRoutingRuleFilterResult']:
        return pulumi.get(self, "filter")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        Routing rule identifier.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def matchers(self) -> Sequence['outputs.GetEmailRoutingRuleMatcherResult']:
        """
        Matching patterns to forward to your actions.
        """
        return pulumi.get(self, "matchers")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        Routing rule name.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def priority(self) -> _builtins.float:
        """
        Priority of the routing rule.
        """
        return pulumi.get(self, "priority")

    @_builtins.property
    @pulumi.getter(name="ruleIdentifier")
    def rule_identifier(self) -> Optional[_builtins.str]:
        """
        Routing rule identifier.
        """
        return pulumi.get(self, "rule_identifier")

    @_builtins.property
    @pulumi.getter
    @_utilities.deprecated("""This attribute is deprecated.""")
    def tag(self) -> _builtins.str:
        """
        Routing rule tag. (Deprecated, replaced by routing rule identifier)
        """
        return pulumi.get(self, "tag")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> _builtins.str:
        """
        Identifier.
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetEmailRoutingRuleResult(GetEmailRoutingRuleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEmailRoutingRuleResult(
            actions=self.actions,
            enabled=self.enabled,
            filter=self.filter,
            id=self.id,
            matchers=self.matchers,
            name=self.name,
            priority=self.priority,
            rule_identifier=self.rule_identifier,
            tag=self.tag,
            zone_id=self.zone_id)


def get_email_routing_rule(filter: Optional[Union['GetEmailRoutingRuleFilterArgs', 'GetEmailRoutingRuleFilterArgsDict']] = None,
                           rule_identifier: Optional[_builtins.str] = None,
                           zone_id: Optional[_builtins.str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEmailRoutingRuleResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_email_routing_rule = cloudflare.get_email_routing_rule(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        rule_identifier="a7e6fb77503c41d8a7f3113c6918f10c")
    ```


    :param _builtins.str rule_identifier: Routing rule identifier.
    :param _builtins.str zone_id: Identifier.
    """
    __args__ = dict()
    __args__['filter'] = filter
    __args__['ruleIdentifier'] = rule_identifier
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getEmailRoutingRule:getEmailRoutingRule', __args__, opts=opts, typ=GetEmailRoutingRuleResult).value

    return AwaitableGetEmailRoutingRuleResult(
        actions=pulumi.get(__ret__, 'actions'),
        enabled=pulumi.get(__ret__, 'enabled'),
        filter=pulumi.get(__ret__, 'filter'),
        id=pulumi.get(__ret__, 'id'),
        matchers=pulumi.get(__ret__, 'matchers'),
        name=pulumi.get(__ret__, 'name'),
        priority=pulumi.get(__ret__, 'priority'),
        rule_identifier=pulumi.get(__ret__, 'rule_identifier'),
        tag=pulumi.get(__ret__, 'tag'),
        zone_id=pulumi.get(__ret__, 'zone_id'))
def get_email_routing_rule_output(filter: Optional[pulumi.Input[Optional[Union['GetEmailRoutingRuleFilterArgs', 'GetEmailRoutingRuleFilterArgsDict']]]] = None,
                                  rule_identifier: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                  zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetEmailRoutingRuleResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_email_routing_rule = cloudflare.get_email_routing_rule(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        rule_identifier="a7e6fb77503c41d8a7f3113c6918f10c")
    ```


    :param _builtins.str rule_identifier: Routing rule identifier.
    :param _builtins.str zone_id: Identifier.
    """
    __args__ = dict()
    __args__['filter'] = filter
    __args__['ruleIdentifier'] = rule_identifier
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getEmailRoutingRule:getEmailRoutingRule', __args__, opts=opts, typ=GetEmailRoutingRuleResult)
    return __ret__.apply(lambda __response__: GetEmailRoutingRuleResult(
        actions=pulumi.get(__response__, 'actions'),
        enabled=pulumi.get(__response__, 'enabled'),
        filter=pulumi.get(__response__, 'filter'),
        id=pulumi.get(__response__, 'id'),
        matchers=pulumi.get(__response__, 'matchers'),
        name=pulumi.get(__response__, 'name'),
        priority=pulumi.get(__response__, 'priority'),
        rule_identifier=pulumi.get(__response__, 'rule_identifier'),
        tag=pulumi.get(__response__, 'tag'),
        zone_id=pulumi.get(__response__, 'zone_id')))
