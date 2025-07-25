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
    'GetPageShieldScriptsResult',
    'AwaitableGetPageShieldScriptsResult',
    'get_page_shield_scripts',
    'get_page_shield_scripts_output',
]

@pulumi.output_type
class GetPageShieldScriptsResult:
    """
    A collection of values returned by getPageShieldScripts.
    """
    def __init__(__self__, added_at=None, cryptomining_score=None, dataflow_score=None, domain_reported_malicious=None, fetched_at=None, first_page_url=None, first_seen_at=None, hash=None, host=None, id=None, js_integrity_score=None, last_seen_at=None, magecart_score=None, malicious_domain_categories=None, malicious_url_categories=None, malware_score=None, obfuscation_score=None, page_urls=None, script_id=None, url=None, url_contains_cdn_cgi_path=None, url_reported_malicious=None, versions=None, zone_id=None):
        if added_at and not isinstance(added_at, str):
            raise TypeError("Expected argument 'added_at' to be a str")
        pulumi.set(__self__, "added_at", added_at)
        if cryptomining_score and not isinstance(cryptomining_score, int):
            raise TypeError("Expected argument 'cryptomining_score' to be a int")
        pulumi.set(__self__, "cryptomining_score", cryptomining_score)
        if dataflow_score and not isinstance(dataflow_score, int):
            raise TypeError("Expected argument 'dataflow_score' to be a int")
        pulumi.set(__self__, "dataflow_score", dataflow_score)
        if domain_reported_malicious and not isinstance(domain_reported_malicious, bool):
            raise TypeError("Expected argument 'domain_reported_malicious' to be a bool")
        pulumi.set(__self__, "domain_reported_malicious", domain_reported_malicious)
        if fetched_at and not isinstance(fetched_at, str):
            raise TypeError("Expected argument 'fetched_at' to be a str")
        pulumi.set(__self__, "fetched_at", fetched_at)
        if first_page_url and not isinstance(first_page_url, str):
            raise TypeError("Expected argument 'first_page_url' to be a str")
        pulumi.set(__self__, "first_page_url", first_page_url)
        if first_seen_at and not isinstance(first_seen_at, str):
            raise TypeError("Expected argument 'first_seen_at' to be a str")
        pulumi.set(__self__, "first_seen_at", first_seen_at)
        if hash and not isinstance(hash, str):
            raise TypeError("Expected argument 'hash' to be a str")
        pulumi.set(__self__, "hash", hash)
        if host and not isinstance(host, str):
            raise TypeError("Expected argument 'host' to be a str")
        pulumi.set(__self__, "host", host)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if js_integrity_score and not isinstance(js_integrity_score, int):
            raise TypeError("Expected argument 'js_integrity_score' to be a int")
        pulumi.set(__self__, "js_integrity_score", js_integrity_score)
        if last_seen_at and not isinstance(last_seen_at, str):
            raise TypeError("Expected argument 'last_seen_at' to be a str")
        pulumi.set(__self__, "last_seen_at", last_seen_at)
        if magecart_score and not isinstance(magecart_score, int):
            raise TypeError("Expected argument 'magecart_score' to be a int")
        pulumi.set(__self__, "magecart_score", magecart_score)
        if malicious_domain_categories and not isinstance(malicious_domain_categories, list):
            raise TypeError("Expected argument 'malicious_domain_categories' to be a list")
        pulumi.set(__self__, "malicious_domain_categories", malicious_domain_categories)
        if malicious_url_categories and not isinstance(malicious_url_categories, list):
            raise TypeError("Expected argument 'malicious_url_categories' to be a list")
        pulumi.set(__self__, "malicious_url_categories", malicious_url_categories)
        if malware_score and not isinstance(malware_score, int):
            raise TypeError("Expected argument 'malware_score' to be a int")
        pulumi.set(__self__, "malware_score", malware_score)
        if obfuscation_score and not isinstance(obfuscation_score, int):
            raise TypeError("Expected argument 'obfuscation_score' to be a int")
        pulumi.set(__self__, "obfuscation_score", obfuscation_score)
        if page_urls and not isinstance(page_urls, list):
            raise TypeError("Expected argument 'page_urls' to be a list")
        pulumi.set(__self__, "page_urls", page_urls)
        if script_id and not isinstance(script_id, str):
            raise TypeError("Expected argument 'script_id' to be a str")
        pulumi.set(__self__, "script_id", script_id)
        if url and not isinstance(url, str):
            raise TypeError("Expected argument 'url' to be a str")
        pulumi.set(__self__, "url", url)
        if url_contains_cdn_cgi_path and not isinstance(url_contains_cdn_cgi_path, bool):
            raise TypeError("Expected argument 'url_contains_cdn_cgi_path' to be a bool")
        pulumi.set(__self__, "url_contains_cdn_cgi_path", url_contains_cdn_cgi_path)
        if url_reported_malicious and not isinstance(url_reported_malicious, bool):
            raise TypeError("Expected argument 'url_reported_malicious' to be a bool")
        pulumi.set(__self__, "url_reported_malicious", url_reported_malicious)
        if versions and not isinstance(versions, list):
            raise TypeError("Expected argument 'versions' to be a list")
        pulumi.set(__self__, "versions", versions)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter(name="addedAt")
    def added_at(self) -> _builtins.str:
        return pulumi.get(self, "added_at")

    @_builtins.property
    @pulumi.getter(name="cryptominingScore")
    def cryptomining_score(self) -> _builtins.int:
        """
        The cryptomining score of the JavaScript content.
        """
        return pulumi.get(self, "cryptomining_score")

    @_builtins.property
    @pulumi.getter(name="dataflowScore")
    def dataflow_score(self) -> _builtins.int:
        """
        The dataflow score of the JavaScript content.
        """
        return pulumi.get(self, "dataflow_score")

    @_builtins.property
    @pulumi.getter(name="domainReportedMalicious")
    def domain_reported_malicious(self) -> _builtins.bool:
        return pulumi.get(self, "domain_reported_malicious")

    @_builtins.property
    @pulumi.getter(name="fetchedAt")
    def fetched_at(self) -> _builtins.str:
        """
        The timestamp of when the script was last fetched.
        """
        return pulumi.get(self, "fetched_at")

    @_builtins.property
    @pulumi.getter(name="firstPageUrl")
    def first_page_url(self) -> _builtins.str:
        return pulumi.get(self, "first_page_url")

    @_builtins.property
    @pulumi.getter(name="firstSeenAt")
    def first_seen_at(self) -> _builtins.str:
        return pulumi.get(self, "first_seen_at")

    @_builtins.property
    @pulumi.getter
    def hash(self) -> _builtins.str:
        """
        The computed hash of the analyzed script.
        """
        return pulumi.get(self, "hash")

    @_builtins.property
    @pulumi.getter
    def host(self) -> _builtins.str:
        return pulumi.get(self, "host")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        Identifier
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="jsIntegrityScore")
    def js_integrity_score(self) -> _builtins.int:
        """
        The integrity score of the JavaScript content.
        """
        return pulumi.get(self, "js_integrity_score")

    @_builtins.property
    @pulumi.getter(name="lastSeenAt")
    def last_seen_at(self) -> _builtins.str:
        return pulumi.get(self, "last_seen_at")

    @_builtins.property
    @pulumi.getter(name="magecartScore")
    def magecart_score(self) -> _builtins.int:
        """
        The magecart score of the JavaScript content.
        """
        return pulumi.get(self, "magecart_score")

    @_builtins.property
    @pulumi.getter(name="maliciousDomainCategories")
    def malicious_domain_categories(self) -> Sequence[_builtins.str]:
        return pulumi.get(self, "malicious_domain_categories")

    @_builtins.property
    @pulumi.getter(name="maliciousUrlCategories")
    def malicious_url_categories(self) -> Sequence[_builtins.str]:
        return pulumi.get(self, "malicious_url_categories")

    @_builtins.property
    @pulumi.getter(name="malwareScore")
    def malware_score(self) -> _builtins.int:
        """
        The malware score of the JavaScript content.
        """
        return pulumi.get(self, "malware_score")

    @_builtins.property
    @pulumi.getter(name="obfuscationScore")
    def obfuscation_score(self) -> _builtins.int:
        """
        The obfuscation score of the JavaScript content.
        """
        return pulumi.get(self, "obfuscation_score")

    @_builtins.property
    @pulumi.getter(name="pageUrls")
    def page_urls(self) -> Sequence[_builtins.str]:
        return pulumi.get(self, "page_urls")

    @_builtins.property
    @pulumi.getter(name="scriptId")
    def script_id(self) -> _builtins.str:
        """
        Identifier
        """
        return pulumi.get(self, "script_id")

    @_builtins.property
    @pulumi.getter
    def url(self) -> _builtins.str:
        return pulumi.get(self, "url")

    @_builtins.property
    @pulumi.getter(name="urlContainsCdnCgiPath")
    def url_contains_cdn_cgi_path(self) -> _builtins.bool:
        return pulumi.get(self, "url_contains_cdn_cgi_path")

    @_builtins.property
    @pulumi.getter(name="urlReportedMalicious")
    def url_reported_malicious(self) -> _builtins.bool:
        return pulumi.get(self, "url_reported_malicious")

    @_builtins.property
    @pulumi.getter
    def versions(self) -> Sequence['outputs.GetPageShieldScriptsVersionResult']:
        return pulumi.get(self, "versions")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> _builtins.str:
        """
        Identifier
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetPageShieldScriptsResult(GetPageShieldScriptsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPageShieldScriptsResult(
            added_at=self.added_at,
            cryptomining_score=self.cryptomining_score,
            dataflow_score=self.dataflow_score,
            domain_reported_malicious=self.domain_reported_malicious,
            fetched_at=self.fetched_at,
            first_page_url=self.first_page_url,
            first_seen_at=self.first_seen_at,
            hash=self.hash,
            host=self.host,
            id=self.id,
            js_integrity_score=self.js_integrity_score,
            last_seen_at=self.last_seen_at,
            magecart_score=self.magecart_score,
            malicious_domain_categories=self.malicious_domain_categories,
            malicious_url_categories=self.malicious_url_categories,
            malware_score=self.malware_score,
            obfuscation_score=self.obfuscation_score,
            page_urls=self.page_urls,
            script_id=self.script_id,
            url=self.url,
            url_contains_cdn_cgi_path=self.url_contains_cdn_cgi_path,
            url_reported_malicious=self.url_reported_malicious,
            versions=self.versions,
            zone_id=self.zone_id)


def get_page_shield_scripts(script_id: Optional[_builtins.str] = None,
                            zone_id: Optional[_builtins.str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPageShieldScriptsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_page_shield_scripts = cloudflare.get_page_shield_scripts(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        script_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str script_id: Identifier
    :param _builtins.str zone_id: Identifier
    """
    __args__ = dict()
    __args__['scriptId'] = script_id
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getPageShieldScripts:getPageShieldScripts', __args__, opts=opts, typ=GetPageShieldScriptsResult).value

    return AwaitableGetPageShieldScriptsResult(
        added_at=pulumi.get(__ret__, 'added_at'),
        cryptomining_score=pulumi.get(__ret__, 'cryptomining_score'),
        dataflow_score=pulumi.get(__ret__, 'dataflow_score'),
        domain_reported_malicious=pulumi.get(__ret__, 'domain_reported_malicious'),
        fetched_at=pulumi.get(__ret__, 'fetched_at'),
        first_page_url=pulumi.get(__ret__, 'first_page_url'),
        first_seen_at=pulumi.get(__ret__, 'first_seen_at'),
        hash=pulumi.get(__ret__, 'hash'),
        host=pulumi.get(__ret__, 'host'),
        id=pulumi.get(__ret__, 'id'),
        js_integrity_score=pulumi.get(__ret__, 'js_integrity_score'),
        last_seen_at=pulumi.get(__ret__, 'last_seen_at'),
        magecart_score=pulumi.get(__ret__, 'magecart_score'),
        malicious_domain_categories=pulumi.get(__ret__, 'malicious_domain_categories'),
        malicious_url_categories=pulumi.get(__ret__, 'malicious_url_categories'),
        malware_score=pulumi.get(__ret__, 'malware_score'),
        obfuscation_score=pulumi.get(__ret__, 'obfuscation_score'),
        page_urls=pulumi.get(__ret__, 'page_urls'),
        script_id=pulumi.get(__ret__, 'script_id'),
        url=pulumi.get(__ret__, 'url'),
        url_contains_cdn_cgi_path=pulumi.get(__ret__, 'url_contains_cdn_cgi_path'),
        url_reported_malicious=pulumi.get(__ret__, 'url_reported_malicious'),
        versions=pulumi.get(__ret__, 'versions'),
        zone_id=pulumi.get(__ret__, 'zone_id'))
