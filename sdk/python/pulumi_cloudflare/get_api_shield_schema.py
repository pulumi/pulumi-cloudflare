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
    'GetApiShieldSchemaResult',
    'AwaitableGetApiShieldSchemaResult',
    'get_api_shield_schema',
    'get_api_shield_schema_output',
]

@pulumi.output_type
class GetApiShieldSchemaResult:
    """
    A collection of values returned by getApiShieldSchema.
    """
    def __init__(__self__, created_at=None, id=None, kind=None, name=None, omit_source=None, schema_id=None, source=None, validation_enabled=None, zone_id=None):
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kind and not isinstance(kind, str):
            raise TypeError("Expected argument 'kind' to be a str")
        pulumi.set(__self__, "kind", kind)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if omit_source and not isinstance(omit_source, bool):
            raise TypeError("Expected argument 'omit_source' to be a bool")
        pulumi.set(__self__, "omit_source", omit_source)
        if schema_id and not isinstance(schema_id, str):
            raise TypeError("Expected argument 'schema_id' to be a str")
        pulumi.set(__self__, "schema_id", schema_id)
        if source and not isinstance(source, str):
            raise TypeError("Expected argument 'source' to be a str")
        pulumi.set(__self__, "source", source)
        if validation_enabled and not isinstance(validation_enabled, bool):
            raise TypeError("Expected argument 'validation_enabled' to be a bool")
        pulumi.set(__self__, "validation_enabled", validation_enabled)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> _builtins.str:
        return pulumi.get(self, "created_at")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def kind(self) -> _builtins.str:
        """
        Kind of schema
        Available values: "openapi_v3".
        """
        return pulumi.get(self, "kind")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        Name of the schema
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="omitSource")
    def omit_source(self) -> _builtins.bool:
        """
        Omit the source-files of schemas and only retrieve their meta-data.
        """
        return pulumi.get(self, "omit_source")

    @_builtins.property
    @pulumi.getter(name="schemaId")
    def schema_id(self) -> _builtins.str:
        return pulumi.get(self, "schema_id")

    @_builtins.property
    @pulumi.getter
    def source(self) -> _builtins.str:
        """
        Source of the schema
        """
        return pulumi.get(self, "source")

    @_builtins.property
    @pulumi.getter(name="validationEnabled")
    def validation_enabled(self) -> _builtins.bool:
        """
        Flag whether schema is enabled for validation.
        """
        return pulumi.get(self, "validation_enabled")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> _builtins.str:
        """
        Identifier.
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetApiShieldSchemaResult(GetApiShieldSchemaResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetApiShieldSchemaResult(
            created_at=self.created_at,
            id=self.id,
            kind=self.kind,
            name=self.name,
            omit_source=self.omit_source,
            schema_id=self.schema_id,
            source=self.source,
            validation_enabled=self.validation_enabled,
            zone_id=self.zone_id)


def get_api_shield_schema(omit_source: Optional[_builtins.bool] = None,
                          schema_id: Optional[_builtins.str] = None,
                          zone_id: Optional[_builtins.str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetApiShieldSchemaResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_api_shield_schema = cloudflare.get_api_shield_schema(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        schema_id="f174e90a-fafe-4643-bbbc-4a0ed4fc8415",
        omit_source=True)
    ```


    :param _builtins.bool omit_source: Omit the source-files of schemas and only retrieve their meta-data.
    :param _builtins.str zone_id: Identifier.
    """
    __args__ = dict()
    __args__['omitSource'] = omit_source
    __args__['schemaId'] = schema_id
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getApiShieldSchema:getApiShieldSchema', __args__, opts=opts, typ=GetApiShieldSchemaResult).value

    return AwaitableGetApiShieldSchemaResult(
        created_at=pulumi.get(__ret__, 'created_at'),
        id=pulumi.get(__ret__, 'id'),
        kind=pulumi.get(__ret__, 'kind'),
        name=pulumi.get(__ret__, 'name'),
        omit_source=pulumi.get(__ret__, 'omit_source'),
        schema_id=pulumi.get(__ret__, 'schema_id'),
        source=pulumi.get(__ret__, 'source'),
        validation_enabled=pulumi.get(__ret__, 'validation_enabled'),
        zone_id=pulumi.get(__ret__, 'zone_id'))
def get_api_shield_schema_output(omit_source: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                                 schema_id: Optional[pulumi.Input[_builtins.str]] = None,
                                 zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                                 opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetApiShieldSchemaResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_api_shield_schema = cloudflare.get_api_shield_schema(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        schema_id="f174e90a-fafe-4643-bbbc-4a0ed4fc8415",
        omit_source=True)
    ```


    :param _builtins.bool omit_source: Omit the source-files of schemas and only retrieve their meta-data.
    :param _builtins.str zone_id: Identifier.
    """
    __args__ = dict()
    __args__['omitSource'] = omit_source
    __args__['schemaId'] = schema_id
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getApiShieldSchema:getApiShieldSchema', __args__, opts=opts, typ=GetApiShieldSchemaResult)
    return __ret__.apply(lambda __response__: GetApiShieldSchemaResult(
        created_at=pulumi.get(__response__, 'created_at'),
        id=pulumi.get(__response__, 'id'),
        kind=pulumi.get(__response__, 'kind'),
        name=pulumi.get(__response__, 'name'),
        omit_source=pulumi.get(__response__, 'omit_source'),
        schema_id=pulumi.get(__response__, 'schema_id'),
        source=pulumi.get(__response__, 'source'),
        validation_enabled=pulumi.get(__response__, 'validation_enabled'),
        zone_id=pulumi.get(__response__, 'zone_id')))
