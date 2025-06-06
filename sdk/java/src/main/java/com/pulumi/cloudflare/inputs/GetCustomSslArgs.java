// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.GetCustomSslFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCustomSslArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCustomSslArgs Empty = new GetCustomSslArgs();

    /**
     * Identifier.
     * 
     */
    @Import(name="customCertificateId")
    private @Nullable Output<String> customCertificateId;

    /**
     * @return Identifier.
     * 
     */
    public Optional<Output<String>> customCertificateId() {
        return Optional.ofNullable(this.customCertificateId);
    }

    @Import(name="filter")
    private @Nullable Output<GetCustomSslFilterArgs> filter;

    public Optional<Output<GetCustomSslFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Identifier.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return Identifier.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private GetCustomSslArgs() {}

    private GetCustomSslArgs(GetCustomSslArgs $) {
        this.customCertificateId = $.customCertificateId;
        this.filter = $.filter;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCustomSslArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCustomSslArgs $;

        public Builder() {
            $ = new GetCustomSslArgs();
        }

        public Builder(GetCustomSslArgs defaults) {
            $ = new GetCustomSslArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customCertificateId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder customCertificateId(@Nullable Output<String> customCertificateId) {
            $.customCertificateId = customCertificateId;
            return this;
        }

        /**
         * @param customCertificateId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder customCertificateId(String customCertificateId) {
            return customCertificateId(Output.of(customCertificateId));
        }

        public Builder filter(@Nullable Output<GetCustomSslFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(GetCustomSslFilterArgs filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param zoneId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public GetCustomSslArgs build() {
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetCustomSslArgs", "zoneId");
            }
            return $;
        }
    }

}
