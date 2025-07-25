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
    'GetAccountsResult',
    'AwaitableGetAccountsResult',
    'get_accounts',
    'get_accounts_output',
]

@pulumi.output_type
class GetAccountsResult:
    """
    A collection of values returned by getAccounts.
    """
    def __init__(__self__, direction=None, id=None, max_items=None, name=None, results=None):
        if direction and not isinstance(direction, str):
            raise TypeError("Expected argument 'direction' to be a str")
        pulumi.set(__self__, "direction", direction)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if max_items and not isinstance(max_items, int):
            raise TypeError("Expected argument 'max_items' to be a int")
        pulumi.set(__self__, "max_items", max_items)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if results and not isinstance(results, list):
            raise TypeError("Expected argument 'results' to be a list")
        pulumi.set(__self__, "results", results)

    @_builtins.property
    @pulumi.getter
    def direction(self) -> Optional[_builtins.str]:
        """
        Direction to order results.
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
    def name(self) -> Optional[_builtins.str]:
        """
        Name of the account.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetAccountsResultResult']:
        """
        The items returned by the data source
        """
        return pulumi.get(self, "results")


class AwaitableGetAccountsResult(GetAccountsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccountsResult(
            direction=self.direction,
            id=self.id,
            max_items=self.max_items,
            name=self.name,
            results=self.results)


def get_accounts(direction: Optional[_builtins.str] = None,
                 max_items: Optional[_builtins.int] = None,
                 name: Optional[_builtins.str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccountsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_accounts = cloudflare.get_accounts(direction="desc",
        name="example.com")
    ```


    :param _builtins.str direction: Direction to order results.
           Available values: "asc", "desc".
    :param _builtins.int max_items: Max items to fetch, default: 1000
    :param _builtins.str name: Name of the account.
    """
    __args__ = dict()
    __args__['direction'] = direction
    __args__['maxItems'] = max_items
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getAccounts:getAccounts', __args__, opts=opts, typ=GetAccountsResult).value

    return AwaitableGetAccountsResult(
        direction=pulumi.get(__ret__, 'direction'),
        id=pulumi.get(__ret__, 'id'),
        max_items=pulumi.get(__ret__, 'max_items'),
        name=pulumi.get(__ret__, 'name'),
        results=pulumi.get(__ret__, 'results'))
def get_accounts_output(direction: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                        max_items: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                        name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAccountsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_accounts = cloudflare.get_accounts(direction="desc",
        name="example.com")
    ```


    :param _builtins.str direction: Direction to order results.
           Available values: "asc", "desc".
    :param _builtins.int max_items: Max items to fetch, default: 1000
    :param _builtins.str name: Name of the account.
    """
    __args__ = dict()
    __args__['direction'] = direction
    __args__['maxItems'] = max_items
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getAccounts:getAccounts', __args__, opts=opts, typ=GetAccountsResult)
    return __ret__.apply(lambda __response__: GetAccountsResult(
        direction=pulumi.get(__response__, 'direction'),
        id=pulumi.get(__response__, 'id'),
        max_items=pulumi.get(__response__, 'max_items'),
        name=pulumi.get(__response__, 'name'),
        results=pulumi.get(__response__, 'results')))
