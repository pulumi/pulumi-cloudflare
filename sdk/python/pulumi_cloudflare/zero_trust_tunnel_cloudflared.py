# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ZeroTrustTunnelCloudflaredArgs', 'ZeroTrustTunnelCloudflared']

@pulumi.input_type
class ZeroTrustTunnelCloudflaredArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 name: pulumi.Input[str],
                 secret: pulumi.Input[str],
                 config_src: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ZeroTrustTunnelCloudflared resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] name: A user-friendly name chosen when the tunnel is created. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] secret: 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] config_src: Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard or using tunnel*config, tunnel*route or tunnel*virtual*network resources. Available values: `local`, `cloudflare`. **Modifying this attribute will force creation of a new resource.**
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "secret", secret)
        if config_src is not None:
            pulumi.set(__self__, "config_src", config_src)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        A user-friendly name chosen when the tunnel is created. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def secret(self) -> pulumi.Input[str]:
        """
        32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "secret")

    @secret.setter
    def secret(self, value: pulumi.Input[str]):
        pulumi.set(self, "secret", value)

    @property
    @pulumi.getter(name="configSrc")
    def config_src(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard or using tunnel*config, tunnel*route or tunnel*virtual*network resources. Available values: `local`, `cloudflare`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "config_src")

    @config_src.setter
    def config_src(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config_src", value)


@pulumi.input_type
class _ZeroTrustTunnelCloudflaredState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 cname: Optional[pulumi.Input[str]] = None,
                 config_src: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 tunnel_token: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ZeroTrustTunnelCloudflared resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] cname: Usable CNAME for accessing the Tunnel.
        :param pulumi.Input[str] config_src: Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard or using tunnel*config, tunnel*route or tunnel*virtual*network resources. Available values: `local`, `cloudflare`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] name: A user-friendly name chosen when the tunnel is created. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] secret: 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] tunnel_token: Token used by a connector to authenticate and run the tunnel.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if cname is not None:
            pulumi.set(__self__, "cname", cname)
        if config_src is not None:
            pulumi.set(__self__, "config_src", config_src)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if secret is not None:
            pulumi.set(__self__, "secret", secret)
        if tunnel_token is not None:
            pulumi.set(__self__, "tunnel_token", tunnel_token)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def cname(self) -> Optional[pulumi.Input[str]]:
        """
        Usable CNAME for accessing the Tunnel.
        """
        return pulumi.get(self, "cname")

    @cname.setter
    def cname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cname", value)

    @property
    @pulumi.getter(name="configSrc")
    def config_src(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard or using tunnel*config, tunnel*route or tunnel*virtual*network resources. Available values: `local`, `cloudflare`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "config_src")

    @config_src.setter
    def config_src(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config_src", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A user-friendly name chosen when the tunnel is created. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def secret(self) -> Optional[pulumi.Input[str]]:
        """
        32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "secret")

    @secret.setter
    def secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret", value)

    @property
    @pulumi.getter(name="tunnelToken")
    def tunnel_token(self) -> Optional[pulumi.Input[str]]:
        """
        Token used by a connector to authenticate and run the tunnel.
        """
        return pulumi.get(self, "tunnel_token")

    @tunnel_token.setter
    def tunnel_token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tunnel_token", value)


class ZeroTrustTunnelCloudflared(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 config_src: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Tunnel exposes applications running on your local web server on any
        network with an internet connection without manually adding DNS
        records or configuring a firewall or router.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.ZeroTrustTunnelCloudflared("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="my-tunnel",
            secret="AQIDBAUGBwgBAgMEBQYHCAECAwQFBgcIAQIDBAUGBwg=")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/zeroTrustTunnelCloudflared:ZeroTrustTunnelCloudflared example <account_id>/<tunnel_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] config_src: Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard or using tunnel*config, tunnel*route or tunnel*virtual*network resources. Available values: `local`, `cloudflare`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] name: A user-friendly name chosen when the tunnel is created. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] secret: 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ZeroTrustTunnelCloudflaredArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Tunnel exposes applications running on your local web server on any
        network with an internet connection without manually adding DNS
        records or configuring a firewall or router.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.ZeroTrustTunnelCloudflared("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="my-tunnel",
            secret="AQIDBAUGBwgBAgMEBQYHCAECAwQFBgcIAQIDBAUGBwg=")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/zeroTrustTunnelCloudflared:ZeroTrustTunnelCloudflared example <account_id>/<tunnel_id>
        ```

        :param str resource_name: The name of the resource.
        :param ZeroTrustTunnelCloudflaredArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ZeroTrustTunnelCloudflaredArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 config_src: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ZeroTrustTunnelCloudflaredArgs.__new__(ZeroTrustTunnelCloudflaredArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["config_src"] = config_src
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            if secret is None and not opts.urn:
                raise TypeError("Missing required property 'secret'")
            __props__.__dict__["secret"] = None if secret is None else pulumi.Output.secret(secret)
            __props__.__dict__["cname"] = None
            __props__.__dict__["tunnel_token"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["secret", "tunnelToken"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(ZeroTrustTunnelCloudflared, __self__).__init__(
            'cloudflare:index/zeroTrustTunnelCloudflared:ZeroTrustTunnelCloudflared',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            cname: Optional[pulumi.Input[str]] = None,
            config_src: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            secret: Optional[pulumi.Input[str]] = None,
            tunnel_token: Optional[pulumi.Input[str]] = None) -> 'ZeroTrustTunnelCloudflared':
        """
        Get an existing ZeroTrustTunnelCloudflared resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] cname: Usable CNAME for accessing the Tunnel.
        :param pulumi.Input[str] config_src: Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard or using tunnel*config, tunnel*route or tunnel*virtual*network resources. Available values: `local`, `cloudflare`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] name: A user-friendly name chosen when the tunnel is created. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] secret: 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] tunnel_token: Token used by a connector to authenticate and run the tunnel.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ZeroTrustTunnelCloudflaredState.__new__(_ZeroTrustTunnelCloudflaredState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["cname"] = cname
        __props__.__dict__["config_src"] = config_src
        __props__.__dict__["name"] = name
        __props__.__dict__["secret"] = secret
        __props__.__dict__["tunnel_token"] = tunnel_token
        return ZeroTrustTunnelCloudflared(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def cname(self) -> pulumi.Output[str]:
        """
        Usable CNAME for accessing the Tunnel.
        """
        return pulumi.get(self, "cname")

    @property
    @pulumi.getter(name="configSrc")
    def config_src(self) -> pulumi.Output[Optional[str]]:
        """
        Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard or using tunnel*config, tunnel*route or tunnel*virtual*network resources. Available values: `local`, `cloudflare`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "config_src")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A user-friendly name chosen when the tunnel is created. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def secret(self) -> pulumi.Output[str]:
        """
        32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "secret")

    @property
    @pulumi.getter(name="tunnelToken")
    def tunnel_token(self) -> pulumi.Output[str]:
        """
        Token used by a connector to authenticate and run the tunnel.
        """
        return pulumi.get(self, "tunnel_token")
