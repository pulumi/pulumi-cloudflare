// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class GetQueueSettings {
    /**
     * @return Number of seconds to delay delivery of all messages to consumers.
     * 
     */
    private Double deliveryDelay;
    /**
     * @return Indicates if message delivery to consumers is currently paused.
     * 
     */
    private Boolean deliveryPaused;
    /**
     * @return Number of seconds after which an unconsumed message will be delayed.
     * 
     */
    private Double messageRetentionPeriod;

    private GetQueueSettings() {}
    /**
     * @return Number of seconds to delay delivery of all messages to consumers.
     * 
     */
    public Double deliveryDelay() {
        return this.deliveryDelay;
    }
    /**
     * @return Indicates if message delivery to consumers is currently paused.
     * 
     */
    public Boolean deliveryPaused() {
        return this.deliveryPaused;
    }
    /**
     * @return Number of seconds after which an unconsumed message will be delayed.
     * 
     */
    public Double messageRetentionPeriod() {
        return this.messageRetentionPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueueSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double deliveryDelay;
        private Boolean deliveryPaused;
        private Double messageRetentionPeriod;
        public Builder() {}
        public Builder(GetQueueSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryDelay = defaults.deliveryDelay;
    	      this.deliveryPaused = defaults.deliveryPaused;
    	      this.messageRetentionPeriod = defaults.messageRetentionPeriod;
        }

        @CustomType.Setter
        public Builder deliveryDelay(Double deliveryDelay) {
            if (deliveryDelay == null) {
              throw new MissingRequiredPropertyException("GetQueueSettings", "deliveryDelay");
            }
            this.deliveryDelay = deliveryDelay;
            return this;
        }
        @CustomType.Setter
        public Builder deliveryPaused(Boolean deliveryPaused) {
            if (deliveryPaused == null) {
              throw new MissingRequiredPropertyException("GetQueueSettings", "deliveryPaused");
            }
            this.deliveryPaused = deliveryPaused;
            return this;
        }
        @CustomType.Setter
        public Builder messageRetentionPeriod(Double messageRetentionPeriod) {
            if (messageRetentionPeriod == null) {
              throw new MissingRequiredPropertyException("GetQueueSettings", "messageRetentionPeriod");
            }
            this.messageRetentionPeriod = messageRetentionPeriod;
            return this;
        }
        public GetQueueSettings build() {
            final var _resultValue = new GetQueueSettings();
            _resultValue.deliveryDelay = deliveryDelay;
            _resultValue.deliveryPaused = deliveryPaused;
            _resultValue.messageRetentionPeriod = messageRetentionPeriod;
            return _resultValue;
        }
    }
}
