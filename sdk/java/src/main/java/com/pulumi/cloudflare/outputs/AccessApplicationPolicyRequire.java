// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireAnyValidServiceToken;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireAuthContext;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireAuthMethod;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireAzureAd;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireCertificate;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireCommonName;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireDevicePosture;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireEmail;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireEmailDomain;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireEmailList;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireEveryone;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireExternalEvaluation;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireGeo;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireGithubOrganization;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireGroup;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireGsuite;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireIp;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireIpList;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireLoginMethod;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireOkta;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireSaml;
import com.pulumi.cloudflare.outputs.AccessApplicationPolicyRequireServiceToken;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessApplicationPolicyRequire {
    /**
     * @return An empty object which matches on all service tokens.
     * 
     */
    private @Nullable AccessApplicationPolicyRequireAnyValidServiceToken anyValidServiceToken;
    private @Nullable AccessApplicationPolicyRequireAuthContext authContext;
    private @Nullable AccessApplicationPolicyRequireAuthMethod authMethod;
    private @Nullable AccessApplicationPolicyRequireAzureAd azureAd;
    private @Nullable AccessApplicationPolicyRequireCertificate certificate;
    private @Nullable AccessApplicationPolicyRequireCommonName commonName;
    private @Nullable AccessApplicationPolicyRequireDevicePosture devicePosture;
    private @Nullable AccessApplicationPolicyRequireEmail email;
    private @Nullable AccessApplicationPolicyRequireEmailDomain emailDomain;
    private @Nullable AccessApplicationPolicyRequireEmailList emailList;
    /**
     * @return An empty object which matches on all users.
     * 
     */
    private @Nullable AccessApplicationPolicyRequireEveryone everyone;
    private @Nullable AccessApplicationPolicyRequireExternalEvaluation externalEvaluation;
    private @Nullable AccessApplicationPolicyRequireGeo geo;
    private @Nullable AccessApplicationPolicyRequireGithubOrganization githubOrganization;
    private @Nullable AccessApplicationPolicyRequireGroup group;
    private @Nullable AccessApplicationPolicyRequireGsuite gsuite;
    private @Nullable AccessApplicationPolicyRequireIp ip;
    private @Nullable AccessApplicationPolicyRequireIpList ipList;
    private @Nullable AccessApplicationPolicyRequireLoginMethod loginMethod;
    private @Nullable AccessApplicationPolicyRequireOkta okta;
    private @Nullable AccessApplicationPolicyRequireSaml saml;
    private @Nullable AccessApplicationPolicyRequireServiceToken serviceToken;

    private AccessApplicationPolicyRequire() {}
    /**
     * @return An empty object which matches on all service tokens.
     * 
     */
    public Optional<AccessApplicationPolicyRequireAnyValidServiceToken> anyValidServiceToken() {
        return Optional.ofNullable(this.anyValidServiceToken);
    }
    public Optional<AccessApplicationPolicyRequireAuthContext> authContext() {
        return Optional.ofNullable(this.authContext);
    }
    public Optional<AccessApplicationPolicyRequireAuthMethod> authMethod() {
        return Optional.ofNullable(this.authMethod);
    }
    public Optional<AccessApplicationPolicyRequireAzureAd> azureAd() {
        return Optional.ofNullable(this.azureAd);
    }
    public Optional<AccessApplicationPolicyRequireCertificate> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    public Optional<AccessApplicationPolicyRequireCommonName> commonName() {
        return Optional.ofNullable(this.commonName);
    }
    public Optional<AccessApplicationPolicyRequireDevicePosture> devicePosture() {
        return Optional.ofNullable(this.devicePosture);
    }
    public Optional<AccessApplicationPolicyRequireEmail> email() {
        return Optional.ofNullable(this.email);
    }
    public Optional<AccessApplicationPolicyRequireEmailDomain> emailDomain() {
        return Optional.ofNullable(this.emailDomain);
    }
    public Optional<AccessApplicationPolicyRequireEmailList> emailList() {
        return Optional.ofNullable(this.emailList);
    }
    /**
     * @return An empty object which matches on all users.
     * 
     */
    public Optional<AccessApplicationPolicyRequireEveryone> everyone() {
        return Optional.ofNullable(this.everyone);
    }
    public Optional<AccessApplicationPolicyRequireExternalEvaluation> externalEvaluation() {
        return Optional.ofNullable(this.externalEvaluation);
    }
    public Optional<AccessApplicationPolicyRequireGeo> geo() {
        return Optional.ofNullable(this.geo);
    }
    public Optional<AccessApplicationPolicyRequireGithubOrganization> githubOrganization() {
        return Optional.ofNullable(this.githubOrganization);
    }
    public Optional<AccessApplicationPolicyRequireGroup> group() {
        return Optional.ofNullable(this.group);
    }
    public Optional<AccessApplicationPolicyRequireGsuite> gsuite() {
        return Optional.ofNullable(this.gsuite);
    }
    public Optional<AccessApplicationPolicyRequireIp> ip() {
        return Optional.ofNullable(this.ip);
    }
    public Optional<AccessApplicationPolicyRequireIpList> ipList() {
        return Optional.ofNullable(this.ipList);
    }
    public Optional<AccessApplicationPolicyRequireLoginMethod> loginMethod() {
        return Optional.ofNullable(this.loginMethod);
    }
    public Optional<AccessApplicationPolicyRequireOkta> okta() {
        return Optional.ofNullable(this.okta);
    }
    public Optional<AccessApplicationPolicyRequireSaml> saml() {
        return Optional.ofNullable(this.saml);
    }
    public Optional<AccessApplicationPolicyRequireServiceToken> serviceToken() {
        return Optional.ofNullable(this.serviceToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessApplicationPolicyRequire defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AccessApplicationPolicyRequireAnyValidServiceToken anyValidServiceToken;
        private @Nullable AccessApplicationPolicyRequireAuthContext authContext;
        private @Nullable AccessApplicationPolicyRequireAuthMethod authMethod;
        private @Nullable AccessApplicationPolicyRequireAzureAd azureAd;
        private @Nullable AccessApplicationPolicyRequireCertificate certificate;
        private @Nullable AccessApplicationPolicyRequireCommonName commonName;
        private @Nullable AccessApplicationPolicyRequireDevicePosture devicePosture;
        private @Nullable AccessApplicationPolicyRequireEmail email;
        private @Nullable AccessApplicationPolicyRequireEmailDomain emailDomain;
        private @Nullable AccessApplicationPolicyRequireEmailList emailList;
        private @Nullable AccessApplicationPolicyRequireEveryone everyone;
        private @Nullable AccessApplicationPolicyRequireExternalEvaluation externalEvaluation;
        private @Nullable AccessApplicationPolicyRequireGeo geo;
        private @Nullable AccessApplicationPolicyRequireGithubOrganization githubOrganization;
        private @Nullable AccessApplicationPolicyRequireGroup group;
        private @Nullable AccessApplicationPolicyRequireGsuite gsuite;
        private @Nullable AccessApplicationPolicyRequireIp ip;
        private @Nullable AccessApplicationPolicyRequireIpList ipList;
        private @Nullable AccessApplicationPolicyRequireLoginMethod loginMethod;
        private @Nullable AccessApplicationPolicyRequireOkta okta;
        private @Nullable AccessApplicationPolicyRequireSaml saml;
        private @Nullable AccessApplicationPolicyRequireServiceToken serviceToken;
        public Builder() {}
        public Builder(AccessApplicationPolicyRequire defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anyValidServiceToken = defaults.anyValidServiceToken;
    	      this.authContext = defaults.authContext;
    	      this.authMethod = defaults.authMethod;
    	      this.azureAd = defaults.azureAd;
    	      this.certificate = defaults.certificate;
    	      this.commonName = defaults.commonName;
    	      this.devicePosture = defaults.devicePosture;
    	      this.email = defaults.email;
    	      this.emailDomain = defaults.emailDomain;
    	      this.emailList = defaults.emailList;
    	      this.everyone = defaults.everyone;
    	      this.externalEvaluation = defaults.externalEvaluation;
    	      this.geo = defaults.geo;
    	      this.githubOrganization = defaults.githubOrganization;
    	      this.group = defaults.group;
    	      this.gsuite = defaults.gsuite;
    	      this.ip = defaults.ip;
    	      this.ipList = defaults.ipList;
    	      this.loginMethod = defaults.loginMethod;
    	      this.okta = defaults.okta;
    	      this.saml = defaults.saml;
    	      this.serviceToken = defaults.serviceToken;
        }

        @CustomType.Setter
        public Builder anyValidServiceToken(@Nullable AccessApplicationPolicyRequireAnyValidServiceToken anyValidServiceToken) {

            this.anyValidServiceToken = anyValidServiceToken;
            return this;
        }
        @CustomType.Setter
        public Builder authContext(@Nullable AccessApplicationPolicyRequireAuthContext authContext) {

            this.authContext = authContext;
            return this;
        }
        @CustomType.Setter
        public Builder authMethod(@Nullable AccessApplicationPolicyRequireAuthMethod authMethod) {

            this.authMethod = authMethod;
            return this;
        }
        @CustomType.Setter
        public Builder azureAd(@Nullable AccessApplicationPolicyRequireAzureAd azureAd) {

            this.azureAd = azureAd;
            return this;
        }
        @CustomType.Setter
        public Builder certificate(@Nullable AccessApplicationPolicyRequireCertificate certificate) {

            this.certificate = certificate;
            return this;
        }
        @CustomType.Setter
        public Builder commonName(@Nullable AccessApplicationPolicyRequireCommonName commonName) {

            this.commonName = commonName;
            return this;
        }
        @CustomType.Setter
        public Builder devicePosture(@Nullable AccessApplicationPolicyRequireDevicePosture devicePosture) {

            this.devicePosture = devicePosture;
            return this;
        }
        @CustomType.Setter
        public Builder email(@Nullable AccessApplicationPolicyRequireEmail email) {

            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder emailDomain(@Nullable AccessApplicationPolicyRequireEmailDomain emailDomain) {

            this.emailDomain = emailDomain;
            return this;
        }
        @CustomType.Setter
        public Builder emailList(@Nullable AccessApplicationPolicyRequireEmailList emailList) {

            this.emailList = emailList;
            return this;
        }
        @CustomType.Setter
        public Builder everyone(@Nullable AccessApplicationPolicyRequireEveryone everyone) {

            this.everyone = everyone;
            return this;
        }
        @CustomType.Setter
        public Builder externalEvaluation(@Nullable AccessApplicationPolicyRequireExternalEvaluation externalEvaluation) {

            this.externalEvaluation = externalEvaluation;
            return this;
        }
        @CustomType.Setter
        public Builder geo(@Nullable AccessApplicationPolicyRequireGeo geo) {

            this.geo = geo;
            return this;
        }
        @CustomType.Setter
        public Builder githubOrganization(@Nullable AccessApplicationPolicyRequireGithubOrganization githubOrganization) {

            this.githubOrganization = githubOrganization;
            return this;
        }
        @CustomType.Setter
        public Builder group(@Nullable AccessApplicationPolicyRequireGroup group) {

            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder gsuite(@Nullable AccessApplicationPolicyRequireGsuite gsuite) {

            this.gsuite = gsuite;
            return this;
        }
        @CustomType.Setter
        public Builder ip(@Nullable AccessApplicationPolicyRequireIp ip) {

            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder ipList(@Nullable AccessApplicationPolicyRequireIpList ipList) {

            this.ipList = ipList;
            return this;
        }
        @CustomType.Setter
        public Builder loginMethod(@Nullable AccessApplicationPolicyRequireLoginMethod loginMethod) {

            this.loginMethod = loginMethod;
            return this;
        }
        @CustomType.Setter
        public Builder okta(@Nullable AccessApplicationPolicyRequireOkta okta) {

            this.okta = okta;
            return this;
        }
        @CustomType.Setter
        public Builder saml(@Nullable AccessApplicationPolicyRequireSaml saml) {

            this.saml = saml;
            return this;
        }
        @CustomType.Setter
        public Builder serviceToken(@Nullable AccessApplicationPolicyRequireServiceToken serviceToken) {

            this.serviceToken = serviceToken;
            return this;
        }
        public AccessApplicationPolicyRequire build() {
            final var _resultValue = new AccessApplicationPolicyRequire();
            _resultValue.anyValidServiceToken = anyValidServiceToken;
            _resultValue.authContext = authContext;
            _resultValue.authMethod = authMethod;
            _resultValue.azureAd = azureAd;
            _resultValue.certificate = certificate;
            _resultValue.commonName = commonName;
            _resultValue.devicePosture = devicePosture;
            _resultValue.email = email;
            _resultValue.emailDomain = emailDomain;
            _resultValue.emailList = emailList;
            _resultValue.everyone = everyone;
            _resultValue.externalEvaluation = externalEvaluation;
            _resultValue.geo = geo;
            _resultValue.githubOrganization = githubOrganization;
            _resultValue.group = group;
            _resultValue.gsuite = gsuite;
            _resultValue.ip = ip;
            _resultValue.ipList = ipList;
            _resultValue.loginMethod = loginMethod;
            _resultValue.okta = okta;
            _resultValue.saml = saml;
            _resultValue.serviceToken = serviceToken;
            return _resultValue;
        }
    }
}
