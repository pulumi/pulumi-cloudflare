// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkersScriptWebassemblyBinding {
    /**
     * @return The base64 encoded wasm module you want to store.
     * 
     */
    private String module;
    /**
     * @return The global variable for the binding in your Worker code.
     * 
     */
    private String name;

    private WorkersScriptWebassemblyBinding() {}
    /**
     * @return The base64 encoded wasm module you want to store.
     * 
     */
    public String module() {
        return this.module;
    }
    /**
     * @return The global variable for the binding in your Worker code.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkersScriptWebassemblyBinding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String module;
        private String name;
        public Builder() {}
        public Builder(WorkersScriptWebassemblyBinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.module = defaults.module;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder module(String module) {
            if (module == null) {
              throw new MissingRequiredPropertyException("WorkersScriptWebassemblyBinding", "module");
            }
            this.module = module;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("WorkersScriptWebassemblyBinding", "name");
            }
            this.name = name;
            return this;
        }
        public WorkersScriptWebassemblyBinding build() {
            final var _resultValue = new WorkersScriptWebassemblyBinding();
            _resultValue.module = module;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}