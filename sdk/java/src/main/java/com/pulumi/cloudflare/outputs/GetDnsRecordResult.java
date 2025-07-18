// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetDnsRecordData;
import com.pulumi.cloudflare.outputs.GetDnsRecordFilter;
import com.pulumi.cloudflare.outputs.GetDnsRecordSettings;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDnsRecordResult {
    /**
     * @return Comments or notes about the DNS record. This field has no effect on DNS responses.
     * 
     */
    private String comment;
    /**
     * @return When the record comment was last modified. Omitted if there is no comment.
     * 
     */
    private String commentModifiedOn;
    /**
     * @return A valid IPv4 address.
     * 
     */
    private String content;
    /**
     * @return When the record was created.
     * 
     */
    private String createdOn;
    /**
     * @return Components of a CAA record.
     * 
     */
    private GetDnsRecordData data;
    /**
     * @return Identifier.
     * 
     */
    private @Nullable String dnsRecordId;
    private @Nullable GetDnsRecordFilter filter;
    /**
     * @return Identifier.
     * 
     */
    private String id;
    /**
     * @return Extra Cloudflare-specific information about the record.
     * 
     */
    private String meta;
    /**
     * @return When the record was last modified.
     * 
     */
    private String modifiedOn;
    /**
     * @return DNS record name (or {@literal @} for the zone apex) in Punycode.
     * 
     */
    private String name;
    /**
     * @return Required for MX, SRV and URI records; unused by other record types. Records with lower priorities are preferred.
     * 
     */
    private Double priority;
    /**
     * @return Whether the record can be proxied by Cloudflare or not.
     * 
     */
    private Boolean proxiable;
    /**
     * @return Whether the record is receiving the performance and security benefits of Cloudflare.
     * 
     */
    private Boolean proxied;
    /**
     * @return Settings for the DNS record.
     * 
     */
    private GetDnsRecordSettings settings;
    /**
     * @return Custom tags for the DNS record. This field has no effect on DNS responses.
     * 
     */
    private List<String> tags;
    /**
     * @return When the record tags were last modified. Omitted if there are no tags.
     * 
     */
    private String tagsModifiedOn;
    /**
     * @return Time To Live (TTL) of the DNS record in seconds. Setting to 1 means &#39;automatic&#39;. Value must be between 60 and 86400, with the minimum reduced to 30 for Enterprise zones.
     * 
     */
    private Double ttl;
    /**
     * @return Record type.
     * Available values: &#34;A&#34;, &#34;AAAA&#34;, &#34;CNAME&#34;, &#34;MX&#34;, &#34;NS&#34;, &#34;OPENPGPKEY&#34;, &#34;PTR&#34;, &#34;TXT&#34;, &#34;CAA&#34;, &#34;CERT&#34;, &#34;DNSKEY&#34;, &#34;DS&#34;, &#34;HTTPS&#34;, &#34;LOC&#34;, &#34;NAPTR&#34;, &#34;SMIMEA&#34;, &#34;SRV&#34;, &#34;SSHFP&#34;, &#34;SVCB&#34;, &#34;TLSA&#34;, &#34;URI&#34;.
     * 
     */
    private String type;
    /**
     * @return Identifier.
     * 
     */
    private String zoneId;

    private GetDnsRecordResult() {}
    /**
     * @return Comments or notes about the DNS record. This field has no effect on DNS responses.
     * 
     */
    public String comment() {
        return this.comment;
    }
    /**
     * @return When the record comment was last modified. Omitted if there is no comment.
     * 
     */
    public String commentModifiedOn() {
        return this.commentModifiedOn;
    }
    /**
     * @return A valid IPv4 address.
     * 
     */
    public String content() {
        return this.content;
    }
    /**
     * @return When the record was created.
     * 
     */
    public String createdOn() {
        return this.createdOn;
    }
    /**
     * @return Components of a CAA record.
     * 
     */
    public GetDnsRecordData data() {
        return this.data;
    }
    /**
     * @return Identifier.
     * 
     */
    public Optional<String> dnsRecordId() {
        return Optional.ofNullable(this.dnsRecordId);
    }
    public Optional<GetDnsRecordFilter> filter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * @return Identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Extra Cloudflare-specific information about the record.
     * 
     */
    public String meta() {
        return this.meta;
    }
    /**
     * @return When the record was last modified.
     * 
     */
    public String modifiedOn() {
        return this.modifiedOn;
    }
    /**
     * @return DNS record name (or {@literal @} for the zone apex) in Punycode.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Required for MX, SRV and URI records; unused by other record types. Records with lower priorities are preferred.
     * 
     */
    public Double priority() {
        return this.priority;
    }
    /**
     * @return Whether the record can be proxied by Cloudflare or not.
     * 
     */
    public Boolean proxiable() {
        return this.proxiable;
    }
    /**
     * @return Whether the record is receiving the performance and security benefits of Cloudflare.
     * 
     */
    public Boolean proxied() {
        return this.proxied;
    }
    /**
     * @return Settings for the DNS record.
     * 
     */
    public GetDnsRecordSettings settings() {
        return this.settings;
    }
    /**
     * @return Custom tags for the DNS record. This field has no effect on DNS responses.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return When the record tags were last modified. Omitted if there are no tags.
     * 
     */
    public String tagsModifiedOn() {
        return this.tagsModifiedOn;
    }
    /**
     * @return Time To Live (TTL) of the DNS record in seconds. Setting to 1 means &#39;automatic&#39;. Value must be between 60 and 86400, with the minimum reduced to 30 for Enterprise zones.
     * 
     */
    public Double ttl() {
        return this.ttl;
    }
    /**
     * @return Record type.
     * Available values: &#34;A&#34;, &#34;AAAA&#34;, &#34;CNAME&#34;, &#34;MX&#34;, &#34;NS&#34;, &#34;OPENPGPKEY&#34;, &#34;PTR&#34;, &#34;TXT&#34;, &#34;CAA&#34;, &#34;CERT&#34;, &#34;DNSKEY&#34;, &#34;DS&#34;, &#34;HTTPS&#34;, &#34;LOC&#34;, &#34;NAPTR&#34;, &#34;SMIMEA&#34;, &#34;SRV&#34;, &#34;SSHFP&#34;, &#34;SVCB&#34;, &#34;TLSA&#34;, &#34;URI&#34;.
     * 
     */
    public String type() {
        return this.type;
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

    public static Builder builder(GetDnsRecordResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private String commentModifiedOn;
        private String content;
        private String createdOn;
        private GetDnsRecordData data;
        private @Nullable String dnsRecordId;
        private @Nullable GetDnsRecordFilter filter;
        private String id;
        private String meta;
        private String modifiedOn;
        private String name;
        private Double priority;
        private Boolean proxiable;
        private Boolean proxied;
        private GetDnsRecordSettings settings;
        private List<String> tags;
        private String tagsModifiedOn;
        private Double ttl;
        private String type;
        private String zoneId;
        public Builder() {}
        public Builder(GetDnsRecordResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.commentModifiedOn = defaults.commentModifiedOn;
    	      this.content = defaults.content;
    	      this.createdOn = defaults.createdOn;
    	      this.data = defaults.data;
    	      this.dnsRecordId = defaults.dnsRecordId;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.meta = defaults.meta;
    	      this.modifiedOn = defaults.modifiedOn;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.proxiable = defaults.proxiable;
    	      this.proxied = defaults.proxied;
    	      this.settings = defaults.settings;
    	      this.tags = defaults.tags;
    	      this.tagsModifiedOn = defaults.tagsModifiedOn;
    	      this.ttl = defaults.ttl;
    	      this.type = defaults.type;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordResult", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder commentModifiedOn(String commentModifiedOn) {
            if (commentModifiedOn == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordResult", "commentModifiedOn");
            }
            this.commentModifiedOn = commentModifiedOn;
            return this;
        }
        @CustomType.Setter
        public Builder content(String content) {
            if (content == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordResult", "content");
            }
            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            if (createdOn == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordResult", "createdOn");
            }
            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder data(GetDnsRecordData data) {
            if (data == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordResult", "data");
            }
            this.data = data;
            return this;
        }
        @CustomType.Setter
        public Builder dnsRecordId(@Nullable String dnsRecordId) {

            this.dnsRecordId = dnsRecordId;
            return this;
        }
        @CustomType.Setter
        public Builder filter(@Nullable GetDnsRecordFilter filter) {

            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder meta(String meta) {
            if (meta == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordResult", "meta");
            }
            this.meta = meta;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedOn(String modifiedOn) {
            if (modifiedOn == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordResult", "modifiedOn");
            }
            this.modifiedOn = modifiedOn;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder priority(Double priority) {
            if (priority == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordResult", "priority");
            }
            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder proxiable(Boolean proxiable) {
            if (proxiable == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordResult", "proxiable");
            }
            this.proxiable = proxiable;
            return this;
        }
        @CustomType.Setter
        public Builder proxied(Boolean proxied) {
            if (proxied == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordResult", "proxied");
            }
            this.proxied = proxied;
            return this;
        }
        @CustomType.Setter
        public Builder settings(GetDnsRecordSettings settings) {
            if (settings == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordResult", "settings");
            }
            this.settings = settings;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder tagsModifiedOn(String tagsModifiedOn) {
            if (tagsModifiedOn == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordResult", "tagsModifiedOn");
            }
            this.tagsModifiedOn = tagsModifiedOn;
            return this;
        }
        @CustomType.Setter
        public Builder ttl(Double ttl) {
            if (ttl == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordResult", "ttl");
            }
            this.ttl = ttl;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordResult", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        public GetDnsRecordResult build() {
            final var _resultValue = new GetDnsRecordResult();
            _resultValue.comment = comment;
            _resultValue.commentModifiedOn = commentModifiedOn;
            _resultValue.content = content;
            _resultValue.createdOn = createdOn;
            _resultValue.data = data;
            _resultValue.dnsRecordId = dnsRecordId;
            _resultValue.filter = filter;
            _resultValue.id = id;
            _resultValue.meta = meta;
            _resultValue.modifiedOn = modifiedOn;
            _resultValue.name = name;
            _resultValue.priority = priority;
            _resultValue.proxiable = proxiable;
            _resultValue.proxied = proxied;
            _resultValue.settings = settings;
            _resultValue.tags = tags;
            _resultValue.tagsModifiedOn = tagsModifiedOn;
            _resultValue.ttl = ttl;
            _resultValue.type = type;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
