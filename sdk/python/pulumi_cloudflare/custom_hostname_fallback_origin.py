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

__all__ = ['CustomHostnameFallbackOriginArgs', 'CustomHostnameFallbackOrigin']

@pulumi.input_type
class CustomHostnameFallbackOriginArgs:
    def __init__(__self__, *,
                 origin: pulumi.Input[_builtins.str],
                 zone_id: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a CustomHostnameFallbackOrigin resource.
        :param pulumi.Input[_builtins.str] origin: Your origin hostname that requests to your custom hostnames will be sent to.
        :param pulumi.Input[_builtins.str] zone_id: Identifier.
        """
        pulumi.set(__self__, "origin", origin)
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter
    def origin(self) -> pulumi.Input[_builtins.str]:
        """
        Your origin hostname that requests to your custom hostnames will be sent to.
        """
        return pulumi.get(self, "origin")

    @origin.setter
    def origin(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "origin", value)

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
class _CustomHostnameFallbackOriginState:
    def __init__(__self__, *,
                 created_at: Optional[pulumi.Input[_builtins.str]] = None,
                 errors: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 origin: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 updated_at: Optional[pulumi.Input[_builtins.str]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering CustomHostnameFallbackOrigin resources.
        :param pulumi.Input[_builtins.str] created_at: This is the time the fallback origin was created.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] errors: These are errors that were encountered while trying to activate a fallback origin.
        :param pulumi.Input[_builtins.str] origin: Your origin hostname that requests to your custom hostnames will be sent to.
        :param pulumi.Input[_builtins.str] status: Status of the fallback origin's activation.
               Available values: "initializing", "pending*deployment", "pending*deletion", "active", "deployment*timed*out", "deletion*timed*out".
        :param pulumi.Input[_builtins.str] updated_at: This is the time the fallback origin was updated.
        :param pulumi.Input[_builtins.str] zone_id: Identifier.
        """
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if errors is not None:
            pulumi.set(__self__, "errors", errors)
        if origin is not None:
            pulumi.set(__self__, "origin", origin)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        This is the time the fallback origin was created.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "created_at", value)

    @_builtins.property
    @pulumi.getter
    def errors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        These are errors that were encountered while trying to activate a fallback origin.
        """
        return pulumi.get(self, "errors")

    @errors.setter
    def errors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "errors", value)

    @_builtins.property
    @pulumi.getter
    def origin(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Your origin hostname that requests to your custom hostnames will be sent to.
        """
        return pulumi.get(self, "origin")

    @origin.setter
    def origin(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "origin", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Status of the fallback origin's activation.
        Available values: "initializing", "pending*deployment", "pending*deletion", "active", "deployment*timed*out", "deletion*timed*out".
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)

    @_builtins.property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        This is the time the fallback origin was updated.
        """
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "updated_at", value)

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


@pulumi.type_token("cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin")
class CustomHostnameFallbackOrigin(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 origin: Optional[pulumi.Input[_builtins.str]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_custom_hostname_fallback_origin = cloudflare.CustomHostnameFallbackOrigin("example_custom_hostname_fallback_origin",
            zone_id="023e105f4ecef8ad9ca31a8372d0c353",
            origin="fallback.example.com")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin example '<zone_id>'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] origin: Your origin hostname that requests to your custom hostnames will be sent to.
        :param pulumi.Input[_builtins.str] zone_id: Identifier.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CustomHostnameFallbackOriginArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_custom_hostname_fallback_origin = cloudflare.CustomHostnameFallbackOrigin("example_custom_hostname_fallback_origin",
            zone_id="023e105f4ecef8ad9ca31a8372d0c353",
            origin="fallback.example.com")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin example '<zone_id>'
        ```

        :param str resource_name: The name of the resource.
        :param CustomHostnameFallbackOriginArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CustomHostnameFallbackOriginArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 origin: Optional[pulumi.Input[_builtins.str]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CustomHostnameFallbackOriginArgs.__new__(CustomHostnameFallbackOriginArgs)

            if origin is None and not opts.urn:
                raise TypeError("Missing required property 'origin'")
            __props__.__dict__["origin"] = origin
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["created_at"] = None
            __props__.__dict__["errors"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["updated_at"] = None
        super(CustomHostnameFallbackOrigin, __self__).__init__(
            'cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_at: Optional[pulumi.Input[_builtins.str]] = None,
            errors: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            origin: Optional[pulumi.Input[_builtins.str]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None,
            updated_at: Optional[pulumi.Input[_builtins.str]] = None,
            zone_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'CustomHostnameFallbackOrigin':
        """
        Get an existing CustomHostnameFallbackOrigin resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] created_at: This is the time the fallback origin was created.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] errors: These are errors that were encountered while trying to activate a fallback origin.
        :param pulumi.Input[_builtins.str] origin: Your origin hostname that requests to your custom hostnames will be sent to.
        :param pulumi.Input[_builtins.str] status: Status of the fallback origin's activation.
               Available values: "initializing", "pending*deployment", "pending*deletion", "active", "deployment*timed*out", "deletion*timed*out".
        :param pulumi.Input[_builtins.str] updated_at: This is the time the fallback origin was updated.
        :param pulumi.Input[_builtins.str] zone_id: Identifier.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CustomHostnameFallbackOriginState.__new__(_CustomHostnameFallbackOriginState)

        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["errors"] = errors
        __props__.__dict__["origin"] = origin
        __props__.__dict__["status"] = status
        __props__.__dict__["updated_at"] = updated_at
        __props__.__dict__["zone_id"] = zone_id
        return CustomHostnameFallbackOrigin(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[_builtins.str]:
        """
        This is the time the fallback origin was created.
        """
        return pulumi.get(self, "created_at")

    @_builtins.property
    @pulumi.getter
    def errors(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        These are errors that were encountered while trying to activate a fallback origin.
        """
        return pulumi.get(self, "errors")

    @_builtins.property
    @pulumi.getter
    def origin(self) -> pulumi.Output[_builtins.str]:
        """
        Your origin hostname that requests to your custom hostnames will be sent to.
        """
        return pulumi.get(self, "origin")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[_builtins.str]:
        """
        Status of the fallback origin's activation.
        Available values: "initializing", "pending*deployment", "pending*deletion", "active", "deployment*timed*out", "deletion*timed*out".
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[_builtins.str]:
        """
        This is the time the fallback origin was updated.
        """
        return pulumi.get(self, "updated_at")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[_builtins.str]:
        """
        Identifier.
        """
        return pulumi.get(self, "zone_id")

