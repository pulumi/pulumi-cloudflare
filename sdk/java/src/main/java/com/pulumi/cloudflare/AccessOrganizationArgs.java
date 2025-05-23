// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.AccessOrganizationCustomPagesArgs;
import com.pulumi.cloudflare.inputs.AccessOrganizationLoginDesignArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessOrganizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessOrganizationArgs Empty = new AccessOrganizationArgs();

    /**
     * The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
     * 
     */
    @Import(name="allowAuthenticateViaWarp")
    private @Nullable Output<Boolean> allowAuthenticateViaWarp;

    /**
     * @return When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
     * 
     */
    public Optional<Output<Boolean>> allowAuthenticateViaWarp() {
        return Optional.ofNullable(this.allowAuthenticateViaWarp);
    }

    /**
     * The unique subdomain assigned to your Zero Trust organization.
     * 
     */
    @Import(name="authDomain")
    private @Nullable Output<String> authDomain;

    /**
     * @return The unique subdomain assigned to your Zero Trust organization.
     * 
     */
    public Optional<Output<String>> authDomain() {
        return Optional.ofNullable(this.authDomain);
    }

    /**
     * When set to `true`, users skip the identity provider selection step during login.
     * 
     */
    @Import(name="autoRedirectToIdentity")
    private @Nullable Output<Boolean> autoRedirectToIdentity;

    /**
     * @return When set to `true`, users skip the identity provider selection step during login.
     * 
     */
    public Optional<Output<Boolean>> autoRedirectToIdentity() {
        return Optional.ofNullable(this.autoRedirectToIdentity);
    }

    @Import(name="customPages")
    private @Nullable Output<AccessOrganizationCustomPagesArgs> customPages;

    public Optional<Output<AccessOrganizationCustomPagesArgs>> customPages() {
        return Optional.ofNullable(this.customPages);
    }

    @Import(name="isUiReadOnly")
    private @Nullable Output<Boolean> isUiReadOnly;

    public Optional<Output<Boolean>> isUiReadOnly() {
        return Optional.ofNullable(this.isUiReadOnly);
    }

    @Import(name="loginDesign")
    private @Nullable Output<AccessOrganizationLoginDesignArgs> loginDesign;

    public Optional<Output<AccessOrganizationLoginDesignArgs>> loginDesign() {
        return Optional.ofNullable(this.loginDesign);
    }

    /**
     * The name of your Zero Trust organization.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of your Zero Trust organization.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The amount of time that tokens issued for applications will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
     * 
     */
    @Import(name="sessionDuration")
    private @Nullable Output<String> sessionDuration;

    /**
     * @return The amount of time that tokens issued for applications will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
     * 
     */
    public Optional<Output<String>> sessionDuration() {
        return Optional.ofNullable(this.sessionDuration);
    }

    /**
     * A description of the reason why the UI read only field is being toggled.
     * 
     */
    @Import(name="uiReadOnlyToggleReason")
    private @Nullable Output<String> uiReadOnlyToggleReason;

    /**
     * @return A description of the reason why the UI read only field is being toggled.
     * 
     */
    public Optional<Output<String>> uiReadOnlyToggleReason() {
        return Optional.ofNullable(this.uiReadOnlyToggleReason);
    }

    /**
     * The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count.  Minimum value for this setting is 1 month (730h). Must be in the format `300ms` or `2h45m`. Valid time units are: `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`.
     * 
     */
    @Import(name="userSeatExpirationInactiveTime")
    private @Nullable Output<String> userSeatExpirationInactiveTime;

    /**
     * @return The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count.  Minimum value for this setting is 1 month (730h). Must be in the format `300ms` or `2h45m`. Valid time units are: `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`.
     * 
     */
    public Optional<Output<String>> userSeatExpirationInactiveTime() {
        return Optional.ofNullable(this.userSeatExpirationInactiveTime);
    }

    /**
     * The amount of time that tokens issued for applications will be valid. Must be in the format `30m` or `2h45m`. Valid time units are: m, h.
     * 
     */
    @Import(name="warpAuthSessionDuration")
    private @Nullable Output<String> warpAuthSessionDuration;

    /**
     * @return The amount of time that tokens issued for applications will be valid. Must be in the format `30m` or `2h45m`. Valid time units are: m, h.
     * 
     */
    public Optional<Output<String>> warpAuthSessionDuration() {
        return Optional.ofNullable(this.warpAuthSessionDuration);
    }

    /**
     * The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private AccessOrganizationArgs() {}

    private AccessOrganizationArgs(AccessOrganizationArgs $) {
        this.accountId = $.accountId;
        this.allowAuthenticateViaWarp = $.allowAuthenticateViaWarp;
        this.authDomain = $.authDomain;
        this.autoRedirectToIdentity = $.autoRedirectToIdentity;
        this.customPages = $.customPages;
        this.isUiReadOnly = $.isUiReadOnly;
        this.loginDesign = $.loginDesign;
        this.name = $.name;
        this.sessionDuration = $.sessionDuration;
        this.uiReadOnlyToggleReason = $.uiReadOnlyToggleReason;
        this.userSeatExpirationInactiveTime = $.userSeatExpirationInactiveTime;
        this.warpAuthSessionDuration = $.warpAuthSessionDuration;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessOrganizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessOrganizationArgs $;

        public Builder() {
            $ = new AccessOrganizationArgs();
        }

        public Builder(AccessOrganizationArgs defaults) {
            $ = new AccessOrganizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param allowAuthenticateViaWarp When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
         * 
         * @return builder
         * 
         */
        public Builder allowAuthenticateViaWarp(@Nullable Output<Boolean> allowAuthenticateViaWarp) {
            $.allowAuthenticateViaWarp = allowAuthenticateViaWarp;
            return this;
        }

        /**
         * @param allowAuthenticateViaWarp When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
         * 
         * @return builder
         * 
         */
        public Builder allowAuthenticateViaWarp(Boolean allowAuthenticateViaWarp) {
            return allowAuthenticateViaWarp(Output.of(allowAuthenticateViaWarp));
        }

        /**
         * @param authDomain The unique subdomain assigned to your Zero Trust organization.
         * 
         * @return builder
         * 
         */
        public Builder authDomain(@Nullable Output<String> authDomain) {
            $.authDomain = authDomain;
            return this;
        }

        /**
         * @param authDomain The unique subdomain assigned to your Zero Trust organization.
         * 
         * @return builder
         * 
         */
        public Builder authDomain(String authDomain) {
            return authDomain(Output.of(authDomain));
        }

        /**
         * @param autoRedirectToIdentity When set to `true`, users skip the identity provider selection step during login.
         * 
         * @return builder
         * 
         */
        public Builder autoRedirectToIdentity(@Nullable Output<Boolean> autoRedirectToIdentity) {
            $.autoRedirectToIdentity = autoRedirectToIdentity;
            return this;
        }

        /**
         * @param autoRedirectToIdentity When set to `true`, users skip the identity provider selection step during login.
         * 
         * @return builder
         * 
         */
        public Builder autoRedirectToIdentity(Boolean autoRedirectToIdentity) {
            return autoRedirectToIdentity(Output.of(autoRedirectToIdentity));
        }

        public Builder customPages(@Nullable Output<AccessOrganizationCustomPagesArgs> customPages) {
            $.customPages = customPages;
            return this;
        }

        public Builder customPages(AccessOrganizationCustomPagesArgs customPages) {
            return customPages(Output.of(customPages));
        }

        public Builder isUiReadOnly(@Nullable Output<Boolean> isUiReadOnly) {
            $.isUiReadOnly = isUiReadOnly;
            return this;
        }

        public Builder isUiReadOnly(Boolean isUiReadOnly) {
            return isUiReadOnly(Output.of(isUiReadOnly));
        }

        public Builder loginDesign(@Nullable Output<AccessOrganizationLoginDesignArgs> loginDesign) {
            $.loginDesign = loginDesign;
            return this;
        }

        public Builder loginDesign(AccessOrganizationLoginDesignArgs loginDesign) {
            return loginDesign(Output.of(loginDesign));
        }

        /**
         * @param name The name of your Zero Trust organization.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of your Zero Trust organization.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sessionDuration The amount of time that tokens issued for applications will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
         * 
         * @return builder
         * 
         */
        public Builder sessionDuration(@Nullable Output<String> sessionDuration) {
            $.sessionDuration = sessionDuration;
            return this;
        }

        /**
         * @param sessionDuration The amount of time that tokens issued for applications will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
         * 
         * @return builder
         * 
         */
        public Builder sessionDuration(String sessionDuration) {
            return sessionDuration(Output.of(sessionDuration));
        }

        /**
         * @param uiReadOnlyToggleReason A description of the reason why the UI read only field is being toggled.
         * 
         * @return builder
         * 
         */
        public Builder uiReadOnlyToggleReason(@Nullable Output<String> uiReadOnlyToggleReason) {
            $.uiReadOnlyToggleReason = uiReadOnlyToggleReason;
            return this;
        }

        /**
         * @param uiReadOnlyToggleReason A description of the reason why the UI read only field is being toggled.
         * 
         * @return builder
         * 
         */
        public Builder uiReadOnlyToggleReason(String uiReadOnlyToggleReason) {
            return uiReadOnlyToggleReason(Output.of(uiReadOnlyToggleReason));
        }

        /**
         * @param userSeatExpirationInactiveTime The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count.  Minimum value for this setting is 1 month (730h). Must be in the format `300ms` or `2h45m`. Valid time units are: `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`.
         * 
         * @return builder
         * 
         */
        public Builder userSeatExpirationInactiveTime(@Nullable Output<String> userSeatExpirationInactiveTime) {
            $.userSeatExpirationInactiveTime = userSeatExpirationInactiveTime;
            return this;
        }

        /**
         * @param userSeatExpirationInactiveTime The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count.  Minimum value for this setting is 1 month (730h). Must be in the format `300ms` or `2h45m`. Valid time units are: `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`.
         * 
         * @return builder
         * 
         */
        public Builder userSeatExpirationInactiveTime(String userSeatExpirationInactiveTime) {
            return userSeatExpirationInactiveTime(Output.of(userSeatExpirationInactiveTime));
        }

        /**
         * @param warpAuthSessionDuration The amount of time that tokens issued for applications will be valid. Must be in the format `30m` or `2h45m`. Valid time units are: m, h.
         * 
         * @return builder
         * 
         */
        public Builder warpAuthSessionDuration(@Nullable Output<String> warpAuthSessionDuration) {
            $.warpAuthSessionDuration = warpAuthSessionDuration;
            return this;
        }

        /**
         * @param warpAuthSessionDuration The amount of time that tokens issued for applications will be valid. Must be in the format `30m` or `2h45m`. Valid time units are: m, h.
         * 
         * @return builder
         * 
         */
        public Builder warpAuthSessionDuration(String warpAuthSessionDuration) {
            return warpAuthSessionDuration(Output.of(warpAuthSessionDuration));
        }

        /**
         * @param zoneId The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public AccessOrganizationArgs build() {
            return $;
        }
    }

}
