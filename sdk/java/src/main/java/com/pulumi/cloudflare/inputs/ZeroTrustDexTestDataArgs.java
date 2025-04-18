// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustDexTestDataArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustDexTestDataArgs Empty = new ZeroTrustDexTestDataArgs();

    /**
     * The desired endpoint to test.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return The desired endpoint to test.
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * The type of test.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return The type of test.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The HTTP request method type.
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    /**
     * @return The HTTP request method type.
     * 
     */
    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    private ZeroTrustDexTestDataArgs() {}

    private ZeroTrustDexTestDataArgs(ZeroTrustDexTestDataArgs $) {
        this.host = $.host;
        this.kind = $.kind;
        this.method = $.method;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustDexTestDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustDexTestDataArgs $;

        public Builder() {
            $ = new ZeroTrustDexTestDataArgs();
        }

        public Builder(ZeroTrustDexTestDataArgs defaults) {
            $ = new ZeroTrustDexTestDataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param host The desired endpoint to test.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The desired endpoint to test.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param kind The type of test.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The type of test.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param method The HTTP request method type.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method The HTTP request method type.
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        public ZeroTrustDexTestDataArgs build() {
            return $;
        }
    }

}
