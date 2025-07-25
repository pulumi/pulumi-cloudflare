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

__all__ = [
    'GetPageShieldCookiesListResult',
    'AwaitableGetPageShieldCookiesListResult',
    'get_page_shield_cookies_list',
    'get_page_shield_cookies_list_output',
]

@pulumi.output_type
class GetPageShieldCookiesListResult:
    """
    A collection of values returned by getPageShieldCookiesList.
    """
    def __init__(__self__, direction=None, domain=None, export=None, hosts=None, http_only=None, id=None, max_items=None, name=None, order_by=None, page=None, page_url=None, path=None, per_page=None, results=None, same_site=None, secure=None, type=None, zone_id=None):
        if direction and not isinstance(direction, str):
            raise TypeError("Expected argument 'direction' to be a str")
        pulumi.set(__self__, "direction", direction)
        if domain and not isinstance(domain, str):
            raise TypeError("Expected argument 'domain' to be a str")
        pulumi.set(__self__, "domain", domain)
        if export and not isinstance(export, str):
            raise TypeError("Expected argument 'export' to be a str")
        pulumi.set(__self__, "export", export)
        if hosts and not isinstance(hosts, str):
            raise TypeError("Expected argument 'hosts' to be a str")
        pulumi.set(__self__, "hosts", hosts)
        if http_only and not isinstance(http_only, bool):
            raise TypeError("Expected argument 'http_only' to be a bool")
        pulumi.set(__self__, "http_only", http_only)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if max_items and not isinstance(max_items, int):
            raise TypeError("Expected argument 'max_items' to be a int")
        pulumi.set(__self__, "max_items", max_items)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if order_by and not isinstance(order_by, str):
            raise TypeError("Expected argument 'order_by' to be a str")
        pulumi.set(__self__, "order_by", order_by)
        if page and not isinstance(page, str):
            raise TypeError("Expected argument 'page' to be a str")
        pulumi.set(__self__, "page", page)
        if page_url and not isinstance(page_url, str):
            raise TypeError("Expected argument 'page_url' to be a str")
        pulumi.set(__self__, "page_url", page_url)
        if path and not isinstance(path, str):
            raise TypeError("Expected argument 'path' to be a str")
        pulumi.set(__self__, "path", path)
        if per_page and not isinstance(per_page, float):
            raise TypeError("Expected argument 'per_page' to be a float")
        pulumi.set(__self__, "per_page", per_page)
        if results and not isinstance(results, list):
            raise TypeError("Expected argument 'results' to be a list")
        pulumi.set(__self__, "results", results)
        if same_site and not isinstance(same_site, str):
            raise TypeError("Expected argument 'same_site' to be a str")
        pulumi.set(__self__, "same_site", same_site)
        if secure and not isinstance(secure, bool):
            raise TypeError("Expected argument 'secure' to be a bool")
        pulumi.set(__self__, "secure", secure)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter
    def direction(self) -> Optional[_builtins.str]:
        """
        The direction used to sort returned cookies.'
        Available values: "asc", "desc".
        """
        return pulumi.get(self, "direction")

    @_builtins.property
    @pulumi.getter
    def domain(self) -> Optional[_builtins.str]:
        """
        Filters the returned cookies that match the specified domain attribute
        """
        return pulumi.get(self, "domain")

    @_builtins.property
    @pulumi.getter
    def export(self) -> Optional[_builtins.str]:
        """
        Export the list of cookies as a file.
        Available values: "csv".
        """
        return pulumi.get(self, "export")

    @_builtins.property
    @pulumi.getter
    def hosts(self) -> Optional[_builtins.str]:
        """
        Includes cookies that match one or more URL-encoded hostnames separated by commas.
        """
        return pulumi.get(self, "hosts")

    @_builtins.property
    @pulumi.getter(name="httpOnly")
    def http_only(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "http_only")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="maxItems")
    def max_items(self) -> Optional[_builtins.int]:
        return pulumi.get(self, "max_items")

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="orderBy")
    def order_by(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "order_by")

    @_builtins.property
    @pulumi.getter
    def page(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "page")

    @_builtins.property
    @pulumi.getter(name="pageUrl")
    def page_url(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "page_url")

    @_builtins.property
    @pulumi.getter
    def path(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "path")

    @_builtins.property
    @pulumi.getter(name="perPage")
    def per_page(self) -> Optional[_builtins.float]:
        return pulumi.get(self, "per_page")

    @_builtins.property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetPageShieldCookiesListResultResult']:
        return pulumi.get(self, "results")

    @_builtins.property
    @pulumi.getter(name="sameSite")
    def same_site(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "same_site")

    @_builtins.property
    @pulumi.getter
    def secure(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "secure")

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> _builtins.str:
        """
        Identifier
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetPageShieldCookiesListResult(GetPageShieldCookiesListResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPageShieldCookiesListResult(
            direction=self.direction,
            domain=self.domain,
            export=self.export,
            hosts=self.hosts,
            http_only=self.http_only,
            id=self.id,
            max_items=self.max_items,
            name=self.name,
            order_by=self.order_by,
            page=self.page,
            page_url=self.page_url,
            path=self.path,
            per_page=self.per_page,
            results=self.results,
            same_site=self.same_site,
            secure=self.secure,
            type=self.type,
            zone_id=self.zone_id)


def get_page_shield_cookies_list(direction: Optional[_builtins.str] = None,
                                 domain: Optional[_builtins.str] = None,
                                 export: Optional[_builtins.str] = None,
                                 hosts: Optional[_builtins.str] = None,
                                 http_only: Optional[_builtins.bool] = None,
                                 max_items: Optional[_builtins.int] = None,
                                 name: Optional[_builtins.str] = None,
                                 order_by: Optional[_builtins.str] = None,
                                 page: Optional[_builtins.str] = None,
                                 page_url: Optional[_builtins.str] = None,
                                 path: Optional[_builtins.str] = None,
                                 per_page: Optional[_builtins.float] = None,
                                 same_site: Optional[_builtins.str] = None,
                                 secure: Optional[_builtins.bool] = None,
                                 type: Optional[_builtins.str] = None,
                                 zone_id: Optional[_builtins.str] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPageShieldCookiesListResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_page_shield_cookies_list = cloudflare.get_page_shield_cookies_list(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        direction="asc",
        domain="example.com",
        export="csv",
        hosts="blog.cloudflare.com,www.example*,*cloudflare.com",
        http_only=True,
        name="session_id",
        order_by="first_seen_at",
        page="2",
        page_url="example.com/page,*/checkout,example.com/*,*checkout*",
        path="/",
        per_page=100,
        same_site="strict",
        secure=True,
        type="first_party")
    ```


    :param _builtins.str direction: The direction used to sort returned cookies.'
           Available values: "asc", "desc".
    :param _builtins.str domain: Filters the returned cookies that match the specified domain attribute
    :param _builtins.str export: Export the list of cookies as a file.
           Available values: "csv".
    :param _builtins.str hosts: Includes cookies that match one or more URL-encoded hostnames separated by commas.
    :param _builtins.str zone_id: Identifier
    """
    __args__ = dict()
    __args__['direction'] = direction
    __args__['domain'] = domain
    __args__['export'] = export
    __args__['hosts'] = hosts
    __args__['httpOnly'] = http_only
    __args__['maxItems'] = max_items
    __args__['name'] = name
    __args__['orderBy'] = order_by
    __args__['page'] = page
    __args__['pageUrl'] = page_url
    __args__['path'] = path
    __args__['perPage'] = per_page
    __args__['sameSite'] = same_site
    __args__['secure'] = secure
    __args__['type'] = type
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getPageShieldCookiesList:getPageShieldCookiesList', __args__, opts=opts, typ=GetPageShieldCookiesListResult).value

    return AwaitableGetPageShieldCookiesListResult(
        direction=pulumi.get(__ret__, 'direction'),
        domain=pulumi.get(__ret__, 'domain'),
        export=pulumi.get(__ret__, 'export'),
        hosts=pulumi.get(__ret__, 'hosts'),
        http_only=pulumi.get(__ret__, 'http_only'),
        id=pulumi.get(__ret__, 'id'),
        max_items=pulumi.get(__ret__, 'max_items'),
        name=pulumi.get(__ret__, 'name'),
        order_by=pulumi.get(__ret__, 'order_by'),
        page=pulumi.get(__ret__, 'page'),
        page_url=pulumi.get(__ret__, 'page_url'),
        path=pulumi.get(__ret__, 'path'),
        per_page=pulumi.get(__ret__, 'per_page'),
        results=pulumi.get(__ret__, 'results'),
        same_site=pulumi.get(__ret__, 'same_site'),
        secure=pulumi.get(__ret__, 'secure'),
        type=pulumi.get(__ret__, 'type'),
        zone_id=pulumi.get(__ret__, 'zone_id'))
