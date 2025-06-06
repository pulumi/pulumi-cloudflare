// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLogpushDatasetFieldResult {
    /**
     * @return The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    private @Nullable String accountId;
    /**
     * @return Name of the dataset. A list of supported datasets can be found on the [Developer Docs](https://developers.cloudflare.com/logs/reference/log-fields/).
     * Available values: &#34;access*requests&#34;, &#34;audit*logs&#34;, &#34;biso*user*actions&#34;, &#34;casb*findings&#34;, &#34;device*posture*results&#34;, &#34;dlp*forensic*copies&#34;, &#34;dns*firewall*logs&#34;, &#34;dns*logs&#34;, &#34;email*security*alerts&#34;, &#34;firewall*events&#34;, &#34;gateway*dns&#34;, &#34;gateway*http&#34;, &#34;gateway*network&#34;, &#34;http*requests&#34;, &#34;magic*ids*detections&#34;, &#34;nel*reports&#34;, &#34;network*analytics*logs&#34;, &#34;page*shield*events&#34;, &#34;sinkhole*http*logs&#34;, &#34;spectrum*events&#34;, &#34;ssh*logs&#34;, &#34;workers*trace*events&#34;, &#34;zaraz*events&#34;, &#34;zero*trust*network*sessions&#34;.
     * 
     */
    private String datasetId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    private @Nullable String zoneId;

    private GetLogpushDatasetFieldResult() {}
    /**
     * @return The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    public Optional<String> accountId() {
        return Optional.ofNullable(this.accountId);
    }
    /**
     * @return Name of the dataset. A list of supported datasets can be found on the [Developer Docs](https://developers.cloudflare.com/logs/reference/log-fields/).
     * Available values: &#34;access*requests&#34;, &#34;audit*logs&#34;, &#34;biso*user*actions&#34;, &#34;casb*findings&#34;, &#34;device*posture*results&#34;, &#34;dlp*forensic*copies&#34;, &#34;dns*firewall*logs&#34;, &#34;dns*logs&#34;, &#34;email*security*alerts&#34;, &#34;firewall*events&#34;, &#34;gateway*dns&#34;, &#34;gateway*http&#34;, &#34;gateway*network&#34;, &#34;http*requests&#34;, &#34;magic*ids*detections&#34;, &#34;nel*reports&#34;, &#34;network*analytics*logs&#34;, &#34;page*shield*events&#34;, &#34;sinkhole*http*logs&#34;, &#34;spectrum*events&#34;, &#34;ssh*logs&#34;, &#34;workers*trace*events&#34;, &#34;zaraz*events&#34;, &#34;zero*trust*network*sessions&#34;.
     * 
     */
    public String datasetId() {
        return this.datasetId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLogpushDatasetFieldResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accountId;
        private String datasetId;
        private String id;
        private @Nullable String zoneId;
        public Builder() {}
        public Builder(GetLogpushDatasetFieldResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.datasetId = defaults.datasetId;
    	      this.id = defaults.id;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder accountId(@Nullable String accountId) {

            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder datasetId(String datasetId) {
            if (datasetId == null) {
              throw new MissingRequiredPropertyException("GetLogpushDatasetFieldResult", "datasetId");
            }
            this.datasetId = datasetId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetLogpushDatasetFieldResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(@Nullable String zoneId) {

            this.zoneId = zoneId;
            return this;
        }
        public GetLogpushDatasetFieldResult build() {
            final var _resultValue = new GetLogpushDatasetFieldResult();
            _resultValue.accountId = accountId;
            _resultValue.datasetId = datasetId;
            _resultValue.id = id;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
