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

__all__ = ['RateLimit']


class RateLimit(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[pulumi.InputType['RateLimitActionArgs']]] = None,
                 bypass_url_patterns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 correlate: Optional[pulumi.Input[pulumi.InputType['RateLimitCorrelateArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 match: Optional[pulumi.Input[pulumi.InputType['RateLimitMatchArgs']]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 threshold: Optional[pulumi.Input[int]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Cloudflare rate limit resource for a given zone. This can be used to limit the traffic you receive zone-wide, or matching more specific types of requests/responses.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.RateLimit("example",
            zone_id=var["cloudflare_zone_id"],
            threshold=2000,
            period=2,
            match=cloudflare.RateLimitMatchArgs(
                request=cloudflare.RateLimitMatchRequestArgs(
                    url_pattern=f"{var['cloudflare_zone']}/*",
                    schemes=[
                        "HTTP",
                        "HTTPS",
                    ],
                    methods=[
                        "GET",
                        "POST",
                        "PUT",
                        "DELETE",
                        "PATCH",
                        "HEAD",
                    ],
                ),
                response=cloudflare.RateLimitMatchResponseArgs(
                    statuses=[
                        200,
                        201,
                        202,
                        301,
                        429,
                    ],
                    origin_traffic=False,
                    headers=[
                        {
                            "name": "Host",
                            "op": "eq",
                            "value": "localhost",
                        },
                        {
                            "name": "X-Example",
                            "op": "ne",
                            "value": "my-example",
                        },
                    ],
                ),
            ),
            action=cloudflare.RateLimitActionArgs(
                mode="simulate",
                timeout=43200,
                response=cloudflare.RateLimitActionResponseArgs(
                    content_type="text/plain",
                    body="custom response body",
                ),
            ),
            correlate=cloudflare.RateLimitCorrelateArgs(
                by="nat",
            ),
            disabled=False,
            description="example rate limit for a zone",
            bypass_url_patterns=[
                f"{var['cloudflare_zone']}/bypass1",
                f"{var['cloudflare_zone']}/bypass2",
            ])
        ```

        ## Import

        Rate limits can be imported using a composite ID formed of zone name and rate limit ID, e.g.

        ```sh
         $ pulumi import cloudflare:index/rateLimit:RateLimit default d41d8cd98f00b204e9800998ecf8427e/ch8374ftwdghsif43
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['RateLimitActionArgs']] action: The action to be performed when the threshold of matched traffic within the period defined is exceeded.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] bypass_url_patterns: URLs matching the patterns specified here will be excluded from rate limiting.
        :param pulumi.Input[pulumi.InputType['RateLimitCorrelateArgs']] correlate: Determines how rate limiting is applied. By default if not specified, rate limiting applies to the clients IP address.
        :param pulumi.Input[str] description: A note that you can use to describe the reason for a rate limit. This value is sanitized and all tags are removed.
        :param pulumi.Input[bool] disabled: Whether this ratelimit is currently disabled. Default: `false`.
        :param pulumi.Input[pulumi.InputType['RateLimitMatchArgs']] match: Determines which traffic the rate limit counts towards the threshold. By default matches all traffic in the zone. See definition below.
        :param pulumi.Input[int] period: The time in seconds to count matching traffic. If the count exceeds threshold within this period the action will be performed (min: 1, max: 86,400).
        :param pulumi.Input[int] threshold: The threshold that triggers the rate limit mitigations, combine with period. i.e. threshold per period (min: 2, max: 1,000,000).
        :param pulumi.Input[str] zone_id: The DNS zone ID to apply rate limiting to.
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

            if action is None and not opts.urn:
                raise TypeError("Missing required property 'action'")
            __props__['action'] = action
            __props__['bypass_url_patterns'] = bypass_url_patterns
            __props__['correlate'] = correlate
            __props__['description'] = description
            __props__['disabled'] = disabled
            __props__['match'] = match
            if period is None and not opts.urn:
                raise TypeError("Missing required property 'period'")
            __props__['period'] = period
            if threshold is None and not opts.urn:
                raise TypeError("Missing required property 'threshold'")
            __props__['threshold'] = threshold
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__['zone_id'] = zone_id
        super(RateLimit, __self__).__init__(
            'cloudflare:index/rateLimit:RateLimit',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            action: Optional[pulumi.Input[pulumi.InputType['RateLimitActionArgs']]] = None,
            bypass_url_patterns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            correlate: Optional[pulumi.Input[pulumi.InputType['RateLimitCorrelateArgs']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            disabled: Optional[pulumi.Input[bool]] = None,
            match: Optional[pulumi.Input[pulumi.InputType['RateLimitMatchArgs']]] = None,
            period: Optional[pulumi.Input[int]] = None,
            threshold: Optional[pulumi.Input[int]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'RateLimit':
        """
        Get an existing RateLimit resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['RateLimitActionArgs']] action: The action to be performed when the threshold of matched traffic within the period defined is exceeded.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] bypass_url_patterns: URLs matching the patterns specified here will be excluded from rate limiting.
        :param pulumi.Input[pulumi.InputType['RateLimitCorrelateArgs']] correlate: Determines how rate limiting is applied. By default if not specified, rate limiting applies to the clients IP address.
        :param pulumi.Input[str] description: A note that you can use to describe the reason for a rate limit. This value is sanitized and all tags are removed.
        :param pulumi.Input[bool] disabled: Whether this ratelimit is currently disabled. Default: `false`.
        :param pulumi.Input[pulumi.InputType['RateLimitMatchArgs']] match: Determines which traffic the rate limit counts towards the threshold. By default matches all traffic in the zone. See definition below.
        :param pulumi.Input[int] period: The time in seconds to count matching traffic. If the count exceeds threshold within this period the action will be performed (min: 1, max: 86,400).
        :param pulumi.Input[int] threshold: The threshold that triggers the rate limit mitigations, combine with period. i.e. threshold per period (min: 2, max: 1,000,000).
        :param pulumi.Input[str] zone_id: The DNS zone ID to apply rate limiting to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["action"] = action
        __props__["bypass_url_patterns"] = bypass_url_patterns
        __props__["correlate"] = correlate
        __props__["description"] = description
        __props__["disabled"] = disabled
        __props__["match"] = match
        __props__["period"] = period
        __props__["threshold"] = threshold
        __props__["zone_id"] = zone_id
        return RateLimit(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Output['outputs.RateLimitAction']:
        """
        The action to be performed when the threshold of matched traffic within the period defined is exceeded.
        """
        return pulumi.get(self, "action")

    @property
    @pulumi.getter(name="bypassUrlPatterns")
    def bypass_url_patterns(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        URLs matching the patterns specified here will be excluded from rate limiting.
        """
        return pulumi.get(self, "bypass_url_patterns")

    @property
    @pulumi.getter
    def correlate(self) -> pulumi.Output[Optional['outputs.RateLimitCorrelate']]:
        """
        Determines how rate limiting is applied. By default if not specified, rate limiting applies to the clients IP address.
        """
        return pulumi.get(self, "correlate")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A note that you can use to describe the reason for a rate limit. This value is sanitized and all tags are removed.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def disabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether this ratelimit is currently disabled. Default: `false`.
        """
        return pulumi.get(self, "disabled")

    @property
    @pulumi.getter
    def match(self) -> pulumi.Output['outputs.RateLimitMatch']:
        """
        Determines which traffic the rate limit counts towards the threshold. By default matches all traffic in the zone. See definition below.
        """
        return pulumi.get(self, "match")

    @property
    @pulumi.getter
    def period(self) -> pulumi.Output[int]:
        """
        The time in seconds to count matching traffic. If the count exceeds threshold within this period the action will be performed (min: 1, max: 86,400).
        """
        return pulumi.get(self, "period")

    @property
    @pulumi.getter
    def threshold(self) -> pulumi.Output[int]:
        """
        The threshold that triggers the rate limit mitigations, combine with period. i.e. threshold per period (min: 2, max: 1,000,000).
        """
        return pulumi.get(self, "threshold")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The DNS zone ID to apply rate limiting to.
        """
        return pulumi.get(self, "zone_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

