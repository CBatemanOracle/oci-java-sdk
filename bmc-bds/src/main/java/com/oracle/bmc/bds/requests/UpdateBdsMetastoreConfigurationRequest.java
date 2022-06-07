/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.requests;

import com.oracle.bmc.bds.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/UpdateBdsMetastoreConfigurationExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateBdsMetastoreConfigurationRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
public class UpdateBdsMetastoreConfigurationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.bds.model.UpdateBdsMetastoreConfigurationDetails> {

    /**
     * The OCID of the cluster.
     */
    private String bdsInstanceId;

    public String getBdsInstanceId() {
        return bdsInstanceId;
    }
    /**
     * The metastore configuration ID
     */
    private String metastoreConfigId;

    public String getMetastoreConfigId() {
        return metastoreConfigId;
    }
    /**
     * Request body for updating BDS metastore configuration.
     */
    private com.oracle.bmc.bds.model.UpdateBdsMetastoreConfigurationDetails
            updateBdsMetastoreConfigurationDetails;

    public com.oracle.bmc.bds.model.UpdateBdsMetastoreConfigurationDetails
            getUpdateBdsMetastoreConfigurationDetails() {
        return updateBdsMetastoreConfigurationDetails;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
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
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.bds.model.UpdateBdsMetastoreConfigurationDetails getBody$() {
        return updateBdsMetastoreConfigurationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateBdsMetastoreConfigurationRequest,
                    com.oracle.bmc.bds.model.UpdateBdsMetastoreConfigurationDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String bdsInstanceId = null;

        /**
         * The OCID of the cluster.
         * @return this builder instance
         */
        public Builder bdsInstanceId(String bdsInstanceId) {
            this.bdsInstanceId = bdsInstanceId;
            return this;
        }

        private String metastoreConfigId = null;

        /**
         * The metastore configuration ID
         * @return this builder instance
         */
        public Builder metastoreConfigId(String metastoreConfigId) {
            this.metastoreConfigId = metastoreConfigId;
            return this;
        }

        private com.oracle.bmc.bds.model.UpdateBdsMetastoreConfigurationDetails
                updateBdsMetastoreConfigurationDetails = null;

        /**
         * Request body for updating BDS metastore configuration.
         * @return this builder instance
         */
        public Builder updateBdsMetastoreConfigurationDetails(
                com.oracle.bmc.bds.model.UpdateBdsMetastoreConfigurationDetails
                        updateBdsMetastoreConfigurationDetails) {
            this.updateBdsMetastoreConfigurationDetails = updateBdsMetastoreConfigurationDetails;
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
        public Builder copy(UpdateBdsMetastoreConfigurationRequest o) {
            bdsInstanceId(o.getBdsInstanceId());
            metastoreConfigId(o.getMetastoreConfigId());
            updateBdsMetastoreConfigurationDetails(o.getUpdateBdsMetastoreConfigurationDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateBdsMetastoreConfigurationRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateBdsMetastoreConfigurationRequest
         */
        public UpdateBdsMetastoreConfigurationRequest build() {
            UpdateBdsMetastoreConfigurationRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.bds.model.UpdateBdsMetastoreConfigurationDetails body) {
            updateBdsMetastoreConfigurationDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateBdsMetastoreConfigurationRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateBdsMetastoreConfigurationRequest
         */
        public UpdateBdsMetastoreConfigurationRequest buildWithoutInvocationCallback() {
            UpdateBdsMetastoreConfigurationRequest request =
                    new UpdateBdsMetastoreConfigurationRequest();
            request.bdsInstanceId = bdsInstanceId;
            request.metastoreConfigId = metastoreConfigId;
            request.updateBdsMetastoreConfigurationDetails = updateBdsMetastoreConfigurationDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateBdsMetastoreConfigurationRequest(bdsInstanceId, metastoreConfigId, updateBdsMetastoreConfigurationDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .bdsInstanceId(bdsInstanceId)
                .metastoreConfigId(metastoreConfigId)
                .updateBdsMetastoreConfigurationDetails(updateBdsMetastoreConfigurationDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",bdsInstanceId=").append(String.valueOf(this.bdsInstanceId));
        sb.append(",metastoreConfigId=").append(String.valueOf(this.metastoreConfigId));
        sb.append(",updateBdsMetastoreConfigurationDetails=")
                .append(String.valueOf(this.updateBdsMetastoreConfigurationDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateBdsMetastoreConfigurationRequest)) {
            return false;
        }

        UpdateBdsMetastoreConfigurationRequest other = (UpdateBdsMetastoreConfigurationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.bdsInstanceId, other.bdsInstanceId)
                && java.util.Objects.equals(this.metastoreConfigId, other.metastoreConfigId)
                && java.util.Objects.equals(
                        this.updateBdsMetastoreConfigurationDetails,
                        other.updateBdsMetastoreConfigurationDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.bdsInstanceId == null ? 43 : this.bdsInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.metastoreConfigId == null ? 43 : this.metastoreConfigId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateBdsMetastoreConfigurationDetails == null
                                ? 43
                                : this.updateBdsMetastoreConfigurationDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
