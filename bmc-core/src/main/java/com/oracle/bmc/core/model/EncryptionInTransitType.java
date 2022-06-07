/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The attachment type of a BM volume.
 * If the attachment is in-transit encryption, the field is BM_ENCRYPTION_IN_TRANSIT.
 * Otherwise, the field is None.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public enum EncryptionInTransitType {
    None("NONE"),
    BmEncryptionInTransit("BM_ENCRYPTION_IN_TRANSIT"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(EncryptionInTransitType.class);

    private final String value;
    private static java.util.Map<String, EncryptionInTransitType> map;

    static {
        map = new java.util.HashMap<>();
        for (EncryptionInTransitType v : EncryptionInTransitType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    EncryptionInTransitType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static EncryptionInTransitType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'EncryptionInTransitType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