def get_page_shield_scripts_output(script_id: Optional[pulumi.Input[_builtins.str]] = None,
                                   zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetPageShieldScriptsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_page_shield_scripts = cloudflare.get_page_shield_scripts(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        script_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str script_id: Identifier
    :param _builtins.str zone_id: Identifier
    """
    __args__ = dict()
    __args__['scriptId'] = script_id
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getPageShieldScripts:getPageShieldScripts', __args__, opts=opts, typ=GetPageShieldScriptsResult)
    return __ret__.apply(lambda __response__: GetPageShieldScriptsResult(
        added_at=pulumi.get(__response__, 'added_at'),
        cryptomining_score=pulumi.get(__response__, 'cryptomining_score'),
        dataflow_score=pulumi.get(__response__, 'dataflow_score'),
        domain_reported_malicious=pulumi.get(__response__, 'domain_reported_malicious'),
        fetched_at=pulumi.get(__response__, 'fetched_at'),
        first_page_url=pulumi.get(__response__, 'first_page_url'),
        first_seen_at=pulumi.get(__response__, 'first_seen_at'),
        hash=pulumi.get(__response__, 'hash'),
        host=pulumi.get(__response__, 'host'),
        id=pulumi.get(__response__, 'id'),
        js_integrity_score=pulumi.get(__response__, 'js_integrity_score'),
        last_seen_at=pulumi.get(__response__, 'last_seen_at'),
        magecart_score=pulumi.get(__response__, 'magecart_score'),
        malicious_domain_categories=pulumi.get(__response__, 'malicious_domain_categories'),
        malicious_url_categories=pulumi.get(__response__, 'malicious_url_categories'),
        malware_score=pulumi.get(__response__, 'malware_score'),
        obfuscation_score=pulumi.get(__response__, 'obfuscation_score'),
        page_urls=pulumi.get(__response__, 'page_urls'),
        script_id=pulumi.get(__response__, 'script_id'),
        url=pulumi.get(__response__, 'url'),
        url_contains_cdn_cgi_path=pulumi.get(__response__, 'url_contains_cdn_cgi_path'),
        url_reported_malicious=pulumi.get(__response__, 'url_reported_malicious'),
        versions=pulumi.get(__response__, 'versions'),
        zone_id=pulumi.get(__response__, 'zone_id')))
