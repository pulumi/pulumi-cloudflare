// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDnsZoneTransfersTsigPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDnsZoneTransfersTsigPlainArgs Empty = new GetDnsZoneTransfersTsigPlainArgs();

    @Import(name="accountId", required=true)
    private String accountId;

    public String accountId() {
        return this.accountId;
    }

    @Import(name="tsigId")
    private @Nullable String tsigId;

    public Optional<String> tsigId() {
        return Optional.ofNullable(this.tsigId);
    }

    private GetDnsZoneTransfersTsigPlainArgs() {}

    private GetDnsZoneTransfersTsigPlainArgs(GetDnsZoneTransfersTsigPlainArgs $) {
        this.accountId = $.accountId;
        this.tsigId = $.tsigId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDnsZoneTransfersTsigPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDnsZoneTransfersTsigPlainArgs $;

        public Builder() {
            $ = new GetDnsZoneTransfersTsigPlainArgs();
        }

        public Builder(GetDnsZoneTransfersTsigPlainArgs defaults) {
            $ = new GetDnsZoneTransfersTsigPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder tsigId(@Nullable String tsigId) {
            $.tsigId = tsigId;
            return this;
        }

        public GetDnsZoneTransfersTsigPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetDnsZoneTransfersTsigPlainArgs", "accountId");
            }
            return $;
        }
    }

}
