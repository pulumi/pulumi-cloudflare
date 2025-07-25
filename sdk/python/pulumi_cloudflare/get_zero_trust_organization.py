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
    'GetZeroTrustOrganizationResult',
    'AwaitableGetZeroTrustOrganizationResult',
    'get_zero_trust_organization',
    'get_zero_trust_organization_output',
]

@pulumi.output_type
class GetZeroTrustOrganizationResult:
    """
    A collection of values returned by getZeroTrustOrganization.
    """
    def __init__(__self__, account_id=None, allow_authenticate_via_warp=None, auth_domain=None, auto_redirect_to_identity=None, created_at=None, custom_pages=None, id=None, is_ui_read_only=None, login_design=None, name=None, session_duration=None, ui_read_only_toggle_reason=None, updated_at=None, user_seat_expiration_inactive_time=None, warp_auth_session_duration=None, zone_id=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if allow_authenticate_via_warp and not isinstance(allow_authenticate_via_warp, bool):
            raise TypeError("Expected argument 'allow_authenticate_via_warp' to be a bool")
        pulumi.set(__self__, "allow_authenticate_via_warp", allow_authenticate_via_warp)
        if auth_domain and not isinstance(auth_domain, str):
            raise TypeError("Expected argument 'auth_domain' to be a str")
        pulumi.set(__self__, "auth_domain", auth_domain)
        if auto_redirect_to_identity and not isinstance(auto_redirect_to_identity, bool):
            raise TypeError("Expected argument 'auto_redirect_to_identity' to be a bool")
        pulumi.set(__self__, "auto_redirect_to_identity", auto_redirect_to_identity)
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if custom_pages and not isinstance(custom_pages, dict):
            raise TypeError("Expected argument 'custom_pages' to be a dict")
        pulumi.set(__self__, "custom_pages", custom_pages)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if is_ui_read_only and not isinstance(is_ui_read_only, bool):
            raise TypeError("Expected argument 'is_ui_read_only' to be a bool")
        pulumi.set(__self__, "is_ui_read_only", is_ui_read_only)
        if login_design and not isinstance(login_design, dict):
            raise TypeError("Expected argument 'login_design' to be a dict")
        pulumi.set(__self__, "login_design", login_design)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if session_duration and not isinstance(session_duration, str):
            raise TypeError("Expected argument 'session_duration' to be a str")
        pulumi.set(__self__, "session_duration", session_duration)
        if ui_read_only_toggle_reason and not isinstance(ui_read_only_toggle_reason, str):
            raise TypeError("Expected argument 'ui_read_only_toggle_reason' to be a str")
        pulumi.set(__self__, "ui_read_only_toggle_reason", ui_read_only_toggle_reason)
        if updated_at and not isinstance(updated_at, str):
            raise TypeError("Expected argument 'updated_at' to be a str")
        pulumi.set(__self__, "updated_at", updated_at)
        if user_seat_expiration_inactive_time and not isinstance(user_seat_expiration_inactive_time, str):
            raise TypeError("Expected argument 'user_seat_expiration_inactive_time' to be a str")
        pulumi.set(__self__, "user_seat_expiration_inactive_time", user_seat_expiration_inactive_time)
        if warp_auth_session_duration and not isinstance(warp_auth_session_duration, str):
            raise TypeError("Expected argument 'warp_auth_session_duration' to be a str")
        pulumi.set(__self__, "warp_auth_session_duration", warp_auth_session_duration)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[_builtins.str]:
        """
        The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="allowAuthenticateViaWarp")
    def allow_authenticate_via_warp(self) -> _builtins.bool:
        """
        When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
        """
        return pulumi.get(self, "allow_authenticate_via_warp")

    @_builtins.property
    @pulumi.getter(name="authDomain")
    def auth_domain(self) -> _builtins.str:
        """
        The unique subdomain assigned to your Zero Trust organization.
        """
        return pulumi.get(self, "auth_domain")

    @_builtins.property
    @pulumi.getter(name="autoRedirectToIdentity")
    def auto_redirect_to_identity(self) -> _builtins.bool:
        """
        When set to `true`, users skip the identity provider selection step during login.
        """
        return pulumi.get(self, "auto_redirect_to_identity")

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> _builtins.str:
        return pulumi.get(self, "created_at")

    @_builtins.property
    @pulumi.getter(name="customPages")
    def custom_pages(self) -> 'outputs.GetZeroTrustOrganizationCustomPagesResult':
        return pulumi.get(self, "custom_pages")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="isUiReadOnly")
    def is_ui_read_only(self) -> _builtins.bool:
        return pulumi.get(self, "is_ui_read_only")

    @_builtins.property
    @pulumi.getter(name="loginDesign")
    def login_design(self) -> 'outputs.GetZeroTrustOrganizationLoginDesignResult':
        return pulumi.get(self, "login_design")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The name of your Zero Trust organization.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="sessionDuration")
    def session_duration(self) -> _builtins.str:
        """
        The amount of time that tokens issued for applications will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
        """
        return pulumi.get(self, "session_duration")

    @_builtins.property
    @pulumi.getter(name="uiReadOnlyToggleReason")
    def ui_read_only_toggle_reason(self) -> _builtins.str:
        """
        A description of the reason why the UI read only field is being toggled.
        """
        return pulumi.get(self, "ui_read_only_toggle_reason")

    @_builtins.property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> _builtins.str:
        return pulumi.get(self, "updated_at")

    @_builtins.property
    @pulumi.getter(name="userSeatExpirationInactiveTime")
    def user_seat_expiration_inactive_time(self) -> _builtins.str:
        """
        The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count.  Minimum value for this setting is 1 month (730h). Must be in the format `300ms` or `2h45m`. Valid time units are: `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`.
        """
        return pulumi.get(self, "user_seat_expiration_inactive_time")

    @_builtins.property
    @pulumi.getter(name="warpAuthSessionDuration")
    def warp_auth_session_duration(self) -> _builtins.str:
        """
        The amount of time that tokens issued for applications will be valid. Must be in the format `30m` or `2h45m`. Valid time units are: m, h.
        """
        return pulumi.get(self, "warp_auth_session_duration")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[_builtins.str]:
        """
        The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetZeroTrustOrganizationResult(GetZeroTrustOrganizationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetZeroTrustOrganizationResult(
            account_id=self.account_id,
            allow_authenticate_via_warp=self.allow_authenticate_via_warp,
            auth_domain=self.auth_domain,
            auto_redirect_to_identity=self.auto_redirect_to_identity,
            created_at=self.created_at,
            custom_pages=self.custom_pages,
            id=self.id,
            is_ui_read_only=self.is_ui_read_only,
            login_design=self.login_design,
            name=self.name,
            session_duration=self.session_duration,
            ui_read_only_toggle_reason=self.ui_read_only_toggle_reason,
            updated_at=self.updated_at,
            user_seat_expiration_inactive_time=self.user_seat_expiration_inactive_time,
            warp_auth_session_duration=self.warp_auth_session_duration,
            zone_id=self.zone_id)


def get_zero_trust_organization(account_id: Optional[_builtins.str] = None,
                                zone_id: Optional[_builtins.str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetZeroTrustOrganizationResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_zero_trust_organization = cloudflare.get_zero_trust_organization(account_id="account_id",
        zone_id="zone_id")
    ```


    :param _builtins.str account_id: The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
    :param _builtins.str zone_id: The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getZeroTrustOrganization:getZeroTrustOrganization', __args__, opts=opts, typ=GetZeroTrustOrganizationResult).value

    return AwaitableGetZeroTrustOrganizationResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        allow_authenticate_via_warp=pulumi.get(__ret__, 'allow_authenticate_via_warp'),
        auth_domain=pulumi.get(__ret__, 'auth_domain'),
        auto_redirect_to_identity=pulumi.get(__ret__, 'auto_redirect_to_identity'),
        created_at=pulumi.get(__ret__, 'created_at'),
        custom_pages=pulumi.get(__ret__, 'custom_pages'),
        id=pulumi.get(__ret__, 'id'),
        is_ui_read_only=pulumi.get(__ret__, 'is_ui_read_only'),
        login_design=pulumi.get(__ret__, 'login_design'),
        name=pulumi.get(__ret__, 'name'),
        session_duration=pulumi.get(__ret__, 'session_duration'),
        ui_read_only_toggle_reason=pulumi.get(__ret__, 'ui_read_only_toggle_reason'),
        updated_at=pulumi.get(__ret__, 'updated_at'),
        user_seat_expiration_inactive_time=pulumi.get(__ret__, 'user_seat_expiration_inactive_time'),
        warp_auth_session_duration=pulumi.get(__ret__, 'warp_auth_session_duration'),
        zone_id=pulumi.get(__ret__, 'zone_id'))
def get_zero_trust_organization_output(account_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                       zone_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetZeroTrustOrganizationResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_zero_trust_organization = cloudflare.get_zero_trust_organization(account_id="account_id",
        zone_id="zone_id")
    ```


    :param _builtins.str account_id: The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
    :param _builtins.str zone_id: The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getZeroTrustOrganization:getZeroTrustOrganization', __args__, opts=opts, typ=GetZeroTrustOrganizationResult)
    return __ret__.apply(lambda __response__: GetZeroTrustOrganizationResult(
        account_id=pulumi.get(__response__, 'account_id'),
        allow_authenticate_via_warp=pulumi.get(__response__, 'allow_authenticate_via_warp'),
        auth_domain=pulumi.get(__response__, 'auth_domain'),
        auto_redirect_to_identity=pulumi.get(__response__, 'auto_redirect_to_identity'),
        created_at=pulumi.get(__response__, 'created_at'),
        custom_pages=pulumi.get(__response__, 'custom_pages'),
        id=pulumi.get(__response__, 'id'),
        is_ui_read_only=pulumi.get(__response__, 'is_ui_read_only'),
        login_design=pulumi.get(__response__, 'login_design'),
        name=pulumi.get(__response__, 'name'),
        session_duration=pulumi.get(__response__, 'session_duration'),
        ui_read_only_toggle_reason=pulumi.get(__response__, 'ui_read_only_toggle_reason'),
        updated_at=pulumi.get(__response__, 'updated_at'),
        user_seat_expiration_inactive_time=pulumi.get(__response__, 'user_seat_expiration_inactive_time'),
        warp_auth_session_duration=pulumi.get(__response__, 'warp_auth_session_duration'),
        zone_id=pulumi.get(__response__, 'zone_id')))
