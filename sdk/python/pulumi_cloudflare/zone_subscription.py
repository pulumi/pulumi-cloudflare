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

__all__ = ['ZoneSubscriptionArgs', 'ZoneSubscription']

@pulumi.input_type
class ZoneSubscriptionArgs:
    def __init__(__self__, *,
                 zone_id: pulumi.Input[_builtins.str],
                 frequency: Optional[pulumi.Input[_builtins.str]] = None,
                 rate_plan: Optional[pulumi.Input['ZoneSubscriptionRatePlanArgs']] = None):
        """
        The set of arguments for constructing a ZoneSubscription resource.
        :param pulumi.Input[_builtins.str] zone_id: Subscription identifier tag.
        :param pulumi.Input[_builtins.str] frequency: How often the subscription is renewed automatically.
               Available values: "weekly", "monthly", "quarterly", "yearly".
        :param pulumi.Input['ZoneSubscriptionRatePlanArgs'] rate_plan: The rate plan applied to the subscription.
        """
        pulumi.set(__self__, "zone_id", zone_id)
        if frequency is not None:
            pulumi.set(__self__, "frequency", frequency)
        if rate_plan is not None:
            pulumi.set(__self__, "rate_plan", rate_plan)

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[_builtins.str]:
        """
        Subscription identifier tag.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "zone_id", value)

    @_builtins.property
    @pulumi.getter
    def frequency(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        How often the subscription is renewed automatically.
        Available values: "weekly", "monthly", "quarterly", "yearly".
        """
        return pulumi.get(self, "frequency")

    @frequency.setter
    def frequency(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "frequency", value)

    @_builtins.property
    @pulumi.getter(name="ratePlan")
    def rate_plan(self) -> Optional[pulumi.Input['ZoneSubscriptionRatePlanArgs']]:
        """
        The rate plan applied to the subscription.
        """
        return pulumi.get(self, "rate_plan")

    @rate_plan.setter
    def rate_plan(self, value: Optional[pulumi.Input['ZoneSubscriptionRatePlanArgs']]):
        pulumi.set(self, "rate_plan", value)


