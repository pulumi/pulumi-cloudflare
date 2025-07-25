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
    'GetManagedTransformsResult',
    'AwaitableGetManagedTransformsResult',
    'get_managed_transforms',
    'get_managed_transforms_output',
]

@pulumi.output_type
class GetManagedTransformsResult:
    """
    A collection of values returned by getManagedTransforms.
    """
    def __init__(__self__, id=None, managed_request_headers=None, managed_response_headers=None, zone_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if managed_request_headers and not isinstance(managed_request_headers, list):
            raise TypeError("Expected argument 'managed_request_headers' to be a list")
        pulumi.set(__self__, "managed_request_headers", managed_request_headers)
        if managed_response_headers and not isinstance(managed_response_headers, list):
            raise TypeError("Expected argument 'managed_response_headers' to be a list")
        pulumi.set(__self__, "managed_response_headers", managed_response_headers)
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
    @pulumi.getter(name="managedRequestHeaders")
    def managed_request_headers(self) -> Sequence['outputs.GetManagedTransformsManagedRequestHeaderResult']:
        """
        The list of Managed Request Transforms.
        """
        return pulumi.get(self, "managed_request_headers")

    @_builtins.property
    @pulumi.getter(name="managedResponseHeaders")
    def managed_response_headers(self) -> Sequence['outputs.GetManagedTransformsManagedResponseHeaderResult']:
        """
        The list of Managed Response Transforms.
        """
        return pulumi.get(self, "managed_response_headers")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> _builtins.str:
        """
        The unique ID of the zone.
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetManagedTransformsResult(GetManagedTransformsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetManagedTransformsResult(
            id=self.id,
            managed_request_headers=self.managed_request_headers,
            managed_response_headers=self.managed_response_headers,
            zone_id=self.zone_id)


def get_managed_transforms(zone_id: Optional[_builtins.str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetManagedTransformsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_managed_transforms = cloudflare.get_managed_transforms(zone_id="9f1839b6152d298aca64c4e906b6d074")
    ```


    :param _builtins.str zone_id: The unique ID of the zone.
    """
    __args__ = dict()
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getManagedTransforms:getManagedTransforms', __args__, opts=opts, typ=GetManagedTransformsResult).value

    return AwaitableGetManagedTransformsResult(
        id=pulumi.get(__ret__, 'id'),
        managed_request_headers=pulumi.get(__ret__, 'managed_request_headers'),
        managed_response_headers=pulumi.get(__ret__, 'managed_response_headers'),
        zone_id=pulumi.get(__ret__, 'zone_id'))
def get_managed_transforms_output(zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetManagedTransformsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_managed_transforms = cloudflare.get_managed_transforms(zone_id="9f1839b6152d298aca64c4e906b6d074")
    ```


    :param _builtins.str zone_id: The unique ID of the zone.
    """
    __args__ = dict()
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getManagedTransforms:getManagedTransforms', __args__, opts=opts, typ=GetManagedTransformsResult)
    return __ret__.apply(lambda __response__: GetManagedTransformsResult(
        id=pulumi.get(__response__, 'id'),
        managed_request_headers=pulumi.get(__response__, 'managed_request_headers'),
        managed_response_headers=pulumi.get(__response__, 'managed_response_headers'),
        zone_id=pulumi.get(__response__, 'zone_id')))
