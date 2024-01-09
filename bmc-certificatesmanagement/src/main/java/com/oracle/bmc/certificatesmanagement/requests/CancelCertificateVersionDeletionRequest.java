/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.requests;

import com.oracle.bmc.certificatesmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/certificatesmanagement/CancelCertificateVersionDeletionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CancelCertificateVersionDeletionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public class CancelCertificateVersionDeletionRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the certificate. */
    private String certificateId;

    /** The OCID of the certificate. */
    public String getCertificateId() {
        return certificateId;
    }
    /** The version number of the certificate. */
    private Long certificateVersionNumber;

    /** The version number of the certificate. */
    public Long getCertificateVersionNumber() {
        return certificateVersionNumber;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If provided, the returned request ID will
     * include this value. Otherwise, a random request ID will be generated by the service.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If provided, the returned request ID will
     * include this value. Otherwise, a random request ID will be generated by the service.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CancelCertificateVersionDeletionRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the certificate. */
        private String certificateId = null;

        /**
         * The OCID of the certificate.
         *
         * @param certificateId the value to set
         * @return this builder instance
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /** The version number of the certificate. */
        private Long certificateVersionNumber = null;

        /**
         * The version number of the certificate.
         *
         * @param certificateVersionNumber the value to set
         * @return this builder instance
         */
        public Builder certificateVersionNumber(Long certificateVersionNumber) {
            this.certificateVersionNumber = certificateVersionNumber;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If provided, the returned request ID
         * will include this value. Otherwise, a random request ID will be generated by the service.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If provided, the returned request ID
         * will include this value. Otherwise, a random request ID will be generated by the service.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
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
         *
         * @return this builder instance
         */
        public Builder copy(CancelCertificateVersionDeletionRequest o) {
            certificateId(o.getCertificateId());
            certificateVersionNumber(o.getCertificateVersionNumber());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CancelCertificateVersionDeletionRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CancelCertificateVersionDeletionRequest
         */
        public CancelCertificateVersionDeletionRequest build() {
            CancelCertificateVersionDeletionRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of CancelCertificateVersionDeletionRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CancelCertificateVersionDeletionRequest
         */
        public CancelCertificateVersionDeletionRequest buildWithoutInvocationCallback() {
            CancelCertificateVersionDeletionRequest request =
                    new CancelCertificateVersionDeletionRequest();
            request.certificateId = certificateId;
            request.certificateVersionNumber = certificateVersionNumber;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new CancelCertificateVersionDeletionRequest(certificateId, certificateVersionNumber,
            // opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .certificateId(certificateId)
                .certificateVersionNumber(certificateVersionNumber)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",certificateId=").append(String.valueOf(this.certificateId));
        sb.append(",certificateVersionNumber=")
                .append(String.valueOf(this.certificateVersionNumber));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CancelCertificateVersionDeletionRequest)) {
            return false;
        }

        CancelCertificateVersionDeletionRequest other = (CancelCertificateVersionDeletionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.certificateId, other.certificateId)
                && java.util.Objects.equals(
                        this.certificateVersionNumber, other.certificateVersionNumber)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.certificateId == null ? 43 : this.certificateId.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateVersionNumber == null
                                ? 43
                                : this.certificateVersionNumber.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
