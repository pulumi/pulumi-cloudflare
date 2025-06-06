// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeAnyValidServiceToken;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeAuthContext;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeAuthMethod;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeAzureAd;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeCertificate;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeCommonName;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeDevicePosture;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeEmail;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeEmailDomain;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeEmailList;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeEveryone;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeExternalEvaluation;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeGeo;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeGithubOrganization;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeGroup;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeGsuite;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeIp;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeIpList;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeLoginMethod;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeOkta;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeSaml;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesResultExcludeServiceToken;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;

@CustomType
public final class GetZeroTrustAccessPoliciesResultExclude {
    /**
     * @return An empty object which matches on all service tokens.
     * 
     */
    private GetZeroTrustAccessPoliciesResultExcludeAnyValidServiceToken anyValidServiceToken;
    private GetZeroTrustAccessPoliciesResultExcludeAuthContext authContext;
    private GetZeroTrustAccessPoliciesResultExcludeAuthMethod authMethod;
    private GetZeroTrustAccessPoliciesResultExcludeAzureAd azureAd;
    private GetZeroTrustAccessPoliciesResultExcludeCertificate certificate;
    private GetZeroTrustAccessPoliciesResultExcludeCommonName commonName;
    private GetZeroTrustAccessPoliciesResultExcludeDevicePosture devicePosture;
    private GetZeroTrustAccessPoliciesResultExcludeEmail email;
    private GetZeroTrustAccessPoliciesResultExcludeEmailDomain emailDomain;
    private GetZeroTrustAccessPoliciesResultExcludeEmailList emailList;
    /**
     * @return An empty object which matches on all users.
     * 
     */
    private GetZeroTrustAccessPoliciesResultExcludeEveryone everyone;
    private GetZeroTrustAccessPoliciesResultExcludeExternalEvaluation externalEvaluation;
    private GetZeroTrustAccessPoliciesResultExcludeGeo geo;
    private GetZeroTrustAccessPoliciesResultExcludeGithubOrganization githubOrganization;
    private GetZeroTrustAccessPoliciesResultExcludeGroup group;
    private GetZeroTrustAccessPoliciesResultExcludeGsuite gsuite;
    private GetZeroTrustAccessPoliciesResultExcludeIp ip;
    private GetZeroTrustAccessPoliciesResultExcludeIpList ipList;
    private GetZeroTrustAccessPoliciesResultExcludeLoginMethod loginMethod;
    private GetZeroTrustAccessPoliciesResultExcludeOkta okta;
    private GetZeroTrustAccessPoliciesResultExcludeSaml saml;
    private GetZeroTrustAccessPoliciesResultExcludeServiceToken serviceToken;

