/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.requests;

import com.oracle.bmc.loadbalancer.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/DeleteBackendSetExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use DeleteBackendSetRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
public class DeleteBackendSetRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the load balancer associated with the backend set.
     */
    private String loadBalancerId;

    public String getLoadBalancerId() {
        return loadBalancerId;
    }
    /**
     * The name of the backend set to delete.
     * <p>
     * Example: {@code example_backend_set}
     *
     */
    private String backendSetName;

    public String getBackendSetName() {
        return backendSetName;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteBackendSetRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String loadBalancerId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the load balancer associated with the backend set.
         * @return this builder instance
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        private String backendSetName = null;

        /**
         * The name of the backend set to delete.
         * <p>
         * Example: {@code example_backend_set}
         *
         * @return this builder instance
         */
        public Builder backendSetName(String backendSetName) {
            this.backendSetName = backendSetName;
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
        public Builder copy(DeleteBackendSetRequest o) {
            loadBalancerId(o.getLoadBalancerId());
            backendSetName(o.getBackendSetName());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteBackendSetRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of DeleteBackendSetRequest
         */
        public DeleteBackendSetRequest build() {
            DeleteBackendSetRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteBackendSetRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteBackendSetRequest
         */
        public DeleteBackendSetRequest buildWithoutInvocationCallback() {
            DeleteBackendSetRequest request = new DeleteBackendSetRequest();
            request.loadBalancerId = loadBalancerId;
            request.backendSetName = backendSetName;
            request.opcRequestId = opcRequestId;
            return request;
            // new DeleteBackendSetRequest(loadBalancerId, backendSetName, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .loadBalancerId(loadBalancerId)
                .backendSetName(backendSetName)
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
        sb.append(",loadBalancerId=").append(String.valueOf(this.loadBalancerId));
        sb.append(",backendSetName=").append(String.valueOf(this.backendSetName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteBackendSetRequest)) {
            return false;
        }

        DeleteBackendSetRequest other = (DeleteBackendSetRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.loadBalancerId, other.loadBalancerId)
                && java.util.Objects.equals(this.backendSetName, other.backendSetName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.loadBalancerId == null ? 43 : this.loadBalancerId.hashCode());
        result =
                (result * PRIME)
                        + (this.backendSetName == null ? 43 : this.backendSetName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
