/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.responses;

import com.oracle.bmc.datasafe.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListAuditTrailAnalyticsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For list pagination. When this header appears in the response, additional pages of results remain. Include opc-next-page value as the page parameter for the subsequent GET request to get the next batch of items. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the previous batch of items.
     *
     */
    private String opcPrevPage;

    public String getOpcPrevPage() {
        return opcPrevPage;
    }

    /**
     * The returned AuditTrailAnalyticCollection instance.
     */
    private com.oracle.bmc.datasafe.model.AuditTrailAnalyticCollection auditTrailAnalyticCollection;

    public com.oracle.bmc.datasafe.model.AuditTrailAnalyticCollection
            getAuditTrailAnalyticCollection() {
        return auditTrailAnalyticCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "opcPrevPage",
        "auditTrailAnalyticCollection"
    })
    private ListAuditTrailAnalyticsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            String opcPrevPage,
            com.oracle.bmc.datasafe.model.AuditTrailAnalyticCollection
                    auditTrailAnalyticCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.opcPrevPage = opcPrevPage;
        this.auditTrailAnalyticCollection = auditTrailAnalyticCollection;
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

        private String opcNextPage;

        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        private String opcPrevPage;

        public Builder opcPrevPage(String opcPrevPage) {
            this.opcPrevPage = opcPrevPage;
            return this;
        }

        private com.oracle.bmc.datasafe.model.AuditTrailAnalyticCollection
                auditTrailAnalyticCollection;

        public Builder auditTrailAnalyticCollection(
                com.oracle.bmc.datasafe.model.AuditTrailAnalyticCollection
                        auditTrailAnalyticCollection) {
            this.auditTrailAnalyticCollection = auditTrailAnalyticCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListAuditTrailAnalyticsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            opcPrevPage(o.getOpcPrevPage());
            auditTrailAnalyticCollection(o.getAuditTrailAnalyticCollection());

            return this;
        }

        public ListAuditTrailAnalyticsResponse build() {
            return new ListAuditTrailAnalyticsResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcNextPage,
                    opcPrevPage,
                    auditTrailAnalyticCollection);
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
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",opcPrevPage=").append(String.valueOf(opcPrevPage));
        sb.append(",auditTrailAnalyticCollection=")
                .append(String.valueOf(auditTrailAnalyticCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAuditTrailAnalyticsResponse)) {
            return false;
        }

        ListAuditTrailAnalyticsResponse other = (ListAuditTrailAnalyticsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcPrevPage, other.opcPrevPage)
                && java.util.Objects.equals(
                        this.auditTrailAnalyticCollection, other.auditTrailAnalyticCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.opcPrevPage == null ? 43 : this.opcPrevPage.hashCode());
        result =
                (result * PRIME)
                        + (this.auditTrailAnalyticCollection == null
                                ? 43
                                : this.auditTrailAnalyticCollection.hashCode());
        return result;
    }
}
