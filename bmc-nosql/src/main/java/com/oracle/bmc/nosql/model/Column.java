/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * A column of a table. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Column.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Column extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "type",
        "isNullable",
        "defaultValue",
        "isAsUuid",
        "isGenerated"
    })
    public Column(
            String name,
            String type,
            Boolean isNullable,
            String defaultValue,
            Boolean isAsUuid,
            Boolean isGenerated) {
        super();
        this.name = name;
        this.type = type;
        this.isNullable = isNullable;
        this.defaultValue = defaultValue;
        this.isAsUuid = isAsUuid;
        this.isGenerated = isGenerated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The column name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The column name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The column type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The column type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The column nullable flag. */
        @com.fasterxml.jackson.annotation.JsonProperty("isNullable")
        private Boolean isNullable;

        /**
         * The column nullable flag.
         *
         * @param isNullable the value to set
         * @return this builder
         */
        public Builder isNullable(Boolean isNullable) {
            this.isNullable = isNullable;
            this.__explicitlySet__.add("isNullable");
            return this;
        }
        /** The column default value. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        /**
         * The column default value.
         *
         * @param defaultValue the value to set
         * @return this builder
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }
        /** True if the STRING column was declared AS UUID. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAsUuid")
        private Boolean isAsUuid;

        /**
         * True if the STRING column was declared AS UUID.
         *
         * @param isAsUuid the value to set
         * @return this builder
         */
        public Builder isAsUuid(Boolean isAsUuid) {
            this.isAsUuid = isAsUuid;
            this.__explicitlySet__.add("isAsUuid");
            return this;
        }
        /** True if the STRING AS UUID column is also GENERATED BY DEFAULT. */
        @com.fasterxml.jackson.annotation.JsonProperty("isGenerated")
        private Boolean isGenerated;

        /**
         * True if the STRING AS UUID column is also GENERATED BY DEFAULT.
         *
         * @param isGenerated the value to set
         * @return this builder
         */
        public Builder isGenerated(Boolean isGenerated) {
            this.isGenerated = isGenerated;
            this.__explicitlySet__.add("isGenerated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Column build() {
            Column model =
                    new Column(
                            this.name,
                            this.type,
                            this.isNullable,
                            this.defaultValue,
                            this.isAsUuid,
                            this.isGenerated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Column model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("isNullable")) {
                this.isNullable(model.getIsNullable());
            }
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
            }
            if (model.wasPropertyExplicitlySet("isAsUuid")) {
                this.isAsUuid(model.getIsAsUuid());
            }
            if (model.wasPropertyExplicitlySet("isGenerated")) {
                this.isGenerated(model.getIsGenerated());
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

    /** The column name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The column name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The column type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The column type.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** The column nullable flag. */
    @com.fasterxml.jackson.annotation.JsonProperty("isNullable")
    private final Boolean isNullable;

    /**
     * The column nullable flag.
     *
     * @return the value
     */
    public Boolean getIsNullable() {
        return isNullable;
    }

    /** The column default value. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

    /**
     * The column default value.
     *
     * @return the value
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /** True if the STRING column was declared AS UUID. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAsUuid")
    private final Boolean isAsUuid;

    /**
     * True if the STRING column was declared AS UUID.
     *
     * @return the value
     */
    public Boolean getIsAsUuid() {
        return isAsUuid;
    }

    /** True if the STRING AS UUID column is also GENERATED BY DEFAULT. */
    @com.fasterxml.jackson.annotation.JsonProperty("isGenerated")
    private final Boolean isGenerated;

    /**
     * True if the STRING AS UUID column is also GENERATED BY DEFAULT.
     *
     * @return the value
     */
    public Boolean getIsGenerated() {
        return isGenerated;
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
        sb.append("Column(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", isNullable=").append(String.valueOf(this.isNullable));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", isAsUuid=").append(String.valueOf(this.isAsUuid));
        sb.append(", isGenerated=").append(String.valueOf(this.isGenerated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Column)) {
            return false;
        }

        Column other = (Column) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.isNullable, other.isNullable)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.isAsUuid, other.isAsUuid)
                && java.util.Objects.equals(this.isGenerated, other.isGenerated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.isNullable == null ? 43 : this.isNullable.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result = (result * PRIME) + (this.isAsUuid == null ? 43 : this.isAsUuid.hashCode());
        result = (result * PRIME) + (this.isGenerated == null ? 43 : this.isGenerated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