@pulumi.input_type
class _ZoneSubscriptionState:
    def __init__(__self__, *,
                 currency: Optional[pulumi.Input[_builtins.str]] = None,
                 current_period_end: Optional[pulumi.Input[_builtins.str]] = None,
                 current_period_start: Optional[pulumi.Input[_builtins.str]] = None,
                 frequency: Optional[pulumi.Input[_builtins.str]] = None,
                 price: Optional[pulumi.Input[_builtins.float]] = None,
                 rate_plan: Optional[pulumi.Input['ZoneSubscriptionRatePlanArgs']] = None,
                 state: Optional[pulumi.Input[_builtins.str]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ZoneSubscription resources.
        :param pulumi.Input[_builtins.str] currency: The monetary unit in which pricing information is displayed.
        :param pulumi.Input[_builtins.str] current_period_end: The end of the current period and also when the next billing is due.
        :param pulumi.Input[_builtins.str] current_period_start: When the current billing period started. May match initial*period*start if this is the first period.
        :param pulumi.Input[_builtins.str] frequency: How often the subscription is renewed automatically.
               Available values: "weekly", "monthly", "quarterly", "yearly".
        :param pulumi.Input[_builtins.float] price: The price of the subscription that will be billed, in US dollars.
        :param pulumi.Input['ZoneSubscriptionRatePlanArgs'] rate_plan: The rate plan applied to the subscription.
        :param pulumi.Input[_builtins.str] state: The state that the subscription is in.
               Available values: "Trial", "Provisioned", "Paid", "AwaitingPayment", "Cancelled", "Failed", "Expired".
        :param pulumi.Input[_builtins.str] zone_id: Subscription identifier tag.
        """
        if currency is not None:
            pulumi.set(__self__, "currency", currency)
        if current_period_end is not None:
            pulumi.set(__self__, "current_period_end", current_period_end)
        if current_period_start is not None:
            pulumi.set(__self__, "current_period_start", current_period_start)
        if frequency is not None:
            pulumi.set(__self__, "frequency", frequency)
        if price is not None:
            pulumi.set(__self__, "price", price)
        if rate_plan is not None:
            pulumi.set(__self__, "rate_plan", rate_plan)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter
    def currency(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The monetary unit in which pricing information is displayed.
        """
        return pulumi.get(self, "currency")

    @currency.setter
    def currency(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "currency", value)

    @_builtins.property
    @pulumi.getter(name="currentPeriodEnd")
    def current_period_end(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The end of the current period and also when the next billing is due.
        """
        return pulumi.get(self, "current_period_end")

    @current_period_end.setter
    def current_period_end(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "current_period_end", value)

    @_builtins.property
    @pulumi.getter(name="currentPeriodStart")
    def current_period_start(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        When the current billing period started. May match initial*period*start if this is the first period.
        """
        return pulumi.get(self, "current_period_start")

    @current_period_start.setter
    def current_period_start(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "current_period_start", value)

    @_builtins.property
    @pulumi.getter
    def frequency(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        How often the subscription is renewed automatically.
        Available values: "weekly", "monthly", "quarterly", "yearly".
        """
        return pulumi.get(self, "frequency")

    @frequency.setter
    def frequency(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "frequency", value)

    @_builtins.property
    @pulumi.getter
    def price(self) -> Optional[pulumi.Input[_builtins.float]]:
        """
        The price of the subscription that will be billed, in US dollars.
        """
        return pulumi.get(self, "price")

    @price.setter
    def price(self, value: Optional[pulumi.Input[_builtins.float]]):
        pulumi.set(self, "price", value)

    @_builtins.property
    @pulumi.getter(name="ratePlan")
    def rate_plan(self) -> Optional[pulumi.Input['ZoneSubscriptionRatePlanArgs']]:
        """
        The rate plan applied to the subscription.
        """
        return pulumi.get(self, "rate_plan")

    @rate_plan.setter
    def rate_plan(self, value: Optional[pulumi.Input['ZoneSubscriptionRatePlanArgs']]):
        pulumi.set(self, "rate_plan", value)

    @_builtins.property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The state that the subscription is in.
        Available values: "Trial", "Provisioned", "Paid", "AwaitingPayment", "Cancelled", "Failed", "Expired".
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "state", value)

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Subscription identifier tag.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "zone_id", value)


@pulumi.type_token("cloudflare:index/zoneSubscription:ZoneSubscription")
class ZoneSubscription(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 frequency: Optional[pulumi.Input[_builtins.str]] = None,
                 rate_plan: Optional[pulumi.Input[Union['ZoneSubscriptionRatePlanArgs', 'ZoneSubscriptionRatePlanArgsDict']]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import cloudflare:index/zoneSubscription:ZoneSubscription example '<zone_id>'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] frequency: How often the subscription is renewed automatically.
               Available values: "weekly", "monthly", "quarterly", "yearly".
        :param pulumi.Input[Union['ZoneSubscriptionRatePlanArgs', 'ZoneSubscriptionRatePlanArgsDict']] rate_plan: The rate plan applied to the subscription.
        :param pulumi.Input[_builtins.str] zone_id: Subscription identifier tag.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ZoneSubscriptionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import cloudflare:index/zoneSubscription:ZoneSubscription example '<zone_id>'
        ```

        :param str resource_name: The name of the resource.
        :param ZoneSubscriptionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ZoneSubscriptionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 frequency: Optional[pulumi.Input[_builtins.str]] = None,
                 rate_plan: Optional[pulumi.Input[Union['ZoneSubscriptionRatePlanArgs', 'ZoneSubscriptionRatePlanArgsDict']]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ZoneSubscriptionArgs.__new__(ZoneSubscriptionArgs)

            __props__.__dict__["frequency"] = frequency
            __props__.__dict__["rate_plan"] = rate_plan
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["currency"] = None
            __props__.__dict__["current_period_end"] = None
            __props__.__dict__["current_period_start"] = None
            __props__.__dict__["price"] = None
            __props__.__dict__["state"] = None
        super(ZoneSubscription, __self__).__init__(
            'cloudflare:index/zoneSubscription:ZoneSubscription',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            currency: Optional[pulumi.Input[_builtins.str]] = None,
            current_period_end: Optional[pulumi.Input[_builtins.str]] = None,
            current_period_start: Optional[pulumi.Input[_builtins.str]] = None,
            frequency: Optional[pulumi.Input[_builtins.str]] = None,
            price: Optional[pulumi.Input[_builtins.float]] = None,
            rate_plan: Optional[pulumi.Input[Union['ZoneSubscriptionRatePlanArgs', 'ZoneSubscriptionRatePlanArgsDict']]] = None,
            state: Optional[pulumi.Input[_builtins.str]] = None,
            zone_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'ZoneSubscription':
        """
        Get an existing ZoneSubscription resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] currency: The monetary unit in which pricing information is displayed.
        :param pulumi.Input[_builtins.str] current_period_end: The end of the current period and also when the next billing is due.
        :param pulumi.Input[_builtins.str] current_period_start: When the current billing period started. May match initial*period*start if this is the first period.
        :param pulumi.Input[_builtins.str] frequency: How often the subscription is renewed automatically.
               Available values: "weekly", "monthly", "quarterly", "yearly".
        :param pulumi.Input[_builtins.float] price: The price of the subscription that will be billed, in US dollars.
        :param pulumi.Input[Union['ZoneSubscriptionRatePlanArgs', 'ZoneSubscriptionRatePlanArgsDict']] rate_plan: The rate plan applied to the subscription.
        :param pulumi.Input[_builtins.str] state: The state that the subscription is in.
               Available values: "Trial", "Provisioned", "Paid", "AwaitingPayment", "Cancelled", "Failed", "Expired".
        :param pulumi.Input[_builtins.str] zone_id: Subscription identifier tag.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ZoneSubscriptionState.__new__(_ZoneSubscriptionState)

        __props__.__dict__["currency"] = currency
        __props__.__dict__["current_period_end"] = current_period_end
        __props__.__dict__["current_period_start"] = current_period_start
        __props__.__dict__["frequency"] = frequency
        __props__.__dict__["price"] = price
        __props__.__dict__["rate_plan"] = rate_plan
        __props__.__dict__["state"] = state
        __props__.__dict__["zone_id"] = zone_id
        return ZoneSubscription(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def currency(self) -> pulumi.Output[_builtins.str]:
        """
        The monetary unit in which pricing information is displayed.
        """
        return pulumi.get(self, "currency")

    @_builtins.property
    @pulumi.getter(name="currentPeriodEnd")
    def current_period_end(self) -> pulumi.Output[_builtins.str]:
        """
        The end of the current period and also when the next billing is due.
        """
        return pulumi.get(self, "current_period_end")

    @_builtins.property
    @pulumi.getter(name="currentPeriodStart")
    def current_period_start(self) -> pulumi.Output[_builtins.str]:
        """
        When the current billing period started. May match initial*period*start if this is the first period.
        """
        return pulumi.get(self, "current_period_start")

    @_builtins.property
    @pulumi.getter
    def frequency(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        How often the subscription is renewed automatically.
        Available values: "weekly", "monthly", "quarterly", "yearly".
        """
        return pulumi.get(self, "frequency")

    @_builtins.property
    @pulumi.getter
    def price(self) -> pulumi.Output[_builtins.float]:
        """
        The price of the subscription that will be billed, in US dollars.
        """
        return pulumi.get(self, "price")

    @_builtins.property
    @pulumi.getter(name="ratePlan")
    def rate_plan(self) -> pulumi.Output[Optional['outputs.ZoneSubscriptionRatePlan']]:
        """
        The rate plan applied to the subscription.
        """
        return pulumi.get(self, "rate_plan")

    @_builtins.property
    @pulumi.getter
    def state(self) -> pulumi.Output[_builtins.str]:
        """
        The state that the subscription is in.
        Available values: "Trial", "Provisioned", "Paid", "AwaitingPayment", "Cancelled", "Failed", "Expired".
        """
        return pulumi.get(self, "state")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[_builtins.str]:
        """
        Subscription identifier tag.
        """
        return pulumi.get(self, "zone_id")

