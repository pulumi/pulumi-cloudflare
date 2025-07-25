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

__all__ = [
    'GetMagicWanStaticRouteResult',
    'AwaitableGetMagicWanStaticRouteResult',
    'get_magic_wan_static_route',
    'get_magic_wan_static_route_output',
]

@pulumi.output_type
class GetMagicWanStaticRouteResult:
    """
    A collection of values returned by getMagicWanStaticRoute.
    """
    def __init__(__self__, account_id=None, id=None, route=None, route_id=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if route and not isinstance(route, dict):
            raise TypeError("Expected argument 'route' to be a dict")
        pulumi.set(__self__, "route", route)
        if route_id and not isinstance(route_id, str):
            raise TypeError("Expected argument 'route_id' to be a str")
        pulumi.set(__self__, "route_id", route_id)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> _builtins.str:
        """
        Identifier
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def route(self) -> 'outputs.GetMagicWanStaticRouteRouteResult':
        return pulumi.get(self, "route")

    @_builtins.property
    @pulumi.getter(name="routeId")
    def route_id(self) -> _builtins.str:
        """
        Identifier
        """
        return pulumi.get(self, "route_id")


class AwaitableGetMagicWanStaticRouteResult(GetMagicWanStaticRouteResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMagicWanStaticRouteResult(
            account_id=self.account_id,
            id=self.id,
            route=self.route,
            route_id=self.route_id)


def get_magic_wan_static_route(account_id: Optional[_builtins.str] = None,
                               route_id: Optional[_builtins.str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMagicWanStaticRouteResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_magic_wan_static_route = cloudflare.get_magic_wan_static_route(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        route_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str account_id: Identifier
    :param _builtins.str route_id: Identifier
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['routeId'] = route_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getMagicWanStaticRoute:getMagicWanStaticRoute', __args__, opts=opts, typ=GetMagicWanStaticRouteResult).value

    return AwaitableGetMagicWanStaticRouteResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        id=pulumi.get(__ret__, 'id'),
        route=pulumi.get(__ret__, 'route'),
        route_id=pulumi.get(__ret__, 'route_id'))
def get_magic_wan_static_route_output(account_id: Optional[pulumi.Input[_builtins.str]] = None,
                                      route_id: Optional[pulumi.Input[_builtins.str]] = None,
                                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetMagicWanStaticRouteResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_magic_wan_static_route = cloudflare.get_magic_wan_static_route(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        route_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str account_id: Identifier
    :param _builtins.str route_id: Identifier
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['routeId'] = route_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getMagicWanStaticRoute:getMagicWanStaticRoute', __args__, opts=opts, typ=GetMagicWanStaticRouteResult)
    return __ret__.apply(lambda __response__: GetMagicWanStaticRouteResult(
        account_id=pulumi.get(__response__, 'account_id'),
        id=pulumi.get(__response__, 'id'),
        route=pulumi.get(__response__, 'route'),
        route_id=pulumi.get(__response__, 'route_id')))
