/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault.model;

/**
 * The secret version summary object, which doesn't include the contents of the secret. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SecretVersionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SecretVersionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "contentType",
        "name",
        "secretId",
        "stages",
        "timeCreated",
        "timeOfDeletion",
        "timeOfExpiry",
        "versionNumber"
    })
    public SecretVersionSummary(
            ContentType contentType,
            String name,
            String secretId,
            java.util.List<Stages> stages,
            java.util.Date timeCreated,
            java.util.Date timeOfDeletion,
            java.util.Date timeOfExpiry,
            Long versionNumber) {
        super();
        this.contentType = contentType;
        this.name = name;
        this.secretId = secretId;
        this.stages = stages;
        this.timeCreated = timeCreated;
        this.timeOfDeletion = timeOfDeletion;
        this.timeOfExpiry = timeOfExpiry;
        this.versionNumber = versionNumber;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The content type of the secret version's secret contents. */
        @com.fasterxml.jackson.annotation.JsonProperty("contentType")
        private ContentType contentType;

        /**
         * The content type of the secret version's secret contents.
         *
         * @param contentType the value to set
         * @return this builder
         */
        public Builder contentType(ContentType contentType) {
            this.contentType = contentType;
            this.__explicitlySet__.add("contentType");
            return this;
        }
        /** The name of the secret version. A name is unique across versions of a secret. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the secret version. A name is unique across versions of a secret.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The OCID of the secret. */
        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        /**
         * The OCID of the secret.
         *
         * @param secretId the value to set
         * @return this builder
         */
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }
        /**
         * A list of possible rotation states for the secret version. A secret version marked {@code
         * CURRENT} is currently in use. A secret version marked {@code PENDING} is staged and
         * available for use, but has not been applied on the target system and, therefore, has not
         * been rotated into current, active use. The secret most recently uploaded to a vault is
         * always marked {@code LATEST}. (The first version of a secret is always marked as both
         * {@code CURRENT} and {@code LATEST}.) A secret version marked {@code PREVIOUS} is the
         * secret version that was most recently marked {@code CURRENT}, before the last secret
         * version rotation. A secret version marked {@code DEPRECATED} is neither current, pending,
         * nor the previous one in use. Only secret versions marked {@code DEPRECATED} can be
         * scheduled for deletion.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("stages")
        private java.util.List<Stages> stages;

        /**
         * A list of possible rotation states for the secret version. A secret version marked {@code
         * CURRENT} is currently in use. A secret version marked {@code PENDING} is staged and
         * available for use, but has not been applied on the target system and, therefore, has not
         * been rotated into current, active use. The secret most recently uploaded to a vault is
         * always marked {@code LATEST}. (The first version of a secret is always marked as both
         * {@code CURRENT} and {@code LATEST}.) A secret version marked {@code PREVIOUS} is the
         * secret version that was most recently marked {@code CURRENT}, before the last secret
         * version rotation. A secret version marked {@code DEPRECATED} is neither current, pending,
         * nor the previous one in use. Only secret versions marked {@code DEPRECATED} can be
         * scheduled for deletion.
         *
         * @param stages the value to set
         * @return this builder
         */
        public Builder stages(java.util.List<Stages> stages) {
            this.stages = stages;
            this.__explicitlySet__.add("stages");
            return this;
        }
        /**
         * A optional property indicating when the secret version was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * A optional property indicating when the secret version was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * An optional property indicating when to delete the secret version, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        /**
         * An optional property indicating when to delete the secret version, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         *
         * @param timeOfDeletion the value to set
         * @return this builder
         */
        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }
        /**
         * An optional property indicating when the secret version will expire, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfExpiry")
        private java.util.Date timeOfExpiry;

        /**
         * An optional property indicating when the secret version will expire, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         *
         * @param timeOfExpiry the value to set
         * @return this builder
         */
        public Builder timeOfExpiry(java.util.Date timeOfExpiry) {
            this.timeOfExpiry = timeOfExpiry;
            this.__explicitlySet__.add("timeOfExpiry");
            return this;
        }
        /** The version number of the secret. */
        @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
        private Long versionNumber;

        /**
         * The version number of the secret.
         *
         * @param versionNumber the value to set
         * @return this builder
         */
        public Builder versionNumber(Long versionNumber) {
            this.versionNumber = versionNumber;
            this.__explicitlySet__.add("versionNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecretVersionSummary build() {
            SecretVersionSummary model =
                    new SecretVersionSummary(
                            this.contentType,
                            this.name,
                            this.secretId,
                            this.stages,
                            this.timeCreated,
                            this.timeOfDeletion,
                            this.timeOfExpiry,
                            this.versionNumber);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecretVersionSummary model) {
            if (model.wasPropertyExplicitlySet("contentType")) {
                this.contentType(model.getContentType());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("secretId")) {
                this.secretId(model.getSecretId());
            }
            if (model.wasPropertyExplicitlySet("stages")) {
                this.stages(model.getStages());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeOfDeletion")) {
                this.timeOfDeletion(model.getTimeOfDeletion());
            }
            if (model.wasPropertyExplicitlySet("timeOfExpiry")) {
                this.timeOfExpiry(model.getTimeOfExpiry());
            }
            if (model.wasPropertyExplicitlySet("versionNumber")) {
                this.versionNumber(model.getVersionNumber());
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

    /** The content type of the secret version's secret contents. */
    public enum ContentType implements com.oracle.bmc.http.internal.BmcEnum {
        Base64("BASE64"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ContentType.class);

        private final String value;
        private static java.util.Map<String, ContentType> map;

        static {
            map = new java.util.HashMap<>();
            for (ContentType v : ContentType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ContentType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ContentType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ContentType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The content type of the secret version's secret contents. */
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    private final ContentType contentType;

    /**
     * The content type of the secret version's secret contents.
     *
     * @return the value
     */
    public ContentType getContentType() {
        return contentType;
    }

    /** The name of the secret version. A name is unique across versions of a secret. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the secret version. A name is unique across versions of a secret.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The OCID of the secret. */
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    private final String secretId;

    /**
     * The OCID of the secret.
     *
     * @return the value
     */
    public String getSecretId() {
        return secretId;
    }

    /** */
    public enum Stages implements com.oracle.bmc.http.internal.BmcEnum {
        Current("CURRENT"),
        Pending("PENDING"),
        Latest("LATEST"),
        Previous("PREVIOUS"),
        Deprecated("DEPRECATED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Stages.class);

        private final String value;
        private static java.util.Map<String, Stages> map;

        static {
            map = new java.util.HashMap<>();
            for (Stages v : Stages.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Stages(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Stages create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Stages', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * A list of possible rotation states for the secret version. A secret version marked {@code
     * CURRENT} is currently in use. A secret version marked {@code PENDING} is staged and available
     * for use, but has not been applied on the target system and, therefore, has not been rotated
     * into current, active use. The secret most recently uploaded to a vault is always marked
     * {@code LATEST}. (The first version of a secret is always marked as both {@code CURRENT} and
     * {@code LATEST}.) A secret version marked {@code PREVIOUS} is the secret version that was most
     * recently marked {@code CURRENT}, before the last secret version rotation. A secret version
     * marked {@code DEPRECATED} is neither current, pending, nor the previous one in use. Only
     * secret versions marked {@code DEPRECATED} can be scheduled for deletion.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stages")
    private final java.util.List<Stages> stages;

    /**
     * A list of possible rotation states for the secret version. A secret version marked {@code
     * CURRENT} is currently in use. A secret version marked {@code PENDING} is staged and available
     * for use, but has not been applied on the target system and, therefore, has not been rotated
     * into current, active use. The secret most recently uploaded to a vault is always marked
     * {@code LATEST}. (The first version of a secret is always marked as both {@code CURRENT} and
     * {@code LATEST}.) A secret version marked {@code PREVIOUS} is the secret version that was most
     * recently marked {@code CURRENT}, before the last secret version rotation. A secret version
     * marked {@code DEPRECATED} is neither current, pending, nor the previous one in use. Only
     * secret versions marked {@code DEPRECATED} can be scheduled for deletion.
     *
     * @return the value
     */
    public java.util.List<Stages> getStages() {
        return stages;
    }

    /**
     * A optional property indicating when the secret version was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * A optional property indicating when the secret version was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * An optional property indicating when to delete the secret version, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    private final java.util.Date timeOfDeletion;

    /**
     * An optional property indicating when to delete the secret version, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeOfDeletion() {
        return timeOfDeletion;
    }

    /**
     * An optional property indicating when the secret version will expire, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfExpiry")
    private final java.util.Date timeOfExpiry;

    /**
     * An optional property indicating when the secret version will expire, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeOfExpiry() {
        return timeOfExpiry;
    }

    /** The version number of the secret. */
    @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
    private final Long versionNumber;

    /**
     * The version number of the secret.
     *
     * @return the value
     */
    public Long getVersionNumber() {
        return versionNumber;
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
        sb.append("SecretVersionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("contentType=").append(String.valueOf(this.contentType));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", secretId=").append(String.valueOf(this.secretId));
        sb.append(", stages=").append(String.valueOf(this.stages));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeOfDeletion=").append(String.valueOf(this.timeOfDeletion));
        sb.append(", timeOfExpiry=").append(String.valueOf(this.timeOfExpiry));
        sb.append(", versionNumber=").append(String.valueOf(this.versionNumber));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecretVersionSummary)) {
            return false;
        }

        SecretVersionSummary other = (SecretVersionSummary) o;
        return java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.secretId, other.secretId)
                && java.util.Objects.equals(this.stages, other.stages)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeOfDeletion, other.timeOfDeletion)
                && java.util.Objects.equals(this.timeOfExpiry, other.timeOfExpiry)
                && java.util.Objects.equals(this.versionNumber, other.versionNumber)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result = (result * PRIME) + (this.stages == null ? 43 : this.stages.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfDeletion == null ? 43 : this.timeOfDeletion.hashCode());
        result = (result * PRIME) + (this.timeOfExpiry == null ? 43 : this.timeOfExpiry.hashCode());
        result =
                (result * PRIME)
                        + (this.versionNumber == null ? 43 : this.versionNumber.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
