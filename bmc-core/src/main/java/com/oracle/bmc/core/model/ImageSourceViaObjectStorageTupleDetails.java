/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
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
    builder = ImageSourceViaObjectStorageTupleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ImageSourceViaObjectStorageTupleDetails extends ImageSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
        private String operatingSystem;

        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            this.__explicitlySet__.add("operatingSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystemVersion")
        private String operatingSystemVersion;

        public Builder operatingSystemVersion(String operatingSystemVersion) {
            this.operatingSystemVersion = operatingSystemVersion;
            this.__explicitlySet__.add("operatingSystemVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceImageType")
        private SourceImageType sourceImageType;

        public Builder sourceImageType(SourceImageType sourceImageType) {
            this.sourceImageType = sourceImageType;
            this.__explicitlySet__.add("sourceImageType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImageSourceViaObjectStorageTupleDetails build() {
            ImageSourceViaObjectStorageTupleDetails __instance__ =
                    new ImageSourceViaObjectStorageTupleDetails(
                            operatingSystem,
                            operatingSystemVersion,
                            sourceImageType,
                            bucketName,
                            namespaceName,
                            objectName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImageSourceViaObjectStorageTupleDetails o) {
            Builder copiedBuilder =
                    operatingSystem(o.getOperatingSystem())
                            .operatingSystemVersion(o.getOperatingSystemVersion())
                            .sourceImageType(o.getSourceImageType())
                            .bucketName(o.getBucketName())
                            .namespaceName(o.getNamespaceName())
                            .objectName(o.getObjectName());

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
    public ImageSourceViaObjectStorageTupleDetails(
            String operatingSystem,
            String operatingSystemVersion,
            SourceImageType sourceImageType,
            String bucketName,
            String namespaceName,
            String objectName) {
        super(operatingSystem, operatingSystemVersion, sourceImageType);
        this.bucketName = bucketName;
        this.namespaceName = namespaceName;
        this.objectName = objectName;
    }

    /**
     * The Object Storage bucket for the image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    public String getBucketName() {
        return bucketName;
    }

    /**
     * The Object Storage namespace for the image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    private final String namespaceName;

    public String getNamespaceName() {
        return namespaceName;
    }

    /**
     * The Object Storage name for the image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    public String getObjectName() {
        return objectName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ImageSourceViaObjectStorageTupleDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImageSourceViaObjectStorageTupleDetails)) {
            return false;
        }

        ImageSourceViaObjectStorageTupleDetails other = (ImageSourceViaObjectStorageTupleDetails) o;
        return java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
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
