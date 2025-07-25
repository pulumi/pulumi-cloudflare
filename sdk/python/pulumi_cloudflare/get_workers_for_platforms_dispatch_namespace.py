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
    'GetWorkersForPlatformsDispatchNamespaceResult',
    'AwaitableGetWorkersForPlatformsDispatchNamespaceResult',
    'get_workers_for_platforms_dispatch_namespace',
    'get_workers_for_platforms_dispatch_namespace_output',
]

@pulumi.output_type
class GetWorkersForPlatformsDispatchNamespaceResult:
    """
    A collection of values returned by getWorkersForPlatformsDispatchNamespace.
    """
    def __init__(__self__, account_id=None, created_by=None, created_on=None, dispatch_namespace=None, id=None, modified_by=None, modified_on=None, namespace_id=None, namespace_name=None, script_count=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if created_by and not isinstance(created_by, str):
            raise TypeError("Expected argument 'created_by' to be a str")
        pulumi.set(__self__, "created_by", created_by)
        if created_on and not isinstance(created_on, str):
            raise TypeError("Expected argument 'created_on' to be a str")
        pulumi.set(__self__, "created_on", created_on)
        if dispatch_namespace and not isinstance(dispatch_namespace, str):
            raise TypeError("Expected argument 'dispatch_namespace' to be a str")
        pulumi.set(__self__, "dispatch_namespace", dispatch_namespace)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if modified_by and not isinstance(modified_by, str):
            raise TypeError("Expected argument 'modified_by' to be a str")
        pulumi.set(__self__, "modified_by", modified_by)
        if modified_on and not isinstance(modified_on, str):
            raise TypeError("Expected argument 'modified_on' to be a str")
        pulumi.set(__self__, "modified_on", modified_on)
        if namespace_id and not isinstance(namespace_id, str):
            raise TypeError("Expected argument 'namespace_id' to be a str")
        pulumi.set(__self__, "namespace_id", namespace_id)
        if namespace_name and not isinstance(namespace_name, str):
            raise TypeError("Expected argument 'namespace_name' to be a str")
        pulumi.set(__self__, "namespace_name", namespace_name)
        if script_count and not isinstance(script_count, int):
            raise TypeError("Expected argument 'script_count' to be a int")
        pulumi.set(__self__, "script_count", script_count)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> _builtins.str:
        """
        Identifier.
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> _builtins.str:
        """
        Identifier.
        """
        return pulumi.get(self, "created_by")

    @_builtins.property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> _builtins.str:
        """
        When the script was created.
        """
        return pulumi.get(self, "created_on")

    @_builtins.property
    @pulumi.getter(name="dispatchNamespace")
    def dispatch_namespace(self) -> Optional[_builtins.str]:
        """
        Name of the Workers for Platforms dispatch namespace.
        """
        return pulumi.get(self, "dispatch_namespace")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        Name of the Workers for Platforms dispatch namespace.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="modifiedBy")
    def modified_by(self) -> _builtins.str:
        """
        Identifier.
        """
        return pulumi.get(self, "modified_by")

    @_builtins.property
    @pulumi.getter(name="modifiedOn")
    def modified_on(self) -> _builtins.str:
        """
        When the script was last modified.
        """
        return pulumi.get(self, "modified_on")

    @_builtins.property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> _builtins.str:
        """
        API Resource UUID tag.
        """
        return pulumi.get(self, "namespace_id")

    @_builtins.property
    @pulumi.getter(name="namespaceName")
    def namespace_name(self) -> _builtins.str:
        """
        Name of the Workers for Platforms dispatch namespace.
        """
        return pulumi.get(self, "namespace_name")

    @_builtins.property
    @pulumi.getter(name="scriptCount")
    def script_count(self) -> _builtins.int:
        """
        The current number of scripts in this Dispatch Namespace.
        """
        return pulumi.get(self, "script_count")


class AwaitableGetWorkersForPlatformsDispatchNamespaceResult(GetWorkersForPlatformsDispatchNamespaceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetWorkersForPlatformsDispatchNamespaceResult(
            account_id=self.account_id,
            created_by=self.created_by,
            created_on=self.created_on,
            dispatch_namespace=self.dispatch_namespace,
            id=self.id,
            modified_by=self.modified_by,
            modified_on=self.modified_on,
            namespace_id=self.namespace_id,
            namespace_name=self.namespace_name,
            script_count=self.script_count)


def get_workers_for_platforms_dispatch_namespace(account_id: Optional[_builtins.str] = None,
                                                 dispatch_namespace: Optional[_builtins.str] = None,
                                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetWorkersForPlatformsDispatchNamespaceResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_workers_for_platforms_dispatch_namespace = cloudflare.get_workers_for_platforms_dispatch_namespace(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        dispatch_namespace="my-dispatch-namespace")
    ```


    :param _builtins.str account_id: Identifier.
    :param _builtins.str dispatch_namespace: Name of the Workers for Platforms dispatch namespace.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['dispatchNamespace'] = dispatch_namespace
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getWorkersForPlatformsDispatchNamespace:getWorkersForPlatformsDispatchNamespace', __args__, opts=opts, typ=GetWorkersForPlatformsDispatchNamespaceResult).value

    return AwaitableGetWorkersForPlatformsDispatchNamespaceResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        created_by=pulumi.get(__ret__, 'created_by'),
        created_on=pulumi.get(__ret__, 'created_on'),
        dispatch_namespace=pulumi.get(__ret__, 'dispatch_namespace'),
        id=pulumi.get(__ret__, 'id'),
        modified_by=pulumi.get(__ret__, 'modified_by'),
        modified_on=pulumi.get(__ret__, 'modified_on'),
        namespace_id=pulumi.get(__ret__, 'namespace_id'),
        namespace_name=pulumi.get(__ret__, 'namespace_name'),
        script_count=pulumi.get(__ret__, 'script_count'))
def get_workers_for_platforms_dispatch_namespace_output(account_id: Optional[pulumi.Input[_builtins.str]] = None,
                                                        dispatch_namespace: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetWorkersForPlatformsDispatchNamespaceResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_workers_for_platforms_dispatch_namespace = cloudflare.get_workers_for_platforms_dispatch_namespace(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        dispatch_namespace="my-dispatch-namespace")
    ```


    :param _builtins.str account_id: Identifier.
    :param _builtins.str dispatch_namespace: Name of the Workers for Platforms dispatch namespace.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['dispatchNamespace'] = dispatch_namespace
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getWorkersForPlatformsDispatchNamespace:getWorkersForPlatformsDispatchNamespace', __args__, opts=opts, typ=GetWorkersForPlatformsDispatchNamespaceResult)
    return __ret__.apply(lambda __response__: GetWorkersForPlatformsDispatchNamespaceResult(
        account_id=pulumi.get(__response__, 'account_id'),
        created_by=pulumi.get(__response__, 'created_by'),
        created_on=pulumi.get(__response__, 'created_on'),
        dispatch_namespace=pulumi.get(__response__, 'dispatch_namespace'),
        id=pulumi.get(__response__, 'id'),
        modified_by=pulumi.get(__response__, 'modified_by'),
        modified_on=pulumi.get(__response__, 'modified_on'),
        namespace_id=pulumi.get(__response__, 'namespace_id'),
        namespace_name=pulumi.get(__response__, 'namespace_name'),
        script_count=pulumi.get(__response__, 'script_count')))
