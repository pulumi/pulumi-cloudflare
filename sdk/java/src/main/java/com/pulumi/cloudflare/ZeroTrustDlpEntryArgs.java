// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.ZeroTrustDlpEntryPatternArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustDlpEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustDlpEntryArgs Empty = new ZeroTrustDlpEntryArgs();

    @Import(name="accountId", required=true)
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="pattern", required=true)
    private Output<ZeroTrustDlpEntryPatternArgs> pattern;

    public Output<ZeroTrustDlpEntryPatternArgs> pattern() {
        return this.pattern;
    }

    @Import(name="profileId", required=true)
    private Output<String> profileId;

    public Output<String> profileId() {
        return this.profileId;
    }

    /**
     * Available values: &#34;custom&#34;, &#34;predefined&#34;, &#34;integration&#34;.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Available values: &#34;custom&#34;, &#34;predefined&#34;, &#34;integration&#34;.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ZeroTrustDlpEntryArgs() {}

    private ZeroTrustDlpEntryArgs(ZeroTrustDlpEntryArgs $) {
        this.accountId = $.accountId;
        this.enabled = $.enabled;
        this.name = $.name;
        this.pattern = $.pattern;
        this.profileId = $.profileId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustDlpEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustDlpEntryArgs $;

        public Builder() {
            $ = new ZeroTrustDlpEntryArgs();
        }

        public Builder(ZeroTrustDlpEntryArgs defaults) {
            $ = new ZeroTrustDlpEntryArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder pattern(Output<ZeroTrustDlpEntryPatternArgs> pattern) {
            $.pattern = pattern;
            return this;
        }

        public Builder pattern(ZeroTrustDlpEntryPatternArgs pattern) {
            return pattern(Output.of(pattern));
        }

        public Builder profileId(Output<String> profileId) {
            $.profileId = profileId;
            return this;
        }

        public Builder profileId(String profileId) {
            return profileId(Output.of(profileId));
        }

        /**
         * @param type Available values: &#34;custom&#34;, &#34;predefined&#34;, &#34;integration&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Available values: &#34;custom&#34;, &#34;predefined&#34;, &#34;integration&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ZeroTrustDlpEntryArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDlpEntryArgs", "accountId");
            }
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDlpEntryArgs", "enabled");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDlpEntryArgs", "name");
            }
            if ($.pattern == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDlpEntryArgs", "pattern");
            }
            if ($.profileId == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDlpEntryArgs", "profileId");
            }
            return $;
        }
    }

}
