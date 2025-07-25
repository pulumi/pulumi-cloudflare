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

__all__ = ['AuthenticatedOriginPullsSettingsArgs', 'AuthenticatedOriginPullsSettings']

@pulumi.input_type
class AuthenticatedOriginPullsSettingsArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[_builtins.bool],
                 zone_id: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a AuthenticatedOriginPullsSettings resource.
        :param pulumi.Input[_builtins.bool] enabled: Indicates whether zone-level authenticated origin pulls is enabled.
        :param pulumi.Input[_builtins.str] zone_id: Identifier.
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[_builtins.bool]:
        """
        Indicates whether zone-level authenticated origin pulls is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[_builtins.bool]):
        pulumi.set(self, "enabled", value)

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


@pulumi.input_type
class _AuthenticatedOriginPullsSettingsState:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering AuthenticatedOriginPullsSettings resources.
        :param pulumi.Input[_builtins.bool] enabled: Indicates whether zone-level authenticated origin pulls is enabled.
        :param pulumi.Input[_builtins.str] zone_id: Identifier.
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Indicates whether zone-level authenticated origin pulls is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

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


@pulumi.type_token("cloudflare:index/authenticatedOriginPullsSettings:AuthenticatedOriginPullsSettings")
class AuthenticatedOriginPullsSettings(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_authenticated_origin_pulls_settings = cloudflare.AuthenticatedOriginPullsSettings("example_authenticated_origin_pulls_settings",
            zone_id="023e105f4ecef8ad9ca31a8372d0c353",
            enabled=True)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] enabled: Indicates whether zone-level authenticated origin pulls is enabled.
        :param pulumi.Input[_builtins.str] zone_id: Identifier.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AuthenticatedOriginPullsSettingsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_authenticated_origin_pulls_settings = cloudflare.AuthenticatedOriginPullsSettings("example_authenticated_origin_pulls_settings",
            zone_id="023e105f4ecef8ad9ca31a8372d0c353",
            enabled=True)
        ```

        :param str resource_name: The name of the resource.
        :param AuthenticatedOriginPullsSettingsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AuthenticatedOriginPullsSettingsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AuthenticatedOriginPullsSettingsArgs.__new__(AuthenticatedOriginPullsSettingsArgs)

            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
        super(AuthenticatedOriginPullsSettings, __self__).__init__(
            'cloudflare:index/authenticatedOriginPullsSettings:AuthenticatedOriginPullsSettings',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            zone_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'AuthenticatedOriginPullsSettings':
        """
        Get an existing AuthenticatedOriginPullsSettings resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] enabled: Indicates whether zone-level authenticated origin pulls is enabled.
        :param pulumi.Input[_builtins.str] zone_id: Identifier.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AuthenticatedOriginPullsSettingsState.__new__(_AuthenticatedOriginPullsSettingsState)

        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["zone_id"] = zone_id
        return AuthenticatedOriginPullsSettings(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[_builtins.bool]:
        """
        Indicates whether zone-level authenticated origin pulls is enabled.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[_builtins.str]:
        """
        Identifier.
        """
        return pulumi.get(self, "zone_id")

