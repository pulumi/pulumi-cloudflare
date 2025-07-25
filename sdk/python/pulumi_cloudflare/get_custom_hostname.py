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
    'GetCustomHostnameResult',
    'AwaitableGetCustomHostnameResult',
    'get_custom_hostname',
    'get_custom_hostname_output',
]

@pulumi.output_type
class GetCustomHostnameResult:
    """
    A collection of values returned by getCustomHostname.
    """
    def __init__(__self__, created_at=None, custom_hostname_id=None, custom_metadata=None, custom_origin_server=None, custom_origin_sni=None, filter=None, hostname=None, id=None, ownership_verification=None, ownership_verification_http=None, ssl=None, status=None, verification_errors=None, zone_id=None):
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if custom_hostname_id and not isinstance(custom_hostname_id, str):
            raise TypeError("Expected argument 'custom_hostname_id' to be a str")
        pulumi.set(__self__, "custom_hostname_id", custom_hostname_id)
        if custom_metadata and not isinstance(custom_metadata, dict):
            raise TypeError("Expected argument 'custom_metadata' to be a dict")
        pulumi.set(__self__, "custom_metadata", custom_metadata)
        if custom_origin_server and not isinstance(custom_origin_server, str):
            raise TypeError("Expected argument 'custom_origin_server' to be a str")
        pulumi.set(__self__, "custom_origin_server", custom_origin_server)
        if custom_origin_sni and not isinstance(custom_origin_sni, str):
            raise TypeError("Expected argument 'custom_origin_sni' to be a str")
        pulumi.set(__self__, "custom_origin_sni", custom_origin_sni)
        if filter and not isinstance(filter, dict):
            raise TypeError("Expected argument 'filter' to be a dict")
        pulumi.set(__self__, "filter", filter)
        if hostname and not isinstance(hostname, str):
            raise TypeError("Expected argument 'hostname' to be a str")
        pulumi.set(__self__, "hostname", hostname)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ownership_verification and not isinstance(ownership_verification, dict):
            raise TypeError("Expected argument 'ownership_verification' to be a dict")
        pulumi.set(__self__, "ownership_verification", ownership_verification)
        if ownership_verification_http and not isinstance(ownership_verification_http, dict):
            raise TypeError("Expected argument 'ownership_verification_http' to be a dict")
        pulumi.set(__self__, "ownership_verification_http", ownership_verification_http)
        if ssl and not isinstance(ssl, dict):
            raise TypeError("Expected argument 'ssl' to be a dict")
        pulumi.set(__self__, "ssl", ssl)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if verification_errors and not isinstance(verification_errors, list):
            raise TypeError("Expected argument 'verification_errors' to be a list")
        pulumi.set(__self__, "verification_errors", verification_errors)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> _builtins.str:
        """
        This is the time the hostname was created.
        """
        return pulumi.get(self, "created_at")

    @_builtins.property
    @pulumi.getter(name="customHostnameId")
    def custom_hostname_id(self) -> Optional[_builtins.str]:
        """
        Identifier.
        """
        return pulumi.get(self, "custom_hostname_id")

    @_builtins.property
    @pulumi.getter(name="customMetadata")
    def custom_metadata(self) -> Mapping[str, _builtins.str]:
        """
        Unique key/value metadata for this hostname. These are per-hostname (customer) settings.
        """
        return pulumi.get(self, "custom_metadata")

    @_builtins.property
    @pulumi.getter(name="customOriginServer")
    def custom_origin_server(self) -> _builtins.str:
        """
        a valid hostname that’s been added to your DNS zone as an A, AAAA, or CNAME record.
        """
        return pulumi.get(self, "custom_origin_server")

    @_builtins.property
    @pulumi.getter(name="customOriginSni")
    def custom_origin_sni(self) -> _builtins.str:
        """
        A hostname that will be sent to your custom origin server as SNI for TLS handshake. This can be a valid subdomain of the zone or custom origin server name or the string ':request*host*header:' which will cause the host header in the request to be used as SNI. Not configurable with default/fallback origin server.
        """
        return pulumi.get(self, "custom_origin_sni")

    @_builtins.property
    @pulumi.getter
    def filter(self) -> Optional['outputs.GetCustomHostnameFilterResult']:
        return pulumi.get(self, "filter")

    @_builtins.property
    @pulumi.getter
    def hostname(self) -> _builtins.str:
        """
        The custom hostname that will point to your hostname via CNAME.
        """
        return pulumi.get(self, "hostname")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        Identifier.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="ownershipVerification")
    def ownership_verification(self) -> 'outputs.GetCustomHostnameOwnershipVerificationResult':
        """
        This is a record which can be placed to activate a hostname.
        """
        return pulumi.get(self, "ownership_verification")

    @_builtins.property
    @pulumi.getter(name="ownershipVerificationHttp")
    def ownership_verification_http(self) -> 'outputs.GetCustomHostnameOwnershipVerificationHttpResult':
        """
        This presents the token to be served by the given http url to activate a hostname.
        """
        return pulumi.get(self, "ownership_verification_http")

    @_builtins.property
    @pulumi.getter
    def ssl(self) -> 'outputs.GetCustomHostnameSslResult':
        return pulumi.get(self, "ssl")

    @_builtins.property
    @pulumi.getter
    def status(self) -> _builtins.str:
        """
        Status of the hostname's activation.
        Available values: "active", "pending", "active*redeploying", "moved", "pending*deletion", "deleted", "pending*blocked", "pending*migration", "pending*provisioned", "test*pending", "test*active", "test*active*apex", "test*blocked", "test_failed", "provisioned", "blocked".
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter(name="verificationErrors")
    def verification_errors(self) -> Sequence[_builtins.str]:
        """
        These are errors that were encountered while trying to activate a hostname.
        """
        return pulumi.get(self, "verification_errors")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> _builtins.str:
        """
        Identifier.
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetCustomHostnameResult(GetCustomHostnameResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCustomHostnameResult(
            created_at=self.created_at,
            custom_hostname_id=self.custom_hostname_id,
            custom_metadata=self.custom_metadata,
            custom_origin_server=self.custom_origin_server,
            custom_origin_sni=self.custom_origin_sni,
            filter=self.filter,
            hostname=self.hostname,
            id=self.id,
            ownership_verification=self.ownership_verification,
            ownership_verification_http=self.ownership_verification_http,
            ssl=self.ssl,
            status=self.status,
            verification_errors=self.verification_errors,
            zone_id=self.zone_id)


def get_custom_hostname(custom_hostname_id: Optional[_builtins.str] = None,
                        filter: Optional[Union['GetCustomHostnameFilterArgs', 'GetCustomHostnameFilterArgsDict']] = None,
                        zone_id: Optional[_builtins.str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCustomHostnameResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_custom_hostname = cloudflare.get_custom_hostname(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        custom_hostname_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str custom_hostname_id: Identifier.
    :param _builtins.str zone_id: Identifier.
    """
    __args__ = dict()
    __args__['customHostnameId'] = custom_hostname_id
    __args__['filter'] = filter
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getCustomHostname:getCustomHostname', __args__, opts=opts, typ=GetCustomHostnameResult).value

    return AwaitableGetCustomHostnameResult(
        created_at=pulumi.get(__ret__, 'created_at'),
        custom_hostname_id=pulumi.get(__ret__, 'custom_hostname_id'),
        custom_metadata=pulumi.get(__ret__, 'custom_metadata'),
        custom_origin_server=pulumi.get(__ret__, 'custom_origin_server'),
        custom_origin_sni=pulumi.get(__ret__, 'custom_origin_sni'),
        filter=pulumi.get(__ret__, 'filter'),
        hostname=pulumi.get(__ret__, 'hostname'),
        id=pulumi.get(__ret__, 'id'),
        ownership_verification=pulumi.get(__ret__, 'ownership_verification'),
        ownership_verification_http=pulumi.get(__ret__, 'ownership_verification_http'),
        ssl=pulumi.get(__ret__, 'ssl'),
        status=pulumi.get(__ret__, 'status'),
        verification_errors=pulumi.get(__ret__, 'verification_errors'),
        zone_id=pulumi.get(__ret__, 'zone_id'))
def get_custom_hostname_output(custom_hostname_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                               filter: Optional[pulumi.Input[Optional[Union['GetCustomHostnameFilterArgs', 'GetCustomHostnameFilterArgsDict']]]] = None,
                               zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                               opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetCustomHostnameResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_custom_hostname = cloudflare.get_custom_hostname(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        custom_hostname_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str custom_hostname_id: Identifier.
    :param _builtins.str zone_id: Identifier.
    """
    __args__ = dict()
    __args__['customHostnameId'] = custom_hostname_id
    __args__['filter'] = filter
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getCustomHostname:getCustomHostname', __args__, opts=opts, typ=GetCustomHostnameResult)
    return __ret__.apply(lambda __response__: GetCustomHostnameResult(
        created_at=pulumi.get(__response__, 'created_at'),
        custom_hostname_id=pulumi.get(__response__, 'custom_hostname_id'),
        custom_metadata=pulumi.get(__response__, 'custom_metadata'),
        custom_origin_server=pulumi.get(__response__, 'custom_origin_server'),
        custom_origin_sni=pulumi.get(__response__, 'custom_origin_sni'),
        filter=pulumi.get(__response__, 'filter'),
        hostname=pulumi.get(__response__, 'hostname'),
        id=pulumi.get(__response__, 'id'),
        ownership_verification=pulumi.get(__response__, 'ownership_verification'),
        ownership_verification_http=pulumi.get(__response__, 'ownership_verification_http'),
        ssl=pulumi.get(__response__, 'ssl'),
        status=pulumi.get(__response__, 'status'),
        verification_errors=pulumi.get(__response__, 'verification_errors'),
        zone_id=pulumi.get(__response__, 'zone_id')))
