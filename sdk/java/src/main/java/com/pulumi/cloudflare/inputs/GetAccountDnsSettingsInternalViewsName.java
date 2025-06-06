// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountDnsSettingsInternalViewsName extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountDnsSettingsInternalViewsName Empty = new GetAccountDnsSettingsInternalViewsName();

    /**
     * Substring of the DNS view name.
     * 
     */
    @Import(name="contains")
    private @Nullable String contains;

    /**
     * @return Substring of the DNS view name.
     * 
     */
    public Optional<String> contains() {
        return Optional.ofNullable(this.contains);
    }

    /**
     * Suffix of the DNS view name.
     * 
     */
    @Import(name="endswith")
    private @Nullable String endswith;

    /**
     * @return Suffix of the DNS view name.
     * 
     */
    public Optional<String> endswith() {
        return Optional.ofNullable(this.endswith);
    }

    /**
     * Exact value of the DNS view name.
     * 
     */
    @Import(name="exact")
    private @Nullable String exact;

    /**
     * @return Exact value of the DNS view name.
     * 
     */
    public Optional<String> exact() {
        return Optional.ofNullable(this.exact);
    }

    /**
     * Prefix of the DNS view name.
     * 
     */
    @Import(name="startswith")
    private @Nullable String startswith;

    /**
     * @return Prefix of the DNS view name.
     * 
     */
    public Optional<String> startswith() {
        return Optional.ofNullable(this.startswith);
    }

    private GetAccountDnsSettingsInternalViewsName() {}

    private GetAccountDnsSettingsInternalViewsName(GetAccountDnsSettingsInternalViewsName $) {
        this.contains = $.contains;
        this.endswith = $.endswith;
        this.exact = $.exact;
        this.startswith = $.startswith;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountDnsSettingsInternalViewsName defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountDnsSettingsInternalViewsName $;

        public Builder() {
            $ = new GetAccountDnsSettingsInternalViewsName();
        }

        public Builder(GetAccountDnsSettingsInternalViewsName defaults) {
            $ = new GetAccountDnsSettingsInternalViewsName(Objects.requireNonNull(defaults));
        }

        /**
         * @param contains Substring of the DNS view name.
         * 
         * @return builder
         * 
         */
        public Builder contains(@Nullable String contains) {
            $.contains = contains;
            return this;
        }

        /**
         * @param endswith Suffix of the DNS view name.
         * 
         * @return builder
         * 
         */
        public Builder endswith(@Nullable String endswith) {
            $.endswith = endswith;
            return this;
        }

        /**
         * @param exact Exact value of the DNS view name.
         * 
         * @return builder
         * 
         */
        public Builder exact(@Nullable String exact) {
            $.exact = exact;
            return this;
        }

        /**
         * @param startswith Prefix of the DNS view name.
         * 
         * @return builder
         * 
         */
        public Builder startswith(@Nullable String startswith) {
            $.startswith = startswith;
            return this;
        }

        public GetAccountDnsSettingsInternalViewsName build() {
            return $;
        }
    }

}
