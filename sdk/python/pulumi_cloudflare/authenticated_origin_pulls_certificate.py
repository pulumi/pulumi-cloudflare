# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['AuthenticatedOriginPullsCertificate']


class AuthenticatedOriginPullsCertificate(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Cloudflare Authenticated Origin Pulls certificate resource. An uploaded client certificate is required to use Per-Zone or Per-Hostname Authenticated Origin Pulls.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # Per-Zone Authenticated Origin Pulls certificate
        my_per_zone_aop_cert = cloudflare.AuthenticatedOriginPullsCertificate("myPerZoneAopCert",
            certificate="-----INSERT CERTIFICATE-----",
            private_key="-----INSERT PRIVATE KEY-----",
            type="per-zone",
            zone_id=var["cloudflare_zone_id"])
        # Per-Hostname Authenticated Origin Pulls certificate
        my_per_hostname_aop_cert = cloudflare.AuthenticatedOriginPullsCertificate("myPerHostnameAopCert",
            certificate="-----INSERT CERTIFICATE-----",
            private_key="-----INSERT PRIVATE KEY-----",
            type="per-hostname",
            zone_id=var["cloudflare_zone_id"])
        ```

        ## Import

        Authenticated Origin Pull certificates can be imported using a composite ID formed of the zone ID, the form of Authenticated Origin Pulls, and the certificate ID, e.g. # Import Per-Zone Authenticated Origin Pull certificate

        ```sh
         $ pulumi import cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate 2458ce5a-0c35-4c7f-82c7-8e9487d3ff60 023e105f4ecef8ad9ca31a8372d0c353/per-zone/2458ce5a-0c35-4c7f-82c7-8e9487d3ff60
        ```

        # Import Per-Hostname Authenticated Origin Pull certificate

        ```sh
         $ pulumi import cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate 2458ce5a-0c35-4c7f-82c7-8e9487d3ff60 023e105f4ecef8ad9ca31a8372d0c353/per-hostname/2458ce5a-0c35-4c7f-82c7-8e9487d3ff60
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate: The public client certificate.
        :param pulumi.Input[str] private_key: The private key of the client certificate.
        :param pulumi.Input[str] type: The form of Authenticated Origin Pulls to upload the certificate to.
        :param pulumi.Input[str] zone_id: The zone ID to upload the certificate to.
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

            if certificate is None and not opts.urn:
                raise TypeError("Missing required property 'certificate'")
            __props__['certificate'] = certificate
            if private_key is None and not opts.urn:
                raise TypeError("Missing required property 'private_key'")
            __props__['private_key'] = private_key
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__['type'] = type
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__['zone_id'] = zone_id
            __props__['expires_on'] = None
            __props__['issuer'] = None
            __props__['serial_number'] = None
            __props__['signature'] = None
            __props__['status'] = None
            __props__['uploaded_on'] = None
        super(AuthenticatedOriginPullsCertificate, __self__).__init__(
            'cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            certificate: Optional[pulumi.Input[str]] = None,
            expires_on: Optional[pulumi.Input[str]] = None,
            issuer: Optional[pulumi.Input[str]] = None,
            private_key: Optional[pulumi.Input[str]] = None,
            serial_number: Optional[pulumi.Input[str]] = None,
            signature: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            uploaded_on: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'AuthenticatedOriginPullsCertificate':
        """
        Get an existing AuthenticatedOriginPullsCertificate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate: The public client certificate.
        :param pulumi.Input[str] private_key: The private key of the client certificate.
        :param pulumi.Input[str] type: The form of Authenticated Origin Pulls to upload the certificate to.
        :param pulumi.Input[str] zone_id: The zone ID to upload the certificate to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["certificate"] = certificate
        __props__["expires_on"] = expires_on
        __props__["issuer"] = issuer
        __props__["private_key"] = private_key
        __props__["serial_number"] = serial_number
        __props__["signature"] = signature
        __props__["status"] = status
        __props__["type"] = type
        __props__["uploaded_on"] = uploaded_on
        __props__["zone_id"] = zone_id
        return AuthenticatedOriginPullsCertificate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Output[str]:
        """
        The public client certificate.
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter(name="expiresOn")
    def expires_on(self) -> pulumi.Output[str]:
        return pulumi.get(self, "expires_on")

    @property
    @pulumi.getter
    def issuer(self) -> pulumi.Output[str]:
        return pulumi.get(self, "issuer")

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> pulumi.Output[str]:
        """
        The private key of the client certificate.
        """
        return pulumi.get(self, "private_key")

    @property
    @pulumi.getter(name="serialNumber")
    def serial_number(self) -> pulumi.Output[str]:
        return pulumi.get(self, "serial_number")

    @property
    @pulumi.getter
    def signature(self) -> pulumi.Output[str]:
        return pulumi.get(self, "signature")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The form of Authenticated Origin Pulls to upload the certificate to.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="uploadedOn")
    def uploaded_on(self) -> pulumi.Output[str]:
        return pulumi.get(self, "uploaded_on")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone ID to upload the certificate to.
        """
        return pulumi.get(self, "zone_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

