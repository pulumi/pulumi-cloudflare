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

__all__ = ['WorkersRouteArgs', 'WorkersRoute']

@pulumi.input_type
class WorkersRouteArgs:
    def __init__(__self__, *,
                 pattern: pulumi.Input[_builtins.str],
                 zone_id: pulumi.Input[_builtins.str],
                 script: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a WorkersRoute resource.
        :param pulumi.Input[_builtins.str] pattern: Pattern to match incoming requests against. [Learn more](https://developers.cloudflare.com/workers/configuration/routing/routes/#matching-behavior).
        :param pulumi.Input[_builtins.str] zone_id: Identifier.
        :param pulumi.Input[_builtins.str] script: Name of the script to run if the route matches.
        """
        pulumi.set(__self__, "pattern", pattern)
        pulumi.set(__self__, "zone_id", zone_id)
        if script is not None:
            pulumi.set(__self__, "script", script)

    @_builtins.property
    @pulumi.getter
    def pattern(self) -> pulumi.Input[_builtins.str]:
        """
        Pattern to match incoming requests against. [Learn more](https://developers.cloudflare.com/workers/configuration/routing/routes/#matching-behavior).
        """
        return pulumi.get(self, "pattern")

    @pattern.setter
    def pattern(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "pattern", value)

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[_builtins.str]:
        """
        Identifier.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "zone_id", value)

    @_builtins.property
    @pulumi.getter
    def script(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the script to run if the route matches.
        """
        return pulumi.get(self, "script")

    @script.setter
    def script(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "script", value)


@pulumi.input_type
class _WorkersRouteState:
    def __init__(__self__, *,
                 pattern: Optional[pulumi.Input[_builtins.str]] = None,
                 script: Optional[pulumi.Input[_builtins.str]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering WorkersRoute resources.
        :param pulumi.Input[_builtins.str] pattern: Pattern to match incoming requests against. [Learn more](https://developers.cloudflare.com/workers/configuration/routing/routes/#matching-behavior).
        :param pulumi.Input[_builtins.str] script: Name of the script to run if the route matches.
        :param pulumi.Input[_builtins.str] zone_id: Identifier.
        """
        if pattern is not None:
            pulumi.set(__self__, "pattern", pattern)
        if script is not None:
            pulumi.set(__self__, "script", script)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter
    def pattern(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Pattern to match incoming requests against. [Learn more](https://developers.cloudflare.com/workers/configuration/routing/routes/#matching-behavior).
        """
        return pulumi.get(self, "pattern")

    @pattern.setter
    def pattern(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "pattern", value)

    @_builtins.property
    @pulumi.getter
    def script(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the script to run if the route matches.
        """
        return pulumi.get(self, "script")

    @script.setter
    def script(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "script", value)

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Identifier.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "zone_id", value)


@pulumi.type_token("cloudflare:index/workersRoute:WorkersRoute")
class WorkersRoute(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 pattern: Optional[pulumi.Input[_builtins.str]] = None,
                 script: Optional[pulumi.Input[_builtins.str]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_workers_route = cloudflare.WorkersRoute("example_workers_route",
            zone_id="023e105f4ecef8ad9ca31a8372d0c353",
            pattern="example.com/*",
            script="my-workers-script")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/workersRoute:WorkersRoute example '<zone_id>/<route_id>'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] pattern: Pattern to match incoming requests against. [Learn more](https://developers.cloudflare.com/workers/configuration/routing/routes/#matching-behavior).
        :param pulumi.Input[_builtins.str] script: Name of the script to run if the route matches.
        :param pulumi.Input[_builtins.str] zone_id: Identifier.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WorkersRouteArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_workers_route = cloudflare.WorkersRoute("example_workers_route",
            zone_id="023e105f4ecef8ad9ca31a8372d0c353",
            pattern="example.com/*",
            script="my-workers-script")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/workersRoute:WorkersRoute example '<zone_id>/<route_id>'
        ```

        :param str resource_name: The name of the resource.
        :param WorkersRouteArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WorkersRouteArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 pattern: Optional[pulumi.Input[_builtins.str]] = None,
                 script: Optional[pulumi.Input[_builtins.str]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WorkersRouteArgs.__new__(WorkersRouteArgs)

            if pattern is None and not opts.urn:
                raise TypeError("Missing required property 'pattern'")
            __props__.__dict__["pattern"] = pattern
            __props__.__dict__["script"] = script
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
        super(WorkersRoute, __self__).__init__(
            'cloudflare:index/workersRoute:WorkersRoute',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            pattern: Optional[pulumi.Input[_builtins.str]] = None,
            script: Optional[pulumi.Input[_builtins.str]] = None,
            zone_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'WorkersRoute':
        """
        Get an existing WorkersRoute resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] pattern: Pattern to match incoming requests against. [Learn more](https://developers.cloudflare.com/workers/configuration/routing/routes/#matching-behavior).
        :param pulumi.Input[_builtins.str] script: Name of the script to run if the route matches.
        :param pulumi.Input[_builtins.str] zone_id: Identifier.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WorkersRouteState.__new__(_WorkersRouteState)

        __props__.__dict__["pattern"] = pattern
        __props__.__dict__["script"] = script
        __props__.__dict__["zone_id"] = zone_id
        return WorkersRoute(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def pattern(self) -> pulumi.Output[_builtins.str]:
        """
        Pattern to match incoming requests against. [Learn more](https://developers.cloudflare.com/workers/configuration/routing/routes/#matching-behavior).
        """
        return pulumi.get(self, "pattern")

    @_builtins.property
    @pulumi.getter
    def script(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Name of the script to run if the route matches.
        """
        return pulumi.get(self, "script")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[_builtins.str]:
        """
        Identifier.
        """
        return pulumi.get(self, "zone_id")

