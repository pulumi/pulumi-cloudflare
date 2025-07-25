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
    'GetBotManagementResult',
    'AwaitableGetBotManagementResult',
    'get_bot_management',
    'get_bot_management_output',
]

@pulumi.output_type
class GetBotManagementResult:
    """
    A collection of values returned by getBotManagement.
    """
    def __init__(__self__, ai_bots_protection=None, auto_update_model=None, crawler_protection=None, enable_js=None, fight_mode=None, id=None, optimize_wordpress=None, sbfm_definitely_automated=None, sbfm_likely_automated=None, sbfm_static_resource_protection=None, sbfm_verified_bots=None, stale_zone_configuration=None, suppress_session_score=None, using_latest_model=None, zone_id=None):
        if ai_bots_protection and not isinstance(ai_bots_protection, str):
            raise TypeError("Expected argument 'ai_bots_protection' to be a str")
        pulumi.set(__self__, "ai_bots_protection", ai_bots_protection)
        if auto_update_model and not isinstance(auto_update_model, bool):
            raise TypeError("Expected argument 'auto_update_model' to be a bool")
        pulumi.set(__self__, "auto_update_model", auto_update_model)
        if crawler_protection and not isinstance(crawler_protection, str):
            raise TypeError("Expected argument 'crawler_protection' to be a str")
        pulumi.set(__self__, "crawler_protection", crawler_protection)
        if enable_js and not isinstance(enable_js, bool):
            raise TypeError("Expected argument 'enable_js' to be a bool")
        pulumi.set(__self__, "enable_js", enable_js)
        if fight_mode and not isinstance(fight_mode, bool):
            raise TypeError("Expected argument 'fight_mode' to be a bool")
        pulumi.set(__self__, "fight_mode", fight_mode)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if optimize_wordpress and not isinstance(optimize_wordpress, bool):
            raise TypeError("Expected argument 'optimize_wordpress' to be a bool")
        pulumi.set(__self__, "optimize_wordpress", optimize_wordpress)
        if sbfm_definitely_automated and not isinstance(sbfm_definitely_automated, str):
            raise TypeError("Expected argument 'sbfm_definitely_automated' to be a str")
        pulumi.set(__self__, "sbfm_definitely_automated", sbfm_definitely_automated)
        if sbfm_likely_automated and not isinstance(sbfm_likely_automated, str):
            raise TypeError("Expected argument 'sbfm_likely_automated' to be a str")
        pulumi.set(__self__, "sbfm_likely_automated", sbfm_likely_automated)
        if sbfm_static_resource_protection and not isinstance(sbfm_static_resource_protection, bool):
            raise TypeError("Expected argument 'sbfm_static_resource_protection' to be a bool")
        pulumi.set(__self__, "sbfm_static_resource_protection", sbfm_static_resource_protection)
        if sbfm_verified_bots and not isinstance(sbfm_verified_bots, str):
            raise TypeError("Expected argument 'sbfm_verified_bots' to be a str")
        pulumi.set(__self__, "sbfm_verified_bots", sbfm_verified_bots)
        if stale_zone_configuration and not isinstance(stale_zone_configuration, dict):
            raise TypeError("Expected argument 'stale_zone_configuration' to be a dict")
        pulumi.set(__self__, "stale_zone_configuration", stale_zone_configuration)
        if suppress_session_score and not isinstance(suppress_session_score, bool):
            raise TypeError("Expected argument 'suppress_session_score' to be a bool")
        pulumi.set(__self__, "suppress_session_score", suppress_session_score)
        if using_latest_model and not isinstance(using_latest_model, bool):
            raise TypeError("Expected argument 'using_latest_model' to be a bool")
        pulumi.set(__self__, "using_latest_model", using_latest_model)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter(name="aiBotsProtection")
    def ai_bots_protection(self) -> _builtins.str:
        """
        Enable rule to block AI Scrapers and Crawlers.
        Available values: "block", "disabled".
        """
        return pulumi.get(self, "ai_bots_protection")

    @_builtins.property
    @pulumi.getter(name="autoUpdateModel")
    def auto_update_model(self) -> _builtins.bool:
        """
        Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes)
        """
        return pulumi.get(self, "auto_update_model")

    @_builtins.property
    @pulumi.getter(name="crawlerProtection")
    def crawler_protection(self) -> _builtins.str:
        """
        Enable rule to punish AI Scrapers and Crawlers via a link maze.
        Available values: "enabled", "disabled".
        """
        return pulumi.get(self, "crawler_protection")

    @_builtins.property
    @pulumi.getter(name="enableJs")
    def enable_js(self) -> _builtins.bool:
        """
        Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
        """
        return pulumi.get(self, "enable_js")

    @_builtins.property
    @pulumi.getter(name="fightMode")
    def fight_mode(self) -> _builtins.bool:
        """
        Whether to enable Bot Fight Mode.
        """
        return pulumi.get(self, "fight_mode")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="optimizeWordpress")
    def optimize_wordpress(self) -> _builtins.bool:
        """
        Whether to optimize Super Bot Fight Mode protections for Wordpress.
        """
        return pulumi.get(self, "optimize_wordpress")

    @_builtins.property
    @pulumi.getter(name="sbfmDefinitelyAutomated")
    def sbfm_definitely_automated(self) -> _builtins.str:
        """
        Super Bot Fight Mode (SBFM) action to take on definitely automated requests.
        Available values: "allow", "block", "managed_challenge".
        """
        return pulumi.get(self, "sbfm_definitely_automated")

    @_builtins.property
    @pulumi.getter(name="sbfmLikelyAutomated")
    def sbfm_likely_automated(self) -> _builtins.str:
        """
        Super Bot Fight Mode (SBFM) action to take on likely automated requests.
        Available values: "allow", "block", "managed_challenge".
        """
        return pulumi.get(self, "sbfm_likely_automated")

    @_builtins.property
    @pulumi.getter(name="sbfmStaticResourceProtection")
    def sbfm_static_resource_protection(self) -> _builtins.bool:
        """
        Super Bot Fight Mode (SBFM) to enable static resource protection.
        Enable if static resources on your application need bot protection.
        Note: Static resource protection can also result in legitimate traffic being blocked.
        """
        return pulumi.get(self, "sbfm_static_resource_protection")

    @_builtins.property
    @pulumi.getter(name="sbfmVerifiedBots")
    def sbfm_verified_bots(self) -> _builtins.str:
        """
        Super Bot Fight Mode (SBFM) action to take on verified bots requests.
        Available values: "allow", "block".
        """
        return pulumi.get(self, "sbfm_verified_bots")

    @_builtins.property
    @pulumi.getter(name="staleZoneConfiguration")
    def stale_zone_configuration(self) -> 'outputs.GetBotManagementStaleZoneConfigurationResult':
        """
        A read-only field that shows which unauthorized settings are currently active on the zone. These settings typically result from upgrades or downgrades.
        """
        return pulumi.get(self, "stale_zone_configuration")

    @_builtins.property
    @pulumi.getter(name="suppressSessionScore")
    def suppress_session_score(self) -> _builtins.bool:
        """
        Whether to disable tracking the highest bot score for a session in the Bot Management cookie.
        """
        return pulumi.get(self, "suppress_session_score")

    @_builtins.property
    @pulumi.getter(name="usingLatestModel")
    def using_latest_model(self) -> _builtins.bool:
        """
        A read-only field that indicates whether the zone currently is running the latest ML model.
        """
        return pulumi.get(self, "using_latest_model")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> _builtins.str:
        """
        Identifier.
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetBotManagementResult(GetBotManagementResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBotManagementResult(
            ai_bots_protection=self.ai_bots_protection,
            auto_update_model=self.auto_update_model,
            crawler_protection=self.crawler_protection,
            enable_js=self.enable_js,
            fight_mode=self.fight_mode,
            id=self.id,
            optimize_wordpress=self.optimize_wordpress,
            sbfm_definitely_automated=self.sbfm_definitely_automated,
            sbfm_likely_automated=self.sbfm_likely_automated,
            sbfm_static_resource_protection=self.sbfm_static_resource_protection,
            sbfm_verified_bots=self.sbfm_verified_bots,
            stale_zone_configuration=self.stale_zone_configuration,
            suppress_session_score=self.suppress_session_score,
            using_latest_model=self.using_latest_model,
            zone_id=self.zone_id)


def get_bot_management(zone_id: Optional[_builtins.str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBotManagementResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_bot_management = cloudflare.get_bot_management(zone_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str zone_id: Identifier.
    """
    __args__ = dict()
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getBotManagement:getBotManagement', __args__, opts=opts, typ=GetBotManagementResult).value

    return AwaitableGetBotManagementResult(
        ai_bots_protection=pulumi.get(__ret__, 'ai_bots_protection'),
        auto_update_model=pulumi.get(__ret__, 'auto_update_model'),
        crawler_protection=pulumi.get(__ret__, 'crawler_protection'),
        enable_js=pulumi.get(__ret__, 'enable_js'),
        fight_mode=pulumi.get(__ret__, 'fight_mode'),
        id=pulumi.get(__ret__, 'id'),
        optimize_wordpress=pulumi.get(__ret__, 'optimize_wordpress'),
        sbfm_definitely_automated=pulumi.get(__ret__, 'sbfm_definitely_automated'),
        sbfm_likely_automated=pulumi.get(__ret__, 'sbfm_likely_automated'),
        sbfm_static_resource_protection=pulumi.get(__ret__, 'sbfm_static_resource_protection'),
        sbfm_verified_bots=pulumi.get(__ret__, 'sbfm_verified_bots'),
        stale_zone_configuration=pulumi.get(__ret__, 'stale_zone_configuration'),
        suppress_session_score=pulumi.get(__ret__, 'suppress_session_score'),
        using_latest_model=pulumi.get(__ret__, 'using_latest_model'),
        zone_id=pulumi.get(__ret__, 'zone_id'))
