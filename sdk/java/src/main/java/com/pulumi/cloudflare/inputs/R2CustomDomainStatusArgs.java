// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class R2CustomDomainStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final R2CustomDomainStatusArgs Empty = new R2CustomDomainStatusArgs();

    /**
     * Ownership status of the domain.
     * Available values: &#34;pending&#34;, &#34;active&#34;, &#34;deactivated&#34;, &#34;blocked&#34;, &#34;error&#34;, &#34;unknown&#34;.
     * 
     */
    @Import(name="ownership")
    private @Nullable Output<String> ownership;

    /**
     * @return Ownership status of the domain.
     * Available values: &#34;pending&#34;, &#34;active&#34;, &#34;deactivated&#34;, &#34;blocked&#34;, &#34;error&#34;, &#34;unknown&#34;.
     * 
     */
    public Optional<Output<String>> ownership() {
        return Optional.ofNullable(this.ownership);
    }

    /**
     * SSL certificate status.
     * Available values: &#34;initializing&#34;, &#34;pending&#34;, &#34;active&#34;, &#34;deactivated&#34;, &#34;error&#34;, &#34;unknown&#34;.
     * 
     */
    @Import(name="ssl")
    private @Nullable Output<String> ssl;

    /**
     * @return SSL certificate status.
     * Available values: &#34;initializing&#34;, &#34;pending&#34;, &#34;active&#34;, &#34;deactivated&#34;, &#34;error&#34;, &#34;unknown&#34;.
     * 
     */
    public Optional<Output<String>> ssl() {
        return Optional.ofNullable(this.ssl);
    }

    private R2CustomDomainStatusArgs() {}

    private R2CustomDomainStatusArgs(R2CustomDomainStatusArgs $) {
        this.ownership = $.ownership;
        this.ssl = $.ssl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(R2CustomDomainStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private R2CustomDomainStatusArgs $;

        public Builder() {
            $ = new R2CustomDomainStatusArgs();
        }

        public Builder(R2CustomDomainStatusArgs defaults) {
            $ = new R2CustomDomainStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ownership Ownership status of the domain.
         * Available values: &#34;pending&#34;, &#34;active&#34;, &#34;deactivated&#34;, &#34;blocked&#34;, &#34;error&#34;, &#34;unknown&#34;.
         * 
         * @return builder
         * 
         */
        public Builder ownership(@Nullable Output<String> ownership) {
            $.ownership = ownership;
            return this;
        }

        /**
         * @param ownership Ownership status of the domain.
         * Available values: &#34;pending&#34;, &#34;active&#34;, &#34;deactivated&#34;, &#34;blocked&#34;, &#34;error&#34;, &#34;unknown&#34;.
         * 
         * @return builder
         * 
         */
        public Builder ownership(String ownership) {
            return ownership(Output.of(ownership));
        }

        /**
         * @param ssl SSL certificate status.
         * Available values: &#34;initializing&#34;, &#34;pending&#34;, &#34;active&#34;, &#34;deactivated&#34;, &#34;error&#34;, &#34;unknown&#34;.
         * 
         * @return builder
         * 
         */
        public Builder ssl(@Nullable Output<String> ssl) {
            $.ssl = ssl;
            return this;
        }

        /**
         * @param ssl SSL certificate status.
         * Available values: &#34;initializing&#34;, &#34;pending&#34;, &#34;active&#34;, &#34;deactivated&#34;, &#34;error&#34;, &#34;unknown&#34;.
         * 
         * @return builder
         * 
         */
        public Builder ssl(String ssl) {
            return ssl(Output.of(ssl));
        }

        public R2CustomDomainStatusArgs build() {
            return $;
        }
    }

}
