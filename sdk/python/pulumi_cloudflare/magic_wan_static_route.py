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

__all__ = ['MagicWanStaticRouteArgs', 'MagicWanStaticRoute']

@pulumi.input_type
class MagicWanStaticRouteArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[_builtins.str],
                 nexthop: pulumi.Input[_builtins.str],
                 prefix: pulumi.Input[_builtins.str],
                 priority: pulumi.Input[_builtins.int],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 route: Optional[pulumi.Input['MagicWanStaticRouteRouteArgs']] = None,
                 scope: Optional[pulumi.Input['MagicWanStaticRouteScopeArgs']] = None,
                 weight: Optional[pulumi.Input[_builtins.int]] = None):
        """
        The set of arguments for constructing a MagicWanStaticRoute resource.
        :param pulumi.Input[_builtins.str] account_id: Identifier
        :param pulumi.Input[_builtins.str] nexthop: The next-hop IP Address for the static route.
        :param pulumi.Input[_builtins.str] prefix: IP Prefix in Classless Inter-Domain Routing format.
        :param pulumi.Input[_builtins.int] priority: Priority of the static route.
        :param pulumi.Input[_builtins.str] description: An optional human provided description of the static route.
        :param pulumi.Input['MagicWanStaticRouteScopeArgs'] scope: Used only for ECMP routes.
        :param pulumi.Input[_builtins.int] weight: Optional weight of the ECMP scope - if provided.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "nexthop", nexthop)
        pulumi.set(__self__, "prefix", prefix)
        pulumi.set(__self__, "priority", priority)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if route is not None:
            pulumi.set(__self__, "route", route)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[_builtins.str]:
        """
        Identifier
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter
    def nexthop(self) -> pulumi.Input[_builtins.str]:
        """
        The next-hop IP Address for the static route.
        """
        return pulumi.get(self, "nexthop")

    @nexthop.setter
    def nexthop(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "nexthop", value)

    @_builtins.property
    @pulumi.getter
    def prefix(self) -> pulumi.Input[_builtins.str]:
        """
        IP Prefix in Classless Inter-Domain Routing format.
        """
        return pulumi.get(self, "prefix")

    @prefix.setter
    def prefix(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "prefix", value)

    @_builtins.property
    @pulumi.getter
    def priority(self) -> pulumi.Input[_builtins.int]:
        """
        Priority of the static route.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "priority", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        An optional human provided description of the static route.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def route(self) -> Optional[pulumi.Input['MagicWanStaticRouteRouteArgs']]:
        return pulumi.get(self, "route")

    @route.setter
    def route(self, value: Optional[pulumi.Input['MagicWanStaticRouteRouteArgs']]):
        pulumi.set(self, "route", value)

    @_builtins.property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input['MagicWanStaticRouteScopeArgs']]:
        """
        Used only for ECMP routes.
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input['MagicWanStaticRouteScopeArgs']]):
        pulumi.set(self, "scope", value)

    @_builtins.property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Optional weight of the ECMP scope - if provided.
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "weight", value)


