/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault.requests;

import com.oracle.bmc.vault.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/vault/ScheduleSecretDeletionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ScheduleSecretDeletionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
public class ScheduleSecretDeletionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.vault.model.ScheduleSecretDeletionDetails> {

    /** The OCID of the secret. */
    private String secretId;

    /** The OCID of the secret. */
    public String getSecretId() {
        return secretId;
    }
    /** Request to schedule the deletion of a secret. */
    private com.oracle.bmc.vault.model.ScheduleSecretDeletionDetails scheduleSecretDeletionDetails;

    /** Request to schedule the deletion of a secret. */
    public com.oracle.bmc.vault.model.ScheduleSecretDeletionDetails
            getScheduleSecretDeletionDetails() {
        return scheduleSecretDeletionDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request. If provided, the returned request ID will include this
     * value. Otherwise, a random request ID will be generated by the service.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If provided, the returned request ID will include this
     * value. Otherwise, a random request ID will be generated by the service.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.vault.model.ScheduleSecretDeletionDetails getBody$() {
        return scheduleSecretDeletionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ScheduleSecretDeletionRequest,
                    com.oracle.bmc.vault.model.ScheduleSecretDeletionDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the secret. */
        private String secretId = null;

        /**
         * The OCID of the secret.
         *
         * @param secretId the value to set
         * @return this builder instance
         */
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            return this;
        }

        /** Request to schedule the deletion of a secret. */
        private com.oracle.bmc.vault.model.ScheduleSecretDeletionDetails
                scheduleSecretDeletionDetails = null;

        /**
         * Request to schedule the deletion of a secret.
         *
         * @param scheduleSecretDeletionDetails the value to set
         * @return this builder instance
         */
        public Builder scheduleSecretDeletionDetails(
                com.oracle.bmc.vault.model.ScheduleSecretDeletionDetails
                        scheduleSecretDeletionDetails) {
            this.scheduleSecretDeletionDetails = scheduleSecretDeletionDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique identifier for the request. If provided, the returned request ID will include this
         * value. Otherwise, a random request ID will be generated by the service.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If provided, the returned request ID will include this
         * value. Otherwise, a random request ID will be generated by the service.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
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
         *
         * @return this builder instance
         */
        public Builder copy(ScheduleSecretDeletionRequest o) {
            secretId(o.getSecretId());
            scheduleSecretDeletionDetails(o.getScheduleSecretDeletionDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ScheduleSecretDeletionRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ScheduleSecretDeletionRequest
         */
        public ScheduleSecretDeletionRequest build() {
            ScheduleSecretDeletionRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.vault.model.ScheduleSecretDeletionDetails body) {
            scheduleSecretDeletionDetails(body);
            return this;
        }

        /**
         * Build the instance of ScheduleSecretDeletionRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ScheduleSecretDeletionRequest
         */
        public ScheduleSecretDeletionRequest buildWithoutInvocationCallback() {
            ScheduleSecretDeletionRequest request = new ScheduleSecretDeletionRequest();
            request.secretId = secretId;
            request.scheduleSecretDeletionDetails = scheduleSecretDeletionDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ScheduleSecretDeletionRequest(secretId, scheduleSecretDeletionDetails, ifMatch,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .secretId(secretId)
                .scheduleSecretDeletionDetails(scheduleSecretDeletionDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",secretId=").append(String.valueOf(this.secretId));
        sb.append(",scheduleSecretDeletionDetails=")
                .append(String.valueOf(this.scheduleSecretDeletionDetails));
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
        if (!(o instanceof ScheduleSecretDeletionRequest)) {
            return false;
        }

        ScheduleSecretDeletionRequest other = (ScheduleSecretDeletionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.secretId, other.secretId)
                && java.util.Objects.equals(
                        this.scheduleSecretDeletionDetails, other.scheduleSecretDeletionDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleSecretDeletionDetails == null
                                ? 43
                                : this.scheduleSecretDeletionDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