def get_bot_management_output(zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetBotManagementResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_bot_management = cloudflare.get_bot_management(zone_id="023e105f4ecef8ad9ca31a8372d0c353")
    ```


    :param _builtins.str zone_id: Identifier.
    """
    __args__ = dict()
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getBotManagement:getBotManagement', __args__, opts=opts, typ=GetBotManagementResult)
    return __ret__.apply(lambda __response__: GetBotManagementResult(
        ai_bots_protection=pulumi.get(__response__, 'ai_bots_protection'),
        auto_update_model=pulumi.get(__response__, 'auto_update_model'),
        crawler_protection=pulumi.get(__response__, 'crawler_protection'),
        enable_js=pulumi.get(__response__, 'enable_js'),
        fight_mode=pulumi.get(__response__, 'fight_mode'),
        id=pulumi.get(__response__, 'id'),
        optimize_wordpress=pulumi.get(__response__, 'optimize_wordpress'),
        sbfm_definitely_automated=pulumi.get(__response__, 'sbfm_definitely_automated'),
        sbfm_likely_automated=pulumi.get(__response__, 'sbfm_likely_automated'),
        sbfm_static_resource_protection=pulumi.get(__response__, 'sbfm_static_resource_protection'),
        sbfm_verified_bots=pulumi.get(__response__, 'sbfm_verified_bots'),
        stale_zone_configuration=pulumi.get(__response__, 'stale_zone_configuration'),
        suppress_session_score=pulumi.get(__response__, 'suppress_session_score'),
        using_latest_model=pulumi.get(__response__, 'using_latest_model'),
        zone_id=pulumi.get(__response__, 'zone_id')))
