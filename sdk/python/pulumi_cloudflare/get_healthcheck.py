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
    'GetHealthcheckResult',
    'AwaitableGetHealthcheckResult',
    'get_healthcheck',
    'get_healthcheck_output',
]

@pulumi.output_type
class GetHealthcheckResult:
    """
    A collection of values returned by getHealthcheck.
    """
    def __init__(__self__, address=None, check_regions=None, consecutive_fails=None, consecutive_successes=None, created_on=None, description=None, failure_reason=None, healthcheck_id=None, http_config=None, id=None, interval=None, modified_on=None, name=None, retries=None, status=None, suspended=None, tcp_config=None, timeout=None, type=None, zone_id=None):
        if address and not isinstance(address, str):
            raise TypeError("Expected argument 'address' to be a str")
        pulumi.set(__self__, "address", address)
        if check_regions and not isinstance(check_regions, list):
            raise TypeError("Expected argument 'check_regions' to be a list")
        pulumi.set(__self__, "check_regions", check_regions)
        if consecutive_fails and not isinstance(consecutive_fails, int):
            raise TypeError("Expected argument 'consecutive_fails' to be a int")
        pulumi.set(__self__, "consecutive_fails", consecutive_fails)
        if consecutive_successes and not isinstance(consecutive_successes, int):
            raise TypeError("Expected argument 'consecutive_successes' to be a int")
        pulumi.set(__self__, "consecutive_successes", consecutive_successes)
        if created_on and not isinstance(created_on, str):
            raise TypeError("Expected argument 'created_on' to be a str")
        pulumi.set(__self__, "created_on", created_on)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if failure_reason and not isinstance(failure_reason, str):
            raise TypeError("Expected argument 'failure_reason' to be a str")
        pulumi.set(__self__, "failure_reason", failure_reason)
        if healthcheck_id and not isinstance(healthcheck_id, str):
            raise TypeError("Expected argument 'healthcheck_id' to be a str")
        pulumi.set(__self__, "healthcheck_id", healthcheck_id)
        if http_config and not isinstance(http_config, dict):
            raise TypeError("Expected argument 'http_config' to be a dict")
        pulumi.set(__self__, "http_config", http_config)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if interval and not isinstance(interval, int):
            raise TypeError("Expected argument 'interval' to be a int")
        pulumi.set(__self__, "interval", interval)
        if modified_on and not isinstance(modified_on, str):
            raise TypeError("Expected argument 'modified_on' to be a str")
        pulumi.set(__self__, "modified_on", modified_on)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if retries and not isinstance(retries, int):
            raise TypeError("Expected argument 'retries' to be a int")
        pulumi.set(__self__, "retries", retries)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if suspended and not isinstance(suspended, bool):
            raise TypeError("Expected argument 'suspended' to be a bool")
        pulumi.set(__self__, "suspended", suspended)
        if tcp_config and not isinstance(tcp_config, dict):
            raise TypeError("Expected argument 'tcp_config' to be a dict")
        pulumi.set(__self__, "tcp_config", tcp_config)
        if timeout and not isinstance(timeout, int):
            raise TypeError("Expected argument 'timeout' to be a int")
        pulumi.set(__self__, "timeout", timeout)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter
    def address(self) -> _builtins.str:
        """
        The hostname or IP address of the origin server to run health checks on.
        """
        return pulumi.get(self, "address")

    @_builtins.property
    @pulumi.getter(name="checkRegions")
    def check_regions(self) -> Sequence[_builtins.str]:
        """
        A list of regions from which to run health checks. Null means Cloudflare will pick a default region.
        """
        return pulumi.get(self, "check_regions")

    @_builtins.property
    @pulumi.getter(name="consecutiveFails")
    def consecutive_fails(self) -> _builtins.int:
        """
        The number of consecutive fails required from a health check before changing the health to unhealthy.
        """
        return pulumi.get(self, "consecutive_fails")

    @_builtins.property
    @pulumi.getter(name="consecutiveSuccesses")
    def consecutive_successes(self) -> _builtins.int:
        """
        The number of consecutive successes required from a health check before changing the health to healthy.
        """
        return pulumi.get(self, "consecutive_successes")

    @_builtins.property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> _builtins.str:
        return pulumi.get(self, "created_on")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        A human-readable description of the health check.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="failureReason")
    def failure_reason(self) -> _builtins.str:
        """
        The current failure reason if status is unhealthy.
        """
        return pulumi.get(self, "failure_reason")

    @_builtins.property
    @pulumi.getter(name="healthcheckId")
    def healthcheck_id(self) -> Optional[_builtins.str]:
        """
        Identifier
        """
        return pulumi.get(self, "healthcheck_id")

    @_builtins.property
    @pulumi.getter(name="httpConfig")
    def http_config(self) -> 'outputs.GetHealthcheckHttpConfigResult':
        """
        Parameters specific to an HTTP or HTTPS health check.
        """
        return pulumi.get(self, "http_config")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        Identifier
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def interval(self) -> _builtins.int:
        """
        The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase load on the origin as we check from multiple locations.
        """
        return pulumi.get(self, "interval")

    @_builtins.property
    @pulumi.getter(name="modifiedOn")
    def modified_on(self) -> _builtins.str:
        return pulumi.get(self, "modified_on")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        A short name to identify the health check. Only alphanumeric characters, hyphens and underscores are allowed.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def retries(self) -> _builtins.int:
        """
        The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately.
        """
        return pulumi.get(self, "retries")

    @_builtins.property
    @pulumi.getter
    def status(self) -> _builtins.str:
        """
        The current status of the origin server according to the health check.
        Available values: "unknown", "healthy", "unhealthy", "suspended".
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter
    def suspended(self) -> _builtins.bool:
        """
        If suspended, no health checks are sent to the origin.
        """
        return pulumi.get(self, "suspended")

    @_builtins.property
    @pulumi.getter(name="tcpConfig")
    def tcp_config(self) -> 'outputs.GetHealthcheckTcpConfigResult':
        """
        Parameters specific to TCP health check.
        """
        return pulumi.get(self, "tcp_config")

    @_builtins.property
    @pulumi.getter
    def timeout(self) -> _builtins.int:
        """
        The timeout (in seconds) before marking the health check as failed.
        """
        return pulumi.get(self, "timeout")

    @_builtins.property
    @pulumi.getter
    def type(self) -> _builtins.str:
        """
        The protocol to use for the health check. Currently supported protocols are 'HTTP', 'HTTPS' and 'TCP'.
        """
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> _builtins.str:
        """
        Identifier
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetHealthcheckResult(GetHealthcheckResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetHealthcheckResult(
            address=self.address,
            check_regions=self.check_regions,
            consecutive_fails=self.consecutive_fails,
            consecutive_successes=self.consecutive_successes,
            created_on=self.created_on,
            description=self.description,
            failure_reason=self.failure_reason,
            healthcheck_id=self.healthcheck_id,
            http_config=self.http_config,
            id=self.id,
            interval=self.interval,
            modified_on=self.modified_on,
            name=self.name,
            retries=self.retries,
            status=self.status,
            suspended=self.suspended,
            tcp_config=self.tcp_config,
            timeout=self.timeout,
            type=self.type,
            zone_id=self.zone_id)


def get_healthcheck(healthcheck_id: Optional[_builtins.str] = None,
                    zone_id: Optional[_builtins.str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetHealthcheckResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_healthcheck = cloudflare.get_healthcheck(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        healthcheck_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str healthcheck_id: Identifier
    :param _builtins.str zone_id: Identifier
    """
    __args__ = dict()
    __args__['healthcheckId'] = healthcheck_id
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getHealthcheck:getHealthcheck', __args__, opts=opts, typ=GetHealthcheckResult).value

    return AwaitableGetHealthcheckResult(
        address=pulumi.get(__ret__, 'address'),
        check_regions=pulumi.get(__ret__, 'check_regions'),
        consecutive_fails=pulumi.get(__ret__, 'consecutive_fails'),
        consecutive_successes=pulumi.get(__ret__, 'consecutive_successes'),
        created_on=pulumi.get(__ret__, 'created_on'),
        description=pulumi.get(__ret__, 'description'),
        failure_reason=pulumi.get(__ret__, 'failure_reason'),
        healthcheck_id=pulumi.get(__ret__, 'healthcheck_id'),
        http_config=pulumi.get(__ret__, 'http_config'),
        id=pulumi.get(__ret__, 'id'),
        interval=pulumi.get(__ret__, 'interval'),
        modified_on=pulumi.get(__ret__, 'modified_on'),
        name=pulumi.get(__ret__, 'name'),
        retries=pulumi.get(__ret__, 'retries'),
        status=pulumi.get(__ret__, 'status'),
        suspended=pulumi.get(__ret__, 'suspended'),
        tcp_config=pulumi.get(__ret__, 'tcp_config'),
        timeout=pulumi.get(__ret__, 'timeout'),
        type=pulumi.get(__ret__, 'type'),
        zone_id=pulumi.get(__ret__, 'zone_id'))
def get_healthcheck_output(healthcheck_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                           zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetHealthcheckResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_healthcheck = cloudflare.get_healthcheck(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        healthcheck_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str healthcheck_id: Identifier
    :param _builtins.str zone_id: Identifier
    """
    __args__ = dict()
    __args__['healthcheckId'] = healthcheck_id
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getHealthcheck:getHealthcheck', __args__, opts=opts, typ=GetHealthcheckResult)
    return __ret__.apply(lambda __response__: GetHealthcheckResult(
        address=pulumi.get(__response__, 'address'),
        check_regions=pulumi.get(__response__, 'check_regions'),
        consecutive_fails=pulumi.get(__response__, 'consecutive_fails'),
        consecutive_successes=pulumi.get(__response__, 'consecutive_successes'),
        created_on=pulumi.get(__response__, 'created_on'),
        description=pulumi.get(__response__, 'description'),
        failure_reason=pulumi.get(__response__, 'failure_reason'),
        healthcheck_id=pulumi.get(__response__, 'healthcheck_id'),
        http_config=pulumi.get(__response__, 'http_config'),
        id=pulumi.get(__response__, 'id'),
        interval=pulumi.get(__response__, 'interval'),
        modified_on=pulumi.get(__response__, 'modified_on'),
        name=pulumi.get(__response__, 'name'),
        retries=pulumi.get(__response__, 'retries'),
        status=pulumi.get(__response__, 'status'),
        suspended=pulumi.get(__response__, 'suspended'),
        tcp_config=pulumi.get(__response__, 'tcp_config'),
        timeout=pulumi.get(__response__, 'timeout'),
        type=pulumi.get(__response__, 'type'),
        zone_id=pulumi.get(__response__, 'zone_id')))