@pulumi.input_type
class _MagicWanStaticRouteState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 created_on: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 modified: Optional[pulumi.Input[_builtins.bool]] = None,
                 modified_on: Optional[pulumi.Input[_builtins.str]] = None,
                 modified_route: Optional[pulumi.Input['MagicWanStaticRouteModifiedRouteArgs']] = None,
                 nexthop: Optional[pulumi.Input[_builtins.str]] = None,
                 prefix: Optional[pulumi.Input[_builtins.str]] = None,
                 priority: Optional[pulumi.Input[_builtins.int]] = None,
                 route: Optional[pulumi.Input['MagicWanStaticRouteRouteArgs']] = None,
                 scope: Optional[pulumi.Input['MagicWanStaticRouteScopeArgs']] = None,
                 weight: Optional[pulumi.Input[_builtins.int]] = None):
        """
        Input properties used for looking up and filtering MagicWanStaticRoute resources.
        :param pulumi.Input[_builtins.str] account_id: Identifier
        :param pulumi.Input[_builtins.str] created_on: When the route was created.
        :param pulumi.Input[_builtins.str] description: An optional human provided description of the static route.
        :param pulumi.Input[_builtins.str] modified_on: When the route was last modified.
        :param pulumi.Input[_builtins.str] nexthop: The next-hop IP Address for the static route.
        :param pulumi.Input[_builtins.str] prefix: IP Prefix in Classless Inter-Domain Routing format.
        :param pulumi.Input[_builtins.int] priority: Priority of the static route.
        :param pulumi.Input['MagicWanStaticRouteScopeArgs'] scope: Used only for ECMP routes.
        :param pulumi.Input[_builtins.int] weight: Optional weight of the ECMP scope - if provided.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if created_on is not None:
            pulumi.set(__self__, "created_on", created_on)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if modified is not None:
            pulumi.set(__self__, "modified", modified)
        if modified_on is not None:
            pulumi.set(__self__, "modified_on", modified_on)
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
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Identifier
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        When the route was created.
        """
        return pulumi.get(self, "created_on")

    @created_on.setter
    def created_on(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "created_on", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        An optional human provided description of the static route.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def modified(self) -> Optional[pulumi.Input[_builtins.bool]]:
        return pulumi.get(self, "modified")

    @modified.setter
    def modified(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "modified", value)

    @_builtins.property
    @pulumi.getter(name="modifiedOn")
    def modified_on(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        When the route was last modified.
        """
        return pulumi.get(self, "modified_on")

    @modified_on.setter
    def modified_on(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "modified_on", value)

    @_builtins.property
    @pulumi.getter(name="modifiedRoute")
    def modified_route(self) -> Optional[pulumi.Input['MagicWanStaticRouteModifiedRouteArgs']]:
        return pulumi.get(self, "modified_route")

    @modified_route.setter
    def modified_route(self, value: Optional[pulumi.Input['MagicWanStaticRouteModifiedRouteArgs']]):
        pulumi.set(self, "modified_route", value)

    @_builtins.property
    @pulumi.getter
    def nexthop(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The next-hop IP Address for the static route.
        """
        return pulumi.get(self, "nexthop")

    @nexthop.setter
    def nexthop(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "nexthop", value)

    @_builtins.property
    @pulumi.getter
    def prefix(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        IP Prefix in Classless Inter-Domain Routing format.
        """
        return pulumi.get(self, "prefix")

    @prefix.setter
    def prefix(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "prefix", value)

    @_builtins.property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Priority of the static route.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "priority", value)

    @_builtins.property
    @pulumi.getter
    def route(self) -> Optional[pulumi.Input['MagicWanStaticRouteRouteArgs']]:
        return pulumi.get(self, "route")

    @route.setter
    def route(self, value: Optional[pulumi.Input['MagicWanStaticRouteRouteArgs']]):
        pulumi.set(self, "route", value)

    @_builtins.property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input['MagicWanStaticRouteScopeArgs']]:
        """
        Used only for ECMP routes.
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input['MagicWanStaticRouteScopeArgs']]):
        pulumi.set(self, "scope", value)

    @_builtins.property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Optional weight of the ECMP scope - if provided.
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "weight", value)


