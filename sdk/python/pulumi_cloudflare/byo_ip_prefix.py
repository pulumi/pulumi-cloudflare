# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['ByoIpPrefix']


class ByoIpPrefix(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 advertisement: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 prefix_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides the ability to manage Bring-Your-Own-IP prefixes (BYOIP) which are used with or without Magic Transit.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.ByoIpPrefix("example",
            advertisement="on",
            description="Example IP Prefix",
            prefix_id="d41d8cd98f00b204e9800998ecf8427e")
        ```

        ## Import

        The current settings for Bring-Your-Own-IP prefixes can be imported using the prefix ID.

        ```sh
         $ pulumi import cloudflare:index/byoIpPrefix:ByoIpPrefix example d41d8cd98f00b204e9800998ecf8427e
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] advertisement: Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Valid values: `on` or `off`.
        :param pulumi.Input[str] description: The description of the prefix.
        :param pulumi.Input[str] prefix_id: The assigned Bring-Your-Own-IP prefix ID.
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

            __props__['advertisement'] = advertisement
            __props__['description'] = description
            if prefix_id is None and not opts.urn:
                raise TypeError("Missing required property 'prefix_id'")
            __props__['prefix_id'] = prefix_id
        super(ByoIpPrefix, __self__).__init__(
            'cloudflare:index/byoIpPrefix:ByoIpPrefix',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            advertisement: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            prefix_id: Optional[pulumi.Input[str]] = None) -> 'ByoIpPrefix':
        """
        Get an existing ByoIpPrefix resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] advertisement: Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Valid values: `on` or `off`.
        :param pulumi.Input[str] description: The description of the prefix.
        :param pulumi.Input[str] prefix_id: The assigned Bring-Your-Own-IP prefix ID.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["advertisement"] = advertisement
        __props__["description"] = description
        __props__["prefix_id"] = prefix_id
        return ByoIpPrefix(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def advertisement(self) -> pulumi.Output[str]:
        """
        Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Valid values: `on` or `off`.
        """
        return pulumi.get(self, "advertisement")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        The description of the prefix.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="prefixId")
    def prefix_id(self) -> pulumi.Output[str]:
        """
        The assigned Bring-Your-Own-IP prefix ID.
        """
        return pulumi.get(self, "prefix_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

