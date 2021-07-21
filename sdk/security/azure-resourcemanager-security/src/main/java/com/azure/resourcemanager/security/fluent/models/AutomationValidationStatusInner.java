// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The security automation model state property bag. */
@Fluent
public final class AutomationValidationStatusInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutomationValidationStatusInner.class);

    /*
     * Indicates whether the model is valid or not.
     */
    @JsonProperty(value = "isValid")
    private Boolean isValid;

    /*
     * The validation message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the isValid property: Indicates whether the model is valid or not.
     *
     * @return the isValid value.
     */
    public Boolean isValid() {
        return this.isValid;
    }

    /**
     * Set the isValid property: Indicates whether the model is valid or not.
     *
     * @param isValid the isValid value to set.
     * @return the AutomationValidationStatusInner object itself.
     */
    public AutomationValidationStatusInner withIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    /**
     * Get the message property: The validation message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The validation message.
     *
     * @param message the message value to set.
     * @return the AutomationValidationStatusInner object itself.
     */
    public AutomationValidationStatusInner withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
