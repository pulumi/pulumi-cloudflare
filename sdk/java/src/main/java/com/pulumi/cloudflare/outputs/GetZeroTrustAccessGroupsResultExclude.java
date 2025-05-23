// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeAnyValidServiceToken;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeAuthContext;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeAuthMethod;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeAzureAd;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeCertificate;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeCommonName;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeDevicePosture;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeEmail;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeEmailDomain;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeEmailList;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeEveryone;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeExternalEvaluation;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeGeo;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeGithubOrganization;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeGroup;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeGsuite;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeIp;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeIpList;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeLoginMethod;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeOkta;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeSaml;
import com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsResultExcludeServiceToken;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;

@CustomType
public final class GetZeroTrustAccessGroupsResultExclude {
    /**
     * @return An empty object which matches on all service tokens.
     * 
     */
    private GetZeroTrustAccessGroupsResultExcludeAnyValidServiceToken anyValidServiceToken;
    private GetZeroTrustAccessGroupsResultExcludeAuthContext authContext;
    private GetZeroTrustAccessGroupsResultExcludeAuthMethod authMethod;
    private GetZeroTrustAccessGroupsResultExcludeAzureAd azureAd;
    private GetZeroTrustAccessGroupsResultExcludeCertificate certificate;
    private GetZeroTrustAccessGroupsResultExcludeCommonName commonName;
    private GetZeroTrustAccessGroupsResultExcludeDevicePosture devicePosture;
    private GetZeroTrustAccessGroupsResultExcludeEmail email;
    private GetZeroTrustAccessGroupsResultExcludeEmailDomain emailDomain;
    private GetZeroTrustAccessGroupsResultExcludeEmailList emailList;
    /**
     * @return An empty object which matches on all users.
     * 
     */
    private GetZeroTrustAccessGroupsResultExcludeEveryone everyone;
    private GetZeroTrustAccessGroupsResultExcludeExternalEvaluation externalEvaluation;
    private GetZeroTrustAccessGroupsResultExcludeGeo geo;
    private GetZeroTrustAccessGroupsResultExcludeGithubOrganization githubOrganization;
    private GetZeroTrustAccessGroupsResultExcludeGroup group;
    private GetZeroTrustAccessGroupsResultExcludeGsuite gsuite;
    private GetZeroTrustAccessGroupsResultExcludeIp ip;
    private GetZeroTrustAccessGroupsResultExcludeIpList ipList;
    private GetZeroTrustAccessGroupsResultExcludeLoginMethod loginMethod;
    private GetZeroTrustAccessGroupsResultExcludeOkta okta;
    private GetZeroTrustAccessGroupsResultExcludeSaml saml;
    private GetZeroTrustAccessGroupsResultExcludeServiceToken serviceToken;

