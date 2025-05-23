// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.ZeroTrustRiskBehaviorBehaviorsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class ZeroTrustRiskBehaviorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustRiskBehaviorArgs Empty = new ZeroTrustRiskBehaviorArgs();

    @Import(name="accountId", required=true)
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }

    @Import(name="behaviors", required=true)
    private Output<Map<String,ZeroTrustRiskBehaviorBehaviorsArgs>> behaviors;

    public Output<Map<String,ZeroTrustRiskBehaviorBehaviorsArgs>> behaviors() {
        return this.behaviors;
    }

    private ZeroTrustRiskBehaviorArgs() {}

    private ZeroTrustRiskBehaviorArgs(ZeroTrustRiskBehaviorArgs $) {
        this.accountId = $.accountId;
        this.behaviors = $.behaviors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustRiskBehaviorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustRiskBehaviorArgs $;

        public Builder() {
            $ = new ZeroTrustRiskBehaviorArgs();
        }

        public Builder(ZeroTrustRiskBehaviorArgs defaults) {
            $ = new ZeroTrustRiskBehaviorArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder behaviors(Output<Map<String,ZeroTrustRiskBehaviorBehaviorsArgs>> behaviors) {
            $.behaviors = behaviors;
            return this;
        }

        public Builder behaviors(Map<String,ZeroTrustRiskBehaviorBehaviorsArgs> behaviors) {
            return behaviors(Output.of(behaviors));
        }

        public ZeroTrustRiskBehaviorArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("ZeroTrustRiskBehaviorArgs", "accountId");
            }
            if ($.behaviors == null) {
                throw new MissingRequiredPropertyException("ZeroTrustRiskBehaviorArgs", "behaviors");
            }
            return $;
        }
    }

}