def get_page_shield_cookies_list_output(direction: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        domain: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        export: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        hosts: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        http_only: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                                        max_items: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                                        name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        order_by: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        page: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        page_url: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        path: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        per_page: Optional[pulumi.Input[Optional[_builtins.float]]] = None,
                                        same_site: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        secure: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                                        type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetPageShieldCookiesListResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_page_shield_cookies_list = cloudflare.get_page_shield_cookies_list(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        direction="asc",
        domain="example.com",
        export="csv",
        hosts="blog.cloudflare.com,www.example*,*cloudflare.com",
        http_only=True,
        name="session_id",
        order_by="first_seen_at",
        page="2",
        page_url="example.com/page,*/checkout,example.com/*,*checkout*",
        path="/",
        per_page=100,
        same_site="strict",
        secure=True,
        type="first_party")
    ```


    :param _builtins.str direction: The direction used to sort returned cookies.'
           Available values: "asc", "desc".
    :param _builtins.str domain: Filters the returned cookies that match the specified domain attribute
    :param _builtins.str export: Export the list of cookies as a file.
           Available values: "csv".
    :param _builtins.str hosts: Includes cookies that match one or more URL-encoded hostnames separated by commas.
    :param _builtins.str zone_id: Identifier
    """
    __args__ = dict()
    __args__['direction'] = direction
    __args__['domain'] = domain
    __args__['export'] = export
    __args__['hosts'] = hosts
    __args__['httpOnly'] = http_only
    __args__['maxItems'] = max_items
    __args__['name'] = name
    __args__['orderBy'] = order_by
    __args__['page'] = page
    __args__['pageUrl'] = page_url
    __args__['path'] = path
    __args__['perPage'] = per_page
    __args__['sameSite'] = same_site
    __args__['secure'] = secure
    __args__['type'] = type
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getPageShieldCookiesList:getPageShieldCookiesList', __args__, opts=opts, typ=GetPageShieldCookiesListResult)
    return __ret__.apply(lambda __response__: GetPageShieldCookiesListResult(
        direction=pulumi.get(__response__, 'direction'),
        domain=pulumi.get(__response__, 'domain'),
        export=pulumi.get(__response__, 'export'),
        hosts=pulumi.get(__response__, 'hosts'),
        http_only=pulumi.get(__response__, 'http_only'),
        id=pulumi.get(__response__, 'id'),
        max_items=pulumi.get(__response__, 'max_items'),
        name=pulumi.get(__response__, 'name'),
        order_by=pulumi.get(__response__, 'order_by'),
        page=pulumi.get(__response__, 'page'),
        page_url=pulumi.get(__response__, 'page_url'),
        path=pulumi.get(__response__, 'path'),
        per_page=pulumi.get(__response__, 'per_page'),
        results=pulumi.get(__response__, 'results'),
        same_site=pulumi.get(__response__, 'same_site'),
        secure=pulumi.get(__response__, 'secure'),
        type=pulumi.get(__response__, 'type'),
        zone_id=pulumi.get(__response__, 'zone_id')))
