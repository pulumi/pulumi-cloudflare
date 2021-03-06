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

__all__ = ['IpList']


class IpList(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 items: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IpListItemArgs']]]]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        IP Lists are a set of IP addresses or CIDR ranges that are configured on the account level. Once created, IP Lists can be
        used in Firewall Rules across all zones within the same account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.IpList("example",
            account_id="d41d8cd98f00b204e9800998ecf8427e",
            description="list description",
            items=[
                cloudflare.IpListItemArgs(
                    comment="Office IP",
                    value="192.0.2.1",
                ),
                cloudflare.IpListItemArgs(
                    comment="Datacenter range",
                    value="203.0.113.0/24",
                ),
            ],
            kind="ip",
            name="example_list")
        ```

        ## Import

        An existing IP List can be imported using the account ID and list ID

        ```sh
         $ pulumi import cloudflare:index/ipList:IpList example d41d8cd98f00b204e9800998ecf8427e/cb029e245cfdd66dc8d2e570d5dd3322
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The ID of the account where the IP List is being created.
        :param pulumi.Input[str] description: A note that can be used to annotate the List. Maximum Length: 500
        :param pulumi.Input[str] kind: The kind of values in the List. Valid values: `ip`.
        :param pulumi.Input[str] name: The name of the list (used in filter expressions). Valid pattern: `^[a-zA-Z0-9_]+$`. Maximum Length: 50
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

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__['account_id'] = account_id
            __props__['description'] = description
            __props__['items'] = items
            if kind is None and not opts.urn:
                raise TypeError("Missing required property 'kind'")
            __props__['kind'] = kind
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__['name'] = name
        super(IpList, __self__).__init__(
            'cloudflare:index/ipList:IpList',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            items: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IpListItemArgs']]]]] = None,
            kind: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'IpList':
        """
        Get an existing IpList resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The ID of the account where the IP List is being created.
        :param pulumi.Input[str] description: A note that can be used to annotate the List. Maximum Length: 500
        :param pulumi.Input[str] kind: The kind of values in the List. Valid values: `ip`.
        :param pulumi.Input[str] name: The name of the list (used in filter expressions). Valid pattern: `^[a-zA-Z0-9_]+$`. Maximum Length: 50
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["account_id"] = account_id
        __props__["description"] = description
        __props__["items"] = items
        __props__["kind"] = kind
        __props__["name"] = name
        return IpList(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The ID of the account where the IP List is being created.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A note that can be used to annotate the List. Maximum Length: 500
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def items(self) -> pulumi.Output[Optional[Sequence['outputs.IpListItem']]]:
        return pulumi.get(self, "items")

    @property
    @pulumi.getter
    def kind(self) -> pulumi.Output[str]:
        """
        The kind of values in the List. Valid values: `ip`.
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the list (used in filter expressions). Valid pattern: `^[a-zA-Z0-9_]+$`. Maximum Length: 50
        """
        return pulumi.get(self, "name")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

