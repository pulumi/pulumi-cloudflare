// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetLeakedCredentialCheckPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLeakedCredentialCheckPlainArgs Empty = new GetLeakedCredentialCheckPlainArgs();

    /**
     * Defines an identifier.
     * 
     */
    @Import(name="zoneId", required=true)
    private String zoneId;

    /**
     * @return Defines an identifier.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    private GetLeakedCredentialCheckPlainArgs() {}

    private GetLeakedCredentialCheckPlainArgs(GetLeakedCredentialCheckPlainArgs $) {
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLeakedCredentialCheckPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLeakedCredentialCheckPlainArgs $;

        public Builder() {
            $ = new GetLeakedCredentialCheckPlainArgs();
        }

        public Builder(GetLeakedCredentialCheckPlainArgs defaults) {
            $ = new GetLeakedCredentialCheckPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param zoneId Defines an identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public GetLeakedCredentialCheckPlainArgs build() {
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetLeakedCredentialCheckPlainArgs", "zoneId");
            }
            return $;
        }
    }

}
