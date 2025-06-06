// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.ZeroTrustRiskScoringIntegrationArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustRiskScoringIntegrationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.ZeroTrustRiskScoringIntegration;
 * import com.pulumi.cloudflare.ZeroTrustRiskScoringIntegrationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleZeroTrustRiskScoringIntegration = new ZeroTrustRiskScoringIntegration("exampleZeroTrustRiskScoringIntegration", ZeroTrustRiskScoringIntegrationArgs.builder()
 *             .accountId("account_id")
 *             .integrationType("Okta")
 *             .tenantUrl("https://example.com")
 *             .referenceId("reference_id")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import cloudflare:index/zeroTrustRiskScoringIntegration:ZeroTrustRiskScoringIntegration example &#39;&lt;account_id&gt;/&lt;integration_id&gt;&#39;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/zeroTrustRiskScoringIntegration:ZeroTrustRiskScoringIntegration")
public class ZeroTrustRiskScoringIntegration extends com.pulumi.resources.CustomResource {
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The Cloudflare account tag.
     * 
     */
    @Export(name="accountTag", refs={String.class}, tree="[0]")
    private Output<String> accountTag;

    /**
     * @return The Cloudflare account tag.
     * 
     */
    public Output<String> accountTag() {
        return this.accountTag;
    }
    /**
     * Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
     * 
     */
    @Export(name="active", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> active;

    /**
     * @return Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
     * 
     */
    public Output<Optional<Boolean>> active() {
        return Codegen.optional(this.active);
    }
    /**
     * When the integration was created in RFC3339 format.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return When the integration was created in RFC3339 format.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Available values: &#34;Okta&#34;.
     * 
     */
    @Export(name="integrationType", refs={String.class}, tree="[0]")
    private Output<String> integrationType;

    /**
     * @return Available values: &#34;Okta&#34;.
     * 
     */
    public Output<String> integrationType() {
        return this.integrationType;
    }
    /**
     * A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4).
     * https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
     * 
     */
    @Export(name="referenceId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> referenceId;

    /**
     * @return A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4).
     * https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
     * 
     */
    public Output<Optional<String>> referenceId() {
        return Codegen.optional(this.referenceId);
    }
    /**
     * The base url of the tenant, e.g. &#34;https://tenant.okta.com&#34;.
     * 
     */
    @Export(name="tenantUrl", refs={String.class}, tree="[0]")
    private Output<String> tenantUrl;

    /**
     * @return The base url of the tenant, e.g. &#34;https://tenant.okta.com&#34;.
     * 
     */
    public Output<String> tenantUrl() {
        return this.tenantUrl;
    }
    /**
     * The URL for the Shared Signals Framework configuration, e.g. &#34;/.well-known/sse-configuration/{integration*uuid}/&#34;. https://openid.net/specs/openid-sse-framework-1*0.html#rfc.section.6.2.1.
     * 
     */
    @Export(name="wellKnownUrl", refs={String.class}, tree="[0]")
    private Output<String> wellKnownUrl;

    /**
     * @return The URL for the Shared Signals Framework configuration, e.g. &#34;/.well-known/sse-configuration/{integration*uuid}/&#34;. https://openid.net/specs/openid-sse-framework-1*0.html#rfc.section.6.2.1.
     * 
     */
    public Output<String> wellKnownUrl() {
        return this.wellKnownUrl;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ZeroTrustRiskScoringIntegration(java.lang.String name) {
        this(name, ZeroTrustRiskScoringIntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ZeroTrustRiskScoringIntegration(java.lang.String name, ZeroTrustRiskScoringIntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ZeroTrustRiskScoringIntegration(java.lang.String name, ZeroTrustRiskScoringIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustRiskScoringIntegration:ZeroTrustRiskScoringIntegration", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ZeroTrustRiskScoringIntegration(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustRiskScoringIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustRiskScoringIntegration:ZeroTrustRiskScoringIntegration", name, state, makeResourceOptions(options, id), false);
    }

    private static ZeroTrustRiskScoringIntegrationArgs makeArgs(ZeroTrustRiskScoringIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ZeroTrustRiskScoringIntegrationArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static ZeroTrustRiskScoringIntegration get(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustRiskScoringIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ZeroTrustRiskScoringIntegration(name, id, state, options);
    }
}
