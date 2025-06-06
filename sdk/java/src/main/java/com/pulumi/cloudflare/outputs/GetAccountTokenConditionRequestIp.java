// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAccountTokenConditionRequestIp {
    /**
     * @return List of IPv4/IPv6 CIDR addresses.
     * 
     */
    private List<String> ins;
    /**
     * @return List of IPv4/IPv6 CIDR addresses.
     * 
     */
    private List<String> notIns;

    private GetAccountTokenConditionRequestIp() {}
    /**
     * @return List of IPv4/IPv6 CIDR addresses.
     * 
     */
    public List<String> ins() {
        return this.ins;
    }
    /**
     * @return List of IPv4/IPv6 CIDR addresses.
     * 
     */
    public List<String> notIns() {
        return this.notIns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountTokenConditionRequestIp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> ins;
        private List<String> notIns;
        public Builder() {}
        public Builder(GetAccountTokenConditionRequestIp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ins = defaults.ins;
    	      this.notIns = defaults.notIns;
        }

        @CustomType.Setter
        public Builder ins(List<String> ins) {
            if (ins == null) {
              throw new MissingRequiredPropertyException("GetAccountTokenConditionRequestIp", "ins");
            }
            this.ins = ins;
            return this;
        }
        public Builder ins(String... ins) {
            return ins(List.of(ins));
        }
        @CustomType.Setter
        public Builder notIns(List<String> notIns) {
            if (notIns == null) {
              throw new MissingRequiredPropertyException("GetAccountTokenConditionRequestIp", "notIns");
            }
            this.notIns = notIns;
            return this;
        }
        public Builder notIns(String... notIns) {
            return notIns(List.of(notIns));
        }
        public GetAccountTokenConditionRequestIp build() {
            final var _resultValue = new GetAccountTokenConditionRequestIp();
            _resultValue.ins = ins;
            _resultValue.notIns = notIns;
            return _resultValue;
        }
    }
}
