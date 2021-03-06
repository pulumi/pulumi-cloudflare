# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['ZoneSettingsOverride']


class ZoneSettingsOverride(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 settings: Optional[pulumi.Input[pulumi.InputType['ZoneSettingsOverrideSettingsArgs']]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a resource which customizes Cloudflare zone settings. Note that after destroying this resource Zone Settings will be reset to their initial values.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        test = cloudflare.ZoneSettingsOverride("test",
            zone_id=var["cloudflare_zone_id"],
            settings=cloudflare.ZoneSettingsOverrideSettingsArgs(
                brotli="on",
                challenge_ttl=2700,
                security_level="high",
                opportunistic_encryption="on",
                automatic_https_rewrites="on",
                mirage="on",
                waf="on",
                minify=cloudflare.ZoneSettingsOverrideSettingsMinifyArgs(
                    css="on",
                    js="off",
                    html="off",
                ),
                security_header=cloudflare.ZoneSettingsOverrideSettingsSecurityHeaderArgs(
                    enabled=True,
                ),
            ))
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ZoneSettingsOverrideSettingsArgs']] settings: Settings overrides that will be applied to the zone. If a setting is not specified the existing setting will be used. For a full list of available settings see below.
        :param pulumi.Input[str] zone_id: The DNS zone ID to which apply settings.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['settings'] = settings
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__['zone_id'] = zone_id
            __props__['initial_settings'] = None
            __props__['initial_settings_read_at'] = None
            __props__['readonly_settings'] = None
            __props__['zone_status'] = None
            __props__['zone_type'] = None
        super(ZoneSettingsOverride, __self__).__init__(
            'cloudflare:index/zoneSettingsOverride:ZoneSettingsOverride',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            initial_settings: Optional[pulumi.Input[pulumi.InputType['ZoneSettingsOverrideInitialSettingsArgs']]] = None,
            initial_settings_read_at: Optional[pulumi.Input[str]] = None,
            readonly_settings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            settings: Optional[pulumi.Input[pulumi.InputType['ZoneSettingsOverrideSettingsArgs']]] = None,
            zone_id: Optional[pulumi.Input[str]] = None,
            zone_status: Optional[pulumi.Input[str]] = None,
            zone_type: Optional[pulumi.Input[str]] = None) -> 'ZoneSettingsOverride':
        """
        Get an existing ZoneSettingsOverride resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ZoneSettingsOverrideInitialSettingsArgs']] initial_settings: Settings present in the zone at the time the resource is created. This will be used to restore the original settings when this resource is destroyed. Shares the same schema as the `settings` attribute (Above).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] readonly_settings: Which of the current `settings` are not able to be set by the user. Which settings these are is determined by plan level and user permissions.
               * `zone_status`. A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup.
               * `zone_type`. Status of the zone. Valid values: active, pending, initializing, moved, deleted, deactivated.
        :param pulumi.Input[pulumi.InputType['ZoneSettingsOverrideSettingsArgs']] settings: Settings overrides that will be applied to the zone. If a setting is not specified the existing setting will be used. For a full list of available settings see below.
        :param pulumi.Input[str] zone_id: The DNS zone ID to which apply settings.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["initial_settings"] = initial_settings
        __props__["initial_settings_read_at"] = initial_settings_read_at
        __props__["readonly_settings"] = readonly_settings
        __props__["settings"] = settings
        __props__["zone_id"] = zone_id
        __props__["zone_status"] = zone_status
        __props__["zone_type"] = zone_type
        return ZoneSettingsOverride(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="initialSettings")
    def initial_settings(self) -> pulumi.Output['outputs.ZoneSettingsOverrideInitialSettings']:
        """
        Settings present in the zone at the time the resource is created. This will be used to restore the original settings when this resource is destroyed. Shares the same schema as the `settings` attribute (Above).
        """
        return pulumi.get(self, "initial_settings")

    @property
    @pulumi.getter(name="initialSettingsReadAt")
    def initial_settings_read_at(self) -> pulumi.Output[str]:
        return pulumi.get(self, "initial_settings_read_at")

    @property
    @pulumi.getter(name="readonlySettings")
    def readonly_settings(self) -> pulumi.Output[Sequence[str]]:
        """
        Which of the current `settings` are not able to be set by the user. Which settings these are is determined by plan level and user permissions.
        * `zone_status`. A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup.
        * `zone_type`. Status of the zone. Valid values: active, pending, initializing, moved, deleted, deactivated.
        """
        return pulumi.get(self, "readonly_settings")

    @property
    @pulumi.getter
    def settings(self) -> pulumi.Output['outputs.ZoneSettingsOverrideSettings']:
        """
        Settings overrides that will be applied to the zone. If a setting is not specified the existing setting will be used. For a full list of available settings see below.
        """
        return pulumi.get(self, "settings")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The DNS zone ID to which apply settings.
        """
        return pulumi.get(self, "zone_id")

    @property
    @pulumi.getter(name="zoneStatus")
    def zone_status(self) -> pulumi.Output[str]:
        return pulumi.get(self, "zone_status")

    @property
    @pulumi.getter(name="zoneType")
    def zone_type(self) -> pulumi.Output[str]:
        return pulumi.get(self, "zone_type")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

