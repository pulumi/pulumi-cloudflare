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
    'GetWorkersKvNamespacesResult',
    'AwaitableGetWorkersKvNamespacesResult',
    'get_workers_kv_namespaces',
    'get_workers_kv_namespaces_output',
]

@pulumi.output_type
class GetWorkersKvNamespacesResult:
    """
    A collection of values returned by getWorkersKvNamespaces.
    """
    def __init__(__self__, account_id=None, direction=None, id=None, max_items=None, order=None, results=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if direction and not isinstance(direction, str):
            raise TypeError("Expected argument 'direction' to be a str")
        pulumi.set(__self__, "direction", direction)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if max_items and not isinstance(max_items, int):
            raise TypeError("Expected argument 'max_items' to be a int")
        pulumi.set(__self__, "max_items", max_items)
        if order and not isinstance(order, str):
            raise TypeError("Expected argument 'order' to be a str")
        pulumi.set(__self__, "order", order)
        if results and not isinstance(results, list):
            raise TypeError("Expected argument 'results' to be a list")
        pulumi.set(__self__, "results", results)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> _builtins.str:
        """
        Identifier
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter
    def direction(self) -> Optional[_builtins.str]:
        """
        Direction to order namespaces.
        Available values: "asc", "desc".
        """
        return pulumi.get(self, "direction")

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
    def order(self) -> Optional[_builtins.str]:
        """
        Field to order results by.
        Available values: "id", "title".
        """
        return pulumi.get(self, "order")

    @_builtins.property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetWorkersKvNamespacesResultResult']:
        """
        The items returned by the data source
        """
        return pulumi.get(self, "results")


class AwaitableGetWorkersKvNamespacesResult(GetWorkersKvNamespacesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetWorkersKvNamespacesResult(
            account_id=self.account_id,
            direction=self.direction,
            id=self.id,
            max_items=self.max_items,
            order=self.order,
            results=self.results)


def get_workers_kv_namespaces(account_id: Optional[_builtins.str] = None,
                              direction: Optional[_builtins.str] = None,
                              max_items: Optional[_builtins.int] = None,
                              order: Optional[_builtins.str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetWorkersKvNamespacesResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_workers_kv_namespaces = cloudflare.get_workers_kv_namespaces(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        direction="asc",
        order="id")
    ```


    :param _builtins.str account_id: Identifier
    :param _builtins.str direction: Direction to order namespaces.
           Available values: "asc", "desc".
    :param _builtins.int max_items: Max items to fetch, default: 1000
    :param _builtins.str order: Field to order results by.
           Available values: "id", "title".
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['direction'] = direction
    __args__['maxItems'] = max_items
    __args__['order'] = order
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getWorkersKvNamespaces:getWorkersKvNamespaces', __args__, opts=opts, typ=GetWorkersKvNamespacesResult).value

    return AwaitableGetWorkersKvNamespacesResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        direction=pulumi.get(__ret__, 'direction'),
        id=pulumi.get(__ret__, 'id'),
        max_items=pulumi.get(__ret__, 'max_items'),
        order=pulumi.get(__ret__, 'order'),
        results=pulumi.get(__ret__, 'results'))
def get_workers_kv_namespaces_output(account_id: Optional[pulumi.Input[_builtins.str]] = None,
                                     direction: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                     max_items: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                                     order: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetWorkersKvNamespacesResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_workers_kv_namespaces = cloudflare.get_workers_kv_namespaces(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        direction="asc",
        order="id")
    ```


    :param _builtins.str account_id: Identifier
    :param _builtins.str direction: Direction to order namespaces.
           Available values: "asc", "desc".
    :param _builtins.int max_items: Max items to fetch, default: 1000
    :param _builtins.str order: Field to order results by.
           Available values: "id", "title".
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['direction'] = direction
    __args__['maxItems'] = max_items
    __args__['order'] = order
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getWorkersKvNamespaces:getWorkersKvNamespaces', __args__, opts=opts, typ=GetWorkersKvNamespacesResult)
    return __ret__.apply(lambda __response__: GetWorkersKvNamespacesResult(
        account_id=pulumi.get(__response__, 'account_id'),
        direction=pulumi.get(__response__, 'direction'),
        id=pulumi.get(__response__, 'id'),
        max_items=pulumi.get(__response__, 'max_items'),
        order=pulumi.get(__response__, 'order'),
        results=pulumi.get(__response__, 'results')))
