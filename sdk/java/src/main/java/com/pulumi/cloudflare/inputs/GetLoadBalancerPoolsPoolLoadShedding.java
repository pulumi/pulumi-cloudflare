// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLoadBalancerPoolsPoolLoadShedding extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancerPoolsPoolLoadShedding Empty = new GetLoadBalancerPoolsPoolLoadShedding();

    @Import(name="defaultPercent")
    private @Nullable Double defaultPercent;

    public Optional<Double> defaultPercent() {
        return Optional.ofNullable(this.defaultPercent);
    }

    @Import(name="defaultPolicy")
    private @Nullable String defaultPolicy;

    public Optional<String> defaultPolicy() {
        return Optional.ofNullable(this.defaultPolicy);
    }

    @Import(name="sessionPercent")
    private @Nullable Double sessionPercent;

    public Optional<Double> sessionPercent() {
        return Optional.ofNullable(this.sessionPercent);
    }

    @Import(name="sessionPolicy")
    private @Nullable String sessionPolicy;

    public Optional<String> sessionPolicy() {
        return Optional.ofNullable(this.sessionPolicy);
    }

    private GetLoadBalancerPoolsPoolLoadShedding() {}

    private GetLoadBalancerPoolsPoolLoadShedding(GetLoadBalancerPoolsPoolLoadShedding $) {
        this.defaultPercent = $.defaultPercent;
        this.defaultPolicy = $.defaultPolicy;
        this.sessionPercent = $.sessionPercent;
        this.sessionPolicy = $.sessionPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoadBalancerPoolsPoolLoadShedding defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadBalancerPoolsPoolLoadShedding $;

        public Builder() {
            $ = new GetLoadBalancerPoolsPoolLoadShedding();
        }

        public Builder(GetLoadBalancerPoolsPoolLoadShedding defaults) {
            $ = new GetLoadBalancerPoolsPoolLoadShedding(Objects.requireNonNull(defaults));
        }

        public Builder defaultPercent(@Nullable Double defaultPercent) {
            $.defaultPercent = defaultPercent;
            return this;
        }

        public Builder defaultPolicy(@Nullable String defaultPolicy) {
            $.defaultPolicy = defaultPolicy;
            return this;
        }

        public Builder sessionPercent(@Nullable Double sessionPercent) {
            $.sessionPercent = sessionPercent;
            return this;
        }

        public Builder sessionPolicy(@Nullable String sessionPolicy) {
            $.sessionPolicy = sessionPolicy;
            return this;
        }

        public GetLoadBalancerPoolsPoolLoadShedding build() {
            return $;
        }
    }

}