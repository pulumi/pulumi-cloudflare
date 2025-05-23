// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetDnsRecordsComment;
import com.pulumi.cloudflare.outputs.GetDnsRecordsContent;
import com.pulumi.cloudflare.outputs.GetDnsRecordsName;
import com.pulumi.cloudflare.outputs.GetDnsRecordsResult;
import com.pulumi.cloudflare.outputs.GetDnsRecordsTag;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDnsRecordsInvokeResult {
    private @Nullable GetDnsRecordsComment comment;
    private @Nullable GetDnsRecordsContent content;
    /**
     * @return Direction to order DNS records in.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    private String direction;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Whether to match all search requirements or at least one (any). If set to `all`, acts like a logical AND between filters. If set to `any`, acts like a logical OR instead. Note that the interaction between tag filters is controlled by the `tag-match` parameter instead.
     * Available values: &#34;any&#34;, &#34;all&#34;.
     * 
     */
    private String match;
    /**
     * @return Max items to fetch, default: 1000
     * 
     */
    private @Nullable Integer maxItems;
    private @Nullable GetDnsRecordsName name;
    /**
     * @return Field to order DNS records by.
     * Available values: &#34;type&#34;, &#34;name&#34;, &#34;content&#34;, &#34;ttl&#34;, &#34;proxied&#34;.
     * 
     */
    private String order;
    /**
     * @return Whether the record is receiving the performance and security benefits of Cloudflare.
     * 
     */
    private Boolean proxied;
    /**
     * @return The items returned by the data source
     * 
     */
    private List<GetDnsRecordsResult> results;
    /**
     * @return Allows searching in multiple properties of a DNS record simultaneously. This parameter is intended for human users, not automation. Its exact behavior is intentionally left unspecified and is subject to change in the future. This parameter works independently of the `match` setting. For automated searches, please use the other available parameters.
     * 
     */
    private @Nullable String search;
    private @Nullable GetDnsRecordsTag tag;
    /**
     * @return Whether to match all tag search requirements or at least one (any). If set to `all`, acts like a logical AND between tag filters. If set to `any`, acts like a logical OR instead. Note that the regular `match` parameter is still used to combine the resulting condition with other filters that aren&#39;t related to tags.
     * Available values: &#34;any&#34;, &#34;all&#34;.
     * 
     */
    private String tagMatch;
    /**
     * @return Record type.
     * Available values: &#34;A&#34;, &#34;AAAA&#34;, &#34;CAA&#34;, &#34;CERT&#34;, &#34;CNAME&#34;, &#34;DNSKEY&#34;, &#34;DS&#34;, &#34;HTTPS&#34;, &#34;LOC&#34;, &#34;MX&#34;, &#34;NAPTR&#34;, &#34;NS&#34;, &#34;OPENPGPKEY&#34;, &#34;PTR&#34;, &#34;SMIMEA&#34;, &#34;SRV&#34;, &#34;SSHFP&#34;, &#34;SVCB&#34;, &#34;TLSA&#34;, &#34;TXT&#34;, &#34;URI&#34;.
     * 
     */
    private @Nullable String type;
    /**
     * @return Identifier.
     * 
     */
    private String zoneId;

    private GetDnsRecordsInvokeResult() {}
    public Optional<GetDnsRecordsComment> comment() {
        return Optional.ofNullable(this.comment);
    }
    public Optional<GetDnsRecordsContent> content() {
        return Optional.ofNullable(this.content);
    }
    /**
     * @return Direction to order DNS records in.
     * Available values: &#34;asc&#34;, &#34;desc&#34;.
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Whether to match all search requirements or at least one (any). If set to `all`, acts like a logical AND between filters. If set to `any`, acts like a logical OR instead. Note that the interaction between tag filters is controlled by the `tag-match` parameter instead.
     * Available values: &#34;any&#34;, &#34;all&#34;.
     * 
     */
    public String match() {
        return this.match;
    }
    /**
     * @return Max items to fetch, default: 1000
     * 
     */
    public Optional<Integer> maxItems() {
        return Optional.ofNullable(this.maxItems);
    }
    public Optional<GetDnsRecordsName> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Field to order DNS records by.
     * Available values: &#34;type&#34;, &#34;name&#34;, &#34;content&#34;, &#34;ttl&#34;, &#34;proxied&#34;.
     * 
     */
    public String order() {
        return this.order;
    }
    /**
     * @return Whether the record is receiving the performance and security benefits of Cloudflare.
     * 
     */
    public Boolean proxied() {
        return this.proxied;
    }
    /**
     * @return The items returned by the data source
     * 
     */
    public List<GetDnsRecordsResult> results() {
        return this.results;
    }
    /**
     * @return Allows searching in multiple properties of a DNS record simultaneously. This parameter is intended for human users, not automation. Its exact behavior is intentionally left unspecified and is subject to change in the future. This parameter works independently of the `match` setting. For automated searches, please use the other available parameters.
     * 
     */
    public Optional<String> search() {
        return Optional.ofNullable(this.search);
    }
    public Optional<GetDnsRecordsTag> tag() {
        return Optional.ofNullable(this.tag);
    }
    /**
     * @return Whether to match all tag search requirements or at least one (any). If set to `all`, acts like a logical AND between tag filters. If set to `any`, acts like a logical OR instead. Note that the regular `match` parameter is still used to combine the resulting condition with other filters that aren&#39;t related to tags.
     * Available values: &#34;any&#34;, &#34;all&#34;.
     * 
     */
    public String tagMatch() {
        return this.tagMatch;
    }
    /**
     * @return Record type.
     * Available values: &#34;A&#34;, &#34;AAAA&#34;, &#34;CAA&#34;, &#34;CERT&#34;, &#34;CNAME&#34;, &#34;DNSKEY&#34;, &#34;DS&#34;, &#34;HTTPS&#34;, &#34;LOC&#34;, &#34;MX&#34;, &#34;NAPTR&#34;, &#34;NS&#34;, &#34;OPENPGPKEY&#34;, &#34;PTR&#34;, &#34;SMIMEA&#34;, &#34;SRV&#34;, &#34;SSHFP&#34;, &#34;SVCB&#34;, &#34;TLSA&#34;, &#34;TXT&#34;, &#34;URI&#34;.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
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

    public static Builder builder(GetDnsRecordsInvokeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetDnsRecordsComment comment;
        private @Nullable GetDnsRecordsContent content;
        private String direction;
        private String id;
        private String match;
        private @Nullable Integer maxItems;
        private @Nullable GetDnsRecordsName name;
        private String order;
        private Boolean proxied;
        private List<GetDnsRecordsResult> results;
        private @Nullable String search;
        private @Nullable GetDnsRecordsTag tag;
        private String tagMatch;
        private @Nullable String type;
        private String zoneId;
        public Builder() {}
        public Builder(GetDnsRecordsInvokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.content = defaults.content;
    	      this.direction = defaults.direction;
    	      this.id = defaults.id;
    	      this.match = defaults.match;
    	      this.maxItems = defaults.maxItems;
    	      this.name = defaults.name;
    	      this.order = defaults.order;
    	      this.proxied = defaults.proxied;
    	      this.results = defaults.results;
    	      this.search = defaults.search;
    	      this.tag = defaults.tag;
    	      this.tagMatch = defaults.tagMatch;
    	      this.type = defaults.type;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder comment(@Nullable GetDnsRecordsComment comment) {

            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder content(@Nullable GetDnsRecordsContent content) {

            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder direction(String direction) {
            if (direction == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordsInvokeResult", "direction");
            }
            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordsInvokeResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder match(String match) {
            if (match == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordsInvokeResult", "match");
            }
            this.match = match;
            return this;
        }
        @CustomType.Setter
        public Builder maxItems(@Nullable Integer maxItems) {

            this.maxItems = maxItems;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable GetDnsRecordsName name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder order(String order) {
            if (order == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordsInvokeResult", "order");
            }
            this.order = order;
            return this;
        }
        @CustomType.Setter
        public Builder proxied(Boolean proxied) {
            if (proxied == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordsInvokeResult", "proxied");
            }
            this.proxied = proxied;
            return this;
        }
        @CustomType.Setter
        public Builder results(List<GetDnsRecordsResult> results) {
            if (results == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordsInvokeResult", "results");
            }
            this.results = results;
            return this;
        }
        public Builder results(GetDnsRecordsResult... results) {
            return results(List.of(results));
        }
        @CustomType.Setter
        public Builder search(@Nullable String search) {

            this.search = search;
            return this;
        }
        @CustomType.Setter
        public Builder tag(@Nullable GetDnsRecordsTag tag) {

            this.tag = tag;
            return this;
        }
        @CustomType.Setter
        public Builder tagMatch(String tagMatch) {
            if (tagMatch == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordsInvokeResult", "tagMatch");
            }
            this.tagMatch = tagMatch;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordsInvokeResult", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        public GetDnsRecordsInvokeResult build() {
            final var _resultValue = new GetDnsRecordsInvokeResult();
            _resultValue.comment = comment;
            _resultValue.content = content;
            _resultValue.direction = direction;
            _resultValue.id = id;
            _resultValue.match = match;
            _resultValue.maxItems = maxItems;
            _resultValue.name = name;
            _resultValue.order = order;
            _resultValue.proxied = proxied;
            _resultValue.results = results;
            _resultValue.search = search;
            _resultValue.tag = tag;
            _resultValue.tagMatch = tagMatch;
            _resultValue.type = type;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
