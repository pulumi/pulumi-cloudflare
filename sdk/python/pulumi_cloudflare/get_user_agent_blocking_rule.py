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

__all__ = [
    'GetUserAgentBlockingRuleResult',
    'AwaitableGetUserAgentBlockingRuleResult',
    'get_user_agent_blocking_rule',
    'get_user_agent_blocking_rule_output',
]

@pulumi.output_type
class GetUserAgentBlockingRuleResult:
    """
    A collection of values returned by getUserAgentBlockingRule.
    """
    def __init__(__self__, id=None, ua_rule_id=None, zone_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ua_rule_id and not isinstance(ua_rule_id, str):
            raise TypeError("Expected argument 'ua_rule_id' to be a str")
        pulumi.set(__self__, "ua_rule_id", ua_rule_id)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="uaRuleId")
    def ua_rule_id(self) -> _builtins.str:
        """
        The unique identifier of the User Agent Blocking rule.
        """
        return pulumi.get(self, "ua_rule_id")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> _builtins.str:
        """
        Defines an identifier.
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetUserAgentBlockingRuleResult(GetUserAgentBlockingRuleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUserAgentBlockingRuleResult(
            id=self.id,
            ua_rule_id=self.ua_rule_id,
            zone_id=self.zone_id)


def get_user_agent_blocking_rule(ua_rule_id: Optional[_builtins.str] = None,
                                 zone_id: Optional[_builtins.str] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUserAgentBlockingRuleResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_user_agent_blocking_rule = cloudflare.get_user_agent_blocking_rule(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        ua_rule_id="372e67954025e0ba6aaa6d586b9e0b59")
    ```


    :param _builtins.str ua_rule_id: The unique identifier of the User Agent Blocking rule.
    :param _builtins.str zone_id: Defines an identifier.
    """
    __args__ = dict()
    __args__['uaRuleId'] = ua_rule_id
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getUserAgentBlockingRule:getUserAgentBlockingRule', __args__, opts=opts, typ=GetUserAgentBlockingRuleResult).value

    return AwaitableGetUserAgentBlockingRuleResult(
        id=pulumi.get(__ret__, 'id'),
        ua_rule_id=pulumi.get(__ret__, 'ua_rule_id'),
        zone_id=pulumi.get(__ret__, 'zone_id'))
def get_user_agent_blocking_rule_output(ua_rule_id: Optional[pulumi.Input[_builtins.str]] = None,
                                        zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetUserAgentBlockingRuleResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_user_agent_blocking_rule = cloudflare.get_user_agent_blocking_rule(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        ua_rule_id="372e67954025e0ba6aaa6d586b9e0b59")
    ```


    :param _builtins.str ua_rule_id: The unique identifier of the User Agent Blocking rule.
    :param _builtins.str zone_id: Defines an identifier.
    """
    __args__ = dict()
    __args__['uaRuleId'] = ua_rule_id
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getUserAgentBlockingRule:getUserAgentBlockingRule', __args__, opts=opts, typ=GetUserAgentBlockingRuleResult)
    return __ret__.apply(lambda __response__: GetUserAgentBlockingRuleResult(
        id=pulumi.get(__response__, 'id'),
        ua_rule_id=pulumi.get(__response__, 'ua_rule_id'),
        zone_id=pulumi.get(__response__, 'zone_id')))
