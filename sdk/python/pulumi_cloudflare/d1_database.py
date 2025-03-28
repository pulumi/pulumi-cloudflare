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

__all__ = ['D1DatabaseArgs', 'D1Database']

@pulumi.input_type
class D1DatabaseArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 name: pulumi.Input[str]):
        """
        The set of arguments for constructing a D1Database resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] name: The name of the D1 Database.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name of the D1 Database.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _D1DatabaseState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering D1Database resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] name: The name of the D1 Database.
        :param pulumi.Input[str] version: The backend version of the database.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the D1 Database.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[str]]:
        """
        The backend version of the database.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version", value)


class D1Database(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The [D1 Database](https://developers.cloudflare.com/d1/) resource allows you to manage Cloudflare D1 databases.

        !> When a D1 Database is replaced all the data is lost. Please ensure you have a
           backup of your data before replacing a D1 Database.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.D1Database("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="terraform-database")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/d1Database:D1Database example <account id>/<database id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] name: The name of the D1 Database.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: D1DatabaseArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The [D1 Database](https://developers.cloudflare.com/d1/) resource allows you to manage Cloudflare D1 databases.

        !> When a D1 Database is replaced all the data is lost. Please ensure you have a
           backup of your data before replacing a D1 Database.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.D1Database("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="terraform-database")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/d1Database:D1Database example <account id>/<database id>
        ```

        :param str resource_name: The name of the resource.
        :param D1DatabaseArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(D1DatabaseArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = D1DatabaseArgs.__new__(D1DatabaseArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["version"] = None
        super(D1Database, __self__).__init__(
            'cloudflare:index/d1Database:D1Database',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[str]] = None) -> 'D1Database':
        """
        Get an existing D1Database resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] name: The name of the D1 Database.
        :param pulumi.Input[str] version: The backend version of the database.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _D1DatabaseState.__new__(_D1DatabaseState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["name"] = name
        __props__.__dict__["version"] = version
        return D1Database(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the D1 Database.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[str]:
        """
        The backend version of the database.
        """
        return pulumi.get(self, "version")

