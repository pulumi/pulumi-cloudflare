// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWaitingRoomSettingsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone.
     * Verified search engine crawlers will not be tracked or counted by the waiting room system,
     * and will not appear in waiting room analytics.
     * 
     */
    private Boolean searchEngineCrawlerBypass;
    /**
     * @return Identifier.
     * 
     */
    private String zoneId;

    private GetWaitingRoomSettingsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone.
     * Verified search engine crawlers will not be tracked or counted by the waiting room system,
     * and will not appear in waiting room analytics.
     * 
     */
    public Boolean searchEngineCrawlerBypass() {
        return this.searchEngineCrawlerBypass;
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

    public static Builder builder(GetWaitingRoomSettingsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private Boolean searchEngineCrawlerBypass;
        private String zoneId;
        public Builder() {}
        public Builder(GetWaitingRoomSettingsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.searchEngineCrawlerBypass = defaults.searchEngineCrawlerBypass;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWaitingRoomSettingsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder searchEngineCrawlerBypass(Boolean searchEngineCrawlerBypass) {
            if (searchEngineCrawlerBypass == null) {
              throw new MissingRequiredPropertyException("GetWaitingRoomSettingsResult", "searchEngineCrawlerBypass");
            }
            this.searchEngineCrawlerBypass = searchEngineCrawlerBypass;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("GetWaitingRoomSettingsResult", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        public GetWaitingRoomSettingsResult build() {
            final var _resultValue = new GetWaitingRoomSettingsResult();
            _resultValue.id = id;
            _resultValue.searchEngineCrawlerBypass = searchEngineCrawlerBypass;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
