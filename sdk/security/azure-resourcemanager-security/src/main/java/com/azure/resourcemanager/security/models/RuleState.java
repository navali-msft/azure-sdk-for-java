// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for RuleState. */
public enum RuleState {
    /** Enum value Enabled. */
    ENABLED("Enabled"),

    /** Enum value Disabled. */
    DISABLED("Disabled"),

    /** Enum value Expired. */
    EXPIRED("Expired");

    /** The actual serialized value for a RuleState instance. */
    private final String value;

    RuleState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RuleState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RuleState object, or null if unable to parse.
     */
    @JsonCreator
    public static RuleState fromString(String value) {
        RuleState[] items = RuleState.values();
        for (RuleState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