    private GetZeroTrustAccessGroupsResultExclude() {}
    /**
     * @return An empty object which matches on all service tokens.
     * 
     */
    public GetZeroTrustAccessGroupsResultExcludeAnyValidServiceToken anyValidServiceToken() {
        return this.anyValidServiceToken;
    }
    public GetZeroTrustAccessGroupsResultExcludeAuthContext authContext() {
        return this.authContext;
    }
    public GetZeroTrustAccessGroupsResultExcludeAuthMethod authMethod() {
        return this.authMethod;
    }
    public GetZeroTrustAccessGroupsResultExcludeAzureAd azureAd() {
        return this.azureAd;
    }
    public GetZeroTrustAccessGroupsResultExcludeCertificate certificate() {
        return this.certificate;
    }
    public GetZeroTrustAccessGroupsResultExcludeCommonName commonName() {
        return this.commonName;
    }
    public GetZeroTrustAccessGroupsResultExcludeDevicePosture devicePosture() {
        return this.devicePosture;
    }
    public GetZeroTrustAccessGroupsResultExcludeEmail email() {
        return this.email;
    }
    public GetZeroTrustAccessGroupsResultExcludeEmailDomain emailDomain() {
        return this.emailDomain;
    }
    public GetZeroTrustAccessGroupsResultExcludeEmailList emailList() {
        return this.emailList;
    }
    /**
     * @return An empty object which matches on all users.
     * 
     */
    public GetZeroTrustAccessGroupsResultExcludeEveryone everyone() {
        return this.everyone;
    }
    public GetZeroTrustAccessGroupsResultExcludeExternalEvaluation externalEvaluation() {
        return this.externalEvaluation;
    }
    public GetZeroTrustAccessGroupsResultExcludeGeo geo() {
        return this.geo;
    }
    public GetZeroTrustAccessGroupsResultExcludeGithubOrganization githubOrganization() {
        return this.githubOrganization;
    }
    public GetZeroTrustAccessGroupsResultExcludeGroup group() {
        return this.group;
    }
    public GetZeroTrustAccessGroupsResultExcludeGsuite gsuite() {
        return this.gsuite;
    }
    public GetZeroTrustAccessGroupsResultExcludeIp ip() {
        return this.ip;
    }
    public GetZeroTrustAccessGroupsResultExcludeIpList ipList() {
        return this.ipList;
    }
    public GetZeroTrustAccessGroupsResultExcludeLoginMethod loginMethod() {
        return this.loginMethod;
    }
    public GetZeroTrustAccessGroupsResultExcludeOkta okta() {
        return this.okta;
    }
    public GetZeroTrustAccessGroupsResultExcludeSaml saml() {
        return this.saml;
    }
    public GetZeroTrustAccessGroupsResultExcludeServiceToken serviceToken() {
        return this.serviceToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustAccessGroupsResultExclude defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetZeroTrustAccessGroupsResultExcludeAnyValidServiceToken anyValidServiceToken;
        private GetZeroTrustAccessGroupsResultExcludeAuthContext authContext;
        private GetZeroTrustAccessGroupsResultExcludeAuthMethod authMethod;
        private GetZeroTrustAccessGroupsResultExcludeAzureAd azureAd;
        private GetZeroTrustAccessGroupsResultExcludeCertificate certificate;
        private GetZeroTrustAccessGroupsResultExcludeCommonName commonName;
        private GetZeroTrustAccessGroupsResultExcludeDevicePosture devicePosture;
        private GetZeroTrustAccessGroupsResultExcludeEmail email;
        private GetZeroTrustAccessGroupsResultExcludeEmailDomain emailDomain;
        private GetZeroTrustAccessGroupsResultExcludeEmailList emailList;
        private GetZeroTrustAccessGroupsResultExcludeEveryone everyone;
        private GetZeroTrustAccessGroupsResultExcludeExternalEvaluation externalEvaluation;
        private GetZeroTrustAccessGroupsResultExcludeGeo geo;
        private GetZeroTrustAccessGroupsResultExcludeGithubOrganization githubOrganization;
        private GetZeroTrustAccessGroupsResultExcludeGroup group;
        private GetZeroTrustAccessGroupsResultExcludeGsuite gsuite;
        private GetZeroTrustAccessGroupsResultExcludeIp ip;
        private GetZeroTrustAccessGroupsResultExcludeIpList ipList;
        private GetZeroTrustAccessGroupsResultExcludeLoginMethod loginMethod;
        private GetZeroTrustAccessGroupsResultExcludeOkta okta;
        private GetZeroTrustAccessGroupsResultExcludeSaml saml;
        private GetZeroTrustAccessGroupsResultExcludeServiceToken serviceToken;
        public Builder() {}
        public Builder(GetZeroTrustAccessGroupsResultExclude defaults) {
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
        public Builder anyValidServiceToken(GetZeroTrustAccessGroupsResultExcludeAnyValidServiceToken anyValidServiceToken) {
            if (anyValidServiceToken == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "anyValidServiceToken");
            }
            this.anyValidServiceToken = anyValidServiceToken;
            return this;
        }
        @CustomType.Setter
        public Builder authContext(GetZeroTrustAccessGroupsResultExcludeAuthContext authContext) {
            if (authContext == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "authContext");
            }
            this.authContext = authContext;
            return this;
        }
        @CustomType.Setter
        public Builder authMethod(GetZeroTrustAccessGroupsResultExcludeAuthMethod authMethod) {
            if (authMethod == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "authMethod");
            }
            this.authMethod = authMethod;
            return this;
        }
        @CustomType.Setter
        public Builder azureAd(GetZeroTrustAccessGroupsResultExcludeAzureAd azureAd) {
            if (azureAd == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "azureAd");
            }
            this.azureAd = azureAd;
            return this;
        }
        @CustomType.Setter
        public Builder certificate(GetZeroTrustAccessGroupsResultExcludeCertificate certificate) {
            if (certificate == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "certificate");
            }
            this.certificate = certificate;
            return this;
        }
        @CustomType.Setter
        public Builder commonName(GetZeroTrustAccessGroupsResultExcludeCommonName commonName) {
            if (commonName == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "commonName");
            }
            this.commonName = commonName;
            return this;
        }
        @CustomType.Setter
        public Builder devicePosture(GetZeroTrustAccessGroupsResultExcludeDevicePosture devicePosture) {
            if (devicePosture == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "devicePosture");
            }
            this.devicePosture = devicePosture;
            return this;
        }
        @CustomType.Setter
        public Builder email(GetZeroTrustAccessGroupsResultExcludeEmail email) {
            if (email == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "email");
            }
            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder emailDomain(GetZeroTrustAccessGroupsResultExcludeEmailDomain emailDomain) {
            if (emailDomain == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "emailDomain");
            }
            this.emailDomain = emailDomain;
            return this;
        }
        @CustomType.Setter
        public Builder emailList(GetZeroTrustAccessGroupsResultExcludeEmailList emailList) {
            if (emailList == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "emailList");
            }
            this.emailList = emailList;
            return this;
        }
        @CustomType.Setter
        public Builder everyone(GetZeroTrustAccessGroupsResultExcludeEveryone everyone) {
            if (everyone == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "everyone");
            }
            this.everyone = everyone;
            return this;
        }
        @CustomType.Setter
        public Builder externalEvaluation(GetZeroTrustAccessGroupsResultExcludeExternalEvaluation externalEvaluation) {
            if (externalEvaluation == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "externalEvaluation");
            }
            this.externalEvaluation = externalEvaluation;
            return this;
        }
        @CustomType.Setter
        public Builder geo(GetZeroTrustAccessGroupsResultExcludeGeo geo) {
            if (geo == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "geo");
            }
            this.geo = geo;
            return this;
        }
        @CustomType.Setter
        public Builder githubOrganization(GetZeroTrustAccessGroupsResultExcludeGithubOrganization githubOrganization) {
            if (githubOrganization == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "githubOrganization");
            }
            this.githubOrganization = githubOrganization;
            return this;
        }
        @CustomType.Setter
        public Builder group(GetZeroTrustAccessGroupsResultExcludeGroup group) {
            if (group == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "group");
            }
            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder gsuite(GetZeroTrustAccessGroupsResultExcludeGsuite gsuite) {
            if (gsuite == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "gsuite");
            }
            this.gsuite = gsuite;
            return this;
        }
        @CustomType.Setter
        public Builder ip(GetZeroTrustAccessGroupsResultExcludeIp ip) {
            if (ip == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "ip");
            }
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder ipList(GetZeroTrustAccessGroupsResultExcludeIpList ipList) {
            if (ipList == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "ipList");
            }
            this.ipList = ipList;
            return this;
        }
        @CustomType.Setter
        public Builder loginMethod(GetZeroTrustAccessGroupsResultExcludeLoginMethod loginMethod) {
            if (loginMethod == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "loginMethod");
            }
            this.loginMethod = loginMethod;
            return this;
        }
        @CustomType.Setter
        public Builder okta(GetZeroTrustAccessGroupsResultExcludeOkta okta) {
            if (okta == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "okta");
            }
            this.okta = okta;
            return this;
        }
        @CustomType.Setter
        public Builder saml(GetZeroTrustAccessGroupsResultExcludeSaml saml) {
            if (saml == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "saml");
            }
            this.saml = saml;
            return this;
        }
        @CustomType.Setter
        public Builder serviceToken(GetZeroTrustAccessGroupsResultExcludeServiceToken serviceToken) {
            if (serviceToken == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustAccessGroupsResultExclude", "serviceToken");
            }
            this.serviceToken = serviceToken;
            return this;
        }
        public GetZeroTrustAccessGroupsResultExclude build() {
            final var _resultValue = new GetZeroTrustAccessGroupsResultExclude();
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
