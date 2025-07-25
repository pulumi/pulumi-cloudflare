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
    'GetUrlNormalizationSettingsResult',
    'AwaitableGetUrlNormalizationSettingsResult',
    'get_url_normalization_settings',
    'get_url_normalization_settings_output',
]

@pulumi.output_type
class GetUrlNormalizationSettingsResult:
    """
    A collection of values returned by getUrlNormalizationSettings.
    """
    def __init__(__self__, id=None, scope=None, type=None, zone_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if scope and not isinstance(scope, str):
            raise TypeError("Expected argument 'scope' to be a str")
        pulumi.set(__self__, "scope", scope)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
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
    @pulumi.getter
    def scope(self) -> _builtins.str:
        """
        The scope of the URL normalization.
        Available values: "incoming", "both".
        """
        return pulumi.get(self, "scope")

    @_builtins.property
    @pulumi.getter
    def type(self) -> _builtins.str:
        """
        The type of URL normalization performed by Cloudflare.
        Available values: "cloudflare", "rfc3986".
        """
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> _builtins.str:
        """
        The unique ID of the zone.
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetUrlNormalizationSettingsResult(GetUrlNormalizationSettingsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUrlNormalizationSettingsResult(
            id=self.id,
            scope=self.scope,
            type=self.type,
            zone_id=self.zone_id)


def get_url_normalization_settings(zone_id: Optional[_builtins.str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUrlNormalizationSettingsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_url_normalization_settings = cloudflare.get_url_normalization_settings(zone_id="9f1839b6152d298aca64c4e906b6d074")
    ```


    :param _builtins.str zone_id: The unique ID of the zone.
    """
    __args__ = dict()
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getUrlNormalizationSettings:getUrlNormalizationSettings', __args__, opts=opts, typ=GetUrlNormalizationSettingsResult).value

    return AwaitableGetUrlNormalizationSettingsResult(
        id=pulumi.get(__ret__, 'id'),
        scope=pulumi.get(__ret__, 'scope'),
        type=pulumi.get(__ret__, 'type'),
        zone_id=pulumi.get(__ret__, 'zone_id'))
def get_url_normalization_settings_output(zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetUrlNormalizationSettingsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_url_normalization_settings = cloudflare.get_url_normalization_settings(zone_id="9f1839b6152d298aca64c4e906b6d074")
    ```


    :param _builtins.str zone_id: The unique ID of the zone.
    """
    __args__ = dict()
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getUrlNormalizationSettings:getUrlNormalizationSettings', __args__, opts=opts, typ=GetUrlNormalizationSettingsResult)
    return __ret__.apply(lambda __response__: GetUrlNormalizationSettingsResult(
        id=pulumi.get(__response__, 'id'),
        scope=pulumi.get(__response__, 'scope'),
        type=pulumi.get(__response__, 'type'),
        zone_id=pulumi.get(__response__, 'zone_id')))
