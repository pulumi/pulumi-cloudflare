// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.AccessPolicyRequireAnyValidServiceTokenArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireAuthContextArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireAuthMethodArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireAzureAdArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireCertificateArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireCommonNameArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireDevicePostureArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireEmailArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireEmailDomainArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireEmailListArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireEveryoneArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireExternalEvaluationArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireGeoArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireGithubOrganizationArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireGroupArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireGsuiteArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireIpArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireIpListArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireLoginMethodArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireOktaArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireSamlArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireServiceTokenArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPolicyRequireArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPolicyRequireArgs Empty = new AccessPolicyRequireArgs();

    /**
     * An empty object which matches on all service tokens.
     * 
     */
    @Import(name="anyValidServiceToken")
    private @Nullable Output<AccessPolicyRequireAnyValidServiceTokenArgs> anyValidServiceToken;

    /**
     * @return An empty object which matches on all service tokens.
     * 
     */
    public Optional<Output<AccessPolicyRequireAnyValidServiceTokenArgs>> anyValidServiceToken() {
        return Optional.ofNullable(this.anyValidServiceToken);
    }

    @Import(name="authContext")
    private @Nullable Output<AccessPolicyRequireAuthContextArgs> authContext;

    public Optional<Output<AccessPolicyRequireAuthContextArgs>> authContext() {
        return Optional.ofNullable(this.authContext);
    }

    @Import(name="authMethod")
    private @Nullable Output<AccessPolicyRequireAuthMethodArgs> authMethod;

    public Optional<Output<AccessPolicyRequireAuthMethodArgs>> authMethod() {
        return Optional.ofNullable(this.authMethod);
    }

    @Import(name="azureAd")
    private @Nullable Output<AccessPolicyRequireAzureAdArgs> azureAd;

    public Optional<Output<AccessPolicyRequireAzureAdArgs>> azureAd() {
        return Optional.ofNullable(this.azureAd);
    }

    @Import(name="certificate")
    private @Nullable Output<AccessPolicyRequireCertificateArgs> certificate;

    public Optional<Output<AccessPolicyRequireCertificateArgs>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    @Import(name="commonName")
    private @Nullable Output<AccessPolicyRequireCommonNameArgs> commonName;

    public Optional<Output<AccessPolicyRequireCommonNameArgs>> commonName() {
        return Optional.ofNullable(this.commonName);
    }

    @Import(name="devicePosture")
    private @Nullable Output<AccessPolicyRequireDevicePostureArgs> devicePosture;

    public Optional<Output<AccessPolicyRequireDevicePostureArgs>> devicePosture() {
        return Optional.ofNullable(this.devicePosture);
    }

    @Import(name="email")
    private @Nullable Output<AccessPolicyRequireEmailArgs> email;

    public Optional<Output<AccessPolicyRequireEmailArgs>> email() {
        return Optional.ofNullable(this.email);
    }

    @Import(name="emailDomain")
    private @Nullable Output<AccessPolicyRequireEmailDomainArgs> emailDomain;

    public Optional<Output<AccessPolicyRequireEmailDomainArgs>> emailDomain() {
        return Optional.ofNullable(this.emailDomain);
    }

    @Import(name="emailList")
    private @Nullable Output<AccessPolicyRequireEmailListArgs> emailList;

    public Optional<Output<AccessPolicyRequireEmailListArgs>> emailList() {
        return Optional.ofNullable(this.emailList);
    }

    /**
     * An empty object which matches on all users.
     * 
     */
    @Import(name="everyone")
    private @Nullable Output<AccessPolicyRequireEveryoneArgs> everyone;

    /**
     * @return An empty object which matches on all users.
     * 
     */
    public Optional<Output<AccessPolicyRequireEveryoneArgs>> everyone() {
        return Optional.ofNullable(this.everyone);
    }

    @Import(name="externalEvaluation")
    private @Nullable Output<AccessPolicyRequireExternalEvaluationArgs> externalEvaluation;

    public Optional<Output<AccessPolicyRequireExternalEvaluationArgs>> externalEvaluation() {
        return Optional.ofNullable(this.externalEvaluation);
    }

    @Import(name="geo")
    private @Nullable Output<AccessPolicyRequireGeoArgs> geo;

    public Optional<Output<AccessPolicyRequireGeoArgs>> geo() {
        return Optional.ofNullable(this.geo);
    }

    @Import(name="githubOrganization")
    private @Nullable Output<AccessPolicyRequireGithubOrganizationArgs> githubOrganization;

    public Optional<Output<AccessPolicyRequireGithubOrganizationArgs>> githubOrganization() {
        return Optional.ofNullable(this.githubOrganization);
    }

    @Import(name="group")
    private @Nullable Output<AccessPolicyRequireGroupArgs> group;

    public Optional<Output<AccessPolicyRequireGroupArgs>> group() {
        return Optional.ofNullable(this.group);
    }

    @Import(name="gsuite")
    private @Nullable Output<AccessPolicyRequireGsuiteArgs> gsuite;

    public Optional<Output<AccessPolicyRequireGsuiteArgs>> gsuite() {
        return Optional.ofNullable(this.gsuite);
    }

    @Import(name="ip")
    private @Nullable Output<AccessPolicyRequireIpArgs> ip;

    public Optional<Output<AccessPolicyRequireIpArgs>> ip() {
        return Optional.ofNullable(this.ip);
    }

    @Import(name="ipList")
    private @Nullable Output<AccessPolicyRequireIpListArgs> ipList;

    public Optional<Output<AccessPolicyRequireIpListArgs>> ipList() {
        return Optional.ofNullable(this.ipList);
    }

    @Import(name="loginMethod")
    private @Nullable Output<AccessPolicyRequireLoginMethodArgs> loginMethod;

    public Optional<Output<AccessPolicyRequireLoginMethodArgs>> loginMethod() {
        return Optional.ofNullable(this.loginMethod);
    }

    @Import(name="okta")
    private @Nullable Output<AccessPolicyRequireOktaArgs> okta;

    public Optional<Output<AccessPolicyRequireOktaArgs>> okta() {
        return Optional.ofNullable(this.okta);
    }

    @Import(name="saml")
    private @Nullable Output<AccessPolicyRequireSamlArgs> saml;

    public Optional<Output<AccessPolicyRequireSamlArgs>> saml() {
        return Optional.ofNullable(this.saml);
    }

    @Import(name="serviceToken")
    private @Nullable Output<AccessPolicyRequireServiceTokenArgs> serviceToken;

    public Optional<Output<AccessPolicyRequireServiceTokenArgs>> serviceToken() {
        return Optional.ofNullable(this.serviceToken);
    }

    private AccessPolicyRequireArgs() {}

    private AccessPolicyRequireArgs(AccessPolicyRequireArgs $) {
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
    public static Builder builder(AccessPolicyRequireArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPolicyRequireArgs $;

        public Builder() {
            $ = new AccessPolicyRequireArgs();
        }

        public Builder(AccessPolicyRequireArgs defaults) {
            $ = new AccessPolicyRequireArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param anyValidServiceToken An empty object which matches on all service tokens.
         * 
         * @return builder
         * 
         */
        public Builder anyValidServiceToken(@Nullable Output<AccessPolicyRequireAnyValidServiceTokenArgs> anyValidServiceToken) {
            $.anyValidServiceToken = anyValidServiceToken;
            return this;
        }

        /**
         * @param anyValidServiceToken An empty object which matches on all service tokens.
         * 
         * @return builder
         * 
         */
        public Builder anyValidServiceToken(AccessPolicyRequireAnyValidServiceTokenArgs anyValidServiceToken) {
            return anyValidServiceToken(Output.of(anyValidServiceToken));
        }

        public Builder authContext(@Nullable Output<AccessPolicyRequireAuthContextArgs> authContext) {
            $.authContext = authContext;
            return this;
        }

        public Builder authContext(AccessPolicyRequireAuthContextArgs authContext) {
            return authContext(Output.of(authContext));
        }

        public Builder authMethod(@Nullable Output<AccessPolicyRequireAuthMethodArgs> authMethod) {
            $.authMethod = authMethod;
            return this;
        }

        public Builder authMethod(AccessPolicyRequireAuthMethodArgs authMethod) {
            return authMethod(Output.of(authMethod));
        }

        public Builder azureAd(@Nullable Output<AccessPolicyRequireAzureAdArgs> azureAd) {
            $.azureAd = azureAd;
            return this;
        }

        public Builder azureAd(AccessPolicyRequireAzureAdArgs azureAd) {
            return azureAd(Output.of(azureAd));
        }

        public Builder certificate(@Nullable Output<AccessPolicyRequireCertificateArgs> certificate) {
            $.certificate = certificate;
            return this;
        }

        public Builder certificate(AccessPolicyRequireCertificateArgs certificate) {
            return certificate(Output.of(certificate));
        }

        public Builder commonName(@Nullable Output<AccessPolicyRequireCommonNameArgs> commonName) {
            $.commonName = commonName;
            return this;
        }

        public Builder commonName(AccessPolicyRequireCommonNameArgs commonName) {
            return commonName(Output.of(commonName));
        }

        public Builder devicePosture(@Nullable Output<AccessPolicyRequireDevicePostureArgs> devicePosture) {
            $.devicePosture = devicePosture;
            return this;
        }

        public Builder devicePosture(AccessPolicyRequireDevicePostureArgs devicePosture) {
            return devicePosture(Output.of(devicePosture));
        }

        public Builder email(@Nullable Output<AccessPolicyRequireEmailArgs> email) {
            $.email = email;
            return this;
        }

        public Builder email(AccessPolicyRequireEmailArgs email) {
            return email(Output.of(email));
        }

        public Builder emailDomain(@Nullable Output<AccessPolicyRequireEmailDomainArgs> emailDomain) {
            $.emailDomain = emailDomain;
            return this;
        }

        public Builder emailDomain(AccessPolicyRequireEmailDomainArgs emailDomain) {
            return emailDomain(Output.of(emailDomain));
        }

        public Builder emailList(@Nullable Output<AccessPolicyRequireEmailListArgs> emailList) {
            $.emailList = emailList;
            return this;
        }

        public Builder emailList(AccessPolicyRequireEmailListArgs emailList) {
            return emailList(Output.of(emailList));
        }

        /**
         * @param everyone An empty object which matches on all users.
         * 
         * @return builder
         * 
         */
        public Builder everyone(@Nullable Output<AccessPolicyRequireEveryoneArgs> everyone) {
            $.everyone = everyone;
            return this;
        }

        /**
         * @param everyone An empty object which matches on all users.
         * 
         * @return builder
         * 
         */
        public Builder everyone(AccessPolicyRequireEveryoneArgs everyone) {
            return everyone(Output.of(everyone));
        }

        public Builder externalEvaluation(@Nullable Output<AccessPolicyRequireExternalEvaluationArgs> externalEvaluation) {
            $.externalEvaluation = externalEvaluation;
            return this;
        }

        public Builder externalEvaluation(AccessPolicyRequireExternalEvaluationArgs externalEvaluation) {
            return externalEvaluation(Output.of(externalEvaluation));
        }

        public Builder geo(@Nullable Output<AccessPolicyRequireGeoArgs> geo) {
            $.geo = geo;
            return this;
        }

        public Builder geo(AccessPolicyRequireGeoArgs geo) {
            return geo(Output.of(geo));
        }

        public Builder githubOrganization(@Nullable Output<AccessPolicyRequireGithubOrganizationArgs> githubOrganization) {
            $.githubOrganization = githubOrganization;
            return this;
        }

        public Builder githubOrganization(AccessPolicyRequireGithubOrganizationArgs githubOrganization) {
            return githubOrganization(Output.of(githubOrganization));
        }

        public Builder group(@Nullable Output<AccessPolicyRequireGroupArgs> group) {
            $.group = group;
            return this;
        }

        public Builder group(AccessPolicyRequireGroupArgs group) {
            return group(Output.of(group));
        }

        public Builder gsuite(@Nullable Output<AccessPolicyRequireGsuiteArgs> gsuite) {
            $.gsuite = gsuite;
            return this;
        }

        public Builder gsuite(AccessPolicyRequireGsuiteArgs gsuite) {
            return gsuite(Output.of(gsuite));
        }

        public Builder ip(@Nullable Output<AccessPolicyRequireIpArgs> ip) {
            $.ip = ip;
            return this;
        }

        public Builder ip(AccessPolicyRequireIpArgs ip) {
            return ip(Output.of(ip));
        }

        public Builder ipList(@Nullable Output<AccessPolicyRequireIpListArgs> ipList) {
            $.ipList = ipList;
            return this;
        }

        public Builder ipList(AccessPolicyRequireIpListArgs ipList) {
            return ipList(Output.of(ipList));
        }

        public Builder loginMethod(@Nullable Output<AccessPolicyRequireLoginMethodArgs> loginMethod) {
            $.loginMethod = loginMethod;
            return this;
        }

        public Builder loginMethod(AccessPolicyRequireLoginMethodArgs loginMethod) {
            return loginMethod(Output.of(loginMethod));
        }

        public Builder okta(@Nullable Output<AccessPolicyRequireOktaArgs> okta) {
            $.okta = okta;
            return this;
        }

        public Builder okta(AccessPolicyRequireOktaArgs okta) {
            return okta(Output.of(okta));
        }

        public Builder saml(@Nullable Output<AccessPolicyRequireSamlArgs> saml) {
            $.saml = saml;
            return this;
        }

        public Builder saml(AccessPolicyRequireSamlArgs saml) {
            return saml(Output.of(saml));
        }

        public Builder serviceToken(@Nullable Output<AccessPolicyRequireServiceTokenArgs> serviceToken) {
            $.serviceToken = serviceToken;
            return this;
        }

        public Builder serviceToken(AccessPolicyRequireServiceTokenArgs serviceToken) {
            return serviceToken(Output.of(serviceToken));
        }

        public AccessPolicyRequireArgs build() {
            return $;
        }
    }

}
