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
    'GetImagesResult',
    'AwaitableGetImagesResult',
    'get_images',
    'get_images_output',
]

@pulumi.output_type
class GetImagesResult:
    """
    A collection of values returned by getImages.
    """
    def __init__(__self__, account_id=None, id=None, max_items=None, results=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if max_items and not isinstance(max_items, int):
            raise TypeError("Expected argument 'max_items' to be a int")
        pulumi.set(__self__, "max_items", max_items)
        if results and not isinstance(results, list):
            raise TypeError("Expected argument 'results' to be a list")
        pulumi.set(__self__, "results", results)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> _builtins.str:
        """
        Account identifier tag.
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
    @pulumi.getter(name="maxItems")
    def max_items(self) -> Optional[_builtins.int]:
        """
        Max items to fetch, default: 1000
        """
        return pulumi.get(self, "max_items")

    @_builtins.property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetImagesResultResult']:
        """
        The items returned by the data source
        """
        return pulumi.get(self, "results")


class AwaitableGetImagesResult(GetImagesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetImagesResult(
            account_id=self.account_id,
            id=self.id,
            max_items=self.max_items,
            results=self.results)


def get_images(account_id: Optional[_builtins.str] = None,
               max_items: Optional[_builtins.int] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetImagesResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_images = cloudflare.get_images(account_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str account_id: Account identifier tag.
    :param _builtins.int max_items: Max items to fetch, default: 1000
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['maxItems'] = max_items
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getImages:getImages', __args__, opts=opts, typ=GetImagesResult).value

    return AwaitableGetImagesResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        id=pulumi.get(__ret__, 'id'),
        max_items=pulumi.get(__ret__, 'max_items'),
        results=pulumi.get(__ret__, 'results'))
def get_images_output(account_id: Optional[pulumi.Input[_builtins.str]] = None,
                      max_items: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetImagesResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_images = cloudflare.get_images(account_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str account_id: Account identifier tag.
    :param _builtins.int max_items: Max items to fetch, default: 1000
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['maxItems'] = max_items
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getImages:getImages', __args__, opts=opts, typ=GetImagesResult)
    return __ret__.apply(lambda __response__: GetImagesResult(
        account_id=pulumi.get(__response__, 'account_id'),
        id=pulumi.get(__response__, 'id'),
        max_items=pulumi.get(__response__, 'max_items'),
        results=pulumi.get(__response__, 'results')))
