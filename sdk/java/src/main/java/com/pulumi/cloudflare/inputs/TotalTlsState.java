// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TotalTlsState extends com.pulumi.resources.ResourceArgs {

    public static final TotalTlsState Empty = new TotalTlsState();

    /**
     * The Certificate Authority that Total TLS certificates will be issued through. Available values: `google`, `lets_encrypt`.
     * 
     */
    @Import(name="certificateAuthority")
    private @Nullable Output<String> certificateAuthority;

    /**
     * @return The Certificate Authority that Total TLS certificates will be issued through. Available values: `google`, `lets_encrypt`.
     * 
     */
    public Optional<Output<String>> certificateAuthority() {
        return Optional.ofNullable(this.certificateAuthority);
    }

    /**
     * Enable Total TLS for the zone.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable Total TLS for the zone.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private TotalTlsState() {}

    private TotalTlsState(TotalTlsState $) {
        this.certificateAuthority = $.certificateAuthority;
        this.enabled = $.enabled;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TotalTlsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TotalTlsState $;

        public Builder() {
            $ = new TotalTlsState();
        }

        public Builder(TotalTlsState defaults) {
            $ = new TotalTlsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateAuthority The Certificate Authority that Total TLS certificates will be issued through. Available values: `google`, `lets_encrypt`.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthority(@Nullable Output<String> certificateAuthority) {
            $.certificateAuthority = certificateAuthority;
            return this;
        }

        /**
         * @param certificateAuthority The Certificate Authority that Total TLS certificates will be issued through. Available values: `google`, `lets_encrypt`.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthority(String certificateAuthority) {
            return certificateAuthority(Output.of(certificateAuthority));
        }

        /**
         * @param enabled Enable Total TLS for the zone.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable Total TLS for the zone.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public TotalTlsState build() {
            return $;
        }
    }

}
