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
    'GetCertificatePackResult',
    'AwaitableGetCertificatePackResult',
    'get_certificate_pack',
    'get_certificate_pack_output',
]

@pulumi.output_type
class GetCertificatePackResult:
    """
    A collection of values returned by getCertificatePack.
    """
    def __init__(__self__, certificate_pack_id=None, id=None, zone_id=None):
        if certificate_pack_id and not isinstance(certificate_pack_id, str):
            raise TypeError("Expected argument 'certificate_pack_id' to be a str")
        pulumi.set(__self__, "certificate_pack_id", certificate_pack_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter(name="certificatePackId")
    def certificate_pack_id(self) -> _builtins.str:
        """
        Identifier.
        """
        return pulumi.get(self, "certificate_pack_id")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> _builtins.str:
        """
        Identifier.
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetCertificatePackResult(GetCertificatePackResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCertificatePackResult(
            certificate_pack_id=self.certificate_pack_id,
            id=self.id,
            zone_id=self.zone_id)


def get_certificate_pack(certificate_pack_id: Optional[_builtins.str] = None,
                         zone_id: Optional[_builtins.str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCertificatePackResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_certificate_pack = cloudflare.get_certificate_pack(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        certificate_pack_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str certificate_pack_id: Identifier.
    :param _builtins.str zone_id: Identifier.
    """
    __args__ = dict()
    __args__['certificatePackId'] = certificate_pack_id
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getCertificatePack:getCertificatePack', __args__, opts=opts, typ=GetCertificatePackResult).value

    return AwaitableGetCertificatePackResult(
        certificate_pack_id=pulumi.get(__ret__, 'certificate_pack_id'),
        id=pulumi.get(__ret__, 'id'),
        zone_id=pulumi.get(__ret__, 'zone_id'))
def get_certificate_pack_output(certificate_pack_id: Optional[pulumi.Input[_builtins.str]] = None,
                                zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetCertificatePackResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_certificate_pack = cloudflare.get_certificate_pack(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        certificate_pack_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str certificate_pack_id: Identifier.
    :param _builtins.str zone_id: Identifier.
    """
    __args__ = dict()
    __args__['certificatePackId'] = certificate_pack_id
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getCertificatePack:getCertificatePack', __args__, opts=opts, typ=GetCertificatePackResult)
    return __ret__.apply(lambda __response__: GetCertificatePackResult(
        certificate_pack_id=pulumi.get(__response__, 'certificate_pack_id'),
        id=pulumi.get(__response__, 'id'),
        zone_id=pulumi.get(__response__, 'zone_id')))
