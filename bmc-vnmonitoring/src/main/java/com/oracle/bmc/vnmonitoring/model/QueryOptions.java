/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the query options required for a {@code PathAnalyzerTest} resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QueryOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class QueryOptions extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isBiDirectionalAnalysis"})
    public QueryOptions(Boolean isBiDirectionalAnalysis) {
        super();
        this.isBiDirectionalAnalysis = isBiDirectionalAnalysis;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** If true, a path analysis is done for both the forward and reverse routes. */
        @com.fasterxml.jackson.annotation.JsonProperty("isBiDirectionalAnalysis")
        private Boolean isBiDirectionalAnalysis;

        /**
         * If true, a path analysis is done for both the forward and reverse routes.
         *
         * @param isBiDirectionalAnalysis the value to set
         * @return this builder
         */
        public Builder isBiDirectionalAnalysis(Boolean isBiDirectionalAnalysis) {
            this.isBiDirectionalAnalysis = isBiDirectionalAnalysis;
            this.__explicitlySet__.add("isBiDirectionalAnalysis");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryOptions build() {
            QueryOptions model = new QueryOptions(this.isBiDirectionalAnalysis);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryOptions model) {
            if (model.wasPropertyExplicitlySet("isBiDirectionalAnalysis")) {
                this.isBiDirectionalAnalysis(model.getIsBiDirectionalAnalysis());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** If true, a path analysis is done for both the forward and reverse routes. */
    @com.fasterxml.jackson.annotation.JsonProperty("isBiDirectionalAnalysis")
    private final Boolean isBiDirectionalAnalysis;

    /**
     * If true, a path analysis is done for both the forward and reverse routes.
     *
     * @return the value
     */
    public Boolean getIsBiDirectionalAnalysis() {
        return isBiDirectionalAnalysis;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("QueryOptions(");
        sb.append("super=").append(super.toString());
        sb.append("isBiDirectionalAnalysis=").append(String.valueOf(this.isBiDirectionalAnalysis));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryOptions)) {
            return false;
        }

        QueryOptions other = (QueryOptions) o;
        return java.util.Objects.equals(this.isBiDirectionalAnalysis, other.isBiDirectionalAnalysis)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isBiDirectionalAnalysis == null
                                ? 43
                                : this.isBiDirectionalAnalysis.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
