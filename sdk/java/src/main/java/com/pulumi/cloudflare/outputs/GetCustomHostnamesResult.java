// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetCustomHostnamesResultOwnershipVerification;
import com.pulumi.cloudflare.outputs.GetCustomHostnamesResultOwnershipVerificationHttp;
import com.pulumi.cloudflare.outputs.GetCustomHostnamesResultSsl;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetCustomHostnamesResult {
    /**
     * @return This is the time the hostname was created.
     * 
     */
    private String createdAt;
    /**
     * @return Unique key/value metadata for this hostname. These are per-hostname (customer) settings.
     * 
     */
    private Map<String,String> customMetadata;
    /**
     * @return a valid hostname that’s been added to your DNS zone as an A, AAAA, or CNAME record.
     * 
     */
    private String customOriginServer;
    /**
     * @return A hostname that will be sent to your custom origin server as SNI for TLS handshake. This can be a valid subdomain of the zone or custom origin server name or the string &#39;:request*host*header:&#39; which will cause the host header in the request to be used as SNI. Not configurable with default/fallback origin server.
     * 
     */
    private String customOriginSni;
    /**
     * @return The custom hostname that will point to your hostname via CNAME.
     * 
     */
    private String hostname;
    /**
     * @return Identifier.
     * 
     */
    private String id;
    /**
     * @return This is a record which can be placed to activate a hostname.
     * 
     */
    private GetCustomHostnamesResultOwnershipVerification ownershipVerification;
    /**
     * @return This presents the token to be served by the given http url to activate a hostname.
     * 
     */
    private GetCustomHostnamesResultOwnershipVerificationHttp ownershipVerificationHttp;
    private GetCustomHostnamesResultSsl ssl;
    /**
     * @return Status of the hostname&#39;s activation.
     * Available values: &#34;active&#34;, &#34;pending&#34;, &#34;active*redeploying&#34;, &#34;moved&#34;, &#34;pending*deletion&#34;, &#34;deleted&#34;, &#34;pending*blocked&#34;, &#34;pending*migration&#34;, &#34;pending*provisioned&#34;, &#34;test*pending&#34;, &#34;test*active&#34;, &#34;test*active*apex&#34;, &#34;test*blocked&#34;, &#34;test_failed&#34;, &#34;provisioned&#34;, &#34;blocked&#34;.
     * 
     */
    private String status;
    /**
     * @return These are errors that were encountered while trying to activate a hostname.
     * 
     */
    private List<String> verificationErrors;

    private GetCustomHostnamesResult() {}
    /**
     * @return This is the time the hostname was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Unique key/value metadata for this hostname. These are per-hostname (customer) settings.
     * 
     */
    public Map<String,String> customMetadata() {
        return this.customMetadata;
    }
    /**
     * @return a valid hostname that’s been added to your DNS zone as an A, AAAA, or CNAME record.
     * 
     */
    public String customOriginServer() {
        return this.customOriginServer;
    }
    /**
     * @return A hostname that will be sent to your custom origin server as SNI for TLS handshake. This can be a valid subdomain of the zone or custom origin server name or the string &#39;:request*host*header:&#39; which will cause the host header in the request to be used as SNI. Not configurable with default/fallback origin server.
     * 
     */
    public String customOriginSni() {
        return this.customOriginSni;
    }
    /**
     * @return The custom hostname that will point to your hostname via CNAME.
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return Identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return This is a record which can be placed to activate a hostname.
     * 
     */
    public GetCustomHostnamesResultOwnershipVerification ownershipVerification() {
        return this.ownershipVerification;
    }
    /**
     * @return This presents the token to be served by the given http url to activate a hostname.
     * 
     */
    public GetCustomHostnamesResultOwnershipVerificationHttp ownershipVerificationHttp() {
        return this.ownershipVerificationHttp;
    }
    public GetCustomHostnamesResultSsl ssl() {
        return this.ssl;
    }
    /**
     * @return Status of the hostname&#39;s activation.
     * Available values: &#34;active&#34;, &#34;pending&#34;, &#34;active*redeploying&#34;, &#34;moved&#34;, &#34;pending*deletion&#34;, &#34;deleted&#34;, &#34;pending*blocked&#34;, &#34;pending*migration&#34;, &#34;pending*provisioned&#34;, &#34;test*pending&#34;, &#34;test*active&#34;, &#34;test*active*apex&#34;, &#34;test*blocked&#34;, &#34;test_failed&#34;, &#34;provisioned&#34;, &#34;blocked&#34;.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return These are errors that were encountered while trying to activate a hostname.
     * 
     */
    public List<String> verificationErrors() {
        return this.verificationErrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomHostnamesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdAt;
        private Map<String,String> customMetadata;
        private String customOriginServer;
        private String customOriginSni;
        private String hostname;
        private String id;
        private GetCustomHostnamesResultOwnershipVerification ownershipVerification;
        private GetCustomHostnamesResultOwnershipVerificationHttp ownershipVerificationHttp;
        private GetCustomHostnamesResultSsl ssl;
        private String status;
        private List<String> verificationErrors;
        public Builder() {}
        public Builder(GetCustomHostnamesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.customMetadata = defaults.customMetadata;
    	      this.customOriginServer = defaults.customOriginServer;
    	      this.customOriginSni = defaults.customOriginSni;
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.ownershipVerification = defaults.ownershipVerification;
    	      this.ownershipVerificationHttp = defaults.ownershipVerificationHttp;
    	      this.ssl = defaults.ssl;
    	      this.status = defaults.status;
    	      this.verificationErrors = defaults.verificationErrors;
        }

        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResult", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder customMetadata(Map<String,String> customMetadata) {
            if (customMetadata == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResult", "customMetadata");
            }
            this.customMetadata = customMetadata;
            return this;
        }
        @CustomType.Setter
        public Builder customOriginServer(String customOriginServer) {
            if (customOriginServer == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResult", "customOriginServer");
            }
            this.customOriginServer = customOriginServer;
            return this;
        }
        @CustomType.Setter
        public Builder customOriginSni(String customOriginSni) {
            if (customOriginSni == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResult", "customOriginSni");
            }
            this.customOriginSni = customOriginSni;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(String hostname) {
            if (hostname == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResult", "hostname");
            }
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ownershipVerification(GetCustomHostnamesResultOwnershipVerification ownershipVerification) {
            if (ownershipVerification == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResult", "ownershipVerification");
            }
            this.ownershipVerification = ownershipVerification;
            return this;
        }
        @CustomType.Setter
        public Builder ownershipVerificationHttp(GetCustomHostnamesResultOwnershipVerificationHttp ownershipVerificationHttp) {
            if (ownershipVerificationHttp == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResult", "ownershipVerificationHttp");
            }
            this.ownershipVerificationHttp = ownershipVerificationHttp;
            return this;
        }
        @CustomType.Setter
        public Builder ssl(GetCustomHostnamesResultSsl ssl) {
            if (ssl == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResult", "ssl");
            }
            this.ssl = ssl;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder verificationErrors(List<String> verificationErrors) {
            if (verificationErrors == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResult", "verificationErrors");
            }
            this.verificationErrors = verificationErrors;
            return this;
        }
        public Builder verificationErrors(String... verificationErrors) {
            return verificationErrors(List.of(verificationErrors));
        }
        public GetCustomHostnamesResult build() {
            final var _resultValue = new GetCustomHostnamesResult();
            _resultValue.createdAt = createdAt;
            _resultValue.customMetadata = customMetadata;
            _resultValue.customOriginServer = customOriginServer;
            _resultValue.customOriginSni = customOriginSni;
            _resultValue.hostname = hostname;
            _resultValue.id = id;
            _resultValue.ownershipVerification = ownershipVerification;
            _resultValue.ownershipVerificationHttp = ownershipVerificationHttp;
            _resultValue.ssl = ssl;
            _resultValue.status = status;
            _resultValue.verificationErrors = verificationErrors;
            return _resultValue;
        }
    }
}
