// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ZeroTrustRiskBehaviorBehaviorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustRiskBehaviorBehaviorArgs Empty = new ZeroTrustRiskBehaviorBehaviorArgs();

    /**
     * Whether this risk behavior type is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether this risk behavior type is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Name of this risk behavior type
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of this risk behavior type
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Risk level. Available values: `low`, `medium`, `high`
     * 
     */
    @Import(name="riskLevel", required=true)
    private Output<String> riskLevel;

    /**
     * @return Risk level. Available values: `low`, `medium`, `high`
     * 
     */
    public Output<String> riskLevel() {
        return this.riskLevel;
    }

    private ZeroTrustRiskBehaviorBehaviorArgs() {}

    private ZeroTrustRiskBehaviorBehaviorArgs(ZeroTrustRiskBehaviorBehaviorArgs $) {
        this.enabled = $.enabled;
        this.name = $.name;
        this.riskLevel = $.riskLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustRiskBehaviorBehaviorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustRiskBehaviorBehaviorArgs $;

        public Builder() {
            $ = new ZeroTrustRiskBehaviorBehaviorArgs();
        }

        public Builder(ZeroTrustRiskBehaviorBehaviorArgs defaults) {
            $ = new ZeroTrustRiskBehaviorBehaviorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether this risk behavior type is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether this risk behavior type is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name Name of this risk behavior type
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of this risk behavior type
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param riskLevel Risk level. Available values: `low`, `medium`, `high`
         * 
         * @return builder
         * 
         */
        public Builder riskLevel(Output<String> riskLevel) {
            $.riskLevel = riskLevel;
            return this;
        }

        /**
         * @param riskLevel Risk level. Available values: `low`, `medium`, `high`
         * 
         * @return builder
         * 
         */
        public Builder riskLevel(String riskLevel) {
            return riskLevel(Output.of(riskLevel));
        }

        public ZeroTrustRiskBehaviorBehaviorArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("ZeroTrustRiskBehaviorBehaviorArgs", "enabled");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ZeroTrustRiskBehaviorBehaviorArgs", "name");
            }
            if ($.riskLevel == null) {
                throw new MissingRequiredPropertyException("ZeroTrustRiskBehaviorBehaviorArgs", "riskLevel");
            }
            return $;
        }
    }

}
