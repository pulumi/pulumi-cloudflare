// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWaitingRoomRulesResult {
    /**
     * @return The action to take when the expression matches.
     * Available values: &#34;bypass*waiting*room&#34;.
     * 
     */
    private String action;
    /**
     * @return The description of the rule.
     * 
     */
    private String description;
    /**
     * @return When set to true, the rule is enabled.
     * 
     */
    private Boolean enabled;
    /**
     * @return Criteria defining when there is a match for the current rule.
     * 
     */
    private String expression;
    /**
     * @return The ID of the rule.
     * 
     */
    private String id;
    private String lastUpdated;
    /**
     * @return The version of the rule.
     * 
     */
    private String version;
    private String waitingRoomId;
    /**
     * @return Identifier.
     * 
     */
    private String zoneId;

    private GetWaitingRoomRulesResult() {}
    /**
     * @return The action to take when the expression matches.
     * Available values: &#34;bypass*waiting*room&#34;.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return The description of the rule.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return When set to true, the rule is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Criteria defining when there is a match for the current rule.
     * 
     */
    public String expression() {
        return this.expression;
    }
    /**
     * @return The ID of the rule.
     * 
     */
    public String id() {
        return this.id;
    }
    public String lastUpdated() {
        return this.lastUpdated;
    }
    /**
     * @return The version of the rule.
     * 
     */
    public String version() {
        return this.version;
    }
    public String waitingRoomId() {
        return this.waitingRoomId;
    }
    /**
     * @return Identifier.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWaitingRoomRulesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private String description;
        private Boolean enabled;
        private String expression;
        private String id;
        private String lastUpdated;
        private String version;
        private String waitingRoomId;
        private String zoneId;
        public Builder() {}
        public Builder(GetWaitingRoomRulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.expression = defaults.expression;
    	      this.id = defaults.id;
    	      this.lastUpdated = defaults.lastUpdated;
    	      this.version = defaults.version;
    	      this.waitingRoomId = defaults.waitingRoomId;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("GetWaitingRoomRulesResult", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetWaitingRoomRulesResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetWaitingRoomRulesResult", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder expression(String expression) {
            if (expression == null) {
              throw new MissingRequiredPropertyException("GetWaitingRoomRulesResult", "expression");
            }
            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWaitingRoomRulesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder lastUpdated(String lastUpdated) {
            if (lastUpdated == null) {
              throw new MissingRequiredPropertyException("GetWaitingRoomRulesResult", "lastUpdated");
            }
            this.lastUpdated = lastUpdated;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetWaitingRoomRulesResult", "version");
            }
            this.version = version;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomId(String waitingRoomId) {
            if (waitingRoomId == null) {
              throw new MissingRequiredPropertyException("GetWaitingRoomRulesResult", "waitingRoomId");
            }
            this.waitingRoomId = waitingRoomId;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("GetWaitingRoomRulesResult", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        public GetWaitingRoomRulesResult build() {
            final var _resultValue = new GetWaitingRoomRulesResult();
            _resultValue.action = action;
            _resultValue.description = description;
            _resultValue.enabled = enabled;
            _resultValue.expression = expression;
            _resultValue.id = id;
            _resultValue.lastUpdated = lastUpdated;
            _resultValue.version = version;
            _resultValue.waitingRoomId = waitingRoomId;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
