/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.requests;

import com.oracle.bmc.logging.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/logging/ChangeLogSavedSearchCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeLogSavedSearchCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
public class ChangeLogSavedSearchCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.logging.model.ChangeLogSavedSearchCompartmentDetails> {

    /**
     * OCID of the logSavedSearch
     *
     */
    private String logSavedSearchId;

    public String getLogSavedSearchId() {
        return logSavedSearchId;
    }
    /**
     * Contains details indicating which compartment the resource should move to.
     */
    private com.oracle.bmc.logging.model.ChangeLogSavedSearchCompartmentDetails
            changeLogSavedSearchCompartmentDetails;

    public com.oracle.bmc.logging.model.ChangeLogSavedSearchCompartmentDetails
            getChangeLogSavedSearchCompartmentDetails() {
        return changeLogSavedSearchCompartmentDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case
     * of a timeout or server error, without risk of executing that same action
     * again. Retry tokens expire after 24 hours, but can be invalidated
     * before then due to conflicting operations (e.g., if a resource has been
     * deleted and purged from the system, then a retry of the original
     * creation request may be rejected).
     *
     */
    private String opcRetryToken;

    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a
     * resource, set the {@code if-match} parameter to the value of the etag from a
     * previous GET or POST response for that resource. The resource will be
     * updated or deleted only if the etag you provide matches the resource's
     * current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
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
    public com.oracle.bmc.logging.model.ChangeLogSavedSearchCompartmentDetails getBody$() {
        return changeLogSavedSearchCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeLogSavedSearchCompartmentRequest,
                    com.oracle.bmc.logging.model.ChangeLogSavedSearchCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String logSavedSearchId = null;

        /**
         * OCID of the logSavedSearch
         *
         * @return this builder instance
         */
        public Builder logSavedSearchId(String logSavedSearchId) {
            this.logSavedSearchId = logSavedSearchId;
            return this;
        }

        private com.oracle.bmc.logging.model.ChangeLogSavedSearchCompartmentDetails
                changeLogSavedSearchCompartmentDetails = null;

        /**
         * Contains details indicating which compartment the resource should move to.
         * @return this builder instance
         */
        public Builder changeLogSavedSearchCompartmentDetails(
                com.oracle.bmc.logging.model.ChangeLogSavedSearchCompartmentDetails
                        changeLogSavedSearchCompartmentDetails) {
            this.changeLogSavedSearchCompartmentDetails = changeLogSavedSearchCompartmentDetails;
            return this;
        }

        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case
         * of a timeout or server error, without risk of executing that same action
         * again. Retry tokens expire after 24 hours, but can be invalidated
         * before then due to conflicting operations (e.g., if a resource has been
         * deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         *
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a
         * previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's
         * current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         *
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
        public Builder copy(ChangeLogSavedSearchCompartmentRequest o) {
            logSavedSearchId(o.getLogSavedSearchId());
            changeLogSavedSearchCompartmentDetails(o.getChangeLogSavedSearchCompartmentDetails());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeLogSavedSearchCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeLogSavedSearchCompartmentRequest
         */
        public ChangeLogSavedSearchCompartmentRequest build() {
            ChangeLogSavedSearchCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.logging.model.ChangeLogSavedSearchCompartmentDetails body) {
            changeLogSavedSearchCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeLogSavedSearchCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeLogSavedSearchCompartmentRequest
         */
        public ChangeLogSavedSearchCompartmentRequest buildWithoutInvocationCallback() {
            ChangeLogSavedSearchCompartmentRequest request =
                    new ChangeLogSavedSearchCompartmentRequest();
            request.logSavedSearchId = logSavedSearchId;
            request.changeLogSavedSearchCompartmentDetails = changeLogSavedSearchCompartmentDetails;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeLogSavedSearchCompartmentRequest(logSavedSearchId, changeLogSavedSearchCompartmentDetails, opcRetryToken, ifMatch, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .logSavedSearchId(logSavedSearchId)
                .changeLogSavedSearchCompartmentDetails(changeLogSavedSearchCompartmentDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",logSavedSearchId=").append(String.valueOf(this.logSavedSearchId));
        sb.append(",changeLogSavedSearchCompartmentDetails=")
                .append(String.valueOf(this.changeLogSavedSearchCompartmentDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
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
        if (!(o instanceof ChangeLogSavedSearchCompartmentRequest)) {
            return false;
        }

        ChangeLogSavedSearchCompartmentRequest other = (ChangeLogSavedSearchCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.logSavedSearchId, other.logSavedSearchId)
                && java.util.Objects.equals(
                        this.changeLogSavedSearchCompartmentDetails,
                        other.changeLogSavedSearchCompartmentDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.logSavedSearchId == null ? 43 : this.logSavedSearchId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeLogSavedSearchCompartmentDetails == null
                                ? 43
                                : this.changeLogSavedSearchCompartmentDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
