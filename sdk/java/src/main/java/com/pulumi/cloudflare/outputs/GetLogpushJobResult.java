// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetLogpushJobOutputOptions;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLogpushJobResult {
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
    private String dataset;
    /**
     * @return Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included.
     * 
     */
    private String destinationConf;
    /**
     * @return Flag that indicates if the job is enabled.
     * 
     */
    private Boolean enabled;
    /**
     * @return If not null, the job is currently failing. Failures are usually repetitive (example: no permissions to write to destination bucket). Only the last failure is recorded. On successful execution of a job the error*message and last*error are set to null.
     * 
     */
    private String errorMessage;
    /**
     * @return This field is deprecated. Please use `max_upload_*` parameters instead. The frequency at which Cloudflare sends batches of logs to your destination. Setting frequency to high sends your logs in larger quantities of smaller files. Setting frequency to low sends logs in smaller quantities of larger files.
     * Available values: &#34;high&#34;, &#34;low&#34;.
     * 
     * @deprecated
     * This attribute is deprecated.
     * 
     */
    @Deprecated /* This attribute is deprecated. */
    private String frequency;
    /**
     * @return Unique id of the job.
     * 
     */
    private Integer id;
    /**
     * @return Unique id of the job.
     * 
     */
    private @Nullable Integer jobId;
    /**
     * @return The kind parameter (optional) is used to differentiate between Logpush and Edge Log Delivery jobs. Currently, Edge Log Delivery is only supported for the `http_requests` dataset.
     * Available values: &#34;edge&#34;.
     * 
     */
    private String kind;
    /**
     * @return Records the last time for which logs have been successfully pushed. If the last successful push was for logs range 2018-07-23T10:00:00Z to 2018-07-23T10:01:00Z then the value of this field will be 2018-07-23T10:01:00Z. If the job has never run or has just been enabled and hasn&#39;t run yet then the field will be empty.
     * 
     */
    private String lastComplete;
    /**
     * @return Records the last time the job failed. If not null, the job is currently failing. If null, the job has either never failed or has run successfully at least once since last failure. See also the error_message field.
     * 
     */
    private String lastError;
    /**
     * @return This field is deprecated. Use `output_options` instead. Configuration string. It specifies things like requested fields and timestamp formats. If migrating from the logpull api, copy the url (full url or just the query string) of your call here, and logpush will keep on making this call for you, setting start and end times appropriately.
     * 
     * @deprecated
     * This attribute is deprecated.
     * 
     */
    @Deprecated /* This attribute is deprecated. */
    private String logpullOptions;
    /**
     * @return The maximum uncompressed file size of a batch of logs. This setting value must be between `5 MB` and `1 GB`, or `0` to disable it. Note that you cannot set a minimum file size; this means that log files may be much smaller than this batch size. This parameter is not available for jobs with `edge` as its kind.
     * 
     */
    private Integer maxUploadBytes;
    /**
     * @return The maximum interval in seconds for log batches. This setting must be between 30 and 300 seconds (5 minutes), or `0` to disable it. Note that you cannot specify a minimum interval for log batches; this means that log files may be sent in shorter intervals than this. This parameter is only used for jobs with `edge` as its kind.
     * 
     */
    private Integer maxUploadIntervalSeconds;
    /**
     * @return The maximum number of log lines per batch. This setting must be between 1000 and 1,000,000 lines, or `0` to disable it. Note that you cannot specify a minimum number of log lines per batch; this means that log files may contain many fewer lines than this. This parameter is not available for jobs with `edge` as its kind.
     * 
     */
    private Integer maxUploadRecords;
    /**
     * @return Optional human readable job name. Not unique. Cloudflare suggests that you set this to a meaningful string, like the domain name, to make it easier to identify your job.
     * 
     */
    private String name;
    /**
     * @return The structured replacement for `logpull_options`. When including this field, the `logpull_option` field will be ignored.
     * 
     */
    private GetLogpushJobOutputOptions outputOptions;
    /**
     * @return The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    private @Nullable String zoneId;

    private GetLogpushJobResult() {}
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
    public String dataset() {
        return this.dataset;
    }
    /**
     * @return Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included.
     * 
     */
    public String destinationConf() {
        return this.destinationConf;
    }
    /**
     * @return Flag that indicates if the job is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return If not null, the job is currently failing. Failures are usually repetitive (example: no permissions to write to destination bucket). Only the last failure is recorded. On successful execution of a job the error*message and last*error are set to null.
     * 
     */
    public String errorMessage() {
        return this.errorMessage;
    }
    /**
     * @return This field is deprecated. Please use `max_upload_*` parameters instead. The frequency at which Cloudflare sends batches of logs to your destination. Setting frequency to high sends your logs in larger quantities of smaller files. Setting frequency to low sends logs in smaller quantities of larger files.
     * Available values: &#34;high&#34;, &#34;low&#34;.
     * 
     * @deprecated
     * This attribute is deprecated.
     * 
     */
    @Deprecated /* This attribute is deprecated. */
    public String frequency() {
        return this.frequency;
    }
    /**
     * @return Unique id of the job.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return Unique id of the job.
     * 
     */
    public Optional<Integer> jobId() {
        return Optional.ofNullable(this.jobId);
    }
    /**
     * @return The kind parameter (optional) is used to differentiate between Logpush and Edge Log Delivery jobs. Currently, Edge Log Delivery is only supported for the `http_requests` dataset.
     * Available values: &#34;edge&#34;.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Records the last time for which logs have been successfully pushed. If the last successful push was for logs range 2018-07-23T10:00:00Z to 2018-07-23T10:01:00Z then the value of this field will be 2018-07-23T10:01:00Z. If the job has never run or has just been enabled and hasn&#39;t run yet then the field will be empty.
     * 
     */
    public String lastComplete() {
        return this.lastComplete;
    }
    /**
     * @return Records the last time the job failed. If not null, the job is currently failing. If null, the job has either never failed or has run successfully at least once since last failure. See also the error_message field.
     * 
     */
    public String lastError() {
        return this.lastError;
    }
    /**
     * @return This field is deprecated. Use `output_options` instead. Configuration string. It specifies things like requested fields and timestamp formats. If migrating from the logpull api, copy the url (full url or just the query string) of your call here, and logpush will keep on making this call for you, setting start and end times appropriately.
     * 
     * @deprecated
     * This attribute is deprecated.
     * 
     */
    @Deprecated /* This attribute is deprecated. */
    public String logpullOptions() {
        return this.logpullOptions;
    }
    /**
     * @return The maximum uncompressed file size of a batch of logs. This setting value must be between `5 MB` and `1 GB`, or `0` to disable it. Note that you cannot set a minimum file size; this means that log files may be much smaller than this batch size. This parameter is not available for jobs with `edge` as its kind.
     * 
     */
    public Integer maxUploadBytes() {
        return this.maxUploadBytes;
    }
    /**
     * @return The maximum interval in seconds for log batches. This setting must be between 30 and 300 seconds (5 minutes), or `0` to disable it. Note that you cannot specify a minimum interval for log batches; this means that log files may be sent in shorter intervals than this. This parameter is only used for jobs with `edge` as its kind.
     * 
     */
    public Integer maxUploadIntervalSeconds() {
        return this.maxUploadIntervalSeconds;
    }
    /**
     * @return The maximum number of log lines per batch. This setting must be between 1000 and 1,000,000 lines, or `0` to disable it. Note that you cannot specify a minimum number of log lines per batch; this means that log files may contain many fewer lines than this. This parameter is not available for jobs with `edge` as its kind.
     * 
     */
    public Integer maxUploadRecords() {
        return this.maxUploadRecords;
    }
    /**
     * @return Optional human readable job name. Not unique. Cloudflare suggests that you set this to a meaningful string, like the domain name, to make it easier to identify your job.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The structured replacement for `logpull_options`. When including this field, the `logpull_option` field will be ignored.
     * 
     */
    public GetLogpushJobOutputOptions outputOptions() {
        return this.outputOptions;
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

    public static Builder builder(GetLogpushJobResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accountId;
        private String dataset;
        private String destinationConf;
        private Boolean enabled;
        private String errorMessage;
        private String frequency;
        private Integer id;
        private @Nullable Integer jobId;
        private String kind;
        private String lastComplete;
        private String lastError;
        private String logpullOptions;
        private Integer maxUploadBytes;
        private Integer maxUploadIntervalSeconds;
        private Integer maxUploadRecords;
        private String name;
        private GetLogpushJobOutputOptions outputOptions;
        private @Nullable String zoneId;
        public Builder() {}
        public Builder(GetLogpushJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.dataset = defaults.dataset;
    	      this.destinationConf = defaults.destinationConf;
    	      this.enabled = defaults.enabled;
    	      this.errorMessage = defaults.errorMessage;
    	      this.frequency = defaults.frequency;
    	      this.id = defaults.id;
    	      this.jobId = defaults.jobId;
    	      this.kind = defaults.kind;
    	      this.lastComplete = defaults.lastComplete;
    	      this.lastError = defaults.lastError;
    	      this.logpullOptions = defaults.logpullOptions;
    	      this.maxUploadBytes = defaults.maxUploadBytes;
    	      this.maxUploadIntervalSeconds = defaults.maxUploadIntervalSeconds;
    	      this.maxUploadRecords = defaults.maxUploadRecords;
    	      this.name = defaults.name;
    	      this.outputOptions = defaults.outputOptions;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder accountId(@Nullable String accountId) {

            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder dataset(String dataset) {
            if (dataset == null) {
              throw new MissingRequiredPropertyException("GetLogpushJobResult", "dataset");
            }
            this.dataset = dataset;
            return this;
        }
        @CustomType.Setter
        public Builder destinationConf(String destinationConf) {
            if (destinationConf == null) {
              throw new MissingRequiredPropertyException("GetLogpushJobResult", "destinationConf");
            }
            this.destinationConf = destinationConf;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetLogpushJobResult", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder errorMessage(String errorMessage) {
            if (errorMessage == null) {
              throw new MissingRequiredPropertyException("GetLogpushJobResult", "errorMessage");
            }
            this.errorMessage = errorMessage;
            return this;
        }
        @CustomType.Setter
        public Builder frequency(String frequency) {
            if (frequency == null) {
              throw new MissingRequiredPropertyException("GetLogpushJobResult", "frequency");
            }
            this.frequency = frequency;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetLogpushJobResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder jobId(@Nullable Integer jobId) {

            this.jobId = jobId;
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            if (kind == null) {
              throw new MissingRequiredPropertyException("GetLogpushJobResult", "kind");
            }
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder lastComplete(String lastComplete) {
            if (lastComplete == null) {
              throw new MissingRequiredPropertyException("GetLogpushJobResult", "lastComplete");
            }
            this.lastComplete = lastComplete;
            return this;
        }
        @CustomType.Setter
        public Builder lastError(String lastError) {
            if (lastError == null) {
              throw new MissingRequiredPropertyException("GetLogpushJobResult", "lastError");
            }
            this.lastError = lastError;
            return this;
        }
        @CustomType.Setter
        public Builder logpullOptions(String logpullOptions) {
            if (logpullOptions == null) {
              throw new MissingRequiredPropertyException("GetLogpushJobResult", "logpullOptions");
            }
            this.logpullOptions = logpullOptions;
            return this;
        }
        @CustomType.Setter
        public Builder maxUploadBytes(Integer maxUploadBytes) {
            if (maxUploadBytes == null) {
              throw new MissingRequiredPropertyException("GetLogpushJobResult", "maxUploadBytes");
            }
            this.maxUploadBytes = maxUploadBytes;
            return this;
        }
        @CustomType.Setter
        public Builder maxUploadIntervalSeconds(Integer maxUploadIntervalSeconds) {
            if (maxUploadIntervalSeconds == null) {
              throw new MissingRequiredPropertyException("GetLogpushJobResult", "maxUploadIntervalSeconds");
            }
            this.maxUploadIntervalSeconds = maxUploadIntervalSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder maxUploadRecords(Integer maxUploadRecords) {
            if (maxUploadRecords == null) {
              throw new MissingRequiredPropertyException("GetLogpushJobResult", "maxUploadRecords");
            }
            this.maxUploadRecords = maxUploadRecords;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetLogpushJobResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder outputOptions(GetLogpushJobOutputOptions outputOptions) {
            if (outputOptions == null) {
              throw new MissingRequiredPropertyException("GetLogpushJobResult", "outputOptions");
            }
            this.outputOptions = outputOptions;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(@Nullable String zoneId) {

            this.zoneId = zoneId;
            return this;
        }
        public GetLogpushJobResult build() {
            final var _resultValue = new GetLogpushJobResult();
            _resultValue.accountId = accountId;
            _resultValue.dataset = dataset;
            _resultValue.destinationConf = destinationConf;
            _resultValue.enabled = enabled;
            _resultValue.errorMessage = errorMessage;
            _resultValue.frequency = frequency;
            _resultValue.id = id;
            _resultValue.jobId = jobId;
            _resultValue.kind = kind;
            _resultValue.lastComplete = lastComplete;
            _resultValue.lastError = lastError;
            _resultValue.logpullOptions = logpullOptions;
            _resultValue.maxUploadBytes = maxUploadBytes;
            _resultValue.maxUploadIntervalSeconds = maxUploadIntervalSeconds;
            _resultValue.maxUploadRecords = maxUploadRecords;
            _resultValue.name = name;
            _resultValue.outputOptions = outputOptions;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
