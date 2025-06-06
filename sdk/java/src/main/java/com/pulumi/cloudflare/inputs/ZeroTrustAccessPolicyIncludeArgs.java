// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeAnyValidServiceTokenArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeAuthContextArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeAuthMethodArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeAzureAdArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeCertificateArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeCommonNameArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeDevicePostureArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeEmailArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeEmailDomainArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeEmailListArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeEveryoneArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeExternalEvaluationArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeGeoArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeGithubOrganizationArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeGroupArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeGsuiteArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeIpArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeIpListArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeLoginMethodArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeOktaArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeSamlArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeServiceTokenArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustAccessPolicyIncludeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessPolicyIncludeArgs Empty = new ZeroTrustAccessPolicyIncludeArgs();

    /**
     * An empty object which matches on all service tokens.
     * 
     */
    @Import(name="anyValidServiceToken")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeAnyValidServiceTokenArgs> anyValidServiceToken;

    /**
     * @return An empty object which matches on all service tokens.
     * 
     */
    public Optional<Output<ZeroTrustAccessPolicyIncludeAnyValidServiceTokenArgs>> anyValidServiceToken() {
        return Optional.ofNullable(this.anyValidServiceToken);
    }

    @Import(name="authContext")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeAuthContextArgs> authContext;

    public Optional<Output<ZeroTrustAccessPolicyIncludeAuthContextArgs>> authContext() {
        return Optional.ofNullable(this.authContext);
    }

    @Import(name="authMethod")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeAuthMethodArgs> authMethod;

    public Optional<Output<ZeroTrustAccessPolicyIncludeAuthMethodArgs>> authMethod() {
        return Optional.ofNullable(this.authMethod);
    }

    @Import(name="azureAd")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeAzureAdArgs> azureAd;

    public Optional<Output<ZeroTrustAccessPolicyIncludeAzureAdArgs>> azureAd() {
        return Optional.ofNullable(this.azureAd);
    }

    @Import(name="certificate")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeCertificateArgs> certificate;

    public Optional<Output<ZeroTrustAccessPolicyIncludeCertificateArgs>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    @Import(name="commonName")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeCommonNameArgs> commonName;

    public Optional<Output<ZeroTrustAccessPolicyIncludeCommonNameArgs>> commonName() {
        return Optional.ofNullable(this.commonName);
    }

    @Import(name="devicePosture")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeDevicePostureArgs> devicePosture;

    public Optional<Output<ZeroTrustAccessPolicyIncludeDevicePostureArgs>> devicePosture() {
        return Optional.ofNullable(this.devicePosture);
    }

    @Import(name="email")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeEmailArgs> email;

    public Optional<Output<ZeroTrustAccessPolicyIncludeEmailArgs>> email() {
        return Optional.ofNullable(this.email);
    }

    @Import(name="emailDomain")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeEmailDomainArgs> emailDomain;

    public Optional<Output<ZeroTrustAccessPolicyIncludeEmailDomainArgs>> emailDomain() {
        return Optional.ofNullable(this.emailDomain);
    }

    @Import(name="emailList")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeEmailListArgs> emailList;

    public Optional<Output<ZeroTrustAccessPolicyIncludeEmailListArgs>> emailList() {
        return Optional.ofNullable(this.emailList);
    }

    /**
     * An empty object which matches on all users.
     * 
     */
    @Import(name="everyone")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeEveryoneArgs> everyone;

    /**
     * @return An empty object which matches on all users.
     * 
     */
    public Optional<Output<ZeroTrustAccessPolicyIncludeEveryoneArgs>> everyone() {
        return Optional.ofNullable(this.everyone);
    }

    @Import(name="externalEvaluation")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeExternalEvaluationArgs> externalEvaluation;

    public Optional<Output<ZeroTrustAccessPolicyIncludeExternalEvaluationArgs>> externalEvaluation() {
        return Optional.ofNullable(this.externalEvaluation);
    }

    @Import(name="geo")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeGeoArgs> geo;

    public Optional<Output<ZeroTrustAccessPolicyIncludeGeoArgs>> geo() {
        return Optional.ofNullable(this.geo);
    }

    @Import(name="githubOrganization")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeGithubOrganizationArgs> githubOrganization;

    public Optional<Output<ZeroTrustAccessPolicyIncludeGithubOrganizationArgs>> githubOrganization() {
        return Optional.ofNullable(this.githubOrganization);
    }

    @Import(name="group")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeGroupArgs> group;

    public Optional<Output<ZeroTrustAccessPolicyIncludeGroupArgs>> group() {
        return Optional.ofNullable(this.group);
    }

    @Import(name="gsuite")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeGsuiteArgs> gsuite;

    public Optional<Output<ZeroTrustAccessPolicyIncludeGsuiteArgs>> gsuite() {
        return Optional.ofNullable(this.gsuite);
    }

    @Import(name="ip")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeIpArgs> ip;

    public Optional<Output<ZeroTrustAccessPolicyIncludeIpArgs>> ip() {
        return Optional.ofNullable(this.ip);
    }

    @Import(name="ipList")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeIpListArgs> ipList;

    public Optional<Output<ZeroTrustAccessPolicyIncludeIpListArgs>> ipList() {
        return Optional.ofNullable(this.ipList);
    }

    @Import(name="loginMethod")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeLoginMethodArgs> loginMethod;

    public Optional<Output<ZeroTrustAccessPolicyIncludeLoginMethodArgs>> loginMethod() {
        return Optional.ofNullable(this.loginMethod);
    }

    @Import(name="okta")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeOktaArgs> okta;

    public Optional<Output<ZeroTrustAccessPolicyIncludeOktaArgs>> okta() {
        return Optional.ofNullable(this.okta);
    }

    @Import(name="saml")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeSamlArgs> saml;

    public Optional<Output<ZeroTrustAccessPolicyIncludeSamlArgs>> saml() {
        return Optional.ofNullable(this.saml);
    }

    @Import(name="serviceToken")
    private @Nullable Output<ZeroTrustAccessPolicyIncludeServiceTokenArgs> serviceToken;

    public Optional<Output<ZeroTrustAccessPolicyIncludeServiceTokenArgs>> serviceToken() {
        return Optional.ofNullable(this.serviceToken);
    }

    private ZeroTrustAccessPolicyIncludeArgs() {}

    private ZeroTrustAccessPolicyIncludeArgs(ZeroTrustAccessPolicyIncludeArgs $) {
        this.anyValidServiceToken = $.anyValidServiceToken;
        this.authContext = $.authContext;
        this.authMethod = $.authMethod;
        this.azureAd = $.azureAd;
        this.certificate = $.certificate;
        this.commonName = $.commonName;
        this.devicePosture = $.devicePosture;
        this.email = $.email;
        this.emailDomain = $.emailDomain;
        this.emailList = $.emailList;
        this.everyone = $.everyone;
        this.externalEvaluation = $.externalEvaluation;
        this.geo = $.geo;
        this.githubOrganization = $.githubOrganization;
        this.group = $.group;
        this.gsuite = $.gsuite;
        this.ip = $.ip;
        this.ipList = $.ipList;
        this.loginMethod = $.loginMethod;
        this.okta = $.okta;
        this.saml = $.saml;
        this.serviceToken = $.serviceToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessPolicyIncludeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessPolicyIncludeArgs $;

        public Builder() {
            $ = new ZeroTrustAccessPolicyIncludeArgs();
        }

        public Builder(ZeroTrustAccessPolicyIncludeArgs defaults) {
            $ = new ZeroTrustAccessPolicyIncludeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param anyValidServiceToken An empty object which matches on all service tokens.
         * 
         * @return builder
         * 
         */
        public Builder anyValidServiceToken(@Nullable Output<ZeroTrustAccessPolicyIncludeAnyValidServiceTokenArgs> anyValidServiceToken) {
            $.anyValidServiceToken = anyValidServiceToken;
            return this;
        }

        /**
         * @param anyValidServiceToken An empty object which matches on all service tokens.
         * 
         * @return builder
         * 
         */
        public Builder anyValidServiceToken(ZeroTrustAccessPolicyIncludeAnyValidServiceTokenArgs anyValidServiceToken) {
            return anyValidServiceToken(Output.of(anyValidServiceToken));
        }

        public Builder authContext(@Nullable Output<ZeroTrustAccessPolicyIncludeAuthContextArgs> authContext) {
            $.authContext = authContext;
            return this;
        }

        public Builder authContext(ZeroTrustAccessPolicyIncludeAuthContextArgs authContext) {
            return authContext(Output.of(authContext));
        }

        public Builder authMethod(@Nullable Output<ZeroTrustAccessPolicyIncludeAuthMethodArgs> authMethod) {
            $.authMethod = authMethod;
            return this;
        }

        public Builder authMethod(ZeroTrustAccessPolicyIncludeAuthMethodArgs authMethod) {
            return authMethod(Output.of(authMethod));
        }

        public Builder azureAd(@Nullable Output<ZeroTrustAccessPolicyIncludeAzureAdArgs> azureAd) {
            $.azureAd = azureAd;
            return this;
        }

        public Builder azureAd(ZeroTrustAccessPolicyIncludeAzureAdArgs azureAd) {
            return azureAd(Output.of(azureAd));
        }

        public Builder certificate(@Nullable Output<ZeroTrustAccessPolicyIncludeCertificateArgs> certificate) {
            $.certificate = certificate;
            return this;
        }

        public Builder certificate(ZeroTrustAccessPolicyIncludeCertificateArgs certificate) {
            return certificate(Output.of(certificate));
        }

        public Builder commonName(@Nullable Output<ZeroTrustAccessPolicyIncludeCommonNameArgs> commonName) {
            $.commonName = commonName;
            return this;
        }

        public Builder commonName(ZeroTrustAccessPolicyIncludeCommonNameArgs commonName) {
            return commonName(Output.of(commonName));
        }

        public Builder devicePosture(@Nullable Output<ZeroTrustAccessPolicyIncludeDevicePostureArgs> devicePosture) {
            $.devicePosture = devicePosture;
            return this;
        }

        public Builder devicePosture(ZeroTrustAccessPolicyIncludeDevicePostureArgs devicePosture) {
            return devicePosture(Output.of(devicePosture));
        }

        public Builder email(@Nullable Output<ZeroTrustAccessPolicyIncludeEmailArgs> email) {
            $.email = email;
            return this;
        }

        public Builder email(ZeroTrustAccessPolicyIncludeEmailArgs email) {
            return email(Output.of(email));
        }

        public Builder emailDomain(@Nullable Output<ZeroTrustAccessPolicyIncludeEmailDomainArgs> emailDomain) {
            $.emailDomain = emailDomain;
            return this;
        }

        public Builder emailDomain(ZeroTrustAccessPolicyIncludeEmailDomainArgs emailDomain) {
            return emailDomain(Output.of(emailDomain));
        }

        public Builder emailList(@Nullable Output<ZeroTrustAccessPolicyIncludeEmailListArgs> emailList) {
            $.emailList = emailList;
            return this;
        }

        public Builder emailList(ZeroTrustAccessPolicyIncludeEmailListArgs emailList) {
            return emailList(Output.of(emailList));
        }

        /**
         * @param everyone An empty object which matches on all users.
         * 
         * @return builder
         * 
         */
        public Builder everyone(@Nullable Output<ZeroTrustAccessPolicyIncludeEveryoneArgs> everyone) {
            $.everyone = everyone;
            return this;
        }

        /**
         * @param everyone An empty object which matches on all users.
         * 
         * @return builder
         * 
         */
        public Builder everyone(ZeroTrustAccessPolicyIncludeEveryoneArgs everyone) {
            return everyone(Output.of(everyone));
        }

        public Builder externalEvaluation(@Nullable Output<ZeroTrustAccessPolicyIncludeExternalEvaluationArgs> externalEvaluation) {
            $.externalEvaluation = externalEvaluation;
            return this;
        }

        public Builder externalEvaluation(ZeroTrustAccessPolicyIncludeExternalEvaluationArgs externalEvaluation) {
            return externalEvaluation(Output.of(externalEvaluation));
        }

        public Builder geo(@Nullable Output<ZeroTrustAccessPolicyIncludeGeoArgs> geo) {
            $.geo = geo;
            return this;
        }

        public Builder geo(ZeroTrustAccessPolicyIncludeGeoArgs geo) {
            return geo(Output.of(geo));
        }

        public Builder githubOrganization(@Nullable Output<ZeroTrustAccessPolicyIncludeGithubOrganizationArgs> githubOrganization) {
            $.githubOrganization = githubOrganization;
            return this;
        }

        public Builder githubOrganization(ZeroTrustAccessPolicyIncludeGithubOrganizationArgs githubOrganization) {
            return githubOrganization(Output.of(githubOrganization));
        }

        public Builder group(@Nullable Output<ZeroTrustAccessPolicyIncludeGroupArgs> group) {
            $.group = group;
            return this;
        }

        public Builder group(ZeroTrustAccessPolicyIncludeGroupArgs group) {
            return group(Output.of(group));
        }

        public Builder gsuite(@Nullable Output<ZeroTrustAccessPolicyIncludeGsuiteArgs> gsuite) {
            $.gsuite = gsuite;
            return this;
        }

        public Builder gsuite(ZeroTrustAccessPolicyIncludeGsuiteArgs gsuite) {
            return gsuite(Output.of(gsuite));
        }

        public Builder ip(@Nullable Output<ZeroTrustAccessPolicyIncludeIpArgs> ip) {
            $.ip = ip;
            return this;
        }

        public Builder ip(ZeroTrustAccessPolicyIncludeIpArgs ip) {
            return ip(Output.of(ip));
        }

        public Builder ipList(@Nullable Output<ZeroTrustAccessPolicyIncludeIpListArgs> ipList) {
            $.ipList = ipList;
            return this;
        }

        public Builder ipList(ZeroTrustAccessPolicyIncludeIpListArgs ipList) {
            return ipList(Output.of(ipList));
        }

        public Builder loginMethod(@Nullable Output<ZeroTrustAccessPolicyIncludeLoginMethodArgs> loginMethod) {
            $.loginMethod = loginMethod;
            return this;
        }

        public Builder loginMethod(ZeroTrustAccessPolicyIncludeLoginMethodArgs loginMethod) {
            return loginMethod(Output.of(loginMethod));
        }

        public Builder okta(@Nullable Output<ZeroTrustAccessPolicyIncludeOktaArgs> okta) {
            $.okta = okta;
            return this;
        }

        public Builder okta(ZeroTrustAccessPolicyIncludeOktaArgs okta) {
            return okta(Output.of(okta));
        }

        public Builder saml(@Nullable Output<ZeroTrustAccessPolicyIncludeSamlArgs> saml) {
            $.saml = saml;
            return this;
        }

        public Builder saml(ZeroTrustAccessPolicyIncludeSamlArgs saml) {
            return saml(Output.of(saml));
        }

        public Builder serviceToken(@Nullable Output<ZeroTrustAccessPolicyIncludeServiceTokenArgs> serviceToken) {
            $.serviceToken = serviceToken;
            return this;
        }

        public Builder serviceToken(ZeroTrustAccessPolicyIncludeServiceTokenArgs serviceToken) {
            return serviceToken(Output.of(serviceToken));
        }

        public ZeroTrustAccessPolicyIncludeArgs build() {
            return $;
        }
    }

}
