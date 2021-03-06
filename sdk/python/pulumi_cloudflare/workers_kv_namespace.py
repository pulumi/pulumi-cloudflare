# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['WorkersKvNamespace']


class WorkersKvNamespace(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Workers KV Namespace

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.WorkersKvNamespace("example", title="test-namespace")
        ```

        ## Import

        Workers KV Namespace settings can be imported using it's ID

        ```sh
         $ pulumi import cloudflare:index/workersKvNamespace:WorkersKvNamespace example beaeb6716c9443eaa4deef11763ccca6
        ```

         where- `beaeb6716c9443eaa4deef11763ccca6` is the ID of the namespace

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] title: The name of the namespace you wish to create.
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

            if title is None and not opts.urn:
                raise TypeError("Missing required property 'title'")
            __props__['title'] = title
        super(WorkersKvNamespace, __self__).__init__(
            'cloudflare:index/workersKvNamespace:WorkersKvNamespace',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            title: Optional[pulumi.Input[str]] = None) -> 'WorkersKvNamespace':
        """
        Get an existing WorkersKvNamespace resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] title: The name of the namespace you wish to create.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["title"] = title
        return WorkersKvNamespace(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Output[str]:
        """
        The name of the namespace you wish to create.
        """
        return pulumi.get(self, "title")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

