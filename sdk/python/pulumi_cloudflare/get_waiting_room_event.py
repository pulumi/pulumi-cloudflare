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
    'GetWaitingRoomEventResult',
    'AwaitableGetWaitingRoomEventResult',
    'get_waiting_room_event',
    'get_waiting_room_event_output',
]

@pulumi.output_type
class GetWaitingRoomEventResult:
    """
    A collection of values returned by getWaitingRoomEvent.
    """
    def __init__(__self__, created_on=None, custom_page_html=None, description=None, disable_session_renewal=None, event_end_time=None, event_id=None, event_start_time=None, id=None, modified_on=None, name=None, new_users_per_minute=None, prequeue_start_time=None, queueing_method=None, session_duration=None, shuffle_at_event_start=None, suspended=None, total_active_users=None, turnstile_action=None, turnstile_mode=None, waiting_room_id=None, zone_id=None):
        if created_on and not isinstance(created_on, str):
            raise TypeError("Expected argument 'created_on' to be a str")
        pulumi.set(__self__, "created_on", created_on)
        if custom_page_html and not isinstance(custom_page_html, str):
            raise TypeError("Expected argument 'custom_page_html' to be a str")
        pulumi.set(__self__, "custom_page_html", custom_page_html)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if disable_session_renewal and not isinstance(disable_session_renewal, bool):
            raise TypeError("Expected argument 'disable_session_renewal' to be a bool")
        pulumi.set(__self__, "disable_session_renewal", disable_session_renewal)
        if event_end_time and not isinstance(event_end_time, str):
            raise TypeError("Expected argument 'event_end_time' to be a str")
        pulumi.set(__self__, "event_end_time", event_end_time)
        if event_id and not isinstance(event_id, str):
            raise TypeError("Expected argument 'event_id' to be a str")
        pulumi.set(__self__, "event_id", event_id)
        if event_start_time and not isinstance(event_start_time, str):
            raise TypeError("Expected argument 'event_start_time' to be a str")
        pulumi.set(__self__, "event_start_time", event_start_time)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if modified_on and not isinstance(modified_on, str):
            raise TypeError("Expected argument 'modified_on' to be a str")
        pulumi.set(__self__, "modified_on", modified_on)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if new_users_per_minute and not isinstance(new_users_per_minute, int):
            raise TypeError("Expected argument 'new_users_per_minute' to be a int")
        pulumi.set(__self__, "new_users_per_minute", new_users_per_minute)
        if prequeue_start_time and not isinstance(prequeue_start_time, str):
            raise TypeError("Expected argument 'prequeue_start_time' to be a str")
        pulumi.set(__self__, "prequeue_start_time", prequeue_start_time)
        if queueing_method and not isinstance(queueing_method, str):
            raise TypeError("Expected argument 'queueing_method' to be a str")
        pulumi.set(__self__, "queueing_method", queueing_method)
        if session_duration and not isinstance(session_duration, int):
            raise TypeError("Expected argument 'session_duration' to be a int")
        pulumi.set(__self__, "session_duration", session_duration)
        if shuffle_at_event_start and not isinstance(shuffle_at_event_start, bool):
            raise TypeError("Expected argument 'shuffle_at_event_start' to be a bool")
        pulumi.set(__self__, "shuffle_at_event_start", shuffle_at_event_start)
        if suspended and not isinstance(suspended, bool):
            raise TypeError("Expected argument 'suspended' to be a bool")
        pulumi.set(__self__, "suspended", suspended)
        if total_active_users and not isinstance(total_active_users, int):
            raise TypeError("Expected argument 'total_active_users' to be a int")
        pulumi.set(__self__, "total_active_users", total_active_users)
        if turnstile_action and not isinstance(turnstile_action, str):
            raise TypeError("Expected argument 'turnstile_action' to be a str")
        pulumi.set(__self__, "turnstile_action", turnstile_action)
        if turnstile_mode and not isinstance(turnstile_mode, str):
            raise TypeError("Expected argument 'turnstile_mode' to be a str")
        pulumi.set(__self__, "turnstile_mode", turnstile_mode)
        if waiting_room_id and not isinstance(waiting_room_id, str):
            raise TypeError("Expected argument 'waiting_room_id' to be a str")
        pulumi.set(__self__, "waiting_room_id", waiting_room_id)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> _builtins.str:
        return pulumi.get(self, "created_on")

    @_builtins.property
    @pulumi.getter(name="customPageHtml")
    def custom_page_html(self) -> _builtins.str:
        """
        If set, the event will override the waiting room's `custom_page_html` property while it is active. If null, the event will inherit it.
        """
        return pulumi.get(self, "custom_page_html")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        A note that you can use to add more details about the event.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="disableSessionRenewal")
    def disable_session_renewal(self) -> _builtins.bool:
        """
        If set, the event will override the waiting room's `disable_session_renewal` property while it is active. If null, the event will inherit it.
        """
        return pulumi.get(self, "disable_session_renewal")

    @_builtins.property
    @pulumi.getter(name="eventEndTime")
    def event_end_time(self) -> _builtins.str:
        """
        An ISO 8601 timestamp that marks the end of the event.
        """
        return pulumi.get(self, "event_end_time")

    @_builtins.property
    @pulumi.getter(name="eventId")
    def event_id(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "event_id")

    @_builtins.property
    @pulumi.getter(name="eventStartTime")
    def event_start_time(self) -> _builtins.str:
        """
        An ISO 8601 timestamp that marks the start of the event. At this time, queued users will be processed with the event's configuration. The start time must be at least one minute before `event_end_time`.
        """
        return pulumi.get(self, "event_start_time")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The ID of this resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="modifiedOn")
    def modified_on(self) -> _builtins.str:
        return pulumi.get(self, "modified_on")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        A unique name to identify the event. Only alphanumeric characters, hyphens and underscores are allowed.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="newUsersPerMinute")
    def new_users_per_minute(self) -> _builtins.int:
        """
        If set, the event will override the waiting room's `new_users_per_minute` property while it is active. If null, the event will inherit it. This can only be set if the event's `total_active_users` property is also set.
        """
        return pulumi.get(self, "new_users_per_minute")

    @_builtins.property
    @pulumi.getter(name="prequeueStartTime")
    def prequeue_start_time(self) -> _builtins.str:
        """
        An ISO 8601 timestamp that marks when to begin queueing all users before the event starts. The prequeue must start at least five minutes before `event_start_time`.
        """
        return pulumi.get(self, "prequeue_start_time")

    @_builtins.property
    @pulumi.getter(name="queueingMethod")
    def queueing_method(self) -> _builtins.str:
        """
        If set, the event will override the waiting room's `queueing_method` property while it is active. If null, the event will inherit it.
        """
        return pulumi.get(self, "queueing_method")

    @_builtins.property
    @pulumi.getter(name="sessionDuration")
    def session_duration(self) -> _builtins.int:
        """
        If set, the event will override the waiting room's `session_duration` property while it is active. If null, the event will inherit it.
        """
        return pulumi.get(self, "session_duration")

    @_builtins.property
    @pulumi.getter(name="shuffleAtEventStart")
    def shuffle_at_event_start(self) -> _builtins.bool:
        """
        If enabled, users in the prequeue will be shuffled randomly at the `event_start_time`. Requires that `prequeue_start_time` is not null. This is useful for situations when many users will join the event prequeue at the same time and you want to shuffle them to ensure fairness. Naturally, it makes the most sense to enable this feature when the `queueing_method` during the event respects ordering such as **fifo**, or else the shuffling may be unnecessary.
        """
        return pulumi.get(self, "shuffle_at_event_start")

    @_builtins.property
    @pulumi.getter
    def suspended(self) -> _builtins.bool:
        """
        Suspends or allows an event. If set to `true`, the event is ignored and traffic will be handled based on the waiting room configuration.
        """
        return pulumi.get(self, "suspended")

    @_builtins.property
    @pulumi.getter(name="totalActiveUsers")
    def total_active_users(self) -> _builtins.int:
        """
        If set, the event will override the waiting room's `total_active_users` property while it is active. If null, the event will inherit it. This can only be set if the event's `new_users_per_minute` property is also set.
        """
        return pulumi.get(self, "total_active_users")

    @_builtins.property
    @pulumi.getter(name="turnstileAction")
    def turnstile_action(self) -> _builtins.str:
        """
        If set, the event will override the waiting room's `turnstile_action` property while it is active. If null, the event will inherit it.
        Available values: "log", "infinite_queue".
        """
        return pulumi.get(self, "turnstile_action")

    @_builtins.property
    @pulumi.getter(name="turnstileMode")
    def turnstile_mode(self) -> _builtins.str:
        """
        If set, the event will override the waiting room's `turnstile_mode` property while it is active. If null, the event will inherit it.
        Available values: "off", "invisible", "visible*non*interactive", "visible_managed".
        """
        return pulumi.get(self, "turnstile_mode")

    @_builtins.property
    @pulumi.getter(name="waitingRoomId")
    def waiting_room_id(self) -> _builtins.str:
        return pulumi.get(self, "waiting_room_id")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> _builtins.str:
        """
        Identifier.
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetWaitingRoomEventResult(GetWaitingRoomEventResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetWaitingRoomEventResult(
            created_on=self.created_on,
            custom_page_html=self.custom_page_html,
            description=self.description,
            disable_session_renewal=self.disable_session_renewal,
            event_end_time=self.event_end_time,
            event_id=self.event_id,
            event_start_time=self.event_start_time,
            id=self.id,
            modified_on=self.modified_on,
            name=self.name,
            new_users_per_minute=self.new_users_per_minute,
            prequeue_start_time=self.prequeue_start_time,
            queueing_method=self.queueing_method,
            session_duration=self.session_duration,
            shuffle_at_event_start=self.shuffle_at_event_start,
            suspended=self.suspended,
            total_active_users=self.total_active_users,
            turnstile_action=self.turnstile_action,
            turnstile_mode=self.turnstile_mode,
            waiting_room_id=self.waiting_room_id,
            zone_id=self.zone_id)


def get_waiting_room_event(event_id: Optional[_builtins.str] = None,
                           waiting_room_id: Optional[_builtins.str] = None,
                           zone_id: Optional[_builtins.str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetWaitingRoomEventResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_waiting_room_event = cloudflare.get_waiting_room_event(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        waiting_room_id="699d98642c564d2e855e9661899b7252",
        event_id="25756b2dfe6e378a06b033b670413757")
    ```


    :param _builtins.str zone_id: Identifier.
    """
    __args__ = dict()
    __args__['eventId'] = event_id
    __args__['waitingRoomId'] = waiting_room_id
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getWaitingRoomEvent:getWaitingRoomEvent', __args__, opts=opts, typ=GetWaitingRoomEventResult).value

    return AwaitableGetWaitingRoomEventResult(
        created_on=pulumi.get(__ret__, 'created_on'),
        custom_page_html=pulumi.get(__ret__, 'custom_page_html'),
        description=pulumi.get(__ret__, 'description'),
        disable_session_renewal=pulumi.get(__ret__, 'disable_session_renewal'),
        event_end_time=pulumi.get(__ret__, 'event_end_time'),
        event_id=pulumi.get(__ret__, 'event_id'),
        event_start_time=pulumi.get(__ret__, 'event_start_time'),
        id=pulumi.get(__ret__, 'id'),
        modified_on=pulumi.get(__ret__, 'modified_on'),
        name=pulumi.get(__ret__, 'name'),
        new_users_per_minute=pulumi.get(__ret__, 'new_users_per_minute'),
        prequeue_start_time=pulumi.get(__ret__, 'prequeue_start_time'),
        queueing_method=pulumi.get(__ret__, 'queueing_method'),
        session_duration=pulumi.get(__ret__, 'session_duration'),
        shuffle_at_event_start=pulumi.get(__ret__, 'shuffle_at_event_start'),
        suspended=pulumi.get(__ret__, 'suspended'),
        total_active_users=pulumi.get(__ret__, 'total_active_users'),
        turnstile_action=pulumi.get(__ret__, 'turnstile_action'),
        turnstile_mode=pulumi.get(__ret__, 'turnstile_mode'),
        waiting_room_id=pulumi.get(__ret__, 'waiting_room_id'),
        zone_id=pulumi.get(__ret__, 'zone_id'))
