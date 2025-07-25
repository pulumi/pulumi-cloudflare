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
from ._inputs import *

__all__ = ['HyperdriveConfigArgs', 'HyperdriveConfig']

@pulumi.input_type
class HyperdriveConfigArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[_builtins.str],
                 name: pulumi.Input[_builtins.str],
                 origin: pulumi.Input['HyperdriveConfigOriginArgs'],
                 caching: Optional[pulumi.Input['HyperdriveConfigCachingArgs']] = None,
                 mtls: Optional[pulumi.Input['HyperdriveConfigMtlsArgs']] = None):
        """
        The set of arguments for constructing a HyperdriveConfig resource.
        :param pulumi.Input[_builtins.str] account_id: Define configurations using a unique string identifier.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "origin", origin)
        if caching is not None:
            pulumi.set(__self__, "caching", caching)
        if mtls is not None:
            pulumi.set(__self__, "mtls", mtls)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[_builtins.str]:
        """
        Define configurations using a unique string identifier.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Input[_builtins.str]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def origin(self) -> pulumi.Input['HyperdriveConfigOriginArgs']:
        return pulumi.get(self, "origin")

    @origin.setter
    def origin(self, value: pulumi.Input['HyperdriveConfigOriginArgs']):
        pulumi.set(self, "origin", value)

    @_builtins.property
    @pulumi.getter
    def caching(self) -> Optional[pulumi.Input['HyperdriveConfigCachingArgs']]:
        return pulumi.get(self, "caching")

    @caching.setter
    def caching(self, value: Optional[pulumi.Input['HyperdriveConfigCachingArgs']]):
        pulumi.set(self, "caching", value)

    @_builtins.property
    @pulumi.getter
    def mtls(self) -> Optional[pulumi.Input['HyperdriveConfigMtlsArgs']]:
        return pulumi.get(self, "mtls")

    @mtls.setter
    def mtls(self, value: Optional[pulumi.Input['HyperdriveConfigMtlsArgs']]):
        pulumi.set(self, "mtls", value)


