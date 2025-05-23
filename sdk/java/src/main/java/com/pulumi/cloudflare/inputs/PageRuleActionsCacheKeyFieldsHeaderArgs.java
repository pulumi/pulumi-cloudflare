// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PageRuleActionsCacheKeyFieldsHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final PageRuleActionsCacheKeyFieldsHeaderArgs Empty = new PageRuleActionsCacheKeyFieldsHeaderArgs();

    @Import(name="checkPresences")
    private @Nullable Output<List<String>> checkPresences;

    public Optional<Output<List<String>>> checkPresences() {
        return Optional.ofNullable(this.checkPresences);
    }

    @Import(name="excludes")
    private @Nullable Output<List<String>> excludes;

    public Optional<Output<List<String>>> excludes() {
        return Optional.ofNullable(this.excludes);
    }

    @Import(name="includes")
    private @Nullable Output<List<String>> includes;

    public Optional<Output<List<String>>> includes() {
        return Optional.ofNullable(this.includes);
    }

    private PageRuleActionsCacheKeyFieldsHeaderArgs() {}

    private PageRuleActionsCacheKeyFieldsHeaderArgs(PageRuleActionsCacheKeyFieldsHeaderArgs $) {
        this.checkPresences = $.checkPresences;
        this.excludes = $.excludes;
        this.includes = $.includes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PageRuleActionsCacheKeyFieldsHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PageRuleActionsCacheKeyFieldsHeaderArgs $;

        public Builder() {
            $ = new PageRuleActionsCacheKeyFieldsHeaderArgs();
        }

        public Builder(PageRuleActionsCacheKeyFieldsHeaderArgs defaults) {
            $ = new PageRuleActionsCacheKeyFieldsHeaderArgs(Objects.requireNonNull(defaults));
        }

        public Builder checkPresences(@Nullable Output<List<String>> checkPresences) {
            $.checkPresences = checkPresences;
            return this;
        }

        public Builder checkPresences(List<String> checkPresences) {
            return checkPresences(Output.of(checkPresences));
        }

        public Builder checkPresences(String... checkPresences) {
            return checkPresences(List.of(checkPresences));
        }

        public Builder excludes(@Nullable Output<List<String>> excludes) {
            $.excludes = excludes;
            return this;
        }

        public Builder excludes(List<String> excludes) {
            return excludes(Output.of(excludes));
        }

        public Builder excludes(String... excludes) {
            return excludes(List.of(excludes));
        }

        public Builder includes(@Nullable Output<List<String>> includes) {
            $.includes = includes;
            return this;
        }

        public Builder includes(List<String> includes) {
            return includes(Output.of(includes));
        }

        public Builder includes(String... includes) {
            return includes(List.of(includes));
        }

        public PageRuleActionsCacheKeyFieldsHeaderArgs build() {
            return $;
        }
    }

}
