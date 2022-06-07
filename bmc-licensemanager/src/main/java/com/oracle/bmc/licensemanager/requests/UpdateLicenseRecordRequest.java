/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.requests;

import com.oracle.bmc.licensemanager.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/licensemanager/UpdateLicenseRecordExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateLicenseRecordRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
public class UpdateLicenseRecordRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.licensemanager.model.UpdateLicenseRecordDetails> {

    /**
     * Unique license record identifier.
     */
    private String licenseRecordId;

    public String getLicenseRecordId() {
        return licenseRecordId;
    }
    /**
     * Details to update a license record entity.
     */
    private com.oracle.bmc.licensemanager.model.UpdateLicenseRecordDetails
            updateLicenseRecordDetails;

    public com.oracle.bmc.licensemanager.model.UpdateLicenseRecordDetails
            getUpdateLicenseRecordDetails() {
        return updateLicenseRecordDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
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
    public com.oracle.bmc.licensemanager.model.UpdateLicenseRecordDetails getBody$() {
        return updateLicenseRecordDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateLicenseRecordRequest,
                    com.oracle.bmc.licensemanager.model.UpdateLicenseRecordDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String licenseRecordId = null;

        /**
         * Unique license record identifier.
         * @return this builder instance
         */
        public Builder licenseRecordId(String licenseRecordId) {
            this.licenseRecordId = licenseRecordId;
            return this;
        }

        private com.oracle.bmc.licensemanager.model.UpdateLicenseRecordDetails
                updateLicenseRecordDetails = null;

        /**
         * Details to update a license record entity.
         * @return this builder instance
         */
        public Builder updateLicenseRecordDetails(
                com.oracle.bmc.licensemanager.model.UpdateLicenseRecordDetails
                        updateLicenseRecordDetails) {
            this.updateLicenseRecordDetails = updateLicenseRecordDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(UpdateLicenseRecordRequest o) {
            licenseRecordId(o.getLicenseRecordId());
            updateLicenseRecordDetails(o.getUpdateLicenseRecordDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateLicenseRecordRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateLicenseRecordRequest
         */
        public UpdateLicenseRecordRequest build() {
            UpdateLicenseRecordRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.licensemanager.model.UpdateLicenseRecordDetails body) {
            updateLicenseRecordDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateLicenseRecordRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateLicenseRecordRequest
         */
        public UpdateLicenseRecordRequest buildWithoutInvocationCallback() {
            UpdateLicenseRecordRequest request = new UpdateLicenseRecordRequest();
            request.licenseRecordId = licenseRecordId;
            request.updateLicenseRecordDetails = updateLicenseRecordDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateLicenseRecordRequest(licenseRecordId, updateLicenseRecordDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .licenseRecordId(licenseRecordId)
                .updateLicenseRecordDetails(updateLicenseRecordDetails)
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
        sb.append(",licenseRecordId=").append(String.valueOf(this.licenseRecordId));
        sb.append(",updateLicenseRecordDetails=")
                .append(String.valueOf(this.updateLicenseRecordDetails));
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
        if (!(o instanceof UpdateLicenseRecordRequest)) {
            return false;
        }

        UpdateLicenseRecordRequest other = (UpdateLicenseRecordRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.licenseRecordId, other.licenseRecordId)
                && java.util.Objects.equals(
                        this.updateLicenseRecordDetails, other.updateLicenseRecordDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.licenseRecordId == null ? 43 : this.licenseRecordId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateLicenseRecordDetails == null
                                ? 43
                                : this.updateLicenseRecordDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
