// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.WorkersScriptAssetsArgs;
import com.pulumi.cloudflare.inputs.WorkersScriptBindingArgs;
import com.pulumi.cloudflare.inputs.WorkersScriptMigrationsArgs;
import com.pulumi.cloudflare.inputs.WorkersScriptObservabilityArgs;
import com.pulumi.cloudflare.inputs.WorkersScriptPlacementArgs;
import com.pulumi.cloudflare.inputs.WorkersScriptTailConsumerArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkersScriptArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkersScriptArgs Empty = new WorkersScriptArgs();

    /**
     * Identifier.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Identifier.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Configuration for assets within a Worker
     * 
     */
    @Import(name="assets")
    private @Nullable Output<WorkersScriptAssetsArgs> assets;

    /**
     * @return Configuration for assets within a Worker
     * 
     */
    public Optional<Output<WorkersScriptAssetsArgs>> assets() {
        return Optional.ofNullable(this.assets);
    }

    /**
     * List of bindings attached to a Worker. You can find more about bindings on our docs: https://developers.cloudflare.com/workers/configuration/multipart-upload-metadata/#bindings.
     * 
     */
    @Import(name="bindings")
    private @Nullable Output<List<WorkersScriptBindingArgs>> bindings;

    /**
     * @return List of bindings attached to a Worker. You can find more about bindings on our docs: https://developers.cloudflare.com/workers/configuration/multipart-upload-metadata/#bindings.
     * 
     */
    public Optional<Output<List<WorkersScriptBindingArgs>>> bindings() {
        return Optional.ofNullable(this.bindings);
    }

    /**
     * Name of the part in the multipart request that contains the script (e.g. the file adding a listener to the `fetch` event). Indicates a `service worker syntax` Worker.
     * 
     */
    @Import(name="bodyPart")
    private @Nullable Output<String> bodyPart;

    /**
     * @return Name of the part in the multipart request that contains the script (e.g. the file adding a listener to the `fetch` event). Indicates a `service worker syntax` Worker.
     * 
     */
    public Optional<Output<String>> bodyPart() {
        return Optional.ofNullable(this.bodyPart);
    }

    /**
     * Date indicating targeted support in the Workers runtime. Backwards incompatible fixes to the runtime following this date will not affect this Worker.
     * 
     */
    @Import(name="compatibilityDate")
    private @Nullable Output<String> compatibilityDate;

    /**
     * @return Date indicating targeted support in the Workers runtime. Backwards incompatible fixes to the runtime following this date will not affect this Worker.
     * 
     */
    public Optional<Output<String>> compatibilityDate() {
        return Optional.ofNullable(this.compatibilityDate);
    }

    /**
     * Flags that enable or disable certain features in the Workers runtime. Used to enable upcoming features or opt in or out of specific changes not included in a `compatibility_date`.
     * 
     */
    @Import(name="compatibilityFlags")
    private @Nullable Output<List<String>> compatibilityFlags;

    /**
     * @return Flags that enable or disable certain features in the Workers runtime. Used to enable upcoming features or opt in or out of specific changes not included in a `compatibility_date`.
     * 
     */
    public Optional<Output<List<String>>> compatibilityFlags() {
        return Optional.ofNullable(this.compatibilityFlags);
    }

    /**
     * Module or Service Worker contents of the Worker.
     * 
     */
    @Import(name="content", required=true)
    private Output<String> content;

    /**
     * @return Module or Service Worker contents of the Worker.
     * 
     */
    public Output<String> content() {
        return this.content;
    }

    /**
     * Retain assets which exist for a previously uploaded Worker version; used in lieu of providing a completion token.
     * 
     */
    @Import(name="keepAssets")
    private @Nullable Output<Boolean> keepAssets;

    /**
     * @return Retain assets which exist for a previously uploaded Worker version; used in lieu of providing a completion token.
     * 
     */
    public Optional<Output<Boolean>> keepAssets() {
        return Optional.ofNullable(this.keepAssets);
    }

    /**
     * List of binding types to keep from previous_upload.
     * 
     */
    @Import(name="keepBindings")
    private @Nullable Output<List<String>> keepBindings;

    /**
     * @return List of binding types to keep from previous_upload.
     * 
     */
    public Optional<Output<List<String>>> keepBindings() {
        return Optional.ofNullable(this.keepBindings);
    }

    /**
     * Whether Logpush is turned on for the Worker.
     * 
     */
    @Import(name="logpush")
    private @Nullable Output<Boolean> logpush;

    /**
     * @return Whether Logpush is turned on for the Worker.
     * 
     */
    public Optional<Output<Boolean>> logpush() {
        return Optional.ofNullable(this.logpush);
    }

    /**
     * Name of the part in the multipart request that contains the main module (e.g. the file exporting a `fetch` handler). Indicates a `module syntax` Worker.
     * 
     */
    @Import(name="mainModule")
    private @Nullable Output<String> mainModule;

    /**
     * @return Name of the part in the multipart request that contains the main module (e.g. the file exporting a `fetch` handler). Indicates a `module syntax` Worker.
     * 
     */
    public Optional<Output<String>> mainModule() {
        return Optional.ofNullable(this.mainModule);
    }

    /**
     * Migrations to apply for Durable Objects associated with this Worker.
     * 
     */
    @Import(name="migrations")
    private @Nullable Output<WorkersScriptMigrationsArgs> migrations;

    /**
     * @return Migrations to apply for Durable Objects associated with this Worker.
     * 
     */
    public Optional<Output<WorkersScriptMigrationsArgs>> migrations() {
        return Optional.ofNullable(this.migrations);
    }

    /**
     * Observability settings for the Worker.
     * 
     */
    @Import(name="observability")
    private @Nullable Output<WorkersScriptObservabilityArgs> observability;

    /**
     * @return Observability settings for the Worker.
     * 
     */
    public Optional<Output<WorkersScriptObservabilityArgs>> observability() {
        return Optional.ofNullable(this.observability);
    }

    /**
     * Configuration for [Smart Placement](https://developers.cloudflare.com/workers/configuration/smart-placement).
     * 
     */
    @Import(name="placement")
    private @Nullable Output<WorkersScriptPlacementArgs> placement;

    /**
     * @return Configuration for [Smart Placement](https://developers.cloudflare.com/workers/configuration/smart-placement).
     * 
     */
    public Optional<Output<WorkersScriptPlacementArgs>> placement() {
        return Optional.ofNullable(this.placement);
    }

    /**
     * Name of the script, used in URLs and route configuration.
     * 
     */
    @Import(name="scriptName", required=true)
    private Output<String> scriptName;

    /**
     * @return Name of the script, used in URLs and route configuration.
     * 
     */
    public Output<String> scriptName() {
        return this.scriptName;
    }

    /**
     * List of Workers that will consume logs from the attached Worker.
     * 
     */
    @Import(name="tailConsumers")
    private @Nullable Output<List<WorkersScriptTailConsumerArgs>> tailConsumers;

    /**
     * @return List of Workers that will consume logs from the attached Worker.
     * 
     */
    public Optional<Output<List<WorkersScriptTailConsumerArgs>>> tailConsumers() {
        return Optional.ofNullable(this.tailConsumers);
    }

    /**
     * Usage model for the Worker invocations.
     * Available values: &#34;standard&#34;.
     * 
     */
    @Import(name="usageModel")
    private @Nullable Output<String> usageModel;

    /**
     * @return Usage model for the Worker invocations.
     * Available values: &#34;standard&#34;.
     * 
     */
    public Optional<Output<String>> usageModel() {
        return Optional.ofNullable(this.usageModel);
    }

    private WorkersScriptArgs() {}

    private WorkersScriptArgs(WorkersScriptArgs $) {
        this.accountId = $.accountId;
        this.assets = $.assets;
        this.bindings = $.bindings;
        this.bodyPart = $.bodyPart;
        this.compatibilityDate = $.compatibilityDate;
        this.compatibilityFlags = $.compatibilityFlags;
        this.content = $.content;
        this.keepAssets = $.keepAssets;
        this.keepBindings = $.keepBindings;
        this.logpush = $.logpush;
        this.mainModule = $.mainModule;
        this.migrations = $.migrations;
        this.observability = $.observability;
        this.placement = $.placement;
        this.scriptName = $.scriptName;
        this.tailConsumers = $.tailConsumers;
        this.usageModel = $.usageModel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkersScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkersScriptArgs $;

        public Builder() {
            $ = new WorkersScriptArgs();
        }

        public Builder(WorkersScriptArgs defaults) {
            $ = new WorkersScriptArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param assets Configuration for assets within a Worker
         * 
         * @return builder
         * 
         */
        public Builder assets(@Nullable Output<WorkersScriptAssetsArgs> assets) {
            $.assets = assets;
            return this;
        }

        /**
         * @param assets Configuration for assets within a Worker
         * 
         * @return builder
         * 
         */
        public Builder assets(WorkersScriptAssetsArgs assets) {
            return assets(Output.of(assets));
        }

        /**
         * @param bindings List of bindings attached to a Worker. You can find more about bindings on our docs: https://developers.cloudflare.com/workers/configuration/multipart-upload-metadata/#bindings.
         * 
         * @return builder
         * 
         */
        public Builder bindings(@Nullable Output<List<WorkersScriptBindingArgs>> bindings) {
            $.bindings = bindings;
            return this;
        }

        /**
         * @param bindings List of bindings attached to a Worker. You can find more about bindings on our docs: https://developers.cloudflare.com/workers/configuration/multipart-upload-metadata/#bindings.
         * 
         * @return builder
         * 
         */
        public Builder bindings(List<WorkersScriptBindingArgs> bindings) {
            return bindings(Output.of(bindings));
        }

        /**
         * @param bindings List of bindings attached to a Worker. You can find more about bindings on our docs: https://developers.cloudflare.com/workers/configuration/multipart-upload-metadata/#bindings.
         * 
         * @return builder
         * 
         */
        public Builder bindings(WorkersScriptBindingArgs... bindings) {
            return bindings(List.of(bindings));
        }

        /**
         * @param bodyPart Name of the part in the multipart request that contains the script (e.g. the file adding a listener to the `fetch` event). Indicates a `service worker syntax` Worker.
         * 
         * @return builder
         * 
         */
        public Builder bodyPart(@Nullable Output<String> bodyPart) {
            $.bodyPart = bodyPart;
            return this;
        }

        /**
         * @param bodyPart Name of the part in the multipart request that contains the script (e.g. the file adding a listener to the `fetch` event). Indicates a `service worker syntax` Worker.
         * 
         * @return builder
         * 
         */
        public Builder bodyPart(String bodyPart) {
            return bodyPart(Output.of(bodyPart));
        }

        /**
         * @param compatibilityDate Date indicating targeted support in the Workers runtime. Backwards incompatible fixes to the runtime following this date will not affect this Worker.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityDate(@Nullable Output<String> compatibilityDate) {
            $.compatibilityDate = compatibilityDate;
            return this;
        }

        /**
         * @param compatibilityDate Date indicating targeted support in the Workers runtime. Backwards incompatible fixes to the runtime following this date will not affect this Worker.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityDate(String compatibilityDate) {
            return compatibilityDate(Output.of(compatibilityDate));
        }

        /**
         * @param compatibilityFlags Flags that enable or disable certain features in the Workers runtime. Used to enable upcoming features or opt in or out of specific changes not included in a `compatibility_date`.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityFlags(@Nullable Output<List<String>> compatibilityFlags) {
            $.compatibilityFlags = compatibilityFlags;
            return this;
        }

        /**
         * @param compatibilityFlags Flags that enable or disable certain features in the Workers runtime. Used to enable upcoming features or opt in or out of specific changes not included in a `compatibility_date`.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityFlags(List<String> compatibilityFlags) {
            return compatibilityFlags(Output.of(compatibilityFlags));
        }

        /**
         * @param compatibilityFlags Flags that enable or disable certain features in the Workers runtime. Used to enable upcoming features or opt in or out of specific changes not included in a `compatibility_date`.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityFlags(String... compatibilityFlags) {
            return compatibilityFlags(List.of(compatibilityFlags));
        }

        /**
         * @param content Module or Service Worker contents of the Worker.
         * 
         * @return builder
         * 
         */
        public Builder content(Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content Module or Service Worker contents of the Worker.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param keepAssets Retain assets which exist for a previously uploaded Worker version; used in lieu of providing a completion token.
         * 
         * @return builder
         * 
         */
        public Builder keepAssets(@Nullable Output<Boolean> keepAssets) {
            $.keepAssets = keepAssets;
            return this;
        }

        /**
         * @param keepAssets Retain assets which exist for a previously uploaded Worker version; used in lieu of providing a completion token.
         * 
         * @return builder
         * 
         */
        public Builder keepAssets(Boolean keepAssets) {
            return keepAssets(Output.of(keepAssets));
        }

        /**
         * @param keepBindings List of binding types to keep from previous_upload.
         * 
         * @return builder
         * 
         */
        public Builder keepBindings(@Nullable Output<List<String>> keepBindings) {
            $.keepBindings = keepBindings;
            return this;
        }

        /**
         * @param keepBindings List of binding types to keep from previous_upload.
         * 
         * @return builder
         * 
         */
        public Builder keepBindings(List<String> keepBindings) {
            return keepBindings(Output.of(keepBindings));
        }

        /**
         * @param keepBindings List of binding types to keep from previous_upload.
         * 
         * @return builder
         * 
         */
        public Builder keepBindings(String... keepBindings) {
            return keepBindings(List.of(keepBindings));
        }

        /**
         * @param logpush Whether Logpush is turned on for the Worker.
         * 
         * @return builder
         * 
         */
        public Builder logpush(@Nullable Output<Boolean> logpush) {
            $.logpush = logpush;
            return this;
        }

        /**
         * @param logpush Whether Logpush is turned on for the Worker.
         * 
         * @return builder
         * 
         */
        public Builder logpush(Boolean logpush) {
            return logpush(Output.of(logpush));
        }

        /**
         * @param mainModule Name of the part in the multipart request that contains the main module (e.g. the file exporting a `fetch` handler). Indicates a `module syntax` Worker.
         * 
         * @return builder
         * 
         */
        public Builder mainModule(@Nullable Output<String> mainModule) {
            $.mainModule = mainModule;
            return this;
        }

        /**
         * @param mainModule Name of the part in the multipart request that contains the main module (e.g. the file exporting a `fetch` handler). Indicates a `module syntax` Worker.
         * 
         * @return builder
         * 
         */
        public Builder mainModule(String mainModule) {
            return mainModule(Output.of(mainModule));
        }

        /**
         * @param migrations Migrations to apply for Durable Objects associated with this Worker.
         * 
         * @return builder
         * 
         */
        public Builder migrations(@Nullable Output<WorkersScriptMigrationsArgs> migrations) {
            $.migrations = migrations;
            return this;
        }

        /**
         * @param migrations Migrations to apply for Durable Objects associated with this Worker.
         * 
         * @return builder
         * 
         */
        public Builder migrations(WorkersScriptMigrationsArgs migrations) {
            return migrations(Output.of(migrations));
        }

        /**
         * @param observability Observability settings for the Worker.
         * 
         * @return builder
         * 
         */
        public Builder observability(@Nullable Output<WorkersScriptObservabilityArgs> observability) {
            $.observability = observability;
            return this;
        }

        /**
         * @param observability Observability settings for the Worker.
         * 
         * @return builder
         * 
         */
        public Builder observability(WorkersScriptObservabilityArgs observability) {
            return observability(Output.of(observability));
        }

        /**
         * @param placement Configuration for [Smart Placement](https://developers.cloudflare.com/workers/configuration/smart-placement).
         * 
         * @return builder
         * 
         */
        public Builder placement(@Nullable Output<WorkersScriptPlacementArgs> placement) {
            $.placement = placement;
            return this;
        }

        /**
         * @param placement Configuration for [Smart Placement](https://developers.cloudflare.com/workers/configuration/smart-placement).
         * 
         * @return builder
         * 
         */
        public Builder placement(WorkersScriptPlacementArgs placement) {
            return placement(Output.of(placement));
        }

        /**
         * @param scriptName Name of the script, used in URLs and route configuration.
         * 
         * @return builder
         * 
         */
        public Builder scriptName(Output<String> scriptName) {
            $.scriptName = scriptName;
            return this;
        }

        /**
         * @param scriptName Name of the script, used in URLs and route configuration.
         * 
         * @return builder
         * 
         */
        public Builder scriptName(String scriptName) {
            return scriptName(Output.of(scriptName));
        }

        /**
         * @param tailConsumers List of Workers that will consume logs from the attached Worker.
         * 
         * @return builder
         * 
         */
        public Builder tailConsumers(@Nullable Output<List<WorkersScriptTailConsumerArgs>> tailConsumers) {
            $.tailConsumers = tailConsumers;
            return this;
        }

        /**
         * @param tailConsumers List of Workers that will consume logs from the attached Worker.
         * 
         * @return builder
         * 
         */
        public Builder tailConsumers(List<WorkersScriptTailConsumerArgs> tailConsumers) {
            return tailConsumers(Output.of(tailConsumers));
        }

        /**
         * @param tailConsumers List of Workers that will consume logs from the attached Worker.
         * 
         * @return builder
         * 
         */
        public Builder tailConsumers(WorkersScriptTailConsumerArgs... tailConsumers) {
            return tailConsumers(List.of(tailConsumers));
        }

        /**
         * @param usageModel Usage model for the Worker invocations.
         * Available values: &#34;standard&#34;.
         * 
         * @return builder
         * 
         */
        public Builder usageModel(@Nullable Output<String> usageModel) {
            $.usageModel = usageModel;
            return this;
        }

        /**
         * @param usageModel Usage model for the Worker invocations.
         * Available values: &#34;standard&#34;.
         * 
         * @return builder
         * 
         */
        public Builder usageModel(String usageModel) {
            return usageModel(Output.of(usageModel));
        }

        public WorkersScriptArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("WorkersScriptArgs", "accountId");
            }
            if ($.content == null) {
                throw new MissingRequiredPropertyException("WorkersScriptArgs", "content");
            }
            if ($.scriptName == null) {
                throw new MissingRequiredPropertyException("WorkersScriptArgs", "scriptName");
            }
            return $;
        }
    }

}
