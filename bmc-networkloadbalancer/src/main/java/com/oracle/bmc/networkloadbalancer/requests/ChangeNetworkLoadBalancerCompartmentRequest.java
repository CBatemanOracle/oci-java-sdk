/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.requests;

import com.oracle.bmc.networkloadbalancer.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/networkloadbalancer/ChangeNetworkLoadBalancerCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeNetworkLoadBalancerCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public class ChangeNetworkLoadBalancerCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.networkloadbalancer.model
                        .ChangeNetworkLoadBalancerCompartmentDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network load balancer to update.
     */
    private String networkLoadBalancerId;

    public String getNetworkLoadBalancerId() {
        return networkLoadBalancerId;
    }
    /**
     * The configuration details for moving a network load balancer to a different compartment.
     */
    private com.oracle.bmc.networkloadbalancer.model.ChangeNetworkLoadBalancerCompartmentDetails
            changeNetworkLoadBalancerCompartmentDetails;

    public com.oracle.bmc.networkloadbalancer.model.ChangeNetworkLoadBalancerCompartmentDetails
            getChangeNetworkLoadBalancerCompartmentDetails() {
        return changeNetworkLoadBalancerCompartmentDetails;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you must contact Oracle about a
     * particular request, then provide the request identifier.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so that it can be retried in case of a timeout or
     * server error without risk of rerunning that same action. Retry tokens expire after 24
     * hours but they can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the current etag value of the resource.
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
    public com.oracle.bmc.networkloadbalancer.model.ChangeNetworkLoadBalancerCompartmentDetails
            getBody$() {
        return changeNetworkLoadBalancerCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeNetworkLoadBalancerCompartmentRequest,
                    com.oracle.bmc.networkloadbalancer.model
                            .ChangeNetworkLoadBalancerCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String networkLoadBalancerId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network load balancer to update.
         * @return this builder instance
         */
        public Builder networkLoadBalancerId(String networkLoadBalancerId) {
            this.networkLoadBalancerId = networkLoadBalancerId;
            return this;
        }

        private com.oracle.bmc.networkloadbalancer.model.ChangeNetworkLoadBalancerCompartmentDetails
                changeNetworkLoadBalancerCompartmentDetails = null;

        /**
         * The configuration details for moving a network load balancer to a different compartment.
         * @return this builder instance
         */
        public Builder changeNetworkLoadBalancerCompartmentDetails(
                com.oracle.bmc.networkloadbalancer.model.ChangeNetworkLoadBalancerCompartmentDetails
                        changeNetworkLoadBalancerCompartmentDetails) {
            this.changeNetworkLoadBalancerCompartmentDetails =
                    changeNetworkLoadBalancerCompartmentDetails;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you must contact Oracle about a
         * particular request, then provide the request identifier.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so that it can be retried in case of a timeout or
         * server error without risk of rerunning that same action. Retry tokens expire after 24
         * hours but they can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the current etag value of the resource.
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
        public Builder copy(ChangeNetworkLoadBalancerCompartmentRequest o) {
            networkLoadBalancerId(o.getNetworkLoadBalancerId());
            changeNetworkLoadBalancerCompartmentDetails(
                    o.getChangeNetworkLoadBalancerCompartmentDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeNetworkLoadBalancerCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeNetworkLoadBalancerCompartmentRequest
         */
        public ChangeNetworkLoadBalancerCompartmentRequest build() {
            ChangeNetworkLoadBalancerCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.networkloadbalancer.model.ChangeNetworkLoadBalancerCompartmentDetails
                        body) {
            changeNetworkLoadBalancerCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeNetworkLoadBalancerCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeNetworkLoadBalancerCompartmentRequest
         */
        public ChangeNetworkLoadBalancerCompartmentRequest buildWithoutInvocationCallback() {
            ChangeNetworkLoadBalancerCompartmentRequest request =
                    new ChangeNetworkLoadBalancerCompartmentRequest();
            request.networkLoadBalancerId = networkLoadBalancerId;
            request.changeNetworkLoadBalancerCompartmentDetails =
                    changeNetworkLoadBalancerCompartmentDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            return request;
            // new ChangeNetworkLoadBalancerCompartmentRequest(networkLoadBalancerId, changeNetworkLoadBalancerCompartmentDetails, opcRequestId, opcRetryToken, ifMatch);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .networkLoadBalancerId(networkLoadBalancerId)
                .changeNetworkLoadBalancerCompartmentDetails(
                        changeNetworkLoadBalancerCompartmentDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",networkLoadBalancerId=").append(String.valueOf(this.networkLoadBalancerId));
        sb.append(",changeNetworkLoadBalancerCompartmentDetails=")
                .append(String.valueOf(this.changeNetworkLoadBalancerCompartmentDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeNetworkLoadBalancerCompartmentRequest)) {
            return false;
        }

        ChangeNetworkLoadBalancerCompartmentRequest other =
                (ChangeNetworkLoadBalancerCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.networkLoadBalancerId, other.networkLoadBalancerId)
                && java.util.Objects.equals(
                        this.changeNetworkLoadBalancerCompartmentDetails,
                        other.changeNetworkLoadBalancerCompartmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.networkLoadBalancerId == null
                                ? 43
                                : this.networkLoadBalancerId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeNetworkLoadBalancerCompartmentDetails == null
                                ? 43
                                : this.changeNetworkLoadBalancerCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
