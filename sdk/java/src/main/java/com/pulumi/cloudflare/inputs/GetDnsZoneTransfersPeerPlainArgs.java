// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDnsZoneTransfersPeerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDnsZoneTransfersPeerPlainArgs Empty = new GetDnsZoneTransfersPeerPlainArgs();

    @Import(name="accountId", required=true)
    private String accountId;

    public String accountId() {
        return this.accountId;
    }

    @Import(name="peerId")
    private @Nullable String peerId;

    public Optional<String> peerId() {
        return Optional.ofNullable(this.peerId);
    }

    private GetDnsZoneTransfersPeerPlainArgs() {}

    private GetDnsZoneTransfersPeerPlainArgs(GetDnsZoneTransfersPeerPlainArgs $) {
        this.accountId = $.accountId;
        this.peerId = $.peerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDnsZoneTransfersPeerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDnsZoneTransfersPeerPlainArgs $;

        public Builder() {
            $ = new GetDnsZoneTransfersPeerPlainArgs();
        }

        public Builder(GetDnsZoneTransfersPeerPlainArgs defaults) {
            $ = new GetDnsZoneTransfersPeerPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder peerId(@Nullable String peerId) {
            $.peerId = peerId;
            return this;
        }

        public GetDnsZoneTransfersPeerPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetDnsZoneTransfersPeerPlainArgs", "accountId");
            }
            return $;
        }
    }

}
