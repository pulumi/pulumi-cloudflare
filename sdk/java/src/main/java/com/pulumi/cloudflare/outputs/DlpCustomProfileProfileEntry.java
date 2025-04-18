// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.DlpCustomProfileProfileEntryPattern;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DlpCustomProfileProfileEntry {
    private Boolean enabled;
    private String name;
    private @Nullable DlpCustomProfileProfileEntryPattern pattern;
    private @Nullable List<String> words;

    private DlpCustomProfileProfileEntry() {}
    public Boolean enabled() {
        return this.enabled;
    }
    public String name() {
        return this.name;
    }
    public Optional<DlpCustomProfileProfileEntryPattern> pattern() {
        return Optional.ofNullable(this.pattern);
    }
    public List<String> words() {
        return this.words == null ? List.of() : this.words;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DlpCustomProfileProfileEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String name;
        private @Nullable DlpCustomProfileProfileEntryPattern pattern;
        private @Nullable List<String> words;
        public Builder() {}
        public Builder(DlpCustomProfileProfileEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.name = defaults.name;
    	      this.pattern = defaults.pattern;
    	      this.words = defaults.words;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("DlpCustomProfileProfileEntry", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("DlpCustomProfileProfileEntry", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder pattern(@Nullable DlpCustomProfileProfileEntryPattern pattern) {

            this.pattern = pattern;
            return this;
        }
        @CustomType.Setter
        public Builder words(@Nullable List<String> words) {

            this.words = words;
            return this;
        }
        public Builder words(String... words) {
            return words(List.of(words));
        }
        public DlpCustomProfileProfileEntry build() {
            final var _resultValue = new DlpCustomProfileProfileEntry();
            _resultValue.enabled = enabled;
            _resultValue.name = name;
            _resultValue.pattern = pattern;
            _resultValue.words = words;
            return _resultValue;
        }
    }
}
