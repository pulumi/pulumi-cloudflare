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
     * The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The kind of the dataset to use with the logpush job. Available values: `access_requests`, `casb_findings`, `firewall_events`, `http_requests`, `spectrum_events`, `nel_reports`, `audit_logs`, `gateway_dns`, `gateway_http`, `gateway_network`, `dns_logs`, `network_analytics_logs`, `workers_trace_events`, `device_posture_results`, `zero_trust_network_sessions`, `magic_ids_detections`, `page_shield_events`, `dlp_forensic_copies`.
     * 
     */
    @Import(name="dataset", required=true)
    private Output<String> dataset;

    /**
     * @return The kind of the dataset to use with the logpush job. Available values: `access_requests`, `casb_findings`, `firewall_events`, `http_requests`, `spectrum_events`, `nel_reports`, `audit_logs`, `gateway_dns`, `gateway_http`, `gateway_network`, `dns_logs`, `network_analytics_logs`, `workers_trace_events`, `device_posture_results`, `zero_trust_network_sessions`, `magic_ids_detections`, `page_shield_events`, `dlp_forensic_copies`.
     * 
     */
    public Output<String> dataset() {
        return this.dataset;
    }

    /**
     * Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
     * 
     */
    @Import(name="destinationConf", required=true)
    private Output<String> destinationConf;

    /**
     * @return Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
     * 
     */
    public Output<String> destinationConf() {
        return this.destinationConf;
    }

    /**
     * Whether to enable the job.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether to enable the job.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Use filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/logpush-api-configuration/filters/).
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return Use filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/logpush-api-configuration/filters/).
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * A higher frequency will result in logs being pushed on faster with smaller files. `low` frequency will push logs less often with larger files. Available values: `high`, `low`. Defaults to `high`.
     * 
     * @deprecated
     * `frequency` has been deprecated in favour of using `max_upload_interval_seconds` instead.
     * 
     */
    @Deprecated /* `frequency` has been deprecated in favour of using `max_upload_interval_seconds` instead. */
    @Import(name="frequency")
    private @Nullable Output<String> frequency;

    /**
     * @return A higher frequency will result in logs being pushed on faster with smaller files. `low` frequency will push logs less often with larger files. Available values: `high`, `low`. Defaults to `high`.
     * 
     * @deprecated
     * `frequency` has been deprecated in favour of using `max_upload_interval_seconds` instead.
     * 
     */
    @Deprecated /* `frequency` has been deprecated in favour of using `max_upload_interval_seconds` instead. */
    public Optional<Output<String>> frequency() {
        return Optional.ofNullable(this.frequency);
    }

    /**
     * The kind of logpush job to create. Available values: `edge`, `instant-logs`, `&#34;&#34;`.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return The kind of logpush job to create. Available values: `edge`, `instant-logs`, `&#34;&#34;`.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpush options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
     * 
     */
    @Import(name="logpullOptions")
    private @Nullable Output<String> logpullOptions;

    /**
     * @return Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpush options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
     * 
     */
    public Optional<Output<String>> logpullOptions() {
        return Optional.ofNullable(this.logpullOptions);
    }

    /**
     * The maximum uncompressed file size of a batch of logs. Value must be between 5MB and 1GB.
     * 
     */
    @Import(name="maxUploadBytes")
    private @Nullable Output<Integer> maxUploadBytes;

    /**
     * @return The maximum uncompressed file size of a batch of logs. Value must be between 5MB and 1GB.
     * 
     */
    public Optional<Output<Integer>> maxUploadBytes() {
        return Optional.ofNullable(this.maxUploadBytes);
    }

    /**
     * The maximum interval in seconds for log batches. Value must be between 30 and 300.
     * 
     */
    @Import(name="maxUploadIntervalSeconds")
    private @Nullable Output<Integer> maxUploadIntervalSeconds;

    /**
     * @return The maximum interval in seconds for log batches. Value must be between 30 and 300.
     * 
     */
    public Optional<Output<Integer>> maxUploadIntervalSeconds() {
        return Optional.ofNullable(this.maxUploadIntervalSeconds);
    }

    /**
     * The maximum number of log lines per batch. Value must be between 1000 and 1,000,000.
     * 
     */
    @Import(name="maxUploadRecords")
    private @Nullable Output<Integer> maxUploadRecords;

    /**
     * @return The maximum number of log lines per batch. Value must be between 1000 and 1,000,000.
     * 
     */
    public Optional<Output<Integer>> maxUploadRecords() {
        return Optional.ofNullable(this.maxUploadRecords);
    }

    /**
     * The name of the logpush job to create.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the logpush job to create.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Structured replacement for logpull*options. When including this field, the logpull*option field will be ignored.
     * 
     */
    @Import(name="outputOptions")
    private @Nullable Output<LogpushJobOutputOptionsArgs> outputOptions;

    /**
     * @return Structured replacement for logpull*options. When including this field, the logpull*option field will be ignored.
     * 
     */
    public Optional<Output<LogpushJobOutputOptionsArgs>> outputOptions() {
        return Optional.ofNullable(this.outputOptions);
    }

    /**
     * Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage, Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
     * 
     */
    @Import(name="ownershipChallenge")
    private @Nullable Output<String> ownershipChallenge;

    /**
     * @return Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage, Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
     * 
     */
    public Optional<Output<String>> ownershipChallenge() {
        return Optional.ofNullable(this.ownershipChallenge);
    }

    /**
     * The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
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
         * @param accountId The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param dataset The kind of the dataset to use with the logpush job. Available values: `access_requests`, `casb_findings`, `firewall_events`, `http_requests`, `spectrum_events`, `nel_reports`, `audit_logs`, `gateway_dns`, `gateway_http`, `gateway_network`, `dns_logs`, `network_analytics_logs`, `workers_trace_events`, `device_posture_results`, `zero_trust_network_sessions`, `magic_ids_detections`, `page_shield_events`, `dlp_forensic_copies`.
         * 
         * @return builder
         * 
         */
        public Builder dataset(Output<String> dataset) {
            $.dataset = dataset;
            return this;
        }

        /**
         * @param dataset The kind of the dataset to use with the logpush job. Available values: `access_requests`, `casb_findings`, `firewall_events`, `http_requests`, `spectrum_events`, `nel_reports`, `audit_logs`, `gateway_dns`, `gateway_http`, `gateway_network`, `dns_logs`, `network_analytics_logs`, `workers_trace_events`, `device_posture_results`, `zero_trust_network_sessions`, `magic_ids_detections`, `page_shield_events`, `dlp_forensic_copies`.
         * 
         * @return builder
         * 
         */
        public Builder dataset(String dataset) {
            return dataset(Output.of(dataset));
        }

        /**
         * @param destinationConf Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
         * 
         * @return builder
         * 
         */
        public Builder destinationConf(Output<String> destinationConf) {
            $.destinationConf = destinationConf;
            return this;
        }

        /**
         * @param destinationConf Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
         * 
         * @return builder
         * 
         */
        public Builder destinationConf(String destinationConf) {
            return destinationConf(Output.of(destinationConf));
        }

        /**
         * @param enabled Whether to enable the job.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable the job.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param filter Use filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/logpush-api-configuration/filters/).
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Use filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/logpush-api-configuration/filters/).
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param frequency A higher frequency will result in logs being pushed on faster with smaller files. `low` frequency will push logs less often with larger files. Available values: `high`, `low`. Defaults to `high`.
         * 
         * @return builder
         * 
         * @deprecated
         * `frequency` has been deprecated in favour of using `max_upload_interval_seconds` instead.
         * 
         */
        @Deprecated /* `frequency` has been deprecated in favour of using `max_upload_interval_seconds` instead. */
        public Builder frequency(@Nullable Output<String> frequency) {
            $.frequency = frequency;
            return this;
        }

        /**
         * @param frequency A higher frequency will result in logs being pushed on faster with smaller files. `low` frequency will push logs less often with larger files. Available values: `high`, `low`. Defaults to `high`.
         * 
         * @return builder
         * 
         * @deprecated
         * `frequency` has been deprecated in favour of using `max_upload_interval_seconds` instead.
         * 
         */
        @Deprecated /* `frequency` has been deprecated in favour of using `max_upload_interval_seconds` instead. */
        public Builder frequency(String frequency) {
            return frequency(Output.of(frequency));
        }

        /**
         * @param kind The kind of logpush job to create. Available values: `edge`, `instant-logs`, `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of logpush job to create. Available values: `edge`, `instant-logs`, `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param logpullOptions Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpush options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
         * 
         * @return builder
         * 
         */
        public Builder logpullOptions(@Nullable Output<String> logpullOptions) {
            $.logpullOptions = logpullOptions;
            return this;
        }

        /**
         * @param logpullOptions Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpush options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
         * 
         * @return builder
         * 
         */
        public Builder logpullOptions(String logpullOptions) {
            return logpullOptions(Output.of(logpullOptions));
        }

        /**
         * @param maxUploadBytes The maximum uncompressed file size of a batch of logs. Value must be between 5MB and 1GB.
         * 
         * @return builder
         * 
         */
        public Builder maxUploadBytes(@Nullable Output<Integer> maxUploadBytes) {
            $.maxUploadBytes = maxUploadBytes;
            return this;
        }

        /**
         * @param maxUploadBytes The maximum uncompressed file size of a batch of logs. Value must be between 5MB and 1GB.
         * 
         * @return builder
         * 
         */
        public Builder maxUploadBytes(Integer maxUploadBytes) {
            return maxUploadBytes(Output.of(maxUploadBytes));
        }

        /**
         * @param maxUploadIntervalSeconds The maximum interval in seconds for log batches. Value must be between 30 and 300.
         * 
         * @return builder
         * 
         */
        public Builder maxUploadIntervalSeconds(@Nullable Output<Integer> maxUploadIntervalSeconds) {
            $.maxUploadIntervalSeconds = maxUploadIntervalSeconds;
            return this;
        }

        /**
         * @param maxUploadIntervalSeconds The maximum interval in seconds for log batches. Value must be between 30 and 300.
         * 
         * @return builder
         * 
         */
        public Builder maxUploadIntervalSeconds(Integer maxUploadIntervalSeconds) {
            return maxUploadIntervalSeconds(Output.of(maxUploadIntervalSeconds));
        }

        /**
         * @param maxUploadRecords The maximum number of log lines per batch. Value must be between 1000 and 1,000,000.
         * 
         * @return builder
         * 
         */
        public Builder maxUploadRecords(@Nullable Output<Integer> maxUploadRecords) {
            $.maxUploadRecords = maxUploadRecords;
            return this;
        }

        /**
         * @param maxUploadRecords The maximum number of log lines per batch. Value must be between 1000 and 1,000,000.
         * 
         * @return builder
         * 
         */
        public Builder maxUploadRecords(Integer maxUploadRecords) {
            return maxUploadRecords(Output.of(maxUploadRecords));
        }

        /**
         * @param name The name of the logpush job to create.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the logpush job to create.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outputOptions Structured replacement for logpull*options. When including this field, the logpull*option field will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder outputOptions(@Nullable Output<LogpushJobOutputOptionsArgs> outputOptions) {
            $.outputOptions = outputOptions;
            return this;
        }

        /**
         * @param outputOptions Structured replacement for logpull*options. When including this field, the logpull*option field will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder outputOptions(LogpushJobOutputOptionsArgs outputOptions) {
            return outputOptions(Output.of(outputOptions));
        }

        /**
         * @param ownershipChallenge Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage, Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
         * 
         * @return builder
         * 
         */
        public Builder ownershipChallenge(@Nullable Output<String> ownershipChallenge) {
            $.ownershipChallenge = ownershipChallenge;
            return this;
        }

        /**
         * @param ownershipChallenge Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage, Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
         * 
         * @return builder
         * 
         */
        public Builder ownershipChallenge(String ownershipChallenge) {
            return ownershipChallenge(Output.of(ownershipChallenge));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public LogpushJobArgs build() {
            if ($.dataset == null) {
                throw new MissingRequiredPropertyException("LogpushJobArgs", "dataset");
            }
            if ($.destinationConf == null) {
                throw new MissingRequiredPropertyException("LogpushJobArgs", "destinationConf");
            }
            return $;
        }
    }

}
