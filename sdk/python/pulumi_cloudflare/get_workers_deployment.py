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
    'GetWorkersDeploymentResult',
    'AwaitableGetWorkersDeploymentResult',
    'get_workers_deployment',
    'get_workers_deployment_output',
]

@pulumi.output_type
class GetWorkersDeploymentResult:
    """
    A collection of values returned by getWorkersDeployment.
    """
    def __init__(__self__, account_id=None, deployments=None, id=None, script_name=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if deployments and not isinstance(deployments, list):
            raise TypeError("Expected argument 'deployments' to be a list")
        pulumi.set(__self__, "deployments", deployments)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
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
    def deployments(self) -> Sequence['outputs.GetWorkersDeploymentDeploymentResult']:
        return pulumi.get(self, "deployments")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="scriptName")
    def script_name(self) -> _builtins.str:
        """
        Name of the script.
        """
        return pulumi.get(self, "script_name")


class AwaitableGetWorkersDeploymentResult(GetWorkersDeploymentResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetWorkersDeploymentResult(
            account_id=self.account_id,
            deployments=self.deployments,
            id=self.id,
            script_name=self.script_name)


def get_workers_deployment(account_id: Optional[_builtins.str] = None,
                           script_name: Optional[_builtins.str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetWorkersDeploymentResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_workers_deployment = cloudflare.get_workers_deployment(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        script_name="this-is_my_script-01")
    ```


    :param _builtins.str account_id: Identifier.
    :param _builtins.str script_name: Name of the script.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['scriptName'] = script_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getWorkersDeployment:getWorkersDeployment', __args__, opts=opts, typ=GetWorkersDeploymentResult).value

    return AwaitableGetWorkersDeploymentResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        deployments=pulumi.get(__ret__, 'deployments'),
        id=pulumi.get(__ret__, 'id'),
        script_name=pulumi.get(__ret__, 'script_name'))
def get_workers_deployment_output(account_id: Optional[pulumi.Input[_builtins.str]] = None,
                                  script_name: Optional[pulumi.Input[_builtins.str]] = None,
                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetWorkersDeploymentResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_workers_deployment = cloudflare.get_workers_deployment(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        script_name="this-is_my_script-01")
    ```


    :param _builtins.str account_id: Identifier.
    :param _builtins.str script_name: Name of the script.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['scriptName'] = script_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getWorkersDeployment:getWorkersDeployment', __args__, opts=opts, typ=GetWorkersDeploymentResult)
    return __ret__.apply(lambda __response__: GetWorkersDeploymentResult(
        account_id=pulumi.get(__response__, 'account_id'),
        deployments=pulumi.get(__response__, 'deployments'),
        id=pulumi.get(__response__, 'id'),
        script_name=pulumi.get(__response__, 'script_name')))
