/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetAppCatalogListingAgreementsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

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
     * The returned AppCatalogListingResourceVersionAgreements instance.
     */
    private com.oracle.bmc.core.model.AppCatalogListingResourceVersionAgreements
            appCatalogListingResourceVersionAgreements;

    public com.oracle.bmc.core.model.AppCatalogListingResourceVersionAgreements
            getAppCatalogListingResourceVersionAgreements() {
        return appCatalogListingResourceVersionAgreements;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcRequestId",
        "appCatalogListingResourceVersionAgreements"
    })
    private GetAppCatalogListingAgreementsResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            com.oracle.bmc.core.model.AppCatalogListingResourceVersionAgreements
                    appCatalogListingResourceVersionAgreements) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.appCatalogListingResourceVersionAgreements =
                appCatalogListingResourceVersionAgreements;
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

        private com.oracle.bmc.core.model.AppCatalogListingResourceVersionAgreements
                appCatalogListingResourceVersionAgreements;

        public Builder appCatalogListingResourceVersionAgreements(
                com.oracle.bmc.core.model.AppCatalogListingResourceVersionAgreements
                        appCatalogListingResourceVersionAgreements) {
            this.appCatalogListingResourceVersionAgreements =
                    appCatalogListingResourceVersionAgreements;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetAppCatalogListingAgreementsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            appCatalogListingResourceVersionAgreements(
                    o.getAppCatalogListingResourceVersionAgreements());

            return this;
        }

        public GetAppCatalogListingAgreementsResponse build() {
            return new GetAppCatalogListingAgreementsResponse(
                    __httpStatusCode__,
                    etag,
                    opcRequestId,
                    appCatalogListingResourceVersionAgreements);
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
        sb.append(",appCatalogListingResourceVersionAgreements=")
                .append(String.valueOf(appCatalogListingResourceVersionAgreements));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetAppCatalogListingAgreementsResponse)) {
            return false;
        }

        GetAppCatalogListingAgreementsResponse other = (GetAppCatalogListingAgreementsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.appCatalogListingResourceVersionAgreements,
                        other.appCatalogListingResourceVersionAgreements);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.appCatalogListingResourceVersionAgreements == null
                                ? 43
                                : this.appCatalogListingResourceVersionAgreements.hashCode());
        return result;
    }
}
