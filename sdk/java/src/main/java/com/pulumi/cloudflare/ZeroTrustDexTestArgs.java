// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.ZeroTrustDexTestDataArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ZeroTrustDexTestArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustDexTestArgs Empty = new ZeroTrustDexTestArgs();

    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * The configuration object which contains the details for the WARP client to conduct the test.
     * 
     */
    @Import(name="data", required=true)
    private Output<ZeroTrustDexTestDataArgs> data;

    /**
     * @return The configuration object which contains the details for the WARP client to conduct the test.
     * 
     */
    public Output<ZeroTrustDexTestDataArgs> data() {
        return this.data;
    }

    /**
     * Additional details about the test.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return Additional details about the test.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * Determines whether or not the test is active.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Determines whether or not the test is active.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * How often the test will run.
     * 
     */
    @Import(name="interval", required=true)
    private Output<String> interval;

    /**
     * @return How often the test will run.
     * 
     */
    public Output<String> interval() {
        return this.interval;
    }

    /**
     * The name of the Device Dex Test. Must be unique.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Device Dex Test. Must be unique.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private ZeroTrustDexTestArgs() {}

    private ZeroTrustDexTestArgs(ZeroTrustDexTestArgs $) {
        this.accountId = $.accountId;
        this.data = $.data;
        this.description = $.description;
        this.enabled = $.enabled;
        this.interval = $.interval;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustDexTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustDexTestArgs $;

        public Builder() {
            $ = new ZeroTrustDexTestArgs();
        }

        public Builder(ZeroTrustDexTestArgs defaults) {
            $ = new ZeroTrustDexTestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param data The configuration object which contains the details for the WARP client to conduct the test.
         * 
         * @return builder
         * 
         */
        public Builder data(Output<ZeroTrustDexTestDataArgs> data) {
            $.data = data;
            return this;
        }

        /**
         * @param data The configuration object which contains the details for the WARP client to conduct the test.
         * 
         * @return builder
         * 
         */
        public Builder data(ZeroTrustDexTestDataArgs data) {
            return data(Output.of(data));
        }

        /**
         * @param description Additional details about the test.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Additional details about the test.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Determines whether or not the test is active.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Determines whether or not the test is active.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param interval How often the test will run.
         * 
         * @return builder
         * 
         */
        public Builder interval(Output<String> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval How often the test will run.
         * 
         * @return builder
         * 
         */
        public Builder interval(String interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param name The name of the Device Dex Test. Must be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Device Dex Test. Must be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ZeroTrustDexTestArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDexTestArgs", "accountId");
            }
            if ($.data == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDexTestArgs", "data");
            }
            if ($.description == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDexTestArgs", "description");
            }
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDexTestArgs", "enabled");
            }
            if ($.interval == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDexTestArgs", "interval");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDexTestArgs", "name");
            }
            return $;
        }
    }

}
