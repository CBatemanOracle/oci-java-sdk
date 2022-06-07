/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetSensitiveColumnExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetSensitiveColumnRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class GetSensitiveColumnRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the sensitive data model.
     */
    private String sensitiveDataModelId;

    public String getSensitiveDataModelId() {
        return sensitiveDataModelId;
    }
    /**
     * The unique key that identifies the sensitive column. It's numeric and unique within a sensitive data model.
     */
    private String sensitiveColumnKey;

    public String getSensitiveColumnKey() {
        return sensitiveColumnKey;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetSensitiveColumnRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String sensitiveDataModelId = null;

        /**
         * The OCID of the sensitive data model.
         * @return this builder instance
         */
        public Builder sensitiveDataModelId(String sensitiveDataModelId) {
            this.sensitiveDataModelId = sensitiveDataModelId;
            return this;
        }

        private String sensitiveColumnKey = null;

        /**
         * The unique key that identifies the sensitive column. It's numeric and unique within a sensitive data model.
         * @return this builder instance
         */
        public Builder sensitiveColumnKey(String sensitiveColumnKey) {
            this.sensitiveColumnKey = sensitiveColumnKey;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(GetSensitiveColumnRequest o) {
            sensitiveDataModelId(o.getSensitiveDataModelId());
            sensitiveColumnKey(o.getSensitiveColumnKey());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetSensitiveColumnRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetSensitiveColumnRequest
         */
        public GetSensitiveColumnRequest build() {
            GetSensitiveColumnRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetSensitiveColumnRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetSensitiveColumnRequest
         */
        public GetSensitiveColumnRequest buildWithoutInvocationCallback() {
            GetSensitiveColumnRequest request = new GetSensitiveColumnRequest();
            request.sensitiveDataModelId = sensitiveDataModelId;
            request.sensitiveColumnKey = sensitiveColumnKey;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetSensitiveColumnRequest(sensitiveDataModelId, sensitiveColumnKey, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .sensitiveDataModelId(sensitiveDataModelId)
                .sensitiveColumnKey(sensitiveColumnKey)
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
        sb.append(",sensitiveDataModelId=").append(String.valueOf(this.sensitiveDataModelId));
        sb.append(",sensitiveColumnKey=").append(String.valueOf(this.sensitiveColumnKey));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetSensitiveColumnRequest)) {
            return false;
        }

        GetSensitiveColumnRequest other = (GetSensitiveColumnRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.sensitiveDataModelId, other.sensitiveDataModelId)
                && java.util.Objects.equals(this.sensitiveColumnKey, other.sensitiveColumnKey)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.sensitiveDataModelId == null
                                ? 43
                                : this.sensitiveDataModelId.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveColumnKey == null
                                ? 43
                                : this.sensitiveColumnKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
