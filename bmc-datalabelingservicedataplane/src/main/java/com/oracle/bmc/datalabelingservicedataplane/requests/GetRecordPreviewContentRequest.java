/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.requests;

import com.oracle.bmc.datalabelingservicedataplane.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datalabelingservicedataplane/GetRecordPreviewContentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetRecordPreviewContentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
public class GetRecordPreviewContentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the record annotated.
     */
    private String recordId;

    public String getRecordId() {
        return recordId;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the GET call
     * for a resource, set the {@code if-none-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be fetched only if the etag you provide does
     * not match the resource's current etag value.
     *
     */
    private String ifNoneMatch;

    public String getIfNoneMatch() {
        return ifNoneMatch;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetRecordPreviewContentRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String recordId = null;

        /**
         * The OCID of the record annotated.
         * @return this builder instance
         */
        public Builder recordId(String recordId) {
            this.recordId = recordId;
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

        private String ifNoneMatch = null;

        /**
         * For optimistic concurrency control. In the GET call
         * for a resource, set the {@code if-none-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be fetched only if the etag you provide does
         * not match the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifNoneMatch(String ifNoneMatch) {
            this.ifNoneMatch = ifNoneMatch;
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
        public Builder copy(GetRecordPreviewContentRequest o) {
            recordId(o.getRecordId());
            opcRequestId(o.getOpcRequestId());
            ifNoneMatch(o.getIfNoneMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetRecordPreviewContentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetRecordPreviewContentRequest
         */
        public GetRecordPreviewContentRequest build() {
            GetRecordPreviewContentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetRecordPreviewContentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetRecordPreviewContentRequest
         */
        public GetRecordPreviewContentRequest buildWithoutInvocationCallback() {
            GetRecordPreviewContentRequest request = new GetRecordPreviewContentRequest();
            request.recordId = recordId;
            request.opcRequestId = opcRequestId;
            request.ifNoneMatch = ifNoneMatch;
            return request;
            // new GetRecordPreviewContentRequest(recordId, opcRequestId, ifNoneMatch);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder().recordId(recordId).opcRequestId(opcRequestId).ifNoneMatch(ifNoneMatch);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",recordId=").append(String.valueOf(this.recordId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifNoneMatch=").append(String.valueOf(this.ifNoneMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetRecordPreviewContentRequest)) {
            return false;
        }

        GetRecordPreviewContentRequest other = (GetRecordPreviewContentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.recordId, other.recordId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifNoneMatch, other.ifNoneMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.recordId == null ? 43 : this.recordId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifNoneMatch == null ? 43 : this.ifNoneMatch.hashCode());
        return result;
    }
}
