// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetImagePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImagePlainArgs Empty = new GetImagePlainArgs();

    /**
     * Account identifier tag.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return Account identifier tag.
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * Image unique identifier.
     * 
     */
    @Import(name="imageId", required=true)
    private String imageId;

    /**
     * @return Image unique identifier.
     * 
     */
    public String imageId() {
        return this.imageId;
    }

    private GetImagePlainArgs() {}

    private GetImagePlainArgs(GetImagePlainArgs $) {
        this.accountId = $.accountId;
        this.imageId = $.imageId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagePlainArgs $;

        public Builder() {
            $ = new GetImagePlainArgs();
        }

        public Builder(GetImagePlainArgs defaults) {
            $ = new GetImagePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account identifier tag.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param imageId Image unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            $.imageId = imageId;
            return this;
        }

        public GetImagePlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetImagePlainArgs", "accountId");
            }
            if ($.imageId == null) {
                throw new MissingRequiredPropertyException("GetImagePlainArgs", "imageId");
            }
            return $;
        }
    }

}
