// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWafRulesFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetWafRulesFilter Empty = new GetWafRulesFilter();

    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="groupId")
    private @Nullable String groupId;

    public Optional<String> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    @Import(name="mode")
    private @Nullable String mode;

    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }

    private GetWafRulesFilter() {}

    private GetWafRulesFilter(GetWafRulesFilter $) {
        this.description = $.description;
        this.groupId = $.groupId;
        this.mode = $.mode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWafRulesFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWafRulesFilter $;

        public Builder() {
            $ = new GetWafRulesFilter();
        }

        public Builder(GetWafRulesFilter defaults) {
            $ = new GetWafRulesFilter(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder groupId(@Nullable String groupId) {
            $.groupId = groupId;
            return this;
        }

        public Builder mode(@Nullable String mode) {
            $.mode = mode;
            return this;
        }

        public GetWafRulesFilter build() {
            return $;
        }
    }

}