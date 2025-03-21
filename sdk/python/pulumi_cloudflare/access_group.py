# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
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

__all__ = ['AccessGroupArgs', 'AccessGroup']

@pulumi.input_type
class AccessGroupArgs:
    def __init__(__self__, *,
                 includes: pulumi.Input[Sequence[pulumi.Input['AccessGroupIncludeArgs']]],
                 name: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[str]] = None,
                 excludes: Optional[pulumi.Input[Sequence[pulumi.Input['AccessGroupExcludeArgs']]]] = None,
                 requires: Optional[pulumi.Input[Sequence[pulumi.Input['AccessGroupRequireArgs']]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccessGroup resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        pulumi.set(__self__, "includes", includes)
        pulumi.set(__self__, "name", name)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if excludes is not None:
            pulumi.set(__self__, "excludes", excludes)
        if requires is not None:
            pulumi.set(__self__, "requires", requires)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def includes(self) -> pulumi.Input[Sequence[pulumi.Input['AccessGroupIncludeArgs']]]:
        return pulumi.get(self, "includes")

    @includes.setter
    def includes(self, value: pulumi.Input[Sequence[pulumi.Input['AccessGroupIncludeArgs']]]):
        pulumi.set(self, "includes", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def excludes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AccessGroupExcludeArgs']]]]:
        return pulumi.get(self, "excludes")

    @excludes.setter
    def excludes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AccessGroupExcludeArgs']]]]):
        pulumi.set(self, "excludes", value)

    @property
    @pulumi.getter
    def requires(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AccessGroupRequireArgs']]]]:
        return pulumi.get(self, "requires")

    @requires.setter
    def requires(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AccessGroupRequireArgs']]]]):
        pulumi.set(self, "requires", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


@pulumi.input_type
class _AccessGroupState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 excludes: Optional[pulumi.Input[Sequence[pulumi.Input['AccessGroupExcludeArgs']]]] = None,
                 includes: Optional[pulumi.Input[Sequence[pulumi.Input['AccessGroupIncludeArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 requires: Optional[pulumi.Input[Sequence[pulumi.Input['AccessGroupRequireArgs']]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AccessGroup resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if excludes is not None:
            pulumi.set(__self__, "excludes", excludes)
        if includes is not None:
            pulumi.set(__self__, "includes", includes)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if requires is not None:
            pulumi.set(__self__, "requires", requires)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def excludes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AccessGroupExcludeArgs']]]]:
        return pulumi.get(self, "excludes")

    @excludes.setter
    def excludes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AccessGroupExcludeArgs']]]]):
        pulumi.set(self, "excludes", value)

    @property
    @pulumi.getter
    def includes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AccessGroupIncludeArgs']]]]:
        return pulumi.get(self, "includes")

    @includes.setter
    def includes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AccessGroupIncludeArgs']]]]):
        pulumi.set(self, "includes", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def requires(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AccessGroupRequireArgs']]]]:
        return pulumi.get(self, "requires")

    @requires.setter
    def requires(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AccessGroupRequireArgs']]]]):
        pulumi.set(self, "requires", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class AccessGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 excludes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AccessGroupExcludeArgs', 'AccessGroupExcludeArgsDict']]]]] = None,
                 includes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AccessGroupIncludeArgs', 'AccessGroupIncludeArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 requires: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AccessGroupRequireArgs', 'AccessGroupRequireArgsDict']]]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare Access Group resource. Access Groups are used
        in conjunction with Access Policies to restrict access to a
        particular resource based on group membership.

        > It's required that an `account_id` or `zone_id` is provided and in
           most cases using either is fine. However, if you're using a scoped
           access token, you must provide the argument that matches the token's
           scope. For example, an access token that is scoped to the "example.com"
           zone needs to use the `zone_id` argument.

        ## Import

        ```sh
        $ pulumi import cloudflare:index/accessGroup:AccessGroup example <account_id>/<group_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccessGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare Access Group resource. Access Groups are used
        in conjunction with Access Policies to restrict access to a
        particular resource based on group membership.

        > It's required that an `account_id` or `zone_id` is provided and in
           most cases using either is fine. However, if you're using a scoped
           access token, you must provide the argument that matches the token's
           scope. For example, an access token that is scoped to the "example.com"
           zone needs to use the `zone_id` argument.

        ## Import

        ```sh
        $ pulumi import cloudflare:index/accessGroup:AccessGroup example <account_id>/<group_id>
        ```

        :param str resource_name: The name of the resource.
        :param AccessGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccessGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 excludes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AccessGroupExcludeArgs', 'AccessGroupExcludeArgsDict']]]]] = None,
                 includes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AccessGroupIncludeArgs', 'AccessGroupIncludeArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 requires: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AccessGroupRequireArgs', 'AccessGroupRequireArgsDict']]]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccessGroupArgs.__new__(AccessGroupArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["excludes"] = excludes
            if includes is None and not opts.urn:
                raise TypeError("Missing required property 'includes'")
            __props__.__dict__["includes"] = includes
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["requires"] = requires
            __props__.__dict__["zone_id"] = zone_id
        super(AccessGroup, __self__).__init__(
            'cloudflare:index/accessGroup:AccessGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            excludes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AccessGroupExcludeArgs', 'AccessGroupExcludeArgsDict']]]]] = None,
            includes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AccessGroupIncludeArgs', 'AccessGroupIncludeArgsDict']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            requires: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AccessGroupRequireArgs', 'AccessGroupRequireArgsDict']]]]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'AccessGroup':
        """
        Get an existing AccessGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccessGroupState.__new__(_AccessGroupState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["excludes"] = excludes
        __props__.__dict__["includes"] = includes
        __props__.__dict__["name"] = name
        __props__.__dict__["requires"] = requires
        __props__.__dict__["zone_id"] = zone_id
        return AccessGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[Optional[str]]:
        """
        The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def excludes(self) -> pulumi.Output[Optional[Sequence['outputs.AccessGroupExclude']]]:
        return pulumi.get(self, "excludes")

    @property
    @pulumi.getter
    def includes(self) -> pulumi.Output[Sequence['outputs.AccessGroupInclude']]:
        return pulumi.get(self, "includes")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def requires(self) -> pulumi.Output[Optional[Sequence['outputs.AccessGroupRequire']]]:
        return pulumi.get(self, "requires")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        return pulumi.get(self, "zone_id")

