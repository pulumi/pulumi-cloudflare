// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustTunnelCloudflaredConfigConfigOriginRequestAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustTunnelCloudflaredConfigConfigOriginRequestAccessArgs Empty = new ZeroTrustTunnelCloudflaredConfigConfigOriginRequestAccessArgs();

    /**
     * Access applications that are allowed to reach this hostname for this Tunnel. Audience tags can be identified in the dashboard or via the List Access policies API.
     * 
     */
    @Import(name="audTags", required=true)
    private Output<List<String>> audTags;

    /**
     * @return Access applications that are allowed to reach this hostname for this Tunnel. Audience tags can be identified in the dashboard or via the List Access policies API.
     * 
     */
    public Output<List<String>> audTags() {
        return this.audTags;
    }

    /**
     * Deny traffic that has not fulfilled Access authorization.
     * 
     */
    @Import(name="required")
    private @Nullable Output<Boolean> required;

    /**
     * @return Deny traffic that has not fulfilled Access authorization.
     * 
     */
    public Optional<Output<Boolean>> required() {
        return Optional.ofNullable(this.required);
    }

    @Import(name="teamName", required=true)
    private Output<String> teamName;

    public Output<String> teamName() {
        return this.teamName;
    }

    private ZeroTrustTunnelCloudflaredConfigConfigOriginRequestAccessArgs() {}

    private ZeroTrustTunnelCloudflaredConfigConfigOriginRequestAccessArgs(ZeroTrustTunnelCloudflaredConfigConfigOriginRequestAccessArgs $) {
        this.audTags = $.audTags;
        this.required = $.required;
        this.teamName = $.teamName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustTunnelCloudflaredConfigConfigOriginRequestAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustTunnelCloudflaredConfigConfigOriginRequestAccessArgs $;

        public Builder() {
            $ = new ZeroTrustTunnelCloudflaredConfigConfigOriginRequestAccessArgs();
        }

        public Builder(ZeroTrustTunnelCloudflaredConfigConfigOriginRequestAccessArgs defaults) {
            $ = new ZeroTrustTunnelCloudflaredConfigConfigOriginRequestAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audTags Access applications that are allowed to reach this hostname for this Tunnel. Audience tags can be identified in the dashboard or via the List Access policies API.
         * 
         * @return builder
         * 
         */
        public Builder audTags(Output<List<String>> audTags) {
            $.audTags = audTags;
            return this;
        }

        /**
         * @param audTags Access applications that are allowed to reach this hostname for this Tunnel. Audience tags can be identified in the dashboard or via the List Access policies API.
         * 
         * @return builder
         * 
         */
        public Builder audTags(List<String> audTags) {
            return audTags(Output.of(audTags));
        }

        /**
         * @param audTags Access applications that are allowed to reach this hostname for this Tunnel. Audience tags can be identified in the dashboard or via the List Access policies API.
         * 
         * @return builder
         * 
         */
        public Builder audTags(String... audTags) {
            return audTags(List.of(audTags));
        }

        /**
         * @param required Deny traffic that has not fulfilled Access authorization.
         * 
         * @return builder
         * 
         */
        public Builder required(@Nullable Output<Boolean> required) {
            $.required = required;
            return this;
        }

        /**
         * @param required Deny traffic that has not fulfilled Access authorization.
         * 
         * @return builder
         * 
         */
        public Builder required(Boolean required) {
            return required(Output.of(required));
        }

        public Builder teamName(Output<String> teamName) {
            $.teamName = teamName;
            return this;
        }

        public Builder teamName(String teamName) {
            return teamName(Output.of(teamName));
        }

        public ZeroTrustTunnelCloudflaredConfigConfigOriginRequestAccessArgs build() {
            if ($.audTags == null) {
                throw new MissingRequiredPropertyException("ZeroTrustTunnelCloudflaredConfigConfigOriginRequestAccessArgs", "audTags");
            }
            if ($.teamName == null) {
                throw new MissingRequiredPropertyException("ZeroTrustTunnelCloudflaredConfigConfigOriginRequestAccessArgs", "teamName");
            }
            return $;
        }
    }

}
