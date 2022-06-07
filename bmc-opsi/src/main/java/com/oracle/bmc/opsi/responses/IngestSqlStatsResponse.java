/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.responses;

import com.oracle.bmc.opsi.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class IngestSqlStatsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * The returned IngestSqlStatsResponseDetails instance.
     */
    private com.oracle.bmc.opsi.model.IngestSqlStatsResponseDetails ingestSqlStatsResponseDetails;

    public com.oracle.bmc.opsi.model.IngestSqlStatsResponseDetails
            getIngestSqlStatsResponseDetails() {
        return ingestSqlStatsResponseDetails;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "etag",
        "ingestSqlStatsResponseDetails"
    })
    private IngestSqlStatsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String etag,
            com.oracle.bmc.opsi.model.IngestSqlStatsResponseDetails ingestSqlStatsResponseDetails) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.ingestSqlStatsResponseDetails = ingestSqlStatsResponseDetails;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private com.oracle.bmc.opsi.model.IngestSqlStatsResponseDetails
                ingestSqlStatsResponseDetails;

        public Builder ingestSqlStatsResponseDetails(
                com.oracle.bmc.opsi.model.IngestSqlStatsResponseDetails
                        ingestSqlStatsResponseDetails) {
            this.ingestSqlStatsResponseDetails = ingestSqlStatsResponseDetails;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(IngestSqlStatsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            ingestSqlStatsResponseDetails(o.getIngestSqlStatsResponseDetails());

            return this;
        }

        public IngestSqlStatsResponse build() {
            return new IngestSqlStatsResponse(
                    __httpStatusCode__, opcRequestId, etag, ingestSqlStatsResponseDetails);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",ingestSqlStatsResponseDetails=")
                .append(String.valueOf(ingestSqlStatsResponseDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IngestSqlStatsResponse)) {
            return false;
        }

        IngestSqlStatsResponse other = (IngestSqlStatsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(
                        this.ingestSqlStatsResponseDetails, other.ingestSqlStatsResponseDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.ingestSqlStatsResponseDetails == null
                                ? 43
                                : this.ingestSqlStatsResponseDetails.hashCode());
        return result;
    }
}
