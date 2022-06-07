/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Specifies the source volume replica which the volume group will be created from.
 * The volume group replica shoulbe be in the same availability domain as the volume group.
 * Only one volume group can be created from a volume group replica at the same time.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VolumeGroupSourceFromVolumeGroupReplicaDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VolumeGroupSourceFromVolumeGroupReplicaDetails extends VolumeGroupSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupReplicaId")
        private String volumeGroupReplicaId;

        public Builder volumeGroupReplicaId(String volumeGroupReplicaId) {
            this.volumeGroupReplicaId = volumeGroupReplicaId;
            this.__explicitlySet__.add("volumeGroupReplicaId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VolumeGroupSourceFromVolumeGroupReplicaDetails build() {
            VolumeGroupSourceFromVolumeGroupReplicaDetails __instance__ =
                    new VolumeGroupSourceFromVolumeGroupReplicaDetails(volumeGroupReplicaId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VolumeGroupSourceFromVolumeGroupReplicaDetails o) {
            Builder copiedBuilder = volumeGroupReplicaId(o.getVolumeGroupReplicaId());

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

    @Deprecated
    public VolumeGroupSourceFromVolumeGroupReplicaDetails(String volumeGroupReplicaId) {
        super();
        this.volumeGroupReplicaId = volumeGroupReplicaId;
    }

    /**
     * The OCID of the volume group replica.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupReplicaId")
    private final String volumeGroupReplicaId;

    public String getVolumeGroupReplicaId() {
        return volumeGroupReplicaId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VolumeGroupSourceFromVolumeGroupReplicaDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", volumeGroupReplicaId=").append(String.valueOf(this.volumeGroupReplicaId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VolumeGroupSourceFromVolumeGroupReplicaDetails)) {
            return false;
        }

        VolumeGroupSourceFromVolumeGroupReplicaDetails other =
                (VolumeGroupSourceFromVolumeGroupReplicaDetails) o;
        return java.util.Objects.equals(this.volumeGroupReplicaId, other.volumeGroupReplicaId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.volumeGroupReplicaId == null
                                ? 43
                                : this.volumeGroupReplicaId.hashCode());
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
