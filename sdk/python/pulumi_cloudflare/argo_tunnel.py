# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['ArgoTunnel']


class ArgoTunnel(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Argo Tunnel exposes applications running on your local web server on any network with an internet connection without manually adding DNS records or configuring a firewall or router.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.ArgoTunnel("example",
            account_id="d41d8cd98f00b204e9800998ecf8427e",
            name="my-tunnel",
            secret="AQIDBAUGBwgBAgMEBQYHCAECAwQFBgcIAQIDBAUGBwg=")
        ```

        ## Import

        Argo Tunnels can be imported a composite ID of the account ID and tunnel UUID.

        ```sh
         $ pulumi import cloudflare:index/argoTunnel:ArgoTunnel example d41d8cd98f00b204e9800998ecf8427e/fd2455cb-5fcc-4c13-8738-8d8d2605237f
        ```

         where - `d41d8cd98f00b204e9800998ecf8427e` is the account ID - `fd2455cb-5fcc-4c13-8738-8d8d2605237f` is the Argo Tunnel UUID

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The Cloudflare account ID that you wish to manage the Argo Tunnel on.
        :param pulumi.Input[str] name: A user-friendly name chosen when the tunnel is created. Cannot be empty.
        :param pulumi.Input[str] secret: 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password.
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
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__['name'] = name
            if secret is None and not opts.urn:
                raise TypeError("Missing required property 'secret'")
            __props__['secret'] = secret
        super(ArgoTunnel, __self__).__init__(
            'cloudflare:index/argoTunnel:ArgoTunnel',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            secret: Optional[pulumi.Input[str]] = None) -> 'ArgoTunnel':
        """
        Get an existing ArgoTunnel resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The Cloudflare account ID that you wish to manage the Argo Tunnel on.
        :param pulumi.Input[str] name: A user-friendly name chosen when the tunnel is created. Cannot be empty.
        :param pulumi.Input[str] secret: 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["account_id"] = account_id
        __props__["name"] = name
        __props__["secret"] = secret
        return ArgoTunnel(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The Cloudflare account ID that you wish to manage the Argo Tunnel on.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A user-friendly name chosen when the tunnel is created. Cannot be empty.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def secret(self) -> pulumi.Output[str]:
        """
        32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password.
        """
        return pulumi.get(self, "secret")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

