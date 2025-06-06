// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.AuthenticatedOriginPullsArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.AuthenticatedOriginPullsState;
import com.pulumi.cloudflare.outputs.AuthenticatedOriginPullsConfig;
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
@ResourceType(type="cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls")
public class AuthenticatedOriginPulls extends com.pulumi.resources.CustomResource {
    /**
     * Identifier.
     * 
     */
    @Export(name="certId", refs={String.class}, tree="[0]")
    private Output<String> certId;

    /**
     * @return Identifier.
     * 
     */
    public Output<String> certId() {
        return this.certId;
    }
    /**
     * Status of the certificate or the association.
     * Available values: &#34;initializing&#34;, &#34;pending*deployment&#34;, &#34;pending*deletion&#34;, &#34;active&#34;, &#34;deleted&#34;, &#34;deployment*timed*out&#34;, &#34;deletion*timed*out&#34;.
     * 
     */
    @Export(name="certStatus", refs={String.class}, tree="[0]")
    private Output<String> certStatus;

    /**
     * @return Status of the certificate or the association.
     * Available values: &#34;initializing&#34;, &#34;pending*deployment&#34;, &#34;pending*deletion&#34;, &#34;active&#34;, &#34;deleted&#34;, &#34;deployment*timed*out&#34;, &#34;deletion*timed*out&#34;.
     * 
     */
    public Output<String> certStatus() {
        return this.certStatus;
    }
    /**
     * The time when the certificate was updated.
     * 
     */
    @Export(name="certUpdatedAt", refs={String.class}, tree="[0]")
    private Output<String> certUpdatedAt;

    /**
     * @return The time when the certificate was updated.
     * 
     */
    public Output<String> certUpdatedAt() {
        return this.certUpdatedAt;
    }
    /**
     * The time when the certificate was uploaded.
     * 
     */
    @Export(name="certUploadedOn", refs={String.class}, tree="[0]")
    private Output<String> certUploadedOn;

    /**
     * @return The time when the certificate was uploaded.
     * 
     */
    public Output<String> certUploadedOn() {
        return this.certUploadedOn;
    }
    /**
     * The hostname certificate.
     * 
     */
    @Export(name="certificate", refs={String.class}, tree="[0]")
    private Output<String> certificate;

    /**
     * @return The hostname certificate.
     * 
     */
    public Output<String> certificate() {
        return this.certificate;
    }
    @Export(name="configs", refs={List.class,AuthenticatedOriginPullsConfig.class}, tree="[0,1]")
    private Output<List<AuthenticatedOriginPullsConfig>> configs;

    public Output<List<AuthenticatedOriginPullsConfig>> configs() {
        return this.configs;
    }
    /**
     * The time when the certificate was created.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return The time when the certificate was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Indicates whether hostname-level authenticated origin pulls is enabled. A null value voids the association.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Indicates whether hostname-level authenticated origin pulls is enabled. A null value voids the association.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * The date when the certificate expires.
     * 
     */
    @Export(name="expiresOn", refs={String.class}, tree="[0]")
    private Output<String> expiresOn;

    /**
     * @return The date when the certificate expires.
     * 
     */
    public Output<String> expiresOn() {
        return this.expiresOn;
    }
    /**
     * The hostname on the origin for which the client certificate uploaded will be used.
     * 
     */
    @Export(name="hostname", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> hostname;

    /**
     * @return The hostname on the origin for which the client certificate uploaded will be used.
     * 
     */
    public Output<Optional<String>> hostname() {
        return Codegen.optional(this.hostname);
    }
    /**
     * The certificate authority that issued the certificate.
     * 
     */
    @Export(name="issuer", refs={String.class}, tree="[0]")
    private Output<String> issuer;

    /**
     * @return The certificate authority that issued the certificate.
     * 
     */
    public Output<String> issuer() {
        return this.issuer;
    }
    /**
     * The hostname certificate&#39;s private key.
     * 
     */
    @Export(name="privateKey", refs={String.class}, tree="[0]")
    private Output<String> privateKey;

    /**
     * @return The hostname certificate&#39;s private key.
     * 
     */
    public Output<String> privateKey() {
        return this.privateKey;
    }
    /**
     * The serial number on the uploaded certificate.
     * 
     */
    @Export(name="serialNumber", refs={String.class}, tree="[0]")
    private Output<String> serialNumber;

    /**
     * @return The serial number on the uploaded certificate.
     * 
     */
    public Output<String> serialNumber() {
        return this.serialNumber;
    }
    /**
     * The type of hash used for the certificate.
     * 
     */
    @Export(name="signature", refs={String.class}, tree="[0]")
    private Output<String> signature;

    /**
     * @return The type of hash used for the certificate.
     * 
     */
    public Output<String> signature() {
        return this.signature;
    }
    /**
     * Status of the certificate or the association.
     * Available values: &#34;initializing&#34;, &#34;pending*deployment&#34;, &#34;pending*deletion&#34;, &#34;active&#34;, &#34;deleted&#34;, &#34;deployment*timed*out&#34;, &#34;deletion*timed*out&#34;.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of the certificate or the association.
     * Available values: &#34;initializing&#34;, &#34;pending*deployment&#34;, &#34;pending*deletion&#34;, &#34;active&#34;, &#34;deleted&#34;, &#34;deployment*timed*out&#34;, &#34;deletion*timed*out&#34;.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The time when the certificate was updated.
     * 
     */
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    /**
     * @return The time when the certificate was updated.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }
    /**
     * Identifier.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return Identifier.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuthenticatedOriginPulls(java.lang.String name) {
        this(name, AuthenticatedOriginPullsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthenticatedOriginPulls(java.lang.String name, AuthenticatedOriginPullsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthenticatedOriginPulls(java.lang.String name, AuthenticatedOriginPullsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AuthenticatedOriginPulls(java.lang.String name, Output<java.lang.String> id, @Nullable AuthenticatedOriginPullsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls", name, state, makeResourceOptions(options, id), false);
    }

    private static AuthenticatedOriginPullsArgs makeArgs(AuthenticatedOriginPullsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AuthenticatedOriginPullsArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "privateKey"
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
    public static AuthenticatedOriginPulls get(java.lang.String name, Output<java.lang.String> id, @Nullable AuthenticatedOriginPullsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AuthenticatedOriginPulls(name, id, state, options);
    }
}
