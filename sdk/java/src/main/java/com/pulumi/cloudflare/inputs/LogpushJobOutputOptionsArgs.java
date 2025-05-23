// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogpushJobOutputOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogpushJobOutputOptionsArgs Empty = new LogpushJobOutputOptionsArgs();

    /**
     * String to be prepended before each batch.
     * 
     */
    @Import(name="batchPrefix")
    private @Nullable Output<String> batchPrefix;

    /**
     * @return String to be prepended before each batch.
     * 
     */
    public Optional<Output<String>> batchPrefix() {
        return Optional.ofNullable(this.batchPrefix);
    }

    /**
     * String to be appended after each batch.
     * 
     */
    @Import(name="batchSuffix")
    private @Nullable Output<String> batchSuffix;

    /**
     * @return String to be appended after each batch.
     * 
     */
    public Optional<Output<String>> batchSuffix() {
        return Optional.ofNullable(this.batchSuffix);
    }

    /**
     * If set to true, will cause all occurrences of `${` in the generated files to be replaced with `x{`.
     * 
     */
    @Import(name="cve202144228")
    private @Nullable Output<Boolean> cve202144228;

    /**
     * @return If set to true, will cause all occurrences of `${` in the generated files to be replaced with `x{`.
     * 
     */
    public Optional<Output<Boolean>> cve202144228() {
        return Optional.ofNullable(this.cve202144228);
    }

    /**
     * String to join fields. This field be ignored when `record_template` is set.
     * 
     */
    @Import(name="fieldDelimiter")
    private @Nullable Output<String> fieldDelimiter;

    /**
     * @return String to join fields. This field be ignored when `record_template` is set.
     * 
     */
    public Optional<Output<String>> fieldDelimiter() {
        return Optional.ofNullable(this.fieldDelimiter);
    }

    /**
     * List of field names to be included in the Logpush output. For the moment, there is no option to add all fields at once, so you must specify all the fields names you are interested in.
     * 
     */
    @Import(name="fieldNames")
    private @Nullable Output<List<String>> fieldNames;

    /**
     * @return List of field names to be included in the Logpush output. For the moment, there is no option to add all fields at once, so you must specify all the fields names you are interested in.
     * 
     */
    public Optional<Output<List<String>>> fieldNames() {
        return Optional.ofNullable(this.fieldNames);
    }

    /**
     * Specifies the output type, such as `ndjson` or `csv`. This sets default values for the rest of the settings, depending on the chosen output type. Some formatting rules, like string quoting, are different between output types.
     * Available values: &#34;ndjson&#34;, &#34;csv&#34;.
     * 
     */
    @Import(name="outputType")
    private @Nullable Output<String> outputType;

    /**
     * @return Specifies the output type, such as `ndjson` or `csv`. This sets default values for the rest of the settings, depending on the chosen output type. Some formatting rules, like string quoting, are different between output types.
     * Available values: &#34;ndjson&#34;, &#34;csv&#34;.
     * 
     */
    public Optional<Output<String>> outputType() {
        return Optional.ofNullable(this.outputType);
    }

    /**
     * String to be inserted in-between the records as separator.
     * 
     */
    @Import(name="recordDelimiter")
    private @Nullable Output<String> recordDelimiter;

    /**
     * @return String to be inserted in-between the records as separator.
     * 
     */
    public Optional<Output<String>> recordDelimiter() {
        return Optional.ofNullable(this.recordDelimiter);
    }

    /**
     * String to be prepended before each record.
     * 
     */
    @Import(name="recordPrefix")
    private @Nullable Output<String> recordPrefix;

    /**
     * @return String to be prepended before each record.
     * 
     */
    public Optional<Output<String>> recordPrefix() {
        return Optional.ofNullable(this.recordPrefix);
    }

    /**
     * String to be appended after each record.
     * 
     */
    @Import(name="recordSuffix")
    private @Nullable Output<String> recordSuffix;

    /**
     * @return String to be appended after each record.
     * 
     */
    public Optional<Output<String>> recordSuffix() {
        return Optional.ofNullable(this.recordSuffix);
    }

    /**
     * String to use as template for each record instead of the default json key value mapping. All fields used in the template must be present in `field_names` as well, otherwise they will end up as null. Format as a Go `text/template` without any standard functions, like conditionals, loops, sub-templates, etc.
     * 
     */
    @Import(name="recordTemplate")
    private @Nullable Output<String> recordTemplate;

    /**
     * @return String to use as template for each record instead of the default json key value mapping. All fields used in the template must be present in `field_names` as well, otherwise they will end up as null. Format as a Go `text/template` without any standard functions, like conditionals, loops, sub-templates, etc.
     * 
     */
    public Optional<Output<String>> recordTemplate() {
        return Optional.ofNullable(this.recordTemplate);
    }

    /**
     * Floating number to specify sampling rate. Sampling is applied on top of filtering, and regardless of the current `sample_interval` of the data.
     * 
     */
    @Import(name="sampleRate")
    private @Nullable Output<Double> sampleRate;

    /**
     * @return Floating number to specify sampling rate. Sampling is applied on top of filtering, and regardless of the current `sample_interval` of the data.
     * 
     */
    public Optional<Output<Double>> sampleRate() {
        return Optional.ofNullable(this.sampleRate);
    }

    /**
     * String to specify the format for timestamps, such as `unixnano`, `unix`, or `rfc3339`.
     * Available values: &#34;unixnano&#34;, &#34;unix&#34;, &#34;rfc3339&#34;.
     * 
     */
    @Import(name="timestampFormat")
    private @Nullable Output<String> timestampFormat;

    /**
     * @return String to specify the format for timestamps, such as `unixnano`, `unix`, or `rfc3339`.
     * Available values: &#34;unixnano&#34;, &#34;unix&#34;, &#34;rfc3339&#34;.
     * 
     */
    public Optional<Output<String>> timestampFormat() {
        return Optional.ofNullable(this.timestampFormat);
    }

    private LogpushJobOutputOptionsArgs() {}

    private LogpushJobOutputOptionsArgs(LogpushJobOutputOptionsArgs $) {
        this.batchPrefix = $.batchPrefix;
        this.batchSuffix = $.batchSuffix;
        this.cve202144228 = $.cve202144228;
        this.fieldDelimiter = $.fieldDelimiter;
        this.fieldNames = $.fieldNames;
        this.outputType = $.outputType;
        this.recordDelimiter = $.recordDelimiter;
        this.recordPrefix = $.recordPrefix;
        this.recordSuffix = $.recordSuffix;
        this.recordTemplate = $.recordTemplate;
        this.sampleRate = $.sampleRate;
        this.timestampFormat = $.timestampFormat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogpushJobOutputOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogpushJobOutputOptionsArgs $;

        public Builder() {
            $ = new LogpushJobOutputOptionsArgs();
        }

        public Builder(LogpushJobOutputOptionsArgs defaults) {
            $ = new LogpushJobOutputOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param batchPrefix String to be prepended before each batch.
         * 
         * @return builder
         * 
         */
        public Builder batchPrefix(@Nullable Output<String> batchPrefix) {
            $.batchPrefix = batchPrefix;
            return this;
        }

        /**
         * @param batchPrefix String to be prepended before each batch.
         * 
         * @return builder
         * 
         */
        public Builder batchPrefix(String batchPrefix) {
            return batchPrefix(Output.of(batchPrefix));
        }

        /**
         * @param batchSuffix String to be appended after each batch.
         * 
         * @return builder
         * 
         */
        public Builder batchSuffix(@Nullable Output<String> batchSuffix) {
            $.batchSuffix = batchSuffix;
            return this;
        }

        /**
         * @param batchSuffix String to be appended after each batch.
         * 
         * @return builder
         * 
         */
        public Builder batchSuffix(String batchSuffix) {
            return batchSuffix(Output.of(batchSuffix));
        }

        /**
         * @param cve202144228 If set to true, will cause all occurrences of `${` in the generated files to be replaced with `x{`.
         * 
         * @return builder
         * 
         */
        public Builder cve202144228(@Nullable Output<Boolean> cve202144228) {
            $.cve202144228 = cve202144228;
            return this;
        }

        /**
         * @param cve202144228 If set to true, will cause all occurrences of `${` in the generated files to be replaced with `x{`.
         * 
         * @return builder
         * 
         */
        public Builder cve202144228(Boolean cve202144228) {
            return cve202144228(Output.of(cve202144228));
        }

        /**
         * @param fieldDelimiter String to join fields. This field be ignored when `record_template` is set.
         * 
         * @return builder
         * 
         */
        public Builder fieldDelimiter(@Nullable Output<String> fieldDelimiter) {
            $.fieldDelimiter = fieldDelimiter;
            return this;
        }

        /**
         * @param fieldDelimiter String to join fields. This field be ignored when `record_template` is set.
         * 
         * @return builder
         * 
         */
        public Builder fieldDelimiter(String fieldDelimiter) {
            return fieldDelimiter(Output.of(fieldDelimiter));
        }

        /**
         * @param fieldNames List of field names to be included in the Logpush output. For the moment, there is no option to add all fields at once, so you must specify all the fields names you are interested in.
         * 
         * @return builder
         * 
         */
        public Builder fieldNames(@Nullable Output<List<String>> fieldNames) {
            $.fieldNames = fieldNames;
            return this;
        }

        /**
         * @param fieldNames List of field names to be included in the Logpush output. For the moment, there is no option to add all fields at once, so you must specify all the fields names you are interested in.
         * 
         * @return builder
         * 
         */
        public Builder fieldNames(List<String> fieldNames) {
            return fieldNames(Output.of(fieldNames));
        }

        /**
         * @param fieldNames List of field names to be included in the Logpush output. For the moment, there is no option to add all fields at once, so you must specify all the fields names you are interested in.
         * 
         * @return builder
         * 
         */
        public Builder fieldNames(String... fieldNames) {
            return fieldNames(List.of(fieldNames));
        }

        /**
         * @param outputType Specifies the output type, such as `ndjson` or `csv`. This sets default values for the rest of the settings, depending on the chosen output type. Some formatting rules, like string quoting, are different between output types.
         * Available values: &#34;ndjson&#34;, &#34;csv&#34;.
         * 
         * @return builder
         * 
         */
        public Builder outputType(@Nullable Output<String> outputType) {
            $.outputType = outputType;
            return this;
        }

        /**
         * @param outputType Specifies the output type, such as `ndjson` or `csv`. This sets default values for the rest of the settings, depending on the chosen output type. Some formatting rules, like string quoting, are different between output types.
         * Available values: &#34;ndjson&#34;, &#34;csv&#34;.
         * 
         * @return builder
         * 
         */
        public Builder outputType(String outputType) {
            return outputType(Output.of(outputType));
        }

        /**
         * @param recordDelimiter String to be inserted in-between the records as separator.
         * 
         * @return builder
         * 
         */
        public Builder recordDelimiter(@Nullable Output<String> recordDelimiter) {
            $.recordDelimiter = recordDelimiter;
            return this;
        }

        /**
         * @param recordDelimiter String to be inserted in-between the records as separator.
         * 
         * @return builder
         * 
         */
        public Builder recordDelimiter(String recordDelimiter) {
            return recordDelimiter(Output.of(recordDelimiter));
        }

        /**
         * @param recordPrefix String to be prepended before each record.
         * 
         * @return builder
         * 
         */
        public Builder recordPrefix(@Nullable Output<String> recordPrefix) {
            $.recordPrefix = recordPrefix;
            return this;
        }

        /**
         * @param recordPrefix String to be prepended before each record.
         * 
         * @return builder
         * 
         */
        public Builder recordPrefix(String recordPrefix) {
            return recordPrefix(Output.of(recordPrefix));
        }

        /**
         * @param recordSuffix String to be appended after each record.
         * 
         * @return builder
         * 
         */
        public Builder recordSuffix(@Nullable Output<String> recordSuffix) {
            $.recordSuffix = recordSuffix;
            return this;
        }

        /**
         * @param recordSuffix String to be appended after each record.
         * 
         * @return builder
         * 
         */
        public Builder recordSuffix(String recordSuffix) {
            return recordSuffix(Output.of(recordSuffix));
        }

        /**
         * @param recordTemplate String to use as template for each record instead of the default json key value mapping. All fields used in the template must be present in `field_names` as well, otherwise they will end up as null. Format as a Go `text/template` without any standard functions, like conditionals, loops, sub-templates, etc.
         * 
         * @return builder
         * 
         */
        public Builder recordTemplate(@Nullable Output<String> recordTemplate) {
            $.recordTemplate = recordTemplate;
            return this;
        }

        /**
         * @param recordTemplate String to use as template for each record instead of the default json key value mapping. All fields used in the template must be present in `field_names` as well, otherwise they will end up as null. Format as a Go `text/template` without any standard functions, like conditionals, loops, sub-templates, etc.
         * 
         * @return builder
         * 
         */
        public Builder recordTemplate(String recordTemplate) {
            return recordTemplate(Output.of(recordTemplate));
        }

        /**
         * @param sampleRate Floating number to specify sampling rate. Sampling is applied on top of filtering, and regardless of the current `sample_interval` of the data.
         * 
         * @return builder
         * 
         */
        public Builder sampleRate(@Nullable Output<Double> sampleRate) {
            $.sampleRate = sampleRate;
            return this;
        }

        /**
         * @param sampleRate Floating number to specify sampling rate. Sampling is applied on top of filtering, and regardless of the current `sample_interval` of the data.
         * 
         * @return builder
         * 
         */
        public Builder sampleRate(Double sampleRate) {
            return sampleRate(Output.of(sampleRate));
        }

        /**
         * @param timestampFormat String to specify the format for timestamps, such as `unixnano`, `unix`, or `rfc3339`.
         * Available values: &#34;unixnano&#34;, &#34;unix&#34;, &#34;rfc3339&#34;.
         * 
         * @return builder
         * 
         */
        public Builder timestampFormat(@Nullable Output<String> timestampFormat) {
            $.timestampFormat = timestampFormat;
            return this;
        }

        /**
         * @param timestampFormat String to specify the format for timestamps, such as `unixnano`, `unix`, or `rfc3339`.
         * Available values: &#34;unixnano&#34;, &#34;unix&#34;, &#34;rfc3339&#34;.
         * 
         * @return builder
         * 
         */
        public Builder timestampFormat(String timestampFormat) {
            return timestampFormat(Output.of(timestampFormat));
        }

        public LogpushJobOutputOptionsArgs build() {
            return $;
        }
    }

}