def get_waiting_room_event_output(event_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                  waiting_room_id: Optional[pulumi.Input[_builtins.str]] = None,
                                  zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetWaitingRoomEventResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example_waiting_room_event = cloudflare.get_waiting_room_event(zone_id="023e105f4ecef8ad9ca31a8372d0c353",
        waiting_room_id="699d98642c564d2e855e9661899b7252",
        event_id="25756b2dfe6e378a06b033b670413757")
    ```


    :param _builtins.str zone_id: Identifier.
    """
    __args__ = dict()
    __args__['eventId'] = event_id
    __args__['waitingRoomId'] = waiting_room_id
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getWaitingRoomEvent:getWaitingRoomEvent', __args__, opts=opts, typ=GetWaitingRoomEventResult)
    return __ret__.apply(lambda __response__: GetWaitingRoomEventResult(
        created_on=pulumi.get(__response__, 'created_on'),
        custom_page_html=pulumi.get(__response__, 'custom_page_html'),
        description=pulumi.get(__response__, 'description'),
        disable_session_renewal=pulumi.get(__response__, 'disable_session_renewal'),
        event_end_time=pulumi.get(__response__, 'event_end_time'),
        event_id=pulumi.get(__response__, 'event_id'),
        event_start_time=pulumi.get(__response__, 'event_start_time'),
        id=pulumi.get(__response__, 'id'),
        modified_on=pulumi.get(__response__, 'modified_on'),
        name=pulumi.get(__response__, 'name'),
        new_users_per_minute=pulumi.get(__response__, 'new_users_per_minute'),
        prequeue_start_time=pulumi.get(__response__, 'prequeue_start_time'),
        queueing_method=pulumi.get(__response__, 'queueing_method'),
        session_duration=pulumi.get(__response__, 'session_duration'),
        shuffle_at_event_start=pulumi.get(__response__, 'shuffle_at_event_start'),
        suspended=pulumi.get(__response__, 'suspended'),
        total_active_users=pulumi.get(__response__, 'total_active_users'),
        turnstile_action=pulumi.get(__response__, 'turnstile_action'),
        turnstile_mode=pulumi.get(__response__, 'turnstile_mode'),
        waiting_room_id=pulumi.get(__response__, 'waiting_room_id'),
        zone_id=pulumi.get(__response__, 'zone_id')))
