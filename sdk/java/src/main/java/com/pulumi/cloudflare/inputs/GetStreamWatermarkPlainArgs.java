// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetStreamWatermarkPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamWatermarkPlainArgs Empty = new GetStreamWatermarkPlainArgs();

    /**
     * The account identifier tag.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return The account identifier tag.
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * The unique identifier for a watermark profile.
     * 
     */
    @Import(name="identifier", required=true)
    private String identifier;

    /**
     * @return The unique identifier for a watermark profile.
     * 
     */
    public String identifier() {
        return this.identifier;
    }

    private GetStreamWatermarkPlainArgs() {}

    private GetStreamWatermarkPlainArgs(GetStreamWatermarkPlainArgs $) {
        this.accountId = $.accountId;
        this.identifier = $.identifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamWatermarkPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamWatermarkPlainArgs $;

        public Builder() {
            $ = new GetStreamWatermarkPlainArgs();
        }

        public Builder(GetStreamWatermarkPlainArgs defaults) {
            $ = new GetStreamWatermarkPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier tag.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param identifier The unique identifier for a watermark profile.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            $.identifier = identifier;
            return this;
        }

        public GetStreamWatermarkPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetStreamWatermarkPlainArgs", "accountId");
            }
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetStreamWatermarkPlainArgs", "identifier");
            }
            return $;
        }
    }

}
