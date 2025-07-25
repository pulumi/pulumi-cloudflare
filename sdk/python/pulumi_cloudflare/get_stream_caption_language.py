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
    'GetStreamCaptionLanguageResult',
    'AwaitableGetStreamCaptionLanguageResult',
    'get_stream_caption_language',
    'get_stream_caption_language_output',
]

@pulumi.output_type
class GetStreamCaptionLanguageResult:
    """
    A collection of values returned by getStreamCaptionLanguage.
    """
    def __init__(__self__, account_id=None, generated=None, id=None, identifier=None, label=None, language=None, status=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if generated and not isinstance(generated, bool):
            raise TypeError("Expected argument 'generated' to be a bool")
        pulumi.set(__self__, "generated", generated)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        pulumi.set(__self__, "label", label)
        if language and not isinstance(language, str):
            raise TypeError("Expected argument 'language' to be a str")
        pulumi.set(__self__, "language", language)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> _builtins.str:
        """
        Identifier.
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter
    def generated(self) -> _builtins.bool:
        """
        Whether the caption was generated via AI.
        """
        return pulumi.get(self, "generated")

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
        The language label displayed in the native language to users.
        """
        return pulumi.get(self, "label")

    @_builtins.property
    @pulumi.getter
    def language(self) -> _builtins.str:
        """
        The language tag in BCP 47 format.
        """
        return pulumi.get(self, "language")

    @_builtins.property
    @pulumi.getter
    def status(self) -> _builtins.str:
        """
        The status of a generated caption.
        Available values: "ready", "inprogress", "error".
        """
        return pulumi.get(self, "status")


class AwaitableGetStreamCaptionLanguageResult(GetStreamCaptionLanguageResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStreamCaptionLanguageResult(
            account_id=self.account_id,
            generated=self.generated,
            id=self.id,
            identifier=self.identifier,
            label=self.label,
            language=self.language,
            status=self.status)


def get_stream_caption_language(account_id: Optional[_builtins.str] = None,
                                identifier: Optional[_builtins.str] = None,
                                language: Optional[_builtins.str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStreamCaptionLanguageResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_stream_caption_language = cloudflare.get_stream_caption_language(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        identifier="ea95132c15732412d22c1476fa83f27a",
        language="tr")
    ```


    :param _builtins.str account_id: Identifier.
    :param _builtins.str identifier: A Cloudflare-generated unique identifier for a media item.
    :param _builtins.str language: The language tag in BCP 47 format.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['identifier'] = identifier
    __args__['language'] = language
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getStreamCaptionLanguage:getStreamCaptionLanguage', __args__, opts=opts, typ=GetStreamCaptionLanguageResult).value

    return AwaitableGetStreamCaptionLanguageResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        generated=pulumi.get(__ret__, 'generated'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        label=pulumi.get(__ret__, 'label'),
        language=pulumi.get(__ret__, 'language'),
        status=pulumi.get(__ret__, 'status'))
def get_stream_caption_language_output(account_id: Optional[pulumi.Input[_builtins.str]] = None,
                                       identifier: Optional[pulumi.Input[_builtins.str]] = None,
                                       language: Optional[pulumi.Input[_builtins.str]] = None,
                                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetStreamCaptionLanguageResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_stream_caption_language = cloudflare.get_stream_caption_language(account_id="023e105f4ecef8ad9ca31a8372d0c353",
        identifier="ea95132c15732412d22c1476fa83f27a",
        language="tr")
    ```


    :param _builtins.str account_id: Identifier.
    :param _builtins.str identifier: A Cloudflare-generated unique identifier for a media item.
    :param _builtins.str language: The language tag in BCP 47 format.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['identifier'] = identifier
    __args__['language'] = language
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getStreamCaptionLanguage:getStreamCaptionLanguage', __args__, opts=opts, typ=GetStreamCaptionLanguageResult)
    return __ret__.apply(lambda __response__: GetStreamCaptionLanguageResult(
        account_id=pulumi.get(__response__, 'account_id'),
        generated=pulumi.get(__response__, 'generated'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        label=pulumi.get(__response__, 'label'),
        language=pulumi.get(__response__, 'language'),
        status=pulumi.get(__response__, 'status')))
