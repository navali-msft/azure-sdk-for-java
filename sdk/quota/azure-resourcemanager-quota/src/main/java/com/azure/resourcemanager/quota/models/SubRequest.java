// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request property. */
@Fluent
public final class SubRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubRequest.class);

    /*
     * Resource name.
     */
    @JsonProperty(value = "name")
    private ResourceName name;

    /*
     * Resource type for which the quota properties were requested.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /*
     * Quota limit units, such as Count and Bytes. When requesting quota, use
     * the **unit** value returned in the GET response in the request body of
     * your PUT operation.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * The quota request status.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private QuotaRequestState provisioningState;

    /*
     * User-friendly status message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * Quota request ID.
     */
    @JsonProperty(value = "subRequestId", access = JsonProperty.Access.WRITE_ONLY)
    private String subRequestId;

    /*
     * Resource quota limit properties.
     */
    @JsonProperty(value = "limit")
    private LimitJsonObject limit;

    /**
     * Get the name property: Resource name.
     *
     * @return the name value.
     */
    public ResourceName name() {
        return this.name;
    }

    /**
     * Set the name property: Resource name.
     *
     * @param name the name value to set.
     * @return the SubRequest object itself.
     */
    public SubRequest withName(ResourceName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the resourceType property: Resource type for which the quota properties were requested.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the unit property: Quota limit units, such as Count and Bytes. When requesting quota, use the **unit** value
     * returned in the GET response in the request body of your PUT operation.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: Quota limit units, such as Count and Bytes. When requesting quota, use the **unit** value
     * returned in the GET response in the request body of your PUT operation.
     *
     * @param unit the unit value to set.
     * @return the SubRequest object itself.
     */
    public SubRequest withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the provisioningState property: The quota request status.
     *
     * @return the provisioningState value.
     */
    public QuotaRequestState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the message property: User-friendly status message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the subRequestId property: Quota request ID.
     *
     * @return the subRequestId value.
     */
    public String subRequestId() {
        return this.subRequestId;
    }

    /**
     * Get the limit property: Resource quota limit properties.
     *
     * @return the limit value.
     */
    public LimitJsonObject limit() {
        return this.limit;
    }

    /**
     * Set the limit property: Resource quota limit properties.
     *
     * @param limit the limit value to set.
     * @return the SubRequest object itself.
     */
    public SubRequest withLimit(LimitJsonObject limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
        }
        if (limit() != null) {
            limit().validate();
        }
    }
}
