/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.model;

/**
 * Upload container image signature request details.
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
    builder = CreateContainerImageSignatureDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateContainerImageSignatureDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "imageId",
        "kmsKeyId",
        "kmsKeyVersionId",
        "message",
        "signature",
        "signingAlgorithm"
    })
    public CreateContainerImageSignatureDetails(
            String compartmentId,
            String imageId,
            String kmsKeyId,
            String kmsKeyVersionId,
            String message,
            String signature,
            SigningAlgorithm signingAlgorithm) {
        super();
        this.compartmentId = compartmentId;
        this.imageId = imageId;
        this.kmsKeyId = kmsKeyId;
        this.kmsKeyVersionId = kmsKeyVersionId;
        this.message = message;
        this.signature = signature;
        this.signingAlgorithm = signingAlgorithm;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
        private String kmsKeyVersionId;

        public Builder kmsKeyVersionId(String kmsKeyVersionId) {
            this.kmsKeyVersionId = kmsKeyVersionId;
            this.__explicitlySet__.add("kmsKeyVersionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("signature")
        private String signature;

        public Builder signature(String signature) {
            this.signature = signature;
            this.__explicitlySet__.add("signature");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("signingAlgorithm")
        private SigningAlgorithm signingAlgorithm;

        public Builder signingAlgorithm(SigningAlgorithm signingAlgorithm) {
            this.signingAlgorithm = signingAlgorithm;
            this.__explicitlySet__.add("signingAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateContainerImageSignatureDetails build() {
            CreateContainerImageSignatureDetails __instance__ =
                    new CreateContainerImageSignatureDetails(
                            compartmentId,
                            imageId,
                            kmsKeyId,
                            kmsKeyVersionId,
                            message,
                            signature,
                            signingAlgorithm);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateContainerImageSignatureDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .imageId(o.getImageId())
                            .kmsKeyId(o.getKmsKeyId())
                            .kmsKeyVersionId(o.getKmsKeyVersionId())
                            .message(o.getMessage())
                            .signature(o.getSignature())
                            .signingAlgorithm(o.getSigningAlgorithm());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in which the container repository exists.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the container image.
     * <p>
     * Example: {@code ocid1.containerimage.oc1..exampleuniqueID}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    private final String imageId;

    public String getImageId() {
        return imageId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the kmsKeyId used to sign the container image.
     * <p>
     * Example: {@code ocid1.key.oc1..exampleuniqueID}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the kmsKeyVersionId used to sign the container image.
     * <p>
     * Example: {@code ocid1.keyversion.oc1..exampleuniqueID}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
    private final String kmsKeyVersionId;

    public String getKmsKeyVersionId() {
        return kmsKeyVersionId;
    }

    /**
     * The base64 encoded signature payload that was signed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    public String getMessage() {
        return message;
    }

    /**
     * The signature of the message field using the kmsKeyId, the kmsKeyVersionId, and the signingAlgorithm.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signature")
    private final String signature;

    public String getSignature() {
        return signature;
    }

    /**
     * The algorithm to be used for signing. These are the only supported signing algorithms for container images.
     **/
    public enum SigningAlgorithm {
        Sha224RsaPkcsPss("SHA_224_RSA_PKCS_PSS"),
        Sha256RsaPkcsPss("SHA_256_RSA_PKCS_PSS"),
        Sha384RsaPkcsPss("SHA_384_RSA_PKCS_PSS"),
        Sha512RsaPkcsPss("SHA_512_RSA_PKCS_PSS"),
        ;

        private final String value;
        private static java.util.Map<String, SigningAlgorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (SigningAlgorithm v : SigningAlgorithm.values()) {
                map.put(v.getValue(), v);
            }
        }

        SigningAlgorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SigningAlgorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SigningAlgorithm: " + key);
        }
    };
    /**
     * The algorithm to be used for signing. These are the only supported signing algorithms for container images.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signingAlgorithm")
    private final SigningAlgorithm signingAlgorithm;

    public SigningAlgorithm getSigningAlgorithm() {
        return signingAlgorithm;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateContainerImageSignatureDetails(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", imageId=").append(String.valueOf(this.imageId));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", kmsKeyVersionId=").append(String.valueOf(this.kmsKeyVersionId));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", signature=").append(String.valueOf(this.signature));
        sb.append(", signingAlgorithm=").append(String.valueOf(this.signingAlgorithm));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateContainerImageSignatureDetails)) {
            return false;
        }

        CreateContainerImageSignatureDetails other = (CreateContainerImageSignatureDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.kmsKeyVersionId, other.kmsKeyVersionId)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.signature, other.signature)
                && java.util.Objects.equals(this.signingAlgorithm, other.signingAlgorithm)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsKeyVersionId == null ? 43 : this.kmsKeyVersionId.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.signature == null ? 43 : this.signature.hashCode());
        result =
                (result * PRIME)
                        + (this.signingAlgorithm == null ? 43 : this.signingAlgorithm.hashCode());
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
