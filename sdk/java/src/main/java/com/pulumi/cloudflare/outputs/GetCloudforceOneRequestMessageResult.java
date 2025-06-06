// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCloudforceOneRequestMessageResult {
    /**
     * @return Identifier
     * 
     */
    private String accountIdentifier;
    /**
     * @return Author of message
     * 
     */
    private String author;
    /**
     * @return Content of message
     * 
     */
    private String content;
    /**
     * @return Message creation time
     * 
     */
    private String created;
    /**
     * @return Message ID
     * 
     */
    private Integer id;
    /**
     * @return Whether the message is a follow-on request
     * 
     */
    private Boolean isFollowOnRequest;
    /**
     * @return UUID
     * 
     */
    private String requestIdentifier;
    /**
     * @return Message last updated time
     * 
     */
    private String updated;

    private GetCloudforceOneRequestMessageResult() {}
    /**
     * @return Identifier
     * 
     */
    public String accountIdentifier() {
        return this.accountIdentifier;
    }
    /**
     * @return Author of message
     * 
     */
    public String author() {
        return this.author;
    }
    /**
     * @return Content of message
     * 
     */
    public String content() {
        return this.content;
    }
    /**
     * @return Message creation time
     * 
     */
    public String created() {
        return this.created;
    }
    /**
     * @return Message ID
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return Whether the message is a follow-on request
     * 
     */
    public Boolean isFollowOnRequest() {
        return this.isFollowOnRequest;
    }
    /**
     * @return UUID
     * 
     */
    public String requestIdentifier() {
        return this.requestIdentifier;
    }
    /**
     * @return Message last updated time
     * 
     */
    public String updated() {
        return this.updated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudforceOneRequestMessageResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountIdentifier;
        private String author;
        private String content;
        private String created;
        private Integer id;
        private Boolean isFollowOnRequest;
        private String requestIdentifier;
        private String updated;
        public Builder() {}
        public Builder(GetCloudforceOneRequestMessageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountIdentifier = defaults.accountIdentifier;
    	      this.author = defaults.author;
    	      this.content = defaults.content;
    	      this.created = defaults.created;
    	      this.id = defaults.id;
    	      this.isFollowOnRequest = defaults.isFollowOnRequest;
    	      this.requestIdentifier = defaults.requestIdentifier;
    	      this.updated = defaults.updated;
        }

        @CustomType.Setter
        public Builder accountIdentifier(String accountIdentifier) {
            if (accountIdentifier == null) {
              throw new MissingRequiredPropertyException("GetCloudforceOneRequestMessageResult", "accountIdentifier");
            }
            this.accountIdentifier = accountIdentifier;
            return this;
        }
        @CustomType.Setter
        public Builder author(String author) {
            if (author == null) {
              throw new MissingRequiredPropertyException("GetCloudforceOneRequestMessageResult", "author");
            }
            this.author = author;
            return this;
        }
        @CustomType.Setter
        public Builder content(String content) {
            if (content == null) {
              throw new MissingRequiredPropertyException("GetCloudforceOneRequestMessageResult", "content");
            }
            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder created(String created) {
            if (created == null) {
              throw new MissingRequiredPropertyException("GetCloudforceOneRequestMessageResult", "created");
            }
            this.created = created;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCloudforceOneRequestMessageResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isFollowOnRequest(Boolean isFollowOnRequest) {
            if (isFollowOnRequest == null) {
              throw new MissingRequiredPropertyException("GetCloudforceOneRequestMessageResult", "isFollowOnRequest");
            }
            this.isFollowOnRequest = isFollowOnRequest;
            return this;
        }
        @CustomType.Setter
        public Builder requestIdentifier(String requestIdentifier) {
            if (requestIdentifier == null) {
              throw new MissingRequiredPropertyException("GetCloudforceOneRequestMessageResult", "requestIdentifier");
            }
            this.requestIdentifier = requestIdentifier;
            return this;
        }
        @CustomType.Setter
        public Builder updated(String updated) {
            if (updated == null) {
              throw new MissingRequiredPropertyException("GetCloudforceOneRequestMessageResult", "updated");
            }
            this.updated = updated;
            return this;
        }
        public GetCloudforceOneRequestMessageResult build() {
            final var _resultValue = new GetCloudforceOneRequestMessageResult();
            _resultValue.accountIdentifier = accountIdentifier;
            _resultValue.author = author;
            _resultValue.content = content;
            _resultValue.created = created;
            _resultValue.id = id;
            _resultValue.isFollowOnRequest = isFollowOnRequest;
            _resultValue.requestIdentifier = requestIdentifier;
            _resultValue.updated = updated;
            return _resultValue;
        }
    }
}
