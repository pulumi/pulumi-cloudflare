// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.WorkersScriptMigrationsStepRenamedClass;
import com.pulumi.cloudflare.outputs.WorkersScriptMigrationsStepTransferredClass;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class WorkersScriptMigrationsStep {
    /**
     * @return A list of classes to delete Durable Object namespaces from.
     * 
     */
    private @Nullable List<String> deletedClasses;
    /**
     * @return A list of classes to create Durable Object namespaces from.
     * 
     */
    private @Nullable List<String> newClasses;
    /**
     * @return A list of classes to create Durable Object namespaces with SQLite from.
     * 
     */
    private @Nullable List<String> newSqliteClasses;
    /**
     * @return A list of classes with Durable Object namespaces that were renamed.
     * 
     */
    private @Nullable List<WorkersScriptMigrationsStepRenamedClass> renamedClasses;
    /**
     * @return A list of transfers for Durable Object namespaces from a different Worker and class to a class defined in this Worker.
     * 
     */
    private @Nullable List<WorkersScriptMigrationsStepTransferredClass> transferredClasses;

    private WorkersScriptMigrationsStep() {}
    /**
     * @return A list of classes to delete Durable Object namespaces from.
     * 
     */
    public List<String> deletedClasses() {
        return this.deletedClasses == null ? List.of() : this.deletedClasses;
    }
    /**
     * @return A list of classes to create Durable Object namespaces from.
     * 
     */
    public List<String> newClasses() {
        return this.newClasses == null ? List.of() : this.newClasses;
    }
    /**
     * @return A list of classes to create Durable Object namespaces with SQLite from.
     * 
     */
    public List<String> newSqliteClasses() {
        return this.newSqliteClasses == null ? List.of() : this.newSqliteClasses;
    }
    /**
     * @return A list of classes with Durable Object namespaces that were renamed.
     * 
     */
    public List<WorkersScriptMigrationsStepRenamedClass> renamedClasses() {
        return this.renamedClasses == null ? List.of() : this.renamedClasses;
    }
    /**
     * @return A list of transfers for Durable Object namespaces from a different Worker and class to a class defined in this Worker.
     * 
     */
    public List<WorkersScriptMigrationsStepTransferredClass> transferredClasses() {
        return this.transferredClasses == null ? List.of() : this.transferredClasses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkersScriptMigrationsStep defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> deletedClasses;
        private @Nullable List<String> newClasses;
        private @Nullable List<String> newSqliteClasses;
        private @Nullable List<WorkersScriptMigrationsStepRenamedClass> renamedClasses;
        private @Nullable List<WorkersScriptMigrationsStepTransferredClass> transferredClasses;
        public Builder() {}
        public Builder(WorkersScriptMigrationsStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deletedClasses = defaults.deletedClasses;
    	      this.newClasses = defaults.newClasses;
    	      this.newSqliteClasses = defaults.newSqliteClasses;
    	      this.renamedClasses = defaults.renamedClasses;
    	      this.transferredClasses = defaults.transferredClasses;
        }

        @CustomType.Setter
        public Builder deletedClasses(@Nullable List<String> deletedClasses) {

            this.deletedClasses = deletedClasses;
            return this;
        }
        public Builder deletedClasses(String... deletedClasses) {
            return deletedClasses(List.of(deletedClasses));
        }
        @CustomType.Setter
        public Builder newClasses(@Nullable List<String> newClasses) {

            this.newClasses = newClasses;
            return this;
        }
        public Builder newClasses(String... newClasses) {
            return newClasses(List.of(newClasses));
        }
        @CustomType.Setter
        public Builder newSqliteClasses(@Nullable List<String> newSqliteClasses) {

            this.newSqliteClasses = newSqliteClasses;
            return this;
        }
        public Builder newSqliteClasses(String... newSqliteClasses) {
            return newSqliteClasses(List.of(newSqliteClasses));
        }
        @CustomType.Setter
        public Builder renamedClasses(@Nullable List<WorkersScriptMigrationsStepRenamedClass> renamedClasses) {

            this.renamedClasses = renamedClasses;
            return this;
        }
        public Builder renamedClasses(WorkersScriptMigrationsStepRenamedClass... renamedClasses) {
            return renamedClasses(List.of(renamedClasses));
        }
        @CustomType.Setter
        public Builder transferredClasses(@Nullable List<WorkersScriptMigrationsStepTransferredClass> transferredClasses) {

            this.transferredClasses = transferredClasses;
            return this;
        }
        public Builder transferredClasses(WorkersScriptMigrationsStepTransferredClass... transferredClasses) {
            return transferredClasses(List.of(transferredClasses));
        }
        public WorkersScriptMigrationsStep build() {
            final var _resultValue = new WorkersScriptMigrationsStep();
            _resultValue.deletedClasses = deletedClasses;
            _resultValue.newClasses = newClasses;
            _resultValue.newSqliteClasses = newSqliteClasses;
            _resultValue.renamedClasses = renamedClasses;
            _resultValue.transferredClasses = transferredClasses;
            return _resultValue;
        }
    }
}
