// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustAccessApplicationSaasAppRefreshTokenOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessApplicationSaasAppRefreshTokenOptionsArgs Empty = new ZeroTrustAccessApplicationSaasAppRefreshTokenOptionsArgs();

    /**
     * How long a refresh token will be valid for after creation. Valid units are m,h,d. Must be longer than 1m.
     * 
     */
    @Import(name="lifetime")
    private @Nullable Output<String> lifetime;

    /**
     * @return How long a refresh token will be valid for after creation. Valid units are m,h,d. Must be longer than 1m.
     * 
     */
    public Optional<Output<String>> lifetime() {
        return Optional.ofNullable(this.lifetime);
    }

    private ZeroTrustAccessApplicationSaasAppRefreshTokenOptionsArgs() {}

    private ZeroTrustAccessApplicationSaasAppRefreshTokenOptionsArgs(ZeroTrustAccessApplicationSaasAppRefreshTokenOptionsArgs $) {
        this.lifetime = $.lifetime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessApplicationSaasAppRefreshTokenOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessApplicationSaasAppRefreshTokenOptionsArgs $;

        public Builder() {
            $ = new ZeroTrustAccessApplicationSaasAppRefreshTokenOptionsArgs();
        }

        public Builder(ZeroTrustAccessApplicationSaasAppRefreshTokenOptionsArgs defaults) {
            $ = new ZeroTrustAccessApplicationSaasAppRefreshTokenOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lifetime How long a refresh token will be valid for after creation. Valid units are m,h,d. Must be longer than 1m.
         * 
         * @return builder
         * 
         */
        public Builder lifetime(@Nullable Output<String> lifetime) {
            $.lifetime = lifetime;
            return this;
        }

        /**
         * @param lifetime How long a refresh token will be valid for after creation. Valid units are m,h,d. Must be longer than 1m.
         * 
         * @return builder
         * 
         */
        public Builder lifetime(String lifetime) {
            return lifetime(Output.of(lifetime));
        }

        public ZeroTrustAccessApplicationSaasAppRefreshTokenOptionsArgs build() {
            return $;
        }
    }

}
