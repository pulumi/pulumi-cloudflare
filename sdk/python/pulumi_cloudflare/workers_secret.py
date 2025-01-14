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

__all__ = ['WorkersSecretArgs', 'WorkersSecret']

@pulumi.input_type
class WorkersSecretArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 name: pulumi.Input[str],
                 script_name: pulumi.Input[str],
                 secret_text: pulumi.Input[str]):
        """
        The set of arguments for constructing a WorkersSecret resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] name: The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] script_name: The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] secret_text: The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "script_name", script_name)
        pulumi.set(__self__, "secret_text", secret_text)

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
        The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="scriptName")
    def script_name(self) -> pulumi.Input[str]:
        """
        The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "script_name")

    @script_name.setter
    def script_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "script_name", value)

    @property
    @pulumi.getter(name="secretText")
    def secret_text(self) -> pulumi.Input[str]:
        """
        The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "secret_text")

    @secret_text.setter
    def secret_text(self, value: pulumi.Input[str]):
        pulumi.set(self, "secret_text", value)


@pulumi.input_type
class _WorkersSecretState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 script_name: Optional[pulumi.Input[str]] = None,
                 secret_text: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WorkersSecret resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] name: The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] script_name: The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] secret_text: The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if script_name is not None:
            pulumi.set(__self__, "script_name", script_name)
        if secret_text is not None:
            pulumi.set(__self__, "secret_text", secret_text)

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
        The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="scriptName")
    def script_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "script_name")

    @script_name.setter
    def script_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "script_name", value)

    @property
    @pulumi.getter(name="secretText")
    def secret_text(self) -> Optional[pulumi.Input[str]]:
        """
        The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "secret_text")

    @secret_text.setter
    def secret_text(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_text", value)


class WorkersSecret(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 script_name: Optional[pulumi.Input[str]] = None,
                 secret_text: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare Worker secret resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        my_secret = cloudflare.WorkersSecret("my_secret",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="MY_EXAMPLE_SECRET_TEXT",
            script_name="script_1",
            secret_text="my_secret_value")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/workersSecret:WorkersSecret example <account_id>/<script_name>/<secret_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] name: The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] script_name: The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] secret_text: The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WorkersSecretArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare Worker secret resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        my_secret = cloudflare.WorkersSecret("my_secret",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="MY_EXAMPLE_SECRET_TEXT",
            script_name="script_1",
            secret_text="my_secret_value")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/workersSecret:WorkersSecret example <account_id>/<script_name>/<secret_name>
        ```

        :param str resource_name: The name of the resource.
        :param WorkersSecretArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WorkersSecretArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 script_name: Optional[pulumi.Input[str]] = None,
                 secret_text: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WorkersSecretArgs.__new__(WorkersSecretArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            if script_name is None and not opts.urn:
                raise TypeError("Missing required property 'script_name'")
            __props__.__dict__["script_name"] = script_name
            if secret_text is None and not opts.urn:
                raise TypeError("Missing required property 'secret_text'")
            __props__.__dict__["secret_text"] = None if secret_text is None else pulumi.Output.secret(secret_text)
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["secretText"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(WorkersSecret, __self__).__init__(
            'cloudflare:index/workersSecret:WorkersSecret',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            script_name: Optional[pulumi.Input[str]] = None,
            secret_text: Optional[pulumi.Input[str]] = None) -> 'WorkersSecret':
        """
        Get an existing WorkersSecret resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] name: The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] script_name: The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] secret_text: The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WorkersSecretState.__new__(_WorkersSecretState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["name"] = name
        __props__.__dict__["script_name"] = script_name
        __props__.__dict__["secret_text"] = secret_text
        return WorkersSecret(resource_name, opts=opts, __props__=__props__)

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
        The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="scriptName")
    def script_name(self) -> pulumi.Output[str]:
        """
        The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "script_name")

    @property
    @pulumi.getter(name="secretText")
    def secret_text(self) -> pulumi.Output[str]:
        """
        The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "secret_text")

