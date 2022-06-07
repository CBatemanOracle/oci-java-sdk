/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.requests;

import com.oracle.bmc.operatoraccesscontrol.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/operatoraccesscontrol/UpdateOperatorControlExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateOperatorControlRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class UpdateOperatorControlRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.operatoraccesscontrol.model.UpdateOperatorControlDetails> {

    /**
     * unique OperatorControl identifier
     */
    private String operatorControlId;

    public String getOperatorControlId() {
        return operatorControlId;
    }
    /**
     * Details for the new OperatorControl.
     */
    private com.oracle.bmc.operatoraccesscontrol.model.UpdateOperatorControlDetails
            updateOperatorControlDetails;

    public com.oracle.bmc.operatoraccesscontrol.model.UpdateOperatorControlDetails
            getUpdateOperatorControlDetails() {
        return updateOperatorControlDetails;
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
     * The client request ID for tracing.
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
    public com.oracle.bmc.operatoraccesscontrol.model.UpdateOperatorControlDetails getBody$() {
        return updateOperatorControlDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateOperatorControlRequest,
                    com.oracle.bmc.operatoraccesscontrol.model.UpdateOperatorControlDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String operatorControlId = null;

        /**
         * unique OperatorControl identifier
         * @return this builder instance
         */
        public Builder operatorControlId(String operatorControlId) {
            this.operatorControlId = operatorControlId;
            return this;
        }

        private com.oracle.bmc.operatoraccesscontrol.model.UpdateOperatorControlDetails
                updateOperatorControlDetails = null;

        /**
         * Details for the new OperatorControl.
         * @return this builder instance
         */
        public Builder updateOperatorControlDetails(
                com.oracle.bmc.operatoraccesscontrol.model.UpdateOperatorControlDetails
                        updateOperatorControlDetails) {
            this.updateOperatorControlDetails = updateOperatorControlDetails;
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
         * The client request ID for tracing.
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
        public Builder copy(UpdateOperatorControlRequest o) {
            operatorControlId(o.getOperatorControlId());
            updateOperatorControlDetails(o.getUpdateOperatorControlDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateOperatorControlRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateOperatorControlRequest
         */
        public UpdateOperatorControlRequest build() {
            UpdateOperatorControlRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.operatoraccesscontrol.model.UpdateOperatorControlDetails body) {
            updateOperatorControlDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateOperatorControlRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateOperatorControlRequest
         */
        public UpdateOperatorControlRequest buildWithoutInvocationCallback() {
            UpdateOperatorControlRequest request = new UpdateOperatorControlRequest();
            request.operatorControlId = operatorControlId;
            request.updateOperatorControlDetails = updateOperatorControlDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateOperatorControlRequest(operatorControlId, updateOperatorControlDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .operatorControlId(operatorControlId)
                .updateOperatorControlDetails(updateOperatorControlDetails)
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
        sb.append(",operatorControlId=").append(String.valueOf(this.operatorControlId));
        sb.append(",updateOperatorControlDetails=")
                .append(String.valueOf(this.updateOperatorControlDetails));
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
        if (!(o instanceof UpdateOperatorControlRequest)) {
            return false;
        }

        UpdateOperatorControlRequest other = (UpdateOperatorControlRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.operatorControlId, other.operatorControlId)
                && java.util.Objects.equals(
                        this.updateOperatorControlDetails, other.updateOperatorControlDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.operatorControlId == null ? 43 : this.operatorControlId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateOperatorControlDetails == null
                                ? 43
                                : this.updateOperatorControlDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
