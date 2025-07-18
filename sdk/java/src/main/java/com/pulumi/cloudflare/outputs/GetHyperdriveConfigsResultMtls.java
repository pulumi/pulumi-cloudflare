// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHyperdriveConfigsResultMtls {
    /**
     * @return Define CA certificate ID obtained after uploading CA cert.
     * 
     */
    private String caCertificateId;
    /**
     * @return Define mTLS certificate ID obtained after uploading client cert.
     * 
     */
    private String mtlsCertificateId;
    /**
     * @return Set SSL mode to &#39;require&#39;, &#39;verify-ca&#39;, or &#39;verify-full&#39; to verify the CA.
     * 
     */
    private String sslmode;

    private GetHyperdriveConfigsResultMtls() {}
    /**
     * @return Define CA certificate ID obtained after uploading CA cert.
     * 
     */
    public String caCertificateId() {
        return this.caCertificateId;
    }
    /**
     * @return Define mTLS certificate ID obtained after uploading client cert.
     * 
     */
    public String mtlsCertificateId() {
        return this.mtlsCertificateId;
    }
    /**
     * @return Set SSL mode to &#39;require&#39;, &#39;verify-ca&#39;, or &#39;verify-full&#39; to verify the CA.
     * 
     */
    public String sslmode() {
        return this.sslmode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHyperdriveConfigsResultMtls defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String caCertificateId;
        private String mtlsCertificateId;
        private String sslmode;
        public Builder() {}
        public Builder(GetHyperdriveConfigsResultMtls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificateId = defaults.caCertificateId;
    	      this.mtlsCertificateId = defaults.mtlsCertificateId;
    	      this.sslmode = defaults.sslmode;
        }

        @CustomType.Setter
        public Builder caCertificateId(String caCertificateId) {
            if (caCertificateId == null) {
              throw new MissingRequiredPropertyException("GetHyperdriveConfigsResultMtls", "caCertificateId");
            }
            this.caCertificateId = caCertificateId;
            return this;
        }
        @CustomType.Setter
        public Builder mtlsCertificateId(String mtlsCertificateId) {
            if (mtlsCertificateId == null) {
              throw new MissingRequiredPropertyException("GetHyperdriveConfigsResultMtls", "mtlsCertificateId");
            }
            this.mtlsCertificateId = mtlsCertificateId;
            return this;
        }
        @CustomType.Setter
        public Builder sslmode(String sslmode) {
            if (sslmode == null) {
              throw new MissingRequiredPropertyException("GetHyperdriveConfigsResultMtls", "sslmode");
            }
            this.sslmode = sslmode;
            return this;
        }
        public GetHyperdriveConfigsResultMtls build() {
            final var _resultValue = new GetHyperdriveConfigsResultMtls();
            _resultValue.caCertificateId = caCertificateId;
            _resultValue.mtlsCertificateId = mtlsCertificateId;
            _resultValue.sslmode = sslmode;
            return _resultValue;
        }
    }
}
