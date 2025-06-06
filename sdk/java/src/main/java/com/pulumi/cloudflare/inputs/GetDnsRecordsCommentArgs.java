// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDnsRecordsCommentArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetDnsRecordsCommentArgs Empty = new GetDnsRecordsCommentArgs();

    /**
     * If this parameter is present, only records *without* a comment are returned.
     * 
     */
    @Import(name="absent")
    private @Nullable Output<String> absent;

    /**
     * @return If this parameter is present, only records *without* a comment are returned.
     * 
     */
    public Optional<Output<String>> absent() {
        return Optional.ofNullable(this.absent);
    }

    /**
     * Substring of the DNS record comment. Comment filters are case-insensitive.
     * 
     */
    @Import(name="contains")
    private @Nullable Output<String> contains;

    /**
     * @return Substring of the DNS record comment. Comment filters are case-insensitive.
     * 
     */
    public Optional<Output<String>> contains() {
        return Optional.ofNullable(this.contains);
    }

    /**
     * Suffix of the DNS record comment. Comment filters are case-insensitive.
     * 
     */
    @Import(name="endswith")
    private @Nullable Output<String> endswith;

    /**
     * @return Suffix of the DNS record comment. Comment filters are case-insensitive.
     * 
     */
    public Optional<Output<String>> endswith() {
        return Optional.ofNullable(this.endswith);
    }

    /**
     * Exact value of the DNS record comment. Comment filters are case-insensitive.
     * 
     */
    @Import(name="exact")
    private @Nullable Output<String> exact;

    /**
     * @return Exact value of the DNS record comment. Comment filters are case-insensitive.
     * 
     */
    public Optional<Output<String>> exact() {
        return Optional.ofNullable(this.exact);
    }

    /**
     * If this parameter is present, only records *with* a comment are returned.
     * 
     */
    @Import(name="present")
    private @Nullable Output<String> present;

    /**
     * @return If this parameter is present, only records *with* a comment are returned.
     * 
     */
    public Optional<Output<String>> present() {
        return Optional.ofNullable(this.present);
    }

    /**
     * Prefix of the DNS record comment. Comment filters are case-insensitive.
     * 
     */
    @Import(name="startswith")
    private @Nullable Output<String> startswith;

    /**
     * @return Prefix of the DNS record comment. Comment filters are case-insensitive.
     * 
     */
    public Optional<Output<String>> startswith() {
        return Optional.ofNullable(this.startswith);
    }

    private GetDnsRecordsCommentArgs() {}

    private GetDnsRecordsCommentArgs(GetDnsRecordsCommentArgs $) {
        this.absent = $.absent;
        this.contains = $.contains;
        this.endswith = $.endswith;
        this.exact = $.exact;
        this.present = $.present;
        this.startswith = $.startswith;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDnsRecordsCommentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDnsRecordsCommentArgs $;

        public Builder() {
            $ = new GetDnsRecordsCommentArgs();
        }

        public Builder(GetDnsRecordsCommentArgs defaults) {
            $ = new GetDnsRecordsCommentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param absent If this parameter is present, only records *without* a comment are returned.
         * 
         * @return builder
         * 
         */
        public Builder absent(@Nullable Output<String> absent) {
            $.absent = absent;
            return this;
        }

        /**
         * @param absent If this parameter is present, only records *without* a comment are returned.
         * 
         * @return builder
         * 
         */
        public Builder absent(String absent) {
            return absent(Output.of(absent));
        }

        /**
         * @param contains Substring of the DNS record comment. Comment filters are case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder contains(@Nullable Output<String> contains) {
            $.contains = contains;
            return this;
        }

        /**
         * @param contains Substring of the DNS record comment. Comment filters are case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder contains(String contains) {
            return contains(Output.of(contains));
        }

        /**
         * @param endswith Suffix of the DNS record comment. Comment filters are case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder endswith(@Nullable Output<String> endswith) {
            $.endswith = endswith;
            return this;
        }

        /**
         * @param endswith Suffix of the DNS record comment. Comment filters are case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder endswith(String endswith) {
            return endswith(Output.of(endswith));
        }

        /**
         * @param exact Exact value of the DNS record comment. Comment filters are case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder exact(@Nullable Output<String> exact) {
            $.exact = exact;
            return this;
        }

        /**
         * @param exact Exact value of the DNS record comment. Comment filters are case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder exact(String exact) {
            return exact(Output.of(exact));
        }

        /**
         * @param present If this parameter is present, only records *with* a comment are returned.
         * 
         * @return builder
         * 
         */
        public Builder present(@Nullable Output<String> present) {
            $.present = present;
            return this;
        }

        /**
         * @param present If this parameter is present, only records *with* a comment are returned.
         * 
         * @return builder
         * 
         */
        public Builder present(String present) {
            return present(Output.of(present));
        }

        /**
         * @param startswith Prefix of the DNS record comment. Comment filters are case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder startswith(@Nullable Output<String> startswith) {
            $.startswith = startswith;
            return this;
        }

        /**
         * @param startswith Prefix of the DNS record comment. Comment filters are case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder startswith(String startswith) {
            return startswith(Output.of(startswith));
        }

        public GetDnsRecordsCommentArgs build() {
            return $;
        }
    }

}
