/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListObjectVersionsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For paginating a list of object versions.
     * In the GET request, set the limit to the number of object versions that you want returned in the response.
     * If the {@code opc-next-page} header appears in the response, then this is a partial list and there are
     * additional object versions to get. Include the header's value as the {@code page} parameter in the subsequent
     * GET request to get the next batch of object versions and prefixes. Repeat this process to retrieve the entire list of
     * object versions and prefixes.
     * <p>
     * For more details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The returned ObjectVersionCollection instance.
     */
    private com.oracle.bmc.objectstorage.model.ObjectVersionCollection objectVersionCollection;

    public com.oracle.bmc.objectstorage.model.ObjectVersionCollection getObjectVersionCollection() {
        return objectVersionCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcClientRequestId",
        "opcRequestId",
        "opcNextPage",
        "objectVersionCollection"
    })
    private ListObjectVersionsResponse(
            int __httpStatusCode__,
            String opcClientRequestId,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.objectstorage.model.ObjectVersionCollection objectVersionCollection) {
        super(__httpStatusCode__);
        this.opcClientRequestId = opcClientRequestId;
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.objectVersionCollection = objectVersionCollection;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String opcClientRequestId;

        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
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

        private com.oracle.bmc.objectstorage.model.ObjectVersionCollection objectVersionCollection;

        public Builder objectVersionCollection(
                com.oracle.bmc.objectstorage.model.ObjectVersionCollection
                        objectVersionCollection) {
            this.objectVersionCollection = objectVersionCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListObjectVersionsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            objectVersionCollection(o.getObjectVersionCollection());

            return this;
        }

        public ListObjectVersionsResponse build() {
            return new ListObjectVersionsResponse(
                    __httpStatusCode__,
                    opcClientRequestId,
                    opcRequestId,
                    opcNextPage,
                    objectVersionCollection);
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
        sb.append(",opcClientRequestId=").append(String.valueOf(opcClientRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",objectVersionCollection=").append(String.valueOf(objectVersionCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListObjectVersionsResponse)) {
            return false;
        }

        ListObjectVersionsResponse other = (ListObjectVersionsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.objectVersionCollection, other.objectVersionCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersionCollection == null
                                ? 43
                                : this.objectVersionCollection.hashCode());
        return result;
    }
}
