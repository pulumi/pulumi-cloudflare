# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['WorkerCronTrigger']


class WorkerCronTrigger(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 schedules: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 script_name: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Worker Cron Triggers allow users to map a cron expression to a Worker script
        using a `ScheduledEvent` listener that enables Workers to be executed on a
        schedule. Worker Cron Triggers are ideal for running periodic jobs for
        maintenance or calling third-party APIs to collect up-to-date data.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_script = cloudflare.WorkerScript("exampleScript",
            name="example-script",
            content=(lambda path: open(path).read())("path/to/my.js"))
        example_trigger = cloudflare.WorkerCronTrigger("exampleTrigger",
            script_name=example_script.name,
            schedules=[
                "*/5 * * * *",
                "10 7 * * mon-fri",
            ])
        ```

        ## Import

        Worker Cron Triggers can be imported using the script name of the Worker they are targeting.

        ```sh
         $ pulumi import cloudflare:index/workerCronTrigger:WorkerCronTrigger example my-script
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] schedules: List of cron expressions to execute the Worker Script
        :param pulumi.Input[str] script_name: Worker script to target for the schedules
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if schedules is None and not opts.urn:
                raise TypeError("Missing required property 'schedules'")
            __props__['schedules'] = schedules
            if script_name is None and not opts.urn:
                raise TypeError("Missing required property 'script_name'")
            __props__['script_name'] = script_name
        super(WorkerCronTrigger, __self__).__init__(
            'cloudflare:index/workerCronTrigger:WorkerCronTrigger',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            schedules: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            script_name: Optional[pulumi.Input[str]] = None) -> 'WorkerCronTrigger':
        """
        Get an existing WorkerCronTrigger resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] schedules: List of cron expressions to execute the Worker Script
        :param pulumi.Input[str] script_name: Worker script to target for the schedules
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["schedules"] = schedules
        __props__["script_name"] = script_name
        return WorkerCronTrigger(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def schedules(self) -> pulumi.Output[Sequence[str]]:
        """
        List of cron expressions to execute the Worker Script
        """
        return pulumi.get(self, "schedules")

    @property
    @pulumi.getter(name="scriptName")
    def script_name(self) -> pulumi.Output[str]:
        """
        Worker script to target for the schedules
        """
        return pulumi.get(self, "script_name")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

