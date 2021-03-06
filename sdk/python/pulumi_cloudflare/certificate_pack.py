# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['CertificatePack']


class CertificatePack(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate_authority: Optional[pulumi.Input[str]] = None,
                 cloudflare_branding: Optional[pulumi.Input[bool]] = None,
                 hosts: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 validation_method: Optional[pulumi.Input[str]] = None,
                 validity_days: Optional[pulumi.Input[int]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        ## Import

        Certificate packs can be imported using a composite ID of the zone ID and certificate pack ID. This isn't recommended and it is advised to replace the certificate entirely instead.

        ```sh
         $ pulumi import cloudflare:index/certificatePack:CertificatePack example cb029e245cfdd66dc8d2e570d5dd3322/8fda82e2-6af9-4eb2-992a-5ab65b792ef1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate_authority: Which certificate
               authority to issue the certificate pack. Allowed values: `"digicert"`,
               `"lets_encrypt"`.
        :param pulumi.Input[bool] cloudflare_branding: Whether or not to include
               Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name
               if set to `true`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hosts: List of hostnames to provision the certificate pack for.
               Note: If using Let's Encrypt, you cannot use individual subdomains and only a
               wildcard for subdomain is available.
        :param pulumi.Input[str] type: Certificate pack configuration type.
               Allowed values: `"custom"`, `"dedicated_custom"`, `"advanced"`.
        :param pulumi.Input[str] validation_method: Which validation method to
               use in order to prove domain ownership. Allowed values: `"txt"`, `"http"`, `"email"`.
        :param pulumi.Input[int] validity_days: How long the certificate is valid
               for. Note: If using Let's Encrypt, this value can only be 90 days.
               Allowed values: 14, 30, 90, 365.
        :param pulumi.Input[str] zone_id: The DNS zone to which the certificate pack should be added.
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

            __props__['certificate_authority'] = certificate_authority
            __props__['cloudflare_branding'] = cloudflare_branding
            if hosts is None and not opts.urn:
                raise TypeError("Missing required property 'hosts'")
            __props__['hosts'] = hosts
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__['type'] = type
            __props__['validation_method'] = validation_method
            __props__['validity_days'] = validity_days
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__['zone_id'] = zone_id
        super(CertificatePack, __self__).__init__(
            'cloudflare:index/certificatePack:CertificatePack',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            certificate_authority: Optional[pulumi.Input[str]] = None,
            cloudflare_branding: Optional[pulumi.Input[bool]] = None,
            hosts: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            type: Optional[pulumi.Input[str]] = None,
            validation_method: Optional[pulumi.Input[str]] = None,
            validity_days: Optional[pulumi.Input[int]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'CertificatePack':
        """
        Get an existing CertificatePack resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate_authority: Which certificate
               authority to issue the certificate pack. Allowed values: `"digicert"`,
               `"lets_encrypt"`.
        :param pulumi.Input[bool] cloudflare_branding: Whether or not to include
               Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name
               if set to `true`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hosts: List of hostnames to provision the certificate pack for.
               Note: If using Let's Encrypt, you cannot use individual subdomains and only a
               wildcard for subdomain is available.
        :param pulumi.Input[str] type: Certificate pack configuration type.
               Allowed values: `"custom"`, `"dedicated_custom"`, `"advanced"`.
        :param pulumi.Input[str] validation_method: Which validation method to
               use in order to prove domain ownership. Allowed values: `"txt"`, `"http"`, `"email"`.
        :param pulumi.Input[int] validity_days: How long the certificate is valid
               for. Note: If using Let's Encrypt, this value can only be 90 days.
               Allowed values: 14, 30, 90, 365.
        :param pulumi.Input[str] zone_id: The DNS zone to which the certificate pack should be added.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["certificate_authority"] = certificate_authority
        __props__["cloudflare_branding"] = cloudflare_branding
        __props__["hosts"] = hosts
        __props__["type"] = type
        __props__["validation_method"] = validation_method
        __props__["validity_days"] = validity_days
        __props__["zone_id"] = zone_id
        return CertificatePack(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="certificateAuthority")
    def certificate_authority(self) -> pulumi.Output[Optional[str]]:
        """
        Which certificate
        authority to issue the certificate pack. Allowed values: `"digicert"`,
        `"lets_encrypt"`.
        """
        return pulumi.get(self, "certificate_authority")

    @property
    @pulumi.getter(name="cloudflareBranding")
    def cloudflare_branding(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether or not to include
        Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name
        if set to `true`.
        """
        return pulumi.get(self, "cloudflare_branding")

    @property
    @pulumi.getter
    def hosts(self) -> pulumi.Output[Sequence[str]]:
        """
        List of hostnames to provision the certificate pack for.
        Note: If using Let's Encrypt, you cannot use individual subdomains and only a
        wildcard for subdomain is available.
        """
        return pulumi.get(self, "hosts")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Certificate pack configuration type.
        Allowed values: `"custom"`, `"dedicated_custom"`, `"advanced"`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="validationMethod")
    def validation_method(self) -> pulumi.Output[Optional[str]]:
        """
        Which validation method to
        use in order to prove domain ownership. Allowed values: `"txt"`, `"http"`, `"email"`.
        """
        return pulumi.get(self, "validation_method")

    @property
    @pulumi.getter(name="validityDays")
    def validity_days(self) -> pulumi.Output[Optional[int]]:
        """
        How long the certificate is valid
        for. Note: If using Let's Encrypt, this value can only be 90 days.
        Allowed values: 14, 30, 90, 365.
        """
        return pulumi.get(self, "validity_days")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The DNS zone to which the certificate pack should be added.
        """
        return pulumi.get(self, "zone_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

