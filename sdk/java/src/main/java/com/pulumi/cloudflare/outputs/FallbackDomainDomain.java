// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FallbackDomainDomain {
    /**
     * @return The description of the domain.
     * 
     */
    private @Nullable String description;
    /**
     * @return The DNS servers to receive the redirected request.
     * 
     */
    private @Nullable List<String> dnsServers;
    /**
     * @return The domain to ignore DNS requests.
     * 
     */
    private @Nullable String suffix;

    private FallbackDomainDomain() {}
    /**
     * @return The description of the domain.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The DNS servers to receive the redirected request.
     * 
     */
    public List<String> dnsServers() {
        return this.dnsServers == null ? List.of() : this.dnsServers;
    }
    /**
     * @return The domain to ignore DNS requests.
     * 
     */
    public Optional<String> suffix() {
        return Optional.ofNullable(this.suffix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FallbackDomainDomain defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> dnsServers;
        private @Nullable String suffix;
        public Builder() {}
        public Builder(FallbackDomainDomain defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.dnsServers = defaults.dnsServers;
    	      this.suffix = defaults.suffix;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder dnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }
        @CustomType.Setter
        public Builder suffix(@Nullable String suffix) {
            this.suffix = suffix;
            return this;
        }
        public FallbackDomainDomain build() {
            final var o = new FallbackDomainDomain();
            o.description = description;
            o.dnsServers = dnsServers;
            o.suffix = suffix;
            return o;
        }
    }
}