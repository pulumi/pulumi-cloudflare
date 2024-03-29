// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerRuleFixedResponseArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerRuleFixedResponseArgs Empty = new LoadBalancerRuleFixedResponseArgs();

    /**
     * The value of the HTTP context-type header for this fixed response.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    /**
     * @return The value of the HTTP context-type header for this fixed response.
     * 
     */
    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * The value of the HTTP location header for this fixed response.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The value of the HTTP location header for this fixed response.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The text used as the html body for this fixed response.
     * 
     */
    @Import(name="messageBody")
    private @Nullable Output<String> messageBody;

    /**
     * @return The text used as the html body for this fixed response.
     * 
     */
    public Optional<Output<String>> messageBody() {
        return Optional.ofNullable(this.messageBody);
    }

    /**
     * The HTTP status code used for this fixed response.
     * 
     */
    @Import(name="statusCode")
    private @Nullable Output<Integer> statusCode;

    /**
     * @return The HTTP status code used for this fixed response.
     * 
     */
    public Optional<Output<Integer>> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }

    private LoadBalancerRuleFixedResponseArgs() {}

    private LoadBalancerRuleFixedResponseArgs(LoadBalancerRuleFixedResponseArgs $) {
        this.contentType = $.contentType;
        this.location = $.location;
        this.messageBody = $.messageBody;
        this.statusCode = $.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerRuleFixedResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerRuleFixedResponseArgs $;

        public Builder() {
            $ = new LoadBalancerRuleFixedResponseArgs();
        }

        public Builder(LoadBalancerRuleFixedResponseArgs defaults) {
            $ = new LoadBalancerRuleFixedResponseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentType The value of the HTTP context-type header for this fixed response.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType The value of the HTTP context-type header for this fixed response.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param location The value of the HTTP location header for this fixed response.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The value of the HTTP location header for this fixed response.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param messageBody The text used as the html body for this fixed response.
         * 
         * @return builder
         * 
         */
        public Builder messageBody(@Nullable Output<String> messageBody) {
            $.messageBody = messageBody;
            return this;
        }

        /**
         * @param messageBody The text used as the html body for this fixed response.
         * 
         * @return builder
         * 
         */
        public Builder messageBody(String messageBody) {
            return messageBody(Output.of(messageBody));
        }

        /**
         * @param statusCode The HTTP status code used for this fixed response.
         * 
         * @return builder
         * 
         */
        public Builder statusCode(@Nullable Output<Integer> statusCode) {
            $.statusCode = statusCode;
            return this;
        }

        /**
         * @param statusCode The HTTP status code used for this fixed response.
         * 
         * @return builder
         * 
         */
        public Builder statusCode(Integer statusCode) {
            return statusCode(Output.of(statusCode));
        }

        public LoadBalancerRuleFixedResponseArgs build() {
            return $;
        }
    }

}
