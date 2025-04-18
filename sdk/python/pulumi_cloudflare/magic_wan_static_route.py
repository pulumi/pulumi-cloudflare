# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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

__all__ = ['MagicWanStaticRouteArgs', 'MagicWanStaticRoute']

@pulumi.input_type
class MagicWanStaticRouteArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[builtins.str],
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 nexthop: Optional[pulumi.Input[builtins.str]] = None,
                 prefix: Optional[pulumi.Input[builtins.str]] = None,
                 priority: Optional[pulumi.Input[builtins.int]] = None,
                 route: Optional[pulumi.Input['MagicWanStaticRouteRouteArgs']] = None,
                 route_id: Optional[pulumi.Input[builtins.str]] = None,
                 routes: Optional[pulumi.Input[Sequence[pulumi.Input['MagicWanStaticRouteRouteArgs']]]] = None,
                 scope: Optional[pulumi.Input['MagicWanStaticRouteScopeArgs']] = None,
                 weight: Optional[pulumi.Input[builtins.int]] = None):
        """
        The set of arguments for constructing a MagicWanStaticRoute resource.
        :param pulumi.Input[builtins.str] account_id: Identifier
        :param pulumi.Input[builtins.str] description: An optional human provided description of the static route.
        :param pulumi.Input[builtins.str] nexthop: The next-hop IP Address for the static route.
        :param pulumi.Input[builtins.str] prefix: IP Prefix in Classless Inter-Domain Routing format.
        :param pulumi.Input[builtins.int] priority: Priority of the static route.
        :param pulumi.Input[builtins.str] route_id: Identifier
        :param pulumi.Input['MagicWanStaticRouteScopeArgs'] scope: Used only for ECMP routes.
        :param pulumi.Input[builtins.int] weight: Optional weight of the ECMP scope - if provided.
        """
        pulumi.set(__self__, "account_id", account_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if nexthop is not None:
            pulumi.set(__self__, "nexthop", nexthop)
        if prefix is not None:
            pulumi.set(__self__, "prefix", prefix)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if route is not None:
            pulumi.set(__self__, "route", route)
        if route_id is not None:
            pulumi.set(__self__, "route_id", route_id)
        if routes is not None:
            pulumi.set(__self__, "routes", routes)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[builtins.str]:
        """
        Identifier
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        An optional human provided description of the static route.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def nexthop(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The next-hop IP Address for the static route.
        """
        return pulumi.get(self, "nexthop")

    @nexthop.setter
    def nexthop(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "nexthop", value)

    @property
    @pulumi.getter
    def prefix(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        IP Prefix in Classless Inter-Domain Routing format.
        """
        return pulumi.get(self, "prefix")

    @prefix.setter
    def prefix(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "prefix", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Priority of the static route.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter
    def route(self) -> Optional[pulumi.Input['MagicWanStaticRouteRouteArgs']]:
        return pulumi.get(self, "route")

    @route.setter
    def route(self, value: Optional[pulumi.Input['MagicWanStaticRouteRouteArgs']]):
        pulumi.set(self, "route", value)

    @property
    @pulumi.getter(name="routeId")
    def route_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Identifier
        """
        return pulumi.get(self, "route_id")

    @route_id.setter
    def route_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "route_id", value)

    @property
    @pulumi.getter
    def routes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MagicWanStaticRouteRouteArgs']]]]:
        return pulumi.get(self, "routes")

    @routes.setter
    def routes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MagicWanStaticRouteRouteArgs']]]]):
        pulumi.set(self, "routes", value)

    @property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input['MagicWanStaticRouteScopeArgs']]:
        """
        Used only for ECMP routes.
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input['MagicWanStaticRouteScopeArgs']]):
        pulumi.set(self, "scope", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Optional weight of the ECMP scope - if provided.
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "weight", value)


@pulumi.input_type
class _MagicWanStaticRouteState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 modified: Optional[pulumi.Input[builtins.bool]] = None,
                 modified_route: Optional[pulumi.Input['MagicWanStaticRouteModifiedRouteArgs']] = None,
                 nexthop: Optional[pulumi.Input[builtins.str]] = None,
                 prefix: Optional[pulumi.Input[builtins.str]] = None,
                 priority: Optional[pulumi.Input[builtins.int]] = None,
                 route: Optional[pulumi.Input['MagicWanStaticRouteRouteArgs']] = None,
                 route_id: Optional[pulumi.Input[builtins.str]] = None,
                 routes: Optional[pulumi.Input[Sequence[pulumi.Input['MagicWanStaticRouteRouteArgs']]]] = None,
                 scope: Optional[pulumi.Input['MagicWanStaticRouteScopeArgs']] = None,
                 weight: Optional[pulumi.Input[builtins.int]] = None):
        """
        Input properties used for looking up and filtering MagicWanStaticRoute resources.
        :param pulumi.Input[builtins.str] account_id: Identifier
        :param pulumi.Input[builtins.str] description: An optional human provided description of the static route.
        :param pulumi.Input[builtins.str] nexthop: The next-hop IP Address for the static route.
        :param pulumi.Input[builtins.str] prefix: IP Prefix in Classless Inter-Domain Routing format.
        :param pulumi.Input[builtins.int] priority: Priority of the static route.
        :param pulumi.Input[builtins.str] route_id: Identifier
        :param pulumi.Input['MagicWanStaticRouteScopeArgs'] scope: Used only for ECMP routes.
        :param pulumi.Input[builtins.int] weight: Optional weight of the ECMP scope - if provided.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if modified is not None:
            pulumi.set(__self__, "modified", modified)
        if modified_route is not None:
            pulumi.set(__self__, "modified_route", modified_route)
        if nexthop is not None:
            pulumi.set(__self__, "nexthop", nexthop)
        if prefix is not None:
            pulumi.set(__self__, "prefix", prefix)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if route is not None:
            pulumi.set(__self__, "route", route)
        if route_id is not None:
            pulumi.set(__self__, "route_id", route_id)
        if routes is not None:
            pulumi.set(__self__, "routes", routes)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Identifier
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        An optional human provided description of the static route.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def modified(self) -> Optional[pulumi.Input[builtins.bool]]:
        return pulumi.get(self, "modified")

    @modified.setter
    def modified(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "modified", value)

    @property
    @pulumi.getter(name="modifiedRoute")
    def modified_route(self) -> Optional[pulumi.Input['MagicWanStaticRouteModifiedRouteArgs']]:
        return pulumi.get(self, "modified_route")

    @modified_route.setter
    def modified_route(self, value: Optional[pulumi.Input['MagicWanStaticRouteModifiedRouteArgs']]):
        pulumi.set(self, "modified_route", value)

    @property
    @pulumi.getter
    def nexthop(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The next-hop IP Address for the static route.
        """
        return pulumi.get(self, "nexthop")

    @nexthop.setter
    def nexthop(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "nexthop", value)

    @property
    @pulumi.getter
    def prefix(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        IP Prefix in Classless Inter-Domain Routing format.
        """
        return pulumi.get(self, "prefix")

    @prefix.setter
    def prefix(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "prefix", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Priority of the static route.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter
    def route(self) -> Optional[pulumi.Input['MagicWanStaticRouteRouteArgs']]:
        return pulumi.get(self, "route")

    @route.setter
    def route(self, value: Optional[pulumi.Input['MagicWanStaticRouteRouteArgs']]):
        pulumi.set(self, "route", value)

    @property
    @pulumi.getter(name="routeId")
    def route_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Identifier
        """
        return pulumi.get(self, "route_id")

    @route_id.setter
    def route_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "route_id", value)

    @property
    @pulumi.getter
    def routes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MagicWanStaticRouteRouteArgs']]]]:
        return pulumi.get(self, "routes")

    @routes.setter
    def routes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MagicWanStaticRouteRouteArgs']]]]):
        pulumi.set(self, "routes", value)

    @property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input['MagicWanStaticRouteScopeArgs']]:
        """
        Used only for ECMP routes.
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input['MagicWanStaticRouteScopeArgs']]):
        pulumi.set(self, "scope", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Optional weight of the ECMP scope - if provided.
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "weight", value)


