// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.ZeroTrustDlpCustomProfileProfileContextAwarenessSkip;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ZeroTrustDlpCustomProfileProfileContextAwareness {
    /**
     * @return If true, scan the context of predefined entries to only return matches surrounded by keywords.
     * 
     */
    private Boolean enabled;
    /**
     * @return Content types to exclude from context analysis and return all matches.
     * 
     */
    private ZeroTrustDlpCustomProfileProfileContextAwarenessSkip skip;

    private ZeroTrustDlpCustomProfileProfileContextAwareness() {}
    /**
     * @return If true, scan the context of predefined entries to only return matches surrounded by keywords.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Content types to exclude from context analysis and return all matches.
     * 
     */
    public ZeroTrustDlpCustomProfileProfileContextAwarenessSkip skip() {
        return this.skip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustDlpCustomProfileProfileContextAwareness defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private ZeroTrustDlpCustomProfileProfileContextAwarenessSkip skip;
        public Builder() {}
        public Builder(ZeroTrustDlpCustomProfileProfileContextAwareness defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.skip = defaults.skip;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("ZeroTrustDlpCustomProfileProfileContextAwareness", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder skip(ZeroTrustDlpCustomProfileProfileContextAwarenessSkip skip) {
            if (skip == null) {
              throw new MissingRequiredPropertyException("ZeroTrustDlpCustomProfileProfileContextAwareness", "skip");
            }
            this.skip = skip;
            return this;
        }
        public ZeroTrustDlpCustomProfileProfileContextAwareness build() {
            final var _resultValue = new ZeroTrustDlpCustomProfileProfileContextAwareness();
            _resultValue.enabled = enabled;
            _resultValue.skip = skip;
            return _resultValue;
        }
    }
}
