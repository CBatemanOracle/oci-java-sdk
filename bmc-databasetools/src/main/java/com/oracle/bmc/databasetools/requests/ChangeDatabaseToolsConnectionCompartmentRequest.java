/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.requests;

import com.oracle.bmc.databasetools.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ChangeDatabaseToolsConnectionCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeDatabaseToolsConnectionCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
public class ChangeDatabaseToolsConnectionCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasetools.model
                        .ChangeDatabaseToolsConnectionCompartmentDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a DatabaseToolsConnection.
     */
    private String databaseToolsConnectionId;

    public String getDatabaseToolsConnectionId() {
        return databaseToolsConnectionId;
    }
    /**
     * Request to change the compartment of the DatabaseToolsConnection.
     */
    private com.oracle.bmc.databasetools.model.ChangeDatabaseToolsConnectionCompartmentDetails
            changeDatabaseToolsConnectionCompartmentDetails;

    public com.oracle.bmc.databasetools.model.ChangeDatabaseToolsConnectionCompartmentDetails
            getChangeDatabaseToolsConnectionCompartmentDetails() {
        return changeDatabaseToolsConnectionCompartmentDetails;
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
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.databasetools.model.ChangeDatabaseToolsConnectionCompartmentDetails
            getBody$() {
        return changeDatabaseToolsConnectionCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeDatabaseToolsConnectionCompartmentRequest,
                    com.oracle.bmc.databasetools.model
                            .ChangeDatabaseToolsConnectionCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String databaseToolsConnectionId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a DatabaseToolsConnection.
         * @return this builder instance
         */
        public Builder databaseToolsConnectionId(String databaseToolsConnectionId) {
            this.databaseToolsConnectionId = databaseToolsConnectionId;
            return this;
        }

        private com.oracle.bmc.databasetools.model.ChangeDatabaseToolsConnectionCompartmentDetails
                changeDatabaseToolsConnectionCompartmentDetails = null;

        /**
         * Request to change the compartment of the DatabaseToolsConnection.
         * @return this builder instance
         */
        public Builder changeDatabaseToolsConnectionCompartmentDetails(
                com.oracle.bmc.databasetools.model.ChangeDatabaseToolsConnectionCompartmentDetails
                        changeDatabaseToolsConnectionCompartmentDetails) {
            this.changeDatabaseToolsConnectionCompartmentDetails =
                    changeDatabaseToolsConnectionCompartmentDetails;
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

        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(ChangeDatabaseToolsConnectionCompartmentRequest o) {
            databaseToolsConnectionId(o.getDatabaseToolsConnectionId());
            changeDatabaseToolsConnectionCompartmentDetails(
                    o.getChangeDatabaseToolsConnectionCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeDatabaseToolsConnectionCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeDatabaseToolsConnectionCompartmentRequest
         */
        public ChangeDatabaseToolsConnectionCompartmentRequest build() {
            ChangeDatabaseToolsConnectionCompartmentRequest request =
                    buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasetools.model.ChangeDatabaseToolsConnectionCompartmentDetails
                        body) {
            changeDatabaseToolsConnectionCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeDatabaseToolsConnectionCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeDatabaseToolsConnectionCompartmentRequest
         */
        public ChangeDatabaseToolsConnectionCompartmentRequest buildWithoutInvocationCallback() {
            ChangeDatabaseToolsConnectionCompartmentRequest request =
                    new ChangeDatabaseToolsConnectionCompartmentRequest();
            request.databaseToolsConnectionId = databaseToolsConnectionId;
            request.changeDatabaseToolsConnectionCompartmentDetails =
                    changeDatabaseToolsConnectionCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeDatabaseToolsConnectionCompartmentRequest(databaseToolsConnectionId, changeDatabaseToolsConnectionCompartmentDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .databaseToolsConnectionId(databaseToolsConnectionId)
                .changeDatabaseToolsConnectionCompartmentDetails(
                        changeDatabaseToolsConnectionCompartmentDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",databaseToolsConnectionId=")
                .append(String.valueOf(this.databaseToolsConnectionId));
        sb.append(",changeDatabaseToolsConnectionCompartmentDetails=")
                .append(String.valueOf(this.changeDatabaseToolsConnectionCompartmentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeDatabaseToolsConnectionCompartmentRequest)) {
            return false;
        }

        ChangeDatabaseToolsConnectionCompartmentRequest other =
                (ChangeDatabaseToolsConnectionCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.databaseToolsConnectionId, other.databaseToolsConnectionId)
                && java.util.Objects.equals(
                        this.changeDatabaseToolsConnectionCompartmentDetails,
                        other.changeDatabaseToolsConnectionCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.databaseToolsConnectionId == null
                                ? 43
                                : this.databaseToolsConnectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeDatabaseToolsConnectionCompartmentDetails == null
                                ? 43
                                : this.changeDatabaseToolsConnectionCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
