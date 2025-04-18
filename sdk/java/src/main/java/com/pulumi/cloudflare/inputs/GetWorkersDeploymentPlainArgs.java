// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetWorkersDeploymentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkersDeploymentPlainArgs Empty = new GetWorkersDeploymentPlainArgs();

    /**
     * Identifier.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return Identifier.
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * Name of the script.
     * 
     */
    @Import(name="scriptName", required=true)
    private String scriptName;

    /**
     * @return Name of the script.
     * 
     */
    public String scriptName() {
        return this.scriptName;
    }

    private GetWorkersDeploymentPlainArgs() {}

    private GetWorkersDeploymentPlainArgs(GetWorkersDeploymentPlainArgs $) {
        this.accountId = $.accountId;
        this.scriptName = $.scriptName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkersDeploymentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkersDeploymentPlainArgs $;

        public Builder() {
            $ = new GetWorkersDeploymentPlainArgs();
        }

        public Builder(GetWorkersDeploymentPlainArgs defaults) {
            $ = new GetWorkersDeploymentPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Identifier.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param scriptName Name of the script.
         * 
         * @return builder
         * 
         */
        public Builder scriptName(String scriptName) {
            $.scriptName = scriptName;
            return this;
        }

        public GetWorkersDeploymentPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetWorkersDeploymentPlainArgs", "accountId");
            }
            if ($.scriptName == null) {
                throw new MissingRequiredPropertyException("GetWorkersDeploymentPlainArgs", "scriptName");
            }
            return $;
        }
    }

}
