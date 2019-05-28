# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from . import utilities, tables

class Argo(pulumi.CustomResource):
    smart_routing: pulumi.Output[str]
    """
    Whether smart routing is enabled. Valid values: `on` or `off`. Defaults to `off`.
    """
    tiered_caching: pulumi.Output[str]
    """
    Whether tiered caching is enabled. Valid values: `on` or `off`. Defaults to `off`.
    """
    zone_id: pulumi.Output[str]
    """
    The DNS zone ID that you wish to manage Argo on.
    """
    def __init__(__self__, resource_name, opts=None, smart_routing=None, tiered_caching=None, zone_id=None, __name__=None, __opts__=None):
        """
        Cloudflare Argo controls the routing to your origin and tiered caching options to speed up your website browsing experience.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] smart_routing: Whether smart routing is enabled. Valid values: `on` or `off`. Defaults to `off`.
        :param pulumi.Input[str] tiered_caching: Whether tiered caching is enabled. Valid values: `on` or `off`. Defaults to `off`.
        :param pulumi.Input[str] zone_id: The DNS zone ID that you wish to manage Argo on.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if not resource_name:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(resource_name, str):
            raise TypeError('Expected resource name to be a string')
        if opts and not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        __props__['smart_routing'] = smart_routing

        __props__['tiered_caching'] = tiered_caching

        if zone_id is None:
            raise TypeError("Missing required property 'zone_id'")
        __props__['zone_id'] = zone_id

        super(Argo, __self__).__init__(
            'cloudflare:index/argo:Argo',
            resource_name,
            __props__,
            opts)


    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