@pulumi.input_type
class _HyperdriveConfigState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 caching: Optional[pulumi.Input['HyperdriveConfigCachingArgs']] = None,
                 created_on: Optional[pulumi.Input[_builtins.str]] = None,
                 modified_on: Optional[pulumi.Input[_builtins.str]] = None,
                 mtls: Optional[pulumi.Input['HyperdriveConfigMtlsArgs']] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 origin: Optional[pulumi.Input['HyperdriveConfigOriginArgs']] = None):
        """
        Input properties used for looking up and filtering HyperdriveConfig resources.
        :param pulumi.Input[_builtins.str] account_id: Define configurations using a unique string identifier.
        :param pulumi.Input[_builtins.str] created_on: Defines the creation time of the Hyperdrive configuration.
        :param pulumi.Input[_builtins.str] modified_on: Defines the last modified time of the Hyperdrive configuration.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if caching is not None:
            pulumi.set(__self__, "caching", caching)
        if created_on is not None:
            pulumi.set(__self__, "created_on", created_on)
        if modified_on is not None:
            pulumi.set(__self__, "modified_on", modified_on)
        if mtls is not None:
            pulumi.set(__self__, "mtls", mtls)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if origin is not None:
            pulumi.set(__self__, "origin", origin)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Define configurations using a unique string identifier.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter
    def caching(self) -> Optional[pulumi.Input['HyperdriveConfigCachingArgs']]:
        return pulumi.get(self, "caching")

    @caching.setter
    def caching(self, value: Optional[pulumi.Input['HyperdriveConfigCachingArgs']]):
        pulumi.set(self, "caching", value)

    @_builtins.property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Defines the creation time of the Hyperdrive configuration.
        """
        return pulumi.get(self, "created_on")

    @created_on.setter
    def created_on(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "created_on", value)

    @_builtins.property
    @pulumi.getter(name="modifiedOn")
    def modified_on(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Defines the last modified time of the Hyperdrive configuration.
        """
        return pulumi.get(self, "modified_on")

    @modified_on.setter
    def modified_on(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "modified_on", value)

    @_builtins.property
    @pulumi.getter
    def mtls(self) -> Optional[pulumi.Input['HyperdriveConfigMtlsArgs']]:
        return pulumi.get(self, "mtls")

    @mtls.setter
    def mtls(self, value: Optional[pulumi.Input['HyperdriveConfigMtlsArgs']]):
        pulumi.set(self, "mtls", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def origin(self) -> Optional[pulumi.Input['HyperdriveConfigOriginArgs']]:
        return pulumi.get(self, "origin")

    @origin.setter
    def origin(self, value: Optional[pulumi.Input['HyperdriveConfigOriginArgs']]):
        pulumi.set(self, "origin", value)


@pulumi.type_token("cloudflare:index/hyperdriveConfig:HyperdriveConfig")
class HyperdriveConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 caching: Optional[pulumi.Input[Union['HyperdriveConfigCachingArgs', 'HyperdriveConfigCachingArgsDict']]] = None,
                 mtls: Optional[pulumi.Input[Union['HyperdriveConfigMtlsArgs', 'HyperdriveConfigMtlsArgsDict']]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 origin: Optional[pulumi.Input[Union['HyperdriveConfigOriginArgs', 'HyperdriveConfigOriginArgsDict']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import cloudflare:index/hyperdriveConfig:HyperdriveConfig example '<account_id>/<hyperdrive_id>'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: Define configurations using a unique string identifier.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HyperdriveConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import cloudflare:index/hyperdriveConfig:HyperdriveConfig example '<account_id>/<hyperdrive_id>'
        ```

        :param str resource_name: The name of the resource.
        :param HyperdriveConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HyperdriveConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 caching: Optional[pulumi.Input[Union['HyperdriveConfigCachingArgs', 'HyperdriveConfigCachingArgsDict']]] = None,
                 mtls: Optional[pulumi.Input[Union['HyperdriveConfigMtlsArgs', 'HyperdriveConfigMtlsArgsDict']]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 origin: Optional[pulumi.Input[Union['HyperdriveConfigOriginArgs', 'HyperdriveConfigOriginArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HyperdriveConfigArgs.__new__(HyperdriveConfigArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["caching"] = caching
            __props__.__dict__["mtls"] = mtls
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            if origin is None and not opts.urn:
                raise TypeError("Missing required property 'origin'")
            __props__.__dict__["origin"] = origin
            __props__.__dict__["created_on"] = None
            __props__.__dict__["modified_on"] = None
        super(HyperdriveConfig, __self__).__init__(
            'cloudflare:index/hyperdriveConfig:HyperdriveConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[_builtins.str]] = None,
            caching: Optional[pulumi.Input[Union['HyperdriveConfigCachingArgs', 'HyperdriveConfigCachingArgsDict']]] = None,
            created_on: Optional[pulumi.Input[_builtins.str]] = None,
            modified_on: Optional[pulumi.Input[_builtins.str]] = None,
            mtls: Optional[pulumi.Input[Union['HyperdriveConfigMtlsArgs', 'HyperdriveConfigMtlsArgsDict']]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            origin: Optional[pulumi.Input[Union['HyperdriveConfigOriginArgs', 'HyperdriveConfigOriginArgsDict']]] = None) -> 'HyperdriveConfig':
        """
        Get an existing HyperdriveConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: Define configurations using a unique string identifier.
        :param pulumi.Input[_builtins.str] created_on: Defines the creation time of the Hyperdrive configuration.
        :param pulumi.Input[_builtins.str] modified_on: Defines the last modified time of the Hyperdrive configuration.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HyperdriveConfigState.__new__(_HyperdriveConfigState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["caching"] = caching
        __props__.__dict__["created_on"] = created_on
        __props__.__dict__["modified_on"] = modified_on
        __props__.__dict__["mtls"] = mtls
        __props__.__dict__["name"] = name
        __props__.__dict__["origin"] = origin
        return HyperdriveConfig(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[_builtins.str]:
        """
        Define configurations using a unique string identifier.
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter
    def caching(self) -> pulumi.Output[Optional['outputs.HyperdriveConfigCaching']]:
        return pulumi.get(self, "caching")

    @_builtins.property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> pulumi.Output[_builtins.str]:
        """
        Defines the creation time of the Hyperdrive configuration.
        """
        return pulumi.get(self, "created_on")

    @_builtins.property
    @pulumi.getter(name="modifiedOn")
    def modified_on(self) -> pulumi.Output[_builtins.str]:
        """
        Defines the last modified time of the Hyperdrive configuration.
        """
        return pulumi.get(self, "modified_on")

    @_builtins.property
    @pulumi.getter
    def mtls(self) -> pulumi.Output[Optional['outputs.HyperdriveConfigMtls']]:
        return pulumi.get(self, "mtls")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def origin(self) -> pulumi.Output['outputs.HyperdriveConfigOrigin']:
        return pulumi.get(self, "origin")

