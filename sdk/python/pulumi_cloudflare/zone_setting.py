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

__all__ = ['ZoneSettingArgs', 'ZoneSetting']

@pulumi.input_type
class ZoneSettingArgs:
    def __init__(__self__, *,
                 setting_id: pulumi.Input[_builtins.str],
                 value: Any,
                 zone_id: pulumi.Input[_builtins.str],
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        The set of arguments for constructing a ZoneSetting resource.
        :param pulumi.Input[_builtins.str] setting_id: Setting name
        :param Any value: Current value of the zone setting.
        :param pulumi.Input[_builtins.str] zone_id: Identifier
        :param pulumi.Input[_builtins.bool] enabled: ssl-recommender enrollment setting.
        """
        pulumi.set(__self__, "setting_id", setting_id)
        pulumi.set(__self__, "value", value)
        pulumi.set(__self__, "zone_id", zone_id)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)

    @_builtins.property
    @pulumi.getter(name="settingId")
    def setting_id(self) -> pulumi.Input[_builtins.str]:
        """
        Setting name
        """
        return pulumi.get(self, "setting_id")

    @setting_id.setter
    def setting_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "setting_id", value)

    @_builtins.property
    @pulumi.getter
    def value(self) -> Any:
        """
        Current value of the zone setting.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Any):
        pulumi.set(self, "value", value)

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[_builtins.str]:
        """
        Identifier
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "zone_id", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        ssl-recommender enrollment setting.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)


@pulumi.input_type
class _ZoneSettingState:
    def __init__(__self__, *,
                 editable: Optional[pulumi.Input[_builtins.bool]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 modified_on: Optional[pulumi.Input[_builtins.str]] = None,
                 setting_id: Optional[pulumi.Input[_builtins.str]] = None,
                 time_remaining: Optional[pulumi.Input[_builtins.float]] = None,
                 value: Optional[Any] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ZoneSetting resources.
        :param pulumi.Input[_builtins.bool] editable: Whether or not this setting can be modified for this zone (based on your Cloudflare plan level).
        :param pulumi.Input[_builtins.bool] enabled: ssl-recommender enrollment setting.
        :param pulumi.Input[_builtins.str] modified_on: last time this setting was modified.
        :param pulumi.Input[_builtins.str] setting_id: Setting name
        :param pulumi.Input[_builtins.float] time_remaining: Value of the zone setting.
               Notes: The interval (in seconds) from when development mode expires (positive integer) or last expired (negative integer) for the domain. If development mode has never been enabled, this value is false.
        :param Any value: Current value of the zone setting.
        :param pulumi.Input[_builtins.str] zone_id: Identifier
        """
        if editable is not None:
            pulumi.set(__self__, "editable", editable)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if modified_on is not None:
            pulumi.set(__self__, "modified_on", modified_on)
        if setting_id is not None:
            pulumi.set(__self__, "setting_id", setting_id)
        if time_remaining is not None:
            pulumi.set(__self__, "time_remaining", time_remaining)
        if value is not None:
            pulumi.set(__self__, "value", value)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter
    def editable(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether or not this setting can be modified for this zone (based on your Cloudflare plan level).
        """
        return pulumi.get(self, "editable")

    @editable.setter
    def editable(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "editable", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        ssl-recommender enrollment setting.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter(name="modifiedOn")
    def modified_on(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        last time this setting was modified.
        """
        return pulumi.get(self, "modified_on")

    @modified_on.setter
    def modified_on(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "modified_on", value)

    @_builtins.property
    @pulumi.getter(name="settingId")
    def setting_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Setting name
        """
        return pulumi.get(self, "setting_id")

    @setting_id.setter
    def setting_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "setting_id", value)

    @_builtins.property
    @pulumi.getter(name="timeRemaining")
    def time_remaining(self) -> Optional[pulumi.Input[_builtins.float]]:
        """
        Value of the zone setting.
        Notes: The interval (in seconds) from when development mode expires (positive integer) or last expired (negative integer) for the domain. If development mode has never been enabled, this value is false.
        """
        return pulumi.get(self, "time_remaining")

    @time_remaining.setter
    def time_remaining(self, value: Optional[pulumi.Input[_builtins.float]]):
        pulumi.set(self, "time_remaining", value)

    @_builtins.property
    @pulumi.getter
    def value(self) -> Optional[Any]:
        """
        Current value of the zone setting.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[Any]):
        pulumi.set(self, "value", value)

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Identifier
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "zone_id", value)


