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

__all__ = ['FallbackDomainArgs', 'FallbackDomain']

@pulumi.input_type
class FallbackDomainArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 domains: pulumi.Input[Sequence[pulumi.Input['FallbackDomainDomainArgs']]],
                 policy_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a FallbackDomain resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] policy_id: The settings policy for which to configure this fallback domain policy.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "domains", domains)
        if policy_id is not None:
            pulumi.set(__self__, "policy_id", policy_id)

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
    def domains(self) -> pulumi.Input[Sequence[pulumi.Input['FallbackDomainDomainArgs']]]:
        return pulumi.get(self, "domains")

    @domains.setter
    def domains(self, value: pulumi.Input[Sequence[pulumi.Input['FallbackDomainDomainArgs']]]):
        pulumi.set(self, "domains", value)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The settings policy for which to configure this fallback domain policy.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy_id", value)


@pulumi.input_type
class _FallbackDomainState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 domains: Optional[pulumi.Input[Sequence[pulumi.Input['FallbackDomainDomainArgs']]]] = None,
                 policy_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering FallbackDomain resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] policy_id: The settings policy for which to configure this fallback domain policy.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if domains is not None:
            pulumi.set(__self__, "domains", domains)
        if policy_id is not None:
            pulumi.set(__self__, "policy_id", policy_id)

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
    def domains(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FallbackDomainDomainArgs']]]]:
        return pulumi.get(self, "domains")

    @domains.setter
    def domains(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FallbackDomainDomainArgs']]]]):
        pulumi.set(self, "domains", value)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The settings policy for which to configure this fallback domain policy.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy_id", value)


class FallbackDomain(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 domains: Optional[pulumi.Input[Sequence[pulumi.Input[Union['FallbackDomainDomainArgs', 'FallbackDomainDomainArgsDict']]]]] = None,
                 policy_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare Fallback Domain resource. Fallback domains are
        used to ignore DNS requests to a given list of domains. These DNS
        requests will be passed back to other DNS servers configured on
        existing network interfaces on the device.

        ## Import

        Fallback Domains for default device policies must use "default" as the policy ID.

        ```sh
        $ pulumi import cloudflare:index/fallbackDomain:FallbackDomain example <account_id>/<policy_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] policy_id: The settings policy for which to configure this fallback domain policy.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FallbackDomainArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare Fallback Domain resource. Fallback domains are
        used to ignore DNS requests to a given list of domains. These DNS
        requests will be passed back to other DNS servers configured on
        existing network interfaces on the device.

        ## Import

        Fallback Domains for default device policies must use "default" as the policy ID.

        ```sh
        $ pulumi import cloudflare:index/fallbackDomain:FallbackDomain example <account_id>/<policy_id>
        ```

        :param str resource_name: The name of the resource.
        :param FallbackDomainArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FallbackDomainArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 domains: Optional[pulumi.Input[Sequence[pulumi.Input[Union['FallbackDomainDomainArgs', 'FallbackDomainDomainArgsDict']]]]] = None,
                 policy_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FallbackDomainArgs.__new__(FallbackDomainArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if domains is None and not opts.urn:
                raise TypeError("Missing required property 'domains'")
            __props__.__dict__["domains"] = domains
            __props__.__dict__["policy_id"] = policy_id
        super(FallbackDomain, __self__).__init__(
            'cloudflare:index/fallbackDomain:FallbackDomain',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            domains: Optional[pulumi.Input[Sequence[pulumi.Input[Union['FallbackDomainDomainArgs', 'FallbackDomainDomainArgsDict']]]]] = None,
            policy_id: Optional[pulumi.Input[str]] = None) -> 'FallbackDomain':
        """
        Get an existing FallbackDomain resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] policy_id: The settings policy for which to configure this fallback domain policy.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FallbackDomainState.__new__(_FallbackDomainState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["domains"] = domains
        __props__.__dict__["policy_id"] = policy_id
        return FallbackDomain(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def domains(self) -> pulumi.Output[Sequence['outputs.FallbackDomainDomain']]:
        return pulumi.get(self, "domains")

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Output[Optional[str]]:
        """
        The settings policy for which to configure this fallback domain policy.
        """
        return pulumi.get(self, "policy_id")

