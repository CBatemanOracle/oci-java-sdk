/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Contains details indicating which log group the log should move to. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ChangeLogLogGroupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ChangeLogLogGroupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"targetLogGroupId"})
    public ChangeLogLogGroupDetails(String targetLogGroupId) {
        super();
        this.targetLogGroupId = targetLogGroupId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Log group OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetLogGroupId")
        private String targetLogGroupId;

        /**
         * Log group OCID.
         *
         * @param targetLogGroupId the value to set
         * @return this builder
         */
        public Builder targetLogGroupId(String targetLogGroupId) {
            this.targetLogGroupId = targetLogGroupId;
            this.__explicitlySet__.add("targetLogGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChangeLogLogGroupDetails build() {
            ChangeLogLogGroupDetails model = new ChangeLogLogGroupDetails(this.targetLogGroupId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangeLogLogGroupDetails model) {
            if (model.wasPropertyExplicitlySet("targetLogGroupId")) {
                this.targetLogGroupId(model.getTargetLogGroupId());
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

    /** Log group OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetLogGroupId")
    private final String targetLogGroupId;

    /**
     * Log group OCID.
     *
     * @return the value
     */
    public String getTargetLogGroupId() {
        return targetLogGroupId;
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
        sb.append("ChangeLogLogGroupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("targetLogGroupId=").append(String.valueOf(this.targetLogGroupId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeLogLogGroupDetails)) {
            return false;
        }

        ChangeLogLogGroupDetails other = (ChangeLogLogGroupDetails) o;
        return java.util.Objects.equals(this.targetLogGroupId, other.targetLogGroupId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.targetLogGroupId == null ? 43 : this.targetLogGroupId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