class MagicWanStaticRoute(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 nexthop: Optional[pulumi.Input[builtins.str]] = None,
                 prefix: Optional[pulumi.Input[builtins.str]] = None,
                 priority: Optional[pulumi.Input[builtins.int]] = None,
                 route: Optional[pulumi.Input[Union['MagicWanStaticRouteRouteArgs', 'MagicWanStaticRouteRouteArgsDict']]] = None,
                 route_id: Optional[pulumi.Input[builtins.str]] = None,
                 routes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['MagicWanStaticRouteRouteArgs', 'MagicWanStaticRouteRouteArgsDict']]]]] = None,
                 scope: Optional[pulumi.Input[Union['MagicWanStaticRouteScopeArgs', 'MagicWanStaticRouteScopeArgsDict']]] = None,
                 weight: Optional[pulumi.Input[builtins.int]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_magic_wan_static_route = cloudflare.MagicWanStaticRoute("example_magic_wan_static_route", account_id="023e105f4ecef8ad9ca31a8372d0c353")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] account_id: Identifier
        :param pulumi.Input[builtins.str] description: An optional human provided description of the static route.
        :param pulumi.Input[builtins.str] nexthop: The next-hop IP Address for the static route.
        :param pulumi.Input[builtins.str] prefix: IP Prefix in Classless Inter-Domain Routing format.
        :param pulumi.Input[builtins.int] priority: Priority of the static route.
        :param pulumi.Input[builtins.str] route_id: Identifier
        :param pulumi.Input[Union['MagicWanStaticRouteScopeArgs', 'MagicWanStaticRouteScopeArgsDict']] scope: Used only for ECMP routes.
        :param pulumi.Input[builtins.int] weight: Optional weight of the ECMP scope - if provided.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MagicWanStaticRouteArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_magic_wan_static_route = cloudflare.MagicWanStaticRoute("example_magic_wan_static_route", account_id="023e105f4ecef8ad9ca31a8372d0c353")
        ```

        :param str resource_name: The name of the resource.
        :param MagicWanStaticRouteArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MagicWanStaticRouteArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[builtins.str]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 nexthop: Optional[pulumi.Input[builtins.str]] = None,
                 prefix: Optional[pulumi.Input[builtins.str]] = None,
                 priority: Optional[pulumi.Input[builtins.int]] = None,
                 route: Optional[pulumi.Input[Union['MagicWanStaticRouteRouteArgs', 'MagicWanStaticRouteRouteArgsDict']]] = None,
                 route_id: Optional[pulumi.Input[builtins.str]] = None,
                 routes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['MagicWanStaticRouteRouteArgs', 'MagicWanStaticRouteRouteArgsDict']]]]] = None,
                 scope: Optional[pulumi.Input[Union['MagicWanStaticRouteScopeArgs', 'MagicWanStaticRouteScopeArgsDict']]] = None,
                 weight: Optional[pulumi.Input[builtins.int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MagicWanStaticRouteArgs.__new__(MagicWanStaticRouteArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["description"] = description
            __props__.__dict__["nexthop"] = nexthop
            __props__.__dict__["prefix"] = prefix
            __props__.__dict__["priority"] = priority
            __props__.__dict__["route"] = route
            __props__.__dict__["route_id"] = route_id
            __props__.__dict__["routes"] = routes
            __props__.__dict__["scope"] = scope
            __props__.__dict__["weight"] = weight
            __props__.__dict__["modified"] = None
            __props__.__dict__["modified_route"] = None
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="cloudflare:index/staticRoute:StaticRoute")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(MagicWanStaticRoute, __self__).__init__(
            'cloudflare:index/magicWanStaticRoute:MagicWanStaticRoute',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[builtins.str]] = None,
            description: Optional[pulumi.Input[builtins.str]] = None,
            modified: Optional[pulumi.Input[builtins.bool]] = None,
            modified_route: Optional[pulumi.Input[Union['MagicWanStaticRouteModifiedRouteArgs', 'MagicWanStaticRouteModifiedRouteArgsDict']]] = None,
            nexthop: Optional[pulumi.Input[builtins.str]] = None,
            prefix: Optional[pulumi.Input[builtins.str]] = None,
            priority: Optional[pulumi.Input[builtins.int]] = None,
            route: Optional[pulumi.Input[Union['MagicWanStaticRouteRouteArgs', 'MagicWanStaticRouteRouteArgsDict']]] = None,
            route_id: Optional[pulumi.Input[builtins.str]] = None,
            routes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['MagicWanStaticRouteRouteArgs', 'MagicWanStaticRouteRouteArgsDict']]]]] = None,
            scope: Optional[pulumi.Input[Union['MagicWanStaticRouteScopeArgs', 'MagicWanStaticRouteScopeArgsDict']]] = None,
            weight: Optional[pulumi.Input[builtins.int]] = None) -> 'MagicWanStaticRoute':
        """
        Get an existing MagicWanStaticRoute resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] account_id: Identifier
        :param pulumi.Input[builtins.str] description: An optional human provided description of the static route.
        :param pulumi.Input[builtins.str] nexthop: The next-hop IP Address for the static route.
        :param pulumi.Input[builtins.str] prefix: IP Prefix in Classless Inter-Domain Routing format.
        :param pulumi.Input[builtins.int] priority: Priority of the static route.
        :param pulumi.Input[builtins.str] route_id: Identifier
        :param pulumi.Input[Union['MagicWanStaticRouteScopeArgs', 'MagicWanStaticRouteScopeArgsDict']] scope: Used only for ECMP routes.
        :param pulumi.Input[builtins.int] weight: Optional weight of the ECMP scope - if provided.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MagicWanStaticRouteState.__new__(_MagicWanStaticRouteState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["description"] = description
        __props__.__dict__["modified"] = modified
        __props__.__dict__["modified_route"] = modified_route
        __props__.__dict__["nexthop"] = nexthop
        __props__.__dict__["prefix"] = prefix
        __props__.__dict__["priority"] = priority
        __props__.__dict__["route"] = route
        __props__.__dict__["route_id"] = route_id
        __props__.__dict__["routes"] = routes
        __props__.__dict__["scope"] = scope
        __props__.__dict__["weight"] = weight
        return MagicWanStaticRoute(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[builtins.str]:
        """
        Identifier
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        An optional human provided description of the static route.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def modified(self) -> pulumi.Output[builtins.bool]:
        return pulumi.get(self, "modified")

    @property
    @pulumi.getter(name="modifiedRoute")
    def modified_route(self) -> pulumi.Output['outputs.MagicWanStaticRouteModifiedRoute']:
        return pulumi.get(self, "modified_route")

    @property
    @pulumi.getter
    def nexthop(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The next-hop IP Address for the static route.
        """
        return pulumi.get(self, "nexthop")

    @property
    @pulumi.getter
    def prefix(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        IP Prefix in Classless Inter-Domain Routing format.
        """
        return pulumi.get(self, "prefix")

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Output[Optional[builtins.int]]:
        """
        Priority of the static route.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def route(self) -> pulumi.Output['outputs.MagicWanStaticRouteRoute']:
        return pulumi.get(self, "route")

    @property
    @pulumi.getter(name="routeId")
    def route_id(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Identifier
        """
        return pulumi.get(self, "route_id")

    @property
    @pulumi.getter
    def routes(self) -> pulumi.Output[Sequence['outputs.MagicWanStaticRouteRoute']]:
        return pulumi.get(self, "routes")

    @property
    @pulumi.getter
    def scope(self) -> pulumi.Output['outputs.MagicWanStaticRouteScope']:
        """
        Used only for ECMP routes.
        """
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter
    def weight(self) -> pulumi.Output[Optional[builtins.int]]:
        """
        Optional weight of the ECMP scope - if provided.
        """
        return pulumi.get(self, "weight")

