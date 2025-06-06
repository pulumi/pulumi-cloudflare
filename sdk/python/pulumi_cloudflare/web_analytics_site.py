# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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

__all__ = ['WebAnalyticsSiteArgs', 'WebAnalyticsSite']

@pulumi.input_type
class WebAnalyticsSiteArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[builtins.str],
                 auto_install: Optional[pulumi.Input[builtins.bool]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 host: Optional[pulumi.Input[builtins.str]] = None,
                 lite: Optional[pulumi.Input[builtins.bool]] = None,
                 zone_tag: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a WebAnalyticsSite resource.
        :param pulumi.Input[builtins.str] account_id: Identifier.
        :param pulumi.Input[builtins.bool] auto_install: If enabled, the JavaScript snippet is automatically injected for orange-clouded sites.
        :param pulumi.Input[builtins.bool] enabled: Enables or disables RUM. This option can be used only when auto_install is set to true.
        :param pulumi.Input[builtins.str] host: The hostname to use for gray-clouded sites.
        :param pulumi.Input[builtins.bool] lite: If enabled, the JavaScript snippet will not be injected for visitors from the EU.
        :param pulumi.Input[builtins.str] zone_tag: The zone identifier.
        """
        pulumi.set(__self__, "account_id", account_id)
        if auto_install is not None:
            pulumi.set(__self__, "auto_install", auto_install)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if host is not None:
            pulumi.set(__self__, "host", host)
        if lite is not None:
            pulumi.set(__self__, "lite", lite)
        if zone_tag is not None:
            pulumi.set(__self__, "zone_tag", zone_tag)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[builtins.str]:
        """
        Identifier.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="autoInstall")
    def auto_install(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        If enabled, the JavaScript snippet is automatically injected for orange-clouded sites.
        """
        return pulumi.get(self, "auto_install")

    @auto_install.setter
    def auto_install(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "auto_install", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Enables or disables RUM. This option can be used only when auto_install is set to true.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def host(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The hostname to use for gray-clouded sites.
        """
        return pulumi.get(self, "host")

    @host.setter
    def host(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "host", value)

    @property
    @pulumi.getter
    def lite(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        If enabled, the JavaScript snippet will not be injected for visitors from the EU.
        """
        return pulumi.get(self, "lite")

    @lite.setter
    def lite(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "lite", value)

    @property
    @pulumi.getter(name="zoneTag")
    def zone_tag(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The zone identifier.
        """
        return pulumi.get(self, "zone_tag")

    @zone_tag.setter
    def zone_tag(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "zone_tag", value)


@pulumi.input_type
class _WebAnalyticsSiteState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[builtins.str]] = None,
                 auto_install: Optional[pulumi.Input[builtins.bool]] = None,
                 created: Optional[pulumi.Input[builtins.str]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 host: Optional[pulumi.Input[builtins.str]] = None,
                 lite: Optional[pulumi.Input[builtins.bool]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['WebAnalyticsSiteRuleArgs']]]] = None,
                 ruleset: Optional[pulumi.Input['WebAnalyticsSiteRulesetArgs']] = None,
                 site_tag: Optional[pulumi.Input[builtins.str]] = None,
                 site_token: Optional[pulumi.Input[builtins.str]] = None,
                 snippet: Optional[pulumi.Input[builtins.str]] = None,
                 zone_tag: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering WebAnalyticsSite resources.
        :param pulumi.Input[builtins.str] account_id: Identifier.
        :param pulumi.Input[builtins.bool] auto_install: If enabled, the JavaScript snippet is automatically injected for orange-clouded sites.
        :param pulumi.Input[builtins.bool] enabled: Enables or disables RUM. This option can be used only when auto_install is set to true.
        :param pulumi.Input[builtins.str] host: The hostname to use for gray-clouded sites.
        :param pulumi.Input[builtins.bool] lite: If enabled, the JavaScript snippet will not be injected for visitors from the EU.
        :param pulumi.Input[Sequence[pulumi.Input['WebAnalyticsSiteRuleArgs']]] rules: A list of rules.
        :param pulumi.Input[builtins.str] site_tag: The Web Analytics site identifier.
        :param pulumi.Input[builtins.str] site_token: The Web Analytics site token.
        :param pulumi.Input[builtins.str] snippet: Encoded JavaScript snippet.
        :param pulumi.Input[builtins.str] zone_tag: The zone identifier.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if auto_install is not None:
            pulumi.set(__self__, "auto_install", auto_install)
        if created is not None:
            pulumi.set(__self__, "created", created)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if host is not None:
            pulumi.set(__self__, "host", host)
        if lite is not None:
            pulumi.set(__self__, "lite", lite)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)
        if ruleset is not None:
            pulumi.set(__self__, "ruleset", ruleset)
        if site_tag is not None:
            pulumi.set(__self__, "site_tag", site_tag)
        if site_token is not None:
            pulumi.set(__self__, "site_token", site_token)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)
        if zone_tag is not None:
            pulumi.set(__self__, "zone_tag", zone_tag)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Identifier.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="autoInstall")
    def auto_install(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        If enabled, the JavaScript snippet is automatically injected for orange-clouded sites.
        """
        return pulumi.get(self, "auto_install")

    @auto_install.setter
    def auto_install(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "auto_install", value)

    @property
    @pulumi.getter
    def created(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "created")

    @created.setter
    def created(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "created", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Enables or disables RUM. This option can be used only when auto_install is set to true.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def host(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The hostname to use for gray-clouded sites.
        """
        return pulumi.get(self, "host")

    @host.setter
    def host(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "host", value)

    @property
    @pulumi.getter
    def lite(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        If enabled, the JavaScript snippet will not be injected for visitors from the EU.
        """
        return pulumi.get(self, "lite")

    @lite.setter
    def lite(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "lite", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WebAnalyticsSiteRuleArgs']]]]:
        """
        A list of rules.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WebAnalyticsSiteRuleArgs']]]]):
        pulumi.set(self, "rules", value)

    @property
    @pulumi.getter
    def ruleset(self) -> Optional[pulumi.Input['WebAnalyticsSiteRulesetArgs']]:
        return pulumi.get(self, "ruleset")

    @ruleset.setter
    def ruleset(self, value: Optional[pulumi.Input['WebAnalyticsSiteRulesetArgs']]):
        pulumi.set(self, "ruleset", value)

    @property
    @pulumi.getter(name="siteTag")
    def site_tag(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The Web Analytics site identifier.
        """
        return pulumi.get(self, "site_tag")

    @site_tag.setter
    def site_tag(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "site_tag", value)

    @property
    @pulumi.getter(name="siteToken")
    def site_token(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The Web Analytics site token.
        """
        return pulumi.get(self, "site_token")

    @site_token.setter
    def site_token(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "site_token", value)

    @property
    @pulumi.getter
    def snippet(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Encoded JavaScript snippet.
        """
        return pulumi.get(self, "snippet")

    @snippet.setter
    def snippet(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "snippet", value)

    @property
    @pulumi.getter(name="zoneTag")
    def zone_tag(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The zone identifier.
        """
        return pulumi.get(self, "zone_tag")

    @zone_tag.setter
    def zone_tag(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "zone_tag", value)


@pulumi.type_token("cloudflare:index/webAnalyticsSite:WebAnalyticsSite")
class WebAnalyticsSite(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[builtins.str]] = None,
                 auto_install: Optional[pulumi.Input[builtins.bool]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 host: Optional[pulumi.Input[builtins.str]] = None,
                 lite: Optional[pulumi.Input[builtins.bool]] = None,
                 zone_tag: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_web_analytics_site = cloudflare.WebAnalyticsSite("example_web_analytics_site",
            account_id="023e105f4ecef8ad9ca31a8372d0c353",
            auto_install=True,
            host="example.com",
            zone_tag="023e105f4ecef8ad9ca31a8372d0c353")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/webAnalyticsSite:WebAnalyticsSite example '<account_id>/<site_id>'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] account_id: Identifier.
        :param pulumi.Input[builtins.bool] auto_install: If enabled, the JavaScript snippet is automatically injected for orange-clouded sites.
        :param pulumi.Input[builtins.bool] enabled: Enables or disables RUM. This option can be used only when auto_install is set to true.
        :param pulumi.Input[builtins.str] host: The hostname to use for gray-clouded sites.
        :param pulumi.Input[builtins.bool] lite: If enabled, the JavaScript snippet will not be injected for visitors from the EU.
        :param pulumi.Input[builtins.str] zone_tag: The zone identifier.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WebAnalyticsSiteArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_web_analytics_site = cloudflare.WebAnalyticsSite("example_web_analytics_site",
            account_id="023e105f4ecef8ad9ca31a8372d0c353",
            auto_install=True,
            host="example.com",
            zone_tag="023e105f4ecef8ad9ca31a8372d0c353")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/webAnalyticsSite:WebAnalyticsSite example '<account_id>/<site_id>'
        ```

        :param str resource_name: The name of the resource.
        :param WebAnalyticsSiteArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WebAnalyticsSiteArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[builtins.str]] = None,
                 auto_install: Optional[pulumi.Input[builtins.bool]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 host: Optional[pulumi.Input[builtins.str]] = None,
                 lite: Optional[pulumi.Input[builtins.bool]] = None,
                 zone_tag: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WebAnalyticsSiteArgs.__new__(WebAnalyticsSiteArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["auto_install"] = auto_install
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["host"] = host
            __props__.__dict__["lite"] = lite
            __props__.__dict__["zone_tag"] = zone_tag
            __props__.__dict__["created"] = None
            __props__.__dict__["rules"] = None
            __props__.__dict__["ruleset"] = None
            __props__.__dict__["site_tag"] = None
            __props__.__dict__["site_token"] = None
            __props__.__dict__["snippet"] = None
        super(WebAnalyticsSite, __self__).__init__(
            'cloudflare:index/webAnalyticsSite:WebAnalyticsSite',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[builtins.str]] = None,
            auto_install: Optional[pulumi.Input[builtins.bool]] = None,
            created: Optional[pulumi.Input[builtins.str]] = None,
            enabled: Optional[pulumi.Input[builtins.bool]] = None,
            host: Optional[pulumi.Input[builtins.str]] = None,
            lite: Optional[pulumi.Input[builtins.bool]] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['WebAnalyticsSiteRuleArgs', 'WebAnalyticsSiteRuleArgsDict']]]]] = None,
            ruleset: Optional[pulumi.Input[Union['WebAnalyticsSiteRulesetArgs', 'WebAnalyticsSiteRulesetArgsDict']]] = None,
            site_tag: Optional[pulumi.Input[builtins.str]] = None,
            site_token: Optional[pulumi.Input[builtins.str]] = None,
            snippet: Optional[pulumi.Input[builtins.str]] = None,
            zone_tag: Optional[pulumi.Input[builtins.str]] = None) -> 'WebAnalyticsSite':
        """
        Get an existing WebAnalyticsSite resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] account_id: Identifier.
        :param pulumi.Input[builtins.bool] auto_install: If enabled, the JavaScript snippet is automatically injected for orange-clouded sites.
        :param pulumi.Input[builtins.bool] enabled: Enables or disables RUM. This option can be used only when auto_install is set to true.
        :param pulumi.Input[builtins.str] host: The hostname to use for gray-clouded sites.
        :param pulumi.Input[builtins.bool] lite: If enabled, the JavaScript snippet will not be injected for visitors from the EU.
        :param pulumi.Input[Sequence[pulumi.Input[Union['WebAnalyticsSiteRuleArgs', 'WebAnalyticsSiteRuleArgsDict']]]] rules: A list of rules.
        :param pulumi.Input[builtins.str] site_tag: The Web Analytics site identifier.
        :param pulumi.Input[builtins.str] site_token: The Web Analytics site token.
        :param pulumi.Input[builtins.str] snippet: Encoded JavaScript snippet.
        :param pulumi.Input[builtins.str] zone_tag: The zone identifier.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WebAnalyticsSiteState.__new__(_WebAnalyticsSiteState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["auto_install"] = auto_install
        __props__.__dict__["created"] = created
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["host"] = host
        __props__.__dict__["lite"] = lite
        __props__.__dict__["rules"] = rules
        __props__.__dict__["ruleset"] = ruleset
        __props__.__dict__["site_tag"] = site_tag
        __props__.__dict__["site_token"] = site_token
        __props__.__dict__["snippet"] = snippet
        __props__.__dict__["zone_tag"] = zone_tag
        return WebAnalyticsSite(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[builtins.str]:
        """
        Identifier.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="autoInstall")
    def auto_install(self) -> pulumi.Output[Optional[builtins.bool]]:
        """
        If enabled, the JavaScript snippet is automatically injected for orange-clouded sites.
        """
        return pulumi.get(self, "auto_install")

    @property
    @pulumi.getter
    def created(self) -> pulumi.Output[builtins.str]:
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[builtins.bool]]:
        """
        Enables or disables RUM. This option can be used only when auto_install is set to true.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def host(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The hostname to use for gray-clouded sites.
        """
        return pulumi.get(self, "host")

    @property
    @pulumi.getter
    def lite(self) -> pulumi.Output[Optional[builtins.bool]]:
        """
        If enabled, the JavaScript snippet will not be injected for visitors from the EU.
        """
        return pulumi.get(self, "lite")

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Sequence['outputs.WebAnalyticsSiteRule']]:
        """
        A list of rules.
        """
        return pulumi.get(self, "rules")

    @property
    @pulumi.getter
    def ruleset(self) -> pulumi.Output['outputs.WebAnalyticsSiteRuleset']:
        return pulumi.get(self, "ruleset")

    @property
    @pulumi.getter(name="siteTag")
    def site_tag(self) -> pulumi.Output[builtins.str]:
        """
        The Web Analytics site identifier.
        """
        return pulumi.get(self, "site_tag")

    @property
    @pulumi.getter(name="siteToken")
    def site_token(self) -> pulumi.Output[builtins.str]:
        """
        The Web Analytics site token.
        """
        return pulumi.get(self, "site_token")

    @property
    @pulumi.getter
    def snippet(self) -> pulumi.Output[builtins.str]:
        """
        Encoded JavaScript snippet.
        """
        return pulumi.get(self, "snippet")

    @property
    @pulumi.getter(name="zoneTag")
    def zone_tag(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The zone identifier.
        """
        return pulumi.get(self, "zone_tag")

