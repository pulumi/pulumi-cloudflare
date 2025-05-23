// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPagesDomainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPagesDomainArgs Empty = new GetPagesDomainArgs();

    /**
     * Identifier
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Identifier
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Name of the domain.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return Name of the domain.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * Name of the project.
     * 
     */
    @Import(name="projectName", required=true)
    private Output<String> projectName;

    /**
     * @return Name of the project.
     * 
     */
    public Output<String> projectName() {
        return this.projectName;
    }

    private GetPagesDomainArgs() {}

    private GetPagesDomainArgs(GetPagesDomainArgs $) {
        this.accountId = $.accountId;
        this.domainName = $.domainName;
        this.projectName = $.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPagesDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPagesDomainArgs $;

        public Builder() {
            $ = new GetPagesDomainArgs();
        }

        public Builder(GetPagesDomainArgs defaults) {
            $ = new GetPagesDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Identifier
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Identifier
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param domainName Name of the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName Name of the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param projectName Name of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectName(Output<String> projectName) {
            $.projectName = projectName;
            return this;
        }

        /**
         * @param projectName Name of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectName(String projectName) {
            return projectName(Output.of(projectName));
        }

        public GetPagesDomainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetPagesDomainArgs", "accountId");
            }
            if ($.projectName == null) {
                throw new MissingRequiredPropertyException("GetPagesDomainArgs", "projectName");
            }
            return $;
        }
    }

}
