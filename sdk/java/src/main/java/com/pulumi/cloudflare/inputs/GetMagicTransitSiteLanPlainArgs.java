// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMagicTransitSiteLanPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMagicTransitSiteLanPlainArgs Empty = new GetMagicTransitSiteLanPlainArgs();

    /**
     * Identifier
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return Identifier
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * Identifier
     * 
     */
    @Import(name="lanId")
    private @Nullable String lanId;

    /**
     * @return Identifier
     * 
     */
    public Optional<String> lanId() {
        return Optional.ofNullable(this.lanId);
    }

    /**
     * Identifier
     * 
     */
    @Import(name="siteId", required=true)
    private String siteId;

    /**
     * @return Identifier
     * 
     */
    public String siteId() {
        return this.siteId;
    }

    private GetMagicTransitSiteLanPlainArgs() {}

    private GetMagicTransitSiteLanPlainArgs(GetMagicTransitSiteLanPlainArgs $) {
        this.accountId = $.accountId;
        this.lanId = $.lanId;
        this.siteId = $.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMagicTransitSiteLanPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMagicTransitSiteLanPlainArgs $;

        public Builder() {
            $ = new GetMagicTransitSiteLanPlainArgs();
        }

        public Builder(GetMagicTransitSiteLanPlainArgs defaults) {
            $ = new GetMagicTransitSiteLanPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Identifier
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param lanId Identifier
         * 
         * @return builder
         * 
         */
        public Builder lanId(@Nullable String lanId) {
            $.lanId = lanId;
            return this;
        }

        /**
         * @param siteId Identifier
         * 
         * @return builder
         * 
         */
        public Builder siteId(String siteId) {
            $.siteId = siteId;
            return this;
        }

        public GetMagicTransitSiteLanPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetMagicTransitSiteLanPlainArgs", "accountId");
            }
            if ($.siteId == null) {
                throw new MissingRequiredPropertyException("GetMagicTransitSiteLanPlainArgs", "siteId");
            }
            return $;
        }
    }

}
