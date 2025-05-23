// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkerScriptMigrationsTransferredClassArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkerScriptMigrationsTransferredClassArgs Empty = new WorkerScriptMigrationsTransferredClassArgs();

    @Import(name="from")
    private @Nullable Output<String> from;

    public Optional<Output<String>> from() {
        return Optional.ofNullable(this.from);
    }

    @Import(name="fromScript")
    private @Nullable Output<String> fromScript;

    public Optional<Output<String>> fromScript() {
        return Optional.ofNullable(this.fromScript);
    }

    @Import(name="to")
    private @Nullable Output<String> to;

    public Optional<Output<String>> to() {
        return Optional.ofNullable(this.to);
    }

    private WorkerScriptMigrationsTransferredClassArgs() {}

    private WorkerScriptMigrationsTransferredClassArgs(WorkerScriptMigrationsTransferredClassArgs $) {
        this.from = $.from;
        this.fromScript = $.fromScript;
        this.to = $.to;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkerScriptMigrationsTransferredClassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkerScriptMigrationsTransferredClassArgs $;

        public Builder() {
            $ = new WorkerScriptMigrationsTransferredClassArgs();
        }

        public Builder(WorkerScriptMigrationsTransferredClassArgs defaults) {
            $ = new WorkerScriptMigrationsTransferredClassArgs(Objects.requireNonNull(defaults));
        }

        public Builder from(@Nullable Output<String> from) {
            $.from = from;
            return this;
        }

        public Builder from(String from) {
            return from(Output.of(from));
        }

        public Builder fromScript(@Nullable Output<String> fromScript) {
            $.fromScript = fromScript;
            return this;
        }

        public Builder fromScript(String fromScript) {
            return fromScript(Output.of(fromScript));
        }

        public Builder to(@Nullable Output<String> to) {
            $.to = to;
            return this;
        }

        public Builder to(String to) {
            return to(Output.of(to));
        }

        public WorkerScriptMigrationsTransferredClassArgs build() {
            return $;
        }
    }

}
