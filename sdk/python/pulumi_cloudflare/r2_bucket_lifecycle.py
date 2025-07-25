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

__all__ = ['R2BucketLifecycleArgs', 'R2BucketLifecycle']

@pulumi.input_type
class R2BucketLifecycleArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[_builtins.str],
                 bucket_name: pulumi.Input[_builtins.str],
                 jurisdiction: Optional[pulumi.Input[_builtins.str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['R2BucketLifecycleRuleArgs']]]] = None):
        """
        The set of arguments for constructing a R2BucketLifecycle resource.
        :param pulumi.Input[_builtins.str] account_id: Account ID.
        :param pulumi.Input[_builtins.str] bucket_name: Name of the bucket.
        :param pulumi.Input[_builtins.str] jurisdiction: Jurisdiction of the bucket
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "bucket_name", bucket_name)
        if jurisdiction is not None:
            pulumi.set(__self__, "jurisdiction", jurisdiction)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[_builtins.str]:
        """
        Account ID.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> pulumi.Input[_builtins.str]:
        """
        Name of the bucket.
        """
        return pulumi.get(self, "bucket_name")

    @bucket_name.setter
    def bucket_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "bucket_name", value)

    @_builtins.property
    @pulumi.getter
    def jurisdiction(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Jurisdiction of the bucket
        """
        return pulumi.get(self, "jurisdiction")

    @jurisdiction.setter
    def jurisdiction(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "jurisdiction", value)

    @_builtins.property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['R2BucketLifecycleRuleArgs']]]]:
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['R2BucketLifecycleRuleArgs']]]]):
        pulumi.set(self, "rules", value)


@pulumi.input_type
class _R2BucketLifecycleState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 bucket_name: Optional[pulumi.Input[_builtins.str]] = None,
                 jurisdiction: Optional[pulumi.Input[_builtins.str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['R2BucketLifecycleRuleArgs']]]] = None):
        """
        Input properties used for looking up and filtering R2BucketLifecycle resources.
        :param pulumi.Input[_builtins.str] account_id: Account ID.
        :param pulumi.Input[_builtins.str] bucket_name: Name of the bucket.
        :param pulumi.Input[_builtins.str] jurisdiction: Jurisdiction of the bucket
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if bucket_name is not None:
            pulumi.set(__self__, "bucket_name", bucket_name)
        if jurisdiction is not None:
            pulumi.set(__self__, "jurisdiction", jurisdiction)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Account ID.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the bucket.
        """
        return pulumi.get(self, "bucket_name")

    @bucket_name.setter
    def bucket_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "bucket_name", value)

    @_builtins.property
    @pulumi.getter
    def jurisdiction(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Jurisdiction of the bucket
        """
        return pulumi.get(self, "jurisdiction")

    @jurisdiction.setter
    def jurisdiction(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "jurisdiction", value)

    @_builtins.property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['R2BucketLifecycleRuleArgs']]]]:
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['R2BucketLifecycleRuleArgs']]]]):
        pulumi.set(self, "rules", value)


@pulumi.type_token("cloudflare:index/r2BucketLifecycle:R2BucketLifecycle")
class R2BucketLifecycle(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 bucket_name: Optional[pulumi.Input[_builtins.str]] = None,
                 jurisdiction: Optional[pulumi.Input[_builtins.str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['R2BucketLifecycleRuleArgs', 'R2BucketLifecycleRuleArgsDict']]]]] = None,
                 __props__=None):
        """
        ## Example Usage

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: Account ID.
        :param pulumi.Input[_builtins.str] bucket_name: Name of the bucket.
        :param pulumi.Input[_builtins.str] jurisdiction: Jurisdiction of the bucket
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: R2BucketLifecycleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        :param str resource_name: The name of the resource.
        :param R2BucketLifecycleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(R2BucketLifecycleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 bucket_name: Optional[pulumi.Input[_builtins.str]] = None,
                 jurisdiction: Optional[pulumi.Input[_builtins.str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['R2BucketLifecycleRuleArgs', 'R2BucketLifecycleRuleArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = R2BucketLifecycleArgs.__new__(R2BucketLifecycleArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if bucket_name is None and not opts.urn:
                raise TypeError("Missing required property 'bucket_name'")
            __props__.__dict__["bucket_name"] = bucket_name
            __props__.__dict__["jurisdiction"] = jurisdiction
            __props__.__dict__["rules"] = rules
        super(R2BucketLifecycle, __self__).__init__(
            'cloudflare:index/r2BucketLifecycle:R2BucketLifecycle',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[_builtins.str]] = None,
            bucket_name: Optional[pulumi.Input[_builtins.str]] = None,
            jurisdiction: Optional[pulumi.Input[_builtins.str]] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['R2BucketLifecycleRuleArgs', 'R2BucketLifecycleRuleArgsDict']]]]] = None) -> 'R2BucketLifecycle':
        """
        Get an existing R2BucketLifecycle resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: Account ID.
        :param pulumi.Input[_builtins.str] bucket_name: Name of the bucket.
        :param pulumi.Input[_builtins.str] jurisdiction: Jurisdiction of the bucket
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _R2BucketLifecycleState.__new__(_R2BucketLifecycleState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["bucket_name"] = bucket_name
        __props__.__dict__["jurisdiction"] = jurisdiction
        __props__.__dict__["rules"] = rules
        return R2BucketLifecycle(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[_builtins.str]:
        """
        Account ID.
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> pulumi.Output[_builtins.str]:
        """
        Name of the bucket.
        """
        return pulumi.get(self, "bucket_name")

    @_builtins.property
    @pulumi.getter
    def jurisdiction(self) -> pulumi.Output[_builtins.str]:
        """
        Jurisdiction of the bucket
        """
        return pulumi.get(self, "jurisdiction")

    @_builtins.property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Optional[Sequence['outputs.R2BucketLifecycleRule']]]:
        return pulumi.get(self, "rules")

