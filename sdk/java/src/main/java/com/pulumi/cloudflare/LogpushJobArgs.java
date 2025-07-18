// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.LogpushJobOutputOptionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogpushJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogpushJobArgs Empty = new LogpushJobArgs();

    /**
     * The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Name of the dataset. A list of supported datasets can be found on the [Developer Docs](https://developers.cloudflare.com/logs/reference/log-fields/).
     * Available values: &#34;access*requests&#34;, &#34;audit*logs&#34;, &#34;biso*user*actions&#34;, &#34;casb*findings&#34;, &#34;device*posture*results&#34;, &#34;dlp*forensic*copies&#34;, &#34;dns*firewall*logs&#34;, &#34;dns*logs&#34;, &#34;email*security*alerts&#34;, &#34;firewall*events&#34;, &#34;gateway*dns&#34;, &#34;gateway*http&#34;, &#34;gateway*network&#34;, &#34;http*requests&#34;, &#34;magic*ids*detections&#34;, &#34;nel*reports&#34;, &#34;network*analytics*logs&#34;, &#34;page*shield*events&#34;, &#34;sinkhole*http*logs&#34;, &#34;spectrum*events&#34;, &#34;ssh*logs&#34;, &#34;workers*trace*events&#34;, &#34;zaraz*events&#34;, &#34;zero*trust*network*sessions&#34;.
     * 
     */
    @Import(name="dataset")
    private @Nullable Output<String> dataset;

    /**
     * @return Name of the dataset. A list of supported datasets can be found on the [Developer Docs](https://developers.cloudflare.com/logs/reference/log-fields/).
     * Available values: &#34;access*requests&#34;, &#34;audit*logs&#34;, &#34;biso*user*actions&#34;, &#34;casb*findings&#34;, &#34;device*posture*results&#34;, &#34;dlp*forensic*copies&#34;, &#34;dns*firewall*logs&#34;, &#34;dns*logs&#34;, &#34;email*security*alerts&#34;, &#34;firewall*events&#34;, &#34;gateway*dns&#34;, &#34;gateway*http&#34;, &#34;gateway*network&#34;, &#34;http*requests&#34;, &#34;magic*ids*detections&#34;, &#34;nel*reports&#34;, &#34;network*analytics*logs&#34;, &#34;page*shield*events&#34;, &#34;sinkhole*http*logs&#34;, &#34;spectrum*events&#34;, &#34;ssh*logs&#34;, &#34;workers*trace*events&#34;, &#34;zaraz*events&#34;, &#34;zero*trust*network*sessions&#34;.
     * 
     */
    public Optional<Output<String>> dataset() {
        return Optional.ofNullable(this.dataset);
    }

    /**
     * Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included.
     * 
     */
    @Import(name="destinationConf", required=true)
    private Output<String> destinationConf;

    /**
     * @return Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included.
     * 
     */
    public Output<String> destinationConf() {
        return this.destinationConf;
    }

    /**
     * Flag that indicates if the job is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Flag that indicates if the job is enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/filters/).
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return The filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/filters/).
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * This field is deprecated. Please use `max_upload_*` parameters instead. The frequency at which Cloudflare sends batches of logs to your destination. Setting frequency to high sends your logs in larger quantities of smaller files. Setting frequency to low sends logs in smaller quantities of larger files.
     * Available values: &#34;high&#34;, &#34;low&#34;.
     * 
     * @deprecated
     * This attribute is deprecated.
     * 
     */
    @Deprecated /* This attribute is deprecated. */
    @Import(name="frequency")
    private @Nullable Output<String> frequency;

    /**
     * @return This field is deprecated. Please use `max_upload_*` parameters instead. The frequency at which Cloudflare sends batches of logs to your destination. Setting frequency to high sends your logs in larger quantities of smaller files. Setting frequency to low sends logs in smaller quantities of larger files.
     * Available values: &#34;high&#34;, &#34;low&#34;.
     * 
     * @deprecated
     * This attribute is deprecated.
     * 
     */
    @Deprecated /* This attribute is deprecated. */
    public Optional<Output<String>> frequency() {
        return Optional.ofNullable(this.frequency);
    }

    /**
     * The kind parameter (optional) is used to differentiate between Logpush and Edge Log Delivery jobs. Currently, Edge Log Delivery is only supported for the `http_requests` dataset.
     * Available values: &#34;edge&#34;.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return The kind parameter (optional) is used to differentiate between Logpush and Edge Log Delivery jobs. Currently, Edge Log Delivery is only supported for the `http_requests` dataset.
     * Available values: &#34;edge&#34;.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * This field is deprecated. Use `output_options` instead. Configuration string. It specifies things like requested fields and timestamp formats. If migrating from the logpull api, copy the url (full url or just the query string) of your call here, and logpush will keep on making this call for you, setting start and end times appropriately.
     * 
     * @deprecated
     * This attribute is deprecated.
     * 
     */
    @Deprecated /* This attribute is deprecated. */
    @Import(name="logpullOptions")
    private @Nullable Output<String> logpullOptions;

    /**
     * @return This field is deprecated. Use `output_options` instead. Configuration string. It specifies things like requested fields and timestamp formats. If migrating from the logpull api, copy the url (full url or just the query string) of your call here, and logpush will keep on making this call for you, setting start and end times appropriately.
     * 
     * @deprecated
     * This attribute is deprecated.
     * 
     */
    @Deprecated /* This attribute is deprecated. */
    public Optional<Output<String>> logpullOptions() {
        return Optional.ofNullable(this.logpullOptions);
    }

    /**
     * The maximum uncompressed file size of a batch of logs. This setting value must be between `5 MB` and `1 GB`, or `0` to disable it. Note that you cannot set a minimum file size; this means that log files may be much smaller than this batch size. This parameter is not available for jobs with `edge` as its kind.
     * 
     */
    @Import(name="maxUploadBytes")
    private @Nullable Output<Integer> maxUploadBytes;

    /**
     * @return The maximum uncompressed file size of a batch of logs. This setting value must be between `5 MB` and `1 GB`, or `0` to disable it. Note that you cannot set a minimum file size; this means that log files may be much smaller than this batch size. This parameter is not available for jobs with `edge` as its kind.
     * 
     */
    public Optional<Output<Integer>> maxUploadBytes() {
        return Optional.ofNullable(this.maxUploadBytes);
    }

    /**
     * The maximum interval in seconds for log batches. This setting must be between 30 and 300 seconds (5 minutes), or `0` to disable it. Note that you cannot specify a minimum interval for log batches; this means that log files may be sent in shorter intervals than this. This parameter is only used for jobs with `edge` as its kind.
     * 
     */
    @Import(name="maxUploadIntervalSeconds")
    private @Nullable Output<Integer> maxUploadIntervalSeconds;

    /**
     * @return The maximum interval in seconds for log batches. This setting must be between 30 and 300 seconds (5 minutes), or `0` to disable it. Note that you cannot specify a minimum interval for log batches; this means that log files may be sent in shorter intervals than this. This parameter is only used for jobs with `edge` as its kind.
     * 
     */
    public Optional<Output<Integer>> maxUploadIntervalSeconds() {
        return Optional.ofNullable(this.maxUploadIntervalSeconds);
    }

    /**
     * The maximum number of log lines per batch. This setting must be between 1000 and 1,000,000 lines, or `0` to disable it. Note that you cannot specify a minimum number of log lines per batch; this means that log files may contain many fewer lines than this. This parameter is not available for jobs with `edge` as its kind.
     * 
     */
    @Import(name="maxUploadRecords")
    private @Nullable Output<Integer> maxUploadRecords;

    /**
     * @return The maximum number of log lines per batch. This setting must be between 1000 and 1,000,000 lines, or `0` to disable it. Note that you cannot specify a minimum number of log lines per batch; this means that log files may contain many fewer lines than this. This parameter is not available for jobs with `edge` as its kind.
     * 
     */
    public Optional<Output<Integer>> maxUploadRecords() {
        return Optional.ofNullable(this.maxUploadRecords);
    }

    /**
     * Optional human readable job name. Not unique. Cloudflare suggests that you set this to a meaningful string, like the domain name, to make it easier to identify your job.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Optional human readable job name. Not unique. Cloudflare suggests that you set this to a meaningful string, like the domain name, to make it easier to identify your job.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The structured replacement for `logpull_options`. When including this field, the `logpull_option` field will be ignored.
     * 
     */
    @Import(name="outputOptions")
    private @Nullable Output<LogpushJobOutputOptionsArgs> outputOptions;

    /**
     * @return The structured replacement for `logpull_options`. When including this field, the `logpull_option` field will be ignored.
     * 
     */
    public Optional<Output<LogpushJobOutputOptionsArgs>> outputOptions() {
        return Optional.ofNullable(this.outputOptions);
    }

    /**
     * Ownership challenge token to prove destination ownership.
     * 
     */
    @Import(name="ownershipChallenge")
    private @Nullable Output<String> ownershipChallenge;

    /**
     * @return Ownership challenge token to prove destination ownership.
     * 
     */
    public Optional<Output<String>> ownershipChallenge() {
        return Optional.ofNullable(this.ownershipChallenge);
    }

    /**
     * The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private LogpushJobArgs() {}

    private LogpushJobArgs(LogpushJobArgs $) {
        this.accountId = $.accountId;
        this.dataset = $.dataset;
        this.destinationConf = $.destinationConf;
        this.enabled = $.enabled;
        this.filter = $.filter;
        this.frequency = $.frequency;
        this.kind = $.kind;
        this.logpullOptions = $.logpullOptions;
        this.maxUploadBytes = $.maxUploadBytes;
        this.maxUploadIntervalSeconds = $.maxUploadIntervalSeconds;
        this.maxUploadRecords = $.maxUploadRecords;
        this.name = $.name;
        this.outputOptions = $.outputOptions;
        this.ownershipChallenge = $.ownershipChallenge;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogpushJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogpushJobArgs $;

        public Builder() {
            $ = new LogpushJobArgs();
        }

        public Builder(LogpushJobArgs defaults) {
            $ = new LogpushJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param dataset Name of the dataset. A list of supported datasets can be found on the [Developer Docs](https://developers.cloudflare.com/logs/reference/log-fields/).
         * Available values: &#34;access*requests&#34;, &#34;audit*logs&#34;, &#34;biso*user*actions&#34;, &#34;casb*findings&#34;, &#34;device*posture*results&#34;, &#34;dlp*forensic*copies&#34;, &#34;dns*firewall*logs&#34;, &#34;dns*logs&#34;, &#34;email*security*alerts&#34;, &#34;firewall*events&#34;, &#34;gateway*dns&#34;, &#34;gateway*http&#34;, &#34;gateway*network&#34;, &#34;http*requests&#34;, &#34;magic*ids*detections&#34;, &#34;nel*reports&#34;, &#34;network*analytics*logs&#34;, &#34;page*shield*events&#34;, &#34;sinkhole*http*logs&#34;, &#34;spectrum*events&#34;, &#34;ssh*logs&#34;, &#34;workers*trace*events&#34;, &#34;zaraz*events&#34;, &#34;zero*trust*network*sessions&#34;.
         * 
         * @return builder
         * 
         */
        public Builder dataset(@Nullable Output<String> dataset) {
            $.dataset = dataset;
            return this;
        }

        /**
         * @param dataset Name of the dataset. A list of supported datasets can be found on the [Developer Docs](https://developers.cloudflare.com/logs/reference/log-fields/).
         * Available values: &#34;access*requests&#34;, &#34;audit*logs&#34;, &#34;biso*user*actions&#34;, &#34;casb*findings&#34;, &#34;device*posture*results&#34;, &#34;dlp*forensic*copies&#34;, &#34;dns*firewall*logs&#34;, &#34;dns*logs&#34;, &#34;email*security*alerts&#34;, &#34;firewall*events&#34;, &#34;gateway*dns&#34;, &#34;gateway*http&#34;, &#34;gateway*network&#34;, &#34;http*requests&#34;, &#34;magic*ids*detections&#34;, &#34;nel*reports&#34;, &#34;network*analytics*logs&#34;, &#34;page*shield*events&#34;, &#34;sinkhole*http*logs&#34;, &#34;spectrum*events&#34;, &#34;ssh*logs&#34;, &#34;workers*trace*events&#34;, &#34;zaraz*events&#34;, &#34;zero*trust*network*sessions&#34;.
         * 
         * @return builder
         * 
         */
        public Builder dataset(String dataset) {
            return dataset(Output.of(dataset));
        }

        /**
         * @param destinationConf Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included.
         * 
         * @return builder
         * 
         */
        public Builder destinationConf(Output<String> destinationConf) {
            $.destinationConf = destinationConf;
            return this;
        }

        /**
         * @param destinationConf Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included.
         * 
         * @return builder
         * 
         */
        public Builder destinationConf(String destinationConf) {
            return destinationConf(Output.of(destinationConf));
        }

        /**
         * @param enabled Flag that indicates if the job is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Flag that indicates if the job is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param filter The filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/filters/).
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter The filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/filters/).
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param frequency This field is deprecated. Please use `max_upload_*` parameters instead. The frequency at which Cloudflare sends batches of logs to your destination. Setting frequency to high sends your logs in larger quantities of smaller files. Setting frequency to low sends logs in smaller quantities of larger files.
         * Available values: &#34;high&#34;, &#34;low&#34;.
         * 
         * @return builder
         * 
         * @deprecated
         * This attribute is deprecated.
         * 
         */
        @Deprecated /* This attribute is deprecated. */
        public Builder frequency(@Nullable Output<String> frequency) {
            $.frequency = frequency;
            return this;
        }

        /**
         * @param frequency This field is deprecated. Please use `max_upload_*` parameters instead. The frequency at which Cloudflare sends batches of logs to your destination. Setting frequency to high sends your logs in larger quantities of smaller files. Setting frequency to low sends logs in smaller quantities of larger files.
         * Available values: &#34;high&#34;, &#34;low&#34;.
         * 
         * @return builder
         * 
         * @deprecated
         * This attribute is deprecated.
         * 
         */
        @Deprecated /* This attribute is deprecated. */
        public Builder frequency(String frequency) {
            return frequency(Output.of(frequency));
        }

        /**
         * @param kind The kind parameter (optional) is used to differentiate between Logpush and Edge Log Delivery jobs. Currently, Edge Log Delivery is only supported for the `http_requests` dataset.
         * Available values: &#34;edge&#34;.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind parameter (optional) is used to differentiate between Logpush and Edge Log Delivery jobs. Currently, Edge Log Delivery is only supported for the `http_requests` dataset.
         * Available values: &#34;edge&#34;.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param logpullOptions This field is deprecated. Use `output_options` instead. Configuration string. It specifies things like requested fields and timestamp formats. If migrating from the logpull api, copy the url (full url or just the query string) of your call here, and logpush will keep on making this call for you, setting start and end times appropriately.
         * 
         * @return builder
         * 
         * @deprecated
         * This attribute is deprecated.
         * 
         */
        @Deprecated /* This attribute is deprecated. */
        public Builder logpullOptions(@Nullable Output<String> logpullOptions) {
            $.logpullOptions = logpullOptions;
            return this;
        }

        /**
         * @param logpullOptions This field is deprecated. Use `output_options` instead. Configuration string. It specifies things like requested fields and timestamp formats. If migrating from the logpull api, copy the url (full url or just the query string) of your call here, and logpush will keep on making this call for you, setting start and end times appropriately.
         * 
         * @return builder
         * 
         * @deprecated
         * This attribute is deprecated.
         * 
         */
        @Deprecated /* This attribute is deprecated. */
        public Builder logpullOptions(String logpullOptions) {
            return logpullOptions(Output.of(logpullOptions));
        }

        /**
         * @param maxUploadBytes The maximum uncompressed file size of a batch of logs. This setting value must be between `5 MB` and `1 GB`, or `0` to disable it. Note that you cannot set a minimum file size; this means that log files may be much smaller than this batch size. This parameter is not available for jobs with `edge` as its kind.
         * 
         * @return builder
         * 
         */
        public Builder maxUploadBytes(@Nullable Output<Integer> maxUploadBytes) {
            $.maxUploadBytes = maxUploadBytes;
            return this;
        }

        /**
         * @param maxUploadBytes The maximum uncompressed file size of a batch of logs. This setting value must be between `5 MB` and `1 GB`, or `0` to disable it. Note that you cannot set a minimum file size; this means that log files may be much smaller than this batch size. This parameter is not available for jobs with `edge` as its kind.
         * 
         * @return builder
         * 
         */
        public Builder maxUploadBytes(Integer maxUploadBytes) {
            return maxUploadBytes(Output.of(maxUploadBytes));
        }

        /**
         * @param maxUploadIntervalSeconds The maximum interval in seconds for log batches. This setting must be between 30 and 300 seconds (5 minutes), or `0` to disable it. Note that you cannot specify a minimum interval for log batches; this means that log files may be sent in shorter intervals than this. This parameter is only used for jobs with `edge` as its kind.
         * 
         * @return builder
         * 
         */
        public Builder maxUploadIntervalSeconds(@Nullable Output<Integer> maxUploadIntervalSeconds) {
            $.maxUploadIntervalSeconds = maxUploadIntervalSeconds;
            return this;
        }

        /**
         * @param maxUploadIntervalSeconds The maximum interval in seconds for log batches. This setting must be between 30 and 300 seconds (5 minutes), or `0` to disable it. Note that you cannot specify a minimum interval for log batches; this means that log files may be sent in shorter intervals than this. This parameter is only used for jobs with `edge` as its kind.
         * 
         * @return builder
         * 
         */
        public Builder maxUploadIntervalSeconds(Integer maxUploadIntervalSeconds) {
            return maxUploadIntervalSeconds(Output.of(maxUploadIntervalSeconds));
        }

        /**
         * @param maxUploadRecords The maximum number of log lines per batch. This setting must be between 1000 and 1,000,000 lines, or `0` to disable it. Note that you cannot specify a minimum number of log lines per batch; this means that log files may contain many fewer lines than this. This parameter is not available for jobs with `edge` as its kind.
         * 
         * @return builder
         * 
         */
        public Builder maxUploadRecords(@Nullable Output<Integer> maxUploadRecords) {
            $.maxUploadRecords = maxUploadRecords;
            return this;
        }

        /**
         * @param maxUploadRecords The maximum number of log lines per batch. This setting must be between 1000 and 1,000,000 lines, or `0` to disable it. Note that you cannot specify a minimum number of log lines per batch; this means that log files may contain many fewer lines than this. This parameter is not available for jobs with `edge` as its kind.
         * 
         * @return builder
         * 
         */
        public Builder maxUploadRecords(Integer maxUploadRecords) {
            return maxUploadRecords(Output.of(maxUploadRecords));
        }

        /**
         * @param name Optional human readable job name. Not unique. Cloudflare suggests that you set this to a meaningful string, like the domain name, to make it easier to identify your job.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Optional human readable job name. Not unique. Cloudflare suggests that you set this to a meaningful string, like the domain name, to make it easier to identify your job.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outputOptions The structured replacement for `logpull_options`. When including this field, the `logpull_option` field will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder outputOptions(@Nullable Output<LogpushJobOutputOptionsArgs> outputOptions) {
            $.outputOptions = outputOptions;
            return this;
        }

        /**
         * @param outputOptions The structured replacement for `logpull_options`. When including this field, the `logpull_option` field will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder outputOptions(LogpushJobOutputOptionsArgs outputOptions) {
            return outputOptions(Output.of(outputOptions));
        }

        /**
         * @param ownershipChallenge Ownership challenge token to prove destination ownership.
         * 
         * @return builder
         * 
         */
        public Builder ownershipChallenge(@Nullable Output<String> ownershipChallenge) {
            $.ownershipChallenge = ownershipChallenge;
            return this;
        }

        /**
         * @param ownershipChallenge Ownership challenge token to prove destination ownership.
         * 
         * @return builder
         * 
         */
        public Builder ownershipChallenge(String ownershipChallenge) {
            return ownershipChallenge(Output.of(ownershipChallenge));
        }

        /**
         * @param zoneId The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public LogpushJobArgs build() {
            if ($.destinationConf == null) {
                throw new MissingRequiredPropertyException("LogpushJobArgs", "destinationConf");
            }
            return $;
        }
    }

}
