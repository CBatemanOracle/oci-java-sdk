/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DecryptedData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DecryptedData extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "plaintext",
        "plaintextChecksum",
        "keyId",
        "keyVersionId",
        "encryptionAlgorithm"
    })
    public DecryptedData(
            String plaintext,
            String plaintextChecksum,
            String keyId,
            String keyVersionId,
            EncryptionAlgorithm encryptionAlgorithm) {
        super();
        this.plaintext = plaintext;
        this.plaintextChecksum = plaintextChecksum;
        this.keyId = keyId;
        this.keyVersionId = keyVersionId;
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The decrypted data, expressed as a base64-encoded value. */
        @com.fasterxml.jackson.annotation.JsonProperty("plaintext")
        private String plaintext;

        /**
         * The decrypted data, expressed as a base64-encoded value.
         *
         * @param plaintext the value to set
         * @return this builder
         */
        public Builder plaintext(String plaintext) {
            this.plaintext = plaintext;
            this.__explicitlySet__.add("plaintext");
            return this;
        }
        /** The checksum of the decrypted data. */
        @com.fasterxml.jackson.annotation.JsonProperty("plaintextChecksum")
        private String plaintextChecksum;

        /**
         * The checksum of the decrypted data.
         *
         * @param plaintextChecksum the value to set
         * @return this builder
         */
        public Builder plaintextChecksum(String plaintextChecksum) {
            this.plaintextChecksum = plaintextChecksum;
            this.__explicitlySet__.add("plaintextChecksum");
            return this;
        }
        /** The OCID of the key used to encrypt the ciphertext. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * The OCID of the key used to encrypt the ciphertext.
         *
         * @param keyId the value to set
         * @return this builder
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }
        /** The OCID of the key version used to encrypt the ciphertext. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyVersionId")
        private String keyVersionId;

        /**
         * The OCID of the key version used to encrypt the ciphertext.
         *
         * @param keyVersionId the value to set
         * @return this builder
         */
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            this.__explicitlySet__.add("keyVersionId");
            return this;
        }
        /**
         * The encryption algorithm to use to encrypt and decrypt data with a customer-managed key
         * {@code AES_256_GCM} indicates that the key is a symmetric key that uses the Advanced
         * Encryption Standard (AES) algorithm and that the mode of encryption is the Galois/Counter
         * Mode (GCM). {@code RSA_OAEP_SHA_1} indicates that the key is an asymmetric key that uses
         * the RSA encryption algorithm and uses Optimal Asymmetric Encryption Padding (OAEP).
         * {@code RSA_OAEP_SHA_256} indicates that the key is an asymmetric key that uses the RSA
         * encryption algorithm with a SHA-256 hash and uses OAEP.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithm")
        private EncryptionAlgorithm encryptionAlgorithm;

        /**
         * The encryption algorithm to use to encrypt and decrypt data with a customer-managed key
         * {@code AES_256_GCM} indicates that the key is a symmetric key that uses the Advanced
         * Encryption Standard (AES) algorithm and that the mode of encryption is the Galois/Counter
         * Mode (GCM). {@code RSA_OAEP_SHA_1} indicates that the key is an asymmetric key that uses
         * the RSA encryption algorithm and uses Optimal Asymmetric Encryption Padding (OAEP).
         * {@code RSA_OAEP_SHA_256} indicates that the key is an asymmetric key that uses the RSA
         * encryption algorithm with a SHA-256 hash and uses OAEP.
         *
         * @param encryptionAlgorithm the value to set
         * @return this builder
         */
        public Builder encryptionAlgorithm(EncryptionAlgorithm encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
            this.__explicitlySet__.add("encryptionAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DecryptedData build() {
            DecryptedData model =
                    new DecryptedData(
                            this.plaintext,
                            this.plaintextChecksum,
                            this.keyId,
                            this.keyVersionId,
                            this.encryptionAlgorithm);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DecryptedData model) {
            if (model.wasPropertyExplicitlySet("plaintext")) {
                this.plaintext(model.getPlaintext());
            }
            if (model.wasPropertyExplicitlySet("plaintextChecksum")) {
                this.plaintextChecksum(model.getPlaintextChecksum());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("keyVersionId")) {
                this.keyVersionId(model.getKeyVersionId());
            }
            if (model.wasPropertyExplicitlySet("encryptionAlgorithm")) {
                this.encryptionAlgorithm(model.getEncryptionAlgorithm());
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

    /** The decrypted data, expressed as a base64-encoded value. */
    @com.fasterxml.jackson.annotation.JsonProperty("plaintext")
    private final String plaintext;

    /**
     * The decrypted data, expressed as a base64-encoded value.
     *
     * @return the value
     */
    public String getPlaintext() {
        return plaintext;
    }

    /** The checksum of the decrypted data. */
    @com.fasterxml.jackson.annotation.JsonProperty("plaintextChecksum")
    private final String plaintextChecksum;

    /**
     * The checksum of the decrypted data.
     *
     * @return the value
     */
    public String getPlaintextChecksum() {
        return plaintextChecksum;
    }

    /** The OCID of the key used to encrypt the ciphertext. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * The OCID of the key used to encrypt the ciphertext.
     *
     * @return the value
     */
    public String getKeyId() {
        return keyId;
    }

    /** The OCID of the key version used to encrypt the ciphertext. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyVersionId")
    private final String keyVersionId;

    /**
     * The OCID of the key version used to encrypt the ciphertext.
     *
     * @return the value
     */
    public String getKeyVersionId() {
        return keyVersionId;
    }

    /**
     * The encryption algorithm to use to encrypt and decrypt data with a customer-managed key
     * {@code AES_256_GCM} indicates that the key is a symmetric key that uses the Advanced
     * Encryption Standard (AES) algorithm and that the mode of encryption is the Galois/Counter
     * Mode (GCM). {@code RSA_OAEP_SHA_1} indicates that the key is an asymmetric key that uses the
     * RSA encryption algorithm and uses Optimal Asymmetric Encryption Padding (OAEP). {@code
     * RSA_OAEP_SHA_256} indicates that the key is an asymmetric key that uses the RSA encryption
     * algorithm with a SHA-256 hash and uses OAEP.
     */
    public enum EncryptionAlgorithm implements com.oracle.bmc.http.internal.BmcEnum {
        Aes256Gcm("AES_256_GCM"),
        RsaOaepSha1("RSA_OAEP_SHA_1"),
        RsaOaepSha256("RSA_OAEP_SHA_256"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EncryptionAlgorithm.class);

        private final String value;
        private static java.util.Map<String, EncryptionAlgorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (EncryptionAlgorithm v : EncryptionAlgorithm.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EncryptionAlgorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EncryptionAlgorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EncryptionAlgorithm', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The encryption algorithm to use to encrypt and decrypt data with a customer-managed key
     * {@code AES_256_GCM} indicates that the key is a symmetric key that uses the Advanced
     * Encryption Standard (AES) algorithm and that the mode of encryption is the Galois/Counter
     * Mode (GCM). {@code RSA_OAEP_SHA_1} indicates that the key is an asymmetric key that uses the
     * RSA encryption algorithm and uses Optimal Asymmetric Encryption Padding (OAEP). {@code
     * RSA_OAEP_SHA_256} indicates that the key is an asymmetric key that uses the RSA encryption
     * algorithm with a SHA-256 hash and uses OAEP.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithm")
    private final EncryptionAlgorithm encryptionAlgorithm;

    /**
     * The encryption algorithm to use to encrypt and decrypt data with a customer-managed key
     * {@code AES_256_GCM} indicates that the key is a symmetric key that uses the Advanced
     * Encryption Standard (AES) algorithm and that the mode of encryption is the Galois/Counter
     * Mode (GCM). {@code RSA_OAEP_SHA_1} indicates that the key is an asymmetric key that uses the
     * RSA encryption algorithm and uses Optimal Asymmetric Encryption Padding (OAEP). {@code
     * RSA_OAEP_SHA_256} indicates that the key is an asymmetric key that uses the RSA encryption
     * algorithm with a SHA-256 hash and uses OAEP.
     *
     * @return the value
     */
    public EncryptionAlgorithm getEncryptionAlgorithm() {
        return encryptionAlgorithm;
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
        sb.append("DecryptedData(");
        sb.append("super=").append(super.toString());
        sb.append("plaintext=").append(String.valueOf(this.plaintext));
        sb.append(", plaintextChecksum=").append(String.valueOf(this.plaintextChecksum));
        sb.append(", keyId=").append(String.valueOf(this.keyId));
        sb.append(", keyVersionId=").append(String.valueOf(this.keyVersionId));
        sb.append(", encryptionAlgorithm=").append(String.valueOf(this.encryptionAlgorithm));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DecryptedData)) {
            return false;
        }

        DecryptedData other = (DecryptedData) o;
        return java.util.Objects.equals(this.plaintext, other.plaintext)
                && java.util.Objects.equals(this.plaintextChecksum, other.plaintextChecksum)
                && java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.keyVersionId, other.keyVersionId)
                && java.util.Objects.equals(this.encryptionAlgorithm, other.encryptionAlgorithm)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.plaintext == null ? 43 : this.plaintext.hashCode());
        result =
                (result * PRIME)
                        + (this.plaintextChecksum == null ? 43 : this.plaintextChecksum.hashCode());
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result = (result * PRIME) + (this.keyVersionId == null ? 43 : this.keyVersionId.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionAlgorithm == null
                                ? 43
                                : this.encryptionAlgorithm.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
