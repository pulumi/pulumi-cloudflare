// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetLoadBalancerPoolsPoolOriginHeader extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancerPoolsPoolOriginHeader Empty = new GetLoadBalancerPoolsPoolOriginHeader();

    @Import(name="header", required=true)
    private String header;

    public String header() {
        return this.header;
    }

    @Import(name="values", required=true)
    private List<String> values;

    public List<String> values() {
        return this.values;
    }

    private GetLoadBalancerPoolsPoolOriginHeader() {}

    private GetLoadBalancerPoolsPoolOriginHeader(GetLoadBalancerPoolsPoolOriginHeader $) {
        this.header = $.header;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoadBalancerPoolsPoolOriginHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadBalancerPoolsPoolOriginHeader $;

        public Builder() {
            $ = new GetLoadBalancerPoolsPoolOriginHeader();
        }

        public Builder(GetLoadBalancerPoolsPoolOriginHeader defaults) {
            $ = new GetLoadBalancerPoolsPoolOriginHeader(Objects.requireNonNull(defaults));
        }

        public Builder header(String header) {
            $.header = header;
            return this;
        }

        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetLoadBalancerPoolsPoolOriginHeader build() {
            $.header = Objects.requireNonNull($.header, "expected parameter 'header' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}