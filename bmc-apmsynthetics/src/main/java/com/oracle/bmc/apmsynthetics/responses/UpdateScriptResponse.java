/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.responses;

import com.oracle.bmc.apmsynthetics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class UpdateScriptResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned Script instance.
     */
    private com.oracle.bmc.apmsynthetics.model.Script script;

    public com.oracle.bmc.apmsynthetics.model.Script getScript() {
        return script;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "etag", "opcRequestId", "script"})
    private UpdateScriptResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            com.oracle.bmc.apmsynthetics.model.Script script) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.script = script;
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

        private com.oracle.bmc.apmsynthetics.model.Script script;

        public Builder script(com.oracle.bmc.apmsynthetics.model.Script script) {
            this.script = script;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateScriptResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            script(o.getScript());

            return this;
        }

        public UpdateScriptResponse build() {
            return new UpdateScriptResponse(__httpStatusCode__, etag, opcRequestId, script);
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
        sb.append(",script=").append(String.valueOf(script));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateScriptResponse)) {
            return false;
        }

        UpdateScriptResponse other = (UpdateScriptResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.script, other.script);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.script == null ? 43 : this.script.hashCode());
        return result;
    }
}
