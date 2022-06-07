/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * The metadata associated with the strategy parameter.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StrategyParameter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StrategyParameter {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "type",
        "description",
        "isRequired",
        "defaultValue",
        "possibleValues"
    })
    public StrategyParameter(
            String name,
            StrategyParameterType type,
            String description,
            Boolean isRequired,
            Object defaultValue,
            java.util.List<Object> possibleValues) {
        super();
        this.name = name;
        this.type = type;
        this.description = description;
        this.isRequired = isRequired;
        this.defaultValue = defaultValue;
        this.possibleValues = possibleValues;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private StrategyParameterType type;

        public Builder type(StrategyParameterType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
        private Boolean isRequired;

        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            this.__explicitlySet__.add("isRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private Object defaultValue;

        public Builder defaultValue(Object defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("possibleValues")
        private java.util.List<Object> possibleValues;

        public Builder possibleValues(java.util.List<Object> possibleValues) {
            this.possibleValues = possibleValues;
            this.__explicitlySet__.add("possibleValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StrategyParameter build() {
            StrategyParameter __instance__ =
                    new StrategyParameter(
                            name, type, description, isRequired, defaultValue, possibleValues);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StrategyParameter o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .type(o.getType())
                            .description(o.getDescription())
                            .isRequired(o.getIsRequired())
                            .defaultValue(o.getDefaultValue())
                            .possibleValues(o.getPossibleValues());

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
     * The name of the strategy parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * The type of strategy parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final StrategyParameterType type;

    public StrategyParameterType getType() {
        return type;
    }

    /**
     * Text describing the strategy parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * Whether this parameter is required.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    private final Boolean isRequired;

    public Boolean getIsRequired() {
        return isRequired;
    }

    /**
     * A default value used for the strategy parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final Object defaultValue;

    public Object getDefaultValue() {
        return defaultValue;
    }

    /**
     * The list of possible values used for these strategy parameters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("possibleValues")
    private final java.util.List<Object> possibleValues;

    public java.util.List<Object> getPossibleValues() {
        return possibleValues;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StrategyParameter(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isRequired=").append(String.valueOf(this.isRequired));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", possibleValues=").append(String.valueOf(this.possibleValues));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StrategyParameter)) {
            return false;
        }

        StrategyParameter other = (StrategyParameter) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isRequired, other.isRequired)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.possibleValues, other.possibleValues)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isRequired == null ? 43 : this.isRequired.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result =
                (result * PRIME)
                        + (this.possibleValues == null ? 43 : this.possibleValues.hashCode());
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