@pulumi.type_token("cloudflare:index/magicWanStaticRoute:MagicWanStaticRoute")
class MagicWanStaticRoute(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 nexthop: Optional[pulumi.Input[_builtins.str]] = None,
                 prefix: Optional[pulumi.Input[_builtins.str]] = None,
                 priority: Optional[pulumi.Input[_builtins.int]] = None,
                 route: Optional[pulumi.Input[Union['MagicWanStaticRouteRouteArgs', 'MagicWanStaticRouteRouteArgsDict']]] = None,
                 scope: Optional[pulumi.Input[Union['MagicWanStaticRouteScopeArgs', 'MagicWanStaticRouteScopeArgsDict']]] = None,
                 weight: Optional[pulumi.Input[_builtins.int]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import cloudflare:index/magicWanStaticRoute:MagicWanStaticRoute example '<account_id>/<route_id>'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: Identifier
        :param pulumi.Input[_builtins.str] description: An optional human provided description of the static route.
        :param pulumi.Input[_builtins.str] nexthop: The next-hop IP Address for the static route.
        :param pulumi.Input[_builtins.str] prefix: IP Prefix in Classless Inter-Domain Routing format.
        :param pulumi.Input[_builtins.int] priority: Priority of the static route.
        :param pulumi.Input[Union['MagicWanStaticRouteScopeArgs', 'MagicWanStaticRouteScopeArgsDict']] scope: Used only for ECMP routes.
        :param pulumi.Input[_builtins.int] weight: Optional weight of the ECMP scope - if provided.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MagicWanStaticRouteArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import cloudflare:index/magicWanStaticRoute:MagicWanStaticRoute example '<account_id>/<route_id>'
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
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 nexthop: Optional[pulumi.Input[_builtins.str]] = None,
                 prefix: Optional[pulumi.Input[_builtins.str]] = None,
                 priority: Optional[pulumi.Input[_builtins.int]] = None,
                 route: Optional[pulumi.Input[Union['MagicWanStaticRouteRouteArgs', 'MagicWanStaticRouteRouteArgsDict']]] = None,
                 scope: Optional[pulumi.Input[Union['MagicWanStaticRouteScopeArgs', 'MagicWanStaticRouteScopeArgsDict']]] = None,
                 weight: Optional[pulumi.Input[_builtins.int]] = None,
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
            if nexthop is None and not opts.urn:
                raise TypeError("Missing required property 'nexthop'")
            __props__.__dict__["nexthop"] = nexthop
            if prefix is None and not opts.urn:
                raise TypeError("Missing required property 'prefix'")
            __props__.__dict__["prefix"] = prefix
            if priority is None and not opts.urn:
                raise TypeError("Missing required property 'priority'")
            __props__.__dict__["priority"] = priority
            __props__.__dict__["route"] = route
            __props__.__dict__["scope"] = scope
            __props__.__dict__["weight"] = weight
            __props__.__dict__["created_on"] = None
            __props__.__dict__["modified"] = None
            __props__.__dict__["modified_on"] = None
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
            account_id: Optional[pulumi.Input[_builtins.str]] = None,
            created_on: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            modified: Optional[pulumi.Input[_builtins.bool]] = None,
            modified_on: Optional[pulumi.Input[_builtins.str]] = None,
            modified_route: Optional[pulumi.Input[Union['MagicWanStaticRouteModifiedRouteArgs', 'MagicWanStaticRouteModifiedRouteArgsDict']]] = None,
            nexthop: Optional[pulumi.Input[_builtins.str]] = None,
            prefix: Optional[pulumi.Input[_builtins.str]] = None,
            priority: Optional[pulumi.Input[_builtins.int]] = None,
            route: Optional[pulumi.Input[Union['MagicWanStaticRouteRouteArgs', 'MagicWanStaticRouteRouteArgsDict']]] = None,
            scope: Optional[pulumi.Input[Union['MagicWanStaticRouteScopeArgs', 'MagicWanStaticRouteScopeArgsDict']]] = None,
            weight: Optional[pulumi.Input[_builtins.int]] = None) -> 'MagicWanStaticRoute':
        """
        Get an existing MagicWanStaticRoute resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: Identifier
        :param pulumi.Input[_builtins.str] created_on: When the route was created.
        :param pulumi.Input[_builtins.str] description: An optional human provided description of the static route.
        :param pulumi.Input[_builtins.str] modified_on: When the route was last modified.
        :param pulumi.Input[_builtins.str] nexthop: The next-hop IP Address for the static route.
        :param pulumi.Input[_builtins.str] prefix: IP Prefix in Classless Inter-Domain Routing format.
        :param pulumi.Input[_builtins.int] priority: Priority of the static route.
        :param pulumi.Input[Union['MagicWanStaticRouteScopeArgs', 'MagicWanStaticRouteScopeArgsDict']] scope: Used only for ECMP routes.
        :param pulumi.Input[_builtins.int] weight: Optional weight of the ECMP scope - if provided.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MagicWanStaticRouteState.__new__(_MagicWanStaticRouteState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["created_on"] = created_on
        __props__.__dict__["description"] = description
        __props__.__dict__["modified"] = modified
        __props__.__dict__["modified_on"] = modified_on
        __props__.__dict__["modified_route"] = modified_route
        __props__.__dict__["nexthop"] = nexthop
        __props__.__dict__["prefix"] = prefix
        __props__.__dict__["priority"] = priority
        __props__.__dict__["route"] = route
        __props__.__dict__["scope"] = scope
        __props__.__dict__["weight"] = weight
        return MagicWanStaticRoute(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[_builtins.str]:
        """
        Identifier
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> pulumi.Output[_builtins.str]:
        """
        When the route was created.
        """
        return pulumi.get(self, "created_on")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        An optional human provided description of the static route.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def modified(self) -> pulumi.Output[_builtins.bool]:
        return pulumi.get(self, "modified")

    @_builtins.property
    @pulumi.getter(name="modifiedOn")
    def modified_on(self) -> pulumi.Output[_builtins.str]:
        """
        When the route was last modified.
        """
        return pulumi.get(self, "modified_on")

    @_builtins.property
    @pulumi.getter(name="modifiedRoute")
    def modified_route(self) -> pulumi.Output['outputs.MagicWanStaticRouteModifiedRoute']:
        return pulumi.get(self, "modified_route")

    @_builtins.property
    @pulumi.getter
    def nexthop(self) -> pulumi.Output[_builtins.str]:
        """
        The next-hop IP Address for the static route.
        """
        return pulumi.get(self, "nexthop")

    @_builtins.property
    @pulumi.getter
    def prefix(self) -> pulumi.Output[_builtins.str]:
        """
        IP Prefix in Classless Inter-Domain Routing format.
        """
        return pulumi.get(self, "prefix")

    @_builtins.property
    @pulumi.getter
    def priority(self) -> pulumi.Output[_builtins.int]:
        """
        Priority of the static route.
        """
        return pulumi.get(self, "priority")

    @_builtins.property
    @pulumi.getter
    def route(self) -> pulumi.Output['outputs.MagicWanStaticRouteRoute']:
        return pulumi.get(self, "route")

    @_builtins.property
    @pulumi.getter
    def scope(self) -> pulumi.Output[Optional['outputs.MagicWanStaticRouteScope']]:
        """
        Used only for ECMP routes.
        """
        return pulumi.get(self, "scope")

    @_builtins.property
    @pulumi.getter
    def weight(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        Optional weight of the ECMP scope - if provided.
        """
        return pulumi.get(self, "weight")