    private GetZeroTrustAccessPoliciesResultExclude() {}
    /**
     * @return An empty object which matches on all service tokens.
     * 
     */
    public GetZeroTrustAccessPoliciesResultExcludeAnyValidServiceToken anyValidServiceToken() {
        return this.anyValidServiceToken;
    }
    public GetZeroTrustAccessPoliciesResultExcludeAuthContext authContext() {
        return this.authContext;
    }
    public GetZeroTrustAccessPoliciesResultExcludeAuthMethod authMethod() {
        return this.authMethod;
    }
    public GetZeroTrustAccessPoliciesResultExcludeAzureAd azureAd() {
        return this.azureAd;
    }
    public GetZeroTrustAccessPoliciesResultExcludeCertificate certificate() {
        return this.certificate;
    }
    public GetZeroTrustAccessPoliciesResultExcludeCommonName commonName() {
        return this.commonName;
    }
    public GetZeroTrustAccessPoliciesResultExcludeDevicePosture devicePosture() {
        return this.devicePosture;
    }
    public GetZeroTrustAccessPoliciesResultExcludeEmail email() {
        return this.email;
    }
    public GetZeroTrustAccessPoliciesResultExcludeEmailDomain emailDomain() {
        return this.emailDomain;
    }
    public GetZeroTrustAccessPoliciesResultExcludeEmailList emailList() {
        return this.emailList;
    }
    /**
     * @return An empty object which matches on all users.
     * 
     */
    public GetZeroTrustAccessPoliciesResultExcludeEveryone everyone() {
        return this.everyone;
    }
    public GetZeroTrustAccessPoliciesResultExcludeExternalEvaluation externalEvaluation() {
        return this.externalEvaluation;
    }
    public GetZeroTrustAccessPoliciesResultExcludeGeo geo() {
        return this.geo;
    }
    public GetZeroTrustAccessPoliciesResultExcludeGithubOrganization githubOrganization() {
        return this.githubOrganization;
    }
    public GetZeroTrustAccessPoliciesResultExcludeGroup group() {
        return this.group;
    }
    public GetZeroTrustAccessPoliciesResultExcludeGsuite gsuite() {
        return this.gsuite;
    }
    public GetZeroTrustAccessPoliciesResultExcludeIp ip() {
        return this.ip;
    }
    public GetZeroTrustAccessPoliciesResultExcludeIpList ipList() {
        return this.ipList;
    }
    public GetZeroTrustAccessPoliciesResultExcludeLoginMethod loginMethod() {
        return this.loginMethod;
    }
    public GetZeroTrustAccessPoliciesResultExcludeOkta okta() {
        return this.okta;
    }
    public GetZeroTrustAccessPoliciesResultExcludeSaml saml() {
        return this.saml;
    }
    public GetZeroTrustAccessPoliciesResultExcludeServiceToken serviceToken() {
        return this.serviceToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustAccessPoliciesResultExclude defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetZeroTrustAccessPoliciesResultExcludeAnyValidServiceToken anyValidServiceToken;
        private GetZeroTrustAccessPoliciesResultExcludeAuthContext authContext;
        private GetZeroTrustAccessPoliciesResultExcludeAuthMethod authMethod;
        private GetZeroTrustAccessPoliciesResultExcludeAzureAd azureAd;
        private GetZeroTrustAccessPoliciesResultExcludeCertificate certificate;
        private GetZeroTrustAccessPoliciesResultExcludeCommonName commonName;
        private GetZeroTrustAccessPoliciesResultExcludeDevicePosture devicePosture;
        private GetZeroTrustAccessPoliciesResultExcludeEmail email;
        private GetZeroTrustAccessPoliciesResultExcludeEmailDomain emailDomain;
        private GetZeroTrustAccessPoliciesResultExcludeEmailList emailList;
        private GetZeroTrustAccessPoliciesResultExcludeEveryone everyone;
        private GetZeroTrustAccessPoliciesResultExcludeExternalEvaluation externalEvaluation;
        private GetZeroTrustAccessPoliciesResultExcludeGeo geo;
        private GetZeroTrustAccessPoliciesResultExcludeGithubOrganization githubOrganization;
        private GetZeroTrustAccessPoliciesResultExcludeGroup group;
        private GetZeroTrustAccessPoliciesResultExcludeGsuite gsuite;
        private GetZeroTrustAccessPoliciesResultExcludeIp ip;
        private GetZeroTrustAccessPoliciesResultExcludeIpList ipList;
        private GetZeroTrustAccessPoliciesResultExcludeLoginMethod loginMethod;
        private GetZeroTrustAccessPoliciesResultExcludeOkta okta;
        private GetZeroTrustAccessPoliciesResultExcludeSaml saml;
        private GetZeroTrustAccessPoliciesResultExcludeServiceToken serviceToken;
        public Builder() {}
        public Builder(GetZeroTrustAccessPoliciesResultExclude defaults) {
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
        public Builder anyValidServiceToken(GetZeroTrustAccessPoliciesResultExcludeAnyValidServiceToken anyValidServiceToken) {
            if (anyValidServiceToken == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "anyValidServiceToken");
            }
            this.anyValidServiceToken = anyValidServiceToken;
            return this;
        }
        @CustomType.Setter
        public Builder authContext(GetZeroTrustAccessPoliciesResultExcludeAuthContext authContext) {
            if (authContext == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "authContext");
            }
            this.authContext = authContext;
            return this;
        }
        @CustomType.Setter
        public Builder authMethod(GetZeroTrustAccessPoliciesResultExcludeAuthMethod authMethod) {
            if (authMethod == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "authMethod");
            }
            this.authMethod = authMethod;
            return this;
        }
        @CustomType.Setter
        public Builder azureAd(GetZeroTrustAccessPoliciesResultExcludeAzureAd azureAd) {
            if (azureAd == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "azureAd");
            }
            this.azureAd = azureAd;
            return this;
        }
        @CustomType.Setter
        public Builder certificate(GetZeroTrustAccessPoliciesResultExcludeCertificate certificate) {
            if (certificate == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "certificate");
            }
            this.certificate = certificate;
            return this;
        }
        @CustomType.Setter
        public Builder commonName(GetZeroTrustAccessPoliciesResultExcludeCommonName commonName) {
            if (commonName == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "commonName");
            }
            this.commonName = commonName;
            return this;
        }
        @CustomType.Setter
        public Builder devicePosture(GetZeroTrustAccessPoliciesResultExcludeDevicePosture devicePosture) {
            if (devicePosture == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "devicePosture");
            }
            this.devicePosture = devicePosture;
            return this;
        }
        @CustomType.Setter
        public Builder email(GetZeroTrustAccessPoliciesResultExcludeEmail email) {
            if (email == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "email");
            }
            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder emailDomain(GetZeroTrustAccessPoliciesResultExcludeEmailDomain emailDomain) {
            if (emailDomain == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "emailDomain");
            }
            this.emailDomain = emailDomain;
            return this;
        }
        @CustomType.Setter
        public Builder emailList(GetZeroTrustAccessPoliciesResultExcludeEmailList emailList) {
            if (emailList == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "emailList");
            }
            this.emailList = emailList;
            return this;
        }
        @CustomType.Setter
        public Builder everyone(GetZeroTrustAccessPoliciesResultExcludeEveryone everyone) {
            if (everyone == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "everyone");
            }
            this.everyone = everyone;
            return this;
        }
        @CustomType.Setter
        public Builder externalEvaluation(GetZeroTrustAccessPoliciesResultExcludeExternalEvaluation externalEvaluation) {
            if (externalEvaluation == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "externalEvaluation");
            }
            this.externalEvaluation = externalEvaluation;
            return this;
        }
        @CustomType.Setter
        public Builder geo(GetZeroTrustAccessPoliciesResultExcludeGeo geo) {
            if (geo == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "geo");
            }
            this.geo = geo;
            return this;
        }
        @CustomType.Setter
        public Builder githubOrganization(GetZeroTrustAccessPoliciesResultExcludeGithubOrganization githubOrganization) {
            if (githubOrganization == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "githubOrganization");
            }
            this.githubOrganization = githubOrganization;
            return this;
        }
        @CustomType.Setter
        public Builder group(GetZeroTrustAccessPoliciesResultExcludeGroup group) {
            if (group == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "group");
            }
            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder gsuite(GetZeroTrustAccessPoliciesResultExcludeGsuite gsuite) {
            if (gsuite == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "gsuite");
            }
            this.gsuite = gsuite;
            return this;
        }
        @CustomType.Setter
        public Builder ip(GetZeroTrustAccessPoliciesResultExcludeIp ip) {
            if (ip == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "ip");
            }
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder ipList(GetZeroTrustAccessPoliciesResultExcludeIpList ipList) {
            if (ipList == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "ipList");
            }
            this.ipList = ipList;
            return this;
        }
        @CustomType.Setter
        public Builder loginMethod(GetZeroTrustAccessPoliciesResultExcludeLoginMethod loginMethod) {
            if (loginMethod == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "loginMethod");
            }
            this.loginMethod = loginMethod;
            return this;
        }
        @CustomType.Setter
        public Builder okta(GetZeroTrustAccessPoliciesResultExcludeOkta okta) {
            if (okta == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "okta");
            }
            this.okta = okta;
            return this;
        }
        @CustomType.Setter
        public Builder saml(GetZeroTrustAccessPoliciesResultExcludeSaml saml) {
            if (saml == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "saml");
            }
            this.saml = saml;
            return this;
        }
        @CustomType.Setter
        public Builder serviceToken(GetZeroTrustAccessPoliciesResultExcludeServiceToken serviceToken) {
            if (serviceToken == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessPoliciesResultExclude", "serviceToken");
            }
            this.serviceToken = serviceToken;
            return this;
        }
        public GetZeroTrustAccessPoliciesResultExclude build() {
            final var _resultValue = new GetZeroTrustAccessPoliciesResultExclude();
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
