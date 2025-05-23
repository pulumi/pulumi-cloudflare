// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApiTokenPermissionGroupsListPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiTokenPermissionGroupsListPlainArgs Empty = new GetApiTokenPermissionGroupsListPlainArgs();

    /**
     * Max items to fetch, default: 1000
     * 
     */
    @Import(name="maxItems")
    private @Nullable Integer maxItems;

    /**
     * @return Max items to fetch, default: 1000
     * 
     */
    public Optional<Integer> maxItems() {
        return Optional.ofNullable(this.maxItems);
    }

    private GetApiTokenPermissionGroupsListPlainArgs() {}

    private GetApiTokenPermissionGroupsListPlainArgs(GetApiTokenPermissionGroupsListPlainArgs $) {
        this.maxItems = $.maxItems;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiTokenPermissionGroupsListPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiTokenPermissionGroupsListPlainArgs $;

        public Builder() {
            $ = new GetApiTokenPermissionGroupsListPlainArgs();
        }

        public Builder(GetApiTokenPermissionGroupsListPlainArgs defaults) {
            $ = new GetApiTokenPermissionGroupsListPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxItems Max items to fetch, default: 1000
         * 
         * @return builder
         * 
         */
        public Builder maxItems(@Nullable Integer maxItems) {
            $.maxItems = maxItems;
            return this;
        }

        public GetApiTokenPermissionGroupsListPlainArgs build() {
            return $;
        }
    }

}
