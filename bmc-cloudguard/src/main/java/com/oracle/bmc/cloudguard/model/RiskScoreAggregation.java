/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Provides the dimensions and their corresponding risk score.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RiskScoreAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RiskScoreAggregation {
    @Deprecated
    @java.beans.ConstructorProperties({"dimensionsMap", "riskScore"})
    public RiskScoreAggregation(java.util.Map<String, String> dimensionsMap, Integer riskScore) {
        super();
        this.dimensionsMap = dimensionsMap;
        this.riskScore = riskScore;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionsMap")
        private java.util.Map<String, String> dimensionsMap;

        public Builder dimensionsMap(java.util.Map<String, String> dimensionsMap) {
            this.dimensionsMap = dimensionsMap;
            this.__explicitlySet__.add("dimensionsMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("riskScore")
        private Integer riskScore;

        public Builder riskScore(Integer riskScore) {
            this.riskScore = riskScore;
            this.__explicitlySet__.add("riskScore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RiskScoreAggregation build() {
            RiskScoreAggregation __instance__ = new RiskScoreAggregation(dimensionsMap, riskScore);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RiskScoreAggregation o) {
            Builder copiedBuilder = dimensionsMap(o.getDimensionsMap()).riskScore(o.getRiskScore());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The key-value pairs of dimensions and their names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionsMap")
    private final java.util.Map<String, String> dimensionsMap;

    public java.util.Map<String, String> getDimensionsMap() {
        return dimensionsMap;
    }

    /**
     * The risk score with given dimensions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("riskScore")
    private final Integer riskScore;

    public Integer getRiskScore() {
        return riskScore;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RiskScoreAggregation(");
        sb.append("dimensionsMap=").append(String.valueOf(this.dimensionsMap));
        sb.append(", riskScore=").append(String.valueOf(this.riskScore));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RiskScoreAggregation)) {
            return false;
        }

        RiskScoreAggregation other = (RiskScoreAggregation) o;
        return java.util.Objects.equals(this.dimensionsMap, other.dimensionsMap)
                && java.util.Objects.equals(this.riskScore, other.riskScore)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dimensionsMap == null ? 43 : this.dimensionsMap.hashCode());
        result = (result * PRIME) + (this.riskScore == null ? 43 : this.riskScore.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
