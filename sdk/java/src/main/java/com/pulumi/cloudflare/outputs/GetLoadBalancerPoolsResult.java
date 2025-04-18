// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetLoadBalancerPoolsResultLoadShedding;
import com.pulumi.cloudflare.outputs.GetLoadBalancerPoolsResultNotificationFilter;
import com.pulumi.cloudflare.outputs.GetLoadBalancerPoolsResultOrigin;
import com.pulumi.cloudflare.outputs.GetLoadBalancerPoolsResultOriginSteering;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLoadBalancerPoolsResult {
    /**
     * @return A list of regions from which to run health checks. Null means every Cloudflare data center.
     * 
     */
    private List<String> checkRegions;
    private String createdOn;
    /**
     * @return A human-readable description of the pool.
     * 
     */
    private String description;
    /**
     * @return This field shows up only if the pool is disabled. This field is set with the time the pool was disabled at.
     * 
     */
    private String disabledAt;
    /**
     * @return Whether to enable (the default) or disable this pool. Disabled pools will not receive traffic and are excluded from health checks. Disabling a pool will cause any load balancers using it to failover to the next pool (if any).
     * 
     */
    private Boolean enabled;
    private String id;
    /**
     * @return The latitude of the data center containing the origins used in this pool in decimal degrees. If this is set, longitude must also be set.
     * 
     */
    private Double latitude;
    /**
     * @return Configures load shedding policies and percentages for the pool.
     * 
     */
    private GetLoadBalancerPoolsResultLoadShedding loadShedding;
    /**
     * @return The longitude of the data center containing the origins used in this pool in decimal degrees. If this is set, latitude must also be set.
     * 
     */
    private Double longitude;
    /**
     * @return The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and will failover to the next available pool.
     * 
     */
    private Integer minimumOrigins;
    private String modifiedOn;
    /**
     * @return The ID of the Monitor to use for checking the health of origins within this pool.
     * 
     */
    private String monitor;
    /**
     * @return A short name (tag) for the pool. Only alphanumeric characters, hyphens, and underscores are allowed.
     * 
     */
    private String name;
    /**
     * @return List of networks where Load Balancer or Pool is enabled.
     * 
     */
    private List<String> networks;
    /**
     * @return This field is now deprecated. It has been moved to Cloudflare&#39;s Centralized Notification service https://developers.cloudflare.com/fundamentals/notifications/. The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list.
     * 
     */
    private String notificationEmail;
    /**
     * @return Filter pool and origin health notifications by resource type or health status. Use null to reset.
     * 
     */
    private GetLoadBalancerPoolsResultNotificationFilter notificationFilter;
    /**
     * @return Configures origin steering for the pool. Controls how origins are selected for new sessions and traffic without session affinity.
     * 
     */
    private GetLoadBalancerPoolsResultOriginSteering originSteering;
    /**
     * @return The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy.
     * 
     */
    private List<GetLoadBalancerPoolsResultOrigin> origins;

    private GetLoadBalancerPoolsResult() {}
    /**
     * @return A list of regions from which to run health checks. Null means every Cloudflare data center.
     * 
     */
    public List<String> checkRegions() {
        return this.checkRegions;
    }
    public String createdOn() {
        return this.createdOn;
    }
    /**
     * @return A human-readable description of the pool.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return This field shows up only if the pool is disabled. This field is set with the time the pool was disabled at.
     * 
     */
    public String disabledAt() {
        return this.disabledAt;
    }
    /**
     * @return Whether to enable (the default) or disable this pool. Disabled pools will not receive traffic and are excluded from health checks. Disabling a pool will cause any load balancers using it to failover to the next pool (if any).
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return The latitude of the data center containing the origins used in this pool in decimal degrees. If this is set, longitude must also be set.
     * 
     */
    public Double latitude() {
        return this.latitude;
    }
    /**
     * @return Configures load shedding policies and percentages for the pool.
     * 
     */
    public GetLoadBalancerPoolsResultLoadShedding loadShedding() {
        return this.loadShedding;
    }
    /**
     * @return The longitude of the data center containing the origins used in this pool in decimal degrees. If this is set, latitude must also be set.
     * 
     */
    public Double longitude() {
        return this.longitude;
    }
    /**
     * @return The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and will failover to the next available pool.
     * 
     */
    public Integer minimumOrigins() {
        return this.minimumOrigins;
    }
    public String modifiedOn() {
        return this.modifiedOn;
    }
    /**
     * @return The ID of the Monitor to use for checking the health of origins within this pool.
     * 
     */
    public String monitor() {
        return this.monitor;
    }
    /**
     * @return A short name (tag) for the pool. Only alphanumeric characters, hyphens, and underscores are allowed.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of networks where Load Balancer or Pool is enabled.
     * 
     */
    public List<String> networks() {
        return this.networks;
    }
    /**
     * @return This field is now deprecated. It has been moved to Cloudflare&#39;s Centralized Notification service https://developers.cloudflare.com/fundamentals/notifications/. The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list.
     * 
     */
    public String notificationEmail() {
        return this.notificationEmail;
    }
    /**
     * @return Filter pool and origin health notifications by resource type or health status. Use null to reset.
     * 
     */
    public GetLoadBalancerPoolsResultNotificationFilter notificationFilter() {
        return this.notificationFilter;
    }
    /**
     * @return Configures origin steering for the pool. Controls how origins are selected for new sessions and traffic without session affinity.
     * 
     */
    public GetLoadBalancerPoolsResultOriginSteering originSteering() {
        return this.originSteering;
    }
    /**
     * @return The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy.
     * 
     */
    public List<GetLoadBalancerPoolsResultOrigin> origins() {
        return this.origins;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerPoolsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> checkRegions;
        private String createdOn;
        private String description;
        private String disabledAt;
        private Boolean enabled;
        private String id;
        private Double latitude;
        private GetLoadBalancerPoolsResultLoadShedding loadShedding;
        private Double longitude;
        private Integer minimumOrigins;
        private String modifiedOn;
        private String monitor;
        private String name;
        private List<String> networks;
        private String notificationEmail;
        private GetLoadBalancerPoolsResultNotificationFilter notificationFilter;
        private GetLoadBalancerPoolsResultOriginSteering originSteering;
        private List<GetLoadBalancerPoolsResultOrigin> origins;
        public Builder() {}
        public Builder(GetLoadBalancerPoolsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkRegions = defaults.checkRegions;
    	      this.createdOn = defaults.createdOn;
    	      this.description = defaults.description;
    	      this.disabledAt = defaults.disabledAt;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.latitude = defaults.latitude;
    	      this.loadShedding = defaults.loadShedding;
    	      this.longitude = defaults.longitude;
    	      this.minimumOrigins = defaults.minimumOrigins;
    	      this.modifiedOn = defaults.modifiedOn;
    	      this.monitor = defaults.monitor;
    	      this.name = defaults.name;
    	      this.networks = defaults.networks;
    	      this.notificationEmail = defaults.notificationEmail;
    	      this.notificationFilter = defaults.notificationFilter;
    	      this.originSteering = defaults.originSteering;
    	      this.origins = defaults.origins;
        }

        @CustomType.Setter
        public Builder checkRegions(List<String> checkRegions) {
            if (checkRegions == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolsResult", "checkRegions");
            }
            this.checkRegions = checkRegions;
            return this;
        }
        public Builder checkRegions(String... checkRegions) {
            return checkRegions(List.of(checkRegions));
        }
        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            if (createdOn == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolsResult", "createdOn");
            }
            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolsResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder disabledAt(String disabledAt) {
            if (disabledAt == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolsResult", "disabledAt");
            }
            this.disabledAt = disabledAt;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolsResult", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder latitude(Double latitude) {
            if (latitude == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolsResult", "latitude");
            }
            this.latitude = latitude;
            return this;
        }
        @CustomType.Setter
        public Builder loadShedding(GetLoadBalancerPoolsResultLoadShedding loadShedding) {
            if (loadShedding == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolsResult", "loadShedding");
            }
            this.loadShedding = loadShedding;
            return this;
        }
        @CustomType.Setter
        public Builder longitude(Double longitude) {
            if (longitude == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolsResult", "longitude");
            }
            this.longitude = longitude;
            return this;
        }
        @CustomType.Setter
        public Builder minimumOrigins(Integer minimumOrigins) {
            if (minimumOrigins == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolsResult", "minimumOrigins");
            }
            this.minimumOrigins = minimumOrigins;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedOn(String modifiedOn) {
            if (modifiedOn == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolsResult", "modifiedOn");
            }
            this.modifiedOn = modifiedOn;
            return this;
        }
        @CustomType.Setter
        public Builder monitor(String monitor) {
            if (monitor == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolsResult", "monitor");
            }
            this.monitor = monitor;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolsResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder networks(List<String> networks) {
            if (networks == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolsResult", "networks");
            }
            this.networks = networks;
            return this;
        }
        public Builder networks(String... networks) {
            return networks(List.of(networks));
        }
        @CustomType.Setter
        public Builder notificationEmail(String notificationEmail) {
            if (notificationEmail == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolsResult", "notificationEmail");
            }
            this.notificationEmail = notificationEmail;
            return this;
        }
        @CustomType.Setter
        public Builder notificationFilter(GetLoadBalancerPoolsResultNotificationFilter notificationFilter) {
            if (notificationFilter == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolsResult", "notificationFilter");
            }
            this.notificationFilter = notificationFilter;
            return this;
        }
        @CustomType.Setter
        public Builder originSteering(GetLoadBalancerPoolsResultOriginSteering originSteering) {
            if (originSteering == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolsResult", "originSteering");
            }
            this.originSteering = originSteering;
            return this;
        }
        @CustomType.Setter
        public Builder origins(List<GetLoadBalancerPoolsResultOrigin> origins) {
            if (origins == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerPoolsResult", "origins");
            }
            this.origins = origins;
            return this;
        }
        public Builder origins(GetLoadBalancerPoolsResultOrigin... origins) {
            return origins(List.of(origins));
        }
        public GetLoadBalancerPoolsResult build() {
            final var _resultValue = new GetLoadBalancerPoolsResult();
            _resultValue.checkRegions = checkRegions;
            _resultValue.createdOn = createdOn;
            _resultValue.description = description;
            _resultValue.disabledAt = disabledAt;
            _resultValue.enabled = enabled;
            _resultValue.id = id;
            _resultValue.latitude = latitude;
            _resultValue.loadShedding = loadShedding;
            _resultValue.longitude = longitude;
            _resultValue.minimumOrigins = minimumOrigins;
            _resultValue.modifiedOn = modifiedOn;
            _resultValue.monitor = monitor;
            _resultValue.name = name;
            _resultValue.networks = networks;
            _resultValue.notificationEmail = notificationEmail;
            _resultValue.notificationFilter = notificationFilter;
            _resultValue.originSteering = originSteering;
            _resultValue.origins = origins;
            return _resultValue;
        }
    }
}
