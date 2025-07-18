// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConnectionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustTunnelCloudflaredState extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustTunnelCloudflaredState Empty = new ZeroTrustTunnelCloudflaredState();

    /**
     * Cloudflare account ID
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Cloudflare account ID
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Cloudflare account ID
     * 
     */
    @Import(name="accountTag")
    private @Nullable Output<String> accountTag;

    /**
     * @return Cloudflare account ID
     * 
     */
    public Optional<Output<String>> accountTag() {
        return Optional.ofNullable(this.accountTag);
    }

    /**
     * Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard.
     * Available values: &#34;local&#34;, &#34;cloudflare&#34;.
     * 
     */
    @Import(name="configSrc")
    private @Nullable Output<String> configSrc;

    /**
     * @return Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard.
     * Available values: &#34;local&#34;, &#34;cloudflare&#34;.
     * 
     */
    public Optional<Output<String>> configSrc() {
        return Optional.ofNullable(this.configSrc);
    }

    /**
     * The Cloudflare Tunnel connections between your origin and Cloudflare&#39;s edge.
     * 
     * @deprecated
     * This field will start returning an empty array. To fetch the connections of a given tunnel, please use the dedicated endpoint `/accounts/{account_id}/{tunnel_type}/{tunnel_id}/connections`
     * 
     */
    @Deprecated /* This field will start returning an empty array. To fetch the connections of a given tunnel, please use the dedicated endpoint `/accounts/{account_id}/{tunnel_type}/{tunnel_id}/connections` */
    @Import(name="connections")
    private @Nullable Output<List<ZeroTrustTunnelCloudflaredConnectionArgs>> connections;

    /**
     * @return The Cloudflare Tunnel connections between your origin and Cloudflare&#39;s edge.
     * 
     * @deprecated
     * This field will start returning an empty array. To fetch the connections of a given tunnel, please use the dedicated endpoint `/accounts/{account_id}/{tunnel_type}/{tunnel_id}/connections`
     * 
     */
    @Deprecated /* This field will start returning an empty array. To fetch the connections of a given tunnel, please use the dedicated endpoint `/accounts/{account_id}/{tunnel_type}/{tunnel_id}/connections` */
    public Optional<Output<List<ZeroTrustTunnelCloudflaredConnectionArgs>>> connections() {
        return Optional.ofNullable(this.connections);
    }

    /**
     * Timestamp of when the tunnel established at least one connection to Cloudflare&#39;s edge. If `null`, the tunnel is inactive.
     * 
     */
    @Import(name="connsActiveAt")
    private @Nullable Output<String> connsActiveAt;

    /**
     * @return Timestamp of when the tunnel established at least one connection to Cloudflare&#39;s edge. If `null`, the tunnel is inactive.
     * 
     */
    public Optional<Output<String>> connsActiveAt() {
        return Optional.ofNullable(this.connsActiveAt);
    }

    /**
     * Timestamp of when the tunnel became inactive (no connections to Cloudflare&#39;s edge). If `null`, the tunnel is active.
     * 
     */
    @Import(name="connsInactiveAt")
    private @Nullable Output<String> connsInactiveAt;

    /**
     * @return Timestamp of when the tunnel became inactive (no connections to Cloudflare&#39;s edge). If `null`, the tunnel is active.
     * 
     */
    public Optional<Output<String>> connsInactiveAt() {
        return Optional.ofNullable(this.connsInactiveAt);
    }

    /**
     * Timestamp of when the resource was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return Timestamp of when the resource was created.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Timestamp of when the resource was deleted. If `null`, the resource has not been deleted.
     * 
     */
    @Import(name="deletedAt")
    private @Nullable Output<String> deletedAt;

    /**
     * @return Timestamp of when the resource was deleted. If `null`, the resource has not been deleted.
     * 
     */
    public Optional<Output<String>> deletedAt() {
        return Optional.ofNullable(this.deletedAt);
    }

    /**
     * Metadata associated with the tunnel.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<String> metadata;

    /**
     * @return Metadata associated with the tunnel.
     * 
     */
    public Optional<Output<String>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * A user-friendly name for a tunnel.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A user-friendly name for a tunnel.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * If `true`, the tunnel can be configured remotely from the Zero Trust dashboard. If `false`, the tunnel must be configured locally on the origin machine.
     * 
     */
    @Import(name="remoteConfig")
    private @Nullable Output<Boolean> remoteConfig;

    /**
     * @return If `true`, the tunnel can be configured remotely from the Zero Trust dashboard. If `false`, the tunnel must be configured locally on the origin machine.
     * 
     */
    public Optional<Output<Boolean>> remoteConfig() {
        return Optional.ofNullable(this.remoteConfig);
    }

    /**
     * The status of the tunnel. Valid values are `inactive` (tunnel has never been run), `degraded` (tunnel is active and able to serve traffic but in an unhealthy state), `healthy` (tunnel is active and able to serve traffic), or `down` (tunnel can not serve traffic as it has no connections to the Cloudflare Edge).
     * Available values: &#34;inactive&#34;, &#34;degraded&#34;, &#34;healthy&#34;, &#34;down&#34;.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the tunnel. Valid values are `inactive` (tunnel has never been run), `degraded` (tunnel is active and able to serve traffic but in an unhealthy state), `healthy` (tunnel is active and able to serve traffic), or `down` (tunnel can not serve traffic as it has no connections to the Cloudflare Edge).
     * Available values: &#34;inactive&#34;, &#34;degraded&#34;, &#34;healthy&#34;, &#34;down&#34;.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The type of tunnel.
     * Available values: &#34;cfd*tunnel&#34;, &#34;warp*connector&#34;, &#34;warp&#34;, &#34;magic&#34;, &#34;ip_sec&#34;, &#34;gre&#34;, &#34;cni&#34;.
     * 
     */
    @Import(name="tunType")
    private @Nullable Output<String> tunType;

    /**
     * @return The type of tunnel.
     * Available values: &#34;cfd*tunnel&#34;, &#34;warp*connector&#34;, &#34;warp&#34;, &#34;magic&#34;, &#34;ip_sec&#34;, &#34;gre&#34;, &#34;cni&#34;.
     * 
     */
    public Optional<Output<String>> tunType() {
        return Optional.ofNullable(this.tunType);
    }

    /**
     * Sets the password required to run a locally-managed tunnel. Must be at least 32 bytes and encoded as a base64 string.
     * 
     */
    @Import(name="tunnelSecret")
    private @Nullable Output<String> tunnelSecret;

    /**
     * @return Sets the password required to run a locally-managed tunnel. Must be at least 32 bytes and encoded as a base64 string.
     * 
     */
    public Optional<Output<String>> tunnelSecret() {
        return Optional.ofNullable(this.tunnelSecret);
    }

    private ZeroTrustTunnelCloudflaredState() {}

    private ZeroTrustTunnelCloudflaredState(ZeroTrustTunnelCloudflaredState $) {
        this.accountId = $.accountId;
        this.accountTag = $.accountTag;
        this.configSrc = $.configSrc;
        this.connections = $.connections;
        this.connsActiveAt = $.connsActiveAt;
        this.connsInactiveAt = $.connsInactiveAt;
        this.createdAt = $.createdAt;
        this.deletedAt = $.deletedAt;
        this.metadata = $.metadata;
        this.name = $.name;
        this.remoteConfig = $.remoteConfig;
        this.status = $.status;
        this.tunType = $.tunType;
        this.tunnelSecret = $.tunnelSecret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustTunnelCloudflaredState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustTunnelCloudflaredState $;

        public Builder() {
            $ = new ZeroTrustTunnelCloudflaredState();
        }

        public Builder(ZeroTrustTunnelCloudflaredState defaults) {
            $ = new ZeroTrustTunnelCloudflaredState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Cloudflare account ID
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Cloudflare account ID
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param accountTag Cloudflare account ID
         * 
         * @return builder
         * 
         */
        public Builder accountTag(@Nullable Output<String> accountTag) {
            $.accountTag = accountTag;
            return this;
        }

        /**
         * @param accountTag Cloudflare account ID
         * 
         * @return builder
         * 
         */
        public Builder accountTag(String accountTag) {
            return accountTag(Output.of(accountTag));
        }

        /**
         * @param configSrc Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard.
         * Available values: &#34;local&#34;, &#34;cloudflare&#34;.
         * 
         * @return builder
         * 
         */
        public Builder configSrc(@Nullable Output<String> configSrc) {
            $.configSrc = configSrc;
            return this;
        }

        /**
         * @param configSrc Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard.
         * Available values: &#34;local&#34;, &#34;cloudflare&#34;.
         * 
         * @return builder
         * 
         */
        public Builder configSrc(String configSrc) {
            return configSrc(Output.of(configSrc));
        }

        /**
         * @param connections The Cloudflare Tunnel connections between your origin and Cloudflare&#39;s edge.
         * 
         * @return builder
         * 
         * @deprecated
         * This field will start returning an empty array. To fetch the connections of a given tunnel, please use the dedicated endpoint `/accounts/{account_id}/{tunnel_type}/{tunnel_id}/connections`
         * 
         */
        @Deprecated /* This field will start returning an empty array. To fetch the connections of a given tunnel, please use the dedicated endpoint `/accounts/{account_id}/{tunnel_type}/{tunnel_id}/connections` */
        public Builder connections(@Nullable Output<List<ZeroTrustTunnelCloudflaredConnectionArgs>> connections) {
            $.connections = connections;
            return this;
        }

        /**
         * @param connections The Cloudflare Tunnel connections between your origin and Cloudflare&#39;s edge.
         * 
         * @return builder
         * 
         * @deprecated
         * This field will start returning an empty array. To fetch the connections of a given tunnel, please use the dedicated endpoint `/accounts/{account_id}/{tunnel_type}/{tunnel_id}/connections`
         * 
         */
        @Deprecated /* This field will start returning an empty array. To fetch the connections of a given tunnel, please use the dedicated endpoint `/accounts/{account_id}/{tunnel_type}/{tunnel_id}/connections` */
        public Builder connections(List<ZeroTrustTunnelCloudflaredConnectionArgs> connections) {
            return connections(Output.of(connections));
        }

        /**
         * @param connections The Cloudflare Tunnel connections between your origin and Cloudflare&#39;s edge.
         * 
         * @return builder
         * 
         * @deprecated
         * This field will start returning an empty array. To fetch the connections of a given tunnel, please use the dedicated endpoint `/accounts/{account_id}/{tunnel_type}/{tunnel_id}/connections`
         * 
         */
        @Deprecated /* This field will start returning an empty array. To fetch the connections of a given tunnel, please use the dedicated endpoint `/accounts/{account_id}/{tunnel_type}/{tunnel_id}/connections` */
        public Builder connections(ZeroTrustTunnelCloudflaredConnectionArgs... connections) {
            return connections(List.of(connections));
        }

        /**
         * @param connsActiveAt Timestamp of when the tunnel established at least one connection to Cloudflare&#39;s edge. If `null`, the tunnel is inactive.
         * 
         * @return builder
         * 
         */
        public Builder connsActiveAt(@Nullable Output<String> connsActiveAt) {
            $.connsActiveAt = connsActiveAt;
            return this;
        }

        /**
         * @param connsActiveAt Timestamp of when the tunnel established at least one connection to Cloudflare&#39;s edge. If `null`, the tunnel is inactive.
         * 
         * @return builder
         * 
         */
        public Builder connsActiveAt(String connsActiveAt) {
            return connsActiveAt(Output.of(connsActiveAt));
        }

        /**
         * @param connsInactiveAt Timestamp of when the tunnel became inactive (no connections to Cloudflare&#39;s edge). If `null`, the tunnel is active.
         * 
         * @return builder
         * 
         */
        public Builder connsInactiveAt(@Nullable Output<String> connsInactiveAt) {
            $.connsInactiveAt = connsInactiveAt;
            return this;
        }

        /**
         * @param connsInactiveAt Timestamp of when the tunnel became inactive (no connections to Cloudflare&#39;s edge). If `null`, the tunnel is active.
         * 
         * @return builder
         * 
         */
        public Builder connsInactiveAt(String connsInactiveAt) {
            return connsInactiveAt(Output.of(connsInactiveAt));
        }

        /**
         * @param createdAt Timestamp of when the resource was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt Timestamp of when the resource was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param deletedAt Timestamp of when the resource was deleted. If `null`, the resource has not been deleted.
         * 
         * @return builder
         * 
         */
        public Builder deletedAt(@Nullable Output<String> deletedAt) {
            $.deletedAt = deletedAt;
            return this;
        }

        /**
         * @param deletedAt Timestamp of when the resource was deleted. If `null`, the resource has not been deleted.
         * 
         * @return builder
         * 
         */
        public Builder deletedAt(String deletedAt) {
            return deletedAt(Output.of(deletedAt));
        }

        /**
         * @param metadata Metadata associated with the tunnel.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<String> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Metadata associated with the tunnel.
         * 
         * @return builder
         * 
         */
        public Builder metadata(String metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param name A user-friendly name for a tunnel.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A user-friendly name for a tunnel.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param remoteConfig If `true`, the tunnel can be configured remotely from the Zero Trust dashboard. If `false`, the tunnel must be configured locally on the origin machine.
         * 
         * @return builder
         * 
         */
        public Builder remoteConfig(@Nullable Output<Boolean> remoteConfig) {
            $.remoteConfig = remoteConfig;
            return this;
        }

        /**
         * @param remoteConfig If `true`, the tunnel can be configured remotely from the Zero Trust dashboard. If `false`, the tunnel must be configured locally on the origin machine.
         * 
         * @return builder
         * 
         */
        public Builder remoteConfig(Boolean remoteConfig) {
            return remoteConfig(Output.of(remoteConfig));
        }

        /**
         * @param status The status of the tunnel. Valid values are `inactive` (tunnel has never been run), `degraded` (tunnel is active and able to serve traffic but in an unhealthy state), `healthy` (tunnel is active and able to serve traffic), or `down` (tunnel can not serve traffic as it has no connections to the Cloudflare Edge).
         * Available values: &#34;inactive&#34;, &#34;degraded&#34;, &#34;healthy&#34;, &#34;down&#34;.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the tunnel. Valid values are `inactive` (tunnel has never been run), `degraded` (tunnel is active and able to serve traffic but in an unhealthy state), `healthy` (tunnel is active and able to serve traffic), or `down` (tunnel can not serve traffic as it has no connections to the Cloudflare Edge).
         * Available values: &#34;inactive&#34;, &#34;degraded&#34;, &#34;healthy&#34;, &#34;down&#34;.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tunType The type of tunnel.
         * Available values: &#34;cfd*tunnel&#34;, &#34;warp*connector&#34;, &#34;warp&#34;, &#34;magic&#34;, &#34;ip_sec&#34;, &#34;gre&#34;, &#34;cni&#34;.
         * 
         * @return builder
         * 
         */
        public Builder tunType(@Nullable Output<String> tunType) {
            $.tunType = tunType;
            return this;
        }

        /**
         * @param tunType The type of tunnel.
         * Available values: &#34;cfd*tunnel&#34;, &#34;warp*connector&#34;, &#34;warp&#34;, &#34;magic&#34;, &#34;ip_sec&#34;, &#34;gre&#34;, &#34;cni&#34;.
         * 
         * @return builder
         * 
         */
        public Builder tunType(String tunType) {
            return tunType(Output.of(tunType));
        }

        /**
         * @param tunnelSecret Sets the password required to run a locally-managed tunnel. Must be at least 32 bytes and encoded as a base64 string.
         * 
         * @return builder
         * 
         */
        public Builder tunnelSecret(@Nullable Output<String> tunnelSecret) {
            $.tunnelSecret = tunnelSecret;
            return this;
        }

        /**
         * @param tunnelSecret Sets the password required to run a locally-managed tunnel. Must be at least 32 bytes and encoded as a base64 string.
         * 
         * @return builder
         * 
         */
        public Builder tunnelSecret(String tunnelSecret) {
            return tunnelSecret(Output.of(tunnelSecret));
        }

        public ZeroTrustTunnelCloudflaredState build() {
            return $;
        }
    }

}
