// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZoneSettingResult {
    /**
     * @return Whether or not this setting can be modified for this zone (based on your Cloudflare plan level).
     * 
     */
    private Boolean editable;
    /**
     * @return ssl-recommender enrollment setting.
     * 
     */
    private Boolean enabled;
    /**
     * @return ID of the zone setting.
     * Available values: &#34;0rtt&#34;, &#34;advanced*ddos&#34;, &#34;aegis&#34;, &#34;always*online&#34;, &#34;always*use*https&#34;, &#34;automatic*https*rewrites&#34;, &#34;brotli&#34;, &#34;browser*cache*ttl&#34;, &#34;browser*check&#34;, &#34;cache*level&#34;, &#34;challenge*ttl&#34;, &#34;china*network*enabled&#34;, &#34;ciphers&#34;, &#34;cname*flattening&#34;, &#34;development*mode&#34;, &#34;early*hints&#34;, &#34;edge*cache*ttl&#34;, &#34;email*obfuscation&#34;, &#34;h2*prioritization&#34;, &#34;hotlink*protection&#34;, &#34;http2&#34;, &#34;http3&#34;, &#34;image*resizing&#34;, &#34;ip*geolocation&#34;, &#34;ipv6&#34;, &#34;max*upload&#34;, &#34;min*tls*version&#34;, &#34;mirage&#34;, &#34;nel&#34;, &#34;opportunistic*encryption&#34;, &#34;opportunistic*onion&#34;, &#34;orange*to*orange&#34;, &#34;origin*error*page*pass*thru&#34;, &#34;origin*h2*max*streams&#34;, &#34;origin*max*http*version&#34;, &#34;polish&#34;, &#34;prefetch*preload&#34;, &#34;privacy*pass&#34;, &#34;proxy*read*timeout&#34;, &#34;pseudo*ipv4&#34;, &#34;replace*insecure*js&#34;, &#34;response*buffering&#34;, &#34;rocket*loader&#34;, &#34;automatic*platform*optimization&#34;, &#34;security*header&#34;, &#34;security*level&#34;, &#34;server*side*exclude&#34;, &#34;sha1*support&#34;, &#34;sort*query*string*for*cache&#34;, &#34;ssl&#34;, &#34;ssl*recommender&#34;, &#34;tls*1*2*only&#34;, &#34;tls*1*3&#34;, &#34;tls*client*auth&#34;, &#34;transformations&#34;, &#34;transformations*allowed*origins&#34;, &#34;true*client*ip_header&#34;, &#34;waf&#34;, &#34;webp&#34;, &#34;websockets&#34;.
     * 
     */
    private String id;
    /**
     * @return last time this setting was modified.
     * 
     */
    private String modifiedOn;
    /**
     * @return Setting name
     * 
     */
    private String settingId;
    /**
     * @return Value of the zone setting.
     * Notes: The interval (in seconds) from when development mode expires (positive integer) or last expired (negative integer) for the domain. If development mode has never been enabled, this value is false.
     * 
     */
    private Double timeRemaining;
    /**
     * @return Current value of the zone setting.
     * Available values: &#34;on&#34;, &#34;off&#34;.
     * 
     */
    private String value;
    /**
     * @return Identifier
     * 
     */
    private String zoneId;

    private GetZoneSettingResult() {}
    /**
     * @return Whether or not this setting can be modified for this zone (based on your Cloudflare plan level).
     * 
     */
    public Boolean editable() {
        return this.editable;
    }
    /**
     * @return ssl-recommender enrollment setting.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return ID of the zone setting.
     * Available values: &#34;0rtt&#34;, &#34;advanced*ddos&#34;, &#34;aegis&#34;, &#34;always*online&#34;, &#34;always*use*https&#34;, &#34;automatic*https*rewrites&#34;, &#34;brotli&#34;, &#34;browser*cache*ttl&#34;, &#34;browser*check&#34;, &#34;cache*level&#34;, &#34;challenge*ttl&#34;, &#34;china*network*enabled&#34;, &#34;ciphers&#34;, &#34;cname*flattening&#34;, &#34;development*mode&#34;, &#34;early*hints&#34;, &#34;edge*cache*ttl&#34;, &#34;email*obfuscation&#34;, &#34;h2*prioritization&#34;, &#34;hotlink*protection&#34;, &#34;http2&#34;, &#34;http3&#34;, &#34;image*resizing&#34;, &#34;ip*geolocation&#34;, &#34;ipv6&#34;, &#34;max*upload&#34;, &#34;min*tls*version&#34;, &#34;mirage&#34;, &#34;nel&#34;, &#34;opportunistic*encryption&#34;, &#34;opportunistic*onion&#34;, &#34;orange*to*orange&#34;, &#34;origin*error*page*pass*thru&#34;, &#34;origin*h2*max*streams&#34;, &#34;origin*max*http*version&#34;, &#34;polish&#34;, &#34;prefetch*preload&#34;, &#34;privacy*pass&#34;, &#34;proxy*read*timeout&#34;, &#34;pseudo*ipv4&#34;, &#34;replace*insecure*js&#34;, &#34;response*buffering&#34;, &#34;rocket*loader&#34;, &#34;automatic*platform*optimization&#34;, &#34;security*header&#34;, &#34;security*level&#34;, &#34;server*side*exclude&#34;, &#34;sha1*support&#34;, &#34;sort*query*string*for*cache&#34;, &#34;ssl&#34;, &#34;ssl*recommender&#34;, &#34;tls*1*2*only&#34;, &#34;tls*1*3&#34;, &#34;tls*client*auth&#34;, &#34;transformations&#34;, &#34;transformations*allowed*origins&#34;, &#34;true*client*ip_header&#34;, &#34;waf&#34;, &#34;webp&#34;, &#34;websockets&#34;.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return last time this setting was modified.
     * 
     */
    public String modifiedOn() {
        return this.modifiedOn;
    }
    /**
     * @return Setting name
     * 
     */
    public String settingId() {
        return this.settingId;
    }
    /**
     * @return Value of the zone setting.
     * Notes: The interval (in seconds) from when development mode expires (positive integer) or last expired (negative integer) for the domain. If development mode has never been enabled, this value is false.
     * 
     */
    public Double timeRemaining() {
        return this.timeRemaining;
    }
    /**
     * @return Current value of the zone setting.
     * Available values: &#34;on&#34;, &#34;off&#34;.
     * 
     */
    public String value() {
        return this.value;
    }
    /**
     * @return Identifier
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZoneSettingResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean editable;
        private Boolean enabled;
        private String id;
        private String modifiedOn;
        private String settingId;
        private Double timeRemaining;
        private String value;
        private String zoneId;
        public Builder() {}
        public Builder(GetZoneSettingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.editable = defaults.editable;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.modifiedOn = defaults.modifiedOn;
    	      this.settingId = defaults.settingId;
    	      this.timeRemaining = defaults.timeRemaining;
    	      this.value = defaults.value;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder editable(Boolean editable) {
            if (editable == null) {
              throw new MissingRequiredPropertyException("GetZoneSettingResult", "editable");
            }
            this.editable = editable;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetZoneSettingResult", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZoneSettingResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedOn(String modifiedOn) {
            if (modifiedOn == null) {
              throw new MissingRequiredPropertyException("GetZoneSettingResult", "modifiedOn");
            }
            this.modifiedOn = modifiedOn;
            return this;
        }
        @CustomType.Setter
        public Builder settingId(String settingId) {
            if (settingId == null) {
              throw new MissingRequiredPropertyException("GetZoneSettingResult", "settingId");
            }
            this.settingId = settingId;
            return this;
        }
        @CustomType.Setter
        public Builder timeRemaining(Double timeRemaining) {
            if (timeRemaining == null) {
              throw new MissingRequiredPropertyException("GetZoneSettingResult", "timeRemaining");
            }
            this.timeRemaining = timeRemaining;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetZoneSettingResult", "value");
            }
            this.value = value;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("GetZoneSettingResult", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        public GetZoneSettingResult build() {
            final var _resultValue = new GetZoneSettingResult();
            _resultValue.editable = editable;
            _resultValue.enabled = enabled;
            _resultValue.id = id;
            _resultValue.modifiedOn = modifiedOn;
            _resultValue.settingId = settingId;
            _resultValue.timeRemaining = timeRemaining;
            _resultValue.value = value;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
