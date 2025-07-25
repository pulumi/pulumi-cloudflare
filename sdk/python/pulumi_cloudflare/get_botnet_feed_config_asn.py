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
    'GetBotnetFeedConfigAsnResult',
    'AwaitableGetBotnetFeedConfigAsnResult',
    'get_botnet_feed_config_asn',
    'get_botnet_feed_config_asn_output',
]

@pulumi.output_type
class GetBotnetFeedConfigAsnResult:
    """
    A collection of values returned by getBotnetFeedConfigAsn.
    """
    def __init__(__self__, account_id=None, asn=None, id=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if asn and not isinstance(asn, int):
            raise TypeError("Expected argument 'asn' to be a int")
        pulumi.set(__self__, "asn", asn)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> _builtins.str:
        """
        Identifier.
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter
    def asn(self) -> _builtins.int:
        return pulumi.get(self, "asn")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetBotnetFeedConfigAsnResult(GetBotnetFeedConfigAsnResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBotnetFeedConfigAsnResult(
            account_id=self.account_id,
            asn=self.asn,
            id=self.id)


def get_botnet_feed_config_asn(account_id: Optional[_builtins.str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBotnetFeedConfigAsnResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_botnet_feed_config_asn = cloudflare.get_botnet_feed_config_asn(account_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str account_id: Identifier.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getBotnetFeedConfigAsn:getBotnetFeedConfigAsn', __args__, opts=opts, typ=GetBotnetFeedConfigAsnResult).value

    return AwaitableGetBotnetFeedConfigAsnResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        asn=pulumi.get(__ret__, 'asn'),
        id=pulumi.get(__ret__, 'id'))
def get_botnet_feed_config_asn_output(account_id: Optional[pulumi.Input[_builtins.str]] = None,
                                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetBotnetFeedConfigAsnResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_botnet_feed_config_asn = cloudflare.get_botnet_feed_config_asn(account_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str account_id: Identifier.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getBotnetFeedConfigAsn:getBotnetFeedConfigAsn', __args__, opts=opts, typ=GetBotnetFeedConfigAsnResult)
    return __ret__.apply(lambda __response__: GetBotnetFeedConfigAsnResult(
        account_id=pulumi.get(__response__, 'account_id'),
        asn=pulumi.get(__response__, 'asn'),
        id=pulumi.get(__response__, 'id')))
