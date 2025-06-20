// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZoneDnssecResult {
    /**
     * @return Algorithm key code.
     * 
     */
    private String algorithm;
    /**
     * @return Digest hash.
     * 
     */
    private String digest;
    /**
     * @return Type of digest algorithm.
     * 
     */
    private String digestAlgorithm;
    /**
     * @return Coded type for digest algorithm.
     * 
     */
    private String digestType;
    /**
     * @return If true, multi-signer DNSSEC is enabled on the zone, allowing multiple
     * providers to serve a DNSSEC-signed zone at the same time.
     * This is required for DNSKEY records (except those automatically
     * generated by Cloudflare) to be added to the zone.
     * 
     */
    private Boolean dnssecMultiSigner;
    private Boolean dnssecPresigned;
    private Boolean dnssecUseNsec3;
    private String ds;
    private Double flags;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Double keyTag;
    private String keyType;
    private String modifiedOn;
    private String publicKey;
    private String status;
    /**
     * @return Identifier.
     * 
     */
    private String zoneId;

    private GetZoneDnssecResult() {}
    /**
     * @return Algorithm key code.
     * 
     */
    public String algorithm() {
        return this.algorithm;
    }
    /**
     * @return Digest hash.
     * 
     */
    public String digest() {
        return this.digest;
    }
    /**
     * @return Type of digest algorithm.
     * 
     */
    public String digestAlgorithm() {
        return this.digestAlgorithm;
    }
    /**
     * @return Coded type for digest algorithm.
     * 
     */
    public String digestType() {
        return this.digestType;
    }
    /**
     * @return If true, multi-signer DNSSEC is enabled on the zone, allowing multiple
     * providers to serve a DNSSEC-signed zone at the same time.
     * This is required for DNSKEY records (except those automatically
     * generated by Cloudflare) to be added to the zone.
     * 
     */
    public Boolean dnssecMultiSigner() {
        return this.dnssecMultiSigner;
    }
    public Boolean dnssecPresigned() {
        return this.dnssecPresigned;
    }
    public Boolean dnssecUseNsec3() {
        return this.dnssecUseNsec3;
    }
    public String ds() {
        return this.ds;
    }
    public Double flags() {
        return this.flags;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Double keyTag() {
        return this.keyTag;
    }
    public String keyType() {
        return this.keyType;
    }
    public String modifiedOn() {
        return this.modifiedOn;
    }
    public String publicKey() {
        return this.publicKey;
    }
    public String status() {
        return this.status;
    }
    /**
     * @return Identifier.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZoneDnssecResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String algorithm;
        private String digest;
        private String digestAlgorithm;
        private String digestType;
        private Boolean dnssecMultiSigner;
        private Boolean dnssecPresigned;
        private Boolean dnssecUseNsec3;
        private String ds;
        private Double flags;
        private String id;
        private Double keyTag;
        private String keyType;
        private String modifiedOn;
        private String publicKey;
        private String status;
        private String zoneId;
        public Builder() {}
        public Builder(GetZoneDnssecResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.digest = defaults.digest;
    	      this.digestAlgorithm = defaults.digestAlgorithm;
    	      this.digestType = defaults.digestType;
    	      this.dnssecMultiSigner = defaults.dnssecMultiSigner;
    	      this.dnssecPresigned = defaults.dnssecPresigned;
    	      this.dnssecUseNsec3 = defaults.dnssecUseNsec3;
    	      this.ds = defaults.ds;
    	      this.flags = defaults.flags;
    	      this.id = defaults.id;
    	      this.keyTag = defaults.keyTag;
    	      this.keyType = defaults.keyType;
    	      this.modifiedOn = defaults.modifiedOn;
    	      this.publicKey = defaults.publicKey;
    	      this.status = defaults.status;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder algorithm(String algorithm) {
            if (algorithm == null) {
              throw new MissingRequiredPropertyException("GetZoneDnssecResult", "algorithm");
            }
            this.algorithm = algorithm;
            return this;
        }
        @CustomType.Setter
        public Builder digest(String digest) {
            if (digest == null) {
              throw new MissingRequiredPropertyException("GetZoneDnssecResult", "digest");
            }
            this.digest = digest;
            return this;
        }
        @CustomType.Setter
        public Builder digestAlgorithm(String digestAlgorithm) {
            if (digestAlgorithm == null) {
              throw new MissingRequiredPropertyException("GetZoneDnssecResult", "digestAlgorithm");
            }
            this.digestAlgorithm = digestAlgorithm;
            return this;
        }
        @CustomType.Setter
        public Builder digestType(String digestType) {
            if (digestType == null) {
              throw new MissingRequiredPropertyException("GetZoneDnssecResult", "digestType");
            }
            this.digestType = digestType;
            return this;
        }
        @CustomType.Setter
        public Builder dnssecMultiSigner(Boolean dnssecMultiSigner) {
            if (dnssecMultiSigner == null) {
              throw new MissingRequiredPropertyException("GetZoneDnssecResult", "dnssecMultiSigner");
            }
            this.dnssecMultiSigner = dnssecMultiSigner;
            return this;
        }
        @CustomType.Setter
        public Builder dnssecPresigned(Boolean dnssecPresigned) {
            if (dnssecPresigned == null) {
              throw new MissingRequiredPropertyException("GetZoneDnssecResult", "dnssecPresigned");
            }
            this.dnssecPresigned = dnssecPresigned;
            return this;
        }
        @CustomType.Setter
        public Builder dnssecUseNsec3(Boolean dnssecUseNsec3) {
            if (dnssecUseNsec3 == null) {
              throw new MissingRequiredPropertyException("GetZoneDnssecResult", "dnssecUseNsec3");
            }
            this.dnssecUseNsec3 = dnssecUseNsec3;
            return this;
        }
        @CustomType.Setter
        public Builder ds(String ds) {
            if (ds == null) {
              throw new MissingRequiredPropertyException("GetZoneDnssecResult", "ds");
            }
            this.ds = ds;
            return this;
        }
        @CustomType.Setter
        public Builder flags(Double flags) {
            if (flags == null) {
              throw new MissingRequiredPropertyException("GetZoneDnssecResult", "flags");
            }
            this.flags = flags;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZoneDnssecResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder keyTag(Double keyTag) {
            if (keyTag == null) {
              throw new MissingRequiredPropertyException("GetZoneDnssecResult", "keyTag");
            }
            this.keyTag = keyTag;
            return this;
        }
        @CustomType.Setter
        public Builder keyType(String keyType) {
            if (keyType == null) {
              throw new MissingRequiredPropertyException("GetZoneDnssecResult", "keyType");
            }
            this.keyType = keyType;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedOn(String modifiedOn) {
            if (modifiedOn == null) {
              throw new MissingRequiredPropertyException("GetZoneDnssecResult", "modifiedOn");
            }
            this.modifiedOn = modifiedOn;
            return this;
        }
        @CustomType.Setter
        public Builder publicKey(String publicKey) {
            if (publicKey == null) {
              throw new MissingRequiredPropertyException("GetZoneDnssecResult", "publicKey");
            }
            this.publicKey = publicKey;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetZoneDnssecResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("GetZoneDnssecResult", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        public GetZoneDnssecResult build() {
            final var _resultValue = new GetZoneDnssecResult();
            _resultValue.algorithm = algorithm;
            _resultValue.digest = digest;
            _resultValue.digestAlgorithm = digestAlgorithm;
            _resultValue.digestType = digestType;
            _resultValue.dnssecMultiSigner = dnssecMultiSigner;
            _resultValue.dnssecPresigned = dnssecPresigned;
            _resultValue.dnssecUseNsec3 = dnssecUseNsec3;
            _resultValue.ds = ds;
            _resultValue.flags = flags;
            _resultValue.id = id;
            _resultValue.keyTag = keyTag;
            _resultValue.keyType = keyType;
            _resultValue.modifiedOn = modifiedOn;
            _resultValue.publicKey = publicKey;
            _resultValue.status = status;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
