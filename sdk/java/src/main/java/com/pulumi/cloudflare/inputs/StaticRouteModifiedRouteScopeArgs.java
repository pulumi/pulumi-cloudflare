// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StaticRouteModifiedRouteScopeArgs extends com.pulumi.resources.ResourceArgs {

    public static final StaticRouteModifiedRouteScopeArgs Empty = new StaticRouteModifiedRouteScopeArgs();

    /**
     * List of colo names for the ECMP scope.
     * 
     */
    @Import(name="coloNames")
    private @Nullable Output<List<String>> coloNames;

    /**
     * @return List of colo names for the ECMP scope.
     * 
     */
    public Optional<Output<List<String>>> coloNames() {
        return Optional.ofNullable(this.coloNames);
    }

    /**
     * List of colo regions for the ECMP scope.
     * 
     */
    @Import(name="coloRegions")
    private @Nullable Output<List<String>> coloRegions;

    /**
     * @return List of colo regions for the ECMP scope.
     * 
     */
    public Optional<Output<List<String>>> coloRegions() {
        return Optional.ofNullable(this.coloRegions);
    }

    private StaticRouteModifiedRouteScopeArgs() {}

    private StaticRouteModifiedRouteScopeArgs(StaticRouteModifiedRouteScopeArgs $) {
        this.coloNames = $.coloNames;
        this.coloRegions = $.coloRegions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StaticRouteModifiedRouteScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StaticRouteModifiedRouteScopeArgs $;

        public Builder() {
            $ = new StaticRouteModifiedRouteScopeArgs();
        }

        public Builder(StaticRouteModifiedRouteScopeArgs defaults) {
            $ = new StaticRouteModifiedRouteScopeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param coloNames List of colo names for the ECMP scope.
         * 
         * @return builder
         * 
         */
        public Builder coloNames(@Nullable Output<List<String>> coloNames) {
            $.coloNames = coloNames;
            return this;
        }

        /**
         * @param coloNames List of colo names for the ECMP scope.
         * 
         * @return builder
         * 
         */
        public Builder coloNames(List<String> coloNames) {
            return coloNames(Output.of(coloNames));
        }

        /**
         * @param coloNames List of colo names for the ECMP scope.
         * 
         * @return builder
         * 
         */
        public Builder coloNames(String... coloNames) {
            return coloNames(List.of(coloNames));
        }

        /**
         * @param coloRegions List of colo regions for the ECMP scope.
         * 
         * @return builder
         * 
         */
        public Builder coloRegions(@Nullable Output<List<String>> coloRegions) {
            $.coloRegions = coloRegions;
            return this;
        }

        /**
         * @param coloRegions List of colo regions for the ECMP scope.
         * 
         * @return builder
         * 
         */
        public Builder coloRegions(List<String> coloRegions) {
            return coloRegions(Output.of(coloRegions));
        }

        /**
         * @param coloRegions List of colo regions for the ECMP scope.
         * 
         * @return builder
         * 
         */
        public Builder coloRegions(String... coloRegions) {
            return coloRegions(List.of(coloRegions));
        }

        public StaticRouteModifiedRouteScopeArgs build() {
            return $;
        }
    }

}
