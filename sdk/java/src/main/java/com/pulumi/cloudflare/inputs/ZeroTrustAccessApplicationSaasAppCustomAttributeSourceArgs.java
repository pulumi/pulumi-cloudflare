// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppCustomAttributeSourceNameByIdpArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs Empty = new ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs();

    /**
     * The name of the IdP attribute.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the IdP attribute.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A mapping from IdP ID to attribute name.
     * 
     */
    @Import(name="nameByIdps")
    private @Nullable Output<List<ZeroTrustAccessApplicationSaasAppCustomAttributeSourceNameByIdpArgs>> nameByIdps;

    /**
     * @return A mapping from IdP ID to attribute name.
     * 
     */
    public Optional<Output<List<ZeroTrustAccessApplicationSaasAppCustomAttributeSourceNameByIdpArgs>>> nameByIdps() {
        return Optional.ofNullable(this.nameByIdps);
    }

    private ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs() {}

    private ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs(ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs $) {
        this.name = $.name;
        this.nameByIdps = $.nameByIdps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs $;

        public Builder() {
            $ = new ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs();
        }

        public Builder(ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs defaults) {
            $ = new ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the IdP attribute.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the IdP attribute.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nameByIdps A mapping from IdP ID to attribute name.
         * 
         * @return builder
         * 
         */
        public Builder nameByIdps(@Nullable Output<List<ZeroTrustAccessApplicationSaasAppCustomAttributeSourceNameByIdpArgs>> nameByIdps) {
            $.nameByIdps = nameByIdps;
            return this;
        }

        /**
         * @param nameByIdps A mapping from IdP ID to attribute name.
         * 
         * @return builder
         * 
         */
        public Builder nameByIdps(List<ZeroTrustAccessApplicationSaasAppCustomAttributeSourceNameByIdpArgs> nameByIdps) {
            return nameByIdps(Output.of(nameByIdps));
        }

        /**
         * @param nameByIdps A mapping from IdP ID to attribute name.
         * 
         * @return builder
         * 
         */
        public Builder nameByIdps(ZeroTrustAccessApplicationSaasAppCustomAttributeSourceNameByIdpArgs... nameByIdps) {
            return nameByIdps(List.of(nameByIdps));
        }

        public ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs build() {
            return $;
        }
    }

}
