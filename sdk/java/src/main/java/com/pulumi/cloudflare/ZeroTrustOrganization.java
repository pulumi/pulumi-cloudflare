// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.ZeroTrustOrganizationArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustOrganizationState;
import com.pulumi.cloudflare.outputs.ZeroTrustOrganizationCustomPages;
import com.pulumi.cloudflare.outputs.ZeroTrustOrganizationLoginDesign;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="cloudflare:index/zeroTrustOrganization:ZeroTrustOrganization")
public class ZeroTrustOrganization extends com.pulumi.resources.CustomResource {
    /**
     * The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountId;

    /**
     * @return The Account ID to use for this endpoint. Mutually exclusive with the Zone ID.
     * 
     */
    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    /**
     * When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
     * 
     */
    @Export(name="allowAuthenticateViaWarp", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowAuthenticateViaWarp;

    /**
     * @return When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
     * 
     */
    public Output<Optional<Boolean>> allowAuthenticateViaWarp() {
        return Codegen.optional(this.allowAuthenticateViaWarp);
    }
    /**
     * The unique subdomain assigned to your Zero Trust organization.
     * 
     */
    @Export(name="authDomain", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authDomain;

    /**
     * @return The unique subdomain assigned to your Zero Trust organization.
     * 
     */
    public Output<Optional<String>> authDomain() {
        return Codegen.optional(this.authDomain);
    }
    /**
     * When set to `true`, users skip the identity provider selection step during login.
     * 
     */
    @Export(name="autoRedirectToIdentity", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> autoRedirectToIdentity;

    /**
     * @return When set to `true`, users skip the identity provider selection step during login.
     * 
     */
    public Output<Boolean> autoRedirectToIdentity() {
        return this.autoRedirectToIdentity;
    }
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt;
    }
    @Export(name="customPages", refs={ZeroTrustOrganizationCustomPages.class}, tree="[0]")
    private Output</* @Nullable */ ZeroTrustOrganizationCustomPages> customPages;

    public Output<Optional<ZeroTrustOrganizationCustomPages>> customPages() {
        return Codegen.optional(this.customPages);
    }
    @Export(name="isUiReadOnly", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isUiReadOnly;

    public Output<Optional<Boolean>> isUiReadOnly() {
        return Codegen.optional(this.isUiReadOnly);
    }
    @Export(name="loginDesign", refs={ZeroTrustOrganizationLoginDesign.class}, tree="[0]")
    private Output</* @Nullable */ ZeroTrustOrganizationLoginDesign> loginDesign;

    public Output<Optional<ZeroTrustOrganizationLoginDesign>> loginDesign() {
        return Codegen.optional(this.loginDesign);
    }
    /**
     * The name of your Zero Trust organization.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of your Zero Trust organization.
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * The amount of time that tokens issued for applications will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
     * 
     */
    @Export(name="sessionDuration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sessionDuration;

    /**
     * @return The amount of time that tokens issued for applications will be valid. Must be in the format `300ms` or `2h45m`. Valid time units are: ns, us (or µs), ms, s, m, h.
     * 
     */
    public Output<Optional<String>> sessionDuration() {
        return Codegen.optional(this.sessionDuration);
    }
    /**
     * A description of the reason why the UI read only field is being toggled.
     * 
     */
    @Export(name="uiReadOnlyToggleReason", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> uiReadOnlyToggleReason;

    /**
     * @return A description of the reason why the UI read only field is being toggled.
     * 
     */
    public Output<Optional<String>> uiReadOnlyToggleReason() {
        return Codegen.optional(this.uiReadOnlyToggleReason);
    }
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    public Output<String> updatedAt() {
        return this.updatedAt;
    }
    /**
     * The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count.  Minimum value for this setting is 1 month (730h). Must be in the format `300ms` or `2h45m`. Valid time units are: `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`.
     * 
     */
    @Export(name="userSeatExpirationInactiveTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userSeatExpirationInactiveTime;

    /**
     * @return The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count.  Minimum value for this setting is 1 month (730h). Must be in the format `300ms` or `2h45m`. Valid time units are: `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`.
     * 
     */
    public Output<Optional<String>> userSeatExpirationInactiveTime() {
        return Codegen.optional(this.userSeatExpirationInactiveTime);
    }
    /**
     * The amount of time that tokens issued for applications will be valid. Must be in the format `30m` or `2h45m`. Valid time units are: m, h.
     * 
     */
    @Export(name="warpAuthSessionDuration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> warpAuthSessionDuration;

    /**
     * @return The amount of time that tokens issued for applications will be valid. Must be in the format `30m` or `2h45m`. Valid time units are: m, h.
     * 
     */
    public Output<Optional<String>> warpAuthSessionDuration() {
        return Codegen.optional(this.warpAuthSessionDuration);
    }
    /**
     * The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> zoneId;

    /**
     * @return The Zone ID to use for this endpoint. Mutually exclusive with the Account ID.
     * 
     */
    public Output<Optional<String>> zoneId() {
        return Codegen.optional(this.zoneId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ZeroTrustOrganization(java.lang.String name) {
        this(name, ZeroTrustOrganizationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ZeroTrustOrganization(java.lang.String name, @Nullable ZeroTrustOrganizationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ZeroTrustOrganization(java.lang.String name, @Nullable ZeroTrustOrganizationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustOrganization:ZeroTrustOrganization", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ZeroTrustOrganization(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustOrganizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustOrganization:ZeroTrustOrganization", name, state, makeResourceOptions(options, id), false);
    }

    private static ZeroTrustOrganizationArgs makeArgs(@Nullable ZeroTrustOrganizationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ZeroTrustOrganizationArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("cloudflare:index/accessOrganization:AccessOrganization").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ZeroTrustOrganization get(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustOrganizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ZeroTrustOrganization(name, id, state, options);
    }
}
