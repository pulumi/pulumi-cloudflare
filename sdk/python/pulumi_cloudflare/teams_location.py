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

__all__ = ['TeamsLocationArgs', 'TeamsLocation']

@pulumi.input_type
class TeamsLocationArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[_builtins.str],
                 name: pulumi.Input[_builtins.str],
                 client_default: Optional[pulumi.Input[_builtins.bool]] = None,
                 dns_destination_ips_id: Optional[pulumi.Input[_builtins.str]] = None,
                 ecs_support: Optional[pulumi.Input[_builtins.bool]] = None,
                 endpoints: Optional[pulumi.Input['TeamsLocationEndpointsArgs']] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input['TeamsLocationNetworkArgs']]]] = None):
        """
        The set of arguments for constructing a TeamsLocation resource.
        :param pulumi.Input[_builtins.str] name: The name of the location.
        :param pulumi.Input[_builtins.bool] client_default: True if the location is the default location.
        :param pulumi.Input[_builtins.str] dns_destination_ips_id: The identifier of the pair of IPv4 addresses assigned to this location. When creating a location, if this field is absent or set with null, the pair of shared IPv4 addresses (0e4a32c6-6fb8-4858-9296-98f51631e8e6) is auto-assigned. When updating a location, if the field is absent or set with null, the pre-assigned pair remains unchanged.
        :param pulumi.Input[_builtins.bool] ecs_support: True if the location needs to resolve EDNS queries.
        :param pulumi.Input['TeamsLocationEndpointsArgs'] endpoints: The destination endpoints configured for this location. When updating a location, if this field is absent or set with null, the endpoints configuration remains unchanged.
        :param pulumi.Input[Sequence[pulumi.Input['TeamsLocationNetworkArgs']]] networks: A list of network ranges that requests from this location would originate from. A non-empty list is only effective if the ipv4 endpoint is enabled for this location.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "name", name)
        if client_default is not None:
            pulumi.set(__self__, "client_default", client_default)
        if dns_destination_ips_id is not None:
            pulumi.set(__self__, "dns_destination_ips_id", dns_destination_ips_id)
        if ecs_support is not None:
            pulumi.set(__self__, "ecs_support", ecs_support)
        if endpoints is not None:
            pulumi.set(__self__, "endpoints", endpoints)
        if networks is not None:
            pulumi.set(__self__, "networks", networks)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[_builtins.str]:
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the location.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="clientDefault")
    def client_default(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        True if the location is the default location.
        """
        return pulumi.get(self, "client_default")

    @client_default.setter
    def client_default(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "client_default", value)

    @_builtins.property
    @pulumi.getter(name="dnsDestinationIpsId")
    def dns_destination_ips_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The identifier of the pair of IPv4 addresses assigned to this location. When creating a location, if this field is absent or set with null, the pair of shared IPv4 addresses (0e4a32c6-6fb8-4858-9296-98f51631e8e6) is auto-assigned. When updating a location, if the field is absent or set with null, the pre-assigned pair remains unchanged.
        """
        return pulumi.get(self, "dns_destination_ips_id")

    @dns_destination_ips_id.setter
    def dns_destination_ips_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dns_destination_ips_id", value)

    @_builtins.property
    @pulumi.getter(name="ecsSupport")
    def ecs_support(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        True if the location needs to resolve EDNS queries.
        """
        return pulumi.get(self, "ecs_support")

    @ecs_support.setter
    def ecs_support(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "ecs_support", value)

    @_builtins.property
    @pulumi.getter
    def endpoints(self) -> Optional[pulumi.Input['TeamsLocationEndpointsArgs']]:
        """
        The destination endpoints configured for this location. When updating a location, if this field is absent or set with null, the endpoints configuration remains unchanged.
        """
        return pulumi.get(self, "endpoints")

    @endpoints.setter
    def endpoints(self, value: Optional[pulumi.Input['TeamsLocationEndpointsArgs']]):
        pulumi.set(self, "endpoints", value)

    @_builtins.property
    @pulumi.getter
    def networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TeamsLocationNetworkArgs']]]]:
        """
        A list of network ranges that requests from this location would originate from. A non-empty list is only effective if the ipv4 endpoint is enabled for this location.
        """
        return pulumi.get(self, "networks")

    @networks.setter
    def networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TeamsLocationNetworkArgs']]]]):
        pulumi.set(self, "networks", value)


