// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Restriction model. */
@Fluent
public final class Restriction {
    /*
     * The type of restrictions. As of now only possible value for this is
     * location.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The value of restrictions. If the restriction type is set to location.
     * This would be different locations where the SKU is restricted.
     */
    @JsonProperty(value = "values", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> values;

    /*
     * The reason for the restriction. As of now this can be "QuotaId" or
     * "NotAvailableForSubscription". Quota Id is set when the SKU has
     * requiredQuotas parameter as the subscription does not belong to that
     * quota. The "NotAvailableForSubscription" is related to capacity at DC.
     */
    @JsonProperty(value = "reasonCode")
    private ReasonCode reasonCode;

    /**
     * Get the type property: The type of restrictions. As of now only possible value for this is location.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the values property: The value of restrictions. If the restriction type is set to location. This would be
     * different locations where the SKU is restricted.
     *
     * @return the values value.
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Get the reasonCode property: The reason for the restriction. As of now this can be "QuotaId" or
     * "NotAvailableForSubscription". Quota Id is set when the SKU has requiredQuotas parameter as the subscription does
     * not belong to that quota. The "NotAvailableForSubscription" is related to capacity at DC.
     *
     * @return the reasonCode value.
     */
    public ReasonCode reasonCode() {
        return this.reasonCode;
    }

    /**
     * Set the reasonCode property: The reason for the restriction. As of now this can be "QuotaId" or
     * "NotAvailableForSubscription". Quota Id is set when the SKU has requiredQuotas parameter as the subscription does
     * not belong to that quota. The "NotAvailableForSubscription" is related to capacity at DC.
     *
     * @param reasonCode the reasonCode value to set.
     * @return the Restriction object itself.
     */
    public Restriction withReasonCode(ReasonCode reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
}
