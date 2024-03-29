// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkerScriptD1DatabaseBinding {
    /**
     * @return Database ID of D1 database to use.
     * 
     */
    private String databaseId;
    /**
     * @return The global variable for the binding in your Worker code.
     * 
     */
    private String name;

    private WorkerScriptD1DatabaseBinding() {}
    /**
     * @return Database ID of D1 database to use.
     * 
     */
    public String databaseId() {
        return this.databaseId;
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

    public static Builder builder(WorkerScriptD1DatabaseBinding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String databaseId;
        private String name;
        public Builder() {}
        public Builder(WorkerScriptD1DatabaseBinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseId = defaults.databaseId;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder databaseId(String databaseId) {
            if (databaseId == null) {
              throw new MissingRequiredPropertyException("WorkerScriptD1DatabaseBinding", "databaseId");
            }
            this.databaseId = databaseId;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("WorkerScriptD1DatabaseBinding", "name");
            }
            this.name = name;
            return this;
        }
        public WorkerScriptD1DatabaseBinding build() {
            final var _resultValue = new WorkerScriptD1DatabaseBinding();
            _resultValue.databaseId = databaseId;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
