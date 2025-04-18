// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MagicWanIpsecTunnelModifiedIpsecTunnelPskMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final MagicWanIpsecTunnelModifiedIpsecTunnelPskMetadataArgs Empty = new MagicWanIpsecTunnelModifiedIpsecTunnelPskMetadataArgs();

    /**
     * The date and time the tunnel was last modified.
     * 
     */
    @Import(name="lastGeneratedOn")
    private @Nullable Output<String> lastGeneratedOn;

    /**
     * @return The date and time the tunnel was last modified.
     * 
     */
    public Optional<Output<String>> lastGeneratedOn() {
        return Optional.ofNullable(this.lastGeneratedOn);
    }

    private MagicWanIpsecTunnelModifiedIpsecTunnelPskMetadataArgs() {}

    private MagicWanIpsecTunnelModifiedIpsecTunnelPskMetadataArgs(MagicWanIpsecTunnelModifiedIpsecTunnelPskMetadataArgs $) {
        this.lastGeneratedOn = $.lastGeneratedOn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MagicWanIpsecTunnelModifiedIpsecTunnelPskMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MagicWanIpsecTunnelModifiedIpsecTunnelPskMetadataArgs $;

        public Builder() {
            $ = new MagicWanIpsecTunnelModifiedIpsecTunnelPskMetadataArgs();
        }

        public Builder(MagicWanIpsecTunnelModifiedIpsecTunnelPskMetadataArgs defaults) {
            $ = new MagicWanIpsecTunnelModifiedIpsecTunnelPskMetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lastGeneratedOn The date and time the tunnel was last modified.
         * 
         * @return builder
         * 
         */
        public Builder lastGeneratedOn(@Nullable Output<String> lastGeneratedOn) {
            $.lastGeneratedOn = lastGeneratedOn;
            return this;
        }

        /**
         * @param lastGeneratedOn The date and time the tunnel was last modified.
         * 
         * @return builder
         * 
         */
        public Builder lastGeneratedOn(String lastGeneratedOn) {
            return lastGeneratedOn(Output.of(lastGeneratedOn));
        }

        public MagicWanIpsecTunnelModifiedIpsecTunnelPskMetadataArgs build() {
            return $;
        }
    }

}
