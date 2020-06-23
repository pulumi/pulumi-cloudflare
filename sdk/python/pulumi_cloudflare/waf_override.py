# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class WafOverride(pulumi.CustomResource):
    description: pulumi.Output[str]
    """
    Description of what the WAF override does.
    """
    groups: pulumi.Output[dict]
    """
    Similar to `rules`; which WAF groups you want to alter.
    """
    override_id: pulumi.Output[str]
    paused: pulumi.Output[bool]
    """
    Whether this package is currently paused.
    """
    priority: pulumi.Output[float]
    """
    Relative priority of this configuration when multiple configurations match a single URL.
    """
    rewrite_action: pulumi.Output[dict]
    """
    When a WAF rule matches, substitute its configured action for a different action specified by this definition.
    """
    rules: pulumi.Output[dict]
    """
    A list of WAF rule ID to rule action you intend to apply.
    """
    urls: pulumi.Output[list]
    """
    An array of URLs to apply the WAF override to.
    """
    zone_id: pulumi.Output[str]
    """
    The DNS zone to which the WAF override condition should be added.
    """
    def __init__(__self__, resource_name, opts=None, description=None, groups=None, paused=None, priority=None, rewrite_action=None, rules=None, urls=None, zone_id=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Cloudflare WAF override resource. This enables the ability to toggle
        WAF rules and groups on or off based on URIs.



        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of what the WAF override does.
        :param pulumi.Input[dict] groups: Similar to `rules`; which WAF groups you want to alter.
        :param pulumi.Input[bool] paused: Whether this package is currently paused.
        :param pulumi.Input[float] priority: Relative priority of this configuration when multiple configurations match a single URL.
        :param pulumi.Input[dict] rewrite_action: When a WAF rule matches, substitute its configured action for a different action specified by this definition.
        :param pulumi.Input[dict] rules: A list of WAF rule ID to rule action you intend to apply.
        :param pulumi.Input[list] urls: An array of URLs to apply the WAF override to.
        :param pulumi.Input[str] zone_id: The DNS zone to which the WAF override condition should be added.
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
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['description'] = description
            __props__['groups'] = groups
            __props__['paused'] = paused
            __props__['priority'] = priority
            __props__['rewrite_action'] = rewrite_action
            if rules is None:
                raise TypeError("Missing required property 'rules'")
            __props__['rules'] = rules
            if urls is None:
                raise TypeError("Missing required property 'urls'")
            __props__['urls'] = urls
            if zone_id is None:
                raise TypeError("Missing required property 'zone_id'")
            __props__['zone_id'] = zone_id
            __props__['override_id'] = None
        super(WafOverride, __self__).__init__(
            'cloudflare:index/wafOverride:WafOverride',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, description=None, groups=None, override_id=None, paused=None, priority=None, rewrite_action=None, rules=None, urls=None, zone_id=None):
        """
        Get an existing WafOverride resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of what the WAF override does.
        :param pulumi.Input[dict] groups: Similar to `rules`; which WAF groups you want to alter.
        :param pulumi.Input[bool] paused: Whether this package is currently paused.
        :param pulumi.Input[float] priority: Relative priority of this configuration when multiple configurations match a single URL.
        :param pulumi.Input[dict] rewrite_action: When a WAF rule matches, substitute its configured action for a different action specified by this definition.
        :param pulumi.Input[dict] rules: A list of WAF rule ID to rule action you intend to apply.
        :param pulumi.Input[list] urls: An array of URLs to apply the WAF override to.
        :param pulumi.Input[str] zone_id: The DNS zone to which the WAF override condition should be added.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["description"] = description
        __props__["groups"] = groups
        __props__["override_id"] = override_id
        __props__["paused"] = paused
        __props__["priority"] = priority
        __props__["rewrite_action"] = rewrite_action
        __props__["rules"] = rules
        __props__["urls"] = urls
        __props__["zone_id"] = zone_id
        return WafOverride(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
