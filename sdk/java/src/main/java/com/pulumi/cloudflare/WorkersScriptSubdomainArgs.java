// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkersScriptSubdomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkersScriptSubdomainArgs Empty = new WorkersScriptSubdomainArgs();

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
     * Whether the Worker should be available on the workers.dev subdomain.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether the Worker should be available on the workers.dev subdomain.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Whether the Worker&#39;s Preview URLs should be available on the workers.dev subdomain.
     * 
     */
    @Import(name="previewsEnabled")
    private @Nullable Output<Boolean> previewsEnabled;

    /**
     * @return Whether the Worker&#39;s Preview URLs should be available on the workers.dev subdomain.
     * 
     */
    public Optional<Output<Boolean>> previewsEnabled() {
        return Optional.ofNullable(this.previewsEnabled);
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

    private WorkersScriptSubdomainArgs() {}

    private WorkersScriptSubdomainArgs(WorkersScriptSubdomainArgs $) {
        this.accountId = $.accountId;
        this.enabled = $.enabled;
        this.previewsEnabled = $.previewsEnabled;
        this.scriptName = $.scriptName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkersScriptSubdomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkersScriptSubdomainArgs $;

        public Builder() {
            $ = new WorkersScriptSubdomainArgs();
        }

        public Builder(WorkersScriptSubdomainArgs defaults) {
            $ = new WorkersScriptSubdomainArgs(Objects.requireNonNull(defaults));
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
         * @param enabled Whether the Worker should be available on the workers.dev subdomain.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the Worker should be available on the workers.dev subdomain.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param previewsEnabled Whether the Worker&#39;s Preview URLs should be available on the workers.dev subdomain.
         * 
         * @return builder
         * 
         */
        public Builder previewsEnabled(@Nullable Output<Boolean> previewsEnabled) {
            $.previewsEnabled = previewsEnabled;
            return this;
        }

        /**
         * @param previewsEnabled Whether the Worker&#39;s Preview URLs should be available on the workers.dev subdomain.
         * 
         * @return builder
         * 
         */
        public Builder previewsEnabled(Boolean previewsEnabled) {
            return previewsEnabled(Output.of(previewsEnabled));
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

        public WorkersScriptSubdomainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("WorkersScriptSubdomainArgs", "accountId");
            }
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("WorkersScriptSubdomainArgs", "enabled");
            }
            if ($.scriptName == null) {
                throw new MissingRequiredPropertyException("WorkersScriptSubdomainArgs", "scriptName");
            }
            return $;
        }
    }

}
