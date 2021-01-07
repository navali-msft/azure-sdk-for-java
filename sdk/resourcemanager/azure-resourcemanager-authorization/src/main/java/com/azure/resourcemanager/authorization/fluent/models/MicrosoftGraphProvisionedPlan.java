// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** provisionedPlan. */
@Fluent
public final class MicrosoftGraphProvisionedPlan {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphProvisionedPlan.class);

    /*
     * For example, 'Enabled'.
     */
    @JsonProperty(value = "capabilityStatus")
    private String capabilityStatus;

    /*
     * For example, 'Success'.
     */
    @JsonProperty(value = "provisioningStatus")
    private String provisioningStatus;

    /*
     * The name of the service; for example, 'AccessControlS2S'
     */
    @JsonProperty(value = "service")
    private String service;

    /*
     * provisionedPlan
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the capabilityStatus property: For example, 'Enabled'.
     *
     * @return the capabilityStatus value.
     */
    public String capabilityStatus() {
        return this.capabilityStatus;
    }

    /**
     * Set the capabilityStatus property: For example, 'Enabled'.
     *
     * @param capabilityStatus the capabilityStatus value to set.
     * @return the MicrosoftGraphProvisionedPlan object itself.
     */
    public MicrosoftGraphProvisionedPlan withCapabilityStatus(String capabilityStatus) {
        this.capabilityStatus = capabilityStatus;
        return this;
    }

    /**
     * Get the provisioningStatus property: For example, 'Success'.
     *
     * @return the provisioningStatus value.
     */
    public String provisioningStatus() {
        return this.provisioningStatus;
    }

    /**
     * Set the provisioningStatus property: For example, 'Success'.
     *
     * @param provisioningStatus the provisioningStatus value to set.
     * @return the MicrosoftGraphProvisionedPlan object itself.
     */
    public MicrosoftGraphProvisionedPlan withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    /**
     * Get the service property: The name of the service; for example, 'AccessControlS2S'.
     *
     * @return the service value.
     */
    public String service() {
        return this.service;
    }

    /**
     * Set the service property: The name of the service; for example, 'AccessControlS2S'.
     *
     * @param service the service value to set.
     * @return the MicrosoftGraphProvisionedPlan object itself.
     */
    public MicrosoftGraphProvisionedPlan withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Get the additionalProperties property: provisionedPlan.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: provisionedPlan.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphProvisionedPlan object itself.
     */
    public MicrosoftGraphProvisionedPlan withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}