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

__all__ = ['ZeroTrustRiskScoringIntegrationArgs', 'ZeroTrustRiskScoringIntegration']

@pulumi.input_type
class ZeroTrustRiskScoringIntegrationArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[_builtins.str],
                 integration_type: pulumi.Input[_builtins.str],
                 tenant_url: pulumi.Input[_builtins.str],
                 active: Optional[pulumi.Input[_builtins.bool]] = None,
                 reference_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a ZeroTrustRiskScoringIntegration resource.
        :param pulumi.Input[_builtins.str] integration_type: Available values: "Okta".
        :param pulumi.Input[_builtins.str] tenant_url: The base url of the tenant, e.g. "https://tenant.okta.com".
        :param pulumi.Input[_builtins.bool] active: Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
        :param pulumi.Input[_builtins.str] reference_id: A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4).
               https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "integration_type", integration_type)
        pulumi.set(__self__, "tenant_url", tenant_url)
        if active is not None:
            pulumi.set(__self__, "active", active)
        if reference_id is not None:
            pulumi.set(__self__, "reference_id", reference_id)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[_builtins.str]:
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter(name="integrationType")
    def integration_type(self) -> pulumi.Input[_builtins.str]:
        """
        Available values: "Okta".
        """
        return pulumi.get(self, "integration_type")

    @integration_type.setter
    def integration_type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "integration_type", value)

    @_builtins.property
    @pulumi.getter(name="tenantUrl")
    def tenant_url(self) -> pulumi.Input[_builtins.str]:
        """
        The base url of the tenant, e.g. "https://tenant.okta.com".
        """
        return pulumi.get(self, "tenant_url")

    @tenant_url.setter
    def tenant_url(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "tenant_url", value)

    @_builtins.property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "active", value)

    @_builtins.property
    @pulumi.getter(name="referenceId")
    def reference_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4).
        https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
        """
        return pulumi.get(self, "reference_id")

    @reference_id.setter
    def reference_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "reference_id", value)


@pulumi.input_type
class _ZeroTrustRiskScoringIntegrationState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 account_tag: Optional[pulumi.Input[_builtins.str]] = None,
                 active: Optional[pulumi.Input[_builtins.bool]] = None,
                 created_at: Optional[pulumi.Input[_builtins.str]] = None,
                 integration_type: Optional[pulumi.Input[_builtins.str]] = None,
                 reference_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tenant_url: Optional[pulumi.Input[_builtins.str]] = None,
                 well_known_url: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ZeroTrustRiskScoringIntegration resources.
        :param pulumi.Input[_builtins.str] account_tag: The Cloudflare account tag.
        :param pulumi.Input[_builtins.bool] active: Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
        :param pulumi.Input[_builtins.str] created_at: When the integration was created in RFC3339 format.
        :param pulumi.Input[_builtins.str] integration_type: Available values: "Okta".
        :param pulumi.Input[_builtins.str] reference_id: A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4).
               https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
        :param pulumi.Input[_builtins.str] tenant_url: The base url of the tenant, e.g. "https://tenant.okta.com".
        :param pulumi.Input[_builtins.str] well_known_url: The URL for the Shared Signals Framework configuration, e.g. "/.well-known/sse-configuration/{integration*uuid}/". https://openid.net/specs/openid-sse-framework-1*0.html#rfc.section.6.2.1.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if account_tag is not None:
            pulumi.set(__self__, "account_tag", account_tag)
        if active is not None:
            pulumi.set(__self__, "active", active)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if integration_type is not None:
            pulumi.set(__self__, "integration_type", integration_type)
        if reference_id is not None:
            pulumi.set(__self__, "reference_id", reference_id)
        if tenant_url is not None:
            pulumi.set(__self__, "tenant_url", tenant_url)
        if well_known_url is not None:
            pulumi.set(__self__, "well_known_url", well_known_url)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter(name="accountTag")
    def account_tag(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Cloudflare account tag.
        """
        return pulumi.get(self, "account_tag")

    @account_tag.setter
    def account_tag(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_tag", value)

    @_builtins.property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "active", value)

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        When the integration was created in RFC3339 format.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "created_at", value)

    @_builtins.property
    @pulumi.getter(name="integrationType")
    def integration_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Available values: "Okta".
        """
        return pulumi.get(self, "integration_type")

    @integration_type.setter
    def integration_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "integration_type", value)

    @_builtins.property
    @pulumi.getter(name="referenceId")
    def reference_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4).
        https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
        """
        return pulumi.get(self, "reference_id")

    @reference_id.setter
    def reference_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "reference_id", value)

    @_builtins.property
    @pulumi.getter(name="tenantUrl")
    def tenant_url(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The base url of the tenant, e.g. "https://tenant.okta.com".
        """
        return pulumi.get(self, "tenant_url")

    @tenant_url.setter
    def tenant_url(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "tenant_url", value)

    @_builtins.property
    @pulumi.getter(name="wellKnownUrl")
    def well_known_url(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The URL for the Shared Signals Framework configuration, e.g. "/.well-known/sse-configuration/{integration*uuid}/". https://openid.net/specs/openid-sse-framework-1*0.html#rfc.section.6.2.1.
        """
        return pulumi.get(self, "well_known_url")

    @well_known_url.setter
    def well_known_url(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "well_known_url", value)


@pulumi.type_token("cloudflare:index/zeroTrustRiskScoringIntegration:ZeroTrustRiskScoringIntegration")
class ZeroTrustRiskScoringIntegration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 active: Optional[pulumi.Input[_builtins.bool]] = None,
                 integration_type: Optional[pulumi.Input[_builtins.str]] = None,
                 reference_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tenant_url: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_zero_trust_risk_scoring_integration = cloudflare.ZeroTrustRiskScoringIntegration("example_zero_trust_risk_scoring_integration",
            account_id="account_id",
            integration_type="Okta",
            tenant_url="https://example.com",
            reference_id="reference_id")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/zeroTrustRiskScoringIntegration:ZeroTrustRiskScoringIntegration example '<account_id>/<integration_id>'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] active: Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
        :param pulumi.Input[_builtins.str] integration_type: Available values: "Okta".
        :param pulumi.Input[_builtins.str] reference_id: A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4).
               https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
        :param pulumi.Input[_builtins.str] tenant_url: The base url of the tenant, e.g. "https://tenant.okta.com".
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ZeroTrustRiskScoringIntegrationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_zero_trust_risk_scoring_integration = cloudflare.ZeroTrustRiskScoringIntegration("example_zero_trust_risk_scoring_integration",
            account_id="account_id",
            integration_type="Okta",
            tenant_url="https://example.com",
            reference_id="reference_id")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/zeroTrustRiskScoringIntegration:ZeroTrustRiskScoringIntegration example '<account_id>/<integration_id>'
        ```

        :param str resource_name: The name of the resource.
        :param ZeroTrustRiskScoringIntegrationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ZeroTrustRiskScoringIntegrationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 active: Optional[pulumi.Input[_builtins.bool]] = None,
                 integration_type: Optional[pulumi.Input[_builtins.str]] = None,
                 reference_id: Optional[pulumi.Input[_builtins.str]] = None,
                 tenant_url: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ZeroTrustRiskScoringIntegrationArgs.__new__(ZeroTrustRiskScoringIntegrationArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["active"] = active
            if integration_type is None and not opts.urn:
                raise TypeError("Missing required property 'integration_type'")
            __props__.__dict__["integration_type"] = integration_type
            __props__.__dict__["reference_id"] = reference_id
            if tenant_url is None and not opts.urn:
                raise TypeError("Missing required property 'tenant_url'")
            __props__.__dict__["tenant_url"] = tenant_url
            __props__.__dict__["account_tag"] = None
            __props__.__dict__["created_at"] = None
            __props__.__dict__["well_known_url"] = None
        super(ZeroTrustRiskScoringIntegration, __self__).__init__(
            'cloudflare:index/zeroTrustRiskScoringIntegration:ZeroTrustRiskScoringIntegration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[_builtins.str]] = None,
            account_tag: Optional[pulumi.Input[_builtins.str]] = None,
            active: Optional[pulumi.Input[_builtins.bool]] = None,
            created_at: Optional[pulumi.Input[_builtins.str]] = None,
            integration_type: Optional[pulumi.Input[_builtins.str]] = None,
            reference_id: Optional[pulumi.Input[_builtins.str]] = None,
            tenant_url: Optional[pulumi.Input[_builtins.str]] = None,
            well_known_url: Optional[pulumi.Input[_builtins.str]] = None) -> 'ZeroTrustRiskScoringIntegration':
        """
        Get an existing ZeroTrustRiskScoringIntegration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_tag: The Cloudflare account tag.
        :param pulumi.Input[_builtins.bool] active: Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
        :param pulumi.Input[_builtins.str] created_at: When the integration was created in RFC3339 format.
        :param pulumi.Input[_builtins.str] integration_type: Available values: "Okta".
        :param pulumi.Input[_builtins.str] reference_id: A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4).
               https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
        :param pulumi.Input[_builtins.str] tenant_url: The base url of the tenant, e.g. "https://tenant.okta.com".
        :param pulumi.Input[_builtins.str] well_known_url: The URL for the Shared Signals Framework configuration, e.g. "/.well-known/sse-configuration/{integration*uuid}/". https://openid.net/specs/openid-sse-framework-1*0.html#rfc.section.6.2.1.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ZeroTrustRiskScoringIntegrationState.__new__(_ZeroTrustRiskScoringIntegrationState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["account_tag"] = account_tag
        __props__.__dict__["active"] = active
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["integration_type"] = integration_type
        __props__.__dict__["reference_id"] = reference_id
        __props__.__dict__["tenant_url"] = tenant_url
        __props__.__dict__["well_known_url"] = well_known_url
        return ZeroTrustRiskScoringIntegration(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="accountTag")
    def account_tag(self) -> pulumi.Output[_builtins.str]:
        """
        The Cloudflare account tag.
        """
        return pulumi.get(self, "account_tag")

    @_builtins.property
    @pulumi.getter
    def active(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
        """
        return pulumi.get(self, "active")

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[_builtins.str]:
        """
        When the integration was created in RFC3339 format.
        """
        return pulumi.get(self, "created_at")

    @_builtins.property
    @pulumi.getter(name="integrationType")
    def integration_type(self) -> pulumi.Output[_builtins.str]:
        """
        Available values: "Okta".
        """
        return pulumi.get(self, "integration_type")

    @_builtins.property
    @pulumi.getter(name="referenceId")
    def reference_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4).
        https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
        """
        return pulumi.get(self, "reference_id")

    @_builtins.property
    @pulumi.getter(name="tenantUrl")
    def tenant_url(self) -> pulumi.Output[_builtins.str]:
        """
        The base url of the tenant, e.g. "https://tenant.okta.com".
        """
        return pulumi.get(self, "tenant_url")

    @_builtins.property
    @pulumi.getter(name="wellKnownUrl")
    def well_known_url(self) -> pulumi.Output[_builtins.str]:
        """
        The URL for the Shared Signals Framework configuration, e.g. "/.well-known/sse-configuration/{integration*uuid}/". https://openid.net/specs/openid-sse-framework-1*0.html#rfc.section.6.2.1.
        """
        return pulumi.get(self, "well_known_url")

