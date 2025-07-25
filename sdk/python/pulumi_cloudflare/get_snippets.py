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
    'GetSnippetsResult',
    'AwaitableGetSnippetsResult',
    'get_snippets',
    'get_snippets_output',
]

@pulumi.output_type
class GetSnippetsResult:
    """
    A collection of values returned by getSnippets.
    """
    def __init__(__self__, created_on=None, id=None, modified_on=None, snippet_name=None, zone_id=None):
        if created_on and not isinstance(created_on, str):
            raise TypeError("Expected argument 'created_on' to be a str")
        pulumi.set(__self__, "created_on", created_on)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if modified_on and not isinstance(modified_on, str):
            raise TypeError("Expected argument 'modified_on' to be a str")
        pulumi.set(__self__, "modified_on", modified_on)
        if snippet_name and not isinstance(snippet_name, str):
            raise TypeError("Expected argument 'snippet_name' to be a str")
        pulumi.set(__self__, "snippet_name", snippet_name)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> _builtins.str:
        """
        Creation time of the snippet
        """
        return pulumi.get(self, "created_on")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="modifiedOn")
    def modified_on(self) -> _builtins.str:
        """
        Modification time of the snippet
        """
        return pulumi.get(self, "modified_on")

    @_builtins.property
    @pulumi.getter(name="snippetName")
    def snippet_name(self) -> _builtins.str:
        """
        Snippet identifying name
        """
        return pulumi.get(self, "snippet_name")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> _builtins.str:
        """
        Identifier
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetSnippetsResult(GetSnippetsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSnippetsResult(
            created_on=self.created_on,
            id=self.id,
            modified_on=self.modified_on,
            snippet_name=self.snippet_name,
            zone_id=self.zone_id)


def get_snippets(snippet_name: Optional[_builtins.str] = None,
                 zone_id: Optional[_builtins.str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSnippetsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_snippets = cloudflare.get_snippets(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        snippet_name="snippet_name_01")
    ```


    :param _builtins.str snippet_name: Snippet identifying name
    :param _builtins.str zone_id: Identifier
    """
    __args__ = dict()
    __args__['snippetName'] = snippet_name
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getSnippets:getSnippets', __args__, opts=opts, typ=GetSnippetsResult).value

    return AwaitableGetSnippetsResult(
        created_on=pulumi.get(__ret__, 'created_on'),
        id=pulumi.get(__ret__, 'id'),
        modified_on=pulumi.get(__ret__, 'modified_on'),
        snippet_name=pulumi.get(__ret__, 'snippet_name'),
        zone_id=pulumi.get(__ret__, 'zone_id'))
def get_snippets_output(snippet_name: Optional[pulumi.Input[_builtins.str]] = None,
                        zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSnippetsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_snippets = cloudflare.get_snippets(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        snippet_name="snippet_name_01")
    ```


    :param _builtins.str snippet_name: Snippet identifying name
    :param _builtins.str zone_id: Identifier
    """
    __args__ = dict()
    __args__['snippetName'] = snippet_name
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getSnippets:getSnippets', __args__, opts=opts, typ=GetSnippetsResult)
    return __ret__.apply(lambda __response__: GetSnippetsResult(
        created_on=pulumi.get(__response__, 'created_on'),
        id=pulumi.get(__response__, 'id'),
        modified_on=pulumi.get(__response__, 'modified_on'),
        snippet_name=pulumi.get(__response__, 'snippet_name'),
        zone_id=pulumi.get(__response__, 'zone_id')))
