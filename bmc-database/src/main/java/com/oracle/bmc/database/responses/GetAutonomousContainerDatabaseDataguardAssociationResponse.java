/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.responses;

import com.oracle.bmc.database.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetAutonomousContainerDatabaseDataguardAssociationResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you must contact Oracle about
     * a particular request, then provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned AutonomousContainerDatabaseDataguardAssociation instance.
     */
    private com.oracle.bmc.database.model.AutonomousContainerDatabaseDataguardAssociation
            autonomousContainerDatabaseDataguardAssociation;

    public com.oracle.bmc.database.model.AutonomousContainerDatabaseDataguardAssociation
            getAutonomousContainerDatabaseDataguardAssociation() {
        return autonomousContainerDatabaseDataguardAssociation;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcRequestId",
        "autonomousContainerDatabaseDataguardAssociation"
    })
    private GetAutonomousContainerDatabaseDataguardAssociationResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            com.oracle.bmc.database.model.AutonomousContainerDatabaseDataguardAssociation
                    autonomousContainerDatabaseDataguardAssociation) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.autonomousContainerDatabaseDataguardAssociation =
                autonomousContainerDatabaseDataguardAssociation;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private com.oracle.bmc.database.model.AutonomousContainerDatabaseDataguardAssociation
                autonomousContainerDatabaseDataguardAssociation;

        public Builder autonomousContainerDatabaseDataguardAssociation(
                com.oracle.bmc.database.model.AutonomousContainerDatabaseDataguardAssociation
                        autonomousContainerDatabaseDataguardAssociation) {
            this.autonomousContainerDatabaseDataguardAssociation =
                    autonomousContainerDatabaseDataguardAssociation;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetAutonomousContainerDatabaseDataguardAssociationResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            autonomousContainerDatabaseDataguardAssociation(
                    o.getAutonomousContainerDatabaseDataguardAssociation());

            return this;
        }

        public GetAutonomousContainerDatabaseDataguardAssociationResponse build() {
            return new GetAutonomousContainerDatabaseDataguardAssociationResponse(
                    __httpStatusCode__,
                    etag,
                    opcRequestId,
                    autonomousContainerDatabaseDataguardAssociation);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",autonomousContainerDatabaseDataguardAssociation=")
                .append(String.valueOf(autonomousContainerDatabaseDataguardAssociation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetAutonomousContainerDatabaseDataguardAssociationResponse)) {
            return false;
        }

        GetAutonomousContainerDatabaseDataguardAssociationResponse other =
                (GetAutonomousContainerDatabaseDataguardAssociationResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseDataguardAssociation,
                        other.autonomousContainerDatabaseDataguardAssociation);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousContainerDatabaseDataguardAssociation == null
                                ? 43
                                : this.autonomousContainerDatabaseDataguardAssociation.hashCode());
        return result;
    }
}
