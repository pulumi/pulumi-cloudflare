// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWorkersForPlatformsScriptSecretResult {
    /**
     * @return Identifier.
     * 
     */
    private String accountId;
    /**
     * @return Name of the Workers for Platforms dispatch namespace.
     * 
     */
    private String dispatchNamespace;
    /**
     * @return A JavaScript variable name for the secret binding.
     * 
     */
    private String id;
    /**
     * @return The name of this secret, this is what will be used to access it inside the Worker.
     * 
     */
    private String name;
    /**
     * @return Name of the script, used in URLs and route configuration.
     * 
     */
    private String scriptName;
    /**
     * @return A JavaScript variable name for the secret binding.
     * 
     */
    private @Nullable String secretName;
    /**
     * @return The type of secret.
     * Available values: &#34;secret_text&#34;.
     * 
     */
    private String type;

    private GetWorkersForPlatformsScriptSecretResult() {}
    /**
     * @return Identifier.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Name of the Workers for Platforms dispatch namespace.
     * 
     */
    public String dispatchNamespace() {
        return this.dispatchNamespace;
    }
    /**
     * @return A JavaScript variable name for the secret binding.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of this secret, this is what will be used to access it inside the Worker.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Name of the script, used in URLs and route configuration.
     * 
     */
    public String scriptName() {
        return this.scriptName;
    }
    /**
     * @return A JavaScript variable name for the secret binding.
     * 
     */
    public Optional<String> secretName() {
        return Optional.ofNullable(this.secretName);
    }
    /**
     * @return The type of secret.
     * Available values: &#34;secret_text&#34;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkersForPlatformsScriptSecretResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String dispatchNamespace;
        private String id;
        private String name;
        private String scriptName;
        private @Nullable String secretName;
        private String type;
        public Builder() {}
        public Builder(GetWorkersForPlatformsScriptSecretResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.dispatchNamespace = defaults.dispatchNamespace;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.scriptName = defaults.scriptName;
    	      this.secretName = defaults.secretName;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetWorkersForPlatformsScriptSecretResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder dispatchNamespace(String dispatchNamespace) {
            if (dispatchNamespace == null) {
              throw new MissingRequiredPropertyException("GetWorkersForPlatformsScriptSecretResult", "dispatchNamespace");
            }
            this.dispatchNamespace = dispatchNamespace;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWorkersForPlatformsScriptSecretResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetWorkersForPlatformsScriptSecretResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder scriptName(String scriptName) {
            if (scriptName == null) {
              throw new MissingRequiredPropertyException("GetWorkersForPlatformsScriptSecretResult", "scriptName");
            }
            this.scriptName = scriptName;
            return this;
        }
        @CustomType.Setter
        public Builder secretName(@Nullable String secretName) {

            this.secretName = secretName;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetWorkersForPlatformsScriptSecretResult", "type");
            }
            this.type = type;
            return this;
        }
        public GetWorkersForPlatformsScriptSecretResult build() {
            final var _resultValue = new GetWorkersForPlatformsScriptSecretResult();
            _resultValue.accountId = accountId;
            _resultValue.dispatchNamespace = dispatchNamespace;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.scriptName = scriptName;
            _resultValue.secretName = secretName;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
