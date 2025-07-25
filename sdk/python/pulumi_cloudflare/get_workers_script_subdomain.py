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
    'GetWorkersScriptSubdomainResult',
    'AwaitableGetWorkersScriptSubdomainResult',
    'get_workers_script_subdomain',
    'get_workers_script_subdomain_output',
]

@pulumi.output_type
class GetWorkersScriptSubdomainResult:
    """
    A collection of values returned by getWorkersScriptSubdomain.
    """
    def __init__(__self__, account_id=None, enabled=None, id=None, previews_enabled=None, script_name=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if enabled and not isinstance(enabled, bool):
            raise TypeError("Expected argument 'enabled' to be a bool")
        pulumi.set(__self__, "enabled", enabled)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if previews_enabled and not isinstance(previews_enabled, bool):
            raise TypeError("Expected argument 'previews_enabled' to be a bool")
        pulumi.set(__self__, "previews_enabled", previews_enabled)
        if script_name and not isinstance(script_name, str):
            raise TypeError("Expected argument 'script_name' to be a str")
        pulumi.set(__self__, "script_name", script_name)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> _builtins.str:
        """
        Identifier.
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> _builtins.bool:
        """
        Whether the Worker is available on the workers.dev subdomain.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="previewsEnabled")
    def previews_enabled(self) -> _builtins.bool:
        """
        Whether the Worker's Preview URLs are available on the workers.dev subdomain.
        """
        return pulumi.get(self, "previews_enabled")

    @_builtins.property
    @pulumi.getter(name="scriptName")
    def script_name(self) -> _builtins.str:
        """
        Name of the script, used in URLs and route configuration.
        """
        return pulumi.get(self, "script_name")


class AwaitableGetWorkersScriptSubdomainResult(GetWorkersScriptSubdomainResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetWorkersScriptSubdomainResult(
            account_id=self.account_id,
            enabled=self.enabled,
            id=self.id,
            previews_enabled=self.previews_enabled,
            script_name=self.script_name)


def get_workers_script_subdomain(account_id: Optional[_builtins.str] = None,
                                 script_name: Optional[_builtins.str] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetWorkersScriptSubdomainResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_workers_script_subdomain = cloudflare.get_workers_script_subdomain(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        script_name="this-is_my_script-01")
    ```


    :param _builtins.str account_id: Identifier.
    :param _builtins.str script_name: Name of the script, used in URLs and route configuration.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['scriptName'] = script_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getWorkersScriptSubdomain:getWorkersScriptSubdomain', __args__, opts=opts, typ=GetWorkersScriptSubdomainResult).value

    return AwaitableGetWorkersScriptSubdomainResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        enabled=pulumi.get(__ret__, 'enabled'),
        id=pulumi.get(__ret__, 'id'),
        previews_enabled=pulumi.get(__ret__, 'previews_enabled'),
        script_name=pulumi.get(__ret__, 'script_name'))
def get_workers_script_subdomain_output(account_id: Optional[pulumi.Input[_builtins.str]] = None,
                                        script_name: Optional[pulumi.Input[_builtins.str]] = None,
                                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetWorkersScriptSubdomainResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_workers_script_subdomain = cloudflare.get_workers_script_subdomain(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        script_name="this-is_my_script-01")
    ```


    :param _builtins.str account_id: Identifier.
    :param _builtins.str script_name: Name of the script, used in URLs and route configuration.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['scriptName'] = script_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getWorkersScriptSubdomain:getWorkersScriptSubdomain', __args__, opts=opts, typ=GetWorkersScriptSubdomainResult)
    return __ret__.apply(lambda __response__: GetWorkersScriptSubdomainResult(
        account_id=pulumi.get(__response__, 'account_id'),
        enabled=pulumi.get(__response__, 'enabled'),
        id=pulumi.get(__response__, 'id'),
        previews_enabled=pulumi.get(__response__, 'previews_enabled'),
        script_name=pulumi.get(__response__, 'script_name')))
