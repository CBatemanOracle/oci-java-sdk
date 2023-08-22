/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.responses;

import com.oracle.bmc.databasemanagement.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class PatchExternalDbSystemDiscoveryResponse extends com.oracle.bmc.responses.BmcResponse {
    /** For optimistic concurrency control. See {@code if-match}. */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** The returned {@code ExternalDbSystemDiscovery} instance. */
    private com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscovery
            externalDbSystemDiscovery;

    /**
     * The returned {@code ExternalDbSystemDiscovery} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscovery
            getExternalDbSystemDiscovery() {
        return externalDbSystemDiscovery;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "externalDbSystemDiscovery"
    })
    private PatchExternalDbSystemDiscoveryResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscovery
                    externalDbSystemDiscovery) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.externalDbSystemDiscovery = externalDbSystemDiscovery;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    PatchExternalDbSystemDiscoveryResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /** For optimistic concurrency control. See {@code if-match}. */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The returned {@code ExternalDbSystemDiscovery} instance. */
        private com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscovery
                externalDbSystemDiscovery;

        /**
         * The returned {@code ExternalDbSystemDiscovery} instance.
         *
         * @param externalDbSystemDiscovery the value to set
         * @return this builder
         */
        public Builder externalDbSystemDiscovery(
                com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscovery
                        externalDbSystemDiscovery) {
            this.externalDbSystemDiscovery = externalDbSystemDiscovery;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(PatchExternalDbSystemDiscoveryResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            externalDbSystemDiscovery(o.getExternalDbSystemDiscovery());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public PatchExternalDbSystemDiscoveryResponse build() {
            return new PatchExternalDbSystemDiscoveryResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, externalDbSystemDiscovery);
        }
    }

    /**
     * Return a new builder for this response object.
     *
     * @return builder for the response object
     */
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
        sb.append(",externalDbSystemDiscovery=").append(String.valueOf(externalDbSystemDiscovery));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchExternalDbSystemDiscoveryResponse)) {
            return false;
        }

        PatchExternalDbSystemDiscoveryResponse other = (PatchExternalDbSystemDiscoveryResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.externalDbSystemDiscovery, other.externalDbSystemDiscovery);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.externalDbSystemDiscovery == null
                                ? 43
                                : this.externalDbSystemDiscovery.hashCode());
        return result;
    }
}
