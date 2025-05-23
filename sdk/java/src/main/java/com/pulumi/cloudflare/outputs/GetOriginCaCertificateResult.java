// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetOriginCaCertificateFilter;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOriginCaCertificateResult {
    /**
     * @return The Origin CA certificate. Will be newline-encoded.
     * 
     */
    private String certificate;
    /**
     * @return Identifier.
     * 
     */
    private @Nullable String certificateId;
    /**
     * @return The Certificate Signing Request (CSR). Must be newline-encoded.
     * 
     */
    private String csr;
    /**
     * @return When the certificate will expire.
     * 
     */
    private String expiresOn;
    private @Nullable GetOriginCaCertificateFilter filter;
    /**
     * @return Array of hostnames or wildcard names (e.g., *.example.com) bound to the certificate.
     * 
     */
    private List<String> hostnames;
    /**
     * @return Identifier.
     * 
     */
    private String id;
    /**
     * @return Signature type desired on certificate (&#34;origin-rsa&#34; (rsa), &#34;origin-ecc&#34; (ecdsa), or &#34;keyless-certificate&#34; (for Keyless SSL servers).
     * Available values: &#34;origin-rsa&#34;, &#34;origin-ecc&#34;, &#34;keyless-certificate&#34;.
     * 
     */
    private String requestType;
    /**
     * @return The number of days for which the certificate should be valid.
     * Available values: 7, 30, 90, 365, 730, 1095, 5475.
     * 
     */
    private Double requestedValidity;

    private GetOriginCaCertificateResult() {}
    /**
     * @return The Origin CA certificate. Will be newline-encoded.
     * 
     */
    public String certificate() {
        return this.certificate;
    }
    /**
     * @return Identifier.
     * 
     */
    public Optional<String> certificateId() {
        return Optional.ofNullable(this.certificateId);
    }
    /**
     * @return The Certificate Signing Request (CSR). Must be newline-encoded.
     * 
     */
    public String csr() {
        return this.csr;
    }
    /**
     * @return When the certificate will expire.
     * 
     */
    public String expiresOn() {
        return this.expiresOn;
    }
    public Optional<GetOriginCaCertificateFilter> filter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * @return Array of hostnames or wildcard names (e.g., *.example.com) bound to the certificate.
     * 
     */
    public List<String> hostnames() {
        return this.hostnames;
    }
    /**
     * @return Identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Signature type desired on certificate (&#34;origin-rsa&#34; (rsa), &#34;origin-ecc&#34; (ecdsa), or &#34;keyless-certificate&#34; (for Keyless SSL servers).
     * Available values: &#34;origin-rsa&#34;, &#34;origin-ecc&#34;, &#34;keyless-certificate&#34;.
     * 
     */
    public String requestType() {
        return this.requestType;
    }
    /**
     * @return The number of days for which the certificate should be valid.
     * Available values: 7, 30, 90, 365, 730, 1095, 5475.
     * 
     */
    public Double requestedValidity() {
        return this.requestedValidity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOriginCaCertificateResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String certificate;
        private @Nullable String certificateId;
        private String csr;
        private String expiresOn;
        private @Nullable GetOriginCaCertificateFilter filter;
        private List<String> hostnames;
        private String id;
        private String requestType;
        private Double requestedValidity;
        public Builder() {}
        public Builder(GetOriginCaCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.certificateId = defaults.certificateId;
    	      this.csr = defaults.csr;
    	      this.expiresOn = defaults.expiresOn;
    	      this.filter = defaults.filter;
    	      this.hostnames = defaults.hostnames;
    	      this.id = defaults.id;
    	      this.requestType = defaults.requestType;
    	      this.requestedValidity = defaults.requestedValidity;
        }

        @CustomType.Setter
        public Builder certificate(String certificate) {
            if (certificate == null) {
              throw new MissingRequiredPropertyException("GetOriginCaCertificateResult", "certificate");
            }
            this.certificate = certificate;
            return this;
        }
        @CustomType.Setter
        public Builder certificateId(@Nullable String certificateId) {

            this.certificateId = certificateId;
            return this;
        }
        @CustomType.Setter
        public Builder csr(String csr) {
            if (csr == null) {
              throw new MissingRequiredPropertyException("GetOriginCaCertificateResult", "csr");
            }
            this.csr = csr;
            return this;
        }
        @CustomType.Setter
        public Builder expiresOn(String expiresOn) {
            if (expiresOn == null) {
              throw new MissingRequiredPropertyException("GetOriginCaCertificateResult", "expiresOn");
            }
            this.expiresOn = expiresOn;
            return this;
        }
        @CustomType.Setter
        public Builder filter(@Nullable GetOriginCaCertificateFilter filter) {

            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder hostnames(List<String> hostnames) {
            if (hostnames == null) {
              throw new MissingRequiredPropertyException("GetOriginCaCertificateResult", "hostnames");
            }
            this.hostnames = hostnames;
            return this;
        }
        public Builder hostnames(String... hostnames) {
            return hostnames(List.of(hostnames));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetOriginCaCertificateResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder requestType(String requestType) {
            if (requestType == null) {
              throw new MissingRequiredPropertyException("GetOriginCaCertificateResult", "requestType");
            }
            this.requestType = requestType;
            return this;
        }
        @CustomType.Setter
        public Builder requestedValidity(Double requestedValidity) {
            if (requestedValidity == null) {
              throw new MissingRequiredPropertyException("GetOriginCaCertificateResult", "requestedValidity");
            }
            this.requestedValidity = requestedValidity;
            return this;
        }
        public GetOriginCaCertificateResult build() {
            final var _resultValue = new GetOriginCaCertificateResult();
            _resultValue.certificate = certificate;
            _resultValue.certificateId = certificateId;
            _resultValue.csr = csr;
            _resultValue.expiresOn = expiresOn;
            _resultValue.filter = filter;
            _resultValue.hostnames = hostnames;
            _resultValue.id = id;
            _resultValue.requestType = requestType;
            _resultValue.requestedValidity = requestedValidity;
            return _resultValue;
        }
    }
}
