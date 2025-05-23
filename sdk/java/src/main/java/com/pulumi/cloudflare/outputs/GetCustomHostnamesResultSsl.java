// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetCustomHostnamesResultSslSettings;
import com.pulumi.cloudflare.outputs.GetCustomHostnamesResultSslValidationError;
import com.pulumi.cloudflare.outputs.GetCustomHostnamesResultSslValidationRecord;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCustomHostnamesResultSsl {
    /**
     * @return A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
     * Available values: &#34;ubiquitous&#34;, &#34;optimal&#34;, &#34;force&#34;.
     * 
     */
    private String bundleMethod;
    /**
     * @return The Certificate Authority that will issue the certificate
     * Available values: &#34;digicert&#34;, &#34;google&#34;, &#34;lets*encrypt&#34;, &#34;ssl*com&#34;.
     * 
     */
    private String certificateAuthority;
    /**
     * @return If a custom uploaded certificate is used.
     * 
     */
    private String customCertificate;
    /**
     * @return The identifier for the Custom CSR that was used.
     * 
     */
    private String customCsrId;
    /**
     * @return The key for a custom uploaded certificate.
     * 
     */
    private String customKey;
    /**
     * @return The time the custom certificate expires on.
     * 
     */
    private String expiresOn;
    /**
     * @return A list of Hostnames on a custom uploaded certificate.
     * 
     */
    private List<String> hosts;
    /**
     * @return Custom hostname SSL identifier tag.
     * 
     */
    private String id;
    /**
     * @return The issuer on a custom uploaded certificate.
     * 
     */
    private String issuer;
    /**
     * @return Domain control validation (DCV) method used for this hostname.
     * Available values: &#34;http&#34;, &#34;txt&#34;, &#34;email&#34;.
     * 
     */
    private String method;
    /**
     * @return The serial number on a custom uploaded certificate.
     * 
     */
    private String serialNumber;
    private GetCustomHostnamesResultSslSettings settings;
    /**
     * @return The signature on a custom uploaded certificate.
     * 
     */
    private String signature;
    /**
     * @return Status of the hostname&#39;s SSL certificates.
     * Available values: &#34;initializing&#34;, &#34;pending*validation&#34;, &#34;deleted&#34;, &#34;pending*issuance&#34;, &#34;pending*deployment&#34;, &#34;pending*deletion&#34;, &#34;pending*expiration&#34;, &#34;expired&#34;, &#34;active&#34;, &#34;initializing*timed*out&#34;, &#34;validation*timed*out&#34;, &#34;issuance*timed*out&#34;, &#34;deployment*timed*out&#34;, &#34;deletion*timed*out&#34;, &#34;pending*cleanup&#34;, &#34;staging*deployment&#34;, &#34;staging*active&#34;, &#34;deactivating&#34;, &#34;inactive&#34;, &#34;backup*issued&#34;, &#34;holding*deployment&#34;.
     * 
     */
    private String status;
    /**
     * @return Level of validation to be used for this hostname. Domain validation (dv) must be used.
     * Available values: &#34;dv&#34;.
     * 
     */
    private String type;
    /**
     * @return The time the custom certificate was uploaded.
     * 
     */
    private String uploadedOn;
    /**
     * @return Domain validation errors that have been received by the certificate authority (CA).
     * 
     */
    private List<GetCustomHostnamesResultSslValidationError> validationErrors;
    private List<GetCustomHostnamesResultSslValidationRecord> validationRecords;
    /**
     * @return Indicates whether the certificate covers a wildcard.
     * 
     */
    private Boolean wildcard;

    private GetCustomHostnamesResultSsl() {}
    /**
     * @return A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
     * Available values: &#34;ubiquitous&#34;, &#34;optimal&#34;, &#34;force&#34;.
     * 
     */
    public String bundleMethod() {
        return this.bundleMethod;
    }
    /**
     * @return The Certificate Authority that will issue the certificate
     * Available values: &#34;digicert&#34;, &#34;google&#34;, &#34;lets*encrypt&#34;, &#34;ssl*com&#34;.
     * 
     */
    public String certificateAuthority() {
        return this.certificateAuthority;
    }
    /**
     * @return If a custom uploaded certificate is used.
     * 
     */
    public String customCertificate() {
        return this.customCertificate;
    }
    /**
     * @return The identifier for the Custom CSR that was used.
     * 
     */
    public String customCsrId() {
        return this.customCsrId;
    }
    /**
     * @return The key for a custom uploaded certificate.
     * 
     */
    public String customKey() {
        return this.customKey;
    }
    /**
     * @return The time the custom certificate expires on.
     * 
     */
    public String expiresOn() {
        return this.expiresOn;
    }
    /**
     * @return A list of Hostnames on a custom uploaded certificate.
     * 
     */
    public List<String> hosts() {
        return this.hosts;
    }
    /**
     * @return Custom hostname SSL identifier tag.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The issuer on a custom uploaded certificate.
     * 
     */
    public String issuer() {
        return this.issuer;
    }
    /**
     * @return Domain control validation (DCV) method used for this hostname.
     * Available values: &#34;http&#34;, &#34;txt&#34;, &#34;email&#34;.
     * 
     */
    public String method() {
        return this.method;
    }
    /**
     * @return The serial number on a custom uploaded certificate.
     * 
     */
    public String serialNumber() {
        return this.serialNumber;
    }
    public GetCustomHostnamesResultSslSettings settings() {
        return this.settings;
    }
    /**
     * @return The signature on a custom uploaded certificate.
     * 
     */
    public String signature() {
        return this.signature;
    }
    /**
     * @return Status of the hostname&#39;s SSL certificates.
     * Available values: &#34;initializing&#34;, &#34;pending*validation&#34;, &#34;deleted&#34;, &#34;pending*issuance&#34;, &#34;pending*deployment&#34;, &#34;pending*deletion&#34;, &#34;pending*expiration&#34;, &#34;expired&#34;, &#34;active&#34;, &#34;initializing*timed*out&#34;, &#34;validation*timed*out&#34;, &#34;issuance*timed*out&#34;, &#34;deployment*timed*out&#34;, &#34;deletion*timed*out&#34;, &#34;pending*cleanup&#34;, &#34;staging*deployment&#34;, &#34;staging*active&#34;, &#34;deactivating&#34;, &#34;inactive&#34;, &#34;backup*issued&#34;, &#34;holding*deployment&#34;.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Level of validation to be used for this hostname. Domain validation (dv) must be used.
     * Available values: &#34;dv&#34;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The time the custom certificate was uploaded.
     * 
     */
    public String uploadedOn() {
        return this.uploadedOn;
    }
    /**
     * @return Domain validation errors that have been received by the certificate authority (CA).
     * 
     */
    public List<GetCustomHostnamesResultSslValidationError> validationErrors() {
        return this.validationErrors;
    }
    public List<GetCustomHostnamesResultSslValidationRecord> validationRecords() {
        return this.validationRecords;
    }
    /**
     * @return Indicates whether the certificate covers a wildcard.
     * 
     */
    public Boolean wildcard() {
        return this.wildcard;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomHostnamesResultSsl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bundleMethod;
        private String certificateAuthority;
        private String customCertificate;
        private String customCsrId;
        private String customKey;
        private String expiresOn;
        private List<String> hosts;
        private String id;
        private String issuer;
        private String method;
        private String serialNumber;
        private GetCustomHostnamesResultSslSettings settings;
        private String signature;
        private String status;
        private String type;
        private String uploadedOn;
        private List<GetCustomHostnamesResultSslValidationError> validationErrors;
        private List<GetCustomHostnamesResultSslValidationRecord> validationRecords;
        private Boolean wildcard;
        public Builder() {}
        public Builder(GetCustomHostnamesResultSsl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundleMethod = defaults.bundleMethod;
    	      this.certificateAuthority = defaults.certificateAuthority;
    	      this.customCertificate = defaults.customCertificate;
    	      this.customCsrId = defaults.customCsrId;
    	      this.customKey = defaults.customKey;
    	      this.expiresOn = defaults.expiresOn;
    	      this.hosts = defaults.hosts;
    	      this.id = defaults.id;
    	      this.issuer = defaults.issuer;
    	      this.method = defaults.method;
    	      this.serialNumber = defaults.serialNumber;
    	      this.settings = defaults.settings;
    	      this.signature = defaults.signature;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.uploadedOn = defaults.uploadedOn;
    	      this.validationErrors = defaults.validationErrors;
    	      this.validationRecords = defaults.validationRecords;
    	      this.wildcard = defaults.wildcard;
        }

        @CustomType.Setter
        public Builder bundleMethod(String bundleMethod) {
            if (bundleMethod == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultSsl", "bundleMethod");
            }
            this.bundleMethod = bundleMethod;
            return this;
        }
        @CustomType.Setter
        public Builder certificateAuthority(String certificateAuthority) {
            if (certificateAuthority == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultSsl", "certificateAuthority");
            }
            this.certificateAuthority = certificateAuthority;
            return this;
        }
        @CustomType.Setter
        public Builder customCertificate(String customCertificate) {
            if (customCertificate == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultSsl", "customCertificate");
            }
            this.customCertificate = customCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder customCsrId(String customCsrId) {
            if (customCsrId == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultSsl", "customCsrId");
            }
            this.customCsrId = customCsrId;
            return this;
        }
        @CustomType.Setter
        public Builder customKey(String customKey) {
            if (customKey == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultSsl", "customKey");
            }
            this.customKey = customKey;
            return this;
        }
        @CustomType.Setter
        public Builder expiresOn(String expiresOn) {
            if (expiresOn == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultSsl", "expiresOn");
            }
            this.expiresOn = expiresOn;
            return this;
        }
        @CustomType.Setter
        public Builder hosts(List<String> hosts) {
            if (hosts == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultSsl", "hosts");
            }
            this.hosts = hosts;
            return this;
        }
        public Builder hosts(String... hosts) {
            return hosts(List.of(hosts));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultSsl", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder issuer(String issuer) {
            if (issuer == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultSsl", "issuer");
            }
            this.issuer = issuer;
            return this;
        }
        @CustomType.Setter
        public Builder method(String method) {
            if (method == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultSsl", "method");
            }
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder serialNumber(String serialNumber) {
            if (serialNumber == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultSsl", "serialNumber");
            }
            this.serialNumber = serialNumber;
            return this;
        }
        @CustomType.Setter
        public Builder settings(GetCustomHostnamesResultSslSettings settings) {
            if (settings == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultSsl", "settings");
            }
            this.settings = settings;
            return this;
        }
        @CustomType.Setter
        public Builder signature(String signature) {
            if (signature == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultSsl", "signature");
            }
            this.signature = signature;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultSsl", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultSsl", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uploadedOn(String uploadedOn) {
            if (uploadedOn == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultSsl", "uploadedOn");
            }
            this.uploadedOn = uploadedOn;
            return this;
        }
        @CustomType.Setter
        public Builder validationErrors(List<GetCustomHostnamesResultSslValidationError> validationErrors) {
            if (validationErrors == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultSsl", "validationErrors");
            }
            this.validationErrors = validationErrors;
            return this;
        }
        public Builder validationErrors(GetCustomHostnamesResultSslValidationError... validationErrors) {
            return validationErrors(List.of(validationErrors));
        }
        @CustomType.Setter
        public Builder validationRecords(List<GetCustomHostnamesResultSslValidationRecord> validationRecords) {
            if (validationRecords == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultSsl", "validationRecords");
            }
            this.validationRecords = validationRecords;
            return this;
        }
        public Builder validationRecords(GetCustomHostnamesResultSslValidationRecord... validationRecords) {
            return validationRecords(List.of(validationRecords));
        }
        @CustomType.Setter
        public Builder wildcard(Boolean wildcard) {
            if (wildcard == null) {
              throw new MissingRequiredPropertyException("GetCustomHostnamesResultSsl", "wildcard");
            }
            this.wildcard = wildcard;
            return this;
        }
        public GetCustomHostnamesResultSsl build() {
            final var _resultValue = new GetCustomHostnamesResultSsl();
            _resultValue.bundleMethod = bundleMethod;
            _resultValue.certificateAuthority = certificateAuthority;
            _resultValue.customCertificate = customCertificate;
            _resultValue.customCsrId = customCsrId;
            _resultValue.customKey = customKey;
            _resultValue.expiresOn = expiresOn;
            _resultValue.hosts = hosts;
            _resultValue.id = id;
            _resultValue.issuer = issuer;
            _resultValue.method = method;
            _resultValue.serialNumber = serialNumber;
            _resultValue.settings = settings;
            _resultValue.signature = signature;
            _resultValue.status = status;
            _resultValue.type = type;
            _resultValue.uploadedOn = uploadedOn;
            _resultValue.validationErrors = validationErrors;
            _resultValue.validationRecords = validationRecords;
            _resultValue.wildcard = wildcard;
            return _resultValue;
        }
    }
}
