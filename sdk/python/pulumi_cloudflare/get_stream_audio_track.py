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

__all__ = [
    'GetStreamAudioTrackResult',
    'AwaitableGetStreamAudioTrackResult',
    'get_stream_audio_track',
    'get_stream_audio_track_output',
]

@pulumi.output_type
class GetStreamAudioTrackResult:
    """
    A collection of values returned by getStreamAudioTrack.
    """
    def __init__(__self__, account_id=None, default=None, id=None, identifier=None, label=None, status=None, uid=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if default and not isinstance(default, bool):
            raise TypeError("Expected argument 'default' to be a bool")
        pulumi.set(__self__, "default", default)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        pulumi.set(__self__, "label", label)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if uid and not isinstance(uid, str):
            raise TypeError("Expected argument 'uid' to be a str")
        pulumi.set(__self__, "uid", uid)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> _builtins.str:
        """
        The account identifier tag.
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter
    def default(self) -> _builtins.bool:
        """
        Denotes whether the audio track will be played by default in a player.
        """
        return pulumi.get(self, "default")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def identifier(self) -> _builtins.str:
        """
        A Cloudflare-generated unique identifier for a media item.
        """
        return pulumi.get(self, "identifier")

    @_builtins.property
    @pulumi.getter
    def label(self) -> _builtins.str:
        """
        A string to uniquely identify the track amongst other audio track labels for the specified video.
        """
        return pulumi.get(self, "label")

    @_builtins.property
    @pulumi.getter
    def status(self) -> _builtins.str:
        """
        Specifies the processing status of the video.
        Available values: "queued", "ready", "error".
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter
    def uid(self) -> _builtins.str:
        """
        A Cloudflare-generated unique identifier for a media item.
        """
        return pulumi.get(self, "uid")


class AwaitableGetStreamAudioTrackResult(GetStreamAudioTrackResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStreamAudioTrackResult(
            account_id=self.account_id,
            default=self.default,
            id=self.id,
            identifier=self.identifier,
            label=self.label,
            status=self.status,
            uid=self.uid)


def get_stream_audio_track(account_id: Optional[_builtins.str] = None,
                           identifier: Optional[_builtins.str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStreamAudioTrackResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_stream_audio_track = cloudflare.get_stream_audio_track(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        identifier="ea95132c15732412d22c1476fa83f27a")
    ```


    :param _builtins.str account_id: The account identifier tag.
    :param _builtins.str identifier: A Cloudflare-generated unique identifier for a media item.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['identifier'] = identifier
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getStreamAudioTrack:getStreamAudioTrack', __args__, opts=opts, typ=GetStreamAudioTrackResult).value

    return AwaitableGetStreamAudioTrackResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        default=pulumi.get(__ret__, 'default'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        label=pulumi.get(__ret__, 'label'),
        status=pulumi.get(__ret__, 'status'),
        uid=pulumi.get(__ret__, 'uid'))
def get_stream_audio_track_output(account_id: Optional[pulumi.Input[_builtins.str]] = None,
                                  identifier: Optional[pulumi.Input[_builtins.str]] = None,
                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetStreamAudioTrackResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_stream_audio_track = cloudflare.get_stream_audio_track(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        identifier="ea95132c15732412d22c1476fa83f27a")
    ```


    :param _builtins.str account_id: The account identifier tag.
    :param _builtins.str identifier: A Cloudflare-generated unique identifier for a media item.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['identifier'] = identifier
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getStreamAudioTrack:getStreamAudioTrack', __args__, opts=opts, typ=GetStreamAudioTrackResult)
    return __ret__.apply(lambda __response__: GetStreamAudioTrackResult(
        account_id=pulumi.get(__response__, 'account_id'),
        default=pulumi.get(__response__, 'default'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        label=pulumi.get(__response__, 'label'),
        status=pulumi.get(__response__, 'status'),
        uid=pulumi.get(__response__, 'uid')))
