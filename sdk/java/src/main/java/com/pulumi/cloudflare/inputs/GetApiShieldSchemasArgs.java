// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApiShieldSchemasArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiShieldSchemasArgs Empty = new GetApiShieldSchemasArgs();

    /**
     * Max items to fetch, default: 1000
     * 
     */
    @Import(name="maxItems")
    private @Nullable Output<Integer> maxItems;

    /**
     * @return Max items to fetch, default: 1000
     * 
     */
    public Optional<Output<Integer>> maxItems() {
        return Optional.ofNullable(this.maxItems);
    }

    /**
     * Omit the source-files of schemas and only retrieve their meta-data.
     * 
     */
    @Import(name="omitSource")
    private @Nullable Output<Boolean> omitSource;

    /**
     * @return Omit the source-files of schemas and only retrieve their meta-data.
     * 
     */
    public Optional<Output<Boolean>> omitSource() {
        return Optional.ofNullable(this.omitSource);
    }

    /**
     * Flag whether schema is enabled for validation.
     * 
     */
    @Import(name="validationEnabled")
    private @Nullable Output<Boolean> validationEnabled;

    /**
     * @return Flag whether schema is enabled for validation.
     * 
     */
    public Optional<Output<Boolean>> validationEnabled() {
        return Optional.ofNullable(this.validationEnabled);
    }

    /**
     * Identifier.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return Identifier.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private GetApiShieldSchemasArgs() {}

    private GetApiShieldSchemasArgs(GetApiShieldSchemasArgs $) {
        this.maxItems = $.maxItems;
        this.omitSource = $.omitSource;
        this.validationEnabled = $.validationEnabled;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiShieldSchemasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiShieldSchemasArgs $;

        public Builder() {
            $ = new GetApiShieldSchemasArgs();
        }

        public Builder(GetApiShieldSchemasArgs defaults) {
            $ = new GetApiShieldSchemasArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxItems Max items to fetch, default: 1000
         * 
         * @return builder
         * 
         */
        public Builder maxItems(@Nullable Output<Integer> maxItems) {
            $.maxItems = maxItems;
            return this;
        }

        /**
         * @param maxItems Max items to fetch, default: 1000
         * 
         * @return builder
         * 
         */
        public Builder maxItems(Integer maxItems) {
            return maxItems(Output.of(maxItems));
        }

        /**
         * @param omitSource Omit the source-files of schemas and only retrieve their meta-data.
         * 
         * @return builder
         * 
         */
        public Builder omitSource(@Nullable Output<Boolean> omitSource) {
            $.omitSource = omitSource;
            return this;
        }

        /**
         * @param omitSource Omit the source-files of schemas and only retrieve their meta-data.
         * 
         * @return builder
         * 
         */
        public Builder omitSource(Boolean omitSource) {
            return omitSource(Output.of(omitSource));
        }

        /**
         * @param validationEnabled Flag whether schema is enabled for validation.
         * 
         * @return builder
         * 
         */
        public Builder validationEnabled(@Nullable Output<Boolean> validationEnabled) {
            $.validationEnabled = validationEnabled;
            return this;
        }

        /**
         * @param validationEnabled Flag whether schema is enabled for validation.
         * 
         * @return builder
         * 
         */
        public Builder validationEnabled(Boolean validationEnabled) {
            return validationEnabled(Output.of(validationEnabled));
        }

        /**
         * @param zoneId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public GetApiShieldSchemasArgs build() {
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetApiShieldSchemasArgs", "zoneId");
            }
            return $;
        }
    }

}
