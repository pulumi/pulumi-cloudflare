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


public final class CustomHostnameSslValidationRecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomHostnameSslValidationRecordArgs Empty = new CustomHostnameSslValidationRecordArgs();

    @Import(name="cnameName")
    private @Nullable Output<String> cnameName;

    public Optional<Output<String>> cnameName() {
        return Optional.ofNullable(this.cnameName);
    }

    @Import(name="cnameTarget")
    private @Nullable Output<String> cnameTarget;

    public Optional<Output<String>> cnameTarget() {
        return Optional.ofNullable(this.cnameTarget);
    }

    @Import(name="emails")
    private @Nullable Output<List<String>> emails;

    public Optional<Output<List<String>>> emails() {
        return Optional.ofNullable(this.emails);
    }

    @Import(name="httpBody")
    private @Nullable Output<String> httpBody;

    public Optional<Output<String>> httpBody() {
        return Optional.ofNullable(this.httpBody);
    }

    @Import(name="httpUrl")
    private @Nullable Output<String> httpUrl;

    public Optional<Output<String>> httpUrl() {
        return Optional.ofNullable(this.httpUrl);
    }

    @Import(name="txtName")
    private @Nullable Output<String> txtName;

    public Optional<Output<String>> txtName() {
        return Optional.ofNullable(this.txtName);
    }

    @Import(name="txtValue")
    private @Nullable Output<String> txtValue;

    public Optional<Output<String>> txtValue() {
        return Optional.ofNullable(this.txtValue);
    }

    private CustomHostnameSslValidationRecordArgs() {}

    private CustomHostnameSslValidationRecordArgs(CustomHostnameSslValidationRecordArgs $) {
        this.cnameName = $.cnameName;
        this.cnameTarget = $.cnameTarget;
        this.emails = $.emails;
        this.httpBody = $.httpBody;
        this.httpUrl = $.httpUrl;
        this.txtName = $.txtName;
        this.txtValue = $.txtValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomHostnameSslValidationRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomHostnameSslValidationRecordArgs $;

        public Builder() {
            $ = new CustomHostnameSslValidationRecordArgs();
        }

        public Builder(CustomHostnameSslValidationRecordArgs defaults) {
            $ = new CustomHostnameSslValidationRecordArgs(Objects.requireNonNull(defaults));
        }

        public Builder cnameName(@Nullable Output<String> cnameName) {
            $.cnameName = cnameName;
            return this;
        }

        public Builder cnameName(String cnameName) {
            return cnameName(Output.of(cnameName));
        }

        public Builder cnameTarget(@Nullable Output<String> cnameTarget) {
            $.cnameTarget = cnameTarget;
            return this;
        }

        public Builder cnameTarget(String cnameTarget) {
            return cnameTarget(Output.of(cnameTarget));
        }

        public Builder emails(@Nullable Output<List<String>> emails) {
            $.emails = emails;
            return this;
        }

        public Builder emails(List<String> emails) {
            return emails(Output.of(emails));
        }

        public Builder emails(String... emails) {
            return emails(List.of(emails));
        }

        public Builder httpBody(@Nullable Output<String> httpBody) {
            $.httpBody = httpBody;
            return this;
        }

        public Builder httpBody(String httpBody) {
            return httpBody(Output.of(httpBody));
        }

        public Builder httpUrl(@Nullable Output<String> httpUrl) {
            $.httpUrl = httpUrl;
            return this;
        }

        public Builder httpUrl(String httpUrl) {
            return httpUrl(Output.of(httpUrl));
        }

        public Builder txtName(@Nullable Output<String> txtName) {
            $.txtName = txtName;
            return this;
        }

        public Builder txtName(String txtName) {
            return txtName(Output.of(txtName));
        }

        public Builder txtValue(@Nullable Output<String> txtValue) {
            $.txtValue = txtValue;
            return this;
        }

        public Builder txtValue(String txtValue) {
            return txtValue(Output.of(txtValue));
        }

        public CustomHostnameSslValidationRecordArgs build() {
            return $;
        }
    }

}
