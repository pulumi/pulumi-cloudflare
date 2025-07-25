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
    'GetListItemResult',
    'AwaitableGetListItemResult',
    'get_list_item',
    'get_list_item_output',
]

@pulumi.output_type
class GetListItemResult:
    """
    A collection of values returned by getListItem.
    """
    def __init__(__self__, account_id=None, asn=None, comment=None, created_on=None, hostname=None, id=None, ip=None, item_id=None, list_id=None, modified_on=None, redirect=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if asn and not isinstance(asn, int):
            raise TypeError("Expected argument 'asn' to be a int")
        pulumi.set(__self__, "asn", asn)
        if comment and not isinstance(comment, str):
            raise TypeError("Expected argument 'comment' to be a str")
        pulumi.set(__self__, "comment", comment)
        if created_on and not isinstance(created_on, str):
            raise TypeError("Expected argument 'created_on' to be a str")
        pulumi.set(__self__, "created_on", created_on)
        if hostname and not isinstance(hostname, dict):
            raise TypeError("Expected argument 'hostname' to be a dict")
        pulumi.set(__self__, "hostname", hostname)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip and not isinstance(ip, str):
            raise TypeError("Expected argument 'ip' to be a str")
        pulumi.set(__self__, "ip", ip)
        if item_id and not isinstance(item_id, str):
            raise TypeError("Expected argument 'item_id' to be a str")
        pulumi.set(__self__, "item_id", item_id)
        if list_id and not isinstance(list_id, str):
            raise TypeError("Expected argument 'list_id' to be a str")
        pulumi.set(__self__, "list_id", list_id)
        if modified_on and not isinstance(modified_on, str):
            raise TypeError("Expected argument 'modified_on' to be a str")
        pulumi.set(__self__, "modified_on", modified_on)
        if redirect and not isinstance(redirect, dict):
            raise TypeError("Expected argument 'redirect' to be a dict")
        pulumi.set(__self__, "redirect", redirect)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> _builtins.str:
        """
        Defines an identifier.
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter
    def asn(self) -> _builtins.int:
        """
        Defines a non-negative 32 bit integer.
        """
        return pulumi.get(self, "asn")

    @_builtins.property
    @pulumi.getter
    def comment(self) -> _builtins.str:
        """
        Defines an informative summary of the list item.
        """
        return pulumi.get(self, "comment")

    @_builtins.property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> _builtins.str:
        """
        The RFC 3339 timestamp of when the item was created.
        """
        return pulumi.get(self, "created_on")

    @_builtins.property
    @pulumi.getter
    def hostname(self) -> 'outputs.GetListItemHostnameResult':
        """
        Valid characters for hostnames are ASCII(7) letters from a to z, the digits from 0 to 9, wildcards (*), and the hyphen (-).
        """
        return pulumi.get(self, "hostname")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The unique ID of the list.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def ip(self) -> _builtins.str:
        """
        An IPv4 address, an IPv4 CIDR, or an IPv6 CIDR. IPv6 CIDRs are limited to a maximum of /64.
        """
        return pulumi.get(self, "ip")

    @_builtins.property
    @pulumi.getter(name="itemId")
    def item_id(self) -> _builtins.str:
        """
        Defines the unique ID of the item in the List.
        """
        return pulumi.get(self, "item_id")

    @_builtins.property
    @pulumi.getter(name="listId")
    def list_id(self) -> _builtins.str:
        """
        The unique ID of the list.
        """
        return pulumi.get(self, "list_id")

    @_builtins.property
    @pulumi.getter(name="modifiedOn")
    def modified_on(self) -> _builtins.str:
        """
        The RFC 3339 timestamp of when the item was last modified.
        """
        return pulumi.get(self, "modified_on")

    @_builtins.property
    @pulumi.getter
    def redirect(self) -> 'outputs.GetListItemRedirectResult':
        """
        The definition of the redirect.
        """
        return pulumi.get(self, "redirect")


class AwaitableGetListItemResult(GetListItemResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetListItemResult(
            account_id=self.account_id,
            asn=self.asn,
            comment=self.comment,
            created_on=self.created_on,
            hostname=self.hostname,
            id=self.id,
            ip=self.ip,
            item_id=self.item_id,
            list_id=self.list_id,
            modified_on=self.modified_on,
            redirect=self.redirect)


def get_list_item(account_id: Optional[_builtins.str] = None,
                  item_id: Optional[_builtins.str] = None,
                  list_id: Optional[_builtins.str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetListItemResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_list_item = cloudflare.get_list_item(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        list_id="2c0fc9fa937b11eaa1b71c4d701ab86e",
        item_id="34b12448945f11eaa1b71c4d701ab86e")
    ```


    :param _builtins.str account_id: Defines an identifier.
    :param _builtins.str item_id: Defines the unique ID of the item in the List.
    :param _builtins.str list_id: The unique ID of the list.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['itemId'] = item_id
    __args__['listId'] = list_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getListItem:getListItem', __args__, opts=opts, typ=GetListItemResult).value

    return AwaitableGetListItemResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        asn=pulumi.get(__ret__, 'asn'),
        comment=pulumi.get(__ret__, 'comment'),
        created_on=pulumi.get(__ret__, 'created_on'),
        hostname=pulumi.get(__ret__, 'hostname'),
        id=pulumi.get(__ret__, 'id'),
        ip=pulumi.get(__ret__, 'ip'),
        item_id=pulumi.get(__ret__, 'item_id'),
        list_id=pulumi.get(__ret__, 'list_id'),
        modified_on=pulumi.get(__ret__, 'modified_on'),
        redirect=pulumi.get(__ret__, 'redirect'))
def get_list_item_output(account_id: Optional[pulumi.Input[_builtins.str]] = None,
                         item_id: Optional[pulumi.Input[_builtins.str]] = None,
                         list_id: Optional[pulumi.Input[_builtins.str]] = None,
                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetListItemResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_list_item = cloudflare.get_list_item(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        list_id="2c0fc9fa937b11eaa1b71c4d701ab86e",
        item_id="34b12448945f11eaa1b71c4d701ab86e")
    ```


    :param _builtins.str account_id: Defines an identifier.
    :param _builtins.str item_id: Defines the unique ID of the item in the List.
    :param _builtins.str list_id: The unique ID of the list.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['itemId'] = item_id
    __args__['listId'] = list_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getListItem:getListItem', __args__, opts=opts, typ=GetListItemResult)
    return __ret__.apply(lambda __response__: GetListItemResult(
        account_id=pulumi.get(__response__, 'account_id'),
        asn=pulumi.get(__response__, 'asn'),
        comment=pulumi.get(__response__, 'comment'),
        created_on=pulumi.get(__response__, 'created_on'),
        hostname=pulumi.get(__response__, 'hostname'),
        id=pulumi.get(__response__, 'id'),
        ip=pulumi.get(__response__, 'ip'),
        item_id=pulumi.get(__response__, 'item_id'),
        list_id=pulumi.get(__response__, 'list_id'),
        modified_on=pulumi.get(__response__, 'modified_on'),
        redirect=pulumi.get(__response__, 'redirect')))
