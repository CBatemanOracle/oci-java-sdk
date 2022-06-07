/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limits.requests;

import com.oracle.bmc.limits.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/limits/GetResourceAvailabilityExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetResourceAvailabilityRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181025")
public class GetResourceAvailabilityRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The service name of the target quota.
     */
    private String serviceName;

    public String getServiceName() {
        return serviceName;
    }
    /**
     * The limit name for which to fetch the data.
     */
    private String limitName;

    public String getLimitName() {
        return limitName;
    }
    /**
     * The OCID of the compartment for which data is being fetched.
     */
    private String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * This field is mandatory if the scopeType of the target resource limit is AD.
     * Otherwise, this field should be omitted.
     * If the above requirements are not met, the API returns a 400 - InvalidParameter response.
     *
     */
    private String availabilityDomain;

    public String getAvailabilityDomain() {
        return availabilityDomain;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetResourceAvailabilityRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String serviceName = null;

        /**
         * The service name of the target quota.
         * @return this builder instance
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        private String limitName = null;

        /**
         * The limit name for which to fetch the data.
         * @return this builder instance
         */
        public Builder limitName(String limitName) {
            this.limitName = limitName;
            return this;
        }

        private String compartmentId = null;

        /**
         * The OCID of the compartment for which data is being fetched.
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        private String availabilityDomain = null;

        /**
         * This field is mandatory if the scopeType of the target resource limit is AD.
         * Otherwise, this field should be omitted.
         * If the above requirements are not met, the API returns a 400 - InvalidParameter response.
         *
         * @return this builder instance
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
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
        public Builder copy(GetResourceAvailabilityRequest o) {
            serviceName(o.getServiceName());
            limitName(o.getLimitName());
            compartmentId(o.getCompartmentId());
            availabilityDomain(o.getAvailabilityDomain());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetResourceAvailabilityRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetResourceAvailabilityRequest
         */
        public GetResourceAvailabilityRequest build() {
            GetResourceAvailabilityRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetResourceAvailabilityRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetResourceAvailabilityRequest
         */
        public GetResourceAvailabilityRequest buildWithoutInvocationCallback() {
            GetResourceAvailabilityRequest request = new GetResourceAvailabilityRequest();
            request.serviceName = serviceName;
            request.limitName = limitName;
            request.compartmentId = compartmentId;
            request.availabilityDomain = availabilityDomain;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetResourceAvailabilityRequest(serviceName, limitName, compartmentId, availabilityDomain, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .serviceName(serviceName)
                .limitName(limitName)
                .compartmentId(compartmentId)
                .availabilityDomain(availabilityDomain)
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
        sb.append(",serviceName=").append(String.valueOf(this.serviceName));
        sb.append(",limitName=").append(String.valueOf(this.limitName));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetResourceAvailabilityRequest)) {
            return false;
        }

        GetResourceAvailabilityRequest other = (GetResourceAvailabilityRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.limitName, other.limitName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.limitName == null ? 43 : this.limitName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
