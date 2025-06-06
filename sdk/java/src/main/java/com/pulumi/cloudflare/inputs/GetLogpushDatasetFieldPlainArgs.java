// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLogpushDatasetFieldPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLogpushDatasetFieldPlainArgs Empty = new GetLogpushDatasetFieldPlainArgs();

    /**
     * The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    @Import(name="accountId")
    private @Nullable String accountId;

    /**
     * @return The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    public Optional<String> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Name of the dataset. A list of supported datasets can be found on the [Developer Docs](https://developers.cloudflare.com/logs/reference/log-fields/).
     * Available values: &#34;access*requests&#34;, &#34;audit*logs&#34;, &#34;biso*user*actions&#34;, &#34;casb*findings&#34;, &#34;device*posture*results&#34;, &#34;dlp*forensic*copies&#34;, &#34;dns*firewall*logs&#34;, &#34;dns*logs&#34;, &#34;email*security*alerts&#34;, &#34;firewall*events&#34;, &#34;gateway*dns&#34;, &#34;gateway*http&#34;, &#34;gateway*network&#34;, &#34;http*requests&#34;, &#34;magic*ids*detections&#34;, &#34;nel*reports&#34;, &#34;network*analytics*logs&#34;, &#34;page*shield*events&#34;, &#34;sinkhole*http*logs&#34;, &#34;spectrum*events&#34;, &#34;ssh*logs&#34;, &#34;workers*trace*events&#34;, &#34;zaraz*events&#34;, &#34;zero*trust*network*sessions&#34;.
     * 
     */
    @Import(name="datasetId")
    private @Nullable String datasetId;

    /**
     * @return Name of the dataset. A list of supported datasets can be found on the [Developer Docs](https://developers.cloudflare.com/logs/reference/log-fields/).
     * Available values: &#34;access*requests&#34;, &#34;audit*logs&#34;, &#34;biso*user*actions&#34;, &#34;casb*findings&#34;, &#34;device*posture*results&#34;, &#34;dlp*forensic*copies&#34;, &#34;dns*firewall*logs&#34;, &#34;dns*logs&#34;, &#34;email*security*alerts&#34;, &#34;firewall*events&#34;, &#34;gateway*dns&#34;, &#34;gateway*http&#34;, &#34;gateway*network&#34;, &#34;http*requests&#34;, &#34;magic*ids*detections&#34;, &#34;nel*reports&#34;, &#34;network*analytics*logs&#34;, &#34;page*shield*events&#34;, &#34;sinkhole*http*logs&#34;, &#34;spectrum*events&#34;, &#34;ssh*logs&#34;, &#34;workers*trace*events&#34;, &#34;zaraz*events&#34;, &#34;zero*trust*network*sessions&#34;.
     * 
     */
    public Optional<String> datasetId() {
        return Optional.ofNullable(this.datasetId);
    }

    /**
     * The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    @Import(name="zoneId")
    private @Nullable String zoneId;

    /**
     * @return The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private GetLogpushDatasetFieldPlainArgs() {}

    private GetLogpushDatasetFieldPlainArgs(GetLogpushDatasetFieldPlainArgs $) {
        this.accountId = $.accountId;
        this.datasetId = $.datasetId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLogpushDatasetFieldPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLogpushDatasetFieldPlainArgs $;

        public Builder() {
            $ = new GetLogpushDatasetFieldPlainArgs();
        }

        public Builder(GetLogpushDatasetFieldPlainArgs defaults) {
            $ = new GetLogpushDatasetFieldPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param datasetId Name of the dataset. A list of supported datasets can be found on the [Developer Docs](https://developers.cloudflare.com/logs/reference/log-fields/).
         * Available values: &#34;access*requests&#34;, &#34;audit*logs&#34;, &#34;biso*user*actions&#34;, &#34;casb*findings&#34;, &#34;device*posture*results&#34;, &#34;dlp*forensic*copies&#34;, &#34;dns*firewall*logs&#34;, &#34;dns*logs&#34;, &#34;email*security*alerts&#34;, &#34;firewall*events&#34;, &#34;gateway*dns&#34;, &#34;gateway*http&#34;, &#34;gateway*network&#34;, &#34;http*requests&#34;, &#34;magic*ids*detections&#34;, &#34;nel*reports&#34;, &#34;network*analytics*logs&#34;, &#34;page*shield*events&#34;, &#34;sinkhole*http*logs&#34;, &#34;spectrum*events&#34;, &#34;ssh*logs&#34;, &#34;workers*trace*events&#34;, &#34;zaraz*events&#34;, &#34;zero*trust*network*sessions&#34;.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(@Nullable String datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        /**
         * @param zoneId The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable String zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public GetLogpushDatasetFieldPlainArgs build() {
            return $;
        }
    }

}