@pulumi.type_token("cloudflare:index/zoneSetting:ZoneSetting")
class ZoneSetting(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 setting_id: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[Any] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        > If using the `ssl_recommender` zone setting, use the `enabled` attribute instead of `value`.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_zone_setting = cloudflare.ZoneSetting("example_zone_setting",
            zone_id="023e105f4ecef8ad9ca31a8372d0c353",
            setting_id="always_online",
            value="on")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/zoneSetting:ZoneSetting example '<zone_id>/<setting_id>'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] enabled: ssl-recommender enrollment setting.
        :param pulumi.Input[_builtins.str] setting_id: Setting name
        :param Any value: Current value of the zone setting.
        :param pulumi.Input[_builtins.str] zone_id: Identifier
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ZoneSettingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > If using the `ssl_recommender` zone setting, use the `enabled` attribute instead of `value`.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_zone_setting = cloudflare.ZoneSetting("example_zone_setting",
            zone_id="023e105f4ecef8ad9ca31a8372d0c353",
            setting_id="always_online",
            value="on")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/zoneSetting:ZoneSetting example '<zone_id>/<setting_id>'
        ```

        :param str resource_name: The name of the resource.
        :param ZoneSettingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ZoneSettingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 setting_id: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[Any] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ZoneSettingArgs.__new__(ZoneSettingArgs)

            __props__.__dict__["enabled"] = enabled
            if setting_id is None and not opts.urn:
                raise TypeError("Missing required property 'setting_id'")
            __props__.__dict__["setting_id"] = setting_id
            if value is None and not opts.urn:
                raise TypeError("Missing required property 'value'")
            __props__.__dict__["value"] = value
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["editable"] = None
            __props__.__dict__["modified_on"] = None
            __props__.__dict__["time_remaining"] = None
        super(ZoneSetting, __self__).__init__(
            'cloudflare:index/zoneSetting:ZoneSetting',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            editable: Optional[pulumi.Input[_builtins.bool]] = None,
            enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            modified_on: Optional[pulumi.Input[_builtins.str]] = None,
            setting_id: Optional[pulumi.Input[_builtins.str]] = None,
            time_remaining: Optional[pulumi.Input[_builtins.float]] = None,
            value: Optional[Any] = None,
            zone_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'ZoneSetting':
        """
        Get an existing ZoneSetting resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] editable: Whether or not this setting can be modified for this zone (based on your Cloudflare plan level).
        :param pulumi.Input[_builtins.bool] enabled: ssl-recommender enrollment setting.
        :param pulumi.Input[_builtins.str] modified_on: last time this setting was modified.
        :param pulumi.Input[_builtins.str] setting_id: Setting name
        :param pulumi.Input[_builtins.float] time_remaining: Value of the zone setting.
               Notes: The interval (in seconds) from when development mode expires (positive integer) or last expired (negative integer) for the domain. If development mode has never been enabled, this value is false.
        :param Any value: Current value of the zone setting.
        :param pulumi.Input[_builtins.str] zone_id: Identifier
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ZoneSettingState.__new__(_ZoneSettingState)

        __props__.__dict__["editable"] = editable
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["modified_on"] = modified_on
        __props__.__dict__["setting_id"] = setting_id
        __props__.__dict__["time_remaining"] = time_remaining
        __props__.__dict__["value"] = value
        __props__.__dict__["zone_id"] = zone_id
        return ZoneSetting(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def editable(self) -> pulumi.Output[_builtins.bool]:
        """
        Whether or not this setting can be modified for this zone (based on your Cloudflare plan level).
        """
        return pulumi.get(self, "editable")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[_builtins.bool]:
        """
        ssl-recommender enrollment setting.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter(name="modifiedOn")
    def modified_on(self) -> pulumi.Output[_builtins.str]:
        """
        last time this setting was modified.
        """
        return pulumi.get(self, "modified_on")

    @_builtins.property
    @pulumi.getter(name="settingId")
    def setting_id(self) -> pulumi.Output[_builtins.str]:
        """
        Setting name
        """
        return pulumi.get(self, "setting_id")

    @_builtins.property
    @pulumi.getter(name="timeRemaining")
    def time_remaining(self) -> pulumi.Output[_builtins.float]:
        """
        Value of the zone setting.
        Notes: The interval (in seconds) from when development mode expires (positive integer) or last expired (negative integer) for the domain. If development mode has never been enabled, this value is false.
        """
        return pulumi.get(self, "time_remaining")

    @_builtins.property
    @pulumi.getter
    def value(self) -> pulumi.Output[Any]:
        """
        Current value of the zone setting.
        """
        return pulumi.get(self, "value")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[_builtins.str]:
        """
        Identifier
        """
        return pulumi.get(self, "zone_id")

