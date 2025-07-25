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
    'GetMagicTransitSiteLanResult',
    'AwaitableGetMagicTransitSiteLanResult',
    'get_magic_transit_site_lan',
    'get_magic_transit_site_lan_output',
]

@pulumi.output_type
class GetMagicTransitSiteLanResult:
    """
    A collection of values returned by getMagicTransitSiteLan.
    """
    def __init__(__self__, account_id=None, ha_link=None, id=None, lan_id=None, name=None, nat=None, physport=None, routed_subnets=None, site_id=None, static_addressing=None, vlan_tag=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if ha_link and not isinstance(ha_link, bool):
            raise TypeError("Expected argument 'ha_link' to be a bool")
        pulumi.set(__self__, "ha_link", ha_link)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if lan_id and not isinstance(lan_id, str):
            raise TypeError("Expected argument 'lan_id' to be a str")
        pulumi.set(__self__, "lan_id", lan_id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if nat and not isinstance(nat, dict):
            raise TypeError("Expected argument 'nat' to be a dict")
        pulumi.set(__self__, "nat", nat)
        if physport and not isinstance(physport, int):
            raise TypeError("Expected argument 'physport' to be a int")
        pulumi.set(__self__, "physport", physport)
        if routed_subnets and not isinstance(routed_subnets, list):
            raise TypeError("Expected argument 'routed_subnets' to be a list")
        pulumi.set(__self__, "routed_subnets", routed_subnets)
        if site_id and not isinstance(site_id, str):
            raise TypeError("Expected argument 'site_id' to be a str")
        pulumi.set(__self__, "site_id", site_id)
        if static_addressing and not isinstance(static_addressing, dict):
            raise TypeError("Expected argument 'static_addressing' to be a dict")
        pulumi.set(__self__, "static_addressing", static_addressing)
        if vlan_tag and not isinstance(vlan_tag, int):
            raise TypeError("Expected argument 'vlan_tag' to be a int")
        pulumi.set(__self__, "vlan_tag", vlan_tag)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> _builtins.str:
        """
        Identifier
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="haLink")
    def ha_link(self) -> _builtins.bool:
        """
        mark true to use this LAN for HA probing. only works for site with HA turned on. only one LAN can be set as the ha_link.
        """
        return pulumi.get(self, "ha_link")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        Identifier
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="lanId")
    def lan_id(self) -> Optional[_builtins.str]:
        """
        Identifier
        """
        return pulumi.get(self, "lan_id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def nat(self) -> 'outputs.GetMagicTransitSiteLanNatResult':
        return pulumi.get(self, "nat")

    @_builtins.property
    @pulumi.getter
    def physport(self) -> _builtins.int:
        return pulumi.get(self, "physport")

    @_builtins.property
    @pulumi.getter(name="routedSubnets")
    def routed_subnets(self) -> Sequence['outputs.GetMagicTransitSiteLanRoutedSubnetResult']:
        return pulumi.get(self, "routed_subnets")

    @_builtins.property
    @pulumi.getter(name="siteId")
    def site_id(self) -> _builtins.str:
        """
        Identifier
        """
        return pulumi.get(self, "site_id")

    @_builtins.property
    @pulumi.getter(name="staticAddressing")
    def static_addressing(self) -> 'outputs.GetMagicTransitSiteLanStaticAddressingResult':
        """
        If the site is not configured in high availability mode, this configuration is optional (if omitted, use DHCP). However, if in high availability mode, static*address is required along with secondary and virtual address.
        """
        return pulumi.get(self, "static_addressing")

    @_builtins.property
    @pulumi.getter(name="vlanTag")
    def vlan_tag(self) -> _builtins.int:
        """
        VLAN ID. Use zero for untagged.
        """
        return pulumi.get(self, "vlan_tag")


class AwaitableGetMagicTransitSiteLanResult(GetMagicTransitSiteLanResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMagicTransitSiteLanResult(
            account_id=self.account_id,
            ha_link=self.ha_link,
            id=self.id,
            lan_id=self.lan_id,
            name=self.name,
            nat=self.nat,
            physport=self.physport,
            routed_subnets=self.routed_subnets,
            site_id=self.site_id,
            static_addressing=self.static_addressing,
            vlan_tag=self.vlan_tag)


def get_magic_transit_site_lan(account_id: Optional[_builtins.str] = None,
                               lan_id: Optional[_builtins.str] = None,
                               site_id: Optional[_builtins.str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMagicTransitSiteLanResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_magic_transit_site_lan = cloudflare.get_magic_transit_site_lan(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        site_id="023e105f4ecef8ad9ca31a8372d0c353",
        lan_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str account_id: Identifier
    :param _builtins.str lan_id: Identifier
    :param _builtins.str site_id: Identifier
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['lanId'] = lan_id
    __args__['siteId'] = site_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getMagicTransitSiteLan:getMagicTransitSiteLan', __args__, opts=opts, typ=GetMagicTransitSiteLanResult).value

    return AwaitableGetMagicTransitSiteLanResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        ha_link=pulumi.get(__ret__, 'ha_link'),
        id=pulumi.get(__ret__, 'id'),
        lan_id=pulumi.get(__ret__, 'lan_id'),
        name=pulumi.get(__ret__, 'name'),
        nat=pulumi.get(__ret__, 'nat'),
        physport=pulumi.get(__ret__, 'physport'),
        routed_subnets=pulumi.get(__ret__, 'routed_subnets'),
        site_id=pulumi.get(__ret__, 'site_id'),
        static_addressing=pulumi.get(__ret__, 'static_addressing'),
        vlan_tag=pulumi.get(__ret__, 'vlan_tag'))
def get_magic_transit_site_lan_output(account_id: Optional[pulumi.Input[_builtins.str]] = None,
                                      lan_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                      site_id: Optional[pulumi.Input[_builtins.str]] = None,
                                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetMagicTransitSiteLanResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_magic_transit_site_lan = cloudflare.get_magic_transit_site_lan(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        site_id="023e105f4ecef8ad9ca31a8372d0c353",
        lan_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str account_id: Identifier
    :param _builtins.str lan_id: Identifier
    :param _builtins.str site_id: Identifier
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['lanId'] = lan_id
    __args__['siteId'] = site_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getMagicTransitSiteLan:getMagicTransitSiteLan', __args__, opts=opts, typ=GetMagicTransitSiteLanResult)
    return __ret__.apply(lambda __response__: GetMagicTransitSiteLanResult(
        account_id=pulumi.get(__response__, 'account_id'),
        ha_link=pulumi.get(__response__, 'ha_link'),
        id=pulumi.get(__response__, 'id'),
        lan_id=pulumi.get(__response__, 'lan_id'),
        name=pulumi.get(__response__, 'name'),
        nat=pulumi.get(__response__, 'nat'),
        physport=pulumi.get(__response__, 'physport'),
        routed_subnets=pulumi.get(__response__, 'routed_subnets'),
        site_id=pulumi.get(__response__, 'site_id'),
        static_addressing=pulumi.get(__response__, 'static_addressing'),
        vlan_tag=pulumi.get(__response__, 'vlan_tag')))
