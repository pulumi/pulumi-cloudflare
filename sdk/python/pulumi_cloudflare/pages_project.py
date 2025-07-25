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
from ._inputs import *

__all__ = ['PagesProjectArgs', 'PagesProject']

@pulumi.input_type
class PagesProjectArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[_builtins.str],
                 name: pulumi.Input[_builtins.str],
                 build_config: Optional[pulumi.Input['PagesProjectBuildConfigArgs']] = None,
                 deployment_configs: Optional[pulumi.Input['PagesProjectDeploymentConfigsArgs']] = None,
                 production_branch: Optional[pulumi.Input[_builtins.str]] = None,
                 source: Optional[pulumi.Input['PagesProjectSourceArgs']] = None):
        """
        The set of arguments for constructing a PagesProject resource.
        :param pulumi.Input[_builtins.str] account_id: Identifier
        :param pulumi.Input[_builtins.str] name: Name of the project.
        :param pulumi.Input['PagesProjectBuildConfigArgs'] build_config: Configs for the project build process.
        :param pulumi.Input['PagesProjectDeploymentConfigsArgs'] deployment_configs: Configs for deployments in a project.
        :param pulumi.Input[_builtins.str] production_branch: Production branch of the project. Used to identify production deployments.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "name", name)
        if build_config is not None:
            pulumi.set(__self__, "build_config", build_config)
        if deployment_configs is not None:
            pulumi.set(__self__, "deployment_configs", deployment_configs)
        if production_branch is not None:
            pulumi.set(__self__, "production_branch", production_branch)
        if source is not None:
            pulumi.set(__self__, "source", source)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[_builtins.str]:
        """
        Identifier
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Input[_builtins.str]:
        """
        Name of the project.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="buildConfig")
    def build_config(self) -> Optional[pulumi.Input['PagesProjectBuildConfigArgs']]:
        """
        Configs for the project build process.
        """
        return pulumi.get(self, "build_config")

    @build_config.setter
    def build_config(self, value: Optional[pulumi.Input['PagesProjectBuildConfigArgs']]):
        pulumi.set(self, "build_config", value)

    @_builtins.property
    @pulumi.getter(name="deploymentConfigs")
    def deployment_configs(self) -> Optional[pulumi.Input['PagesProjectDeploymentConfigsArgs']]:
        """
        Configs for deployments in a project.
        """
        return pulumi.get(self, "deployment_configs")

    @deployment_configs.setter
    def deployment_configs(self, value: Optional[pulumi.Input['PagesProjectDeploymentConfigsArgs']]):
        pulumi.set(self, "deployment_configs", value)

    @_builtins.property
    @pulumi.getter(name="productionBranch")
    def production_branch(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Production branch of the project. Used to identify production deployments.
        """
        return pulumi.get(self, "production_branch")

    @production_branch.setter
    def production_branch(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "production_branch", value)

    @_builtins.property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input['PagesProjectSourceArgs']]:
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input['PagesProjectSourceArgs']]):
        pulumi.set(self, "source", value)


