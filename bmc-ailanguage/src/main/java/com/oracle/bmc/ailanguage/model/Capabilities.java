/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Capabilities supported <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Capabilities.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Capabilities extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"capability"})
    public Capabilities(java.util.Map<String, Capability> capability) {
        super();
        this.capability = capability;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Model information capabilities related to version */
        @com.fasterxml.jackson.annotation.JsonProperty("capability")
        private java.util.Map<String, Capability> capability;

        /**
         * Model information capabilities related to version
         *
         * @param capability the value to set
         * @return this builder
         */
        public Builder capability(java.util.Map<String, Capability> capability) {
            this.capability = capability;
            this.__explicitlySet__.add("capability");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Capabilities build() {
            Capabilities model = new Capabilities(this.capability);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Capabilities model) {
            if (model.wasPropertyExplicitlySet("capability")) {
                this.capability(model.getCapability());
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

    /** Model information capabilities related to version */
    @com.fasterxml.jackson.annotation.JsonProperty("capability")
    private final java.util.Map<String, Capability> capability;

    /**
     * Model information capabilities related to version
     *
     * @return the value
     */
    public java.util.Map<String, Capability> getCapability() {
        return capability;
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
        sb.append("Capabilities(");
        sb.append("super=").append(super.toString());
        sb.append("capability=").append(String.valueOf(this.capability));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Capabilities)) {
            return false;
        }

        Capabilities other = (Capabilities) o;
        return java.util.Objects.equals(this.capability, other.capability) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.capability == null ? 43 : this.capability.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
