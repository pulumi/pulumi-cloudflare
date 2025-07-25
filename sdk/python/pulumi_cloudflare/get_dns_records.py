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

__all__ = [
    'GetDnsRecordsResult',
    'AwaitableGetDnsRecordsResult',
    'get_dns_records',
    'get_dns_records_output',
]

@pulumi.output_type
class GetDnsRecordsResult:
    """
    A collection of values returned by getDnsRecords.
    """
    def __init__(__self__, comment=None, content=None, direction=None, id=None, match=None, max_items=None, name=None, order=None, proxied=None, results=None, search=None, tag=None, tag_match=None, type=None, zone_id=None):
        if comment and not isinstance(comment, dict):
            raise TypeError("Expected argument 'comment' to be a dict")
        pulumi.set(__self__, "comment", comment)
        if content and not isinstance(content, dict):
            raise TypeError("Expected argument 'content' to be a dict")
        pulumi.set(__self__, "content", content)
        if direction and not isinstance(direction, str):
            raise TypeError("Expected argument 'direction' to be a str")
        pulumi.set(__self__, "direction", direction)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if match and not isinstance(match, str):
            raise TypeError("Expected argument 'match' to be a str")
        pulumi.set(__self__, "match", match)
        if max_items and not isinstance(max_items, int):
            raise TypeError("Expected argument 'max_items' to be a int")
        pulumi.set(__self__, "max_items", max_items)
        if name and not isinstance(name, dict):
            raise TypeError("Expected argument 'name' to be a dict")
        pulumi.set(__self__, "name", name)
        if order and not isinstance(order, str):
            raise TypeError("Expected argument 'order' to be a str")
        pulumi.set(__self__, "order", order)
        if proxied and not isinstance(proxied, bool):
            raise TypeError("Expected argument 'proxied' to be a bool")
        pulumi.set(__self__, "proxied", proxied)
        if results and not isinstance(results, list):
            raise TypeError("Expected argument 'results' to be a list")
        pulumi.set(__self__, "results", results)
        if search and not isinstance(search, str):
            raise TypeError("Expected argument 'search' to be a str")
        pulumi.set(__self__, "search", search)
        if tag and not isinstance(tag, dict):
            raise TypeError("Expected argument 'tag' to be a dict")
        pulumi.set(__self__, "tag", tag)
        if tag_match and not isinstance(tag_match, str):
            raise TypeError("Expected argument 'tag_match' to be a str")
        pulumi.set(__self__, "tag_match", tag_match)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional['outputs.GetDnsRecordsCommentResult']:
        return pulumi.get(self, "comment")

    @_builtins.property
    @pulumi.getter
    def content(self) -> Optional['outputs.GetDnsRecordsContentResult']:
        return pulumi.get(self, "content")

    @_builtins.property
    @pulumi.getter
    def direction(self) -> _builtins.str:
        """
        Direction to order DNS records in.
        Available values: "asc", "desc".
        """
        return pulumi.get(self, "direction")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def match(self) -> _builtins.str:
        """
        Whether to match all search requirements or at least one (any). If set to `all`, acts like a logical AND between filters. If set to `any`, acts like a logical OR instead. Note that the interaction between tag filters is controlled by the `tag-match` parameter instead.
        Available values: "any", "all".
        """
        return pulumi.get(self, "match")

    @_builtins.property
    @pulumi.getter(name="maxItems")
    def max_items(self) -> Optional[_builtins.int]:
        """
        Max items to fetch, default: 1000
        """
        return pulumi.get(self, "max_items")

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional['outputs.GetDnsRecordsNameResult']:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def order(self) -> _builtins.str:
        """
        Field to order DNS records by.
        Available values: "type", "name", "content", "ttl", "proxied".
        """
        return pulumi.get(self, "order")

    @_builtins.property
    @pulumi.getter
    def proxied(self) -> _builtins.bool:
        """
        Whether the record is receiving the performance and security benefits of Cloudflare.
        """
        return pulumi.get(self, "proxied")

    @_builtins.property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetDnsRecordsResultResult']:
        """
        The items returned by the data source
        """
        return pulumi.get(self, "results")

    @_builtins.property
    @pulumi.getter
    def search(self) -> Optional[_builtins.str]:
        """
        Allows searching in multiple properties of a DNS record simultaneously. This parameter is intended for human users, not automation. Its exact behavior is intentionally left unspecified and is subject to change in the future. This parameter works independently of the `match` setting. For automated searches, please use the other available parameters.
        """
        return pulumi.get(self, "search")

    @_builtins.property
    @pulumi.getter
    def tag(self) -> Optional['outputs.GetDnsRecordsTagResult']:
        return pulumi.get(self, "tag")

    @_builtins.property
    @pulumi.getter(name="tagMatch")
    def tag_match(self) -> _builtins.str:
        """
        Whether to match all tag search requirements or at least one (any). If set to `all`, acts like a logical AND between tag filters. If set to `any`, acts like a logical OR instead. Note that the regular `match` parameter is still used to combine the resulting condition with other filters that aren't related to tags.
        Available values: "any", "all".
        """
        return pulumi.get(self, "tag_match")

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[_builtins.str]:
        """
        Record type.
        Available values: "A", "AAAA", "CAA", "CERT", "CNAME", "DNSKEY", "DS", "HTTPS", "LOC", "MX", "NAPTR", "NS", "OPENPGPKEY", "PTR", "SMIMEA", "SRV", "SSHFP", "SVCB", "TLSA", "TXT", "URI".
        """
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> _builtins.str:
        """
        Identifier.
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetDnsRecordsResult(GetDnsRecordsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDnsRecordsResult(
            comment=self.comment,
            content=self.content,
            direction=self.direction,
            id=self.id,
            match=self.match,
            max_items=self.max_items,
            name=self.name,
            order=self.order,
            proxied=self.proxied,
            results=self.results,
            search=self.search,
            tag=self.tag,
            tag_match=self.tag_match,
            type=self.type,
            zone_id=self.zone_id)


def get_dns_records(comment: Optional[Union['GetDnsRecordsCommentArgs', 'GetDnsRecordsCommentArgsDict']] = None,
                    content: Optional[Union['GetDnsRecordsContentArgs', 'GetDnsRecordsContentArgsDict']] = None,
                    direction: Optional[_builtins.str] = None,
                    match: Optional[_builtins.str] = None,
                    max_items: Optional[_builtins.int] = None,
                    name: Optional[Union['GetDnsRecordsNameArgs', 'GetDnsRecordsNameArgsDict']] = None,
                    order: Optional[_builtins.str] = None,
                    proxied: Optional[_builtins.bool] = None,
                    search: Optional[_builtins.str] = None,
                    tag: Optional[Union['GetDnsRecordsTagArgs', 'GetDnsRecordsTagArgsDict']] = None,
                    tag_match: Optional[_builtins.str] = None,
                    type: Optional[_builtins.str] = None,
                    zone_id: Optional[_builtins.str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDnsRecordsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_dns_records = cloudflare.get_dns_records(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        comment={
            "absent": "absent",
            "contains": "ello, worl",
            "endswith": "o, world",
            "exact": "Hello, world",
            "present": "present",
            "startswith": "Hello, w",
        },
        content={
            "contains": "7.0.0.",
            "endswith": ".0.1",
            "exact": "127.0.0.1",
            "startswith": "127.0.",
        },
        name={
            "contains": "w.example.",
            "endswith": ".example.com",
            "exact": "www.example.com",
            "startswith": "www.example",
        },
        search="www.cloudflare.com",
        tag={
            "absent": "important",
            "contains": "greeting:ello, worl",
            "endswith": "greeting:o, world",
            "exact": "greeting:Hello, world",
            "present": "important",
            "startswith": "greeting:Hello, w",
        },
        type="A")
    ```


    :param _builtins.str direction: Direction to order DNS records in.
           Available values: "asc", "desc".
    :param _builtins.str match: Whether to match all search requirements or at least one (any). If set to `all`, acts like a logical AND between filters. If set to `any`, acts like a logical OR instead. Note that the interaction between tag filters is controlled by the `tag-match` parameter instead.
           Available values: "any", "all".
    :param _builtins.int max_items: Max items to fetch, default: 1000
    :param _builtins.str order: Field to order DNS records by.
           Available values: "type", "name", "content", "ttl", "proxied".
    :param _builtins.bool proxied: Whether the record is receiving the performance and security benefits of Cloudflare.
    :param _builtins.str search: Allows searching in multiple properties of a DNS record simultaneously. This parameter is intended for human users, not automation. Its exact behavior is intentionally left unspecified and is subject to change in the future. This parameter works independently of the `match` setting. For automated searches, please use the other available parameters.
    :param _builtins.str tag_match: Whether to match all tag search requirements or at least one (any). If set to `all`, acts like a logical AND between tag filters. If set to `any`, acts like a logical OR instead. Note that the regular `match` parameter is still used to combine the resulting condition with other filters that aren't related to tags.
           Available values: "any", "all".
    :param _builtins.str type: Record type.
           Available values: "A", "AAAA", "CAA", "CERT", "CNAME", "DNSKEY", "DS", "HTTPS", "LOC", "MX", "NAPTR", "NS", "OPENPGPKEY", "PTR", "SMIMEA", "SRV", "SSHFP", "SVCB", "TLSA", "TXT", "URI".
    :param _builtins.str zone_id: Identifier.
    """
    __args__ = dict()
    __args__['comment'] = comment
    __args__['content'] = content
    __args__['direction'] = direction
    __args__['match'] = match
    __args__['maxItems'] = max_items
    __args__['name'] = name
    __args__['order'] = order
    __args__['proxied'] = proxied
    __args__['search'] = search
    __args__['tag'] = tag
    __args__['tagMatch'] = tag_match
    __args__['type'] = type
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getDnsRecords:getDnsRecords', __args__, opts=opts, typ=GetDnsRecordsResult).value

    return AwaitableGetDnsRecordsResult(
        comment=pulumi.get(__ret__, 'comment'),
        content=pulumi.get(__ret__, 'content'),
        direction=pulumi.get(__ret__, 'direction'),
        id=pulumi.get(__ret__, 'id'),
        match=pulumi.get(__ret__, 'match'),
        max_items=pulumi.get(__ret__, 'max_items'),
        name=pulumi.get(__ret__, 'name'),
        order=pulumi.get(__ret__, 'order'),
        proxied=pulumi.get(__ret__, 'proxied'),
        results=pulumi.get(__ret__, 'results'),
        search=pulumi.get(__ret__, 'search'),
        tag=pulumi.get(__ret__, 'tag'),
        tag_match=pulumi.get(__ret__, 'tag_match'),
        type=pulumi.get(__ret__, 'type'),
        zone_id=pulumi.get(__ret__, 'zone_id'))
