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
    'GetZeroTrustDnsLocationResult',
    'AwaitableGetZeroTrustDnsLocationResult',
    'get_zero_trust_dns_location',
    'get_zero_trust_dns_location_output',
]

@pulumi.output_type
class GetZeroTrustDnsLocationResult:
    """
    A collection of values returned by getZeroTrustDnsLocation.
    """
    def __init__(__self__, account_id=None, client_default=None, created_at=None, dns_destination_ips_id=None, dns_destination_ipv6_block_id=None, doh_subdomain=None, ecs_support=None, endpoints=None, id=None, ip=None, ipv4_destination=None, ipv4_destination_backup=None, location_id=None, name=None, networks=None, updated_at=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if client_default and not isinstance(client_default, bool):
            raise TypeError("Expected argument 'client_default' to be a bool")
        pulumi.set(__self__, "client_default", client_default)
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if dns_destination_ips_id and not isinstance(dns_destination_ips_id, str):
            raise TypeError("Expected argument 'dns_destination_ips_id' to be a str")
        pulumi.set(__self__, "dns_destination_ips_id", dns_destination_ips_id)
        if dns_destination_ipv6_block_id and not isinstance(dns_destination_ipv6_block_id, str):
            raise TypeError("Expected argument 'dns_destination_ipv6_block_id' to be a str")
        pulumi.set(__self__, "dns_destination_ipv6_block_id", dns_destination_ipv6_block_id)
        if doh_subdomain and not isinstance(doh_subdomain, str):
            raise TypeError("Expected argument 'doh_subdomain' to be a str")
        pulumi.set(__self__, "doh_subdomain", doh_subdomain)
        if ecs_support and not isinstance(ecs_support, bool):
            raise TypeError("Expected argument 'ecs_support' to be a bool")
        pulumi.set(__self__, "ecs_support", ecs_support)
        if endpoints and not isinstance(endpoints, dict):
            raise TypeError("Expected argument 'endpoints' to be a dict")
        pulumi.set(__self__, "endpoints", endpoints)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip and not isinstance(ip, str):
            raise TypeError("Expected argument 'ip' to be a str")
        pulumi.set(__self__, "ip", ip)
        if ipv4_destination and not isinstance(ipv4_destination, str):
            raise TypeError("Expected argument 'ipv4_destination' to be a str")
        pulumi.set(__self__, "ipv4_destination", ipv4_destination)
        if ipv4_destination_backup and not isinstance(ipv4_destination_backup, str):
            raise TypeError("Expected argument 'ipv4_destination_backup' to be a str")
        pulumi.set(__self__, "ipv4_destination_backup", ipv4_destination_backup)
        if location_id and not isinstance(location_id, str):
            raise TypeError("Expected argument 'location_id' to be a str")
        pulumi.set(__self__, "location_id", location_id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if networks and not isinstance(networks, list):
            raise TypeError("Expected argument 'networks' to be a list")
        pulumi.set(__self__, "networks", networks)
        if updated_at and not isinstance(updated_at, str):
            raise TypeError("Expected argument 'updated_at' to be a str")
        pulumi.set(__self__, "updated_at", updated_at)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> _builtins.str:
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="clientDefault")
    def client_default(self) -> _builtins.bool:
        """
        True if the location is the default location.
        """
        return pulumi.get(self, "client_default")

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> _builtins.str:
        return pulumi.get(self, "created_at")

    @_builtins.property
    @pulumi.getter(name="dnsDestinationIpsId")
    def dns_destination_ips_id(self) -> _builtins.str:
        """
        The identifier of the pair of IPv4 addresses assigned to this location.
        """
        return pulumi.get(self, "dns_destination_ips_id")

    @_builtins.property
    @pulumi.getter(name="dnsDestinationIpv6BlockId")
    def dns_destination_ipv6_block_id(self) -> _builtins.str:
        """
        The uuid identifier of the IPv6 block brought to the gateway, so that this location's IPv6 address is allocated from the Bring Your Own Ipv6(BYOIPv6) block and not from the standard CloudFlare IPv6 block.
        """
        return pulumi.get(self, "dns_destination_ipv6_block_id")

    @_builtins.property
    @pulumi.getter(name="dohSubdomain")
    def doh_subdomain(self) -> _builtins.str:
        """
        The DNS over HTTPS domain to send DNS requests to. This field is auto-generated by Gateway.
        """
        return pulumi.get(self, "doh_subdomain")

    @_builtins.property
    @pulumi.getter(name="ecsSupport")
    def ecs_support(self) -> _builtins.bool:
        """
        True if the location needs to resolve EDNS queries.
        """
        return pulumi.get(self, "ecs_support")

    @_builtins.property
    @pulumi.getter
    def endpoints(self) -> 'outputs.GetZeroTrustDnsLocationEndpointsResult':
        """
        The destination endpoints configured for this location. When updating a location, if this field is absent or set with null, the endpoints configuration remains unchanged.
        """
        return pulumi.get(self, "endpoints")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The ID of this resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def ip(self) -> _builtins.str:
        """
        IPV6 destination ip assigned to this location. DNS requests sent to this IP will counted as the request under this location. This field is auto-generated by Gateway.
        """
        return pulumi.get(self, "ip")

    @_builtins.property
    @pulumi.getter(name="ipv4Destination")
    def ipv4_destination(self) -> _builtins.str:
        """
        The primary destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
        """
        return pulumi.get(self, "ipv4_destination")

    @_builtins.property
    @pulumi.getter(name="ipv4DestinationBackup")
    def ipv4_destination_backup(self) -> _builtins.str:
        """
        The backup destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
        """
        return pulumi.get(self, "ipv4_destination_backup")

    @_builtins.property
    @pulumi.getter(name="locationId")
    def location_id(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "location_id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The name of the location.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def networks(self) -> Sequence['outputs.GetZeroTrustDnsLocationNetworkResult']:
        """
        A list of network ranges that requests from this location would originate from. A non-empty list is only effective if the ipv4 endpoint is enabled for this location.
        """
        return pulumi.get(self, "networks")

    @_builtins.property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> _builtins.str:
        return pulumi.get(self, "updated_at")


class AwaitableGetZeroTrustDnsLocationResult(GetZeroTrustDnsLocationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetZeroTrustDnsLocationResult(
            account_id=self.account_id,
            client_default=self.client_default,
            created_at=self.created_at,
            dns_destination_ips_id=self.dns_destination_ips_id,
            dns_destination_ipv6_block_id=self.dns_destination_ipv6_block_id,
            doh_subdomain=self.doh_subdomain,
            ecs_support=self.ecs_support,
            endpoints=self.endpoints,
            id=self.id,
            ip=self.ip,
            ipv4_destination=self.ipv4_destination,
            ipv4_destination_backup=self.ipv4_destination_backup,
            location_id=self.location_id,
            name=self.name,
            networks=self.networks,
            updated_at=self.updated_at)


def get_zero_trust_dns_location(account_id: Optional[_builtins.str] = None,
                                location_id: Optional[_builtins.str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetZeroTrustDnsLocationResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_zero_trust_dns_location = cloudflare.get_zero_trust_dns_location(account_id="699d98642c564d2e855e9661899b7252",
        location_id="ed35569b41ce4d1facfe683550f54086")
    ```
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['locationId'] = location_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getZeroTrustDnsLocation:getZeroTrustDnsLocation', __args__, opts=opts, typ=GetZeroTrustDnsLocationResult).value

    return AwaitableGetZeroTrustDnsLocationResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        client_default=pulumi.get(__ret__, 'client_default'),
        created_at=pulumi.get(__ret__, 'created_at'),
        dns_destination_ips_id=pulumi.get(__ret__, 'dns_destination_ips_id'),
        dns_destination_ipv6_block_id=pulumi.get(__ret__, 'dns_destination_ipv6_block_id'),
        doh_subdomain=pulumi.get(__ret__, 'doh_subdomain'),
        ecs_support=pulumi.get(__ret__, 'ecs_support'),
        endpoints=pulumi.get(__ret__, 'endpoints'),
        id=pulumi.get(__ret__, 'id'),
        ip=pulumi.get(__ret__, 'ip'),
        ipv4_destination=pulumi.get(__ret__, 'ipv4_destination'),
        ipv4_destination_backup=pulumi.get(__ret__, 'ipv4_destination_backup'),
        location_id=pulumi.get(__ret__, 'location_id'),
        name=pulumi.get(__ret__, 'name'),
        networks=pulumi.get(__ret__, 'networks'),
        updated_at=pulumi.get(__ret__, 'updated_at'))
def get_zero_trust_dns_location_output(account_id: Optional[pulumi.Input[_builtins.str]] = None,
                                       location_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetZeroTrustDnsLocationResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_zero_trust_dns_location = cloudflare.get_zero_trust_dns_location(account_id="699d98642c564d2e855e9661899b7252",
        location_id="ed35569b41ce4d1facfe683550f54086")
    ```
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['locationId'] = location_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getZeroTrustDnsLocation:getZeroTrustDnsLocation', __args__, opts=opts, typ=GetZeroTrustDnsLocationResult)
    return __ret__.apply(lambda __response__: GetZeroTrustDnsLocationResult(
        account_id=pulumi.get(__response__, 'account_id'),
        client_default=pulumi.get(__response__, 'client_default'),
        created_at=pulumi.get(__response__, 'created_at'),
        dns_destination_ips_id=pulumi.get(__response__, 'dns_destination_ips_id'),
        dns_destination_ipv6_block_id=pulumi.get(__response__, 'dns_destination_ipv6_block_id'),
        doh_subdomain=pulumi.get(__response__, 'doh_subdomain'),
        ecs_support=pulumi.get(__response__, 'ecs_support'),
        endpoints=pulumi.get(__response__, 'endpoints'),
        id=pulumi.get(__response__, 'id'),
        ip=pulumi.get(__response__, 'ip'),
        ipv4_destination=pulumi.get(__response__, 'ipv4_destination'),
        ipv4_destination_backup=pulumi.get(__response__, 'ipv4_destination_backup'),
        location_id=pulumi.get(__response__, 'location_id'),
        name=pulumi.get(__response__, 'name'),
        networks=pulumi.get(__response__, 'networks'),
        updated_at=pulumi.get(__response__, 'updated_at')))
