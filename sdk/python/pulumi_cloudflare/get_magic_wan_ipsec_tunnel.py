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
    'GetMagicWanIpsecTunnelResult',
    'AwaitableGetMagicWanIpsecTunnelResult',
    'get_magic_wan_ipsec_tunnel',
    'get_magic_wan_ipsec_tunnel_output',
]

@pulumi.output_type
class GetMagicWanIpsecTunnelResult:
    """
    A collection of values returned by getMagicWanIpsecTunnel.
    """
    def __init__(__self__, account_id=None, id=None, ipsec_tunnel=None, ipsec_tunnel_id=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ipsec_tunnel and not isinstance(ipsec_tunnel, dict):
            raise TypeError("Expected argument 'ipsec_tunnel' to be a dict")
        pulumi.set(__self__, "ipsec_tunnel", ipsec_tunnel)
        if ipsec_tunnel_id and not isinstance(ipsec_tunnel_id, str):
            raise TypeError("Expected argument 'ipsec_tunnel_id' to be a str")
        pulumi.set(__self__, "ipsec_tunnel_id", ipsec_tunnel_id)

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
    @pulumi.getter(name="ipsecTunnel")
    def ipsec_tunnel(self) -> 'outputs.GetMagicWanIpsecTunnelIpsecTunnelResult':
        return pulumi.get(self, "ipsec_tunnel")

    @_builtins.property
    @pulumi.getter(name="ipsecTunnelId")
    def ipsec_tunnel_id(self) -> _builtins.str:
        """
        Identifier
        """
        return pulumi.get(self, "ipsec_tunnel_id")


class AwaitableGetMagicWanIpsecTunnelResult(GetMagicWanIpsecTunnelResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMagicWanIpsecTunnelResult(
            account_id=self.account_id,
            id=self.id,
            ipsec_tunnel=self.ipsec_tunnel,
            ipsec_tunnel_id=self.ipsec_tunnel_id)


def get_magic_wan_ipsec_tunnel(account_id: Optional[_builtins.str] = None,
                               ipsec_tunnel_id: Optional[_builtins.str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMagicWanIpsecTunnelResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_magic_wan_ipsec_tunnel = cloudflare.get_magic_wan_ipsec_tunnel(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        ipsec_tunnel_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str account_id: Identifier
    :param _builtins.str ipsec_tunnel_id: Identifier
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['ipsecTunnelId'] = ipsec_tunnel_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getMagicWanIpsecTunnel:getMagicWanIpsecTunnel', __args__, opts=opts, typ=GetMagicWanIpsecTunnelResult).value

    return AwaitableGetMagicWanIpsecTunnelResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        id=pulumi.get(__ret__, 'id'),
        ipsec_tunnel=pulumi.get(__ret__, 'ipsec_tunnel'),
        ipsec_tunnel_id=pulumi.get(__ret__, 'ipsec_tunnel_id'))
def get_magic_wan_ipsec_tunnel_output(account_id: Optional[pulumi.Input[_builtins.str]] = None,
                                      ipsec_tunnel_id: Optional[pulumi.Input[_builtins.str]] = None,
                                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetMagicWanIpsecTunnelResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_magic_wan_ipsec_tunnel = cloudflare.get_magic_wan_ipsec_tunnel(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        ipsec_tunnel_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str account_id: Identifier
    :param _builtins.str ipsec_tunnel_id: Identifier
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['ipsecTunnelId'] = ipsec_tunnel_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getMagicWanIpsecTunnel:getMagicWanIpsecTunnel', __args__, opts=opts, typ=GetMagicWanIpsecTunnelResult)
    return __ret__.apply(lambda __response__: GetMagicWanIpsecTunnelResult(
        account_id=pulumi.get(__response__, 'account_id'),
        id=pulumi.get(__response__, 'id'),
        ipsec_tunnel=pulumi.get(__response__, 'ipsec_tunnel'),
        ipsec_tunnel_id=pulumi.get(__response__, 'ipsec_tunnel_id')))
