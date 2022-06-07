/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.responses;

import com.oracle.bmc.datacatalog.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class ValidatePatternResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned ValidatePatternResult instance.
     */
    private com.oracle.bmc.datacatalog.model.ValidatePatternResult validatePatternResult;

    public com.oracle.bmc.datacatalog.model.ValidatePatternResult getValidatePatternResult() {
        return validatePatternResult;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "validatePatternResult"
    })
    private ValidatePatternResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.datacatalog.model.ValidatePatternResult validatePatternResult) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.validatePatternResult = validatePatternResult;
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

        private com.oracle.bmc.datacatalog.model.ValidatePatternResult validatePatternResult;

        public Builder validatePatternResult(
                com.oracle.bmc.datacatalog.model.ValidatePatternResult validatePatternResult) {
            this.validatePatternResult = validatePatternResult;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ValidatePatternResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            validatePatternResult(o.getValidatePatternResult());

            return this;
        }

        public ValidatePatternResponse build() {
            return new ValidatePatternResponse(
                    __httpStatusCode__, opcRequestId, validatePatternResult);
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
        sb.append(",validatePatternResult=").append(String.valueOf(validatePatternResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidatePatternResponse)) {
            return false;
        }

        ValidatePatternResponse other = (ValidatePatternResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.validatePatternResult, other.validatePatternResult);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.validatePatternResult == null
                                ? 43
                                : this.validatePatternResult.hashCode());
        return result;
    }
}