@pulumi.input_type
class _PagesProjectState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 build_config: Optional[pulumi.Input['PagesProjectBuildConfigArgs']] = None,
                 canonical_deployment: Optional[pulumi.Input['PagesProjectCanonicalDeploymentArgs']] = None,
                 created_on: Optional[pulumi.Input[_builtins.str]] = None,
                 deployment_configs: Optional[pulumi.Input['PagesProjectDeploymentConfigsArgs']] = None,
                 domains: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 latest_deployment: Optional[pulumi.Input['PagesProjectLatestDeploymentArgs']] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 production_branch: Optional[pulumi.Input[_builtins.str]] = None,
                 source: Optional[pulumi.Input['PagesProjectSourceArgs']] = None,
                 subdomain: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering PagesProject resources.
        :param pulumi.Input[_builtins.str] account_id: Identifier
        :param pulumi.Input['PagesProjectBuildConfigArgs'] build_config: Configs for the project build process.
        :param pulumi.Input['PagesProjectCanonicalDeploymentArgs'] canonical_deployment: Most recent deployment to the repo.
        :param pulumi.Input[_builtins.str] created_on: When the project was created.
        :param pulumi.Input['PagesProjectDeploymentConfigsArgs'] deployment_configs: Configs for deployments in a project.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] domains: A list of associated custom domains for the project.
        :param pulumi.Input['PagesProjectLatestDeploymentArgs'] latest_deployment: Most recent deployment to the repo.
        :param pulumi.Input[_builtins.str] name: Name of the project.
        :param pulumi.Input[_builtins.str] production_branch: Production branch of the project. Used to identify production deployments.
        :param pulumi.Input[_builtins.str] subdomain: The Cloudflare subdomain associated with the project.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if build_config is not None:
            pulumi.set(__self__, "build_config", build_config)
        if canonical_deployment is not None:
            pulumi.set(__self__, "canonical_deployment", canonical_deployment)
        if created_on is not None:
            pulumi.set(__self__, "created_on", created_on)
        if deployment_configs is not None:
            pulumi.set(__self__, "deployment_configs", deployment_configs)
        if domains is not None:
            pulumi.set(__self__, "domains", domains)
        if latest_deployment is not None:
            pulumi.set(__self__, "latest_deployment", latest_deployment)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if production_branch is not None:
            pulumi.set(__self__, "production_branch", production_branch)
        if source is not None:
            pulumi.set(__self__, "source", source)
        if subdomain is not None:
            pulumi.set(__self__, "subdomain", subdomain)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Identifier
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter(name="buildConfig")
    def build_config(self) -> Optional[pulumi.Input['PagesProjectBuildConfigArgs']]:
        """
        Configs for the project build process.
        """
        return pulumi.get(self, "build_config")

    @build_config.setter
    def build_config(self, value: Optional[pulumi.Input['PagesProjectBuildConfigArgs']]):
        pulumi.set(self, "build_config", value)

    @_builtins.property
    @pulumi.getter(name="canonicalDeployment")
    def canonical_deployment(self) -> Optional[pulumi.Input['PagesProjectCanonicalDeploymentArgs']]:
        """
        Most recent deployment to the repo.
        """
        return pulumi.get(self, "canonical_deployment")

    @canonical_deployment.setter
    def canonical_deployment(self, value: Optional[pulumi.Input['PagesProjectCanonicalDeploymentArgs']]):
        pulumi.set(self, "canonical_deployment", value)

    @_builtins.property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        When the project was created.
        """
        return pulumi.get(self, "created_on")

    @created_on.setter
    def created_on(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "created_on", value)

    @_builtins.property
    @pulumi.getter(name="deploymentConfigs")
    def deployment_configs(self) -> Optional[pulumi.Input['PagesProjectDeploymentConfigsArgs']]:
        """
        Configs for deployments in a project.
        """
        return pulumi.get(self, "deployment_configs")

    @deployment_configs.setter
    def deployment_configs(self, value: Optional[pulumi.Input['PagesProjectDeploymentConfigsArgs']]):
        pulumi.set(self, "deployment_configs", value)

    @_builtins.property
    @pulumi.getter
    def domains(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        A list of associated custom domains for the project.
        """
        return pulumi.get(self, "domains")

    @domains.setter
    def domains(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "domains", value)

    @_builtins.property
    @pulumi.getter(name="latestDeployment")
    def latest_deployment(self) -> Optional[pulumi.Input['PagesProjectLatestDeploymentArgs']]:
        """
        Most recent deployment to the repo.
        """
        return pulumi.get(self, "latest_deployment")

    @latest_deployment.setter
    def latest_deployment(self, value: Optional[pulumi.Input['PagesProjectLatestDeploymentArgs']]):
        pulumi.set(self, "latest_deployment", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the project.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="productionBranch")
    def production_branch(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Production branch of the project. Used to identify production deployments.
        """
        return pulumi.get(self, "production_branch")

    @production_branch.setter
    def production_branch(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "production_branch", value)

    @_builtins.property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input['PagesProjectSourceArgs']]:
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input['PagesProjectSourceArgs']]):
        pulumi.set(self, "source", value)

    @_builtins.property
    @pulumi.getter
    def subdomain(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Cloudflare subdomain associated with the project.
        """
        return pulumi.get(self, "subdomain")

    @subdomain.setter
    def subdomain(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "subdomain", value)


@pulumi.type_token("cloudflare:index/pagesProject:PagesProject")
class PagesProject(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 build_config: Optional[pulumi.Input[Union['PagesProjectBuildConfigArgs', 'PagesProjectBuildConfigArgsDict']]] = None,
                 deployment_configs: Optional[pulumi.Input[Union['PagesProjectDeploymentConfigsArgs', 'PagesProjectDeploymentConfigsArgsDict']]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 production_branch: Optional[pulumi.Input[_builtins.str]] = None,
                 source: Optional[pulumi.Input[Union['PagesProjectSourceArgs', 'PagesProjectSourceArgsDict']]] = None,
                 __props__=None):
        """
        > If you are using a `source` block configuration, you must first have a
           connected GitHub or GitLab account connected to Cloudflare. See the
           [Getting Started with Pages] documentation on how to link your accounts.

        ## Import

        !> It is not possible to import a pages project with secret environment variables. If you have a secret environment variable, you must remove it from your project before importing it.

        ```sh
        $ pulumi import cloudflare:index/pagesProject:PagesProject example '<account_id>/<project_name>'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: Identifier
        :param pulumi.Input[Union['PagesProjectBuildConfigArgs', 'PagesProjectBuildConfigArgsDict']] build_config: Configs for the project build process.
        :param pulumi.Input[Union['PagesProjectDeploymentConfigsArgs', 'PagesProjectDeploymentConfigsArgsDict']] deployment_configs: Configs for deployments in a project.
        :param pulumi.Input[_builtins.str] name: Name of the project.
        :param pulumi.Input[_builtins.str] production_branch: Production branch of the project. Used to identify production deployments.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PagesProjectArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > If you are using a `source` block configuration, you must first have a
           connected GitHub or GitLab account connected to Cloudflare. See the
           [Getting Started with Pages] documentation on how to link your accounts.

        ## Import

        !> It is not possible to import a pages project with secret environment variables. If you have a secret environment variable, you must remove it from your project before importing it.

        ```sh
        $ pulumi import cloudflare:index/pagesProject:PagesProject example '<account_id>/<project_name>'
        ```

        :param str resource_name: The name of the resource.
        :param PagesProjectArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PagesProjectArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 build_config: Optional[pulumi.Input[Union['PagesProjectBuildConfigArgs', 'PagesProjectBuildConfigArgsDict']]] = None,
                 deployment_configs: Optional[pulumi.Input[Union['PagesProjectDeploymentConfigsArgs', 'PagesProjectDeploymentConfigsArgsDict']]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 production_branch: Optional[pulumi.Input[_builtins.str]] = None,
                 source: Optional[pulumi.Input[Union['PagesProjectSourceArgs', 'PagesProjectSourceArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PagesProjectArgs.__new__(PagesProjectArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["build_config"] = build_config
            __props__.__dict__["deployment_configs"] = deployment_configs
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["production_branch"] = production_branch
            __props__.__dict__["source"] = source
            __props__.__dict__["canonical_deployment"] = None
            __props__.__dict__["created_on"] = None
            __props__.__dict__["domains"] = None
            __props__.__dict__["latest_deployment"] = None
            __props__.__dict__["subdomain"] = None
        super(PagesProject, __self__).__init__(
            'cloudflare:index/pagesProject:PagesProject',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[_builtins.str]] = None,
            build_config: Optional[pulumi.Input[Union['PagesProjectBuildConfigArgs', 'PagesProjectBuildConfigArgsDict']]] = None,
            canonical_deployment: Optional[pulumi.Input[Union['PagesProjectCanonicalDeploymentArgs', 'PagesProjectCanonicalDeploymentArgsDict']]] = None,
            created_on: Optional[pulumi.Input[_builtins.str]] = None,
            deployment_configs: Optional[pulumi.Input[Union['PagesProjectDeploymentConfigsArgs', 'PagesProjectDeploymentConfigsArgsDict']]] = None,
            domains: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            latest_deployment: Optional[pulumi.Input[Union['PagesProjectLatestDeploymentArgs', 'PagesProjectLatestDeploymentArgsDict']]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            production_branch: Optional[pulumi.Input[_builtins.str]] = None,
            source: Optional[pulumi.Input[Union['PagesProjectSourceArgs', 'PagesProjectSourceArgsDict']]] = None,
            subdomain: Optional[pulumi.Input[_builtins.str]] = None) -> 'PagesProject':
        """
        Get an existing PagesProject resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: Identifier
        :param pulumi.Input[Union['PagesProjectBuildConfigArgs', 'PagesProjectBuildConfigArgsDict']] build_config: Configs for the project build process.
        :param pulumi.Input[Union['PagesProjectCanonicalDeploymentArgs', 'PagesProjectCanonicalDeploymentArgsDict']] canonical_deployment: Most recent deployment to the repo.
        :param pulumi.Input[_builtins.str] created_on: When the project was created.
        :param pulumi.Input[Union['PagesProjectDeploymentConfigsArgs', 'PagesProjectDeploymentConfigsArgsDict']] deployment_configs: Configs for deployments in a project.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] domains: A list of associated custom domains for the project.
        :param pulumi.Input[Union['PagesProjectLatestDeploymentArgs', 'PagesProjectLatestDeploymentArgsDict']] latest_deployment: Most recent deployment to the repo.
        :param pulumi.Input[_builtins.str] name: Name of the project.
        :param pulumi.Input[_builtins.str] production_branch: Production branch of the project. Used to identify production deployments.
        :param pulumi.Input[_builtins.str] subdomain: The Cloudflare subdomain associated with the project.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PagesProjectState.__new__(_PagesProjectState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["build_config"] = build_config
        __props__.__dict__["canonical_deployment"] = canonical_deployment
        __props__.__dict__["created_on"] = created_on
        __props__.__dict__["deployment_configs"] = deployment_configs
        __props__.__dict__["domains"] = domains
        __props__.__dict__["latest_deployment"] = latest_deployment
        __props__.__dict__["name"] = name
        __props__.__dict__["production_branch"] = production_branch
        __props__.__dict__["source"] = source
        __props__.__dict__["subdomain"] = subdomain
        return PagesProject(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[_builtins.str]:
        """
        Identifier
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="buildConfig")
    def build_config(self) -> pulumi.Output[Optional['outputs.PagesProjectBuildConfig']]:
        """
        Configs for the project build process.
        """
        return pulumi.get(self, "build_config")

    @_builtins.property
    @pulumi.getter(name="canonicalDeployment")
    def canonical_deployment(self) -> pulumi.Output['outputs.PagesProjectCanonicalDeployment']:
        """
        Most recent deployment to the repo.
        """
        return pulumi.get(self, "canonical_deployment")

    @_builtins.property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> pulumi.Output[_builtins.str]:
        """
        When the project was created.
        """
        return pulumi.get(self, "created_on")

    @_builtins.property
    @pulumi.getter(name="deploymentConfigs")
    def deployment_configs(self) -> pulumi.Output[Optional['outputs.PagesProjectDeploymentConfigs']]:
        """
        Configs for deployments in a project.
        """
        return pulumi.get(self, "deployment_configs")

    @_builtins.property
    @pulumi.getter
    def domains(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        A list of associated custom domains for the project.
        """
        return pulumi.get(self, "domains")

    @_builtins.property
    @pulumi.getter(name="latestDeployment")
    def latest_deployment(self) -> pulumi.Output['outputs.PagesProjectLatestDeployment']:
        """
        Most recent deployment to the repo.
        """
        return pulumi.get(self, "latest_deployment")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Name of the project.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="productionBranch")
    def production_branch(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Production branch of the project. Used to identify production deployments.
        """
        return pulumi.get(self, "production_branch")

    @_builtins.property
    @pulumi.getter
    def source(self) -> pulumi.Output[Optional['outputs.PagesProjectSource']]:
        return pulumi.get(self, "source")

    @_builtins.property
    @pulumi.getter
    def subdomain(self) -> pulumi.Output[_builtins.str]:
        """
        The Cloudflare subdomain associated with the project.
        """
        return pulumi.get(self, "subdomain")