def get_dns_records_output(comment: Optional[pulumi.Input[Optional[Union['GetDnsRecordsCommentArgs', 'GetDnsRecordsCommentArgsDict']]]] = None,
                           content: Optional[pulumi.Input[Optional[Union['GetDnsRecordsContentArgs', 'GetDnsRecordsContentArgsDict']]]] = None,
                           direction: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                           match: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                           max_items: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                           name: Optional[pulumi.Input[Optional[Union['GetDnsRecordsNameArgs', 'GetDnsRecordsNameArgsDict']]]] = None,
                           order: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                           proxied: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                           search: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                           tag: Optional[pulumi.Input[Optional[Union['GetDnsRecordsTagArgs', 'GetDnsRecordsTagArgsDict']]]] = None,
                           tag_match: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                           type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                           zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDnsRecordsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_dns_records = cloudflare.get_dns_records(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        comment={
            "absent": "absent",
            "contains": "ello, worl",
            "endswith": "o, world",
            "exact": "Hello, world",
            "present": "present",
            "startswith": "Hello, w",
        },
        content={
            "contains": "7.0.0.",
            "endswith": ".0.1",
            "exact": "127.0.0.1",
            "startswith": "127.0.",
        },
        name={
            "contains": "w.example.",
            "endswith": ".example.com",
            "exact": "www.example.com",
            "startswith": "www.example",
        },
        search="www.cloudflare.com",
        tag={
            "absent": "important",
            "contains": "greeting:ello, worl",
            "endswith": "greeting:o, world",
            "exact": "greeting:Hello, world",
            "present": "important",
            "startswith": "greeting:Hello, w",
        },
        type="A")
    ```


    :param _builtins.str direction: Direction to order DNS records in.
           Available values: "asc", "desc".
    :param _builtins.str match: Whether to match all search requirements or at least one (any). If set to `all`, acts like a logical AND between filters. If set to `any`, acts like a logical OR instead. Note that the interaction between tag filters is controlled by the `tag-match` parameter instead.
           Available values: "any", "all".
    :param _builtins.int max_items: Max items to fetch, default: 1000
    :param _builtins.str order: Field to order DNS records by.
           Available values: "type", "name", "content", "ttl", "proxied".
    :param _builtins.bool proxied: Whether the record is receiving the performance and security benefits of Cloudflare.
    :param _builtins.str search: Allows searching in multiple properties of a DNS record simultaneously. This parameter is intended for human users, not automation. Its exact behavior is intentionally left unspecified and is subject to change in the future. This parameter works independently of the `match` setting. For automated searches, please use the other available parameters.
    :param _builtins.str tag_match: Whether to match all tag search requirements or at least one (any). If set to `all`, acts like a logical AND between tag filters. If set to `any`, acts like a logical OR instead. Note that the regular `match` parameter is still used to combine the resulting condition with other filters that aren't related to tags.
           Available values: "any", "all".
    :param _builtins.str type: Record type.
           Available values: "A", "AAAA", "CAA", "CERT", "CNAME", "DNSKEY", "DS", "HTTPS", "LOC", "MX", "NAPTR", "NS", "OPENPGPKEY", "PTR", "SMIMEA", "SRV", "SSHFP", "SVCB", "TLSA", "TXT", "URI".
    :param _builtins.str zone_id: Identifier.
    """
    __args__ = dict()
    __args__['comment'] = comment
    __args__['content'] = content
    __args__['direction'] = direction
    __args__['match'] = match
    __args__['maxItems'] = max_items
    __args__['name'] = name
    __args__['order'] = order
    __args__['proxied'] = proxied
    __args__['search'] = search
    __args__['tag'] = tag
    __args__['tagMatch'] = tag_match
    __args__['type'] = type
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getDnsRecords:getDnsRecords', __args__, opts=opts, typ=GetDnsRecordsResult)
    return __ret__.apply(lambda __response__: GetDnsRecordsResult(
        comment=pulumi.get(__response__, 'comment'),
        content=pulumi.get(__response__, 'content'),
        direction=pulumi.get(__response__, 'direction'),
        id=pulumi.get(__response__, 'id'),
        match=pulumi.get(__response__, 'match'),
        max_items=pulumi.get(__response__, 'max_items'),
        name=pulumi.get(__response__, 'name'),
        order=pulumi.get(__response__, 'order'),
        proxied=pulumi.get(__response__, 'proxied'),
        results=pulumi.get(__response__, 'results'),
        search=pulumi.get(__response__, 'search'),
        tag=pulumi.get(__response__, 'tag'),
        tag_match=pulumi.get(__response__, 'tag_match'),
        type=pulumi.get(__response__, 'type'),
        zone_id=pulumi.get(__response__, 'zone_id')))
