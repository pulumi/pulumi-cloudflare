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
public final class WorkersScriptServiceBinding {
    /**
     * @return The name of the Worker environment to bind to.
     * 
     */
    private @Nullable String environment;
    /**
     * @return The global variable for the binding in your Worker code.
     * 
     */
    private String name;
    /**
     * @return The name of the Worker to bind to.
     * 
     */
    private String service;

    private WorkersScriptServiceBinding() {}
    /**
     * @return The name of the Worker environment to bind to.
     * 
     */
    public Optional<String> environment() {
        return Optional.ofNullable(this.environment);
    }
    /**
     * @return The global variable for the binding in your Worker code.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The name of the Worker to bind to.
     * 
     */
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkersScriptServiceBinding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String environment;
        private String name;
        private String service;
        public Builder() {}
        public Builder(WorkersScriptServiceBinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environment = defaults.environment;
    	      this.name = defaults.name;
    	      this.service = defaults.service;
        }

        @CustomType.Setter
        public Builder environment(@Nullable String environment) {

            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("WorkersScriptServiceBinding", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder service(String service) {
            if (service == null) {
              throw new MissingRequiredPropertyException("WorkersScriptServiceBinding", "service");
            }
            this.service = service;
            return this;
        }
        public WorkersScriptServiceBinding build() {
            final var _resultValue = new WorkersScriptServiceBinding();
            _resultValue.environment = environment;
            _resultValue.name = name;
            _resultValue.service = service;
            return _resultValue;
        }
    }
}
