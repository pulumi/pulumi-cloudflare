// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileContextAwarenessArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileEntryArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileSharedEntryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustDlpCustomProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustDlpCustomProfileArgs Empty = new ZeroTrustDlpCustomProfileArgs();

    @Import(name="accountId", required=true)
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }

    @Import(name="aiContextEnabled")
    private @Nullable Output<Boolean> aiContextEnabled;

    public Optional<Output<Boolean>> aiContextEnabled() {
        return Optional.ofNullable(this.aiContextEnabled);
    }

    /**
     * Related DLP policies will trigger when the match count exceeds the number set.
     * 
     */
    @Import(name="allowedMatchCount")
    private @Nullable Output<Integer> allowedMatchCount;

    /**
     * @return Related DLP policies will trigger when the match count exceeds the number set.
     * 
     */
    public Optional<Output<Integer>> allowedMatchCount() {
        return Optional.ofNullable(this.allowedMatchCount);
    }

    @Import(name="confidenceThreshold")
    private @Nullable Output<String> confidenceThreshold;

    public Optional<Output<String>> confidenceThreshold() {
        return Optional.ofNullable(this.confidenceThreshold);
    }

    /**
     * Scan the context of predefined entries to only return matches surrounded by keywords.
     * 
     */
    @Import(name="contextAwareness")
    private @Nullable Output<ZeroTrustDlpCustomProfileContextAwarenessArgs> contextAwareness;

    /**
     * @return Scan the context of predefined entries to only return matches surrounded by keywords.
     * 
     */
    public Optional<Output<ZeroTrustDlpCustomProfileContextAwarenessArgs>> contextAwareness() {
        return Optional.ofNullable(this.contextAwareness);
    }

    /**
     * The description of the profile.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the profile.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="entries", required=true)
    private Output<List<ZeroTrustDlpCustomProfileEntryArgs>> entries;

    public Output<List<ZeroTrustDlpCustomProfileEntryArgs>> entries() {
        return this.entries;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="ocrEnabled")
    private @Nullable Output<Boolean> ocrEnabled;

    public Optional<Output<Boolean>> ocrEnabled() {
        return Optional.ofNullable(this.ocrEnabled);
    }

    /**
     * Entries from other profiles (e.g. pre-defined Cloudflare profiles, or your Microsoft Information Protection profiles).
     * 
     */
    @Import(name="sharedEntries")
    private @Nullable Output<List<ZeroTrustDlpCustomProfileSharedEntryArgs>> sharedEntries;

    /**
     * @return Entries from other profiles (e.g. pre-defined Cloudflare profiles, or your Microsoft Information Protection profiles).
     * 
     */
    public Optional<Output<List<ZeroTrustDlpCustomProfileSharedEntryArgs>>> sharedEntries() {
        return Optional.ofNullable(this.sharedEntries);
    }

    private ZeroTrustDlpCustomProfileArgs() {}

    private ZeroTrustDlpCustomProfileArgs(ZeroTrustDlpCustomProfileArgs $) {
        this.accountId = $.accountId;
        this.aiContextEnabled = $.aiContextEnabled;
        this.allowedMatchCount = $.allowedMatchCount;
        this.confidenceThreshold = $.confidenceThreshold;
        this.contextAwareness = $.contextAwareness;
        this.description = $.description;
        this.entries = $.entries;
        this.name = $.name;
        this.ocrEnabled = $.ocrEnabled;
        this.sharedEntries = $.sharedEntries;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustDlpCustomProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustDlpCustomProfileArgs $;

        public Builder() {
            $ = new ZeroTrustDlpCustomProfileArgs();
        }

        public Builder(ZeroTrustDlpCustomProfileArgs defaults) {
            $ = new ZeroTrustDlpCustomProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder aiContextEnabled(@Nullable Output<Boolean> aiContextEnabled) {
            $.aiContextEnabled = aiContextEnabled;
            return this;
        }

        public Builder aiContextEnabled(Boolean aiContextEnabled) {
            return aiContextEnabled(Output.of(aiContextEnabled));
        }

        /**
         * @param allowedMatchCount Related DLP policies will trigger when the match count exceeds the number set.
         * 
         * @return builder
         * 
         */
        public Builder allowedMatchCount(@Nullable Output<Integer> allowedMatchCount) {
            $.allowedMatchCount = allowedMatchCount;
            return this;
        }

        /**
         * @param allowedMatchCount Related DLP policies will trigger when the match count exceeds the number set.
         * 
         * @return builder
         * 
         */
        public Builder allowedMatchCount(Integer allowedMatchCount) {
            return allowedMatchCount(Output.of(allowedMatchCount));
        }

        public Builder confidenceThreshold(@Nullable Output<String> confidenceThreshold) {
            $.confidenceThreshold = confidenceThreshold;
            return this;
        }

        public Builder confidenceThreshold(String confidenceThreshold) {
            return confidenceThreshold(Output.of(confidenceThreshold));
        }

        /**
         * @param contextAwareness Scan the context of predefined entries to only return matches surrounded by keywords.
         * 
         * @return builder
         * 
         */
        public Builder contextAwareness(@Nullable Output<ZeroTrustDlpCustomProfileContextAwarenessArgs> contextAwareness) {
            $.contextAwareness = contextAwareness;
            return this;
        }

        /**
         * @param contextAwareness Scan the context of predefined entries to only return matches surrounded by keywords.
         * 
         * @return builder
         * 
         */
        public Builder contextAwareness(ZeroTrustDlpCustomProfileContextAwarenessArgs contextAwareness) {
            return contextAwareness(Output.of(contextAwareness));
        }

        /**
         * @param description The description of the profile.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the profile.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder entries(Output<List<ZeroTrustDlpCustomProfileEntryArgs>> entries) {
            $.entries = entries;
            return this;
        }

        public Builder entries(List<ZeroTrustDlpCustomProfileEntryArgs> entries) {
            return entries(Output.of(entries));
        }

        public Builder entries(ZeroTrustDlpCustomProfileEntryArgs... entries) {
            return entries(List.of(entries));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder ocrEnabled(@Nullable Output<Boolean> ocrEnabled) {
            $.ocrEnabled = ocrEnabled;
            return this;
        }

        public Builder ocrEnabled(Boolean ocrEnabled) {
            return ocrEnabled(Output.of(ocrEnabled));
        }

        /**
         * @param sharedEntries Entries from other profiles (e.g. pre-defined Cloudflare profiles, or your Microsoft Information Protection profiles).
         * 
         * @return builder
         * 
         */
        public Builder sharedEntries(@Nullable Output<List<ZeroTrustDlpCustomProfileSharedEntryArgs>> sharedEntries) {
            $.sharedEntries = sharedEntries;
            return this;
        }

        /**
         * @param sharedEntries Entries from other profiles (e.g. pre-defined Cloudflare profiles, or your Microsoft Information Protection profiles).
         * 
         * @return builder
         * 
         */
        public Builder sharedEntries(List<ZeroTrustDlpCustomProfileSharedEntryArgs> sharedEntries) {
            return sharedEntries(Output.of(sharedEntries));
        }

        /**
         * @param sharedEntries Entries from other profiles (e.g. pre-defined Cloudflare profiles, or your Microsoft Information Protection profiles).
         * 
         * @return builder
         * 
         */
        public Builder sharedEntries(ZeroTrustDlpCustomProfileSharedEntryArgs... sharedEntries) {
            return sharedEntries(List.of(sharedEntries));
        }

        public ZeroTrustDlpCustomProfileArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDlpCustomProfileArgs", "accountId");
            }
            if ($.entries == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDlpCustomProfileArgs", "entries");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDlpCustomProfileArgs", "name");
            }
            return $;
        }
    }

}