@pulumi.input_type
class _TeamsLocationState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 client_default: Optional[pulumi.Input[_builtins.bool]] = None,
                 created_at: Optional[pulumi.Input[_builtins.str]] = None,
                 dns_destination_ips_id: Optional[pulumi.Input[_builtins.str]] = None,
                 dns_destination_ipv6_block_id: Optional[pulumi.Input[_builtins.str]] = None,
                 doh_subdomain: Optional[pulumi.Input[_builtins.str]] = None,
                 ecs_support: Optional[pulumi.Input[_builtins.bool]] = None,
                 endpoints: Optional[pulumi.Input['TeamsLocationEndpointsArgs']] = None,
                 ip: Optional[pulumi.Input[_builtins.str]] = None,
                 ipv4_destination: Optional[pulumi.Input[_builtins.str]] = None,
                 ipv4_destination_backup: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input['TeamsLocationNetworkArgs']]]] = None,
                 updated_at: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering TeamsLocation resources.
        :param pulumi.Input[_builtins.bool] client_default: True if the location is the default location.
        :param pulumi.Input[_builtins.str] dns_destination_ips_id: The identifier of the pair of IPv4 addresses assigned to this location. When creating a location, if this field is absent or set with null, the pair of shared IPv4 addresses (0e4a32c6-6fb8-4858-9296-98f51631e8e6) is auto-assigned. When updating a location, if the field is absent or set with null, the pre-assigned pair remains unchanged.
        :param pulumi.Input[_builtins.str] dns_destination_ipv6_block_id: The uuid identifier of the IPv6 block brought to the gateway, so that this location's IPv6 address is allocated from the Bring Your Own Ipv6(BYOIPv6) block and not from the standard CloudFlare IPv6 block.
        :param pulumi.Input[_builtins.str] doh_subdomain: The DNS over HTTPS domain to send DNS requests to. This field is auto-generated by Gateway.
        :param pulumi.Input[_builtins.bool] ecs_support: True if the location needs to resolve EDNS queries.
        :param pulumi.Input['TeamsLocationEndpointsArgs'] endpoints: The destination endpoints configured for this location. When updating a location, if this field is absent or set with null, the endpoints configuration remains unchanged.
        :param pulumi.Input[_builtins.str] ip: IPV6 destination ip assigned to this location. DNS requests sent to this IP will counted as the request under this location. This field is auto-generated by Gateway.
        :param pulumi.Input[_builtins.str] ipv4_destination: The primary destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
        :param pulumi.Input[_builtins.str] ipv4_destination_backup: The backup destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
        :param pulumi.Input[_builtins.str] name: The name of the location.
        :param pulumi.Input[Sequence[pulumi.Input['TeamsLocationNetworkArgs']]] networks: A list of network ranges that requests from this location would originate from. A non-empty list is only effective if the ipv4 endpoint is enabled for this location.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if client_default is not None:
            pulumi.set(__self__, "client_default", client_default)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if dns_destination_ips_id is not None:
            pulumi.set(__self__, "dns_destination_ips_id", dns_destination_ips_id)
        if dns_destination_ipv6_block_id is not None:
            pulumi.set(__self__, "dns_destination_ipv6_block_id", dns_destination_ipv6_block_id)
        if doh_subdomain is not None:
            pulumi.set(__self__, "doh_subdomain", doh_subdomain)
        if ecs_support is not None:
            pulumi.set(__self__, "ecs_support", ecs_support)
        if endpoints is not None:
            pulumi.set(__self__, "endpoints", endpoints)
        if ip is not None:
            pulumi.set(__self__, "ip", ip)
        if ipv4_destination is not None:
            pulumi.set(__self__, "ipv4_destination", ipv4_destination)
        if ipv4_destination_backup is not None:
            pulumi.set(__self__, "ipv4_destination_backup", ipv4_destination_backup)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if networks is not None:
            pulumi.set(__self__, "networks", networks)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter(name="clientDefault")
    def client_default(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        True if the location is the default location.
        """
        return pulumi.get(self, "client_default")

    @client_default.setter
    def client_default(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "client_default", value)

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "created_at", value)

    @_builtins.property
    @pulumi.getter(name="dnsDestinationIpsId")
    def dns_destination_ips_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The identifier of the pair of IPv4 addresses assigned to this location. When creating a location, if this field is absent or set with null, the pair of shared IPv4 addresses (0e4a32c6-6fb8-4858-9296-98f51631e8e6) is auto-assigned. When updating a location, if the field is absent or set with null, the pre-assigned pair remains unchanged.
        """
        return pulumi.get(self, "dns_destination_ips_id")

    @dns_destination_ips_id.setter
    def dns_destination_ips_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dns_destination_ips_id", value)

    @_builtins.property
    @pulumi.getter(name="dnsDestinationIpv6BlockId")
    def dns_destination_ipv6_block_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The uuid identifier of the IPv6 block brought to the gateway, so that this location's IPv6 address is allocated from the Bring Your Own Ipv6(BYOIPv6) block and not from the standard CloudFlare IPv6 block.
        """
        return pulumi.get(self, "dns_destination_ipv6_block_id")

    @dns_destination_ipv6_block_id.setter
    def dns_destination_ipv6_block_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dns_destination_ipv6_block_id", value)

    @_builtins.property
    @pulumi.getter(name="dohSubdomain")
    def doh_subdomain(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The DNS over HTTPS domain to send DNS requests to. This field is auto-generated by Gateway.
        """
        return pulumi.get(self, "doh_subdomain")

    @doh_subdomain.setter
    def doh_subdomain(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "doh_subdomain", value)

    @_builtins.property
    @pulumi.getter(name="ecsSupport")
    def ecs_support(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        True if the location needs to resolve EDNS queries.
        """
        return pulumi.get(self, "ecs_support")

    @ecs_support.setter
    def ecs_support(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "ecs_support", value)

    @_builtins.property
    @pulumi.getter
    def endpoints(self) -> Optional[pulumi.Input['TeamsLocationEndpointsArgs']]:
        """
        The destination endpoints configured for this location. When updating a location, if this field is absent or set with null, the endpoints configuration remains unchanged.
        """
        return pulumi.get(self, "endpoints")

    @endpoints.setter
    def endpoints(self, value: Optional[pulumi.Input['TeamsLocationEndpointsArgs']]):
        pulumi.set(self, "endpoints", value)

    @_builtins.property
    @pulumi.getter
    def ip(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        IPV6 destination ip assigned to this location. DNS requests sent to this IP will counted as the request under this location. This field is auto-generated by Gateway.
        """
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "ip", value)

    @_builtins.property
    @pulumi.getter(name="ipv4Destination")
    def ipv4_destination(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The primary destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
        """
        return pulumi.get(self, "ipv4_destination")

    @ipv4_destination.setter
    def ipv4_destination(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "ipv4_destination", value)

    @_builtins.property
    @pulumi.getter(name="ipv4DestinationBackup")
    def ipv4_destination_backup(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The backup destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
        """
        return pulumi.get(self, "ipv4_destination_backup")

    @ipv4_destination_backup.setter
    def ipv4_destination_backup(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "ipv4_destination_backup", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the location.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TeamsLocationNetworkArgs']]]]:
        """
        A list of network ranges that requests from this location would originate from. A non-empty list is only effective if the ipv4 endpoint is enabled for this location.
        """
        return pulumi.get(self, "networks")

    @networks.setter
    def networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TeamsLocationNetworkArgs']]]]):
        pulumi.set(self, "networks", value)

    @_builtins.property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "updated_at", value)


warnings.warn("""cloudflare.index/teamslocation.TeamsLocation has been deprecated in favor of cloudflare.index/zerotrustdnslocation.ZeroTrustDnsLocation""", DeprecationWarning)


@pulumi.type_token("cloudflare:index/teamsLocation:TeamsLocation")
class TeamsLocation(pulumi.CustomResource):
    warnings.warn("""cloudflare.index/teamslocation.TeamsLocation has been deprecated in favor of cloudflare.index/zerotrustdnslocation.ZeroTrustDnsLocation""", DeprecationWarning)

    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 client_default: Optional[pulumi.Input[_builtins.bool]] = None,
                 dns_destination_ips_id: Optional[pulumi.Input[_builtins.str]] = None,
                 ecs_support: Optional[pulumi.Input[_builtins.bool]] = None,
                 endpoints: Optional[pulumi.Input[Union['TeamsLocationEndpointsArgs', 'TeamsLocationEndpointsArgsDict']]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TeamsLocationNetworkArgs', 'TeamsLocationNetworkArgsDict']]]]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_zero_trust_dns_location = cloudflare.ZeroTrustDnsLocation("example_zero_trust_dns_location",
            account_id="699d98642c564d2e855e9661899b7252",
            name="Austin Office Location",
            client_default=False,
            dns_destination_ips_id="0e4a32c6-6fb8-4858-9296-98f51631e8e6",
            ecs_support=False,
            endpoints={
                "doh": {
                    "enabled": True,
                    "networks": [{
                        "network": "2001:85a3::/64",
                    }],
                    "require_token": True,
                },
                "dot": {
                    "enabled": True,
                    "networks": [{
                        "network": "2001:85a3::/64",
                    }],
                },
                "ipv4": {
                    "enabled": True,
                },
                "ipv6": {
                    "enabled": True,
                    "networks": [{
                        "network": "2001:85a3::/64",
                    }],
                },
            },
            networks=[{
                "network": "192.0.2.1/32",
            }])
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/teamsLocation:TeamsLocation example '<account_id>/<location_id>'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] client_default: True if the location is the default location.
        :param pulumi.Input[_builtins.str] dns_destination_ips_id: The identifier of the pair of IPv4 addresses assigned to this location. When creating a location, if this field is absent or set with null, the pair of shared IPv4 addresses (0e4a32c6-6fb8-4858-9296-98f51631e8e6) is auto-assigned. When updating a location, if the field is absent or set with null, the pre-assigned pair remains unchanged.
        :param pulumi.Input[_builtins.bool] ecs_support: True if the location needs to resolve EDNS queries.
        :param pulumi.Input[Union['TeamsLocationEndpointsArgs', 'TeamsLocationEndpointsArgsDict']] endpoints: The destination endpoints configured for this location. When updating a location, if this field is absent or set with null, the endpoints configuration remains unchanged.
        :param pulumi.Input[_builtins.str] name: The name of the location.
        :param pulumi.Input[Sequence[pulumi.Input[Union['TeamsLocationNetworkArgs', 'TeamsLocationNetworkArgsDict']]]] networks: A list of network ranges that requests from this location would originate from. A non-empty list is only effective if the ipv4 endpoint is enabled for this location.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TeamsLocationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_zero_trust_dns_location = cloudflare.ZeroTrustDnsLocation("example_zero_trust_dns_location",
            account_id="699d98642c564d2e855e9661899b7252",
            name="Austin Office Location",
            client_default=False,
            dns_destination_ips_id="0e4a32c6-6fb8-4858-9296-98f51631e8e6",
            ecs_support=False,
            endpoints={
                "doh": {
                    "enabled": True,
                    "networks": [{
                        "network": "2001:85a3::/64",
                    }],
                    "require_token": True,
                },
                "dot": {
                    "enabled": True,
                    "networks": [{
                        "network": "2001:85a3::/64",
                    }],
                },
                "ipv4": {
                    "enabled": True,
                },
                "ipv6": {
                    "enabled": True,
                    "networks": [{
                        "network": "2001:85a3::/64",
                    }],
                },
            },
            networks=[{
                "network": "192.0.2.1/32",
            }])
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/teamsLocation:TeamsLocation example '<account_id>/<location_id>'
        ```

        :param str resource_name: The name of the resource.
        :param TeamsLocationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TeamsLocationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 client_default: Optional[pulumi.Input[_builtins.bool]] = None,
                 dns_destination_ips_id: Optional[pulumi.Input[_builtins.str]] = None,
                 ecs_support: Optional[pulumi.Input[_builtins.bool]] = None,
                 endpoints: Optional[pulumi.Input[Union['TeamsLocationEndpointsArgs', 'TeamsLocationEndpointsArgsDict']]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TeamsLocationNetworkArgs', 'TeamsLocationNetworkArgsDict']]]]] = None,
                 __props__=None):
        pulumi.log.warn("""TeamsLocation is deprecated: cloudflare.index/teamslocation.TeamsLocation has been deprecated in favor of cloudflare.index/zerotrustdnslocation.ZeroTrustDnsLocation""")
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TeamsLocationArgs.__new__(TeamsLocationArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["client_default"] = client_default
            __props__.__dict__["dns_destination_ips_id"] = dns_destination_ips_id
            __props__.__dict__["ecs_support"] = ecs_support
            __props__.__dict__["endpoints"] = endpoints
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["networks"] = networks
            __props__.__dict__["created_at"] = None
            __props__.__dict__["dns_destination_ipv6_block_id"] = None
            __props__.__dict__["doh_subdomain"] = None
            __props__.__dict__["ip"] = None
            __props__.__dict__["ipv4_destination"] = None
            __props__.__dict__["ipv4_destination_backup"] = None
            __props__.__dict__["updated_at"] = None
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="cloudflare:index/teamsLocation:TeamsLocation")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(TeamsLocation, __self__).__init__(
            'cloudflare:index/teamsLocation:TeamsLocation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[_builtins.str]] = None,
            client_default: Optional[pulumi.Input[_builtins.bool]] = None,
            created_at: Optional[pulumi.Input[_builtins.str]] = None,
            dns_destination_ips_id: Optional[pulumi.Input[_builtins.str]] = None,
            dns_destination_ipv6_block_id: Optional[pulumi.Input[_builtins.str]] = None,
            doh_subdomain: Optional[pulumi.Input[_builtins.str]] = None,
            ecs_support: Optional[pulumi.Input[_builtins.bool]] = None,
            endpoints: Optional[pulumi.Input[Union['TeamsLocationEndpointsArgs', 'TeamsLocationEndpointsArgsDict']]] = None,
            ip: Optional[pulumi.Input[_builtins.str]] = None,
            ipv4_destination: Optional[pulumi.Input[_builtins.str]] = None,
            ipv4_destination_backup: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            networks: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TeamsLocationNetworkArgs', 'TeamsLocationNetworkArgsDict']]]]] = None,
            updated_at: Optional[pulumi.Input[_builtins.str]] = None) -> 'TeamsLocation':
        """
        Get an existing TeamsLocation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] client_default: True if the location is the default location.
        :param pulumi.Input[_builtins.str] dns_destination_ips_id: The identifier of the pair of IPv4 addresses assigned to this location. When creating a location, if this field is absent or set with null, the pair of shared IPv4 addresses (0e4a32c6-6fb8-4858-9296-98f51631e8e6) is auto-assigned. When updating a location, if the field is absent or set with null, the pre-assigned pair remains unchanged.
        :param pulumi.Input[_builtins.str] dns_destination_ipv6_block_id: The uuid identifier of the IPv6 block brought to the gateway, so that this location's IPv6 address is allocated from the Bring Your Own Ipv6(BYOIPv6) block and not from the standard CloudFlare IPv6 block.
        :param pulumi.Input[_builtins.str] doh_subdomain: The DNS over HTTPS domain to send DNS requests to. This field is auto-generated by Gateway.
        :param pulumi.Input[_builtins.bool] ecs_support: True if the location needs to resolve EDNS queries.
        :param pulumi.Input[Union['TeamsLocationEndpointsArgs', 'TeamsLocationEndpointsArgsDict']] endpoints: The destination endpoints configured for this location. When updating a location, if this field is absent or set with null, the endpoints configuration remains unchanged.
        :param pulumi.Input[_builtins.str] ip: IPV6 destination ip assigned to this location. DNS requests sent to this IP will counted as the request under this location. This field is auto-generated by Gateway.
        :param pulumi.Input[_builtins.str] ipv4_destination: The primary destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
        :param pulumi.Input[_builtins.str] ipv4_destination_backup: The backup destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
        :param pulumi.Input[_builtins.str] name: The name of the location.
        :param pulumi.Input[Sequence[pulumi.Input[Union['TeamsLocationNetworkArgs', 'TeamsLocationNetworkArgsDict']]]] networks: A list of network ranges that requests from this location would originate from. A non-empty list is only effective if the ipv4 endpoint is enabled for this location.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TeamsLocationState.__new__(_TeamsLocationState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["client_default"] = client_default
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["dns_destination_ips_id"] = dns_destination_ips_id
        __props__.__dict__["dns_destination_ipv6_block_id"] = dns_destination_ipv6_block_id
        __props__.__dict__["doh_subdomain"] = doh_subdomain
        __props__.__dict__["ecs_support"] = ecs_support
        __props__.__dict__["endpoints"] = endpoints
        __props__.__dict__["ip"] = ip
        __props__.__dict__["ipv4_destination"] = ipv4_destination
        __props__.__dict__["ipv4_destination_backup"] = ipv4_destination_backup
        __props__.__dict__["name"] = name
        __props__.__dict__["networks"] = networks
        __props__.__dict__["updated_at"] = updated_at
        return TeamsLocation(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="clientDefault")
    def client_default(self) -> pulumi.Output[_builtins.bool]:
        """
        True if the location is the default location.
        """
        return pulumi.get(self, "client_default")

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "created_at")

    @_builtins.property
    @pulumi.getter(name="dnsDestinationIpsId")
    def dns_destination_ips_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The identifier of the pair of IPv4 addresses assigned to this location. When creating a location, if this field is absent or set with null, the pair of shared IPv4 addresses (0e4a32c6-6fb8-4858-9296-98f51631e8e6) is auto-assigned. When updating a location, if the field is absent or set with null, the pre-assigned pair remains unchanged.
        """
        return pulumi.get(self, "dns_destination_ips_id")

    @_builtins.property
    @pulumi.getter(name="dnsDestinationIpv6BlockId")
    def dns_destination_ipv6_block_id(self) -> pulumi.Output[_builtins.str]:
        """
        The uuid identifier of the IPv6 block brought to the gateway, so that this location's IPv6 address is allocated from the Bring Your Own Ipv6(BYOIPv6) block and not from the standard CloudFlare IPv6 block.
        """
        return pulumi.get(self, "dns_destination_ipv6_block_id")

    @_builtins.property
    @pulumi.getter(name="dohSubdomain")
    def doh_subdomain(self) -> pulumi.Output[_builtins.str]:
        """
        The DNS over HTTPS domain to send DNS requests to. This field is auto-generated by Gateway.
        """
        return pulumi.get(self, "doh_subdomain")

    @_builtins.property
    @pulumi.getter(name="ecsSupport")
    def ecs_support(self) -> pulumi.Output[_builtins.bool]:
        """
        True if the location needs to resolve EDNS queries.
        """
        return pulumi.get(self, "ecs_support")

    @_builtins.property
    @pulumi.getter
    def endpoints(self) -> pulumi.Output[Optional['outputs.TeamsLocationEndpoints']]:
        """
        The destination endpoints configured for this location. When updating a location, if this field is absent or set with null, the endpoints configuration remains unchanged.
        """
        return pulumi.get(self, "endpoints")

    @_builtins.property
    @pulumi.getter
    def ip(self) -> pulumi.Output[_builtins.str]:
        """
        IPV6 destination ip assigned to this location. DNS requests sent to this IP will counted as the request under this location. This field is auto-generated by Gateway.
        """
        return pulumi.get(self, "ip")

    @_builtins.property
    @pulumi.getter(name="ipv4Destination")
    def ipv4_destination(self) -> pulumi.Output[_builtins.str]:
        """
        The primary destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
        """
        return pulumi.get(self, "ipv4_destination")

    @_builtins.property
    @pulumi.getter(name="ipv4DestinationBackup")
    def ipv4_destination_backup(self) -> pulumi.Output[_builtins.str]:
        """
        The backup destination IPv4 address from the pair identified by the dns*destination*ips_id. This field is read-only.
        """
        return pulumi.get(self, "ipv4_destination_backup")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the location.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def networks(self) -> pulumi.Output[Optional[Sequence['outputs.TeamsLocationNetwork']]]:
        """
        A list of network ranges that requests from this location would originate from. A non-empty list is only effective if the ipv4 endpoint is enabled for this location.
        """
        return pulumi.get(self, "networks")

    @_builtins.property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "updated_at")

