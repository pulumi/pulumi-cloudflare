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
    'GetZeroTrustTunnelCloudflaredVirtualNetworkResult',
    'AwaitableGetZeroTrustTunnelCloudflaredVirtualNetworkResult',
    'get_zero_trust_tunnel_cloudflared_virtual_network',
    'get_zero_trust_tunnel_cloudflared_virtual_network_output',
]

@pulumi.output_type
class GetZeroTrustTunnelCloudflaredVirtualNetworkResult:
    """
    A collection of values returned by getZeroTrustTunnelCloudflaredVirtualNetwork.
    """
    def __init__(__self__, account_id=None, comment=None, created_at=None, deleted_at=None, filter=None, id=None, is_default_network=None, name=None, virtual_network_id=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if comment and not isinstance(comment, str):
            raise TypeError("Expected argument 'comment' to be a str")
        pulumi.set(__self__, "comment", comment)
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if deleted_at and not isinstance(deleted_at, str):
            raise TypeError("Expected argument 'deleted_at' to be a str")
        pulumi.set(__self__, "deleted_at", deleted_at)
        if filter and not isinstance(filter, dict):
            raise TypeError("Expected argument 'filter' to be a dict")
        pulumi.set(__self__, "filter", filter)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if is_default_network and not isinstance(is_default_network, bool):
            raise TypeError("Expected argument 'is_default_network' to be a bool")
        pulumi.set(__self__, "is_default_network", is_default_network)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if virtual_network_id and not isinstance(virtual_network_id, str):
            raise TypeError("Expected argument 'virtual_network_id' to be a str")
        pulumi.set(__self__, "virtual_network_id", virtual_network_id)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> _builtins.str:
        """
        Cloudflare account ID
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter
    def comment(self) -> _builtins.str:
        """
        Optional remark describing the virtual network.
        """
        return pulumi.get(self, "comment")

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> _builtins.str:
        """
        Timestamp of when the resource was created.
        """
        return pulumi.get(self, "created_at")

    @_builtins.property
    @pulumi.getter(name="deletedAt")
    def deleted_at(self) -> _builtins.str:
        """
        Timestamp of when the resource was deleted. If `null`, the resource has not been deleted.
        """
        return pulumi.get(self, "deleted_at")

    @_builtins.property
    @pulumi.getter
    def filter(self) -> Optional['outputs.GetZeroTrustTunnelCloudflaredVirtualNetworkFilterResult']:
        return pulumi.get(self, "filter")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        UUID of the virtual network.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="isDefaultNetwork")
    def is_default_network(self) -> _builtins.bool:
        """
        If `true`, this virtual network is the default for the account.
        """
        return pulumi.get(self, "is_default_network")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        A user-friendly name for the virtual network.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="virtualNetworkId")
    def virtual_network_id(self) -> Optional[_builtins.str]:
        """
        UUID of the virtual network.
        """
        return pulumi.get(self, "virtual_network_id")


class AwaitableGetZeroTrustTunnelCloudflaredVirtualNetworkResult(GetZeroTrustTunnelCloudflaredVirtualNetworkResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetZeroTrustTunnelCloudflaredVirtualNetworkResult(
            account_id=self.account_id,
            comment=self.comment,
            created_at=self.created_at,
            deleted_at=self.deleted_at,
            filter=self.filter,
            id=self.id,
            is_default_network=self.is_default_network,
            name=self.name,
            virtual_network_id=self.virtual_network_id)


def get_zero_trust_tunnel_cloudflared_virtual_network(account_id: Optional[_builtins.str] = None,
                                                      filter: Optional[Union['GetZeroTrustTunnelCloudflaredVirtualNetworkFilterArgs', 'GetZeroTrustTunnelCloudflaredVirtualNetworkFilterArgsDict']] = None,
                                                      virtual_network_id: Optional[_builtins.str] = None,
                                                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetZeroTrustTunnelCloudflaredVirtualNetworkResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_zero_trust_tunnel_cloudflared_virtual_network = cloudflare.get_zero_trust_tunnel_cloudflared_virtual_network(account_id="699d98642c564d2e855e9661899b7252",
        virtual_network_id="f70ff985-a4ef-4643-bbbc-4a0ed4fc8415")
    ```


    :param _builtins.str account_id: Cloudflare account ID
    :param _builtins.str virtual_network_id: UUID of the virtual network.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['filter'] = filter
    __args__['virtualNetworkId'] = virtual_network_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getZeroTrustTunnelCloudflaredVirtualNetwork:getZeroTrustTunnelCloudflaredVirtualNetwork', __args__, opts=opts, typ=GetZeroTrustTunnelCloudflaredVirtualNetworkResult).value

    return AwaitableGetZeroTrustTunnelCloudflaredVirtualNetworkResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        comment=pulumi.get(__ret__, 'comment'),
        created_at=pulumi.get(__ret__, 'created_at'),
        deleted_at=pulumi.get(__ret__, 'deleted_at'),
        filter=pulumi.get(__ret__, 'filter'),
        id=pulumi.get(__ret__, 'id'),
        is_default_network=pulumi.get(__ret__, 'is_default_network'),
        name=pulumi.get(__ret__, 'name'),
        virtual_network_id=pulumi.get(__ret__, 'virtual_network_id'))
def get_zero_trust_tunnel_cloudflared_virtual_network_output(account_id: Optional[pulumi.Input[_builtins.str]] = None,
                                                             filter: Optional[pulumi.Input[Optional[Union['GetZeroTrustTunnelCloudflaredVirtualNetworkFilterArgs', 'GetZeroTrustTunnelCloudflaredVirtualNetworkFilterArgsDict']]]] = None,
                                                             virtual_network_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                                             opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetZeroTrustTunnelCloudflaredVirtualNetworkResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_zero_trust_tunnel_cloudflared_virtual_network = cloudflare.get_zero_trust_tunnel_cloudflared_virtual_network(account_id="699d98642c564d2e855e9661899b7252",
        virtual_network_id="f70ff985-a4ef-4643-bbbc-4a0ed4fc8415")
    ```


    :param _builtins.str account_id: Cloudflare account ID
    :param _builtins.str virtual_network_id: UUID of the virtual network.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['filter'] = filter
    __args__['virtualNetworkId'] = virtual_network_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getZeroTrustTunnelCloudflaredVirtualNetwork:getZeroTrustTunnelCloudflaredVirtualNetwork', __args__, opts=opts, typ=GetZeroTrustTunnelCloudflaredVirtualNetworkResult)
    return __ret__.apply(lambda __response__: GetZeroTrustTunnelCloudflaredVirtualNetworkResult(
        account_id=pulumi.get(__response__, 'account_id'),
        comment=pulumi.get(__response__, 'comment'),
        created_at=pulumi.get(__response__, 'created_at'),
        deleted_at=pulumi.get(__response__, 'deleted_at'),
        filter=pulumi.get(__response__, 'filter'),
        id=pulumi.get(__response__, 'id'),
        is_default_network=pulumi.get(__response__, 'is_default_network'),
        name=pulumi.get(__response__, 'name'),
        virtual_network_id=pulumi.get(__response__, 'virtual_network_id')))
