// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireAnyValidServiceToken;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireAuthContext;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireAuthMethod;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireAzureAd;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireCertificate;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireCommonName;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireDevicePosture;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireEmail;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireEmailDomain;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireEmailList;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireEveryone;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireExternalEvaluation;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireGeo;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireGithubOrganization;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireGroup;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireGsuite;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireIp;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireIpList;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireLoginMethod;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireOkta;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireSaml;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequireServiceToken;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZeroTrustAccessPolicyRequire {
    /**
     * @return An empty object which matches on all service tokens.
     * 
     */
    private @Nullable ZeroTrustAccessPolicyRequireAnyValidServiceToken anyValidServiceToken;
    private @Nullable ZeroTrustAccessPolicyRequireAuthContext authContext;
    private @Nullable ZeroTrustAccessPolicyRequireAuthMethod authMethod;
    private @Nullable ZeroTrustAccessPolicyRequireAzureAd azureAd;
    private @Nullable ZeroTrustAccessPolicyRequireCertificate certificate;
    private @Nullable ZeroTrustAccessPolicyRequireCommonName commonName;
    private @Nullable ZeroTrustAccessPolicyRequireDevicePosture devicePosture;
    private @Nullable ZeroTrustAccessPolicyRequireEmail email;
    private @Nullable ZeroTrustAccessPolicyRequireEmailDomain emailDomain;
    private @Nullable ZeroTrustAccessPolicyRequireEmailList emailList;
    /**
     * @return An empty object which matches on all users.
     * 
     */
    private @Nullable ZeroTrustAccessPolicyRequireEveryone everyone;
    private @Nullable ZeroTrustAccessPolicyRequireExternalEvaluation externalEvaluation;
    private @Nullable ZeroTrustAccessPolicyRequireGeo geo;
    private @Nullable ZeroTrustAccessPolicyRequireGithubOrganization githubOrganization;
    private @Nullable ZeroTrustAccessPolicyRequireGroup group;
    private @Nullable ZeroTrustAccessPolicyRequireGsuite gsuite;
    private @Nullable ZeroTrustAccessPolicyRequireIp ip;
    private @Nullable ZeroTrustAccessPolicyRequireIpList ipList;
    private @Nullable ZeroTrustAccessPolicyRequireLoginMethod loginMethod;
    private @Nullable ZeroTrustAccessPolicyRequireOkta okta;
    private @Nullable ZeroTrustAccessPolicyRequireSaml saml;
    private @Nullable ZeroTrustAccessPolicyRequireServiceToken serviceToken;

    private ZeroTrustAccessPolicyRequire() {}
    /**
     * @return An empty object which matches on all service tokens.
     * 
     */
    public Optional<ZeroTrustAccessPolicyRequireAnyValidServiceToken> anyValidServiceToken() {
        return Optional.ofNullable(this.anyValidServiceToken);
    }
    public Optional<ZeroTrustAccessPolicyRequireAuthContext> authContext() {
        return Optional.ofNullable(this.authContext);
    }
    public Optional<ZeroTrustAccessPolicyRequireAuthMethod> authMethod() {
        return Optional.ofNullable(this.authMethod);
    }
    public Optional<ZeroTrustAccessPolicyRequireAzureAd> azureAd() {
        return Optional.ofNullable(this.azureAd);
    }
    public Optional<ZeroTrustAccessPolicyRequireCertificate> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    public Optional<ZeroTrustAccessPolicyRequireCommonName> commonName() {
        return Optional.ofNullable(this.commonName);
    }
    public Optional<ZeroTrustAccessPolicyRequireDevicePosture> devicePosture() {
        return Optional.ofNullable(this.devicePosture);
    }
    public Optional<ZeroTrustAccessPolicyRequireEmail> email() {
        return Optional.ofNullable(this.email);
    }
    public Optional<ZeroTrustAccessPolicyRequireEmailDomain> emailDomain() {
        return Optional.ofNullable(this.emailDomain);
    }
    public Optional<ZeroTrustAccessPolicyRequireEmailList> emailList() {
        return Optional.ofNullable(this.emailList);
    }
    /**
     * @return An empty object which matches on all users.
     * 
     */
    public Optional<ZeroTrustAccessPolicyRequireEveryone> everyone() {
        return Optional.ofNullable(this.everyone);
    }
    public Optional<ZeroTrustAccessPolicyRequireExternalEvaluation> externalEvaluation() {
        return Optional.ofNullable(this.externalEvaluation);
    }
    public Optional<ZeroTrustAccessPolicyRequireGeo> geo() {
        return Optional.ofNullable(this.geo);
    }
    public Optional<ZeroTrustAccessPolicyRequireGithubOrganization> githubOrganization() {
        return Optional.ofNullable(this.githubOrganization);
    }
    public Optional<ZeroTrustAccessPolicyRequireGroup> group() {
        return Optional.ofNullable(this.group);
    }
    public Optional<ZeroTrustAccessPolicyRequireGsuite> gsuite() {
        return Optional.ofNullable(this.gsuite);
    }
    public Optional<ZeroTrustAccessPolicyRequireIp> ip() {
        return Optional.ofNullable(this.ip);
    }
    public Optional<ZeroTrustAccessPolicyRequireIpList> ipList() {
        return Optional.ofNullable(this.ipList);
    }
    public Optional<ZeroTrustAccessPolicyRequireLoginMethod> loginMethod() {
        return Optional.ofNullable(this.loginMethod);
    }
    public Optional<ZeroTrustAccessPolicyRequireOkta> okta() {
        return Optional.ofNullable(this.okta);
    }
    public Optional<ZeroTrustAccessPolicyRequireSaml> saml() {
        return Optional.ofNullable(this.saml);
    }
    public Optional<ZeroTrustAccessPolicyRequireServiceToken> serviceToken() {
        return Optional.ofNullable(this.serviceToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustAccessPolicyRequire defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ZeroTrustAccessPolicyRequireAnyValidServiceToken anyValidServiceToken;
        private @Nullable ZeroTrustAccessPolicyRequireAuthContext authContext;
        private @Nullable ZeroTrustAccessPolicyRequireAuthMethod authMethod;
        private @Nullable ZeroTrustAccessPolicyRequireAzureAd azureAd;
        private @Nullable ZeroTrustAccessPolicyRequireCertificate certificate;
        private @Nullable ZeroTrustAccessPolicyRequireCommonName commonName;
        private @Nullable ZeroTrustAccessPolicyRequireDevicePosture devicePosture;
        private @Nullable ZeroTrustAccessPolicyRequireEmail email;
        private @Nullable ZeroTrustAccessPolicyRequireEmailDomain emailDomain;
        private @Nullable ZeroTrustAccessPolicyRequireEmailList emailList;
        private @Nullable ZeroTrustAccessPolicyRequireEveryone everyone;
        private @Nullable ZeroTrustAccessPolicyRequireExternalEvaluation externalEvaluation;
        private @Nullable ZeroTrustAccessPolicyRequireGeo geo;
        private @Nullable ZeroTrustAccessPolicyRequireGithubOrganization githubOrganization;
        private @Nullable ZeroTrustAccessPolicyRequireGroup group;
        private @Nullable ZeroTrustAccessPolicyRequireGsuite gsuite;
        private @Nullable ZeroTrustAccessPolicyRequireIp ip;
        private @Nullable ZeroTrustAccessPolicyRequireIpList ipList;
        private @Nullable ZeroTrustAccessPolicyRequireLoginMethod loginMethod;
        private @Nullable ZeroTrustAccessPolicyRequireOkta okta;
        private @Nullable ZeroTrustAccessPolicyRequireSaml saml;
        private @Nullable ZeroTrustAccessPolicyRequireServiceToken serviceToken;
        public Builder() {}
        public Builder(ZeroTrustAccessPolicyRequire defaults) {
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
        public Builder anyValidServiceToken(@Nullable ZeroTrustAccessPolicyRequireAnyValidServiceToken anyValidServiceToken) {

            this.anyValidServiceToken = anyValidServiceToken;
            return this;
        }
        @CustomType.Setter
        public Builder authContext(@Nullable ZeroTrustAccessPolicyRequireAuthContext authContext) {

            this.authContext = authContext;
            return this;
        }
        @CustomType.Setter
        public Builder authMethod(@Nullable ZeroTrustAccessPolicyRequireAuthMethod authMethod) {

            this.authMethod = authMethod;
            return this;
        }
        @CustomType.Setter
        public Builder azureAd(@Nullable ZeroTrustAccessPolicyRequireAzureAd azureAd) {

            this.azureAd = azureAd;
            return this;
        }
        @CustomType.Setter
        public Builder certificate(@Nullable ZeroTrustAccessPolicyRequireCertificate certificate) {

            this.certificate = certificate;
            return this;
        }
        @CustomType.Setter
        public Builder commonName(@Nullable ZeroTrustAccessPolicyRequireCommonName commonName) {

            this.commonName = commonName;
            return this;
        }
        @CustomType.Setter
        public Builder devicePosture(@Nullable ZeroTrustAccessPolicyRequireDevicePosture devicePosture) {

            this.devicePosture = devicePosture;
            return this;
        }
        @CustomType.Setter
        public Builder email(@Nullable ZeroTrustAccessPolicyRequireEmail email) {

            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder emailDomain(@Nullable ZeroTrustAccessPolicyRequireEmailDomain emailDomain) {

            this.emailDomain = emailDomain;
            return this;
        }
        @CustomType.Setter
        public Builder emailList(@Nullable ZeroTrustAccessPolicyRequireEmailList emailList) {

            this.emailList = emailList;
            return this;
        }
        @CustomType.Setter
        public Builder everyone(@Nullable ZeroTrustAccessPolicyRequireEveryone everyone) {

            this.everyone = everyone;
            return this;
        }
        @CustomType.Setter
        public Builder externalEvaluation(@Nullable ZeroTrustAccessPolicyRequireExternalEvaluation externalEvaluation) {

            this.externalEvaluation = externalEvaluation;
            return this;
        }
        @CustomType.Setter
        public Builder geo(@Nullable ZeroTrustAccessPolicyRequireGeo geo) {

            this.geo = geo;
            return this;
        }
        @CustomType.Setter
        public Builder githubOrganization(@Nullable ZeroTrustAccessPolicyRequireGithubOrganization githubOrganization) {

            this.githubOrganization = githubOrganization;
            return this;
        }
        @CustomType.Setter
        public Builder group(@Nullable ZeroTrustAccessPolicyRequireGroup group) {

            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder gsuite(@Nullable ZeroTrustAccessPolicyRequireGsuite gsuite) {

            this.gsuite = gsuite;
            return this;
        }
        @CustomType.Setter
        public Builder ip(@Nullable ZeroTrustAccessPolicyRequireIp ip) {

            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder ipList(@Nullable ZeroTrustAccessPolicyRequireIpList ipList) {

            this.ipList = ipList;
            return this;
        }
        @CustomType.Setter
        public Builder loginMethod(@Nullable ZeroTrustAccessPolicyRequireLoginMethod loginMethod) {

            this.loginMethod = loginMethod;
            return this;
        }
        @CustomType.Setter
        public Builder okta(@Nullable ZeroTrustAccessPolicyRequireOkta okta) {

            this.okta = okta;
            return this;
        }
        @CustomType.Setter
        public Builder saml(@Nullable ZeroTrustAccessPolicyRequireSaml saml) {

            this.saml = saml;
            return this;
        }
        @CustomType.Setter
        public Builder serviceToken(@Nullable ZeroTrustAccessPolicyRequireServiceToken serviceToken) {

            this.serviceToken = serviceToken;
            return this;
        }
        public ZeroTrustAccessPolicyRequire build() {
            final var _resultValue = new ZeroTrustAccessPolicyRequire();
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
