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

__all__ = ['ZeroTrustGatewaySettingsArgs', 'ZeroTrustGatewaySettings']

@pulumi.input_type
class ZeroTrustGatewaySettingsArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[_builtins.str],
                 settings: Optional[pulumi.Input['ZeroTrustGatewaySettingsSettingsArgs']] = None):
        """
        The set of arguments for constructing a ZeroTrustGatewaySettings resource.
        :param pulumi.Input['ZeroTrustGatewaySettingsSettingsArgs'] settings: Account settings
        """
        pulumi.set(__self__, "account_id", account_id)
        if settings is not None:
            pulumi.set(__self__, "settings", settings)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[_builtins.str]:
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter
    def settings(self) -> Optional[pulumi.Input['ZeroTrustGatewaySettingsSettingsArgs']]:
        """
        Account settings
        """
        return pulumi.get(self, "settings")

    @settings.setter
    def settings(self, value: Optional[pulumi.Input['ZeroTrustGatewaySettingsSettingsArgs']]):
        pulumi.set(self, "settings", value)


@pulumi.input_type
class _ZeroTrustGatewaySettingsState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 created_at: Optional[pulumi.Input[_builtins.str]] = None,
                 settings: Optional[pulumi.Input['ZeroTrustGatewaySettingsSettingsArgs']] = None,
                 updated_at: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ZeroTrustGatewaySettings resources.
        :param pulumi.Input['ZeroTrustGatewaySettingsSettingsArgs'] settings: Account settings
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if settings is not None:
            pulumi.set(__self__, "settings", settings)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "created_at", value)

    @_builtins.property
    @pulumi.getter
    def settings(self) -> Optional[pulumi.Input['ZeroTrustGatewaySettingsSettingsArgs']]:
        """
        Account settings
        """
        return pulumi.get(self, "settings")

    @settings.setter
    def settings(self, value: Optional[pulumi.Input['ZeroTrustGatewaySettingsSettingsArgs']]):
        pulumi.set(self, "settings", value)

    @_builtins.property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "updated_at", value)


@pulumi.type_token("cloudflare:index/zeroTrustGatewaySettings:ZeroTrustGatewaySettings")
class ZeroTrustGatewaySettings(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 settings: Optional[pulumi.Input[Union['ZeroTrustGatewaySettingsSettingsArgs', 'ZeroTrustGatewaySettingsSettingsArgsDict']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import cloudflare:index/zeroTrustGatewaySettings:ZeroTrustGatewaySettings example '<account_id>'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['ZeroTrustGatewaySettingsSettingsArgs', 'ZeroTrustGatewaySettingsSettingsArgsDict']] settings: Account settings
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ZeroTrustGatewaySettingsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import cloudflare:index/zeroTrustGatewaySettings:ZeroTrustGatewaySettings example '<account_id>'
        ```

        :param str resource_name: The name of the resource.
        :param ZeroTrustGatewaySettingsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ZeroTrustGatewaySettingsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 settings: Optional[pulumi.Input[Union['ZeroTrustGatewaySettingsSettingsArgs', 'ZeroTrustGatewaySettingsSettingsArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ZeroTrustGatewaySettingsArgs.__new__(ZeroTrustGatewaySettingsArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["settings"] = settings
            __props__.__dict__["created_at"] = None
            __props__.__dict__["updated_at"] = None
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="cloudflare:index/teamsAccount:TeamsAccount")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(ZeroTrustGatewaySettings, __self__).__init__(
            'cloudflare:index/zeroTrustGatewaySettings:ZeroTrustGatewaySettings',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[_builtins.str]] = None,
            created_at: Optional[pulumi.Input[_builtins.str]] = None,
            settings: Optional[pulumi.Input[Union['ZeroTrustGatewaySettingsSettingsArgs', 'ZeroTrustGatewaySettingsSettingsArgsDict']]] = None,
            updated_at: Optional[pulumi.Input[_builtins.str]] = None) -> 'ZeroTrustGatewaySettings':
        """
        Get an existing ZeroTrustGatewaySettings resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['ZeroTrustGatewaySettingsSettingsArgs', 'ZeroTrustGatewaySettingsSettingsArgsDict']] settings: Account settings
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ZeroTrustGatewaySettingsState.__new__(_ZeroTrustGatewaySettingsState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["settings"] = settings
        __props__.__dict__["updated_at"] = updated_at
        return ZeroTrustGatewaySettings(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "created_at")

    @_builtins.property
    @pulumi.getter
    def settings(self) -> pulumi.Output['outputs.ZeroTrustGatewaySettingsSettings']:
        """
        Account settings
        """
        return pulumi.get(self, "settings")

    @_builtins.property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "updated_at")

