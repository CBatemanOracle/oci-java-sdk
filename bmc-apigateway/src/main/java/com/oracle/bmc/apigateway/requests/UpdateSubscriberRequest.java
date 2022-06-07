/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.requests;

import com.oracle.bmc.apigateway.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apigateway/UpdateSubscriberExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateSubscriberRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
public class UpdateSubscriberRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.apigateway.model.UpdateSubscriberDetails> {

    /**
     * The ocid of the subscriber.
     */
    private String subscriberId;

    public String getSubscriberId() {
        return subscriberId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.apigateway.model.UpdateSubscriberDetails updateSubscriberDetails;

    public com.oracle.bmc.apigateway.model.UpdateSubscriberDetails getUpdateSubscriberDetails() {
        return updateSubscriberDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The client request id for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.apigateway.model.UpdateSubscriberDetails getBody$() {
        return updateSubscriberDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateSubscriberRequest,
                    com.oracle.bmc.apigateway.model.UpdateSubscriberDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String subscriberId = null;

        /**
         * The ocid of the subscriber.
         * @return this builder instance
         */
        public Builder subscriberId(String subscriberId) {
            this.subscriberId = subscriberId;
            return this;
        }

        private com.oracle.bmc.apigateway.model.UpdateSubscriberDetails updateSubscriberDetails =
                null;

        /**
         * The information to be updated.
         * @return this builder instance
         */
        public Builder updateSubscriberDetails(
                com.oracle.bmc.apigateway.model.UpdateSubscriberDetails updateSubscriberDetails) {
            this.updateSubscriberDetails = updateSubscriberDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The client request id for tracing.
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateSubscriberRequest o) {
            subscriberId(o.getSubscriberId());
            updateSubscriberDetails(o.getUpdateSubscriberDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateSubscriberRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateSubscriberRequest
         */
        public UpdateSubscriberRequest build() {
            UpdateSubscriberRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.apigateway.model.UpdateSubscriberDetails body) {
            updateSubscriberDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateSubscriberRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateSubscriberRequest
         */
        public UpdateSubscriberRequest buildWithoutInvocationCallback() {
            UpdateSubscriberRequest request = new UpdateSubscriberRequest();
            request.subscriberId = subscriberId;
            request.updateSubscriberDetails = updateSubscriberDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateSubscriberRequest(subscriberId, updateSubscriberDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .subscriberId(subscriberId)
                .updateSubscriberDetails(updateSubscriberDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",subscriberId=").append(String.valueOf(this.subscriberId));
        sb.append(",updateSubscriberDetails=").append(String.valueOf(this.updateSubscriberDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSubscriberRequest)) {
            return false;
        }

        UpdateSubscriberRequest other = (UpdateSubscriberRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.subscriberId, other.subscriberId)
                && java.util.Objects.equals(
                        this.updateSubscriberDetails, other.updateSubscriberDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.subscriberId == null ? 43 : this.subscriberId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateSubscriberDetails == null
                                ? 43
                                : this.updateSubscriberDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
