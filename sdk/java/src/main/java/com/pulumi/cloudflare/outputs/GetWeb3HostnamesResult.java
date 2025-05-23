// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWeb3HostnamesResult {
    private String createdOn;
    /**
     * @return Specify an optional description of the hostname.
     * 
     */
    private String description;
    /**
     * @return Specify the DNSLink value used if the target is ipfs.
     * 
     */
    private String dnslink;
    /**
     * @return Specify the identifier of the hostname.
     * 
     */
    private String id;
    private String modifiedOn;
    /**
     * @return Specify the hostname that points to the target gateway via CNAME.
     * 
     */
    private String name;
    /**
     * @return Specifies the status of the hostname&#39;s activation.
     * Available values: &#34;active&#34;, &#34;pending&#34;, &#34;deleting&#34;, &#34;error&#34;.
     * 
     */
    private String status;
    /**
     * @return Specify the target gateway of the hostname.
     * Available values: &#34;ethereum&#34;, &#34;ipfs&#34;, &#34;ipfs*universal*path&#34;.
     * 
     */
    private String target;

    private GetWeb3HostnamesResult() {}
    public String createdOn() {
        return this.createdOn;
    }
    /**
     * @return Specify an optional description of the hostname.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Specify the DNSLink value used if the target is ipfs.
     * 
     */
    public String dnslink() {
        return this.dnslink;
    }
    /**
     * @return Specify the identifier of the hostname.
     * 
     */
    public String id() {
        return this.id;
    }
    public String modifiedOn() {
        return this.modifiedOn;
    }
    /**
     * @return Specify the hostname that points to the target gateway via CNAME.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specifies the status of the hostname&#39;s activation.
     * Available values: &#34;active&#34;, &#34;pending&#34;, &#34;deleting&#34;, &#34;error&#34;.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Specify the target gateway of the hostname.
     * Available values: &#34;ethereum&#34;, &#34;ipfs&#34;, &#34;ipfs*universal*path&#34;.
     * 
     */
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWeb3HostnamesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdOn;
        private String description;
        private String dnslink;
        private String id;
        private String modifiedOn;
        private String name;
        private String status;
        private String target;
        public Builder() {}
        public Builder(GetWeb3HostnamesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdOn = defaults.createdOn;
    	      this.description = defaults.description;
    	      this.dnslink = defaults.dnslink;
    	      this.id = defaults.id;
    	      this.modifiedOn = defaults.modifiedOn;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.target = defaults.target;
        }

        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            if (createdOn == null) {
              throw new MissingRequiredPropertyException("GetWeb3HostnamesResult", "createdOn");
            }
            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetWeb3HostnamesResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder dnslink(String dnslink) {
            if (dnslink == null) {
              throw new MissingRequiredPropertyException("GetWeb3HostnamesResult", "dnslink");
            }
            this.dnslink = dnslink;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWeb3HostnamesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedOn(String modifiedOn) {
            if (modifiedOn == null) {
              throw new MissingRequiredPropertyException("GetWeb3HostnamesResult", "modifiedOn");
            }
            this.modifiedOn = modifiedOn;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetWeb3HostnamesResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetWeb3HostnamesResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder target(String target) {
            if (target == null) {
              throw new MissingRequiredPropertyException("GetWeb3HostnamesResult", "target");
            }
            this.target = target;
            return this;
        }
        public GetWeb3HostnamesResult build() {
            final var _resultValue = new GetWeb3HostnamesResult();
            _resultValue.createdOn = createdOn;
            _resultValue.description = description;
            _resultValue.dnslink = dnslink;
            _resultValue.id = id;
            _resultValue.modifiedOn = modifiedOn;
            _resultValue.name = name;
            _resultValue.status = status;
            _resultValue.target = target;
            return _resultValue;
        }
    }
}
